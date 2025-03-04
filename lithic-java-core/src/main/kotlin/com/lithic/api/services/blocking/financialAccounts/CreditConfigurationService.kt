// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountCreditConfigurationRetrieveParams
import com.lithic.api.models.FinancialAccountCreditConfigurationUpdateParams

interface CreditConfigurationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get an Account's credit configuration */
    @JvmOverloads
    fun retrieve(
        params: FinancialAccountCreditConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig

    /** Update an account's credit configuration */
    @JvmOverloads
    fun update(
        params: FinancialAccountCreditConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig

    /**
     * A view of [CreditConfigurationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountCreditConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationService.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: FinancialAccountCreditConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig>
    }
}
