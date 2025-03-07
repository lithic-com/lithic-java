// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardAggregateBalanceListPage
import com.lithic.api.models.CardAggregateBalanceListParams

interface AggregateBalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the aggregated card balance across all end-user accounts. */
    fun list(): CardAggregateBalanceListPage = list(CardAggregateBalanceListParams.none())

    /** @see [list] */
    fun list(
        params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardAggregateBalanceListPage

    /** @see [list] */
    fun list(
        params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none()
    ): CardAggregateBalanceListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CardAggregateBalanceListPage =
        list(CardAggregateBalanceListParams.none(), requestOptions)

    /**
     * A view of [AggregateBalanceService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/cards/aggregate_balances`, but is otherwise the
         * same as [AggregateBalanceService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CardAggregateBalanceListPage> =
            list(CardAggregateBalanceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardAggregateBalanceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none()
        ): HttpResponseFor<CardAggregateBalanceListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardAggregateBalanceListPage> =
            list(CardAggregateBalanceListParams.none(), requestOptions)
    }
}
