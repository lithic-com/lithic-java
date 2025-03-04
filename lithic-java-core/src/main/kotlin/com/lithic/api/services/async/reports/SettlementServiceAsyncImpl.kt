// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ReportSettlementListDetailsPageAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsync
import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class SettlementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SettlementServiceAsync {

    private val withRawResponse: SettlementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val networkTotals: NetworkTotalServiceAsync by lazy {
        NetworkTotalServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): SettlementServiceAsync.WithRawResponse = withRawResponse

    override fun networkTotals(): NetworkTotalServiceAsync = networkTotals

    override fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportSettlementListDetailsPageAsync> =
        // get /v1/reports/settlement/details/{report_date}
        withRawResponse().listDetails(params, requestOptions).thenApply { it.parse() }

    override fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettlementReport> =
        // get /v1/reports/settlement/summary/{report_date}
        withRawResponse().summary(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SettlementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val networkTotals: NetworkTotalServiceAsync.WithRawResponse by lazy {
            NetworkTotalServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun networkTotals(): NetworkTotalServiceAsync.WithRawResponse = networkTotals

        private val listDetailsHandler: Handler<ReportSettlementListDetailsPageAsync.Response> =
            jsonHandler<ReportSettlementListDetailsPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun listDetails(
            params: ReportSettlementListDetailsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "reports",
                        "settlement",
                        "details",
                        params.getPathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listDetailsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                ReportSettlementListDetailsPageAsync.of(
                                    SettlementServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val summaryHandler: Handler<SettlementReport> =
            jsonHandler<SettlementReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun summary(
            params: ReportSettlementSummaryParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettlementReport>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "reports",
                        "settlement",
                        "summary",
                        params.getPathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
