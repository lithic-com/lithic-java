// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccount
import com.lithic.api.models.FinancialAccountCreateParams
import com.lithic.api.models.FinancialAccountListPageAsync
import com.lithic.api.models.FinancialAccountListParams
import com.lithic.api.models.FinancialAccountRegisterAccountNumberParams
import com.lithic.api.models.FinancialAccountRetrieveParams
import com.lithic.api.models.FinancialAccountUpdateParams
import com.lithic.api.models.FinancialAccountUpdateStatusParams
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import com.lithic.api.services.async.financialAccounts.CreditConfigurationServiceAsync
import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsync
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FinancialAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FinancialAccountServiceAsync

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
    fun retrieve(financialAccountToken: String): CompletableFuture<FinancialAccount> =
        retrieve(financialAccountToken, FinancialAccountRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountRetrieveParams = FinancialAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount> =
        retrieve(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountRetrieveParams = FinancialAccountRetrieveParams.none(),
    ): CompletableFuture<FinancialAccount> =
        retrieve(financialAccountToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount>

    /** @see [retrieve] */
    fun retrieve(params: FinancialAccountRetrieveParams): CompletableFuture<FinancialAccount> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccount> =
        retrieve(financialAccountToken, FinancialAccountRetrieveParams.none(), requestOptions)

    /** Update a financial account */
    fun update(financialAccountToken: String): CompletableFuture<FinancialAccount> =
        update(financialAccountToken, FinancialAccountUpdateParams.none())

    /** @see [update] */
    fun update(
        financialAccountToken: String,
        params: FinancialAccountUpdateParams = FinancialAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount> =
        update(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [update] */
    fun update(
        financialAccountToken: String,
        params: FinancialAccountUpdateParams = FinancialAccountUpdateParams.none(),
    ): CompletableFuture<FinancialAccount> =
        update(financialAccountToken, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount>

    /** @see [update] */
    fun update(params: FinancialAccountUpdateParams): CompletableFuture<FinancialAccount> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccount> =
        update(financialAccountToken, FinancialAccountUpdateParams.none(), requestOptions)

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

    /** Register account number */
    fun registerAccountNumber(
        financialAccountToken: String,
        params: FinancialAccountRegisterAccountNumberParams,
    ): CompletableFuture<Void?> =
        registerAccountNumber(financialAccountToken, params, RequestOptions.none())

    /** @see [registerAccountNumber] */
    fun registerAccountNumber(
        financialAccountToken: String,
        params: FinancialAccountRegisterAccountNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        registerAccountNumber(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [registerAccountNumber] */
    fun registerAccountNumber(
        params: FinancialAccountRegisterAccountNumberParams
    ): CompletableFuture<Void?> = registerAccountNumber(params, RequestOptions.none())

    /** @see [registerAccountNumber] */
    fun registerAccountNumber(
        params: FinancialAccountRegisterAccountNumberParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Update financial account status */
    fun updateStatus(
        financialAccountToken: String,
        params: FinancialAccountUpdateStatusParams,
    ): CompletableFuture<FinancialAccount> =
        updateStatus(financialAccountToken, params, RequestOptions.none())

    /** @see [updateStatus] */
    fun updateStatus(
        financialAccountToken: String,
        params: FinancialAccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount> =
        updateStatus(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [updateStatus] */
    fun updateStatus(
        params: FinancialAccountUpdateStatusParams
    ): CompletableFuture<FinancialAccount> = updateStatus(params, RequestOptions.none())

    /** @see [updateStatus] */
    fun updateStatus(
        params: FinancialAccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccount>

    /**
     * A view of [FinancialAccountServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FinancialAccountServiceAsync.WithRawResponse

        fun balances(): BalanceServiceAsync.WithRawResponse

        fun financialTransactions(): FinancialTransactionServiceAsync.WithRawResponse

        fun creditConfiguration(): CreditConfigurationServiceAsync.WithRawResponse

        fun statements(): StatementServiceAsync.WithRawResponse

        fun loanTapes(): LoanTapeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountServiceAsync.create].
         */
        fun create(
            params: FinancialAccountCreateParams
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: FinancialAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>>

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountServiceAsync.retrieve].
         */
        fun retrieve(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            retrieve(financialAccountToken, FinancialAccountRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountRetrieveParams = FinancialAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            retrieve(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountRetrieveParams = FinancialAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            retrieve(financialAccountToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: FinancialAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>>

        /** @see [retrieve] */
        fun retrieve(
            params: FinancialAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            retrieve(financialAccountToken, FinancialAccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountServiceAsync.update].
         */
        fun update(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            update(financialAccountToken, FinancialAccountUpdateParams.none())

        /** @see [update] */
        fun update(
            financialAccountToken: String,
            params: FinancialAccountUpdateParams = FinancialAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            update(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [update] */
        fun update(
            financialAccountToken: String,
            params: FinancialAccountUpdateParams = FinancialAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            update(financialAccountToken, params, RequestOptions.none())

        /** @see [update] */
        fun update(
            params: FinancialAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>>

        /** @see [update] */
        fun update(
            params: FinancialAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        fun update(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            update(financialAccountToken, FinancialAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>> =
            list(FinancialAccountListParams.none())

        /** @see [list] */
        fun list(
            params: FinancialAccountListParams = FinancialAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>>

        /** @see [list] */
        fun list(
            params: FinancialAccountListParams = FinancialAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<FinancialAccountListPageAsync>> =
            list(FinancialAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/register_account_number`, but is
         * otherwise the same as [FinancialAccountServiceAsync.registerAccountNumber].
         */
        fun registerAccountNumber(
            financialAccountToken: String,
            params: FinancialAccountRegisterAccountNumberParams,
        ): CompletableFuture<HttpResponse> =
            registerAccountNumber(financialAccountToken, params, RequestOptions.none())

        /** @see [registerAccountNumber] */
        fun registerAccountNumber(
            financialAccountToken: String,
            params: FinancialAccountRegisterAccountNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            registerAccountNumber(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [registerAccountNumber] */
        fun registerAccountNumber(
            params: FinancialAccountRegisterAccountNumberParams
        ): CompletableFuture<HttpResponse> = registerAccountNumber(params, RequestOptions.none())

        /** @see [registerAccountNumber] */
        fun registerAccountNumber(
            params: FinancialAccountRegisterAccountNumberParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/update_status`, but is otherwise the
         * same as [FinancialAccountServiceAsync.updateStatus].
         */
        fun updateStatus(
            financialAccountToken: String,
            params: FinancialAccountUpdateStatusParams,
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            updateStatus(financialAccountToken, params, RequestOptions.none())

        /** @see [updateStatus] */
        fun updateStatus(
            financialAccountToken: String,
            params: FinancialAccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            updateStatus(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [updateStatus] */
        fun updateStatus(
            params: FinancialAccountUpdateStatusParams
        ): CompletableFuture<HttpResponseFor<FinancialAccount>> =
            updateStatus(params, RequestOptions.none())

        /** @see [updateStatus] */
        fun updateStatus(
            params: FinancialAccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccount>>
    }
}
