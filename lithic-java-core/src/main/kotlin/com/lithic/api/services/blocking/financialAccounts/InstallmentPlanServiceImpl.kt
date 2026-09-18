// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

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
import com.lithic.api.models.FinancialAccountInstallmentPlanListPage
import com.lithic.api.models.FinancialAccountInstallmentPlanListPageResponse
import com.lithic.api.models.FinancialAccountInstallmentPlanListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanRetrieveParams
import com.lithic.api.models.InstallmentPlan
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class InstallmentPlanServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    InstallmentPlanService {

    private val withRawResponse: InstallmentPlanService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InstallmentPlanService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstallmentPlanService =
        InstallmentPlanServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: FinancialAccountInstallmentPlanRetrieveParams,
        requestOptions: RequestOptions,
    ): InstallmentPlan =
        // get
        // /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: FinancialAccountInstallmentPlanListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountInstallmentPlanListPage =
        // get /v1/financial_accounts/{financial_account_token}/installment_plans
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InstallmentPlanService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstallmentPlanService.WithRawResponse =
            InstallmentPlanServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<InstallmentPlan> =
            jsonHandler<InstallmentPlan>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FinancialAccountInstallmentPlanRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InstallmentPlan> {
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

        private val listHandler: Handler<FinancialAccountInstallmentPlanListPageResponse> =
            jsonHandler<FinancialAccountInstallmentPlanListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: FinancialAccountInstallmentPlanListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "installment_plans",
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
                        FinancialAccountInstallmentPlanListPage.builder()
                            .service(InstallmentPlanServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
