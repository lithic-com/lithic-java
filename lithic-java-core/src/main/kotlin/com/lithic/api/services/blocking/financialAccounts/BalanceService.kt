@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountsBalanceListPage
import com.lithic.api.models.FinancialAccountsBalanceListParams

interface BalanceService {

    /** Get the balances for a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialAccountsBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountsBalanceListPage
}
