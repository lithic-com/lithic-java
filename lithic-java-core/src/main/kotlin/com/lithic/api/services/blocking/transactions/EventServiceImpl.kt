// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.transactions.events.EnhancedCommercialDataService
import com.lithic.api.services.blocking.transactions.events.EnhancedCommercialDataServiceImpl

class EventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventService {

    private val withRawResponse: EventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enhancedCommercialData: EnhancedCommercialDataService by lazy {
        EnhancedCommercialDataServiceImpl(clientOptions)
    }

    override fun withRawResponse(): EventService.WithRawResponse = withRawResponse

    override fun enhancedCommercialData(): EnhancedCommercialDataService = enhancedCommercialData

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventService.WithRawResponse {

        private val enhancedCommercialData: EnhancedCommercialDataService.WithRawResponse by lazy {
            EnhancedCommercialDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun enhancedCommercialData(): EnhancedCommercialDataService.WithRawResponse =
            enhancedCommercialData
    }
}
