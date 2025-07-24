// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports.settlement

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkTotalRetrieveResponse
import com.lithic.api.models.ReportSettlementNetworkTotalListPage
import com.lithic.api.models.ReportSettlementNetworkTotalListParams
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams
import java.util.function.Consumer

interface NetworkTotalService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkTotalService

    /** Retrieve a specific network total record by token. Not available in sandbox. */
    fun retrieve(token: String): NetworkTotalRetrieveResponse =
        retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: ReportSettlementNetworkTotalRetrieveParams =
            ReportSettlementNetworkTotalRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkTotalRetrieveResponse =
        retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: ReportSettlementNetworkTotalRetrieveParams =
            ReportSettlementNetworkTotalRetrieveParams.none(),
    ): NetworkTotalRetrieveResponse = retrieve(token, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkTotalRetrieveResponse

    /** @see retrieve */
    fun retrieve(params: ReportSettlementNetworkTotalRetrieveParams): NetworkTotalRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(token: String, requestOptions: RequestOptions): NetworkTotalRetrieveResponse =
        retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

    /** List network total records with optional filters. Not available in sandbox. */
    fun list(): ReportSettlementNetworkTotalListPage =
        list(ReportSettlementNetworkTotalListParams.none())

    /** @see list */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ReportSettlementNetworkTotalListPage

    /** @see list */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none()
    ): ReportSettlementNetworkTotalListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): ReportSettlementNetworkTotalListPage =
        list(ReportSettlementNetworkTotalListParams.none(), requestOptions)

    /**
     * A view of [NetworkTotalService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkTotalService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals/{token}`, but
         * is otherwise the same as [NetworkTotalService.retrieve].
         */
        @MustBeClosed
        fun retrieve(token: String): HttpResponseFor<NetworkTotalRetrieveResponse> =
            retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            token: String,
            params: ReportSettlementNetworkTotalRetrieveParams =
                ReportSettlementNetworkTotalRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkTotalRetrieveResponse> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            token: String,
            params: ReportSettlementNetworkTotalRetrieveParams =
                ReportSettlementNetworkTotalRetrieveParams.none(),
        ): HttpResponseFor<NetworkTotalRetrieveResponse> =
            retrieve(token, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkTotalRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams
        ): HttpResponseFor<NetworkTotalRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            token: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkTotalRetrieveResponse> =
            retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals`, but is
         * otherwise the same as [NetworkTotalService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ReportSettlementNetworkTotalListPage> =
            list(ReportSettlementNetworkTotalListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none()
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage> =
            list(ReportSettlementNetworkTotalListParams.none(), requestOptions)
    }
}
