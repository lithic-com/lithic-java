@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.client

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.*
import com.lithic.api.services.async.*
import java.util.concurrent.CompletableFuture

interface LithicClientAsync {

    fun accounts(): AccountServiceAsync

    fun accountHolders(): AccountHolderServiceAsync

    fun authRules(): AuthRuleServiceAsync

    fun authStreamEnrollment(): AuthStreamEnrollmentServiceAsync

    fun cards(): CardServiceAsync

    fun events(): EventServiceAsync

    fun fundingSources(): FundingSourceServiceAsync

    fun transactions(): TransactionServiceAsync

    /** API status check */
    @JvmOverloads
    fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ApiStatus>
}
