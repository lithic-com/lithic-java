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
import com.lithic.api.errors.LithicError
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPage
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams

class BookTransferServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : BookTransferService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BookTransferResponse> =
        jsonHandler<BookTransferResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    override fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions
    ): BookTransferResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "book_transfers")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<BookTransferResponse> =
        jsonHandler<BookTransferResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get book transfer by token */
    override fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions
    ): BookTransferResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "book_transfers", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<BookTransferListPage.Response> =
        jsonHandler<BookTransferListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List book transfers */
    override fun list(
        params: BookTransferListParams,
        requestOptions: RequestOptions
    ): BookTransferListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "book_transfers")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { BookTransferListPage.of(this, params, it) }
        }
    }

    private val reverseHandler: Handler<BookTransferResponse> =
        jsonHandler<BookTransferResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Reverse a book transfer */
    override fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions
    ): BookTransferResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "book_transfers", params.getPathParam(0), "reverse")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
