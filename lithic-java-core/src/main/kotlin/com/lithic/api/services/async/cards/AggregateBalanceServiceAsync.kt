// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.cards

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardAggregateBalanceListPageAsync
import com.lithic.api.models.CardAggregateBalanceListParams
import java.util.concurrent.CompletableFuture

interface AggregateBalanceServiceAsync {

    /** Get the aggregated card balance across all end-user accounts. */
    @JvmOverloads
    fun list(
        params: CardAggregateBalanceListParams = CardAggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardAggregateBalanceListPageAsync>

    /** Get the aggregated card balance across all end-user accounts. */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardAggregateBalanceListPageAsync> =
        list(CardAggregateBalanceListParams.none(), requestOptions)
}
