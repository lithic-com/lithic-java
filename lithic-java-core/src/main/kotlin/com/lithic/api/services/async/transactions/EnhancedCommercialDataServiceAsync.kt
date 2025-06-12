// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EnhancedCommercialDataRetrieveResponse
import com.lithic.api.models.TransactionEnhancedCommercialDataRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EnhancedCommercialDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnhancedCommercialDataServiceAsync

    /**
     * Get all L2/L3 enhanced commercial data associated with a transaction. Not available in
     * sandbox.
     */
    fun retrieve(
        transactionToken: String
    ): CompletableFuture<EnhancedCommercialDataRetrieveResponse> =
        retrieve(transactionToken, TransactionEnhancedCommercialDataRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        params: TransactionEnhancedCommercialDataRetrieveParams =
            TransactionEnhancedCommercialDataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnhancedCommercialDataRetrieveResponse> =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        params: TransactionEnhancedCommercialDataRetrieveParams =
            TransactionEnhancedCommercialDataRetrieveParams.none(),
    ): CompletableFuture<EnhancedCommercialDataRetrieveResponse> =
        retrieve(transactionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnhancedCommercialDataRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams
    ): CompletableFuture<EnhancedCommercialDataRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnhancedCommercialDataRetrieveResponse> =
        retrieve(
            transactionToken,
            TransactionEnhancedCommercialDataRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [EnhancedCommercialDataServiceAsync] that provides access to raw HTTP responses for
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
        ): EnhancedCommercialDataServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/transactions/{transaction_token}/enhanced_commercial_data`, but is otherwise the same
         * as [EnhancedCommercialDataServiceAsync.retrieve].
         */
        fun retrieve(
            transactionToken: String
        ): CompletableFuture<HttpResponseFor<EnhancedCommercialDataRetrieveResponse>> =
            retrieve(transactionToken, TransactionEnhancedCommercialDataRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            transactionToken: String,
            params: TransactionEnhancedCommercialDataRetrieveParams =
                TransactionEnhancedCommercialDataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnhancedCommercialDataRetrieveResponse>> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            transactionToken: String,
            params: TransactionEnhancedCommercialDataRetrieveParams =
                TransactionEnhancedCommercialDataRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EnhancedCommercialDataRetrieveResponse>> =
            retrieve(transactionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: TransactionEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnhancedCommercialDataRetrieveResponse>>

        /** @see [retrieve] */
        fun retrieve(
            params: TransactionEnhancedCommercialDataRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnhancedCommercialDataRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnhancedCommercialDataRetrieveResponse>> =
            retrieve(
                transactionToken,
                TransactionEnhancedCommercialDataRetrieveParams.none(),
                requestOptions,
            )
    }
}
