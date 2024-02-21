// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import com.lithic.api.services.async.financialAccounts.StatementServiceAsyncImpl
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class FinancialAccountServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : FinancialAccountServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val financialTransactions: FinancialTransactionServiceAsync by lazy {
        FinancialTransactionServiceAsyncImpl(clientOptions)
    }

    private val statements: StatementServiceAsync by lazy {
        StatementServiceAsyncImpl(clientOptions)
    }

    override fun balances(): BalanceServiceAsync = balances

    override fun financialTransactions(): FinancialTransactionServiceAsync = financialTransactions

    override fun statements(): StatementServiceAsync = statements

    private val createHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a new financial account */
    override fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FinancialAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("financial_accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a financial account */
    override fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FinancialAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("financial_accounts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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

    private val updateHandler: Handler<FinancialAccount> =
        jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a financial account */
    override fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FinancialAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("financial_accounts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<FinancialAccountListPageAsync.Response> =
        jsonHandler<FinancialAccountListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve information on your financial accounts including routing and account number. */
    override fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FinancialAccountListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("financial_accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
                .let { FinancialAccountListPageAsync.of(this, params, it) }
        }
    }
}
