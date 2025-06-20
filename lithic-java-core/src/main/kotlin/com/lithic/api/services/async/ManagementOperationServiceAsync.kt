// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPageAsync
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ManagementOperationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ManagementOperationServiceAsync

    /** Create management operation */
    fun create(
        params: ManagementOperationCreateParams
    ): CompletableFuture<ManagementOperationTransaction> = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction>

    /** Get management operation */
    fun retrieve(
        managementOperationToken: String
    ): CompletableFuture<ManagementOperationTransaction> =
        retrieve(managementOperationToken, ManagementOperationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        managementOperationToken: String,
        params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction> =
        retrieve(
            params.toBuilder().managementOperationToken(managementOperationToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        managementOperationToken: String,
        params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
    ): CompletableFuture<ManagementOperationTransaction> =
        retrieve(managementOperationToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction>

    /** @see [retrieve] */
    fun retrieve(
        params: ManagementOperationRetrieveParams
    ): CompletableFuture<ManagementOperationTransaction> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        managementOperationToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ManagementOperationTransaction> =
        retrieve(managementOperationToken, ManagementOperationRetrieveParams.none(), requestOptions)

    /** List management operations */
    fun list(): CompletableFuture<ManagementOperationListPageAsync> =
        list(ManagementOperationListParams.none())

    /** @see [list] */
    fun list(
        params: ManagementOperationListParams = ManagementOperationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationListPageAsync>

    /** @see [list] */
    fun list(
        params: ManagementOperationListParams = ManagementOperationListParams.none()
    ): CompletableFuture<ManagementOperationListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ManagementOperationListPageAsync> =
        list(ManagementOperationListParams.none(), requestOptions)

    /** Reverse a management operation */
    fun reverse(
        managementOperationToken: String,
        params: ManagementOperationReverseParams,
    ): CompletableFuture<ManagementOperationTransaction> =
        reverse(managementOperationToken, params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        managementOperationToken: String,
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction> =
        reverse(
            params.toBuilder().managementOperationToken(managementOperationToken).build(),
            requestOptions,
        )

    /** @see [reverse] */
    fun reverse(
        params: ManagementOperationReverseParams
    ): CompletableFuture<ManagementOperationTransaction> = reverse(params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction>

    /**
     * A view of [ManagementOperationServiceAsync] that provides access to raw HTTP responses for
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
        ): ManagementOperationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationServiceAsync.create].
         */
        fun create(
            params: ManagementOperationCreateParams
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        fun create(
            params: ManagementOperationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/management_operations/{management_operation_token}`, but is otherwise the same as
         * [ManagementOperationServiceAsync.retrieve].
         */
        fun retrieve(
            managementOperationToken: String
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            retrieve(managementOperationToken, ManagementOperationRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            managementOperationToken: String,
            params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            retrieve(
                params.toBuilder().managementOperationToken(managementOperationToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            managementOperationToken: String,
            params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            retrieve(managementOperationToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: ManagementOperationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>>

        /** @see [retrieve] */
        fun retrieve(
            params: ManagementOperationRetrieveParams
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            managementOperationToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            retrieve(
                managementOperationToken,
                ManagementOperationRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<ManagementOperationListPageAsync>> =
            list(ManagementOperationListParams.none())

        /** @see [list] */
        fun list(
            params: ManagementOperationListParams = ManagementOperationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationListPageAsync>>

        /** @see [list] */
        fun list(
            params: ManagementOperationListParams = ManagementOperationListParams.none()
        ): CompletableFuture<HttpResponseFor<ManagementOperationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ManagementOperationListPageAsync>> =
            list(ManagementOperationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/management_operations/{management_operation_token}/reverse`, but is otherwise the
         * same as [ManagementOperationServiceAsync.reverse].
         */
        fun reverse(
            managementOperationToken: String,
            params: ManagementOperationReverseParams,
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            reverse(managementOperationToken, params, RequestOptions.none())

        /** @see [reverse] */
        fun reverse(
            managementOperationToken: String,
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            reverse(
                params.toBuilder().managementOperationToken(managementOperationToken).build(),
                requestOptions,
            )

        /** @see [reverse] */
        fun reverse(
            params: ManagementOperationReverseParams
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            reverse(params, RequestOptions.none())

        /** @see [reverse] */
        fun reverse(
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>>
    }
}
