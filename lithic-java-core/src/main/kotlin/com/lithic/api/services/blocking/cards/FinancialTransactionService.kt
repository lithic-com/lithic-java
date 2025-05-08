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
    fun retrieve(
        financialTransactionToken: String,
        params: CardFinancialTransactionRetrieveParams,
    ): FinancialTransaction = retrieve(financialTransactionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        financialTransactionToken: String,
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction =
        retrieve(
            params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(params: CardFinancialTransactionRetrieveParams): FinancialTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialTransaction

    /** List the financial transactions for a given card. */
    fun list(cardToken: String): CardFinancialTransactionListPage =
        list(cardToken, CardFinancialTransactionListParams.none())

    /** @see [list] */
    fun list(
        cardToken: String,
        params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardFinancialTransactionListPage =
        list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see [list] */
    fun list(
        cardToken: String,
        params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
    ): CardFinancialTransactionListPage = list(cardToken, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardFinancialTransactionListPage

    /** @see [list] */
    fun list(params: CardFinancialTransactionListParams): CardFinancialTransactionListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(cardToken: String, requestOptions: RequestOptions): CardFinancialTransactionListPage =
        list(cardToken, CardFinancialTransactionListParams.none(), requestOptions)

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
            financialTransactionToken: String,
            params: CardFinancialTransactionRetrieveParams,
        ): HttpResponseFor<FinancialTransaction> =
            retrieve(financialTransactionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            financialTransactionToken: String,
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialTransaction> =
            retrieve(
                params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
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
        fun list(cardToken: String): HttpResponseFor<CardFinancialTransactionListPage> =
            list(cardToken, CardFinancialTransactionListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            cardToken: String,
            params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardFinancialTransactionListPage> =
            list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see [list] */
        @MustBeClosed
        fun list(
            cardToken: String,
            params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
        ): HttpResponseFor<CardFinancialTransactionListPage> =
            list(cardToken, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardFinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardFinancialTransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardFinancialTransactionListParams
        ): HttpResponseFor<CardFinancialTransactionListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            cardToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardFinancialTransactionListPage> =
            list(cardToken, CardFinancialTransactionListParams.none(), requestOptions)
    }
}
