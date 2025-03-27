// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.cards.aggregatebalances.AggregateBalanceListPage
import com.lithic.api.models.cards.aggregatebalances.AggregateBalanceListParams

interface AggregateBalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the aggregated card balance across all end-user accounts. */
    fun list(): AggregateBalanceListPage = list(AggregateBalanceListParams.none())

    /** @see [list] */
    fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregateBalanceListPage

    /** @see [list] */
    fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none()
    ): AggregateBalanceListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AggregateBalanceListPage =
        list(AggregateBalanceListParams.none(), requestOptions)

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
        fun list(): HttpResponseFor<AggregateBalanceListPage> =
            list(AggregateBalanceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregateBalanceListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AggregateBalanceListParams = AggregateBalanceListParams.none()
        ): HttpResponseFor<AggregateBalanceListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AggregateBalanceListPage> =
            list(AggregateBalanceListParams.none(), requestOptions)
    }
}
