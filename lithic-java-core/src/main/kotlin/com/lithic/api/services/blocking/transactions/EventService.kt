// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.lithic.api.services.blocking.transactions.events.EnhancedCommercialDataService

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun enhancedCommercialData(): EnhancedCommercialDataService

    /** A view of [EventService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun enhancedCommercialData(): EnhancedCommercialDataService.WithRawResponse
    }
}
