// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ExternalPayment
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentListPage
import com.lithic.api.models.ExternalPaymentListParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams

class ExternalPaymentServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ExternalPaymentService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create external payment */
    override fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions
    ): ExternalPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get external payment */
    override fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions
    ): ExternalPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "external_payments", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ExternalPaymentListPage.Response> =
        jsonHandler<ExternalPaymentListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List external payments */
    override fun list(
        params: ExternalPaymentListParams,
        requestOptions: RequestOptions
    ): ExternalPaymentListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "external_payments")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { ExternalPaymentListPage.of(this, params, it) }
    }

    private val cancelHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Cancel external payment */
    override fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions
    ): ExternalPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments", params.getPathParam(0), "cancel")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { cancelHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val releaseHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Release external payment */
    override fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions
    ): ExternalPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments", params.getPathParam(0), "release")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { releaseHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val reverseHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Reverse external payment */
    override fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions
    ): ExternalPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments", params.getPathParam(0), "reverse")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { reverseHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val settleHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Settle external payment */
    override fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions
    ): ExternalPayment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments", params.getPathParam(0), "settle")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { settleHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
