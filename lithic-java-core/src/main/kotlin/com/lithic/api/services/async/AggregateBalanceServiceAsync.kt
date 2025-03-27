// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.aggregatebalances.AggregateBalanceListPageAsync
import com.lithic.api.models.aggregatebalances.AggregateBalanceListParams
import java.util.concurrent.CompletableFuture

interface AggregateBalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the aggregated balance across all end-user accounts by financial account type */
    fun list(): CompletableFuture<AggregateBalanceListPageAsync> =
        list(AggregateBalanceListParams.none())

    /** @see [list] */
    fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregateBalanceListPageAsync>

    /** @see [list] */
    fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none()
    ): CompletableFuture<AggregateBalanceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AggregateBalanceListPageAsync> =
        list(AggregateBalanceListParams.none(), requestOptions)

    /**
     * A view of [AggregateBalanceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/aggregate_balances`, but is otherwise the same
         * as [AggregateBalanceServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AggregateBalanceListPageAsync>> =
            list(AggregateBalanceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregateBalanceListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AggregateBalanceListParams = AggregateBalanceListParams.none()
        ): CompletableFuture<HttpResponseFor<AggregateBalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AggregateBalanceListPageAsync>> =
            list(AggregateBalanceListParams.none(), requestOptions)
    }
}
