// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ReportSettlementListDetailsPageAsync
import com.lithic.api.models.ReportSettlementListDetailsParams
import com.lithic.api.models.ReportSettlementSummaryParams
import com.lithic.api.models.SettlementReport
import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsync
import java.time.LocalDate
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface SettlementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): SettlementServiceAsync

    fun networkTotals(): NetworkTotalServiceAsync

    /** List details. */
    fun listDetails(
        reportDate: LocalDate
    ): CompletableFuture<ReportSettlementListDetailsPageAsync> =
        listDetails(reportDate, ReportSettlementListDetailsParams.none())

    /** @see listDetails */
    fun listDetails(
        reportDate: LocalDate,
        params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportSettlementListDetailsPageAsync> =
        listDetails(params.toBuilder().reportDate(reportDate).build(), requestOptions)

    /** @see listDetails */
    fun listDetails(
        reportDate: LocalDate,
        params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
    ): CompletableFuture<ReportSettlementListDetailsPageAsync> =
        listDetails(reportDate, params, RequestOptions.none())

    /** @see listDetails */
    fun listDetails(
        params: ReportSettlementListDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportSettlementListDetailsPageAsync>

    /** @see listDetails */
    fun listDetails(
        params: ReportSettlementListDetailsParams
    ): CompletableFuture<ReportSettlementListDetailsPageAsync> =
        listDetails(params, RequestOptions.none())

    /** @see listDetails */
    fun listDetails(
        reportDate: LocalDate,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportSettlementListDetailsPageAsync> =
        listDetails(reportDate, ReportSettlementListDetailsParams.none(), requestOptions)

    /** Get the settlement report for a specified report date. Not available in sandbox. */
    fun summary(reportDate: LocalDate): CompletableFuture<SettlementReport> =
        summary(reportDate, ReportSettlementSummaryParams.none())

    /** @see summary */
    fun summary(
        reportDate: LocalDate,
        params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettlementReport> =
        summary(params.toBuilder().reportDate(reportDate).build(), requestOptions)

    /** @see summary */
    fun summary(
        reportDate: LocalDate,
        params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
    ): CompletableFuture<SettlementReport> = summary(reportDate, params, RequestOptions.none())

    /** @see summary */
    fun summary(
        params: ReportSettlementSummaryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<SettlementReport>

    /** @see summary */
    fun summary(params: ReportSettlementSummaryParams): CompletableFuture<SettlementReport> =
        summary(params, RequestOptions.none())

    /** @see summary */
    fun summary(
        reportDate: LocalDate,
        requestOptions: RequestOptions,
    ): CompletableFuture<SettlementReport> =
        summary(reportDate, ReportSettlementSummaryParams.none(), requestOptions)

    /**
     * A view of [SettlementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): SettlementServiceAsync.WithRawResponse

        fun networkTotals(): NetworkTotalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/details/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.listDetails].
         */
        fun listDetails(
            reportDate: LocalDate
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>> =
            listDetails(reportDate, ReportSettlementListDetailsParams.none())

        /** @see listDetails */
        fun listDetails(
            reportDate: LocalDate,
            params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>> =
            listDetails(params.toBuilder().reportDate(reportDate).build(), requestOptions)

        /** @see listDetails */
        fun listDetails(
            reportDate: LocalDate,
            params: ReportSettlementListDetailsParams = ReportSettlementListDetailsParams.none(),
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>> =
            listDetails(reportDate, params, RequestOptions.none())

        /** @see listDetails */
        fun listDetails(
            params: ReportSettlementListDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>>

        /** @see listDetails */
        fun listDetails(
            params: ReportSettlementListDetailsParams
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>> =
            listDetails(params, RequestOptions.none())

        /** @see listDetails */
        fun listDetails(
            reportDate: LocalDate,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportSettlementListDetailsPageAsync>> =
            listDetails(reportDate, ReportSettlementListDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/summary/{report_date}`, but
         * is otherwise the same as [SettlementServiceAsync.summary].
         */
        fun summary(reportDate: LocalDate): CompletableFuture<HttpResponseFor<SettlementReport>> =
            summary(reportDate, ReportSettlementSummaryParams.none())

        /** @see summary */
        fun summary(
            reportDate: LocalDate,
            params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettlementReport>> =
            summary(params.toBuilder().reportDate(reportDate).build(), requestOptions)

        /** @see summary */
        fun summary(
            reportDate: LocalDate,
            params: ReportSettlementSummaryParams = ReportSettlementSummaryParams.none(),
        ): CompletableFuture<HttpResponseFor<SettlementReport>> =
            summary(reportDate, params, RequestOptions.none())

        /** @see summary */
        fun summary(
            params: ReportSettlementSummaryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<SettlementReport>>

        /** @see summary */
        fun summary(
            params: ReportSettlementSummaryParams
        ): CompletableFuture<HttpResponseFor<SettlementReport>> =
            summary(params, RequestOptions.none())

        /** @see summary */
        fun summary(
            reportDate: LocalDate,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<SettlementReport>> =
            summary(reportDate, ReportSettlementSummaryParams.none(), requestOptions)
    }
}
