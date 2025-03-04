// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.services.blocking.authRules.V2Service

interface AuthRuleService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun v2(): V2Service

    /** A view of [AuthRuleService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun v2(): V2Service.WithRawResponse
    }
}
