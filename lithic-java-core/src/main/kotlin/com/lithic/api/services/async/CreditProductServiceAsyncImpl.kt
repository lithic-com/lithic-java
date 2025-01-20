// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsync
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsyncImpl
import com.lithic.api.services.async.creditProducts.PrimeRateServiceAsync
import com.lithic.api.services.async.creditProducts.PrimeRateServiceAsyncImpl

class CreditProductServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CreditProductServiceAsync {

    private val extendedCredit: ExtendedCreditServiceAsync by lazy {
        ExtendedCreditServiceAsyncImpl(clientOptions)
    }

    private val primeRates: PrimeRateServiceAsync by lazy {
        PrimeRateServiceAsyncImpl(clientOptions)
    }

    override fun extendedCredit(): ExtendedCreditServiceAsync = extendedCredit

    override fun primeRates(): PrimeRateServiceAsync = primeRates
}
