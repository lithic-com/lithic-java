// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.client.okhttp

import com.fasterxml.jackson.databind.json.JsonMapper
import com.lithic.api.client.LithicClient
import com.lithic.api.client.LithicClientImpl
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.Timeout
import com.lithic.api.core.http.AsyncStreamResponse
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.HttpClient
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.jsonMapper
import java.net.Proxy
import java.time.Clock
import java.time.Duration
import java.util.Optional
import java.util.concurrent.Executor
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLSocketFactory
import javax.net.ssl.X509TrustManager
import kotlin.jvm.optionals.getOrNull

/**
 * A class that allows building an instance of [LithicClient] with [OkHttpClient] as the underlying
 * [HttpClient].
 */
class LithicOkHttpClient private constructor() {

    companion object {

        /** Returns a mutable builder for constructing an instance of [LithicClient]. */
        @JvmStatic fun builder() = Builder()

        /**
         * Returns a client configured using system properties and environment variables.
         *
         * @see ClientOptions.Builder.fromEnv
         */
        @JvmStatic fun fromEnv(): LithicClient = builder().fromEnv().build()
    }

    /** A builder for [LithicOkHttpClient]. */
    class Builder internal constructor() {

        private var clientOptions: ClientOptions.Builder = ClientOptions.builder()
        private var proxy: Proxy? = null
        private var sslSocketFactory: SSLSocketFactory? = null
        private var trustManager: X509TrustManager? = null
        private var hostnameVerifier: HostnameVerifier? = null

        fun proxy(proxy: Proxy?) = apply { this.proxy = proxy }

        /** Alias for calling [Builder.proxy] with `proxy.orElse(null)`. */
        fun proxy(proxy: Optional<Proxy>) = proxy(proxy.getOrNull())

        /**
         * The socket factory used to secure HTTPS connections.
         *
         * If this is set, then [trustManager] must also be set.
         *
         * If unset, then the system default is used. Most applications should not call this method,
         * and instead use the system default. The default include special optimizations that can be
         * lost if the implementation is modified.
         */
        fun sslSocketFactory(sslSocketFactory: SSLSocketFactory?) = apply {
            this.sslSocketFactory = sslSocketFactory
        }

        /** Alias for calling [Builder.sslSocketFactory] with `sslSocketFactory.orElse(null)`. */
        fun sslSocketFactory(sslSocketFactory: Optional<SSLSocketFactory>) =
            sslSocketFactory(sslSocketFactory.getOrNull())

        /**
         * The trust manager used to secure HTTPS connections.
         *
         * If this is set, then [sslSocketFactory] must also be set.
         *
         * If unset, then the system default is used. Most applications should not call this method,
         * and instead use the system default. The default include special optimizations that can be
         * lost if the implementation is modified.
         */
        fun trustManager(trustManager: X509TrustManager?) = apply {
            this.trustManager = trustManager
        }

        /** Alias for calling [Builder.trustManager] with `trustManager.orElse(null)`. */
        fun trustManager(trustManager: Optional<X509TrustManager>) =
            trustManager(trustManager.getOrNull())

        /**
         * The verifier used to confirm that response certificates apply to requested hostnames for
         * HTTPS connections.
         *
         * If unset, then a default hostname verifier is used.
         */
        fun hostnameVerifier(hostnameVerifier: HostnameVerifier?) = apply {
            this.hostnameVerifier = hostnameVerifier
        }

        /** Alias for calling [Builder.hostnameVerifier] with `hostnameVerifier.orElse(null)`. */
        fun hostnameVerifier(hostnameVerifier: Optional<HostnameVerifier>) =
            hostnameVerifier(hostnameVerifier.getOrNull())

        /**
         * Whether to throw an exception if any of the Jackson versions detected at runtime are
         * incompatible with the SDK's minimum supported Jackson version (2.13.4).
         *
         * Defaults to true. Use extreme caution when disabling this option. There is no guarantee
         * that the SDK will work correctly when using an incompatible Jackson version.
         */
        fun checkJacksonVersionCompatibility(checkJacksonVersionCompatibility: Boolean) = apply {
            clientOptions.checkJacksonVersionCompatibility(checkJacksonVersionCompatibility)
        }

        /**
         * The Jackson JSON mapper to use for serializing and deserializing JSON.
         *
         * Defaults to [com.lithic.api.core.jsonMapper]. The default is usually sufficient and
         * rarely needs to be overridden.
         */
        fun jsonMapper(jsonMapper: JsonMapper) = apply { clientOptions.jsonMapper(jsonMapper) }

        /**
         * The executor to use for running [AsyncStreamResponse.Handler] callbacks.
         *
         * Defaults to a dedicated cached thread pool.
         *
         * This class takes ownership of the executor and shuts it down, if possible, when closed.
         */
        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            clientOptions.streamHandlerExecutor(streamHandlerExecutor)
        }

        /**
         * The clock to use for operations that require timing, like retries.
         *
         * This is primarily useful for using a fake clock in tests.
         *
         * Defaults to [Clock.systemUTC].
         */
        fun clock(clock: Clock) = apply { clientOptions.clock(clock) }

        /**
         * The base URL to use for every request.
         *
         * Defaults to the production environment: `https://api.lithic.com`.
         *
         * The following other environments, with dedicated builder methods, are available:
         * - sandbox: `https://sandbox.lithic.com`
         */
        fun baseUrl(baseUrl: String?) = apply { clientOptions.baseUrl(baseUrl) }

        /** Alias for calling [Builder.baseUrl] with `baseUrl.orElse(null)`. */
        fun baseUrl(baseUrl: Optional<String>) = baseUrl(baseUrl.getOrNull())

        /** Sets [baseUrl] to `https://sandbox.lithic.com`. */
        fun sandbox() = apply { clientOptions.sandbox() }

        /**
         * Whether to call `validate` on every response before returning it.
         *
         * Defaults to false, which means the shape of the response will not be validated upfront.
         * Instead, validation will only occur for the parts of the response that are accessed.
         */
        fun responseValidation(responseValidation: Boolean) = apply {
            clientOptions.responseValidation(responseValidation)
        }

        /**
         * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
         * retries.
         *
         * Defaults to [Timeout.default].
         */
        fun timeout(timeout: Timeout) = apply { clientOptions.timeout(timeout) }

        /**
         * Sets the maximum time allowed for a complete HTTP call, not including retries.
         *
         * See [Timeout.request] for more details.
         *
         * For fine-grained control, pass a [Timeout] object.
         */
        fun timeout(timeout: Duration) = apply { clientOptions.timeout(timeout) }

        /**
         * The maximum number of times to retry failed requests, with a short exponential backoff
         * between requests.
         *
         * Only the following error types are retried:
         * - Connection errors (for example, due to a network connectivity problem)
         * - 408 Request Timeout
         * - 409 Conflict
         * - 429 Rate Limit
         * - 5xx Internal
         *
         * The API may also explicitly instruct the SDK to retry or not retry a request.
         *
         * Defaults to 2.
         */
        fun maxRetries(maxRetries: Int) = apply { clientOptions.maxRetries(maxRetries) }

        fun apiKey(apiKey: String) = apply { clientOptions.apiKey(apiKey) }

        fun webhookSecret(webhookSecret: String?) = apply {
            clientOptions.webhookSecret(webhookSecret)
        }

        /** Alias for calling [Builder.webhookSecret] with `webhookSecret.orElse(null)`. */
        fun webhookSecret(webhookSecret: Optional<String>) =
            webhookSecret(webhookSecret.getOrNull())

        fun headers(headers: Headers) = apply { clientOptions.headers(headers) }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.headers(headers)
        }

        fun putHeader(name: String, value: String) = apply { clientOptions.putHeader(name, value) }

        fun putheaders(name: String, values: Iterable<String>) = apply {
            clientOptions.putheaders(name, values)
        }

        fun putAllheaders(headers: Headers) = apply { clientOptions.putAllheaders(headers) }

        fun putAllheaders(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.putAllheaders(headers)
        }

        fun replaceheaders(name: String, value: String) = apply {
            clientOptions.replaceheaders(name, value)
        }

        fun replaceheaders(name: String, values: Iterable<String>) = apply {
            clientOptions.replaceheaders(name, values)
        }

        fun replaceAllheaders(headers: Headers) = apply { clientOptions.replaceAllheaders(headers) }

        fun replaceAllheaders(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.replaceAllheaders(headers)
        }

        fun removeheaders(name: String) = apply { clientOptions.removeheaders(name) }

        fun removeAllheaders(names: Set<String>) = apply { clientOptions.removeAllheaders(names) }

        fun queryParams(queryParams: QueryParams) = apply { clientOptions.queryParams(queryParams) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.queryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply {
            clientOptions.putQueryParam(key, value)
        }

        fun putquery_params(key: String, values: Iterable<String>) = apply {
            clientOptions.putquery_params(key, values)
        }

        fun putAllquery_params(queryParams: QueryParams) = apply {
            clientOptions.putAllquery_params(queryParams)
        }

        fun putAllquery_params(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.putAllquery_params(queryParams)
        }

        fun replacequery_params(key: String, value: String) = apply {
            clientOptions.replacequery_params(key, value)
        }

        fun replacequery_params(key: String, values: Iterable<String>) = apply {
            clientOptions.replacequery_params(key, values)
        }

        fun replaceAllquery_params(queryParams: QueryParams) = apply {
            clientOptions.replaceAllquery_params(queryParams)
        }

        fun replaceAllquery_params(queryParams: Map<String, Iterable<String>>) = apply {
            clientOptions.replaceAllquery_params(queryParams)
        }

        fun removequery_params(key: String) = apply { clientOptions.removequery_params(key) }

        fun removeAllquery_params(keys: Set<String>) = apply {
            clientOptions.removeAllquery_params(keys)
        }

        /**
         * Updates configuration using system properties and environment variables.
         *
         * @see ClientOptions.Builder.fromEnv
         */
        fun fromEnv() = apply { clientOptions.fromEnv() }

        /**
         * Returns an immutable instance of [LithicClient].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         */
        fun build(): LithicClient =
            LithicClientImpl(
                clientOptions
                    .httpClient(
                        OkHttpClient.builder()
                            .timeout(clientOptions.timeout())
                            .proxy(proxy)
                            .sslSocketFactory(sslSocketFactory)
                            .trustManager(trustManager)
                            .hostnameVerifier(hostnameVerifier)
                            .build()
                    )
                    .build()
            )
    }
}
