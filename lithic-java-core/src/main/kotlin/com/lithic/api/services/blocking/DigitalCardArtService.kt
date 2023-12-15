// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.DigitalCardArt
import com.lithic.api.models.DigitalCardArtListPage
import com.lithic.api.models.DigitalCardArtListParams
import com.lithic.api.models.DigitalCardArtRetrieveParams

interface DigitalCardArtService {

    /** Get digital card art by token. */
    @JvmOverloads
    fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DigitalCardArt

    /** List digital card art. */
    @JvmOverloads
    fun list(
        params: DigitalCardArtListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DigitalCardArtListPage
}
