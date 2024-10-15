// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.errorHandler
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsync
import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsyncImpl

class CreditProductServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditProductServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val extendedCredit: ExtendedCreditServiceAsync by lazy {
        ExtendedCreditServiceAsyncImpl(clientOptions)
    }

    override fun extendedCredit(): ExtendedCreditServiceAsync = extendedCredit
}
