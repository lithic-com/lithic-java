// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsync
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsyncImpl

class CreditProductServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditProductServiceAsync {

    private val extendedCredit: ExtendedCreditServiceAsync by lazy {
        ExtendedCreditServiceAsyncImpl(clientOptions)
    }

    override fun extendedCredit(): ExtendedCreditServiceAsync = extendedCredit
}
