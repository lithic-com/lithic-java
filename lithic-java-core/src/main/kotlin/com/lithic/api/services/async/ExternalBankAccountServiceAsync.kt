// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ExternalBankAccount
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountCreateResponse
import com.lithic.api.models.ExternalBankAccountListPageAsync
import com.lithic.api.models.ExternalBankAccountListParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.ExternalBankAccountUnpauseParams
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.ExternalBankAccountUpdateResponse
import com.lithic.api.services.async.externalBankAccounts.MicroDepositServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExternalBankAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalBankAccountServiceAsync

    fun microDeposits(): MicroDepositServiceAsync

    /** Creates an external bank account within a program or Lithic account. */
    fun create(): CompletableFuture<ExternalBankAccountCreateResponse> =
        create(ExternalBankAccountCreateParams.none())

    /** @see create */
    fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountCreateResponse>

    /** @see create */
    fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none()
    ): CompletableFuture<ExternalBankAccountCreateResponse> = create(params, RequestOptions.none())

    /** @see create */
    fun create(
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalBankAccountCreateResponse> =
        create(ExternalBankAccountCreateParams.none(), requestOptions)

    /** Get the external bank account by token. */
    fun retrieve(
        externalBankAccountToken: String
    ): CompletableFuture<ExternalBankAccountRetrieveResponse> =
        retrieve(externalBankAccountToken, ExternalBankAccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetrieveResponse> =
        retrieve(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
    ): CompletableFuture<ExternalBankAccountRetrieveResponse> =
        retrieve(externalBankAccountToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetrieveResponse>

    /** @see retrieve */
    fun retrieve(
        params: ExternalBankAccountRetrieveParams
    ): CompletableFuture<ExternalBankAccountRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBankAccountRetrieveResponse> =
        retrieve(externalBankAccountToken, ExternalBankAccountRetrieveParams.none(), requestOptions)

    /** Update the external bank account by token. */
    fun update(
        externalBankAccountToken: String
    ): CompletableFuture<ExternalBankAccountUpdateResponse> =
        update(externalBankAccountToken, ExternalBankAccountUpdateParams.none())

    /** @see update */
    fun update(
        externalBankAccountToken: String,
        params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountUpdateResponse> =
        update(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        externalBankAccountToken: String,
        params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
    ): CompletableFuture<ExternalBankAccountUpdateResponse> =
        update(externalBankAccountToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountUpdateResponse>

    /** @see update */
    fun update(
        params: ExternalBankAccountUpdateParams
    ): CompletableFuture<ExternalBankAccountUpdateResponse> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBankAccountUpdateResponse> =
        update(externalBankAccountToken, ExternalBankAccountUpdateParams.none(), requestOptions)

    /** List all the external bank accounts for the provided search criteria. */
    fun list(): CompletableFuture<ExternalBankAccountListPageAsync> =
        list(ExternalBankAccountListParams.none())

    /** @see list */
    fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountListPageAsync>

    /** @see list */
    fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none()
    ): CompletableFuture<ExternalBankAccountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalBankAccountListPageAsync> =
        list(ExternalBankAccountListParams.none(), requestOptions)

    /** Retry external bank account micro deposit verification. */
    fun retryMicroDeposits(
        externalBankAccountToken: String
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse> =
        retryMicroDeposits(
            externalBankAccountToken,
            ExternalBankAccountRetryMicroDepositsParams.none(),
        )

    /** @see retryMicroDeposits */
    fun retryMicroDeposits(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryMicroDepositsParams =
            ExternalBankAccountRetryMicroDepositsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse> =
        retryMicroDeposits(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see retryMicroDeposits */
    fun retryMicroDeposits(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryMicroDepositsParams =
            ExternalBankAccountRetryMicroDepositsParams.none(),
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse> =
        retryMicroDeposits(externalBankAccountToken, params, RequestOptions.none())

    /** @see retryMicroDeposits */
    fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse>

    /** @see retryMicroDeposits */
    fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse> =
        retryMicroDeposits(params, RequestOptions.none())

    /** @see retryMicroDeposits */
    fun retryMicroDeposits(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBankAccountRetryMicroDepositsResponse> =
        retryMicroDeposits(
            externalBankAccountToken,
            ExternalBankAccountRetryMicroDepositsParams.none(),
            requestOptions,
        )

    /** Retry external bank account prenote verification. */
    fun retryPrenote(externalBankAccountToken: String): CompletableFuture<ExternalBankAccount> =
        retryPrenote(externalBankAccountToken, ExternalBankAccountRetryPrenoteParams.none())

    /** @see retryPrenote */
    fun retryPrenote(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryPrenoteParams =
            ExternalBankAccountRetryPrenoteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccount> =
        retryPrenote(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see retryPrenote */
    fun retryPrenote(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryPrenoteParams = ExternalBankAccountRetryPrenoteParams.none(),
    ): CompletableFuture<ExternalBankAccount> =
        retryPrenote(externalBankAccountToken, params, RequestOptions.none())

    /** @see retryPrenote */
    fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccount>

    /** @see retryPrenote */
    fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams
    ): CompletableFuture<ExternalBankAccount> = retryPrenote(params, RequestOptions.none())

    /** @see retryPrenote */
    fun retryPrenote(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBankAccount> =
        retryPrenote(
            externalBankAccountToken,
            ExternalBankAccountRetryPrenoteParams.none(),
            requestOptions,
        )

    /** Unpause an external bank account */
    fun unpause(externalBankAccountToken: String): CompletableFuture<ExternalBankAccount> =
        unpause(externalBankAccountToken, ExternalBankAccountUnpauseParams.none())

    /** @see unpause */
    fun unpause(
        externalBankAccountToken: String,
        params: ExternalBankAccountUnpauseParams = ExternalBankAccountUnpauseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccount> =
        unpause(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see unpause */
    fun unpause(
        externalBankAccountToken: String,
        params: ExternalBankAccountUnpauseParams = ExternalBankAccountUnpauseParams.none(),
    ): CompletableFuture<ExternalBankAccount> =
        unpause(externalBankAccountToken, params, RequestOptions.none())

    /** @see unpause */
    fun unpause(
        params: ExternalBankAccountUnpauseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalBankAccount>

    /** @see unpause */
    fun unpause(params: ExternalBankAccountUnpauseParams): CompletableFuture<ExternalBankAccount> =
        unpause(params, RequestOptions.none())

    /** @see unpause */
    fun unpause(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExternalBankAccount> =
        unpause(externalBankAccountToken, ExternalBankAccountUnpauseParams.none(), requestOptions)

    /**
     * A view of [ExternalBankAccountServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExternalBankAccountServiceAsync.WithRawResponse

        fun microDeposits(): MicroDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.create].
         */
        fun create(): CompletableFuture<HttpResponseFor<ExternalBankAccountCreateResponse>> =
            create(ExternalBankAccountCreateParams.none())

        /** @see create */
        fun create(
            params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountCreateResponse>>

        /** @see create */
        fun create(
            params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountCreateResponse>> =
            create(ExternalBankAccountCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountServiceAsync.retrieve].
         */
        fun retrieve(
            externalBankAccountToken: String
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetrieveResponse>> =
            retrieve(externalBankAccountToken, ExternalBankAccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetrieveResponse>> =
            retrieve(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetrieveResponse>> =
            retrieve(externalBankAccountToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: ExternalBankAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: ExternalBankAccountRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetrieveResponse>> =
            retrieve(
                externalBankAccountToken,
                ExternalBankAccountRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountServiceAsync.update].
         */
        fun update(
            externalBankAccountToken: String
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountUpdateResponse>> =
            update(externalBankAccountToken, ExternalBankAccountUpdateParams.none())

        /** @see update */
        fun update(
            externalBankAccountToken: String,
            params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountUpdateResponse>> =
            update(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            externalBankAccountToken: String,
            params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountUpdateResponse>> =
            update(externalBankAccountToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: ExternalBankAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountUpdateResponse>>

        /** @see update */
        fun update(
            params: ExternalBankAccountUpdateParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountUpdateResponse>> =
            update(externalBankAccountToken, ExternalBankAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ExternalBankAccountListPageAsync>> =
            list(ExternalBankAccountListParams.none())

        /** @see list */
        fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountListPageAsync>>

        /** @see list */
        fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountListPageAsync>> =
            list(ExternalBankAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_micro_deposits`, but is
         * otherwise the same as [ExternalBankAccountServiceAsync.retryMicroDeposits].
         */
        fun retryMicroDeposits(
            externalBankAccountToken: String
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>> =
            retryMicroDeposits(
                externalBankAccountToken,
                ExternalBankAccountRetryMicroDepositsParams.none(),
            )

        /** @see retryMicroDeposits */
        fun retryMicroDeposits(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryMicroDepositsParams =
                ExternalBankAccountRetryMicroDepositsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>> =
            retryMicroDeposits(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see retryMicroDeposits */
        fun retryMicroDeposits(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryMicroDepositsParams =
                ExternalBankAccountRetryMicroDepositsParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>> =
            retryMicroDeposits(externalBankAccountToken, params, RequestOptions.none())

        /** @see retryMicroDeposits */
        fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>>

        /** @see retryMicroDeposits */
        fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>> =
            retryMicroDeposits(params, RequestOptions.none())

        /** @see retryMicroDeposits */
        fun retryMicroDeposits(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>> =
            retryMicroDeposits(
                externalBankAccountToken,
                ExternalBankAccountRetryMicroDepositsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_prenote`, but is otherwise
         * the same as [ExternalBankAccountServiceAsync.retryPrenote].
         */
        fun retryPrenote(
            externalBankAccountToken: String
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            retryPrenote(externalBankAccountToken, ExternalBankAccountRetryPrenoteParams.none())

        /** @see retryPrenote */
        fun retryPrenote(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryPrenoteParams =
                ExternalBankAccountRetryPrenoteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            retryPrenote(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see retryPrenote */
        fun retryPrenote(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryPrenoteParams =
                ExternalBankAccountRetryPrenoteParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            retryPrenote(externalBankAccountToken, params, RequestOptions.none())

        /** @see retryPrenote */
        fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>>

        /** @see retryPrenote */
        fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            retryPrenote(params, RequestOptions.none())

        /** @see retryPrenote */
        fun retryPrenote(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            retryPrenote(
                externalBankAccountToken,
                ExternalBankAccountRetryPrenoteParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/unpause`, but is otherwise the
         * same as [ExternalBankAccountServiceAsync.unpause].
         */
        fun unpause(
            externalBankAccountToken: String
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            unpause(externalBankAccountToken, ExternalBankAccountUnpauseParams.none())

        /** @see unpause */
        fun unpause(
            externalBankAccountToken: String,
            params: ExternalBankAccountUnpauseParams = ExternalBankAccountUnpauseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            unpause(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see unpause */
        fun unpause(
            externalBankAccountToken: String,
            params: ExternalBankAccountUnpauseParams = ExternalBankAccountUnpauseParams.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            unpause(externalBankAccountToken, params, RequestOptions.none())

        /** @see unpause */
        fun unpause(
            params: ExternalBankAccountUnpauseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>>

        /** @see unpause */
        fun unpause(
            params: ExternalBankAccountUnpauseParams
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            unpause(params, RequestOptions.none())

        /** @see unpause */
        fun unpause(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExternalBankAccount>> =
            unpause(
                externalBankAccountToken,
                ExternalBankAccountUnpauseParams.none(),
                requestOptions,
            )
    }
}
