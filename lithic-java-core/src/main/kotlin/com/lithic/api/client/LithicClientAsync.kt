@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.client

import java.time.Duration
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.JsonField
import com.lithic.api.core.RequestOptions
import com.lithic.api.errors.LithicError
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import com.lithic.api.services.async.*
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler

interface LithicClientAsync {

    fun accounts(): AccountServiceAsync

    fun accountHolders(): AccountHolderServiceAsync

    fun authRules(): AuthRuleServiceAsync

    fun authStreamEnrollment(): AuthStreamEnrollmentServiceAsync

    fun tokenizationDecisioning(): TokenizationDecisioningServiceAsync

    fun cards(): CardServiceAsync

    fun disputes(): DisputeServiceAsync

    fun events(): EventServiceAsync

    fun transactions(): TransactionServiceAsync

    fun webhooks(): WebhookServiceAsync

    /** API status check */
    @JvmOverloads
    fun apiStatus(params: ClientApiStatusParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<ApiStatus>
}
