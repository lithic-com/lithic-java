// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.services.async.authRules.V2ServiceAsync

interface AuthRuleServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun v2(): V2ServiceAsync

    /**
     * A view of [AuthRuleServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun v2(): V2ServiceAsync.WithRawResponse
    }
}
