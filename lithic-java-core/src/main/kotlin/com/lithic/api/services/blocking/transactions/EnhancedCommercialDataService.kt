// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.EnhancedCommercialDataRetrieveResponse
import com.lithic.api.models.TransactionEnhancedCommercialDataRetrieveParams

interface EnhancedCommercialDataService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Get all L2/L3 enhanced commercial data associated with a transaction. Not available in
     * sandbox.
     */
    fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams
    ): EnhancedCommercialDataRetrieveResponse = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EnhancedCommercialDataRetrieveResponse

    /**
     * A view of [EnhancedCommercialDataService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/transactions/{transaction_token}/enhanced_commercial_data`, but is otherwise the same
         * as [EnhancedCommercialDataService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: TransactionEnhancedCommercialDataRetrieveParams
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse>
    }
}
