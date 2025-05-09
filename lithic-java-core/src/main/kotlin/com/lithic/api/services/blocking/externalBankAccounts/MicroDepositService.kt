// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.externalBankAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse

interface MicroDepositService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Verify the external bank account by providing the micro deposit amounts. */
    fun create(
        externalBankAccountToken: String,
        params: ExternalBankAccountMicroDepositCreateParams,
    ): MicroDepositCreateResponse = create(externalBankAccountToken, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        externalBankAccountToken: String,
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MicroDepositCreateResponse =
        create(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see [create] */
    fun create(params: ExternalBankAccountMicroDepositCreateParams): MicroDepositCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): MicroDepositCreateResponse

    /**
     * A view of [MicroDepositService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/micro_deposits`, but is
         * otherwise the same as [MicroDepositService.create].
         */
        @MustBeClosed
        fun create(
            externalBankAccountToken: String,
            params: ExternalBankAccountMicroDepositCreateParams,
        ): HttpResponseFor<MicroDepositCreateResponse> =
            create(externalBankAccountToken, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            externalBankAccountToken: String,
            params: ExternalBankAccountMicroDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MicroDepositCreateResponse> =
            create(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalBankAccountMicroDepositCreateParams
        ): HttpResponseFor<MicroDepositCreateResponse> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalBankAccountMicroDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<MicroDepositCreateResponse>
    }
}
