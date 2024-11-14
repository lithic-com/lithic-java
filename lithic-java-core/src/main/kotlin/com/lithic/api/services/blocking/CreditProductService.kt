// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.services.blocking.creditProducts.ExtendedCreditService
import com.lithic.api.services.blocking.creditProducts.PrimeRateService

interface CreditProductService {

    fun extendedCredit(): ExtendedCreditService

    fun primeRates(): PrimeRateService
}
