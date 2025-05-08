// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountBalanceListPageAsync
import com.lithic.api.models.FinancialAccountBalanceListParams
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a given financial account. */
    fun list(
        financialAccountToken: String
    ): CompletableFuture<FinancialAccountBalanceListPageAsync> =
        list(financialAccountToken, FinancialAccountBalanceListParams.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountBalanceListPageAsync> =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
    ): CompletableFuture<FinancialAccountBalanceListPageAsync> =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FinancialAccountBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountBalanceListPageAsync>

    /** @see [list] */
    fun list(
        params: FinancialAccountBalanceListParams
    ): CompletableFuture<FinancialAccountBalanceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountBalanceListPageAsync> =
        list(financialAccountToken, FinancialAccountBalanceListParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/balances`, but is otherwise the same as
         * [BalanceServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(financialAccountToken, FinancialAccountBalanceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountBalanceListParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(financialAccountToken, FinancialAccountBalanceListParams.none(), requestOptions)
    }
}
