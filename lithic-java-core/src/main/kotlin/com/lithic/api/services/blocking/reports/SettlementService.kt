// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ReportSettlementListDetailsPage
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import com.lithic.api.services.blocking.reports.settlement.NetworkTotalService
import java.time.LocalDate
import java.util.function.Consumer

interface SettlementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettlementService

    fun networkTotals(): NetworkTotalService

    /** List details. */
    fun listDetails(reportDate: LocalDate): ReportSettlementListDetailsPage =
        listDetails(reportDate, ReportSettlementListDetailsParams.none())

    /** @see listDetails */
    fun listDetails(
        reportDate: LocalDate,
        params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementListDetailsPage =
        listDetails(params.toBuilder().reportDate(reportDate).build(), requestOptions)

    /** @see listDetails */
    fun listDetails(
        reportDate: LocalDate,
        params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
    ): ReportSettlementListDetailsPage = listDetails(reportDate, params, RequestOptions.none())

    /** @see listDetails */
    fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementListDetailsPage

    /** @see listDetails */
    fun listDetails(params: ReportSettlementListDetailsParams): ReportSettlementListDetailsPage =
        listDetails(params, RequestOptions.none())

    /** @see listDetails */
    fun listDetails(
        reportDate: LocalDate,
        requestOptions: RequestOptions,
    ): ReportSettlementListDetailsPage =
        listDetails(reportDate, ReportSettlementListDetailsParams.none(), requestOptions)

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    fun summary(reportDate: LocalDate): SettlementReport =
        summary(reportDate, ReportSettlementSummaryParams.none())

    /** @see summary */
    fun summary(
        reportDate: LocalDate,
        params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementReport = summary(params.toBuilder().reportDate(reportDate).build(), requestOptions)

    /** @see summary */
    fun summary(
        reportDate: LocalDate,
        params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
    ): SettlementReport = summary(reportDate, params, RequestOptions.none())

    /** @see summary */
    fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SettlementReport

    /** @see summary */
    fun summary(params: ReportSettlementSummaryParams): SettlementReport =
        summary(params, RequestOptions.none())

    /** @see summary */
    fun summary(reportDate: LocalDate, requestOptions: RequestOptions): SettlementReport =
        summary(reportDate, ReportSettlementSummaryParams.none(), requestOptions)

    /** A view of [SettlementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettlementService.WithRawResponse

        fun networkTotals(): NetworkTotalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/details/{report_date}`, but
         * is otherwise the same as [SettlementService.listDetails].
         */
        @MustBeClosed
        fun listDetails(reportDate: LocalDate): HttpResponseFor<ReportSettlementListDetailsPage> =
            listDetails(reportDate, ReportSettlementListDetailsParams.none())

        /** @see listDetails */
        @MustBeClosed
        fun listDetails(
            reportDate: LocalDate,
            params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementListDetailsPage> =
            listDetails(params.toBuilder().reportDate(reportDate).build(), requestOptions)

        /** @see listDetails */
        @MustBeClosed
        fun listDetails(
            reportDate: LocalDate,
            params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
        ): HttpResponseFor<ReportSettlementListDetailsPage> =
            listDetails(reportDate, params, RequestOptions.none())

        /** @see listDetails */
        @MustBeClosed
        fun listDetails(
            params: ReportSettlementListDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementListDetailsPage>

        /** @see listDetails */
        @MustBeClosed
        fun listDetails(
            params: ReportSettlementListDetailsParams
        ): HttpResponseFor<ReportSettlementListDetailsPage> =
            listDetails(params, RequestOptions.none())

        /** @see listDetails */
        @MustBeClosed
        fun listDetails(
            reportDate: LocalDate,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportSettlementListDetailsPage> =
            listDetails(reportDate, ReportSettlementListDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/summary/{report_date}`, but
         * is otherwise the same as [SettlementService.summary].
         */
        @MustBeClosed
        fun summary(reportDate: LocalDate): HttpResponseFor<SettlementReport> =
            summary(reportDate, ReportSettlementSummaryParams.none())

        /** @see summary */
        @MustBeClosed
        fun summary(
            reportDate: LocalDate,
            params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementReport> =
            summary(params.toBuilder().reportDate(reportDate).build(), requestOptions)

        /** @see summary */
        @MustBeClosed
        fun summary(
            reportDate: LocalDate,
            params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
        ): HttpResponseFor<SettlementReport> = summary(reportDate, params, RequestOptions.none())

        /** @see summary */
        @MustBeClosed
        fun summary(
            params: ReportSettlementSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SettlementReport>

        /** @see summary */
        @MustBeClosed
        fun summary(params: ReportSettlementSummaryParams): HttpResponseFor<SettlementReport> =
            summary(params, RequestOptions.none())

        /** @see summary */
        @MustBeClosed
        fun summary(
            reportDate: LocalDate,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SettlementReport> =
            summary(reportDate, ReportSettlementSummaryParams.none(), requestOptions)
    }
}
