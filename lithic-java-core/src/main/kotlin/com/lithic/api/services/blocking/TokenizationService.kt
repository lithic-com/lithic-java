// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.TokenizationListPage
import com.lithic.api.models.TokenizationListParams
import com.lithic.api.models.TokenizationRetrieveParams
import com.lithic.api.models.TokenizationRetrieveResponse
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationSimulateResponse

interface TokenizationService {

    /** Get tokenization */
    @JvmOverloads
    fun retrieve(
        params: TokenizationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenizationRetrieveResponse

    /** List card tokenizations */
    @JvmOverloads
    fun list(
        params: TokenizationListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenizationListPage

    /**
     * This endpoint is used to simulate a card's tokenization in the Digital Wallet and merchant
     * tokenization ecosystem.
     */
    @JvmOverloads
    fun simulate(
        params: TokenizationSimulateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TokenizationSimulateResponse
}
