// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.financialaccounts.FinancialAccount
import com.lithic.api.models.financialaccounts.FinancialAccountChargeOffParams
import com.lithic.api.models.financialaccounts.FinancialAccountCreateParams
import com.lithic.api.models.financialaccounts.FinancialAccountListPage
import com.lithic.api.models.financialaccounts.FinancialAccountListParams
import com.lithic.api.models.financialaccounts.FinancialAccountRetrieveParams
import com.lithic.api.models.financialaccounts.FinancialAccountUpdateParams
import com.lithic.api.models.financialaccounts.creditconfiguration.FinancialAccountCreditConfig
import com.lithic.api.services.blocking.financialaccounts.BalanceService
import com.lithic.api.services.blocking.financialaccounts.CreditConfigurationService
import com.lithic.api.services.blocking.financialaccounts.FinancialTransactionService
import com.lithic.api.services.blocking.financialaccounts.LoanTapeService
import com.lithic.api.services.blocking.financialaccounts.StatementService

interface FinancialAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun balances(): BalanceService

    fun financialTransactions(): FinancialTransactionService

    fun creditConfiguration(): CreditConfigurationService

    fun statements(): StatementService

    fun loanTapes(): LoanTapeService

    /** Create a new financial account */
    fun create(params: FinancialAccountCreateParams): FinancialAccount =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: FinancialAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** Get a financial account */
    fun retrieve(params: FinancialAccountRetrieveParams): FinancialAccount =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** Update a financial account */
    fun update(params: FinancialAccountUpdateParams): FinancialAccount =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: FinancialAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccount

    /** Retrieve information on your financial accounts including routing and account number. */
    fun list(): FinancialAccountListPage = list(FinancialAccountListParams.none())

    /** @see [list] */
    fun list(
        params: FinancialAccountListParams = FinancialAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountListPage

    /** @see [list] */
    fun list(
        params: FinancialAccountListParams = FinancialAccountListParams.none()
    ): FinancialAccountListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): FinancialAccountListPage =
        list(FinancialAccountListParams.none(), requestOptions)

    /** Update issuing account state to charged off */
    fun chargeOff(params: FinancialAccountChargeOffParams): FinancialAccountCreditConfig =
        chargeOff(params, RequestOptions.none())

    /** @see [chargeOff] */
    fun chargeOff(
        params: FinancialAccountChargeOffParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountCreditConfig

    /**
     * A view of [FinancialAccountService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun balances(): BalanceService.WithRawResponse

        fun financialTransactions(): FinancialTransactionService.WithRawResponse

        fun creditConfiguration(): CreditConfigurationService.WithRawResponse

        fun statements(): StatementService.WithRawResponse

        fun loanTapes(): LoanTapeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountService.create].
         */
        @MustBeClosed
        fun create(params: FinancialAccountCreateParams): HttpResponseFor<FinancialAccount> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: FinancialAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: FinancialAccountRetrieveParams): HttpResponseFor<FinancialAccount> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /**
         * Returns a raw HTTP response for `patch /v1/financial_accounts/{financial_account_token}`,
         * but is otherwise the same as [FinancialAccountService.update].
         */
        @MustBeClosed
        fun update(params: FinancialAccountUpdateParams): HttpResponseFor<FinancialAccount> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: FinancialAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccount>

        /**
         * Returns a raw HTTP response for `get /v1/financial_accounts`, but is otherwise the same
         * as [FinancialAccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<FinancialAccountListPage> =
            list(FinancialAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountListParams = FinancialAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountListParams = FinancialAccountListParams.none()
        ): HttpResponseFor<FinancialAccountListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FinancialAccountListPage> =
            list(FinancialAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/charge_off`, but is otherwise the same
         * as [FinancialAccountService.chargeOff].
         */
        @MustBeClosed
        fun chargeOff(
            params: FinancialAccountChargeOffParams
        ): HttpResponseFor<FinancialAccountCreditConfig> = chargeOff(params, RequestOptions.none())

        /** @see [chargeOff] */
        @MustBeClosed
        fun chargeOff(
            params: FinancialAccountChargeOffParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountCreditConfig>
    }
}
