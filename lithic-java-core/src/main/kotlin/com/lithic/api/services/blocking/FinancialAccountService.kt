@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountListPage
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.services.blocking.financialAccounts.BalanceService
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService

interface FinancialAccountService {

    fun balances(): BalanceService

    fun financialTransactions(): FinancialTransactionService

    /** Retrieve information on your financial accounts including routing and account number. */
    @JvmOverloads
    fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountListPage
}
