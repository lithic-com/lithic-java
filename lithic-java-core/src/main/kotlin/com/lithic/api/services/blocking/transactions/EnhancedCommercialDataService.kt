// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EnhancedCommercialDataRetrieveResponse
import com.lithic.api.models.TransactionEnhancedCommercialDataRetrieveParams
import java.util.function.Consumer

interface EnhancedCommercialDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EnhancedCommercialDataService

    /**
     * Get all L2/L3 enhanced commercial data associated with a transaction. Not available in
     * sandbox.
     */
    fun retrieve(transactionToken: String): EnhancedCommercialDataRetrieveResponse =
        retrieve(transactionToken, TransactionEnhancedCommercialDataRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        params: TransactionEnhancedCommercialDataRetrieveParams =
            TransactionEnhancedCommercialDataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnhancedCommercialDataRetrieveResponse =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        params: TransactionEnhancedCommercialDataRetrieveParams =
            TransactionEnhancedCommercialDataRetrieveParams.none(),
    ): EnhancedCommercialDataRetrieveResponse =
        retrieve(transactionToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnhancedCommercialDataRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams
    ): EnhancedCommercialDataRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): EnhancedCommercialDataRetrieveResponse =
        retrieve(
            transactionToken,
            TransactionEnhancedCommercialDataRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [EnhancedCommercialDataService] that provides access to raw HTTP responses for each
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
        ): EnhancedCommercialDataService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/transactions/{transaction_token}/enhanced_commercial_data`, but is otherwise the same
         * as [EnhancedCommercialDataService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            transactionToken: String
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> =
            retrieve(transactionToken, TransactionEnhancedCommercialDataRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            params: TransactionEnhancedCommercialDataRetrieveParams =
                TransactionEnhancedCommercialDataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            params: TransactionEnhancedCommercialDataRetrieveParams =
                TransactionEnhancedCommercialDataRetrieveParams.none(),
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> =
            retrieve(transactionToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionEnhancedCommercialDataRetrieveParams
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> =
            retrieve(
                transactionToken,
                TransactionEnhancedCommercialDataRetrieveParams.none(),
                requestOptions,
            )
    }
}
