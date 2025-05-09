// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardBalanceListPageAsync
import com.lithic.api.models.CardBalanceListParams
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a given card. */
    fun list(cardToken: String): CompletableFuture<CardBalanceListPageAsync> =
        list(cardToken, CardBalanceListParams.none())

    /** @see [list] */
    fun list(
        cardToken: String,
        params: CardBalanceListParams = CardBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBalanceListPageAsync> =
        list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [list] */
    fun list(
        cardToken: String,
        params: CardBalanceListParams = CardBalanceListParams.none(),
    ): CompletableFuture<CardBalanceListPageAsync> = list(cardToken, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CardBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBalanceListPageAsync>

    /** @see [list] */
    fun list(params: CardBalanceListParams): CompletableFuture<CardBalanceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        cardToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardBalanceListPageAsync> =
        list(cardToken, CardBalanceListParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/balances`, but is otherwise
         * the same as [BalanceServiceAsync.list].
         */
        @MustBeClosed
        fun list(cardToken: String): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(cardToken, CardBalanceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            cardToken: String,
            params: CardBalanceListParams = CardBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            cardToken: String,
            params: CardBalanceListParams = CardBalanceListParams.none(),
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(cardToken, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardBalanceListParams
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            cardToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(cardToken, CardBalanceListParams.none(), requestOptions)
    }
}
