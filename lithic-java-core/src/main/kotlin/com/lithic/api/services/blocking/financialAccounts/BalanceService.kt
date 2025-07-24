// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountBalanceListPage
import com.lithic.api.models.FinancialAccountBalanceListParams
import java.util.function.Consumer

interface BalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService

    /** Get the balances for a given financial account. */
    fun list(financialAccountToken: String): FinancialAccountBalanceListPage =
        list(financialAccountToken, FinancialAccountBalanceListParams.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountBalanceListPage =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
    ): FinancialAccountBalanceListPage = list(financialAccountToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FinancialAccountBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountBalanceListPage

    /** @see list */
    fun list(params: FinancialAccountBalanceListParams): FinancialAccountBalanceListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountBalanceListPage =
        list(financialAccountToken, FinancialAccountBalanceListParams.none(), requestOptions)

    /** A view of [BalanceService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/balances`, but is otherwise the same as
         * [BalanceService.list].
         */
        @MustBeClosed
        fun list(financialAccountToken: String): HttpResponseFor<FinancialAccountBalanceListPage> =
            list(financialAccountToken, FinancialAccountBalanceListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountBalanceListPage> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountBalanceListParams = FinancialAccountBalanceListParams.none(),
        ): HttpResponseFor<FinancialAccountBalanceListPage> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountBalanceListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountBalanceListParams
        ): HttpResponseFor<FinancialAccountBalanceListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountBalanceListPage> =
            list(financialAccountToken, FinancialAccountBalanceListParams.none(), requestOptions)
    }
}
