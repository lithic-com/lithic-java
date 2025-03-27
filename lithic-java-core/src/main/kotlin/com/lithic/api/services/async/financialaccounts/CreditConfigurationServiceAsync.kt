// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.financialaccounts.creditconfiguration.CreditConfigurationRetrieveParams
import com.lithic.api.models.financialaccounts.creditconfiguration.CreditConfigurationUpdateParams
import com.lithic.api.models.financialaccounts.creditconfiguration.FinancialAccountCreditConfig
import java.util.concurrent.CompletableFuture

interface CreditConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get an Account's credit configuration */
    fun retrieve(
        params: CreditConfigurationRetrieveParams
    ): CompletableFuture<FinancialAccountCreditConfig> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountCreditConfig>

    /** Update an account's credit configuration */
    fun update(
        params: CreditConfigurationUpdateParams
    ): CompletableFuture<FinancialAccountCreditConfig> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CreditConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountCreditConfig>

    /**
     * A view of [CreditConfigurationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CreditConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: CreditConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CreditConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>>
    }
}
