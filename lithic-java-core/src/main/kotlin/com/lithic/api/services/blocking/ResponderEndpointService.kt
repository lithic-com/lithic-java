// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ResponderEndpointCheckStatusParams
import com.lithic.api.models.ResponderEndpointCreateParams
import com.lithic.api.models.ResponderEndpointCreateResponse
import com.lithic.api.models.ResponderEndpointDeleteParams
import com.lithic.api.models.ResponderEndpointStatus

interface ResponderEndpointService {

    /** Enroll a responder endpoint */
    @JvmOverloads
    fun create(
        params: ResponderEndpointCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponderEndpointCreateResponse

    /** Disenroll a responder endpoint */
    @JvmOverloads
    fun delete(
        params: ResponderEndpointDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )

    /** Check the status of a responder endpoint */
    @JvmOverloads
    fun checkStatus(
        params: ResponderEndpointCheckStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ResponderEndpointStatus
}
