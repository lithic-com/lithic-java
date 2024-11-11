// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.BalanceListPageAsync
import com.lithic.api.models.BalanceListParams
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    /** Get the balances for a program, business, or a given end-user account */
    @JvmOverloads
    fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BalanceListPageAsync>
}
