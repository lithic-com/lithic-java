// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsync
import com.lithic.api.services.async.creditProducts.PrimeRateServiceAsync
import java.util.function.Consumer

interface CreditProductServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditProductServiceAsync

    fun extendedCredit(): ExtendedCreditServiceAsync

    fun primeRates(): PrimeRateServiceAsync

    /**
     * A view of [CreditProductServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditProductServiceAsync.WithRawResponse

        fun extendedCredit(): ExtendedCreditServiceAsync.WithRawResponse

        fun primeRates(): PrimeRateServiceAsync.WithRawResponse
    }
}
