// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialTransaction
import com.lithic.api.models.FinancialTransactionListPageAsync
import com.lithic.api.models.FinancialTransactionListParams
import com.lithic.api.models.FinancialTransactionRetrieveParams
import java.util.concurrent.CompletableFuture

interface FinancialTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the financial transaction for the provided token. */
    @JvmOverloads
    fun retrieve(
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialTransaction>

    /** List the financial transactions for a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialTransactionListPageAsync>

    /**
     * A view of [FinancialTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/financial_transactions/{financial_transaction_token}`,
         * but is otherwise the same as [FinancialTransactionServiceAsync.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: FinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/financial_transactions`, but is
         * otherwise the same as [FinancialTransactionServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: FinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransactionListPageAsync>>
    }
}
