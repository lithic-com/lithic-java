@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Account
import com.lithic.api.models.AccountListPageAsync
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.AccountRetrieveParams
import com.lithic.api.models.AccountUpdateParams
import java.util.concurrent.CompletableFuture

interface AccountServiceAsync {

    /** Get account configuration such as spend limits. */
    @JvmOverloads
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Account>

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
    ): CompletableFuture<Account>

    /** List account configurations. */
    @JvmOverloads
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<AccountListPageAsync>
}
