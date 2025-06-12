// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions.events

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EnhancedData
import com.lithic.api.models.TransactionEventEnhancedCommercialDataRetrieveParams
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
     * Get L2/L3 enhanced commercial data associated with a transaction event. Not available in
     * sandbox.
     */
    fun retrieve(eventToken: String): CompletableFuture<EnhancedData> =
        retrieve(eventToken, TransactionEventEnhancedCommercialDataRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        eventToken: String,
        params: TransactionEventEnhancedCommercialDataRetrieveParams =
            TransactionEventEnhancedCommercialDataRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnhancedData> =
        retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        eventToken: String,
        params: TransactionEventEnhancedCommercialDataRetrieveParams =
            TransactionEventEnhancedCommercialDataRetrieveParams.none(),
    ): CompletableFuture<EnhancedData> = retrieve(eventToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionEventEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnhancedData>

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionEventEnhancedCommercialDataRetrieveParams
    ): CompletableFuture<EnhancedData> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        eventToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<EnhancedData> =
        retrieve(
            eventToken,
            TransactionEventEnhancedCommercialDataRetrieveParams.none(),
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
         * /v1/transactions/events/{event_token}/enhanced_commercial_data`, but is otherwise the
         * same as [EnhancedCommercialDataServiceAsync.retrieve].
         */
        fun retrieve(eventToken: String): CompletableFuture<HttpResponseFor<EnhancedData>> =
            retrieve(eventToken, TransactionEventEnhancedCommercialDataRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            eventToken: String,
            params: TransactionEventEnhancedCommercialDataRetrieveParams =
                TransactionEventEnhancedCommercialDataRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnhancedData>> =
            retrieve(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            eventToken: String,
            params: TransactionEventEnhancedCommercialDataRetrieveParams =
                TransactionEventEnhancedCommercialDataRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<EnhancedData>> =
            retrieve(eventToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: TransactionEventEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnhancedData>>

        /** @see [retrieve] */
        fun retrieve(
            params: TransactionEventEnhancedCommercialDataRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnhancedData>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            eventToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<EnhancedData>> =
            retrieve(
                eventToken,
                TransactionEventEnhancedCommercialDataRetrieveParams.none(),
                requestOptions,
            )
    }
}
