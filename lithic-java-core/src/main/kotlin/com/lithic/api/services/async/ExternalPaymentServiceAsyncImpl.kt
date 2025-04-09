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
import com.lithic.api.models.ExternalPayment
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentListPageAsync
import com.lithic.api.models.ExternalPaymentListPageResponse
import com.lithic.api.models.ExternalPaymentListParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams
import java.util.concurrent.CompletableFuture

class ExternalPaymentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalPaymentServiceAsync {

    private val withRawResponse: ExternalPaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExternalPaymentServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalPayment> =
        // post /v1/external_payments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalPayment> =
        // get /v1/external_payments/{external_payment_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ExternalPaymentListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalPaymentListPageAsync> =
        // get /v1/external_payments
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalPayment> =
        // post /v1/external_payments/{external_payment_token}/cancel
        withRawResponse().cancel(params, requestOptions).thenApply { it.parse() }

    override fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalPayment> =
        // post /v1/external_payments/{external_payment_token}/release
        withRawResponse().release(params, requestOptions).thenApply { it.parse() }

    override fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalPayment> =
        // post /v1/external_payments/{external_payment_token}/reverse
        withRawResponse().reverse(params, requestOptions).thenApply { it.parse() }

    override fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalPayment> =
        // post /v1/external_payments/{external_payment_token}/settle
        withRawResponse().settle(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExternalPaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: ExternalPaymentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "external_payments")
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

        private val retrieveHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: ExternalPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "external_payments", params._pathParam(0))
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

        private val listHandler: Handler<ExternalPaymentListPageResponse> =
            jsonHandler<ExternalPaymentListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ExternalPaymentListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalPaymentListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "external_payments")
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
                                ExternalPaymentListPageAsync.of(
                                    ExternalPaymentServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val cancelHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun cancel(
            params: ExternalPaymentCancelParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "external_payments", params._pathParam(0), "cancel")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { cancelHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val releaseHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun release(
            params: ExternalPaymentReleaseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "external_payments", params._pathParam(0), "release")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { releaseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reverseHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun reverse(
            params: ExternalPaymentReverseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "external_payments", params._pathParam(0), "reverse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { reverseHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val settleHandler: Handler<ExternalPayment> =
            jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun settle(
            params: ExternalPaymentSettleParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "external_payments", params._pathParam(0), "settle")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { settleHandler.handle(it) }
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
