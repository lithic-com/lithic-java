// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.threeDS.AuthenticationService
import com.lithic.api.services.blocking.threeDS.AuthenticationServiceImpl
import com.lithic.api.services.blocking.threeDS.DecisioningService
import com.lithic.api.services.blocking.threeDS.DecisioningServiceImpl

class ThreeDSServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreeDSService {

    private val withRawResponse: ThreeDSService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val authentication: AuthenticationService by lazy {
        AuthenticationServiceImpl(clientOptions)
    }

    private val decisioning: DecisioningService by lazy { DecisioningServiceImpl(clientOptions) }

    override fun withRawResponse(): ThreeDSService.WithRawResponse = withRawResponse

    override fun authentication(): AuthenticationService = authentication

    override fun decisioning(): DecisioningService = decisioning

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreeDSService.WithRawResponse {

        private val authentication: AuthenticationService.WithRawResponse by lazy {
            AuthenticationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val decisioning: DecisioningService.WithRawResponse by lazy {
            DecisioningServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun authentication(): AuthenticationService.WithRawResponse = authentication

        override fun decisioning(): DecisioningService.WithRawResponse = decisioning
    }
}
