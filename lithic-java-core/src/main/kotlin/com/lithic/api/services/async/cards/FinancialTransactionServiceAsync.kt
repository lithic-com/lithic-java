// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardFinancialTransactionListPageAsync
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface FinancialTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): FinancialTransactionServiceAsync

    /** Get the card financial transaction for the provided token. */
    fun retrieve(
        financialTransactionToken: String,
        params: CardFinancialTransactionRetrieveParams,
    ): CompletableFuture<FinancialTransaction> =
        retrieve(financialTransactionToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        financialTransactionToken: String,
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialTransaction> =
        retrieve(
            params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: CardFinancialTransactionRetrieveParams
    ): CompletableFuture<FinancialTransaction> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialTransaction>

    /** List the financial transactions for a given card. */
    fun list(cardToken: String): CompletableFuture<CardFinancialTransactionListPageAsync> =
        list(cardToken, CardFinancialTransactionListParams.none())

    /** @see list */
    fun list(
        cardToken: String,
        params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardFinancialTransactionListPageAsync> =
        list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

    /** @see list */
    fun list(
        cardToken: String,
        params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
    ): CompletableFuture<CardFinancialTransactionListPageAsync> =
        list(cardToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardFinancialTransactionListPageAsync>

    /** @see list */
    fun list(
        params: CardFinancialTransactionListParams
    ): CompletableFuture<CardFinancialTransactionListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        cardToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardFinancialTransactionListPageAsync> =
        list(cardToken, CardFinancialTransactionListParams.none(), requestOptions)

    /**
     * A view of [FinancialTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FinancialTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/cards/{card_token}/financial_transactions/{financial_transaction_token}`, but is
         * otherwise the same as [FinancialTransactionServiceAsync.retrieve].
         */
        fun retrieve(
            financialTransactionToken: String,
            params: CardFinancialTransactionRetrieveParams,
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>> =
            retrieve(financialTransactionToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            financialTransactionToken: String,
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>> =
            retrieve(
                params.toBuilder().financialTransactionToken(financialTransactionToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            params: CardFinancialTransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardFinancialTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialTransaction>>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/financial_transactions`, but
         * is otherwise the same as [FinancialTransactionServiceAsync.list].
         */
        fun list(
            cardToken: String
        ): CompletableFuture<HttpResponseFor<CardFinancialTransactionListPageAsync>> =
            list(cardToken, CardFinancialTransactionListParams.none())

        /** @see list */
        fun list(
            cardToken: String,
            params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardFinancialTransactionListPageAsync>> =
            list(params.toBuilder().cardToken(cardToken).build(), requestOptions)

        /** @see list */
        fun list(
            cardToken: String,
            params: CardFinancialTransactionListParams = CardFinancialTransactionListParams.none(),
        ): CompletableFuture<HttpResponseFor<CardFinancialTransactionListPageAsync>> =
            list(cardToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: CardFinancialTransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardFinancialTransactionListPageAsync>>

        /** @see list */
        fun list(
            params: CardFinancialTransactionListParams
        ): CompletableFuture<HttpResponseFor<CardFinancialTransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            cardToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardFinancialTransactionListPageAsync>> =
            list(cardToken, CardFinancialTransactionListParams.none(), requestOptions)
    }
}
