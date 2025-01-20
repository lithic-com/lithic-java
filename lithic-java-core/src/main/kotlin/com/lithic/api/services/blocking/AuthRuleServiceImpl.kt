// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.blocking.authRules.V2Service
import com.lithic.api.services.blocking.authRules.V2ServiceImpl

class AuthRuleServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AuthRuleService {

    private val v2: V2Service by lazy { V2ServiceImpl(clientOptions) }

    override fun v2(): V2Service = v2
}
