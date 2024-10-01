// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPage
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.services.blocking.financialAccounts.BalanceService
import com.lithic.api.services.blocking.financialAccounts.CreditConfigurationService
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService
import com.lithic.api.services.blocking.financialAccounts.LoanTapeService
import com.lithic.api.services.blocking.financialAccounts.StatementService

interface FinancialAccountService {

    fun balances(): BalanceService

    fun financialTransactions(): FinancialTransactionService

    fun creditConfiguration(): CreditConfigurationService

    fun statements(): StatementService

    fun loanTapes(): LoanTapeService

    /** Create a new financial account */
    @JvmOverloads
    fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccount

    /** Get a financial account */
    @JvmOverloads
    fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccount

    /** Update a financial account */
    @JvmOverloads
    fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccount

    /** Retrieve information on your financial accounts including routing and account number. */
    @JvmOverloads
    fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountListPage
}
