// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.services.async.creditProducts.ExtendedCreditServiceAsync

interface CreditProductServiceAsync {

    fun extendedCredit(): ExtendedCreditServiceAsync
}
