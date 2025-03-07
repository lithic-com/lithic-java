// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardFinancialTransactionListPage
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction

interface FinancialTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the card financial transaction for the provided token. */
    fun retrieve(params: CardFinancialTransactionRetrieveParams): FinancialTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction

    /** List the financial transactions for a given card. */
    fun list(params: CardFinancialTransactionListParams): CardFinancialTransactionListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardFinancialTransactionListPage

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
            params: CardFinancialTransactionRetrieveParams
        ): HttpResponseFor<FinancialTransaction> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/financial_transactions`, but
         * is otherwise the same as [FinancialTransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: CardFinancialTransactionListParams
        ): HttpResponseFor<CardFinancialTransactionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardFinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardFinancialTransactionListPage>
    }
}
