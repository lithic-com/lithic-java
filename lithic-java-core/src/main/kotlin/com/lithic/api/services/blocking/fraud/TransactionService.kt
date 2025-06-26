// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.fraud

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FraudTransactionReportParams
import com.lithic.api.models.FraudTransactionRetrieveParams
import com.lithic.api.models.TransactionReportResponse
import com.lithic.api.models.TransactionRetrieveResponse
import java.util.function.Consumer

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionService

    /**
     * Retrieve a fraud report for a specific transaction identified by its unique transaction
     * token.
     */
    fun retrieve(transactionToken: String): TransactionRetrieveResponse =
        retrieve(transactionToken, FraudTransactionRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
    ): TransactionRetrieveResponse = retrieve(transactionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FraudTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: FraudTransactionRetrieveParams): TransactionRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): TransactionRetrieveResponse =
        retrieve(transactionToken, FraudTransactionRetrieveParams.none(), requestOptions)

    /**
     * Report fraud for a specific transaction token by providing details such as fraud type, fraud
     * status, and any additional comments.
     */
    fun report(
        transactionToken: String,
        params: FraudTransactionReportParams,
    ): TransactionReportResponse = report(transactionToken, params, RequestOptions.none())

    /** @see [report] */
    fun report(
        transactionToken: String,
        params: FraudTransactionReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionReportResponse =
        report(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see [report] */
    fun report(params: FraudTransactionReportParams): TransactionReportResponse =
        report(params, RequestOptions.none())

    /** @see [report] */
    fun report(
        params: FraudTransactionReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionReportResponse

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/fraud/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(transactionToken: String): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(transactionToken, FraudTransactionRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            params: FraudTransactionRetrieveParams = FraudTransactionRetrieveParams.none(),
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(transactionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FraudTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FraudTransactionRetrieveParams
        ): HttpResponseFor<TransactionRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(transactionToken, FraudTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/fraud/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionService.report].
         */
        @MustBeClosed
        fun report(
            transactionToken: String,
            params: FraudTransactionReportParams,
        ): HttpResponseFor<TransactionReportResponse> =
            report(transactionToken, params, RequestOptions.none())

        /** @see [report] */
        @MustBeClosed
        fun report(
            transactionToken: String,
            params: FraudTransactionReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionReportResponse> =
            report(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see [report] */
        @MustBeClosed
        fun report(
            params: FraudTransactionReportParams
        ): HttpResponseFor<TransactionReportResponse> = report(params, RequestOptions.none())

        /** @see [report] */
        @MustBeClosed
        fun report(
            params: FraudTransactionReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionReportResponse>
    }
}
