// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.accountHolders

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AccountHolderEntity
import com.lithic.api.models.AccountHolderEntityCreateParams
import com.lithic.api.models.AccountHolderEntityDeleteParams
import com.lithic.api.models.EntityCreateResponse
import java.util.function.Consumer

interface EntityService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService

    /**
     * Create a new beneficial owner or replace the control person entity on an existing KYB account
     * holder. This endpoint is only applicable for account holders enrolled through a KYB workflow
     * with the Persona KYB provider. A new control person can only replace the existing one. A
     * maximum of 4 beneficial owners can be associated with an account holder.
     */
    fun create(
        accountHolderToken: String,
        params: AccountHolderEntityCreateParams,
    ): EntityCreateResponse = create(accountHolderToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        accountHolderToken: String,
        params: AccountHolderEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityCreateResponse =
        create(params.toBuilder().accountHolderToken(accountHolderToken).build(), requestOptions)

    /** @see create */
    fun create(params: AccountHolderEntityCreateParams): EntityCreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AccountHolderEntityCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EntityCreateResponse

    /**
     * Deactivate a beneficial owner entity on an existing KYB account holder. Only beneficial owner
     * entities can be deactivated.
     */
    fun delete(entityToken: String, params: AccountHolderEntityDeleteParams): AccountHolderEntity =
        delete(entityToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        entityToken: String,
        params: AccountHolderEntityDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderEntity =
        delete(params.toBuilder().entityToken(entityToken).build(), requestOptions)

    /** @see delete */
    fun delete(params: AccountHolderEntityDeleteParams): AccountHolderEntity =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AccountHolderEntityDeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountHolderEntity

    /** A view of [EntityService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): EntityService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/account_holders/{account_holder_token}/entities`, but is otherwise the same as
         * [EntityService.create].
         */
        @MustBeClosed
        fun create(
            accountHolderToken: String,
            params: AccountHolderEntityCreateParams,
        ): HttpResponseFor<EntityCreateResponse> =
            create(accountHolderToken, params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            accountHolderToken: String,
            params: AccountHolderEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityCreateResponse> =
            create(
                params.toBuilder().accountHolderToken(accountHolderToken).build(),
                requestOptions,
            )

        /** @see create */
        @MustBeClosed
        fun create(params: AccountHolderEntityCreateParams): HttpResponseFor<EntityCreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AccountHolderEntityCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EntityCreateResponse>

        /**
         * Returns a raw HTTP response for `delete
         * /v1/account_holders/{account_holder_token}/entities/{entity_token}`, but is otherwise the
         * same as [EntityService.delete].
         */
        @MustBeClosed
        fun delete(
            entityToken: String,
            params: AccountHolderEntityDeleteParams,
        ): HttpResponseFor<AccountHolderEntity> = delete(entityToken, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            entityToken: String,
            params: AccountHolderEntityDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderEntity> =
            delete(params.toBuilder().entityToken(entityToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(params: AccountHolderEntityDeleteParams): HttpResponseFor<AccountHolderEntity> =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AccountHolderEntityDeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountHolderEntity>
    }
}
