// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

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
    fun retrieve(
        financialTransactionToken: String,
        params: FinancialTransactionRetrieveParams,
    ): CompletableFuture<FinancialTransaction> =
        retrieve(financialTransactionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        financialTransactionToken: String,
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialTransaction> =
        retrieve(
            params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialTransactionRetrieveParams
    ): CompletableFuture<FinancialTransaction> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialTransaction>

    /** List the financial transactions for a given financial account. */
    fun list(financialAccountToken: String): CompletableFuture<FinancialTransactionListPageAsync> =
        list(financialAccountToken, FinancialTransactionListParams.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialTransactionListParams = FinancialTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialTransactionListPageAsync> =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialTransactionListParams = FinancialTransactionListParams.none(),
    ): CompletableFuture<FinancialTransactionListPageAsync> =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialTransactionListPageAsync>

    /** @see [list] */
    fun list(
        params: FinancialTransactionListParams
    ): CompletableFuture<FinancialTransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialTransactionListPageAsync> =
        list(financialAccountToken, FinancialTransactionListParams.none(), requestOptions)

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
        fun retrieve(
            financialTransactionToken: String,
            params: FinancialTransactionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>> =
            retrieve(financialTransactionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            financialTransactionToken: String,
            params: FinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>> =
            retrieve(
                params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            params: FinancialTransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: FinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/financial_transactions`, but is
         * otherwise the same as [FinancialTransactionServiceAsync.list].
         */
        fun list(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialTransactionListPageAsync>> =
            list(financialAccountToken, FinancialTransactionListParams.none())

        /** @see [list] */
        fun list(
            financialAccountToken: String,
            params: FinancialTransactionListParams = FinancialTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransactionListPageAsync>> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [list] */
        fun list(
            financialAccountToken: String,
            params: FinancialTransactionListParams = FinancialTransactionListParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransactionListPageAsync>> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: FinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransactionListPageAsync>>

        /** @see [list] */
        fun list(
            params: FinancialTransactionListParams
        ): CompletableFuture<HttpResponseFor<FinancialTransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialTransactionListPageAsync>> =
            list(financialAccountToken, FinancialTransactionListParams.none(), requestOptions)
    }
}
