// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.externalbankaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.externalbankaccounts.microdeposits.MicroDepositCreateParams
import com.lithic.api.models.externalbankaccounts.microdeposits.MicroDepositCreateResponse
import java.util.concurrent.CompletableFuture

interface MicroDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Verify the external bank account by providing the micro deposit amounts. */
    fun create(params: MicroDepositCreateParams): CompletableFuture<MicroDepositCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: MicroDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<MicroDepositCreateResponse>

    /**
     * A view of [MicroDepositServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/micro_deposits`, but is
         * otherwise the same as [MicroDepositServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: MicroDepositCreateParams
        ): CompletableFuture<HttpResponseFor<MicroDepositCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: MicroDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<MicroDepositCreateResponse>>
    }
}
