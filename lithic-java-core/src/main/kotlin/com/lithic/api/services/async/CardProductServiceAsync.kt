// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardProductCreditDetailParams
import com.lithic.api.models.CardProductCreditDetailResponse
import java.util.concurrent.CompletableFuture

interface CardProductServiceAsync {

    /** Get the Credit Detail for the card product */
    @JvmOverloads
    fun creditDetail(
        params: CardProductCreditDetailParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardProductCreditDetailResponse>
}
