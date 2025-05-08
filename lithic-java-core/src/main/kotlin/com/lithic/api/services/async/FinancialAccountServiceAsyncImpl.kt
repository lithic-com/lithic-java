// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListPageResponse
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.models.FinancialAccountUpdateStatusParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.CreditConfigurationServiceAsync
import com.lithic.api.services.async.financialAccounts.CreditConfigurationServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsync
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsyncImpl
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import com.lithic.api.services.async.financialAccounts.StatementServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class FinancialAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : FinancialAccountServiceAsync {

    private val withRawResponse: FinancialAccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val financialTransactions: FinancialTransactionServiceAsync by lazy {
        FinancialTransactionServiceAsyncImpl(clientOptions)
    }

    private val creditConfiguration: CreditConfigurationServiceAsync by lazy {
        CreditConfigurationServiceAsyncImpl(clientOptions)
    }

    private val statements: StatementServiceAsync by lazy {
        StatementServiceAsyncImpl(clientOptions)
    }

    private val loanTapes: LoanTapeServiceAsync by lazy { LoanTapeServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): FinancialAccountServiceAsync.WithRawResponse = withRawResponse

    override fun balances(): BalanceServiceAsync = balances

    override fun financialTransactions(): FinancialTransactionServiceAsync = financialTransactions

    override fun creditConfiguration(): CreditConfigurationServiceAsync = creditConfiguration

    override fun statements(): StatementServiceAsync = statements

    override fun loanTapes(): LoanTapeServiceAsync = loanTapes

    override fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccount> =
        // post /v1/financial_accounts
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccount> =
        // get /v1/financial_accounts/{financial_account_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccount> =
        // patch /v1/financial_accounts/{financial_account_token}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountListPageAsync> =
        // get /v1/financial_accounts
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun updateStatus(
        params: FinancialAccountUpdateStatusParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccount> =
        // post /v1/financial_accounts/{financial_account_token}/update_status
        withRawResponse().updateStatus(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FinancialAccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val balances: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val financialTransactions:
            FinancialTransactionServiceAsync.WithRawResponse by lazy {
            FinancialTransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditConfiguration: CreditConfigurationServiceAsync.WithRawResponse by lazy {
            CreditConfigurationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val statements: StatementServiceAsync.WithRawResponse by lazy {
            StatementServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val loanTapes: LoanTapeServiceAsync.WithRawResponse by lazy {
            LoanTapeServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun balances(): BalanceServiceAsync.WithRawResponse = balances

        override fun financialTransactions(): FinancialTransactionServiceAsync.WithRawResponse =
            financialTransactions

        override fun creditConfiguration(): CreditConfigurationServiceAsync.WithRawResponse =
            creditConfiguration

        override fun statements(): StatementServiceAsync.WithRawResponse = statements

        override fun loanTapes(): LoanTapeServiceAsync.WithRawResponse = loanTapes

        private val createHandler: Handler<FinancialAccount> =
            jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: FinancialAccountCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "financial_accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<FinancialAccount> =
            jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: FinancialAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0))
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

        private val updateHandler: Handler<FinancialAccount> =
            jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: FinancialAccountUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<FinancialAccountListPageResponse> =
            jsonHandler<FinancialAccountListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FinancialAccountListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "financial_accounts")
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
                                FinancialAccountListPageAsync.builder()
                                    .service(FinancialAccountServiceAsyncImpl(clientOptions))
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val updateStatusHandler: Handler<FinancialAccount> =
            jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateStatus(
            params: FinancialAccountUpdateStatusParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "update_status",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateStatusHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
