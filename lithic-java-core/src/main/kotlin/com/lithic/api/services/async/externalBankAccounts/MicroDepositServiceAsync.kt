// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.externalBankAccounts

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse
import java.util.concurrent.CompletableFuture

interface MicroDepositServiceAsync {

    /** Verify the external bank account by providing the micro deposit amounts. */
    @JvmOverloads
    fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<MicroDepositCreateResponse>
}
