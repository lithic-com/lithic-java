// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorBodyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPage
import com.lithic.api.models.BookTransferListPageResponse
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferRetryParams
import com.lithic.api.models.BookTransferReverseParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class BookTransferServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BookTransferService {

    private val withRawResponse: BookTransferService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookTransferService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): BookTransferService =
        BookTransferServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions,
    ): BookTransferResponse =
        // post /v1/book_transfers
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): BookTransferResponse =
        // get /v1/book_transfers/{book_transfer_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: BookTransferListParams,
        requestOptions: RequestOptions,
    ): BookTransferListPage =
        // get /v1/book_transfers
        withRawResponse().list(params, requestOptions).parse()

    override fun retry(
        params: BookTransferRetryParams,
        requestOptions: RequestOptions,
    ): BookTransferResponse =
        // post /v1/book_transfers/{book_transfer_token}/retry
        withRawResponse().retry(params, requestOptions).parse()

    override fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions,
    ): BookTransferResponse =
        // post /v1/book_transfers/{book_transfer_token}/reverse
        withRawResponse().reverse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookTransferService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BookTransferService.WithRawResponse =
            BookTransferServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BookTransferResponse> =
            jsonHandler<BookTransferResponse>(clientOptions.jsonMapper)

        override fun create(
            params: BookTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<BookTransferResponse> =
            jsonHandler<BookTransferResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: BookTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookTransferToken", params.bookTransferToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BookTransferListPageResponse> =
            jsonHandler<BookTransferListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BookTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BookTransferListPage.builder()
                            .service(BookTransferServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retryHandler: Handler<BookTransferResponse> =
            jsonHandler<BookTransferResponse>(clientOptions.jsonMapper)

        override fun retry(
            params: BookTransferRetryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookTransferToken", params.bookTransferToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers", params._pathParam(0), "retry")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val reverseHandler: Handler<BookTransferResponse> =
            jsonHandler<BookTransferResponse>(clientOptions.jsonMapper)

        override fun reverse(
            params: BookTransferReverseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookTransferToken", params.bookTransferToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "book_transfers", params._pathParam(0), "reverse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
}
