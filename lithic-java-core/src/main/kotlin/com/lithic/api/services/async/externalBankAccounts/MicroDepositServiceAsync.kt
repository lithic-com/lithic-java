// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.externalBankAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface MicroDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): MicroDepositServiceAsync

    /** Verify the external bank account by providing the micro deposit amounts. */
    fun create(
        externalBankAccountToken: String,
        params: ExternalBankAccountMicroDepositCreateParams,
    ): CompletableFuture<MicroDepositCreateResponse> =
        create(externalBankAccountToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        externalBankAccountToken: String,
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MicroDepositCreateResponse> =
        create(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see create */
    fun create(
        params: ExternalBankAccountMicroDepositCreateParams
    ): CompletableFuture<MicroDepositCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MicroDepositCreateResponse>

    /**
     * A view of [MicroDepositServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): MicroDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/micro_deposits`, but is
         * otherwise the same as [MicroDepositServiceAsync.create].
         */
        fun create(
            externalBankAccountToken: String,
            params: ExternalBankAccountMicroDepositCreateParams,
        ): CompletableFuture<HttpResponseFor<MicroDepositCreateResponse>> =
            create(externalBankAccountToken, params, RequestOptions.none())

        /** @see create */
        fun create(
            externalBankAccountToken: String,
            params: ExternalBankAccountMicroDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MicroDepositCreateResponse>> =
            create(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            params: ExternalBankAccountMicroDepositCreateParams
        ): CompletableFuture<HttpResponseFor<MicroDepositCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: ExternalBankAccountMicroDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MicroDepositCreateResponse>>
    }
}
