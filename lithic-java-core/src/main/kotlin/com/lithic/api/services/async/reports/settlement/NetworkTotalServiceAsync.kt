// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports.settlement

import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkTotalRetrieveResponse
import com.lithic.api.models.ReportSettlementNetworkTotalListPageAsync
import com.lithic.api.models.ReportSettlementNetworkTotalListParams
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams
import java.util.concurrent.CompletableFuture

interface NetworkTotalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a specific network total record by token. Not available in sandbox. */
    fun retrieve(token: String): CompletableFuture<NetworkTotalRetrieveResponse> =
        retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        token: String,
        params: ReportSettlementNetworkTotalRetrieveParams =
            ReportSettlementNetworkTotalRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkTotalRetrieveResponse> =
        retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        token: String,
        params: ReportSettlementNetworkTotalRetrieveParams =
            ReportSettlementNetworkTotalRetrieveParams.none(),
    ): CompletableFuture<NetworkTotalRetrieveResponse> =
        retrieve(token, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkTotalRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams
    ): CompletableFuture<NetworkTotalRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        token: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkTotalRetrieveResponse> =
        retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

    /** List network total records with optional filters. Not available in sandbox. */
    fun list(): CompletableFuture<ReportSettlementNetworkTotalListPageAsync> =
        list(ReportSettlementNetworkTotalListParams.none())

    /** @see [list] */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportSettlementNetworkTotalListPageAsync>

    /** @see [list] */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none()
    ): CompletableFuture<ReportSettlementNetworkTotalListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        requestOptions: RequestOptions
    ): CompletableFuture<ReportSettlementNetworkTotalListPageAsync> =
        list(ReportSettlementNetworkTotalListParams.none(), requestOptions)

    /**
     * A view of [NetworkTotalServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals/{token}`, but
         * is otherwise the same as [NetworkTotalServiceAsync.retrieve].
         */
        fun retrieve(
            token: String
        ): CompletableFuture<HttpResponseFor<NetworkTotalRetrieveResponse>> =
            retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            token: String,
            params: ReportSettlementNetworkTotalRetrieveParams =
                ReportSettlementNetworkTotalRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkTotalRetrieveResponse>> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            token: String,
            params: ReportSettlementNetworkTotalRetrieveParams =
                ReportSettlementNetworkTotalRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NetworkTotalRetrieveResponse>> =
            retrieve(token, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkTotalRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams
        ): CompletableFuture<HttpResponseFor<NetworkTotalRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            token: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkTotalRetrieveResponse>> =
            retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals`, but is
         * otherwise the same as [NetworkTotalServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>> =
            list(ReportSettlementNetworkTotalListParams.none())

        /** @see [list] */
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>>

        /** @see [list] */
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none()
        ): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>> =
            list(ReportSettlementNetworkTotalListParams.none(), requestOptions)
    }
}
