// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountChargeOffParams
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.CreditConfigurationServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsync
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import java.util.concurrent.CompletableFuture

interface FinancialAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    fun creditConfiguration(): CreditConfigurationServiceAsync

    fun statements(): StatementServiceAsync

    fun loanTapes(): LoanTapeServiceAsync

    /** Create a new financial account */
    fun create(params: FinancialAccountCreateParams): CompletableFuture<FinancialAccount> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount>

    /** Get a financial account */
    fun retrieve(params: FinancialAccountRetrieveParams): CompletableFuture<FinancialAccount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount>

    /** Update a financial account */
    fun update(params: FinancialAccountUpdateParams): CompletableFuture<FinancialAccount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount>

    /** Retrieve information on your financial accounts including routing and account number. */
    fun list(): CompletableFuture<FinancialAccountListPageAsync> =
        list(FinancialAccountListParams.none())

    /** @see [list] */
    fun list(
        params: FinancialAccountListParams = FinancialAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountListPageAsync>

    /** @see [list] */
    fun list(
        params: FinancialAccountListParams = FinancialAccountListParams.none()
    ): CompletableFuture<FinancialAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<FinancialAccountListPageAsync> =
        list(FinancialAccountListParams.none(), requestOptions)

    /** Update issuing account state to charged off */
    fun chargeOff(
        params: FinancialAccountChargeOffParams
    ): CompletableFuture<FinancialAccountCreditConfig> = chargeOff(params, RequestOptions.none())

    /** @see [chargeOff] */
    fun chargeOff(
        params: FinancialAccountChargeOffParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountCreditConfig>

    /**
     * A view of [FinancialAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun balances(): BalanceServiceAsync.WithRawResponse

        fun financialTransactions(): FinancialTransactionServiceAsync.WithRawResponse

        fun creditConfiguration(): CreditConfigurationServiceAsync.WithRawResponse

        fun statements(): StatementServiceAsync.WithRawResponse

        fun loanTapes(): LoanTapeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: FinancialAccountCreateParams
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: FinancialAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>>

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>>

        /**
         * Returns a raw HTTP response for `patch /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: FinancialAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: FinancialAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>>

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>> =
            list(FinancialAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountListParams = FinancialAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountListParams = FinancialAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>> =
            list(FinancialAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/charge_off`, but is otherwise the same
         * as [FinancialAccountServiceAsync.chargeOff].
         */
        @MustBeClosed
        fun chargeOff(
            params: FinancialAccountChargeOffParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            chargeOff(params, RequestOptions.none())

        /** @see [chargeOff] */
        @MustBeClosed
        fun chargeOff(
            params: FinancialAccountChargeOffParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>>
    }
}
