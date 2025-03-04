// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun list(
        params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardAggregateBalanceListPage

    /** Get the aggregated card balance across all end-user accounts. */
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
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardAggregateBalanceListPage>

        /**
         * Returns a raw HTTP response for `get /v1/cards/aggregate_balances`, but is otherwise the
         * same as [AggregateBalanceService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardAggregateBalanceListPage> =
            list(CardAggregateBalanceListParams.none(), requestOptions)
    }
}
