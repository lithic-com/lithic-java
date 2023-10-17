// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.accounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AccountCreditConfigurationRetrieveParams
import com.lithic.api.models.AccountCreditConfigurationUpdateParams
import com.lithic.api.models.BusinessAccount

interface CreditConfigurationService {

    /** Get an Account's credit configuration */
    @JvmOverloads
    fun retrieve(
        params: AccountCreditConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BusinessAccount

    /** Update a Business Accounts credit configuration */
    @JvmOverloads
    fun update(
        params: AccountCreditConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BusinessAccount
}
