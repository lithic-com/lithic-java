// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Account
import com.lithic.api.models.AccountListPage
import com.lithic.api.models.AccountListParams
import com.lithic.api.models.AccountRetrieveParams
import com.lithic.api.models.AccountRetrieveSignalsParams
import com.lithic.api.models.AccountRetrieveSpendLimitsParams
import com.lithic.api.models.AccountSpendLimits
import com.lithic.api.models.AccountUpdateParams
import com.lithic.api.models.SignalsResponse
import java.util.function.Consumer

interface AccountService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService

    /** Get account configuration such as spend limits. */
    fun retrieve(accountToken: String): Account =
        retrieve(accountToken, AccountRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        accountToken: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = retrieve(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        accountToken: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
    ): Account = retrieve(accountToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see retrieve */
    fun retrieve(params: AccountRetrieveParams): Account = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(accountToken: String, requestOptions: RequestOptions): Account =
        retrieve(accountToken, AccountRetrieveParams.none(), requestOptions)

    /**
     * Update account configuration such as state or spend limits. Can only be run on accounts that
     * are part of the program managed by this API key. Accounts that are in the `PAUSED` state will
     * not be able to transact or create new cards.
     */
    fun update(accountToken: String): Account = update(accountToken, AccountUpdateParams.none())

    /** @see update */
    fun update(
        accountToken: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see update */
    fun update(
        accountToken: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
    ): Account = update(accountToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see update */
    fun update(params: AccountUpdateParams): Account = update(params, RequestOptions.none())

    /** @see update */
    fun update(accountToken: String, requestOptions: RequestOptions): Account =
        update(accountToken, AccountUpdateParams.none(), requestOptions)

    /** List account configurations. */
    fun list(): AccountListPage = list(AccountListParams.none())

    /** @see list */
    fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListPage

    /** @see list */
    fun list(params: AccountListParams = AccountListParams.none()): AccountListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountListPage =
        list(AccountListParams.none(), requestOptions)

    /**
     * Returns behavioral feature state derived from an account's transaction history.
     *
     * These signals expose the same data used by behavioral rule attributes (e.g. `AMOUNT_Z_SCORE`
     * with `scope: ACCOUNT`, `IS_NEW_COUNTRY` with `scope: ACCOUNT`) and custom code
     * `TRANSACTION_HISTORY_SIGNALS` features, allowing clients to inspect feature values before
     * writing rules and debug rule behavior.
     *
     * Note: 3DS fields are not available at the account scope and will be null.
     */
    fun retrieveSignals(accountToken: String): SignalsResponse =
        retrieveSignals(accountToken, AccountRetrieveSignalsParams.none())

    /** @see retrieveSignals */
    fun retrieveSignals(
        accountToken: String,
        params: AccountRetrieveSignalsParams = AccountRetrieveSignalsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignalsResponse =
        retrieveSignals(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see retrieveSignals */
    fun retrieveSignals(
        accountToken: String,
        params: AccountRetrieveSignalsParams = AccountRetrieveSignalsParams.none(),
    ): SignalsResponse = retrieveSignals(accountToken, params, RequestOptions.none())

    /** @see retrieveSignals */
    fun retrieveSignals(
        params: AccountRetrieveSignalsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SignalsResponse

    /** @see retrieveSignals */
    fun retrieveSignals(params: AccountRetrieveSignalsParams): SignalsResponse =
        retrieveSignals(params, RequestOptions.none())

    /** @see retrieveSignals */
    fun retrieveSignals(accountToken: String, requestOptions: RequestOptions): SignalsResponse =
        retrieveSignals(accountToken, AccountRetrieveSignalsParams.none(), requestOptions)

    /**
     * Get an Account's available spend limits, which is based on the spend limit configured on the
     * Account and the amount already spent over the spend limit's duration. For example, if the
     * Account has a daily spend limit of $1000 configured, and has spent $600 in the last 24 hours,
     * the available spend limit returned would be $400.
     */
    fun retrieveSpendLimits(accountToken: String): AccountSpendLimits =
        retrieveSpendLimits(accountToken, AccountRetrieveSpendLimitsParams.none())

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        accountToken: String,
        params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSpendLimits =
        retrieveSpendLimits(params.toBuilder().accountToken(accountToken).build(), requestOptions)

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        accountToken: String,
        params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
    ): AccountSpendLimits = retrieveSpendLimits(accountToken, params, RequestOptions.none())

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        params: AccountRetrieveSpendLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountSpendLimits

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(params: AccountRetrieveSpendLimitsParams): AccountSpendLimits =
        retrieveSpendLimits(params, RequestOptions.none())

    /** @see retrieveSpendLimits */
    fun retrieveSpendLimits(
        accountToken: String,
        requestOptions: RequestOptions,
    ): AccountSpendLimits =
        retrieveSpendLimits(accountToken, AccountRetrieveSpendLimitsParams.none(), requestOptions)

    /** A view of [AccountService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_token}`, but is otherwise the
         * same as [AccountService.retrieve].
         */
        @MustBeClosed
        fun retrieve(accountToken: String): HttpResponseFor<Account> =
            retrieve(accountToken, AccountRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accountToken: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> =
            retrieve(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accountToken: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
        ): HttpResponseFor<Account> = retrieve(accountToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AccountRetrieveParams): HttpResponseFor<Account> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> =
            retrieve(accountToken, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/accounts/{account_token}`, but is otherwise
         * the same as [AccountService.update].
         */
        @MustBeClosed
        fun update(accountToken: String): HttpResponseFor<Account> =
            update(accountToken, AccountUpdateParams.none())

        /** @see update */
        @MustBeClosed
        fun update(
            accountToken: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> =
            update(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(
            accountToken: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
        ): HttpResponseFor<Account> = update(accountToken, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see update */
        @MustBeClosed
        fun update(params: AccountUpdateParams): HttpResponseFor<Account> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(accountToken: String, requestOptions: RequestOptions): HttpResponseFor<Account> =
            update(accountToken, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts`, but is otherwise the same as
         * [AccountService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<AccountListPage> = list(AccountListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AccountListParams = AccountListParams.none()
        ): HttpResponseFor<AccountListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListPage> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_token}/signals`, but is
         * otherwise the same as [AccountService.retrieveSignals].
         */
        @MustBeClosed
        fun retrieveSignals(accountToken: String): HttpResponseFor<SignalsResponse> =
            retrieveSignals(accountToken, AccountRetrieveSignalsParams.none())

        /** @see retrieveSignals */
        @MustBeClosed
        fun retrieveSignals(
            accountToken: String,
            params: AccountRetrieveSignalsParams = AccountRetrieveSignalsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignalsResponse> =
            retrieveSignals(params.toBuilder().accountToken(accountToken).build(), requestOptions)

        /** @see retrieveSignals */
        @MustBeClosed
        fun retrieveSignals(
            accountToken: String,
            params: AccountRetrieveSignalsParams = AccountRetrieveSignalsParams.none(),
        ): HttpResponseFor<SignalsResponse> =
            retrieveSignals(accountToken, params, RequestOptions.none())

        /** @see retrieveSignals */
        @MustBeClosed
        fun retrieveSignals(
            params: AccountRetrieveSignalsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SignalsResponse>

        /** @see retrieveSignals */
        @MustBeClosed
        fun retrieveSignals(
            params: AccountRetrieveSignalsParams
        ): HttpResponseFor<SignalsResponse> = retrieveSignals(params, RequestOptions.none())

        /** @see retrieveSignals */
        @MustBeClosed
        fun retrieveSignals(
            accountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SignalsResponse> =
            retrieveSignals(accountToken, AccountRetrieveSignalsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/accounts/{account_token}/spend_limits`, but is
         * otherwise the same as [AccountService.retrieveSpendLimits].
         */
        @MustBeClosed
        fun retrieveSpendLimits(accountToken: String): HttpResponseFor<AccountSpendLimits> =
            retrieveSpendLimits(accountToken, AccountRetrieveSpendLimitsParams.none())

        /** @see retrieveSpendLimits */
        @MustBeClosed
        fun retrieveSpendLimits(
            accountToken: String,
            params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSpendLimits> =
            retrieveSpendLimits(
                params.toBuilder().accountToken(accountToken).build(),
                requestOptions,
            )

        /** @see retrieveSpendLimits */
        @MustBeClosed
        fun retrieveSpendLimits(
            accountToken: String,
            params: AccountRetrieveSpendLimitsParams = AccountRetrieveSpendLimitsParams.none(),
        ): HttpResponseFor<AccountSpendLimits> =
            retrieveSpendLimits(accountToken, params, RequestOptions.none())

        /** @see retrieveSpendLimits */
        @MustBeClosed
        fun retrieveSpendLimits(
            params: AccountRetrieveSpendLimitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountSpendLimits>

        /** @see retrieveSpendLimits */
        @MustBeClosed
        fun retrieveSpendLimits(
            params: AccountRetrieveSpendLimitsParams
        ): HttpResponseFor<AccountSpendLimits> = retrieveSpendLimits(params, RequestOptions.none())

        /** @see retrieveSpendLimits */
        @MustBeClosed
        fun retrieveSpendLimits(
            accountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountSpendLimits> =
            retrieveSpendLimits(
                accountToken,
                AccountRetrieveSpendLimitsParams.none(),
                requestOptions,
            )
    }
}
