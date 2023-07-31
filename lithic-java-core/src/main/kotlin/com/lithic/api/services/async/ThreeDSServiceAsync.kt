@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.services.async.threeDS.AuthenticationServiceAsync
import com.lithic.api.services.async.threeDS.DescisioningServiceAsync

interface ThreeDSServiceAsync {

    fun authentication(): AuthenticationServiceAsync

    fun descisioning(): DescisioningServiceAsync
}
