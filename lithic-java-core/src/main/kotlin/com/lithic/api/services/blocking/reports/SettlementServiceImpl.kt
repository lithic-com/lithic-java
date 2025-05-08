// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports

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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.ReportSettlementListDetailsPage
import com.lithic.api.models.ReportSettlementListDetailsPageResponse
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import com.lithic.api.services.blocking.reports.settlement.NetworkTotalService
import com.lithic.api.services.blocking.reports.settlement.NetworkTotalServiceImpl
import kotlin.jvm.optionals.getOrNull

class SettlementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    SettlementService {

    private val withRawResponse: SettlementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val networkTotals: NetworkTotalService by lazy {
        NetworkTotalServiceImpl(clientOptions)
    }

    override fun withRawResponse(): SettlementService.WithRawResponse = withRawResponse

    override fun networkTotals(): NetworkTotalService = networkTotals

    override fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions,
    ): ReportSettlementListDetailsPage =
        // get /v1/reports/settlement/details/{report_date}
        withRawResponse().listDetails(params, requestOptions).parse()

    override fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions,
    ): SettlementReport =
        // get /v1/reports/settlement/summary/{report_date}
        withRawResponse().summary(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettlementService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val networkTotals: NetworkTotalService.WithRawResponse by lazy {
            NetworkTotalServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun networkTotals(): NetworkTotalService.WithRawResponse = networkTotals

        private val listDetailsHandler: Handler<ReportSettlementListDetailsPageResponse> =
            jsonHandler<ReportSettlementListDetailsPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listDetails(
            params: ReportSettlementListDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportSettlementListDetailsPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportDate", params.reportDate().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "reports", "settlement", "details", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        ReportSettlementListDetailsPage.builder()
                            .service(SettlementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val summaryHandler: Handler<SettlementReport> =
            jsonHandler<SettlementReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun summary(
            params: ReportSettlementSummaryParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettlementReport> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("reportDate", params.reportDate().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "reports", "settlement", "summary", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { summaryHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
