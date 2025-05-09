// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPage
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction

interface ManagementOperationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create management operation */
    fun create(params: ManagementOperationCreateParams): ManagementOperationTransaction =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /** Get management operation */
    fun retrieve(managementOperationToken: String): ManagementOperationTransaction =
        retrieve(managementOperationToken, ManagementOperationRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        managementOperationToken: String,
        params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction =
        retrieve(
            params.toBuilder().managementOperationToken(managementOperationToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        managementOperationToken: String,
        params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
    ): ManagementOperationTransaction =
        retrieve(managementOperationToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /** @see [retrieve] */
    fun retrieve(params: ManagementOperationRetrieveParams): ManagementOperationTransaction =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        managementOperationToken: String,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction =
        retrieve(managementOperationToken, ManagementOperationRetrieveParams.none(), requestOptions)

    /** List management operations */
    fun list(): ManagementOperationListPage = list(ManagementOperationListParams.none())

    /** @see [list] */
    fun list(
        params: ManagementOperationListParams = ManagementOperationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationListPage

    /** @see [list] */
    fun list(
        params: ManagementOperationListParams = ManagementOperationListParams.none()
    ): ManagementOperationListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ManagementOperationListPage =
        list(ManagementOperationListParams.none(), requestOptions)

    /** Reverse a management operation */
    fun reverse(
        managementOperationToken: String,
        params: ManagementOperationReverseParams,
    ): ManagementOperationTransaction =
        reverse(managementOperationToken, params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        managementOperationToken: String,
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction =
        reverse(
            params.toBuilder().managementOperationToken(managementOperationToken).build(),
            requestOptions,
        )

    /** @see [reverse] */
    fun reverse(params: ManagementOperationReverseParams): ManagementOperationTransaction =
        reverse(params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ManagementOperationTransaction

    /**
     * A view of [ManagementOperationService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationService.create].
         */
        @MustBeClosed
        fun create(
            params: ManagementOperationCreateParams
        ): HttpResponseFor<ManagementOperationTransaction> = create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ManagementOperationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>

        /**
         * Returns a raw HTTP response for `get
         * /v1/management_operations/{management_operation_token}`, but is otherwise the same as
         * [ManagementOperationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            managementOperationToken: String
        ): HttpResponseFor<ManagementOperationTransaction> =
            retrieve(managementOperationToken, ManagementOperationRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            managementOperationToken: String,
            params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction> =
            retrieve(
                params.toBuilder().managementOperationToken(managementOperationToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            managementOperationToken: String,
            params: ManagementOperationRetrieveParams = ManagementOperationRetrieveParams.none(),
        ): HttpResponseFor<ManagementOperationTransaction> =
            retrieve(managementOperationToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ManagementOperationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ManagementOperationRetrieveParams
        ): HttpResponseFor<ManagementOperationTransaction> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            managementOperationToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationTransaction> =
            retrieve(
                managementOperationToken,
                ManagementOperationRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /v1/management_operations`, but is otherwise the
         * same as [ManagementOperationService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ManagementOperationListPage> =
            list(ManagementOperationListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ManagementOperationListParams = ManagementOperationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ManagementOperationListParams = ManagementOperationListParams.none()
        ): HttpResponseFor<ManagementOperationListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ManagementOperationListPage> =
            list(ManagementOperationListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/management_operations/{management_operation_token}/reverse`, but is otherwise the
         * same as [ManagementOperationService.reverse].
         */
        @MustBeClosed
        fun reverse(
            managementOperationToken: String,
            params: ManagementOperationReverseParams,
        ): HttpResponseFor<ManagementOperationTransaction> =
            reverse(managementOperationToken, params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            managementOperationToken: String,
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction> =
            reverse(
                params.toBuilder().managementOperationToken(managementOperationToken).build(),
                requestOptions,
            )

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: ManagementOperationReverseParams
        ): HttpResponseFor<ManagementOperationTransaction> = reverse(params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ManagementOperationTransaction>
    }
}
