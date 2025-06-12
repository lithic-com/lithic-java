// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.creditProducts.ExtendedCreditService
import com.lithic.api.services.blocking.creditProducts.ExtendedCreditServiceImpl
import com.lithic.api.services.blocking.creditProducts.PrimeRateService
import com.lithic.api.services.blocking.creditProducts.PrimeRateServiceImpl
import java.util.function.Consumer

class CreditProductServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditProductService {

    private val withRawResponse: CreditProductService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val extendedCredit: ExtendedCreditService by lazy {
        ExtendedCreditServiceImpl(clientOptions)
    }

    private val primeRates: PrimeRateService by lazy { PrimeRateServiceImpl(clientOptions) }

    override fun withRawResponse(): CreditProductService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditProductService =
        CreditProductServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extendedCredit(): ExtendedCreditService = extendedCredit

    override fun primeRates(): PrimeRateService = primeRates

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditProductService.WithRawResponse {

        private val extendedCredit: ExtendedCreditService.WithRawResponse by lazy {
            ExtendedCreditServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val primeRates: PrimeRateService.WithRawResponse by lazy {
            PrimeRateServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditProductService.WithRawResponse =
            CreditProductServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun extendedCredit(): ExtendedCreditService.WithRawResponse = extendedCredit

        override fun primeRates(): PrimeRateService.WithRawResponse = primeRates
    }
}
