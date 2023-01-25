package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ApiStatus
import com.lithic.api.models.ClientApiStatusParams
import java.util.concurrent.CompletableFuture

@Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102
interface LithicClientInternalServiceAsync {
    /** API status check */
    @JvmOverloads
    fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ApiStatus>
}
