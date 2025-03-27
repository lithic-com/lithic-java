// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.cards.balances.BalanceListPageAsync
import com.lithic.api.models.cards.balances.BalanceListParams
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a given card. */
    fun list(params: BalanceListParams): CompletableFuture<BalanceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceListPageAsync>

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/balances`, but is otherwise
         * the same as [BalanceServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: BalanceListParams
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>>
    }
}
