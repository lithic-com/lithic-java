// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DisputeV2
import com.lithic.api.models.DisputesV2ListPage
import com.lithic.api.models.DisputesV2ListParams
import com.lithic.api.models.DisputesV2RetrieveParams
import java.util.function.Consumer

interface DisputesV2Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputesV2Service

    /** Retrieves a specific dispute by its token. */
    fun retrieve(disputeToken: String): DisputeV2 =
        retrieve(disputeToken, DisputesV2RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeV2 = retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
    ): DisputeV2 = retrieve(disputeToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DisputesV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputeV2

    /** @see retrieve */
    fun retrieve(params: DisputesV2RetrieveParams): DisputeV2 =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(disputeToken: String, requestOptions: RequestOptions): DisputeV2 =
        retrieve(disputeToken, DisputesV2RetrieveParams.none(), requestOptions)

    /** Returns a paginated list of disputes. */
    fun list(): DisputesV2ListPage = list(DisputesV2ListParams.none())

    /** @see list */
    fun list(
        params: DisputesV2ListParams = DisputesV2ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DisputesV2ListPage

    /** @see list */
    fun list(params: DisputesV2ListParams = DisputesV2ListParams.none()): DisputesV2ListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): DisputesV2ListPage =
        list(DisputesV2ListParams.none(), requestOptions)

    /** A view of [DisputesV2Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DisputesV2Service.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/disputes/{dispute_token}`, but is otherwise the
         * same as [DisputesV2Service.retrieve].
         */
        @MustBeClosed
        fun retrieve(disputeToken: String): HttpResponseFor<DisputeV2> =
            retrieve(disputeToken, DisputesV2RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            disputeToken: String,
            params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeV2> =
            retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            disputeToken: String,
            params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
        ): HttpResponseFor<DisputeV2> = retrieve(disputeToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DisputesV2RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputeV2>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: DisputesV2RetrieveParams): HttpResponseFor<DisputeV2> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeV2> =
            retrieve(disputeToken, DisputesV2RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/disputes`, but is otherwise the same as
         * [DisputesV2Service.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DisputesV2ListPage> = list(DisputesV2ListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: DisputesV2ListParams = DisputesV2ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DisputesV2ListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: DisputesV2ListParams = DisputesV2ListParams.none()
        ): HttpResponseFor<DisputesV2ListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DisputesV2ListPage> =
            list(DisputesV2ListParams.none(), requestOptions)
    }
}
