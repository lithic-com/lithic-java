// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AggregateBalanceListPage
import com.lithic.api.models.AggregateBalanceListParams

interface AggregateBalanceService {

    /** Get the aggregated balance across all end-user accounts by financial account type */
    @JvmOverloads
    fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregateBalanceListPage

    /** Get the aggregated balance across all end-user accounts by financial account type */
    fun list(requestOptions: RequestOptions): AggregateBalanceListPage =
        list(AggregateBalanceListParams.none(), requestOptions)
}
