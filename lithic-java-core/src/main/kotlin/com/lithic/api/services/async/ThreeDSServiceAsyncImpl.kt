// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.services.async.threeDS.AuthenticationServiceAsync
import com.lithic.api.services.async.threeDS.AuthenticationServiceAsyncImpl
import com.lithic.api.services.async.threeDS.DecisioningServiceAsync
import com.lithic.api.services.async.threeDS.DecisioningServiceAsyncImpl
import com.lithic.api.services.errorHandler

class ThreeDSServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ThreeDSServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val authentication: AuthenticationServiceAsync by lazy {
        AuthenticationServiceAsyncImpl(clientOptions)
    }

    private val decisioning: DecisioningServiceAsync by lazy {
        DecisioningServiceAsyncImpl(clientOptions)
    }

    override fun authentication(): AuthenticationServiceAsync = authentication

    override fun decisioning(): DecisioningServiceAsync = decisioning
}
