// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.authRules.V2ServiceAsync
import com.lithic.api.services.async.authRules.V2ServiceAsyncImpl

class AuthRuleServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthRuleServiceAsync {

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptions) }

    override fun v2(): V2ServiceAsync = v2
}
