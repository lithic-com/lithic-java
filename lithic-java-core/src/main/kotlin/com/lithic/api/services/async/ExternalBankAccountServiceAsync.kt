// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountCreateResponse
import com.lithic.api.models.ExternalBankAccountListPageAsync
import com.lithic.api.models.ExternalBankAccountListParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.ExternalBankAccountRetryPrenoteResponse
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.ExternalBankAccountUpdateResponse
import com.lithic.api.services.async.externalBankAccounts.MicroDepositServiceAsync
import java.util.concurrent.CompletableFuture

interface ExternalBankAccountServiceAsync {

    fun microDeposits(): MicroDepositServiceAsync

    /** Creates an external bank account within a program or Lithic account. */
    @JvmOverloads
    fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountCreateResponse>

    /** Creates an external bank account within a program or Lithic account. */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalBankAccountCreateResponse> =
        create(ExternalBankAccountCreateParams.none(), requestOptions)

    /** Get the external bank account by token. */
    @JvmOverloads
    fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetrieveResponse>

    /** Update the external bank account by token. */
    @JvmOverloads
    fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountUpdateResponse>

    /** List all the external bank accounts for the provided search criteria. */
    @JvmOverloads
    fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountListPageAsync>

    /** List all the external bank accounts for the provided search criteria. */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalBankAccountListPageAsync> =
        list(ExternalBankAccountListParams.none(), requestOptions)

    /** Retry external bank account micro deposit verification. */
    @JvmOverloads
    fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse>

    /** Retry external bank account prenote verification. */
    @JvmOverloads
    fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetryPrenoteResponse>
}
