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
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPageAsync
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction
import java.util.concurrent.CompletableFuture

class ManagementOperationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ManagementOperationServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ManagementOperationTransaction> =
        jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create management operation */
    override fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ManagementOperationTransaction> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "management_operations")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
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

    private val retrieveHandler: Handler<ManagementOperationTransaction> =
        jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get management operation */
    override fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ManagementOperationTransaction> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "management_operations", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
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

    private val listHandler: Handler<ManagementOperationListPageAsync.Response> =
        jsonHandler<ManagementOperationListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List management operations */
    override fun list(
        params: ManagementOperationListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ManagementOperationListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "management_operations")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
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
                .let { ManagementOperationListPageAsync.of(this, params, it) }
        }
    }

    private val reverseHandler: Handler<ManagementOperationTransaction> =
        jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Reverse a management operation */
    override fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ManagementOperationTransaction> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "management_operations", params.getPathParam(0), "reverse")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
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
}
