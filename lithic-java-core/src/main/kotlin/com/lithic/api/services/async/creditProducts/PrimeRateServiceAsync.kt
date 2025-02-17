// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.creditProducts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CreditProductPrimeRateCreateParams
import com.lithic.api.models.CreditProductPrimeRateRetrieveParams
import com.lithic.api.models.PrimeRateRetrieveResponse
import java.util.concurrent.CompletableFuture

interface PrimeRateServiceAsync {

    /** Post Credit Product Prime Rate */
    @JvmOverloads
    fun create(
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get Credit Product Prime Rates */
    @JvmOverloads
    fun retrieve(
        params: CreditProductPrimeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrimeRateRetrieveResponse>
}
