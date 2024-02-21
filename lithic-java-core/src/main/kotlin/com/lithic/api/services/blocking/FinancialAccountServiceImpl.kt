// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPage
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.services.blocking.financialAccounts.BalanceService
import com.lithic.api.services.blocking.financialAccounts.BalanceServiceImpl
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionServiceImpl
import com.lithic.api.services.blocking.financialAccounts.StatementService
import com.lithic.api.services.blocking.financialAccounts.StatementServiceImpl
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class FinancialAccountServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinancialAccountService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptions) }

    private val financialTransactions: FinancialTransactionService by lazy {
        FinancialTransactionServiceImpl(clientOptions)
    }

    private val statements: StatementService by lazy { StatementServiceImpl(clientOptions) }

    override fun balances(): BalanceService = balances

    override fun financialTransactions(): FinancialTransactionService = financialTransactions

    override fun statements(): StatementService = statements

    private val createHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new financial account */
    override fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions
    ): FinancialAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("financial_accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a financial account */
    override fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions
    ): FinancialAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("financial_accounts", params.getPathParam(0))
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

    private val updateHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a financial account */
    override fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions
    ): FinancialAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("financial_accounts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<FinancialAccountListPage.Response> =
        jsonHandler<FinancialAccountListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve information on your financial accounts including routing and account number. */
    override fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions
    ): FinancialAccountListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("financial_accounts")
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
                .let { FinancialAccountListPage.of(this, params, it) }
        }
    }
}
