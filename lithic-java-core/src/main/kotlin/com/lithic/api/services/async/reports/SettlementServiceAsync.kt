// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.reports

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ReportSettlementListDetailsPageAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import java.util.concurrent.CompletableFuture

interface SettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List details. */
    @JvmOverloads
    fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportSettlementListDetailsPageAsync>

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    @JvmOverloads
    fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettlementReport>

    /**
     * A view of [SettlementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/details/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.listDetails].
         */
        @JvmOverloads
        @MustBeClosed
        fun listDetails(
            params: ReportSettlementListDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>>

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/summary/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.summary].
         */
        @JvmOverloads
        @MustBeClosed
        fun summary(
            params: ReportSettlementSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettlementReport>>
    }
}
