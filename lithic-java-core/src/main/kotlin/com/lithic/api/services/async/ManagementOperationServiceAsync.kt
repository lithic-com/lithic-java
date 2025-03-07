// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPageAsync
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction
import java.util.concurrent.CompletableFuture

interface ManagementOperationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

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
        params: ManagementOperationRetrieveParams
    ): CompletableFuture<ManagementOperationTransaction> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ManagementOperationTransaction>

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
         * Returns a raw HTTP response for `post /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ManagementOperationCreateParams
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ManagementOperationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/management_operations/{management_operation_token}`, but is otherwise the same as
         * [ManagementOperationServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ManagementOperationRetrieveParams
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ManagementOperationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>>

        /**
         * Returns a raw HTTP response for `get /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ManagementOperationListPageAsync>> =
            list(ManagementOperationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ManagementOperationListParams = ManagementOperationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ManagementOperationListParams = ManagementOperationListParams.none()
        ): CompletableFuture<HttpResponseFor<ManagementOperationListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ManagementOperationListPageAsync>> =
            list(ManagementOperationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/management_operations/{management_operation_token}/reverse`, but is otherwise the
         * same as [ManagementOperationServiceAsync.reverse].
         */
        @MustBeClosed
        fun reverse(
            params: ManagementOperationReverseParams
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>> =
            reverse(params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ManagementOperationTransaction>>
    }
}
