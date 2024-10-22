// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.services.async.threeDS.AuthenticationServiceAsync
import com.lithic.api.services.async.threeDS.DecisioningServiceAsync

interface ThreeDSServiceAsync {

    fun authentication(): AuthenticationServiceAsync

    fun decisioning(): DecisioningServiceAsync
}
