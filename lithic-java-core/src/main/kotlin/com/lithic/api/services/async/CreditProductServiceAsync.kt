// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsync
import com.lithic.api.services.async.creditProducts.PrimeRateServiceAsync

interface CreditProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun extendedCredit(): ExtendedCreditServiceAsync

    fun primeRates(): PrimeRateServiceAsync

    /**
     * A view of [CreditProductServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        fun extendedCredit(): ExtendedCreditServiceAsync.WithRawResponse

        fun primeRates(): PrimeRateServiceAsync.WithRawResponse
    }
}
