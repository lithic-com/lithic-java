@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.threeDS

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams

interface AuthenticationService {

    /** Get 3DS Authentication by token */
    @JvmOverloads
    fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthenticationRetrieveResponse
}
