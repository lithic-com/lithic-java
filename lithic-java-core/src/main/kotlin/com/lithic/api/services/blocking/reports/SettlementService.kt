// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.reports.SettlementReport
import com.lithic.api.models.reports.settlement.SettlementListDetailsPage
import com.lithic.api.models.reports.settlement.SettlementListDetailsParams
import com.lithic.api.models.reports.settlement.SettlementSummaryParams

interface SettlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List details. */
    fun listDetails(params: SettlementListDetailsParams): SettlementListDetailsPage =
        listDetails(params, RequestOptions.none())

    /** @see [listDetails] */
    fun listDetails(
        params: SettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementListDetailsPage

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    fun summary(params: SettlementSummaryParams): SettlementReport =
        summary(params, RequestOptions.none())

    /** @see [summary] */
    fun summary(
        params: SettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementReport

    /** A view of [SettlementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/details/{report_date}`, but
         * is otherwise the same as [SettlementService.listDetails].
         */
        @MustBeClosed
        fun listDetails(
            params: SettlementListDetailsParams
        ): HttpResponseFor<SettlementListDetailsPage> = listDetails(params, RequestOptions.none())

        /** @see [listDetails] */
        @MustBeClosed
        fun listDetails(
            params: SettlementListDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementListDetailsPage>

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/summary/{report_date}`, but
         * is otherwise the same as [SettlementService.summary].
         */
        @MustBeClosed
        fun summary(params: SettlementSummaryParams): HttpResponseFor<SettlementReport> =
            summary(params, RequestOptions.none())

        /** @see [summary] */
        @MustBeClosed
        fun summary(
            params: SettlementSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementReport>
    }
}
