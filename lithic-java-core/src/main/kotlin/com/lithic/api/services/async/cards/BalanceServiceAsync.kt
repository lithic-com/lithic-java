// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardBalanceListPageAsync
import com.lithic.api.models.CardBalanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync

    /** Get the balances for a given card. */
    fun list(cardToken: String): CompletableFuture<CardBalanceListPageAsync> =
        list(cardToken, CardBalanceListParams.none())

    /** @see list */
    fun list(
        cardToken: String,
        params: CardBalanceListParams = CardBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBalanceListPageAsync> =
        list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see list */
    fun list(
        cardToken: String,
        params: CardBalanceListParams = CardBalanceListParams.none(),
    ): CompletableFuture<CardBalanceListPageAsync> = list(cardToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CardBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBalanceListPageAsync>

    /** @see list */
    fun list(params: CardBalanceListParams): CompletableFuture<CardBalanceListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/balances`, but is otherwise
         * the same as [BalanceServiceAsync.list].
         */
        fun list(cardToken: String): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(cardToken, CardBalanceListParams.none())

        /** @see list */
        fun list(
            cardToken: String,
            params: CardBalanceListParams = CardBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see list */
        fun list(
            cardToken: String,
            params: CardBalanceListParams = CardBalanceListParams.none(),
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(cardToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CardBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>>

        /** @see list */
        fun list(
            params: CardBalanceListParams
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            cardToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardBalanceListPageAsync>> =
            list(cardToken, CardBalanceListParams.none(), requestOptions)
    }
}
