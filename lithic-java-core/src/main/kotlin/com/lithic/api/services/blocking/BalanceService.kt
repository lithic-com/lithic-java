// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.BalanceListPage
import com.lithic.api.models.BalanceListParams

interface BalanceService {

    /** Get the balances for a program, business, or a given end-user account */
    @JvmOverloads
    fun list(
        params: BalanceListParams = BalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceListPage

    /** Get the balances for a program, business, or a given end-user account */
    fun list(requestOptions: RequestOptions): BalanceListPage =
        list(BalanceListParams.none(), requestOptions)
}
