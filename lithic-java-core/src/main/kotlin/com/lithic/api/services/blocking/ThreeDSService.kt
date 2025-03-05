// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.services.blocking.threeDS.AuthenticationService
import com.lithic.api.services.blocking.threeDS.DecisioningService

interface ThreeDSService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun authentication(): AuthenticationService

    fun decisioning(): DecisioningService

    /** A view of [ThreeDSService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun authentication(): AuthenticationService.WithRawResponse

        fun decisioning(): DecisioningService.WithRawResponse
    }
}
