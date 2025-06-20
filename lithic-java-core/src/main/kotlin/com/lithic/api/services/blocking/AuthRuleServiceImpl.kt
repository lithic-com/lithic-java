// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.authRules.V2Service
import com.lithic.api.services.blocking.authRules.V2ServiceImpl
import java.util.function.Consumer

class AuthRuleServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthRuleService {

    private val withRawResponse: AuthRuleService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val v2: V2Service by lazy { V2ServiceImpl(clientOptions) }

    override fun withRawResponse(): AuthRuleService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AuthRuleService =
        AuthRuleServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun v2(): V2Service = v2

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthRuleService.WithRawResponse {

        private val v2: V2Service.WithRawResponse by lazy {
            V2ServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AuthRuleService.WithRawResponse =
            AuthRuleServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun v2(): V2Service.WithRawResponse = v2
    }
}
