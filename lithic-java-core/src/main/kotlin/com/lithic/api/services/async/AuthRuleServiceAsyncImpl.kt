// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.authRules.V2ServiceAsync
import com.lithic.api.services.async.authRules.V2ServiceAsyncImpl

class AuthRuleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthRuleServiceAsync {

    private val withRawResponse: AuthRuleServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): AuthRuleServiceAsync.WithRawResponse = withRawResponse

    override fun v2(): V2ServiceAsync = v2

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthRuleServiceAsync.WithRawResponse {

        private val v2: V2ServiceAsync.WithRawResponse by lazy {
            V2ServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun v2(): V2ServiceAsync.WithRawResponse = v2
    }
}
