// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import java.util.concurrent.CompletableFuture

interface FinancialAccountServiceAsync {

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    fun statements(): StatementServiceAsync

    /** Create a new financial account */
    @JvmOverloads
    fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialAccount>

    /** Get a financial account */
    @JvmOverloads
    fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialAccount>

    /** Update a financial account */
    @JvmOverloads
    fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialAccount>

    /** Retrieve information on your financial accounts including routing and account number. */
    @JvmOverloads
    fun list(
        params: FinancialAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialAccountListPageAsync>
}
