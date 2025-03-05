// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions

import com.lithic.api.services.async.transactions.events.EnhancedCommercialDataServiceAsync

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync.WithRawResponse
    }
}
