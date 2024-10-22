// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.lithic.api.services.blocking.transactions.events.EnhancedCommercialDataService

interface EventService {

    fun enhancedCommercialData(): EnhancedCommercialDataService
}
