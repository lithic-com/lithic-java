// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports.settlement

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkTotalRetrieveResponse
import com.lithic.api.models.ReportSettlementNetworkTotalListPage
import com.lithic.api.models.ReportSettlementNetworkTotalListParams
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams

interface NetworkTotalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a specific network total record by token. Not available in sandbox. */
    fun retrieve(params: ReportSettlementNetworkTotalRetrieveParams): NetworkTotalRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkTotalRetrieveResponse

    /** List network total records with optional filters. Not available in sandbox. */
    fun list(): ReportSettlementNetworkTotalListPage =
        list(ReportSettlementNetworkTotalListParams.none())

    /** @see [list] */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementNetworkTotalListPage

    /** @see [list] */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none()
    ): ReportSettlementNetworkTotalListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ReportSettlementNetworkTotalListPage =
        list(ReportSettlementNetworkTotalListParams.none(), requestOptions)

    /**
     * A view of [NetworkTotalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals/{token}`, but
         * is otherwise the same as [NetworkTotalService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams
        ): HttpResponseFor<NetworkTotalRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkTotalRetrieveResponse>

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals`, but is
         * otherwise the same as [NetworkTotalService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ReportSettlementNetworkTotalListPage> =
            list(ReportSettlementNetworkTotalListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none()
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage> =
            list(ReportSettlementNetworkTotalListParams.none(), requestOptions)
    }
}
