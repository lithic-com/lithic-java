// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DisputeV2
import com.lithic.api.models.DisputesV2ListPageAsync
import com.lithic.api.models.DisputesV2ListParams
import com.lithic.api.models.DisputesV2RetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DisputesV2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputesV2ServiceAsync

    /** Retrieves a specific dispute by its token. */
    fun retrieve(disputeToken: String): CompletableFuture<DisputeV2> =
        retrieve(disputeToken, DisputesV2RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeV2> =
        retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
    ): CompletableFuture<DisputeV2> = retrieve(disputeToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: DisputesV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputeV2>

    /** @see retrieve */
    fun retrieve(params: DisputesV2RetrieveParams): CompletableFuture<DisputeV2> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        disputeToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DisputeV2> =
        retrieve(disputeToken, DisputesV2RetrieveParams.none(), requestOptions)

    /** Returns a paginated list of disputes. */
    fun list(): CompletableFuture<DisputesV2ListPageAsync> = list(DisputesV2ListParams.none())

    /** @see list */
    fun list(
        params: DisputesV2ListParams = DisputesV2ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DisputesV2ListPageAsync>

    /** @see list */
    fun list(
        params: DisputesV2ListParams = DisputesV2ListParams.none()
    ): CompletableFuture<DisputesV2ListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<DisputesV2ListPageAsync> =
        list(DisputesV2ListParams.none(), requestOptions)

    /**
     * A view of [DisputesV2ServiceAsync] that provides access to raw HTTP responses for each
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
        ): DisputesV2ServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v2/disputes/{dispute_token}`, but is otherwise the
         * same as [DisputesV2ServiceAsync.retrieve].
         */
        fun retrieve(disputeToken: String): CompletableFuture<HttpResponseFor<DisputeV2>> =
            retrieve(disputeToken, DisputesV2RetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            disputeToken: String,
            params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeV2>> =
            retrieve(params.toBuilder().disputeToken(disputeToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            disputeToken: String,
            params: DisputesV2RetrieveParams = DisputesV2RetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DisputeV2>> =
            retrieve(disputeToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: DisputesV2RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputeV2>>

        /** @see retrieve */
        fun retrieve(
            params: DisputesV2RetrieveParams
        ): CompletableFuture<HttpResponseFor<DisputeV2>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            disputeToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DisputeV2>> =
            retrieve(disputeToken, DisputesV2RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/disputes`, but is otherwise the same as
         * [DisputesV2ServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DisputesV2ListPageAsync>> =
            list(DisputesV2ListParams.none())

        /** @see list */
        fun list(
            params: DisputesV2ListParams = DisputesV2ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DisputesV2ListPageAsync>>

        /** @see list */
        fun list(
            params: DisputesV2ListParams = DisputesV2ListParams.none()
        ): CompletableFuture<HttpResponseFor<DisputesV2ListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DisputesV2ListPageAsync>> =
            list(DisputesV2ListParams.none(), requestOptions)
    }
}
