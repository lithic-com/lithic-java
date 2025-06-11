// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPage
import com.lithic.api.models.FinancialAccountListPageResponse
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRegisterAccountNumberParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.models.FinancialAccountUpdateStatusParams
import com.lithic.api.services.blocking.financialAccounts.BalanceService
import com.lithic.api.services.blocking.financialAccounts.BalanceServiceImpl
import com.lithic.api.services.blocking.financialAccounts.CreditConfigurationService
import com.lithic.api.services.blocking.financialAccounts.CreditConfigurationServiceImpl
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionServiceImpl
import com.lithic.api.services.blocking.financialAccounts.LoanTapeService
import com.lithic.api.services.blocking.financialAccounts.LoanTapeServiceImpl
import com.lithic.api.services.blocking.financialAccounts.StatementService
import com.lithic.api.services.blocking.financialAccounts.StatementServiceImpl
import kotlin.jvm.optionals.getOrNull

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

    override fun registerAccountNumber(
        params: FinancialAccountRegisterAccountNumberParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/financial_accounts/{financial_account_token}/register_account_number
        withRawResponse().registerAccountNumber(params, requestOptions)
    }

    override fun updateStatus(
        params: FinancialAccountUpdateStatusParams,
        requestOptions: RequestOptions,
    ): FinancialAccount =
        // post /v1/financial_accounts/{financial_account_token}/update_status
        withRawResponse().updateStatus(params, requestOptions).parse()

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
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
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

        private val listHandler: Handler<FinancialAccountListPageResponse> =
            jsonHandler<FinancialAccountListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FinancialAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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
                        FinancialAccountListPage.builder()
                            .service(FinancialAccountServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val registerAccountNumberHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun registerAccountNumber(
            params: FinancialAccountRegisterAccountNumberParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "register_account_number",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { registerAccountNumberHandler.handle(it) } }
        }

        private val updateStatusHandler: Handler<FinancialAccount> =
            jsonHandler<FinancialAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun updateStatus(
            params: FinancialAccountUpdateStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "update_status",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
