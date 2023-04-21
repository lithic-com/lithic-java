@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountsFinancialTransactionListPage
import com.lithic.api.models.FinancialAccountsFinancialTransactionListParams
import com.lithic.api.models.FinancialAccountsFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction

interface FinancialTransactionService {

    /** Get the financial transaction for the provided token. */
    @JvmOverloads
    fun retrieve(
        params: FinancialAccountsFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialTransaction

    /** List the financial transactions for a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialAccountsFinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountsFinancialTransactionListPage
}
