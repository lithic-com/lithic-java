// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Account
import com.lithic.api.models.AccountListPageAsync
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.AccountRetrieveParams
import com.lithic.api.models.AccountRetrieveSpendLimitsParams
import com.lithic.api.models.AccountSpendLimits
import com.lithic.api.models.AccountUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountServiceAsync

    /** Get account configuration such as spend limits. */
    fun retrieve(accountToken: String): CompletableFuture<Account> =
        retrieve(accountToken, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accountToken: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account> =
        retrieve(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accountToken: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): CompletableFuture<Account> = retrieve(accountToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): CompletableFuture<Account> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(accountToken: String, requestOptions: RequestOptions): CompletableFuture<Account> =
        retrieve(accountToken, AccountRetrieveParams.none(), requestOptions)

    /**
     * Update account configuration such as state or spend limits. Can only be run on accounts that
     * are part of the program managed by this API key. Accounts that are in the `PAUSED` state will
     * not be able to transact or create new cards.
     */
    fun update(accountToken: String): CompletableFuture<Account> =
        update(accountToken, AccountUpdateParams.none())

    /** @see update */
    fun update(
        accountToken: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account> =
        update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see update */
    fun update(
        accountToken: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
    ): CompletableFuture<Account> = update(accountToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Account>

    /** @see update */
    fun update(params: AccountUpdateParams): CompletableFuture<Account> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(accountToken: String, requestOptions: RequestOptions): CompletableFuture<Account> =
        update(accountToken, AccountUpdateParams.none(), requestOptions)

    /** List account configurations. */
    fun list(): CompletableFuture<AccountListPageAsync> = list(AccountListParams.none())

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountListPageAsync>

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none()
    ): CompletableFuture<AccountListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AccountListPageAsync> =
        list(AccountListParams.none(), requestOptions)

    /**
     * Get an Account's available spend limits, which is based on the spend limit configured on the
     * Account and the amount already spent over the spend limit's duration. For example, if the
     * Account has a daily spend limit of $1000 configured, and has spent $600 in the last 24 hours,
     * the available spend limit returned would be $400.
     */
    fun retrieveSpendLimits(accountToken: String): CompletableFuture<AccountSpendLimits> =
        retrieveSpendLimits(accountToken, AccountRetrieveSpendLimitsParams.none())

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        accountToken: String,
        params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountSpendLimits> =
        retrieveSpendLimits(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        accountToken: String,
        params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
    ): CompletableFuture<AccountSpendLimits> =
        retrieveSpendLimits(accountToken, params, RequestOptions.none())

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        params: AccountRetrieveSpendLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountSpendLimits>

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        params: AccountRetrieveSpendLimitsParams
    ): CompletableFuture<AccountSpendLimits> = retrieveSpendLimits(params, RequestOptions.none())

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        accountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountSpendLimits> =
        retrieveSpendLimits(accountToken, AccountRetrieveSpendLimitsParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_token}`, but is otherwise the
         * same as [AccountServiceAsync.retrieve].
         */
        fun retrieve(accountToken: String): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(accountToken, AccountRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            accountToken: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            accountToken: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(accountToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /** @see retrieve */
        fun retrieve(params: AccountRetrieveParams): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            accountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> =
            retrieve(accountToken, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{account_token}`, but is otherwise
         * the same as [AccountServiceAsync.update].
         */
        fun update(accountToken: String): CompletableFuture<HttpResponseFor<Account>> =
            update(accountToken, AccountUpdateParams.none())

        /** @see update */
        fun update(
            accountToken: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see update */
        fun update(
            accountToken: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<Account>> =
            update(accountToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Account>>

        /** @see update */
        fun update(params: AccountUpdateParams): CompletableFuture<HttpResponseFor<Account>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            accountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Account>> =
            update(accountToken, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none())

        /** @see list */
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>>

        /** @see list */
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AccountListPageAsync>> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_token}/spend_limits`, but is
         * otherwise the same as [AccountServiceAsync.retrieveSpendLimits].
         */
        fun retrieveSpendLimits(
            accountToken: String
        ): CompletableFuture<HttpResponseFor<AccountSpendLimits>> =
            retrieveSpendLimits(accountToken, AccountRetrieveSpendLimitsParams.none())

        /** @see retrieveSpendLimits */
        fun retrieveSpendLimits(
            accountToken: String,
            params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountSpendLimits>> =
            retrieveSpendLimits(
                params.toBuilder().accountToken(accountToken).build(),
                requestOptions,
            )

        /** @see retrieveSpendLimits */
        fun retrieveSpendLimits(
            accountToken: String,
            params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
        ): CompletableFuture<HttpResponseFor<AccountSpendLimits>> =
            retrieveSpendLimits(accountToken, params, RequestOptions.none())

        /** @see retrieveSpendLimits */
        fun retrieveSpendLimits(
            params: AccountRetrieveSpendLimitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountSpendLimits>>

        /** @see retrieveSpendLimits */
        fun retrieveSpendLimits(
            params: AccountRetrieveSpendLimitsParams
        ): CompletableFuture<HttpResponseFor<AccountSpendLimits>> =
            retrieveSpendLimits(params, RequestOptions.none())

        /** @see retrieveSpendLimits */
        fun retrieveSpendLimits(
            accountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountSpendLimits>> =
            retrieveSpendLimits(
                accountToken,
                AccountRetrieveSpendLimitsParams.none(),
                requestOptions,
            )
    }
}
