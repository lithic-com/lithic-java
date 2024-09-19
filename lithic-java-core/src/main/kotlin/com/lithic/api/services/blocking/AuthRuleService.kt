// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthRule
import com.lithic.api.models.AuthRuleApplyParams
import com.lithic.api.models.AuthRuleCreateParams
import com.lithic.api.models.AuthRuleListPage
import com.lithic.api.models.AuthRuleListParams
import com.lithic.api.models.AuthRuleRemoveParams
import com.lithic.api.models.AuthRuleRemoveResponse
import com.lithic.api.models.AuthRuleRetrieveParams
import com.lithic.api.models.AuthRuleRetrieveResponse
import com.lithic.api.models.AuthRuleUpdateParams
import com.lithic.api.services.blocking.authRules.V2Service

interface AuthRuleService {

    fun v2(): V2Service

    /**
     * Creates an authorization rule (Auth Rule) and applies it at the program, account, or card
     * level.
     */
    @JvmOverloads
    fun create(
        params: AuthRuleCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRule

    /**
     * Detail the properties and entities (program, accounts, and cards) associated with an existing
     * authorization rule (Auth Rule).
     */
    @JvmOverloads
    fun retrieve(
        params: AuthRuleRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRuleRetrieveResponse

    /** Update the properties associated with an existing authorization rule (Auth Rule). */
    @JvmOverloads
    fun update(
        params: AuthRuleUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRule

    /** Return all of the Auth Rules under the program. */
    @JvmOverloads
    fun list(
        params: AuthRuleListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRuleListPage

    /** Applies an existing authorization rule (Auth Rule) to an program, account, or card level. */
    @JvmOverloads
    fun apply(
        params: AuthRuleApplyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRule

    /**
     * Remove an existing authorization rule (Auth Rule) from an program, account, or card-level.
     */
    @JvmOverloads
    fun remove(
        params: AuthRuleRemoveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRuleRemoveResponse
}
