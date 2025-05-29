// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardAggregateBalanceListPageAsync
import com.lithic.api.models.CardAggregateBalanceListParams
import java.util.concurrent.CompletableFuture

interface AggregateBalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the aggregated card balance across all end-user accounts. */
    fun list(): CompletableFuture<CardAggregateBalanceListPageAsync> =
        list(CardAggregateBalanceListParams.none())

    /** @see [list] */
    fun list(
        params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardAggregateBalanceListPageAsync>

    /** @see [list] */
    fun list(
        params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none()
    ): CompletableFuture<CardAggregateBalanceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardAggregateBalanceListPageAsync> =
        list(CardAggregateBalanceListParams.none(), requestOptions)

    /**
     * A view of [AggregateBalanceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/cards/aggregate_balances`, but is otherwise the
         * same as [AggregateBalanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardAggregateBalanceListPageAsync>> =
            list(CardAggregateBalanceListParams.none())

        /** @see [list] */
        fun list(
            params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardAggregateBalanceListPageAsync>>

        /** @see [list] */
        fun list(
            params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none()
        ): CompletableFuture<HttpResponseFor<CardAggregateBalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardAggregateBalanceListPageAsync>> =
            list(CardAggregateBalanceListParams.none(), requestOptions)
    }
}
