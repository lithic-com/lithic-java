// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

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
import com.lithic.api.core.prepare
import com.lithic.api.models.CardFinancialTransactionListPage
import com.lithic.api.models.CardFinancialTransactionListPageResponse
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction

class FinancialTransactionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : FinancialTransactionService {

    private val withRawResponse: FinancialTransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FinancialTransactionService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): FinancialTransaction =
        // get /v1/cards/{card_token}/financial_transactions/{financial_transaction_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions,
    ): CardFinancialTransactionListPage =
        // get /v1/cards/{card_token}/financial_transactions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FinancialTransactionService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<FinancialTransaction> =
            jsonHandler<FinancialTransaction>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialTransaction> {
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

        private val listHandler: Handler<CardFinancialTransactionListPageResponse> =
            jsonHandler<CardFinancialTransactionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CardFinancialTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardFinancialTransactionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "cards", params._pathParam(0), "financial_transactions")
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
                        CardFinancialTransactionListPage.builder()
                            .service(FinancialTransactionServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
