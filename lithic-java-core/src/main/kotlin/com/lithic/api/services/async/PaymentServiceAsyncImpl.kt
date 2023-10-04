// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentListPageAsync
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReleaseResponse
import com.lithic.api.models.PaymentSimulateReturnParams
import com.lithic.api.models.PaymentSimulateReturnResponse
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class PaymentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : PaymentServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<PaymentCreateResponse> =
        jsonHandler<PaymentCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Initiates a payment between a financial account and an external bank account. */
    override fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PaymentCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("payments")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Payment> =
        jsonHandler<Payment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the payment by token. */
    override fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Payment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("payments", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<PaymentListPageAsync.Response> =
        jsonHandler<PaymentListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all the payments for the provided search criteria. */
    override fun list(
        params: PaymentListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PaymentListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("payments")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { PaymentListPageAsync.of(this, params, it) }
        }
    }

    private val simulateReleaseHandler: Handler<PaymentSimulateReleaseResponse> =
        jsonHandler<PaymentSimulateReleaseResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Simulates a release of a Payment. */
    override fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PaymentSimulateReleaseResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "payments", "release")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { simulateReleaseHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val simulateReturnHandler: Handler<PaymentSimulateReturnResponse> =
        jsonHandler<PaymentSimulateReturnResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Simulates a return of a Payment. */
    override fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PaymentSimulateReturnResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "payments", "return")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { simulateReturnHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
