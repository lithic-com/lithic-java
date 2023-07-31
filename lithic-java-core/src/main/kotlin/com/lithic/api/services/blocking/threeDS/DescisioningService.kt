@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.threeDS

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.DescisioningRetrieveSecretResponse
import com.lithic.api.models.ThreeDDescisioningRetrieveSecretParams
import com.lithic.api.models.ThreeDDescisioningRotateSecretParams

interface DescisioningService {

    /**
     * Retrieve the 3DS Decisioning HMAC secret key. If one does not exist for your program yet,
     * calling this endpoint will create one for you. The headers (which you can use to verify 3DS
     * Decisioning requests) will begin appearing shortly after calling this endpoint for the first
     * time. See
     * [this page](https://docs.lithic.com/docs/3ds-decisioning#3ds-decisioning-hmac-secrets) for
     * more detail about verifying 3DS Decisioning requests.
     */
    @JvmOverloads
    fun retrieveSecret(
        params: ThreeDDescisioningRetrieveSecretParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): DescisioningRetrieveSecretResponse

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    @JvmOverloads
    fun rotateSecret(
        params: ThreeDDescisioningRotateSecretParams,
        requestOptions: RequestOptions = RequestOptions.none()
    )
}
