// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

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
import com.lithic.api.core.prepare
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentListPage
import com.lithic.api.models.PaymentListPageResponse
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

class PaymentServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PaymentService {

    private val withRawResponse: PaymentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PaymentService.WithRawResponse = withRawResponse

    override fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions,
    ): PaymentCreateResponse =
        // post /v1/payments
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: PaymentRetrieveParams, requestOptions: RequestOptions): Payment =
        // get /v1/payments/{payment_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: PaymentListParams, requestOptions: RequestOptions): PaymentListPage =
        // get /v1/payments
        withRawResponse().list(params, requestOptions).parse()

    override fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions,
    ): PaymentRetryResponse =
        // post /v1/payments/{payment_token}/retry
        withRawResponse().retry(params, requestOptions).parse()

    override fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions,
    ): PaymentSimulateActionResponse =
        // post /v1/simulate/payments/{payment_token}/action
        withRawResponse().simulateAction(params, requestOptions).parse()

    override fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions,
    ): PaymentSimulateReceiptResponse =
        // post /v1/simulate/payments/receipt
        withRawResponse().simulateReceipt(params, requestOptions).parse()

    override fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions,
    ): PaymentSimulateReleaseResponse =
        // post /v1/simulate/payments/release
        withRawResponse().simulateRelease(params, requestOptions).parse()

    override fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions,
    ): PaymentSimulateReturnResponse =
        // post /v1/simulate/payments/return
        withRawResponse().simulateReturn(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PaymentService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PaymentCreateResponse> =
            jsonHandler<PaymentCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "payments")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Payment> =
            jsonHandler<Payment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Payment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "payments", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<PaymentListPageResponse> =
            jsonHandler<PaymentListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: PaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "payments")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        PaymentListPage.builder()
                            .service(PaymentServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retryHandler: Handler<PaymentRetryResponse> =
            jsonHandler<PaymentRetryResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PaymentRetryResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "payments", params._pathParam(0), "retry")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<PaymentSimulateActionResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "payments", params._pathParam(0), "action")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateActionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<PaymentSimulateReceiptResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "payments", "receipt")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateReceiptHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<PaymentSimulateReleaseResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "payments", "release")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateReleaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<PaymentSimulateReturnResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "payments", "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
