// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts.installmentPlans

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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListPage
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListPageResponse
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementRetrieveParams
import com.lithic.api.models.InstallmentPlanStatement
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementService {

    private val withRawResponse: StatementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementService =
        StatementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): InstallmentPlanStatement =
        // get
        // /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements/{statement_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: FinancialAccountInstallmentPlanStatementListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountInstallmentPlanStatementListPage =
        // get
        // /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementService.WithRawResponse =
            StatementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InstallmentPlanStatement> =
            jsonHandler<InstallmentPlanStatement>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstallmentPlanStatement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("statementToken", params.statementToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "installment_plans",
                        params._pathParam(1),
                        "statements",
                        params._pathParam(2),
                    )
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

        private val listHandler: Handler<FinancialAccountInstallmentPlanStatementListPageResponse> =
            jsonHandler<FinancialAccountInstallmentPlanStatementListPageResponse>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: FinancialAccountInstallmentPlanStatementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountInstallmentPlanStatementListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("installmentPlanToken", params.installmentPlanToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "installment_plans",
                        params._pathParam(1),
                        "statements",
                    )
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
                        FinancialAccountInstallmentPlanStatementListPage.builder()
                            .service(StatementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
