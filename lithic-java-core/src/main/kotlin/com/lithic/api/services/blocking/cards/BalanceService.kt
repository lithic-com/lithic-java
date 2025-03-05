// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardBalanceListPage
import com.lithic.api.models.CardBalanceListParams

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a given card. */
    @JvmOverloads
    fun list(
        params: CardBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBalanceListPage

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/balances`, but is otherwise
         * the same as [BalanceService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: CardBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBalanceListPage>
    }
}
