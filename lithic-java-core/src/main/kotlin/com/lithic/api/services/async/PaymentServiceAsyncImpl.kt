// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.payments.Payment
import com.lithic.api.models.payments.PaymentCreateParams
import com.lithic.api.models.payments.PaymentCreateResponse
import com.lithic.api.models.payments.PaymentListPageAsync
import com.lithic.api.models.payments.PaymentListParams
import com.lithic.api.models.payments.PaymentRetrieveParams
import com.lithic.api.models.payments.PaymentRetryParams
import com.lithic.api.models.payments.PaymentRetryResponse
import com.lithic.api.models.payments.PaymentSimulateActionParams
import com.lithic.api.models.payments.PaymentSimulateActionResponse
import com.lithic.api.models.payments.PaymentSimulateReceiptParams
import com.lithic.api.models.payments.PaymentSimulateReceiptResponse
import com.lithic.api.models.payments.PaymentSimulateReleaseParams
import com.lithic.api.models.payments.PaymentSimulateReleaseResponse
import com.lithic.api.models.payments.PaymentSimulateReturnParams
import com.lithic.api.models.payments.PaymentSimulateReturnResponse
import java.util.concurrent.CompletableFuture

class PaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentServiceAsync {

    private val withRawResponse: PaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentCreateResponse> =
        // post /v1/payments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Payment> =
        // get /v1/payments/{payment_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: PaymentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentListPageAsync> =
        // get /v1/payments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentRetryResponse> =
        // post /v1/payments/{payment_token}/retry
        withRawResponse().retry(params, requestOptions).thenApply { it.parse() }

    override fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentSimulateActionResponse> =
        // post /v1/simulate/payments/{payment_token}/action
        withRawResponse().simulateAction(params, requestOptions).thenApply { it.parse() }

    override fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentSimulateReceiptResponse> =
        // post /v1/simulate/payments/receipt
        withRawResponse().simulateReceipt(params, requestOptions).thenApply { it.parse() }

    override fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentSimulateReleaseResponse> =
        // post /v1/simulate/payments/release
        withRawResponse().simulateRelease(params, requestOptions).thenApply { it.parse() }

    override fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentSimulateReturnResponse> =
        // post /v1/simulate/payments/return
        withRawResponse().simulateReturn(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PaymentCreateResponse> =
            jsonHandler<PaymentCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "payments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Payment> =
            jsonHandler<Payment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Payment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "payments", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<PaymentListPageAsync.Response> =
            jsonHandler<PaymentListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PaymentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "payments")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                PaymentListPageAsync.of(
                                    PaymentServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val retryHandler: Handler<PaymentRetryResponse> =
            jsonHandler<PaymentRetryResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentRetryResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "payments", params._pathParam(0), "retry")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retryHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val simulateActionHandler: Handler<PaymentSimulateActionResponse> =
            jsonHandler<PaymentSimulateActionResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateAction(
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentSimulateActionResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "payments", params._pathParam(0), "action")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateActionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val simulateReceiptHandler: Handler<PaymentSimulateReceiptResponse> =
            jsonHandler<PaymentSimulateReceiptResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateReceipt(
            params: PaymentSimulateReceiptParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReceiptResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "payments", "receipt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateReceiptHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val simulateReleaseHandler: Handler<PaymentSimulateReleaseResponse> =
            jsonHandler<PaymentSimulateReleaseResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateRelease(
            params: PaymentSimulateReleaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReleaseResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "payments", "release")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateReleaseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val simulateReturnHandler: Handler<PaymentSimulateReturnResponse> =
            jsonHandler<PaymentSimulateReturnResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateReturn(
            params: PaymentSimulateReturnParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReturnResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "payments", "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateReturnHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
