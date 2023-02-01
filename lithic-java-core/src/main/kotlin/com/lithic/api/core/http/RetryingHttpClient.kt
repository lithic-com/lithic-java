@file:JvmSynthetic

package com.lithic.api.core.http

import com.google.common.util.concurrent.MoreExecutors
import com.lithic.api.core.http.HttpMethod.CONNECT
import com.lithic.api.core.http.HttpMethod.DELETE
import com.lithic.api.core.http.HttpMethod.GET
import com.lithic.api.core.http.HttpMethod.HEAD
import com.lithic.api.core.http.HttpMethod.OPTIONS
import com.lithic.api.core.http.HttpMethod.PATCH
import com.lithic.api.core.http.HttpMethod.POST
import com.lithic.api.core.http.HttpMethod.PUT
import com.lithic.api.core.http.HttpMethod.TRACE
import com.lithic.api.errors.LithicIoException
import java.io.IOException
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import java.time.format.DateTimeParseException
import java.time.temporal.ChronoUnit
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ThreadLocalRandom
import java.util.concurrent.TimeUnit
import java.util.function.Function
import java.util.UUID
import kotlin.math.min
import kotlin.math.pow

class RetryingHttpClient private constructor(
    private val delegate: HttpClient,
    private val maxRetries: Int,
    private val idempotencyHeader: String?,
) : HttpClient {

    override fun execute(
        request: HttpRequest,
    ): HttpResponse {
        if (!isRetryable(request) || maxRetries <= 0) {
            return delegate.execute(request)
        }

        maybeAddIdempotencyHeader(request)

        var retries = 0

        while (true) {
            val response = try {
                val response = delegate.execute(request)
                if (++retries > maxRetries || !shouldRetry(response)) {
                    return response
                }

                response
            } catch (t: Throwable) {
                if (++retries > maxRetries || !shouldRetry(t)) {
                    throw t
                }

                null
            }

            val backoffMillis = getRetryBackoffMillis(retries, response)
            Thread.sleep(backoffMillis)
        }
    }

    override fun executeAsync(
        request: HttpRequest,
    ): CompletableFuture<HttpResponse> {
        if (!isRetryable(request) || maxRetries <= 0) {
            return delegate.executeAsync(request)
        }

        maybeAddIdempotencyHeader(request)

        var retries = 0

        fun wrap(future: CompletableFuture<HttpResponse>): CompletableFuture<HttpResponse> {
            return future.handleAsync(
                fun(response: HttpResponse?, throwable: Throwable?): CompletableFuture<HttpResponse> {
                    if (response != null) {
                        if (++retries > maxRetries || !shouldRetry(response)) {
                            return CompletableFuture.completedFuture(response)
                        }
                    } else {
                        if (++retries > maxRetries || !shouldRetry(throwable!!)) {
                            val failedFuture = CompletableFuture<HttpResponse>()
                            failedFuture.completeExceptionally(throwable)
                            return failedFuture
                        }
                    }

                    val backoffMillis = getRetryBackoffMillis(retries, response)
                    return sleepAsync(backoffMillis).thenCompose {
                        wrap(delegate.executeAsync(request))
                    }
                }, MoreExecutors.directExecutor()
            ).thenCompose(Function.identity())
        }

        return wrap(delegate.executeAsync(request))
    }

    override fun close() {
        delegate.close()
    }

    private fun isRetryable(request: HttpRequest): Boolean {
        // Some requests, such as when a request body is being streamed, cannot be retried because the body data aren't
        // available on subsequent attempts.
        return request.body?.repeatable() ?: true
    }

    private fun idempotencyKey(): String = "stainless-java-retry-${UUID.randomUUID()}"

    private fun maybeAddIdempotencyHeader(request: HttpRequest) {
        if (idempotencyHeader != null && !request.headers.containsKey(idempotencyHeader)) {
            // Set a header to uniquely identify the request when retried
            request.headers.put(idempotencyHeader, idempotencyKey())
        }
    }

    private fun shouldRetry(response: HttpResponse): Boolean {
        // Note: this is not a standard header
        val shouldRetryHeader = response.headers().get("x-should-retry").getOrNull(0)
        val statusCode = response.statusCode()

        return when {
            // If the server explicitly says whether to retry, obey
            shouldRetryHeader == "true" -> true
            shouldRetryHeader == "false" -> false

            // Retry on lock timeouts
            statusCode == 409 -> true
            // Retry on rate limits
            statusCode == 429 -> true
            // Retry internal errors
            statusCode >= 500 -> true

            else -> false
        }
    }

    private fun shouldRetry(throwable: Throwable): Boolean {
        // Only retry IOException and LithicIoException, other exceptions are not intended to be retried
        return throwable is IOException || throwable is LithicIoException
    }

    private fun getRetryBackoffMillis(retries: Int, response: HttpResponse?): Long {
        // About the Retry-After header: https://developer.mozilla.org/en-US/docs/Web/HTTP/Headers/Retry-After
        val retryAfter: Long = when (val header = response?.headers()?.get("retry-after")?.getOrNull(0)) {
            null -> -1L
            else ->
                // When given as delay-seconds
                // - parse as Double in case the value has a floating point
                // - then convert to Long, the loss of precision is acceptable, Retry-After is expected to be used with
                //   integers
                header.toDoubleOrNull()?.toLong()

                // When given as http-date
                ?: try {
                        ChronoUnit.SECONDS.between(
                            ZonedDateTime.now(),
                            ZonedDateTime.from(DateTimeFormatter.RFC_1123_DATE_TIME.parse(header))
                        )
                    } catch (e: DateTimeParseException) {
                        -1L
                    }
        }

        // If the API asks us to wait a certain amount of time (and it's a reasonable amount), just do what it says.
        if (retryAfter in 1..60) {
            return TimeUnit.SECONDS.toMillis(retryAfter)
        }

        // Apply exponential backoff, but not more than the max.
        val backoffSeconds = min(INITIAL_RETRY_DELAY * 2.0.pow(retries - 1), MAX_RETRY_DELAY)

        // Apply some jitter
        val jitter = ThreadLocalRandom.current().nextDouble()

        return (TimeUnit.SECONDS.toMillis(1) * backoffSeconds + jitter).toLong()
    }

    private fun sleepAsync(millis: Long): CompletableFuture<Void> {
        return CompletableFuture.runAsync { Thread.sleep(millis) }
    }

    companion object {

        private const val INITIAL_RETRY_DELAY: Double = 0.5
        private const val MAX_RETRY_DELAY: Double = 2.0

        @JvmStatic
        fun builder() = Builder()
    }

    class Builder {

        private var delegate: HttpClient? = null
        private var maxRetries: Int = 2
        private var idempotencyHeader: String? = null

        fun delegate(delegate: HttpClient) = apply { this.delegate = delegate }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun idempotencyHeader(header: String) = apply { this.idempotencyHeader = header }

        fun build(): HttpClient = RetryingHttpClient(
            checkNotNull(delegate) { "HTTP client is required but was not set" },
            maxRetries,
            idempotencyHeader,
        )
    }
}
