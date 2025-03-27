// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.threeds.AuthenticationServiceAsync
import com.lithic.api.services.async.threeds.AuthenticationServiceAsyncImpl
import com.lithic.api.services.async.threeds.DecisioningServiceAsync
import com.lithic.api.services.async.threeds.DecisioningServiceAsyncImpl

class ThreeDSServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    ThreeDSServiceAsync {

    private val withRawResponse: ThreeDSServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val authentication: AuthenticationServiceAsync by lazy {
        AuthenticationServiceAsyncImpl(clientOptions)
    }

    private val decisioning: DecisioningServiceAsync by lazy {
        DecisioningServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): ThreeDSServiceAsync.WithRawResponse = withRawResponse

    override fun authentication(): AuthenticationServiceAsync = authentication

    override fun decisioning(): DecisioningServiceAsync = decisioning

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ThreeDSServiceAsync.WithRawResponse {

        private val authentication: AuthenticationServiceAsync.WithRawResponse by lazy {
            AuthenticationServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val decisioning: DecisioningServiceAsync.WithRawResponse by lazy {
            DecisioningServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun authentication(): AuthenticationServiceAsync.WithRawResponse = authentication

        override fun decisioning(): DecisioningServiceAsync.WithRawResponse = decisioning
    }
}
