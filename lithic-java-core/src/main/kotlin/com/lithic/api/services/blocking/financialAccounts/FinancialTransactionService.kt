@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialTransaction
import com.lithic.api.models.FinancialTransactionListPage
import com.lithic.api.models.FinancialTransactionListParams
import com.lithic.api.models.FinancialTransactionRetrieveParams

interface FinancialTransactionService {

    /** Get the financial transaction for the provided token. */
    @JvmOverloads
    fun retrieve(
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialTransaction

    /** List the financial transactions for a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialTransactionListPage
}
