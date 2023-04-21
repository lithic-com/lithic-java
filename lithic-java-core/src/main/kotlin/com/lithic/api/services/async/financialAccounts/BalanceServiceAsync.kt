@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountsBalanceListPageAsync
import com.lithic.api.models.FinancialAccountsBalanceListParams
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    /** Get the balances for a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialAccountsBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialAccountsBalanceListPageAsync>
}
