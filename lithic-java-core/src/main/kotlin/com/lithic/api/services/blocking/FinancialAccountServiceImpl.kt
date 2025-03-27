// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

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
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.financialaccounts.FinancialAccount
import com.lithic.api.models.financialaccounts.FinancialAccountChargeOffParams
import com.lithic.api.models.financialaccounts.FinancialAccountCreateParams
import com.lithic.api.models.financialaccounts.FinancialAccountListPage
import com.lithic.api.models.financialaccounts.FinancialAccountListParams
import com.lithic.api.models.financialaccounts.FinancialAccountRetrieveParams
import com.lithic.api.models.financialaccounts.FinancialAccountUpdateParams
import com.lithic.api.models.financialaccounts.creditconfiguration.FinancialAccountCreditConfig
import com.lithic.api.services.blocking.financialaccounts.BalanceService
import com.lithic.api.services.blocking.financialaccounts.BalanceServiceImpl
import com.lithic.api.services.blocking.financialaccounts.CreditConfigurationService
import com.lithic.api.services.blocking.financialaccounts.CreditConfigurationServiceImpl
import com.lithic.api.services.blocking.financialaccounts.FinancialTransactionService
import com.lithic.api.services.blocking.financialaccounts.FinancialTransactionServiceImpl
import com.lithic.api.services.blocking.financialaccounts.LoanTapeService
import com.lithic.api.services.blocking.financialaccounts.LoanTapeServiceImpl
import com.lithic.api.services.blocking.financialaccounts.StatementService
import com.lithic.api.services.blocking.financialaccounts.StatementServiceImpl

class FinancialAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FinancialAccountService {

    private val withRawResponse: FinancialAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptions) }

    private val financialTransactions: FinancialTransactionService by lazy {
        FinancialTransactionServiceImpl(clientOptions)
    }

    private val creditConfiguration: CreditConfigurationService by lazy {
        CreditConfigurationServiceImpl(clientOptions)
    }

    private val statements: StatementService by lazy { StatementServiceImpl(clientOptions) }

    private val loanTapes: LoanTapeService by lazy { LoanTapeServiceImpl(clientOptions) }

    override fun withRawResponse(): FinancialAccountService.WithRawResponse = withRawResponse

    override fun balances(): BalanceService = balances

    override fun financialTransactions(): FinancialTransactionService = financialTransactions

    override fun creditConfiguration(): CreditConfigurationService = creditConfiguration

    override fun statements(): StatementService = statements

    override fun loanTapes(): LoanTapeService = loanTapes

    override fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions,
    ): FinancialAccount =
        // post /v1/financial_accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): FinancialAccount =
        // get /v1/financial_accounts/{financial_account_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions,
    ): FinancialAccount =
        // patch /v1/financial_accounts/{financial_account_token}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountListPage =
        // get /v1/financial_accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun chargeOff(
        params: FinancialAccountChargeOffParams,
        requestOptions: RequestOptions,
    ): FinancialAccountCreditConfig =
        // post /v1/financial_accounts/{financial_account_token}/charge_off
        withRawResponse().chargeOff(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FinancialAccountService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val balances: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val financialTransactions: FinancialTransactionService.WithRawResponse by lazy {
            FinancialTransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditConfiguration: CreditConfigurationService.WithRawResponse by lazy {
            CreditConfigurationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val statements: StatementService.WithRawResponse by lazy {
            StatementServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val loanTapes: LoanTapeService.WithRawResponse by lazy {
            LoanTapeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun balances(): BalanceService.WithRawResponse = balances

        override fun financialTransactions(): FinancialTransactionService.WithRawResponse =
            financialTransactions

        override fun creditConfiguration(): CreditConfigurationService.WithRawResponse =
            creditConfiguration

        override fun statements(): StatementService.WithRawResponse = statements

        override fun loanTapes(): LoanTapeService.WithRawResponse = loanTapes

        private val createHandler: Handler<FinancialAccount> =
            jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: FinancialAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "financial_accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<FinancialAccount> =
            jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: FinancialAccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0))
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

        private val updateHandler: Handler<FinancialAccount> =
            jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: FinancialAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<FinancialAccountListPage.Response> =
            jsonHandler<FinancialAccountListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FinancialAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "financial_accounts")
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
                        FinancialAccountListPage.of(
                            FinancialAccountServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val chargeOffHandler: Handler<FinancialAccountCreditConfig> =
            jsonHandler<FinancialAccountCreditConfig>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun chargeOff(
            params: FinancialAccountChargeOffParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountCreditConfig> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "charge_off")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { chargeOffHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
