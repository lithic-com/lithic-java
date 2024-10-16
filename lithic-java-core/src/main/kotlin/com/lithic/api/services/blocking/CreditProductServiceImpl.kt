// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.creditProducts.ExtendedCreditService
import com.lithic.api.services.blocking.creditProducts.ExtendedCreditServiceImpl

class CreditProductServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditProductService {

    private val extendedCredit: ExtendedCreditService by lazy {
        ExtendedCreditServiceImpl(clientOptions)
    }

    override fun extendedCredit(): ExtendedCreditService = extendedCredit
}
