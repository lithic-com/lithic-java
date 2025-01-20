// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactions

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.transactions.events.EnhancedCommercialDataServiceAsync
import com.lithic.api.services.async.transactions.events.EnhancedCommercialDataServiceAsyncImpl

class EventServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : EventServiceAsync {

    private val enhancedCommercialData: EnhancedCommercialDataServiceAsync by lazy {
        EnhancedCommercialDataServiceAsyncImpl(clientOptions)
    }

    override fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync =
        enhancedCommercialData
}
