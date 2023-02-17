@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.client

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.*
import com.lithic.api.services.blocking.*

interface LithicClient {

    fun accounts(): AccountService

    fun accountHolders(): AccountHolderService

    fun authRules(): AuthRuleService

    fun authStreamEnrollment(): AuthStreamEnrollmentService

    fun cards(): CardService

    fun events(): EventService

    fun fundingSources(): FundingSourceService

    fun transactions(): TransactionService

    /** API status check */
    @JvmOverloads
    fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ApiStatus
}
