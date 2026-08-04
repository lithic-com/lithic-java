// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AccountActivityListPage
import com.lithic.api.models.AccountActivityListParams
import com.lithic.api.models.AccountActivityRetrieveTransactionParams
import com.lithic.api.models.AccountActivityRetrieveTransactionResponse
import java.util.function.Consumer

interface AccountActivityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountActivityService

    /** Retrieve a list of transactions across all public accounts. */
    fun list(): AccountActivityListPage = list(AccountActivityListParams.none())

    /** @see list */
    fun list(
        params: AccountActivityListParams = AccountActivityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountActivityListPage

    /** @see list */
    fun list(
        params: AccountActivityListParams = AccountActivityListParams.none()
    ): AccountActivityListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountActivityListPage =
        list(AccountActivityListParams.none(), requestOptions)

    /** Retrieve a single transaction */
    fun retrieveTransaction(transactionToken: String): AccountActivityRetrieveTransactionResponse =
        retrieveTransaction(transactionToken, AccountActivityRetrieveTransactionParams.none())

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        transactionToken: String,
        params: AccountActivityRetrieveTransactionParams =
            AccountActivityRetrieveTransactionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountActivityRetrieveTransactionResponse =
        retrieveTransaction(
            params.toBuilder().transactionToken(transactionToken).build(),
            requestOptions,
        )

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        transactionToken: String,
        params: AccountActivityRetrieveTransactionParams =
            AccountActivityRetrieveTransactionParams.none(),
    ): AccountActivityRetrieveTransactionResponse =
        retrieveTransaction(transactionToken, params, RequestOptions.none())

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        params: AccountActivityRetrieveTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountActivityRetrieveTransactionResponse

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        params: AccountActivityRetrieveTransactionParams
    ): AccountActivityRetrieveTransactionResponse =
        retrieveTransaction(params, RequestOptions.none())

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): AccountActivityRetrieveTransactionResponse =
        retrieveTransaction(
            transactionToken,
            AccountActivityRetrieveTransactionParams.none(),
            requestOptions,
        )

    /**
     * A view of [AccountActivityService] that provides access to raw HTTP responses for each
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
        ): AccountActivityService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/account_activity`, but is otherwise the same as
         * [AccountActivityService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AccountActivityListPage> =
            list(AccountActivityListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountActivityListParams = AccountActivityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountActivityListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountActivityListParams = AccountActivityListParams.none()
        ): HttpResponseFor<AccountActivityListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountActivityListPage> =
            list(AccountActivityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/account_activity/{transaction_token}`, but is
         * otherwise the same as [AccountActivityService.retrieveTransaction].
         */
        @MustBeClosed
        fun retrieveTransaction(
            transactionToken: String
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> =
            retrieveTransaction(transactionToken, AccountActivityRetrieveTransactionParams.none())

        /** @see retrieveTransaction */
        @MustBeClosed
        fun retrieveTransaction(
            transactionToken: String,
            params: AccountActivityRetrieveTransactionParams =
                AccountActivityRetrieveTransactionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> =
            retrieveTransaction(
                params.toBuilder().transactionToken(transactionToken).build(),
                requestOptions,
            )

        /** @see retrieveTransaction */
        @MustBeClosed
        fun retrieveTransaction(
            transactionToken: String,
            params: AccountActivityRetrieveTransactionParams =
                AccountActivityRetrieveTransactionParams.none(),
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> =
            retrieveTransaction(transactionToken, params, RequestOptions.none())

        /** @see retrieveTransaction */
        @MustBeClosed
        fun retrieveTransaction(
            params: AccountActivityRetrieveTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse>

        /** @see retrieveTransaction */
        @MustBeClosed
        fun retrieveTransaction(
            params: AccountActivityRetrieveTransactionParams
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> =
            retrieveTransaction(params, RequestOptions.none())

        /** @see retrieveTransaction */
        @MustBeClosed
        fun retrieveTransaction(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> =
            retrieveTransaction(
                transactionToken,
                AccountActivityRetrieveTransactionParams.none(),
                requestOptions,
            )
    }
}
