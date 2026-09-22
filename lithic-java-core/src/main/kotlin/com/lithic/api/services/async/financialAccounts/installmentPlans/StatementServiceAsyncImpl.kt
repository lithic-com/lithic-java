// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts.installmentPlans

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
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListPageAsync
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListPageResponse
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementRetrieveParams
import com.lithic.api.models.InstallmentPlanStatement
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementServiceAsync {

    private val withRawResponse: StatementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): StatementServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementServiceAsync =
        StatementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<InstallmentPlanStatement> =
        // get
        // /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements/{statement_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FinancialAccountInstallmentPlanStatementListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountInstallmentPlanStatementListPageAsync> =
        // get
        // /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementServiceAsync.WithRawResponse =
            StatementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InstallmentPlanStatement> =
            jsonHandler<InstallmentPlanStatement>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<InstallmentPlanStatement>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<FinancialAccountInstallmentPlanStatementListPageResponse> =
            jsonHandler<FinancialAccountInstallmentPlanStatementListPageResponse>(
                clientOptions.jsonMapper
            )

        override fun list(
            params: FinancialAccountInstallmentPlanStatementListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<
            HttpResponseFor<FinancialAccountInstallmentPlanStatementListPageAsync>
        > {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                FinancialAccountInstallmentPlanStatementListPageAsync.builder()
                                    .service(StatementServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
