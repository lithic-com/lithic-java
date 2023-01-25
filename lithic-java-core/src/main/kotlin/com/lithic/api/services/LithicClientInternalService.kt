package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ApiStatus
import com.lithic.api.models.ClientApiStatusParams

@Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102
interface LithicClientInternalService {
    /** API status check */
    @JvmOverloads
    fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ApiStatus
}
