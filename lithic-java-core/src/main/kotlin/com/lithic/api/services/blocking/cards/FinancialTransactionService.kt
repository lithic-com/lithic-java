// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.cards.financialtransactions.FinancialTransactionListPage
import com.lithic.api.models.cards.financialtransactions.FinancialTransactionListParams
import com.lithic.api.models.cards.financialtransactions.FinancialTransactionRetrieveParams
import com.lithic.api.models.financialaccounts.FinancialTransaction

interface FinancialTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the card financial transaction for the provided token. */
    fun retrieve(params: FinancialTransactionRetrieveParams): FinancialTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction

    /** List the financial transactions for a given card. */
    fun list(params: FinancialTransactionListParams): FinancialTransactionListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransactionListPage

    /**
     * A view of [FinancialTransactionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/cards/{card_token}/financial_transactions/{financial_transaction_token}`, but is
         * otherwise the same as [FinancialTransactionService.retrieve].
         */
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
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/financial_transactions`, but
         * is otherwise the same as [FinancialTransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: FinancialTransactionListParams
        ): HttpResponseFor<FinancialTransactionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransactionListPage>
    }
}
