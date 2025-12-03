// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports.settlement

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkTotal
import com.lithic.api.models.ReportSettlementNetworkTotalListPageAsync
import com.lithic.api.models.ReportSettlementNetworkTotalListParams
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NetworkTotalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkTotalServiceAsync

    /** Retrieve a specific network total record by token. Not available in sandbox. */
    fun retrieve(token: String): CompletableFuture<NetworkTotal> =
        retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: ReportSettlementNetworkTotalRetrieveParams =
            ReportSettlementNetworkTotalRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkTotal> =
        retrieve(params.toBuilder().token(token).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        token: String,
        params: ReportSettlementNetworkTotalRetrieveParams =
            ReportSettlementNetworkTotalRetrieveParams.none(),
    ): CompletableFuture<NetworkTotal> = retrieve(token, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkTotal>

    /** @see retrieve */
    fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams
    ): CompletableFuture<NetworkTotal> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(token: String, requestOptions: RequestOptions): CompletableFuture<NetworkTotal> =
        retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

    /** List network total records with optional filters. Not available in sandbox. */
    fun list(): CompletableFuture<ReportSettlementNetworkTotalListPageAsync> =
        list(ReportSettlementNetworkTotalListParams.none())

    /** @see list */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ReportSettlementNetworkTotalListPageAsync>

    /** @see list */
    fun list(
        params: ReportSettlementNetworkTotalListParams =
            ReportSettlementNetworkTotalListParams.none()
    ): CompletableFuture<ReportSettlementNetworkTotalListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkTotalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals/{token}`, but
         * is otherwise the same as [NetworkTotalServiceAsync.retrieve].
         */
        fun retrieve(token: String): CompletableFuture<HttpResponseFor<NetworkTotal>> =
            retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            token: String,
            params: ReportSettlementNetworkTotalRetrieveParams =
                ReportSettlementNetworkTotalRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkTotal>> =
            retrieve(params.toBuilder().token(token).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            token: String,
            params: ReportSettlementNetworkTotalRetrieveParams =
                ReportSettlementNetworkTotalRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NetworkTotal>> =
            retrieve(token, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkTotal>>

        /** @see retrieve */
        fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams
        ): CompletableFuture<HttpResponseFor<NetworkTotal>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            token: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkTotal>> =
            retrieve(token, ReportSettlementNetworkTotalRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/reports/settlement/network_totals`, but is
         * otherwise the same as [NetworkTotalServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>> =
            list(ReportSettlementNetworkTotalListParams.none())

        /** @see list */
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>>

        /** @see list */
        fun list(
            params: ReportSettlementNetworkTotalListParams =
                ReportSettlementNetworkTotalListParams.none()
        ): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>> =
            list(ReportSettlementNetworkTotalListParams.none(), requestOptions)
    }
}
