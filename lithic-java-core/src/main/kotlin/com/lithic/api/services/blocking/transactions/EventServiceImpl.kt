// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.errorHandler
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.services.blocking.transactions.events.EnhancedCommercialDataService
import com.lithic.api.services.blocking.transactions.events.EnhancedCommercialDataServiceImpl

class EventServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EventService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val enhancedCommercialData: EnhancedCommercialDataService by lazy {
        EnhancedCommercialDataServiceImpl(clientOptions)
    }

    override fun enhancedCommercialData(): EnhancedCommercialDataService = enhancedCommercialData
}
