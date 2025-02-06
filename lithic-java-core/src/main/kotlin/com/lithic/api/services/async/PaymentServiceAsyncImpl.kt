// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentListPageAsync
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentRetryParams
import com.lithic.api.models.PaymentRetryResponse
import com.lithic.api.models.PaymentSimulateActionParams
import com.lithic.api.models.PaymentSimulateActionResponse
import com.lithic.api.models.PaymentSimulateReceiptParams
import com.lithic.api.models.PaymentSimulateReceiptResponse
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReleaseResponse
import com.lithic.api.models.PaymentSimulateReturnParams
import com.lithic.api.models.PaymentSimulateReturnResponse
import java.util.concurrent.CompletableFuture

class PaymentServiceAsyncImpl
internal constructor(
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
                .addPathSegments("v1", "payments")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
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
                .addPathSegments("v1", "payments", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
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
                .addPathSegments("v1", "payments")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { PaymentListPageAsync.of(this, params, it) }
            }
    }

    private val retryHandler: Handler<PaymentRetryResponse> =
        jsonHandler<PaymentRetryResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retry an origination which has been returned. */
    override fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PaymentRetryResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "payments", params.getPathParam(0), "retry")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val simulateActionHandler: Handler<PaymentSimulateActionResponse> =
        jsonHandler<PaymentSimulateActionResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Simulate payment lifecycle event */
    override fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PaymentSimulateActionResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "payments", params.getPathParam(0), "action")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { simulateActionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val simulateReceiptHandler: Handler<PaymentSimulateReceiptResponse> =
        jsonHandler<PaymentSimulateReceiptResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Simulates a receipt of a Payment. */
    override fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions
    ): CompletableFuture<PaymentSimulateReceiptResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "payments", "receipt")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { simulateReceiptHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
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
                .addPathSegments("v1", "simulate", "payments", "release")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { simulateReleaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
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
                .addPathSegments("v1", "simulate", "payments", "return")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { simulateReturnHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
