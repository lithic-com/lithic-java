@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.AuthRule
import com.lithic.api.models.AuthRuleApplyParams
import com.lithic.api.models.AuthRuleApplyResponse
import com.lithic.api.models.AuthRuleCreateParams
import com.lithic.api.models.AuthRuleCreateResponse
import com.lithic.api.models.AuthRuleListPageAsync
import com.lithic.api.models.AuthRuleListParams
import com.lithic.api.models.AuthRuleRemoveParams
import com.lithic.api.models.AuthRuleRemoveResponse
import com.lithic.api.models.AuthRuleRetrieveParams
import com.lithic.api.models.AuthRuleRetrieveResponse
import com.lithic.api.models.AuthRuleUpdateParams
import com.lithic.api.models.AuthRuleUpdateResponse
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.JsonField
import com.lithic.api.core.RequestOptions
import com.lithic.api.errors.LithicError
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler

interface AuthRuleServiceAsync {

    /**
     * Creates an authorization rule (Auth Rule) and applies it at the program,
     * account, or card level.
     */
    @JvmOverloads
    fun create(params: AuthRuleCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AuthRuleCreateResponse>

    /**
     * Detail the properties and entities (program, accounts, and cards) associated
     * with an existing authorization rule (Auth Rule).
     */
    @JvmOverloads
    fun retrieve(params: AuthRuleRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AuthRuleRetrieveResponse>

    /**
     * Update the properties associated with an existing authorization rule (Auth
     * Rule).
     */
    @JvmOverloads
    fun update(params: AuthRuleUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AuthRuleUpdateResponse>

    /** Return all of the Auth Rules under the program. */
    @JvmOverloads
    fun list(params: AuthRuleListParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AuthRuleListPageAsync>

    /**
     * Applies an existing authorization rule (Auth Rule) to an program, account, or
     * card level.
     */
    @JvmOverloads
    fun apply(params: AuthRuleApplyParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AuthRuleApplyResponse>

    /**
     * Remove an existing authorization rule (Auth Rule) from an program, account, or
     * card-level.
     */
    @JvmOverloads
    fun remove(params: AuthRuleRemoveParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<AuthRuleRemoveResponse>
}
