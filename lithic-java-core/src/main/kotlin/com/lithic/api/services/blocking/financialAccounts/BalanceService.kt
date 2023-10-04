// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountBalanceListPage
import com.lithic.api.models.FinancialAccountBalanceListParams

interface BalanceService {

    /** Get the balances for a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialAccountBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountBalanceListPage
}
