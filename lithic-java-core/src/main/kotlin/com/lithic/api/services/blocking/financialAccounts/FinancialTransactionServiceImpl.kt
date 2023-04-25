package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccountsFinancialTransactionListPage
import com.lithic.api.models.FinancialAccountsFinancialTransactionListParams
import com.lithic.api.models.FinancialAccountsFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class FinancialTransactionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinancialTransactionService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<FinancialTransaction> =
        jsonHandler<FinancialTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the financial transaction for the provided token. */
    override fun retrieve(
        params: FinancialAccountsFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions
    ): FinancialTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "financial_accounts",
                    params.getPathParam(0),
                    "financial_transactions",
                    params.getPathParam(1)
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<FinancialAccountsFinancialTransactionListPage.Response> =
        jsonHandler<FinancialAccountsFinancialTransactionListPage.Response>(
                clientOptions.jsonMapper
            )
            .withErrorHandler(errorHandler)

    /** List the financial transactions for a given financial account. */
    override fun list(
        params: FinancialAccountsFinancialTransactionListParams,
        requestOptions: RequestOptions
    ): FinancialAccountsFinancialTransactionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "financial_accounts",
                    params.getPathParam(0),
                    "financial_transactions"
                )
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { FinancialAccountsFinancialTransactionListPage.of(this, params, it) }
        }
    }
}