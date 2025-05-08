// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialTransaction
import com.lithic.api.models.FinancialTransactionListPage
import com.lithic.api.models.FinancialTransactionListParams
import com.lithic.api.models.FinancialTransactionRetrieveParams

interface FinancialTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the financial transaction for the provided token. */
    fun retrieve(
        financialTransactionToken: String,
        params: FinancialTransactionRetrieveParams,
    ): FinancialTransaction = retrieve(financialTransactionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        financialTransactionToken: String,
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction =
        retrieve(
            params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(params: FinancialTransactionRetrieveParams): FinancialTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction

    /** List the financial transactions for a given financial account. */
    fun list(financialAccountToken: String): FinancialTransactionListPage =
        list(financialAccountToken, FinancialTransactionListParams.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialTransactionListParams = FinancialTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransactionListPage =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialTransactionListParams = FinancialTransactionListParams.none(),
    ): FinancialTransactionListPage = list(financialAccountToken, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransactionListPage

    /** @see [list] */
    fun list(params: FinancialTransactionListParams): FinancialTransactionListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialTransactionListPage =
        list(financialAccountToken, FinancialTransactionListParams.none(), requestOptions)

    /**
     * A view of [FinancialTransactionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/financial_transactions/{financial_transaction_token}`,
         * but is otherwise the same as [FinancialTransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            financialTransactionToken: String,
            params: FinancialTransactionRetrieveParams,
        ): HttpResponseFor<FinancialTransaction> =
            retrieve(financialTransactionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            financialTransactionToken: String,
            params: FinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction> =
            retrieve(
                params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FinancialTransactionRetrieveParams
        ): HttpResponseFor<FinancialTransaction> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/financial_transactions`, but is
         * otherwise the same as [FinancialTransactionService.list].
         */
        @MustBeClosed
        fun list(financialAccountToken: String): HttpResponseFor<FinancialTransactionListPage> =
            list(financialAccountToken, FinancialTransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialTransactionListParams = FinancialTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransactionListPage> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialTransactionListParams = FinancialTransactionListParams.none(),
        ): HttpResponseFor<FinancialTransactionListPage> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialTransactionListParams
        ): HttpResponseFor<FinancialTransactionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialTransactionListPage> =
            list(financialAccountToken, FinancialTransactionListParams.none(), requestOptions)
    }
}
