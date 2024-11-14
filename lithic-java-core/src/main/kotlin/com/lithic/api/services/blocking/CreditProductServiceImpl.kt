// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.creditProducts.ExtendedCreditService
import com.lithic.api.services.blocking.creditProducts.ExtendedCreditServiceImpl
import com.lithic.api.services.blocking.creditProducts.PrimeRateService
import com.lithic.api.services.blocking.creditProducts.PrimeRateServiceImpl

class CreditProductServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditProductService {

    private val extendedCredit: ExtendedCreditService by lazy {
        ExtendedCreditServiceImpl(clientOptions)
    }

    private val primeRates: PrimeRateService by lazy { PrimeRateServiceImpl(clientOptions) }

    override fun extendedCredit(): ExtendedCreditService = extendedCredit

    override fun primeRates(): PrimeRateService = primeRates
}
