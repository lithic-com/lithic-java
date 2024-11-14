// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsync
import com.lithic.api.services.async.creditProducts.PrimeRateServiceAsync

interface CreditProductServiceAsync {

    fun extendedCredit(): ExtendedCreditServiceAsync

    fun primeRates(): PrimeRateServiceAsync
}
