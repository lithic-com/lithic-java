// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardBalanceListPage
import com.lithic.api.models.CardBalanceListParams
import java.util.function.Consumer

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService

    /** Get the balances for a given card. */
    fun list(cardToken: String): CardBalanceListPage = list(cardToken, CardBalanceListParams.none())

    /** @see list */
    fun list(
        cardToken: String,
        params: CardBalanceListParams = CardBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBalanceListPage = list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see list */
    fun list(
        cardToken: String,
        params: CardBalanceListParams = CardBalanceListParams.none(),
    ): CardBalanceListPage = list(cardToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CardBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBalanceListPage

    /** @see list */
    fun list(params: CardBalanceListParams): CardBalanceListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(cardToken: String, requestOptions: RequestOptions): CardBalanceListPage =
        list(cardToken, CardBalanceListParams.none(), requestOptions)

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/balances`, but is otherwise
         * the same as [BalanceService.list].
         */
        @MustBeClosed
        fun list(cardToken: String): HttpResponseFor<CardBalanceListPage> =
            list(cardToken, CardBalanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            cardToken: String,
            params: CardBalanceListParams = CardBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBalanceListPage> =
            list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            cardToken: String,
            params: CardBalanceListParams = CardBalanceListParams.none(),
        ): HttpResponseFor<CardBalanceListPage> = list(cardToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBalanceListPage>

        /** @see list */
        @MustBeClosed
        fun list(params: CardBalanceListParams): HttpResponseFor<CardBalanceListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardBalanceListPage> =
            list(cardToken, CardBalanceListParams.none(), requestOptions)
    }
}
