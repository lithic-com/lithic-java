@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountCreateResponse
import com.lithic.api.models.ExternalBankAccountListPage
import com.lithic.api.models.ExternalBankAccountListParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.ExternalBankAccountUpdateResponse
import com.lithic.api.services.blocking.externalBankAccounts.MicroDepositService

interface ExternalBankAccountService {

    fun microDeposits(): MicroDepositService

    /** Creates an external bank account within a program or Lithic account. */
    @JvmOverloads
    fun create(
        params: ExternalBankAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalBankAccountCreateResponse

    /** Get the external bank account by token. */
    @JvmOverloads
    fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalBankAccountRetrieveResponse

    /** Update the external bank account by token. */
    @JvmOverloads
    fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalBankAccountUpdateResponse

    /** List all the external bank accounts for the provided search criteria. */
    @JvmOverloads
    fun list(
        params: ExternalBankAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalBankAccountListPage
}
