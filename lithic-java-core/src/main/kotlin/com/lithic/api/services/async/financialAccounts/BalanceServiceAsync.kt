// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountBalanceListPageAsync
import com.lithic.api.models.FinancialAccountBalanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/balances`, but is otherwise the same as
         * [BalanceServiceAsync.list].
         */
        fun list(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(financialAccountToken, FinancialAccountBalanceListParams.none())

        /** @see [list] */
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
        fun list(
            financialAccountToken: String,
            params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: FinancialAccountBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>>

        /** @see [list] */
        fun list(
            params: FinancialAccountBalanceListParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> =
            list(financialAccountToken, FinancialAccountBalanceListParams.none(), requestOptions)
    }
}
