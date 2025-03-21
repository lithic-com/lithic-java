// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.CardFinancialTransactionListPageAsync
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction
import java.util.concurrent.CompletableFuture

class FinancialTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : FinancialTransactionServiceAsync {

    private val withRawResponse: FinancialTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FinancialTransactionServiceAsync.WithRawResponse =
        withRawResponse

    override fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialTransaction> =
        // get /v1/cards/{card_token}/financial_transactions/{financial_transaction_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardFinancialTransactionListPageAsync> =
        // get /v1/cards/{card_token}/financial_transactions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FinancialTransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<FinancialTransaction> =
            jsonHandler<FinancialTransaction>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "cards",
                        params._pathParam(0),
                        "financial_transactions",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<CardFinancialTransactionListPageAsync.Response> =
            jsonHandler<CardFinancialTransactionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CardFinancialTransactionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardFinancialTransactionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "cards", params._pathParam(0), "financial_transactions")
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
                                CardFinancialTransactionListPageAsync.of(
                                    FinancialTransactionServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
