// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.transactions.enhancedcommercialdata.EnhancedCommercialDataRetrieveParams
import com.lithic.api.models.transactions.enhancedcommercialdata.EnhancedCommercialDataRetrieveResponse
import java.util.concurrent.CompletableFuture

interface EnhancedCommercialDataServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get all L2/L3 enhanced commercial data associated with a transaction. Not available in
     * sandbox.
     */
    fun retrieve(
        params: EnhancedCommercialDataRetrieveParams
    ): CompletableFuture<EnhancedCommercialDataRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: EnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EnhancedCommercialDataRetrieveResponse>

    /**
     * A view of [EnhancedCommercialDataServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/transactions/{transaction_token}/enhanced_commercial_data`, but is otherwise the same
         * as [EnhancedCommercialDataServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: EnhancedCommercialDataRetrieveParams
        ): CompletableFuture<HttpResponseFor<EnhancedCommercialDataRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: EnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EnhancedCommercialDataRetrieveResponse>>
    }
}
