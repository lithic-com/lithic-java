package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.services.blocking.threeDS.AuthenticationService
import com.lithic.api.services.blocking.threeDS.AuthenticationServiceImpl
import com.lithic.api.services.blocking.threeDS.DecisioningService
import com.lithic.api.services.blocking.threeDS.DecisioningServiceImpl
import com.lithic.api.services.errorHandler

class ThreeDSServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ThreeDSService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val authentication: AuthenticationService by lazy {
        AuthenticationServiceImpl(clientOptions)
    }

    private val decisioning: DecisioningService by lazy { DecisioningServiceImpl(clientOptions) }

    override fun authentication(): AuthenticationService = authentication

    override fun decisioning(): DecisioningService = decisioning
}
