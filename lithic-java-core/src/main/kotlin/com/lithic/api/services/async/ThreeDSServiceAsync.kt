// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.services.async.threeDS.AuthenticationServiceAsync
import com.lithic.api.services.async.threeDS.DecisioningServiceAsync
import java.util.function.Consumer

interface ThreeDSServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ThreeDSServiceAsync

    fun authentication(): AuthenticationServiceAsync

    fun decisioning(): DecisioningServiceAsync

    /**
     * A view of [ThreeDSServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ThreeDSServiceAsync.WithRawResponse

        fun authentication(): AuthenticationServiceAsync.WithRawResponse

        fun decisioning(): DecisioningServiceAsync.WithRawResponse
    }
}
