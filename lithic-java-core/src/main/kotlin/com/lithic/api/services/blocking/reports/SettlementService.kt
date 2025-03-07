// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ReportSettlementListDetailsPage
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import com.lithic.api.services.blocking.reports.settlement.NetworkTotalService

interface SettlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun networkTotals(): NetworkTotalService

    /** List details. */
    fun listDetails(params: ReportSettlementListDetailsParams): ReportSettlementListDetailsPage =
        listDetails(params, RequestOptions.none())

    /** @see [listDetails] */
    fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementListDetailsPage

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    fun summary(params: ReportSettlementSummaryParams): SettlementReport =
        summary(params, RequestOptions.none())

    /** @see [summary] */
    fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementReport

    /** A view of [SettlementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun networkTotals(): NetworkTotalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/details/{report_date}`, but
         * is otherwise the same as [SettlementService.listDetails].
         */
        @MustBeClosed
        fun listDetails(
            params: ReportSettlementListDetailsParams
        ): HttpResponseFor<ReportSettlementListDetailsPage> =
            listDetails(params, RequestOptions.none())

        /** @see [listDetails] */
        @MustBeClosed
        fun listDetails(
            params: ReportSettlementListDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementListDetailsPage>

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/summary/{report_date}`, but
         * is otherwise the same as [SettlementService.summary].
         */
        @MustBeClosed
        fun summary(params: ReportSettlementSummaryParams): HttpResponseFor<SettlementReport> =
            summary(params, RequestOptions.none())

        /** @see [summary] */
        @MustBeClosed
        fun summary(
            params: ReportSettlementSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementReport>
    }
}
