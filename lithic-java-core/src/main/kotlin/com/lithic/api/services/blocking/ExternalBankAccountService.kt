// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountCreateResponse
import com.lithic.api.models.ExternalBankAccountListPage
import com.lithic.api.models.ExternalBankAccountListParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.ExternalBankAccountRetryPrenoteResponse
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.ExternalBankAccountUpdateResponse
import com.lithic.api.services.blocking.externalBankAccounts.MicroDepositService
import java.util.function.Consumer

interface ExternalBankAccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExternalBankAccountService

    fun microDeposits(): MicroDepositService

    /** Creates an external bank account within a program or Lithic account. */
    fun create(): ExternalBankAccountCreateResponse = create(ExternalBankAccountCreateParams.none())

    /** @see [create] */
    fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountCreateResponse

    /** @see [create] */
    fun create(
        params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none()
    ): ExternalBankAccountCreateResponse = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(requestOptions: RequestOptions): ExternalBankAccountCreateResponse =
        create(ExternalBankAccountCreateParams.none(), requestOptions)

    /** Get the external bank account by token. */
    fun retrieve(externalBankAccountToken: String): ExternalBankAccountRetrieveResponse =
        retrieve(externalBankAccountToken, ExternalBankAccountRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetrieveResponse =
        retrieve(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
    ): ExternalBankAccountRetrieveResponse =
        retrieve(externalBankAccountToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: ExternalBankAccountRetrieveParams): ExternalBankAccountRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccountRetrieveResponse =
        retrieve(externalBankAccountToken, ExternalBankAccountRetrieveParams.none(), requestOptions)

    /** Update the external bank account by token. */
    fun update(externalBankAccountToken: String): ExternalBankAccountUpdateResponse =
        update(externalBankAccountToken, ExternalBankAccountUpdateParams.none())

    /** @see [update] */
    fun update(
        externalBankAccountToken: String,
        params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountUpdateResponse =
        update(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see [update] */
    fun update(
        externalBankAccountToken: String,
        params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
    ): ExternalBankAccountUpdateResponse =
        update(externalBankAccountToken, params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountUpdateResponse

    /** @see [update] */
    fun update(params: ExternalBankAccountUpdateParams): ExternalBankAccountUpdateResponse =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccountUpdateResponse =
        update(externalBankAccountToken, ExternalBankAccountUpdateParams.none(), requestOptions)

    /** List all the external bank accounts for the provided search criteria. */
    fun list(): ExternalBankAccountListPage = list(ExternalBankAccountListParams.none())

    /** @see [list] */
    fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountListPage

    /** @see [list] */
    fun list(
        params: ExternalBankAccountListParams = ExternalBankAccountListParams.none()
    ): ExternalBankAccountListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ExternalBankAccountListPage =
        list(ExternalBankAccountListParams.none(), requestOptions)

    /** Retry external bank account micro deposit verification. */
    fun retryMicroDeposits(
        externalBankAccountToken: String
    ): ExternalBankAccountRetryMicroDepositsResponse =
        retryMicroDeposits(
            externalBankAccountToken,
            ExternalBankAccountRetryMicroDepositsParams.none(),
        )

    /** @see [retryMicroDeposits] */
    fun retryMicroDeposits(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryMicroDepositsParams =
            ExternalBankAccountRetryMicroDepositsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryMicroDepositsResponse =
        retryMicroDeposits(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see [retryMicroDeposits] */
    fun retryMicroDeposits(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryMicroDepositsParams =
            ExternalBankAccountRetryMicroDepositsParams.none(),
    ): ExternalBankAccountRetryMicroDepositsResponse =
        retryMicroDeposits(externalBankAccountToken, params, RequestOptions.none())

    /** @see [retryMicroDeposits] */
    fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryMicroDepositsResponse

    /** @see [retryMicroDeposits] */
    fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams
    ): ExternalBankAccountRetryMicroDepositsResponse =
        retryMicroDeposits(params, RequestOptions.none())

    /** @see [retryMicroDeposits] */
    fun retryMicroDeposits(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccountRetryMicroDepositsResponse =
        retryMicroDeposits(
            externalBankAccountToken,
            ExternalBankAccountRetryMicroDepositsParams.none(),
            requestOptions,
        )

    /** Retry external bank account prenote verification. */
    fun retryPrenote(externalBankAccountToken: String): ExternalBankAccountRetryPrenoteResponse =
        retryPrenote(externalBankAccountToken, ExternalBankAccountRetryPrenoteParams.none())

    /** @see [retryPrenote] */
    fun retryPrenote(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryPrenoteParams =
            ExternalBankAccountRetryPrenoteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryPrenoteResponse =
        retryPrenote(
            params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
            requestOptions,
        )

    /** @see [retryPrenote] */
    fun retryPrenote(
        externalBankAccountToken: String,
        params: ExternalBankAccountRetryPrenoteParams = ExternalBankAccountRetryPrenoteParams.none(),
    ): ExternalBankAccountRetryPrenoteResponse =
        retryPrenote(externalBankAccountToken, params, RequestOptions.none())

    /** @see [retryPrenote] */
    fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalBankAccountRetryPrenoteResponse

    /** @see [retryPrenote] */
    fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams
    ): ExternalBankAccountRetryPrenoteResponse = retryPrenote(params, RequestOptions.none())

    /** @see [retryPrenote] */
    fun retryPrenote(
        externalBankAccountToken: String,
        requestOptions: RequestOptions,
    ): ExternalBankAccountRetryPrenoteResponse =
        retryPrenote(
            externalBankAccountToken,
            ExternalBankAccountRetryPrenoteParams.none(),
            requestOptions,
        )

    /**
     * A view of [ExternalBankAccountService] that provides access to raw HTTP responses for each
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
        ): ExternalBankAccountService.WithRawResponse

        fun microDeposits(): MicroDepositService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountService.create].
         */
        @MustBeClosed
        fun create(): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(ExternalBankAccountCreateParams.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountCreateResponse>

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalBankAccountCreateParams = ExternalBankAccountCreateParams.none()
        ): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            requestOptions: RequestOptions
        ): HttpResponseFor<ExternalBankAccountCreateResponse> =
            create(ExternalBankAccountCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            externalBankAccountToken: String
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse> =
            retrieve(externalBankAccountToken, ExternalBankAccountRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse> =
            retrieve(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetrieveParams = ExternalBankAccountRetrieveParams.none(),
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse> =
            retrieve(externalBankAccountToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalBankAccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalBankAccountRetrieveParams
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountRetrieveResponse> =
            retrieve(
                externalBankAccountToken,
                ExternalBankAccountRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /v1/external_bank_accounts/{external_bank_account_token}`, but is otherwise the same as
         * [ExternalBankAccountService.update].
         */
        @MustBeClosed
        fun update(
            externalBankAccountToken: String
        ): HttpResponseFor<ExternalBankAccountUpdateResponse> =
            update(externalBankAccountToken, ExternalBankAccountUpdateParams.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            externalBankAccountToken: String,
            params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountUpdateResponse> =
            update(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see [update] */
        @MustBeClosed
        fun update(
            externalBankAccountToken: String,
            params: ExternalBankAccountUpdateParams = ExternalBankAccountUpdateParams.none(),
        ): HttpResponseFor<ExternalBankAccountUpdateResponse> =
            update(externalBankAccountToken, params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalBankAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountUpdateResponse>

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: ExternalBankAccountUpdateParams
        ): HttpResponseFor<ExternalBankAccountUpdateResponse> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountUpdateResponse> =
            update(externalBankAccountToken, ExternalBankAccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/external_bank_accounts`, but is otherwise the
         * same as [ExternalBankAccountService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ExternalBankAccountListPage> =
            list(ExternalBankAccountListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalBankAccountListParams = ExternalBankAccountListParams.none()
        ): HttpResponseFor<ExternalBankAccountListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalBankAccountListPage> =
            list(ExternalBankAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_micro_deposits`, but is
         * otherwise the same as [ExternalBankAccountService.retryMicroDeposits].
         */
        @MustBeClosed
        fun retryMicroDeposits(
            externalBankAccountToken: String
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse> =
            retryMicroDeposits(
                externalBankAccountToken,
                ExternalBankAccountRetryMicroDepositsParams.none(),
            )

        /** @see [retryMicroDeposits] */
        @MustBeClosed
        fun retryMicroDeposits(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryMicroDepositsParams =
                ExternalBankAccountRetryMicroDepositsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse> =
            retryMicroDeposits(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see [retryMicroDeposits] */
        @MustBeClosed
        fun retryMicroDeposits(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryMicroDepositsParams =
                ExternalBankAccountRetryMicroDepositsParams.none(),
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse> =
            retryMicroDeposits(externalBankAccountToken, params, RequestOptions.none())

        /** @see [retryMicroDeposits] */
        @MustBeClosed
        fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse>

        /** @see [retryMicroDeposits] */
        @MustBeClosed
        fun retryMicroDeposits(
            params: ExternalBankAccountRetryMicroDepositsParams
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse> =
            retryMicroDeposits(params, RequestOptions.none())

        /** @see [retryMicroDeposits] */
        @MustBeClosed
        fun retryMicroDeposits(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountRetryMicroDepositsResponse> =
            retryMicroDeposits(
                externalBankAccountToken,
                ExternalBankAccountRetryMicroDepositsParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_bank_accounts/{external_bank_account_token}/retry_prenote`, but is otherwise
         * the same as [ExternalBankAccountService.retryPrenote].
         */
        @MustBeClosed
        fun retryPrenote(
            externalBankAccountToken: String
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse> =
            retryPrenote(externalBankAccountToken, ExternalBankAccountRetryPrenoteParams.none())

        /** @see [retryPrenote] */
        @MustBeClosed
        fun retryPrenote(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryPrenoteParams =
                ExternalBankAccountRetryPrenoteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse> =
            retryPrenote(
                params.toBuilder().externalBankAccountToken(externalBankAccountToken).build(),
                requestOptions,
            )

        /** @see [retryPrenote] */
        @MustBeClosed
        fun retryPrenote(
            externalBankAccountToken: String,
            params: ExternalBankAccountRetryPrenoteParams =
                ExternalBankAccountRetryPrenoteParams.none(),
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse> =
            retryPrenote(externalBankAccountToken, params, RequestOptions.none())

        /** @see [retryPrenote] */
        @MustBeClosed
        fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse>

        /** @see [retryPrenote] */
        @MustBeClosed
        fun retryPrenote(
            params: ExternalBankAccountRetryPrenoteParams
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse> =
            retryPrenote(params, RequestOptions.none())

        /** @see [retryPrenote] */
        @MustBeClosed
        fun retryPrenote(
            externalBankAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalBankAccountRetryPrenoteResponse> =
            retryPrenote(
                externalBankAccountToken,
                ExternalBankAccountRetryPrenoteParams.none(),
                requestOptions,
            )
    }
}
