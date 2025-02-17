// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.creditProducts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import com.lithic.api.models.ExtendedCredit
import java.util.concurrent.CompletableFuture

interface ExtendedCreditServiceAsync {

    /** Get the extended credit for a given credit product under a program */
    @JvmOverloads
    fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtendedCredit>
}
