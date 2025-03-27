// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.services.blocking.creditproducts.ExtendedCreditService
import com.lithic.api.services.blocking.creditproducts.PrimeRateService

interface CreditProductService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun extendedCredit(): ExtendedCreditService

    fun primeRates(): PrimeRateService

    /**
     * A view of [CreditProductService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun extendedCredit(): ExtendedCreditService.WithRawResponse

        fun primeRates(): PrimeRateService.WithRawResponse
    }
}
