// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.fraud

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FraudTransactionReportParams
import com.lithic.api.models.FraudTransactionRetrieveParams
import com.lithic.api.models.TransactionReportResponse
import com.lithic.api.models.TransactionRetrieveResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionServiceAsync

    /**
     * Retrieve a fraud report for a specific transaction identified by its unique transaction
     * token.
     */
    fun retrieve(transactionToken: String): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(transactionToken, FraudTransactionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
    ): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(transactionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FraudTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: FraudTransactionRetrieveParams
    ): CompletableFuture<TransactionRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionRetrieveResponse> =
        retrieve(transactionToken, FraudTransactionRetrieveParams.none(), requestOptions)

    /**
     * Report fraud for a specific transaction token by providing details such as fraud type, fraud
     * status, and any additional comments.
     */
    fun report(
        transactionToken: String,
        params: FraudTransactionReportParams,
    ): CompletableFuture<TransactionReportResponse> =
        report(transactionToken, params, RequestOptions.none())

    /** @see [report] */
    fun report(
        transactionToken: String,
        params: FraudTransactionReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionReportResponse> =
        report(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see [report] */
    fun report(params: FraudTransactionReportParams): CompletableFuture<TransactionReportResponse> =
        report(params, RequestOptions.none())

    /** @see [report] */
    fun report(
        params: FraudTransactionReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionReportResponse>

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/fraud/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionServiceAsync.retrieve].
         */
        fun retrieve(
            transactionToken: String
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(transactionToken, FraudTransactionRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            transactionToken: String,
            params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            transactionToken: String,
            params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(transactionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: FraudTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: FraudTransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionRetrieveResponse>> =
            retrieve(transactionToken, FraudTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/fraud/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionServiceAsync.report].
         */
        fun report(
            transactionToken: String,
            params: FraudTransactionReportParams,
        ): CompletableFuture<HttpResponseFor<TransactionReportResponse>> =
            report(transactionToken, params, RequestOptions.none())

        /** @see [report] */
        fun report(
            transactionToken: String,
            params: FraudTransactionReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionReportResponse>> =
            report(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see [report] */
        fun report(
            params: FraudTransactionReportParams
        ): CompletableFuture<HttpResponseFor<TransactionReportResponse>> =
            report(params, RequestOptions.none())

        /** @see [report] */
        fun report(
            params: FraudTransactionReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionReportResponse>>
    }
}
