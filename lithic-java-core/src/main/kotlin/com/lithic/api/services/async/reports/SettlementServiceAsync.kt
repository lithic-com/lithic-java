// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ReportSettlementListDetailsPageAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsync
import java.util.concurrent.CompletableFuture

interface SettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun networkTotals(): NetworkTotalServiceAsync

    /** List details. */
    fun listDetails(
        params: ReportSettlementListDetailsParams
    ): CompletableFuture<ReportSettlementListDetailsPageAsync> =
        listDetails(params, RequestOptions.none())

    /** @see [listDetails] */
    fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportSettlementListDetailsPageAsync>

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    fun summary(params: ReportSettlementSummaryParams): CompletableFuture<SettlementReport> =
        summary(params, RequestOptions.none())

    /** @see [summary] */
    fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettlementReport>

    /**
     * A view of [SettlementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun networkTotals(): NetworkTotalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/details/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.listDetails].
         */
        @MustBeClosed
        fun listDetails(
            params: ReportSettlementListDetailsParams
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>> =
            listDetails(params, RequestOptions.none())

        /** @see [listDetails] */
        @MustBeClosed
        fun listDetails(
            params: ReportSettlementListDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>>

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/summary/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.summary].
         */
        @MustBeClosed
        fun summary(
            params: ReportSettlementSummaryParams
        ): CompletableFuture<HttpResponseFor<SettlementReport>> =
            summary(params, RequestOptions.none())

        /** @see [summary] */
        @MustBeClosed
        fun summary(
            params: ReportSettlementSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettlementReport>>
    }
}
