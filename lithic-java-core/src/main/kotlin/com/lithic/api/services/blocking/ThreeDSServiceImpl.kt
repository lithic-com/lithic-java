// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.threeDS.AuthenticationService
import com.lithic.api.services.blocking.threeDS.AuthenticationServiceImpl
import com.lithic.api.services.blocking.threeDS.DecisioningService
import com.lithic.api.services.blocking.threeDS.DecisioningServiceImpl

class ThreeDSServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ThreeDSService {

    private val authentication: AuthenticationService by lazy {
        AuthenticationServiceImpl(clientOptions)
    }

    private val decisioning: DecisioningService by lazy { DecisioningServiceImpl(clientOptions) }

    override fun authentication(): AuthenticationService = authentication

    override fun decisioning(): DecisioningService = decisioning
}
