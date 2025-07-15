// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkProgram
import com.lithic.api.models.NetworkProgramListPageAsync
import com.lithic.api.models.NetworkProgramListParams
import com.lithic.api.models.NetworkProgramRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface NetworkProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkProgramServiceAsync

    /** Get network program. */
    fun retrieve(networkProgramToken: String): CompletableFuture<NetworkProgram> =
        retrieve(networkProgramToken, NetworkProgramRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        networkProgramToken: String,
        params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkProgram> =
        retrieve(
            params.toBuilder().networkProgramToken(networkProgramToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        networkProgramToken: String,
        params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
    ): CompletableFuture<NetworkProgram> =
        retrieve(networkProgramToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: NetworkProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkProgram>

    /** @see [retrieve] */
    fun retrieve(params: NetworkProgramRetrieveParams): CompletableFuture<NetworkProgram> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        networkProgramToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkProgram> =
        retrieve(networkProgramToken, NetworkProgramRetrieveParams.none(), requestOptions)

    /** List network programs. */
    fun list(): CompletableFuture<NetworkProgramListPageAsync> =
        list(NetworkProgramListParams.none())

    /** @see [list] */
    fun list(
        params: NetworkProgramListParams = NetworkProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<NetworkProgramListPageAsync>

    /** @see [list] */
    fun list(
        params: NetworkProgramListParams = NetworkProgramListParams.none()
    ): CompletableFuture<NetworkProgramListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<NetworkProgramListPageAsync> =
        list(NetworkProgramListParams.none(), requestOptions)

    /**
     * A view of [NetworkProgramServiceAsync] that provides access to raw HTTP responses for each
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
        ): NetworkProgramServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/network_programs/{network_program_token}`, but
         * is otherwise the same as [NetworkProgramServiceAsync.retrieve].
         */
        fun retrieve(
            networkProgramToken: String
        ): CompletableFuture<HttpResponseFor<NetworkProgram>> =
            retrieve(networkProgramToken, NetworkProgramRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            networkProgramToken: String,
            params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkProgram>> =
            retrieve(
                params.toBuilder().networkProgramToken(networkProgramToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            networkProgramToken: String,
            params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<NetworkProgram>> =
            retrieve(networkProgramToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: NetworkProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkProgram>>

        /** @see [retrieve] */
        fun retrieve(
            params: NetworkProgramRetrieveParams
        ): CompletableFuture<HttpResponseFor<NetworkProgram>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            networkProgramToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkProgram>> =
            retrieve(networkProgramToken, NetworkProgramRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/network_programs`, but is otherwise the same as
         * [NetworkProgramServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<NetworkProgramListPageAsync>> =
            list(NetworkProgramListParams.none())

        /** @see [list] */
        fun list(
            params: NetworkProgramListParams = NetworkProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<NetworkProgramListPageAsync>>

        /** @see [list] */
        fun list(
            params: NetworkProgramListParams = NetworkProgramListParams.none()
        ): CompletableFuture<HttpResponseFor<NetworkProgramListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<NetworkProgramListPageAsync>> =
            list(NetworkProgramListParams.none(), requestOptions)
    }
}
