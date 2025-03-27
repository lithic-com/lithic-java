// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountCreateParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountCreateResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountListPageAsync
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountListParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetrieveParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountRetryPrenoteResponse
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountUpdateParams
import com.lithic.api.models.externalbankaccounts.ExternalBankAccountUpdateResponse
import com.lithic.api.services.async.externalbankaccounts.MicroDepositServiceAsync
import java.util.concurrent.CompletableFuture

interface ExternalBankAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun microDeposits(): MicroDepositServiceAsync

    /** Creates an external bank account within a program or Lithic account. */
    fun create(): CompletableFuture<ExternalBankAccountCreateResponse> =
        create(ExternalBankAccountCreateParams.none())

    /** @see [create] */
    fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountCreateResponse>

    /** @see [create] */
    fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none()
    ): CompletableFuture<ExternalBankAccountCreateResponse> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalBankAccountCreateResponse> =
        create(ExternalBankAccountCreateParams.none(), requestOptions)

    /** Get the external bank account by token. */
    fun retrieve(
        params: ExternalBankAccountRetrieveParams
    ): CompletableFuture<ExternalBankAccountRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetrieveResponse>

    /** Update the external bank account by token. */
    fun update(
        params: ExternalBankAccountUpdateParams
    ): CompletableFuture<ExternalBankAccountUpdateResponse> = update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountUpdateResponse>

    /** List all the external bank accounts for the provided search criteria. */
    fun list(): CompletableFuture<ExternalBankAccountListPageAsync> =
        list(ExternalBankAccountListParams.none())

    /** @see [list] */
    fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountListPageAsync>

    /** @see [list] */
    fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none()
    ): CompletableFuture<ExternalBankAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalBankAccountListPageAsync> =
        list(ExternalBankAccountListParams.none(), requestOptions)

    /** Retry external bank account micro deposit verification. */
    fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse> =
        retryMicroDeposits(params, RequestOptions.none())

    /** @see [retryMicroDeposits] */
    fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse>

    /** Retry external bank account prenote verification. */
    fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams
    ): CompletableFuture<ExternalBankAccountRetryPrenoteResponse> =
        retryPrenote(params, RequestOptions.none())

    /** @see [retryPrenote] */
    fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetryPrenoteResponse>

    /**
     * A view of [ExternalBankAccountServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        fun microDeposits(): MicroDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.create].
         */
        @MustBeClosed
        fun create(): CompletableFuture<HttpResponseFor<ExternalBankAccountCreateResponse>> =
            create(ExternalBankAccountCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountCreateResponse>>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountCreateResponse>> =
            create(ExternalBankAccountCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ExternalBankAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalBankAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: ExternalBankAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalBankAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ExternalBankAccountListPageAsync>> =
            list(ExternalBankAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountListPageAsync>> =
            list(ExternalBankAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_micro_deposits`, but is
         * otherwise the same as [ExternalBankAccountServiceAsync.retryMicroDeposits].
         */
        @MustBeClosed
        fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>> =
            retryMicroDeposits(params, RequestOptions.none())

        /** @see [retryMicroDeposits] */
        @MustBeClosed
        fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_prenote`, but is otherwise
         * the same as [ExternalBankAccountServiceAsync.retryPrenote].
         */
        @MustBeClosed
        fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryPrenoteResponse>> =
            retryPrenote(params, RequestOptions.none())

        /** @see [retryPrenote] */
        @MustBeClosed
        fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryPrenoteResponse>>
    }
}
