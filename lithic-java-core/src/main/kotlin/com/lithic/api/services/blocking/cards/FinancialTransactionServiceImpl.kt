// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.errorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.jsonHandler
import com.lithic.api.core.withErrorHandler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.CardFinancialTransactionListPage
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction

class FinancialTransactionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinancialTransactionService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<FinancialTransaction> =
        jsonHandler<FinancialTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the card financial transaction for the provided token. */
    override fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions
    ): FinancialTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "cards",
                    params.getPathParam(0),
                    "financial_transactions",
                    params.getPathParam(1)
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val listHandler: Handler<CardFinancialTransactionListPage.Response> =
        jsonHandler<CardFinancialTransactionListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the financial transactions for a given card. */
    override fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions
    ): CardFinancialTransactionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "cards", params.getPathParam(0), "financial_transactions")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CardFinancialTransactionListPage.of(this, params, it) }
        }
    }
}
