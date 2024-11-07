// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ReportSettlementListDetailsPage
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport

class SettlementServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : SettlementService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listDetailsHandler: Handler<ReportSettlementListDetailsPage.Response> =
        jsonHandler<ReportSettlementListDetailsPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List details. */
    override fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions
    ): ReportSettlementListDetailsPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "reports", "settlement", "details", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listDetailsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ReportSettlementListDetailsPage.of(this, params, it) }
        }
    }

    private val summaryHandler: Handler<SettlementReport> =
        jsonHandler<SettlementReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    override fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions
    ): SettlementReport {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "reports", "settlement", "summary", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { summaryHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
