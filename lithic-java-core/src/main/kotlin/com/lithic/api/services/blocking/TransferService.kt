// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.TransferCreateParams
import com.lithic.api.models.TransferCreateResponse

interface TransferService {

    /** Transfer funds between two financial accounts */
    @JvmOverloads
    fun create(
        params: TransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransferCreateResponse
}
