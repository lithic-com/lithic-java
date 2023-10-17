// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.cards

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardAggregateBalanceListPage
import com.lithic.api.models.CardAggregateBalanceListParams

interface AggregateBalanceService {

    /** Get the aggregated card balance across all end-user accounts. */
    @JvmOverloads
    fun list(
        params: CardAggregateBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardAggregateBalanceListPage
}
