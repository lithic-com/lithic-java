// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsync
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsyncImpl
import com.lithic.api.services.async.creditProducts.PrimeRateServiceAsync
import com.lithic.api.services.async.creditProducts.PrimeRateServiceAsyncImpl
import java.util.function.Consumer

class CreditProductServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CreditProductServiceAsync {

    private val withRawResponse: CreditProductServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val extendedCredit: ExtendedCreditServiceAsync by lazy {
        ExtendedCreditServiceAsyncImpl(clientOptions)
    }

    private val primeRates: PrimeRateServiceAsync by lazy {
        PrimeRateServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CreditProductServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditProductServiceAsync =
        CreditProductServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun extendedCredit(): ExtendedCreditServiceAsync = extendedCredit

    override fun primeRates(): PrimeRateServiceAsync = primeRates

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditProductServiceAsync.WithRawResponse {

        private val extendedCredit: ExtendedCreditServiceAsync.WithRawResponse by lazy {
            ExtendedCreditServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val primeRates: PrimeRateServiceAsync.WithRawResponse by lazy {
            PrimeRateServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditProductServiceAsync.WithRawResponse =
            CreditProductServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun extendedCredit(): ExtendedCreditServiceAsync.WithRawResponse = extendedCredit

        override fun primeRates(): PrimeRateServiceAsync.WithRawResponse = primeRates
    }
}
