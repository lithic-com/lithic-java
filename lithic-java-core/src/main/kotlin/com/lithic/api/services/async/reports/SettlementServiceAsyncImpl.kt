// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ReportSettlementListDetailsPageAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class SettlementServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : SettlementServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listDetailsHandler: Handler<ReportSettlementListDetailsPageAsync.Response> =
        jsonHandler<ReportSettlementListDetailsPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List details. */
    override fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ReportSettlementListDetailsPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("reports", "settlement", "details", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listDetailsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ReportSettlementListDetailsPageAsync.of(this, params, it) }
        }
    }

    private val summaryHandler: Handler<SettlementReport> =
        jsonHandler<SettlementReport>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    override fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions
    ): CompletableFuture<SettlementReport> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("reports", "settlement", "summary", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
