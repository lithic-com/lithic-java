// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.transactions.events.EnhancedCommercialDataServiceAsync
import com.lithic.api.services.async.transactions.events.EnhancedCommercialDataServiceAsyncImpl

class EventServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EventServiceAsync {

    private val withRawResponse: EventServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enhancedCommercialData: EnhancedCommercialDataServiceAsync by lazy {
        EnhancedCommercialDataServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): EventServiceAsync.WithRawResponse = withRawResponse

    override fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync =
        enhancedCommercialData

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EventServiceAsync.WithRawResponse {

        private val enhancedCommercialData:
            EnhancedCommercialDataServiceAsync.WithRawResponse by lazy {
            EnhancedCommercialDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync.WithRawResponse =
            enhancedCommercialData
    }
}
