// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountLoanTapeConfigurationRetrieveParams
import com.lithic.api.models.LoanTapeConfiguration
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LoanTapeConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LoanTapeConfigurationServiceAsync

    /** Get the loan tape configuration for a given financial account. */
    fun retrieve(financialAccountToken: String): CompletableFuture<LoanTapeConfiguration> =
        retrieve(financialAccountToken, FinancialAccountLoanTapeConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountLoanTapeConfigurationRetrieveParams =
            FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoanTapeConfiguration> =
        retrieve(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountLoanTapeConfigurationRetrieveParams =
            FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
    ): CompletableFuture<LoanTapeConfiguration> =
        retrieve(financialAccountToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountLoanTapeConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoanTapeConfiguration>

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountLoanTapeConfigurationRetrieveParams
    ): CompletableFuture<LoanTapeConfiguration> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<LoanTapeConfiguration> =
        retrieve(
            financialAccountToken,
            FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [LoanTapeConfigurationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LoanTapeConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tape_configuration`, but is
         * otherwise the same as [LoanTapeConfigurationServiceAsync.retrieve].
         */
        fun retrieve(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<LoanTapeConfiguration>> =
            retrieve(
                financialAccountToken,
                FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
            )

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountLoanTapeConfigurationRetrieveParams =
                FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoanTapeConfiguration>> =
            retrieve(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountLoanTapeConfigurationRetrieveParams =
                FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<LoanTapeConfiguration>> =
            retrieve(financialAccountToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountLoanTapeConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoanTapeConfiguration>>

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountLoanTapeConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<LoanTapeConfiguration>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LoanTapeConfiguration>> =
            retrieve(
                financialAccountToken,
                FinancialAccountLoanTapeConfigurationRetrieveParams.none(),
                requestOptions,
            )
    }
}
