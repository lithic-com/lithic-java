// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Account
import com.lithic.api.models.AccountListPage
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.AccountRetrieveParams
import com.lithic.api.models.AccountRetrieveSpendLimitsParams
import com.lithic.api.models.AccountSpendLimits
import com.lithic.api.models.AccountUpdateParams

interface AccountService {

    /** Get account configuration such as spend limits. */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /**
     * Update account configuration such as spend limits and verification address. Can only be run
     * on accounts that are part of the program managed by this API key.
     *
     * Accounts that are in the `PAUSED` state will not be able to transact or create new cards.
     */
    @JvmOverloads
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** List account configurations. */
    @JvmOverloads
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountListPage

    /**
     * Get an Account's available spend limits, which is based on the spend limit configured on the
     * Account and the amount already spent over the spend limit's duration. For example, if the
     * Account has a daily spend limit of $1000 configured, and has spent $600 in the last 24 hours,
     * the available spend limit returned would be $400.
     */
    @JvmOverloads
    fun retrieveSpendLimits(
        params: AccountRetrieveSpendLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountSpendLimits
}
