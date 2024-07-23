// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountCreditConfigurationRetrieveParams
import com.lithic.api.models.FinancialAccountCreditConfigurationUpdateParams
import java.util.concurrent.CompletableFuture

interface CreditConfigurationServiceAsync {

    /** Get an Account's credit configuration */
    @JvmOverloads
    fun retrieve(
        params: FinancialAccountCreditConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialAccountCreditConfig>

    /** Update an account's credit configuration */
    @JvmOverloads
    fun update(
        params: FinancialAccountCreditConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FinancialAccountCreditConfig>
}
