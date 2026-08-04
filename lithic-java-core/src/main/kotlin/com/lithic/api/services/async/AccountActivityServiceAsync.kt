// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AccountActivityListPageAsync
import com.lithic.api.models.AccountActivityListParams
import com.lithic.api.models.AccountActivityRetrieveTransactionParams
import com.lithic.api.models.AccountActivityRetrieveTransactionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountActivityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountActivityServiceAsync

    /** Retrieve a list of transactions across all public accounts. */
    fun list(): CompletableFuture<AccountActivityListPageAsync> =
        list(AccountActivityListParams.none())

    /** @see list */
    fun list(
        params: AccountActivityListParams = AccountActivityListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountActivityListPageAsync>

    /** @see list */
    fun list(
        params: AccountActivityListParams = AccountActivityListParams.none()
    ): CompletableFuture<AccountActivityListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountActivityListPageAsync> =
        list(AccountActivityListParams.none(), requestOptions)

    /** Retrieve a single transaction */
    fun retrieveTransaction(
        transactionToken: String
    ): CompletableFuture<AccountActivityRetrieveTransactionResponse> =
        retrieveTransaction(transactionToken, AccountActivityRetrieveTransactionParams.none())

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        transactionToken: String,
        params: AccountActivityRetrieveTransactionParams =
            AccountActivityRetrieveTransactionParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountActivityRetrieveTransactionResponse> =
        retrieveTransaction(
            params.toBuilder().transactionToken(transactionToken).build(),
            requestOptions,
        )

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        transactionToken: String,
        params: AccountActivityRetrieveTransactionParams =
            AccountActivityRetrieveTransactionParams.none(),
    ): CompletableFuture<AccountActivityRetrieveTransactionResponse> =
        retrieveTransaction(transactionToken, params, RequestOptions.none())

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        params: AccountActivityRetrieveTransactionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountActivityRetrieveTransactionResponse>

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        params: AccountActivityRetrieveTransactionParams
    ): CompletableFuture<AccountActivityRetrieveTransactionResponse> =
        retrieveTransaction(params, RequestOptions.none())

    /** @see retrieveTransaction */
    fun retrieveTransaction(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountActivityRetrieveTransactionResponse> =
        retrieveTransaction(
            transactionToken,
            AccountActivityRetrieveTransactionParams.none(),
            requestOptions,
        )

    /**
     * A view of [AccountActivityServiceAsync] that provides access to raw HTTP responses for each
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
        ): AccountActivityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/account_activity`, but is otherwise the same as
         * [AccountActivityServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountActivityListPageAsync>> =
            list(AccountActivityListParams.none())

        /** @see list */
        fun list(
            params: AccountActivityListParams = AccountActivityListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountActivityListPageAsync>>

        /** @see list */
        fun list(
            params: AccountActivityListParams = AccountActivityListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountActivityListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountActivityListPageAsync>> =
            list(AccountActivityListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/account_activity/{transaction_token}`, but is
         * otherwise the same as [AccountActivityServiceAsync.retrieveTransaction].
         */
        fun retrieveTransaction(
            transactionToken: String
        ): CompletableFuture<HttpResponseFor<AccountActivityRetrieveTransactionResponse>> =
            retrieveTransaction(transactionToken, AccountActivityRetrieveTransactionParams.none())

        /** @see retrieveTransaction */
        fun retrieveTransaction(
            transactionToken: String,
            params: AccountActivityRetrieveTransactionParams =
                AccountActivityRetrieveTransactionParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountActivityRetrieveTransactionResponse>> =
            retrieveTransaction(
                params.toBuilder().transactionToken(transactionToken).build(),
                requestOptions,
            )

        /** @see retrieveTransaction */
        fun retrieveTransaction(
            transactionToken: String,
            params: AccountActivityRetrieveTransactionParams =
                AccountActivityRetrieveTransactionParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountActivityRetrieveTransactionResponse>> =
            retrieveTransaction(transactionToken, params, RequestOptions.none())

        /** @see retrieveTransaction */
        fun retrieveTransaction(
            params: AccountActivityRetrieveTransactionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountActivityRetrieveTransactionResponse>>

        /** @see retrieveTransaction */
        fun retrieveTransaction(
            params: AccountActivityRetrieveTransactionParams
        ): CompletableFuture<HttpResponseFor<AccountActivityRetrieveTransactionResponse>> =
            retrieveTransaction(params, RequestOptions.none())

        /** @see retrieveTransaction */
        fun retrieveTransaction(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountActivityRetrieveTransactionResponse>> =
            retrieveTransaction(
                transactionToken,
                AccountActivityRetrieveTransactionParams.none(),
                requestOptions,
            )
    }
}
