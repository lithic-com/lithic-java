@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountsFinancialTransactionListPageAsync
import com.lithic.api.models.FinancialAccountsFinancialTransactionListParams
import com.lithic.api.models.FinancialAccountsFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction
import java.util.concurrent.CompletableFuture

interface FinancialTransactionServiceAsync {

    /** Get the financial transaction for the provided token. */
    @JvmOverloads
    fun retrieve(
        params: FinancialAccountsFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialTransaction>

    /** List the financial transactions for a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialAccountsFinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialAccountsFinancialTransactionListPageAsync>
}
