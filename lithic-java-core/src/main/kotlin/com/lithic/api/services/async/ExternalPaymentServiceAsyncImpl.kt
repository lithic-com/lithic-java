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
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ExternalPayment
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentListPageAsync
import com.lithic.api.models.ExternalPaymentListParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams
import java.util.concurrent.CompletableFuture

class ExternalPaymentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExternalPaymentServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create external payment */
    override fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get external payment */
    override fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "external_payments", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val listHandler: Handler<ExternalPaymentListPageAsync.Response> =
        jsonHandler<ExternalPaymentListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List external payments */
    override fun list(
        params: ExternalPaymentListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalPaymentListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "external_payments")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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
                .let { ExternalPaymentListPageAsync.of(this, params, it) }
        }
    }

    private val cancelHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Cancel external payment */
    override fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments", params.getPathParam(0), "cancel")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { cancelHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val releaseHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Release external payment */
    override fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments", params.getPathParam(0), "release")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { releaseHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val reverseHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Reverse external payment */
    override fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments", params.getPathParam(0), "reverse")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { reverseHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val settleHandler: Handler<ExternalPayment> =
        jsonHandler<ExternalPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Settle external payment */
    override fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalPayment> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_payments", params.getPathParam(0), "settle")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { settleHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
