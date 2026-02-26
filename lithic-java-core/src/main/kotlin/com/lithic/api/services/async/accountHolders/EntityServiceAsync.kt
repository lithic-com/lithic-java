// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.accountHolders

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AccountHolderEntity
import com.lithic.api.models.AccountHolderEntityCreateParams
import com.lithic.api.models.AccountHolderEntityDeleteParams
import com.lithic.api.models.EntityCreateResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface EntityServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityServiceAsync

    /**
     * Create a new beneficial owner or replace the control person entity on an existing KYB account
     * holder. This endpoint is only applicable for account holders enrolled through a KYB workflow
     * with the Persona KYB provider. A new control person can only replace the existing one. A
     * maximum of 4 beneficial owners can be associated with an account holder.
     */
    fun create(
        accountHolderToken: String,
        params: AccountHolderEntityCreateParams,
    ): CompletableFuture<EntityCreateResponse> =
        create(accountHolderToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        accountHolderToken: String,
        params: AccountHolderEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityCreateResponse> =
        create(params.toBuilder().accountHolderToken(accountHolderToken).build(), requestOptions)

    /** @see create */
    fun create(params: AccountHolderEntityCreateParams): CompletableFuture<EntityCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountHolderEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<EntityCreateResponse>

    /**
     * Deactivate a beneficial owner entity on an existing KYB account holder. Only beneficial owner
     * entities can be deactivated.
     */
    fun delete(
        entityToken: String,
        params: AccountHolderEntityDeleteParams,
    ): CompletableFuture<AccountHolderEntity> = delete(entityToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        entityToken: String,
        params: AccountHolderEntityDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountHolderEntity> =
        delete(params.toBuilder().entityToken(entityToken).build(), requestOptions)

    /** @see delete */
    fun delete(params: AccountHolderEntityDeleteParams): CompletableFuture<AccountHolderEntity> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccountHolderEntityDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AccountHolderEntity>

    /**
     * A view of [EntityServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): EntityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/account_holders/{account_holder_token}/entities`, but is otherwise the same as
         * [EntityServiceAsync.create].
         */
        fun create(
            accountHolderToken: String,
            params: AccountHolderEntityCreateParams,
        ): CompletableFuture<HttpResponseFor<EntityCreateResponse>> =
            create(accountHolderToken, params, RequestOptions.none())

        /** @see create */
        fun create(
            accountHolderToken: String,
            params: AccountHolderEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityCreateResponse>> =
            create(
                params.toBuilder().accountHolderToken(accountHolderToken).build(),
                requestOptions,
            )

        /** @see create */
        fun create(
            params: AccountHolderEntityCreateParams
        ): CompletableFuture<HttpResponseFor<EntityCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AccountHolderEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<EntityCreateResponse>>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/account_holders/{account_holder_token}/entities/{entity_token}`, but is otherwise the
         * same as [EntityServiceAsync.delete].
         */
        fun delete(
            entityToken: String,
            params: AccountHolderEntityDeleteParams,
        ): CompletableFuture<HttpResponseFor<AccountHolderEntity>> =
            delete(entityToken, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            entityToken: String,
            params: AccountHolderEntityDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountHolderEntity>> =
            delete(params.toBuilder().entityToken(entityToken).build(), requestOptions)

        /** @see delete */
        fun delete(
            params: AccountHolderEntityDeleteParams
        ): CompletableFuture<HttpResponseFor<AccountHolderEntity>> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AccountHolderEntityDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AccountHolderEntity>>
    }
}
