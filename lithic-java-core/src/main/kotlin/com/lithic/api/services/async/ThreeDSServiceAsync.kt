// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.services.async.threeds.AuthenticationServiceAsync
import com.lithic.api.services.async.threeds.DecisioningServiceAsync

interface ThreeDSServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun authentication(): AuthenticationServiceAsync

    fun decisioning(): DecisioningServiceAsync

    /**
     * A view of [ThreeDSServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun authentication(): AuthenticationServiceAsync.WithRawResponse

        fun decisioning(): DecisioningServiceAsync.WithRawResponse
    }
}
