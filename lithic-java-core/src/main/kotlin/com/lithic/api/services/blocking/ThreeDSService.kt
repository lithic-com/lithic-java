// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.services.blocking.threeDS.AuthenticationService
import com.lithic.api.services.blocking.threeDS.DecisioningService

interface ThreeDSService {

    fun authentication(): AuthenticationService

    fun decisioning(): DecisioningService
}
