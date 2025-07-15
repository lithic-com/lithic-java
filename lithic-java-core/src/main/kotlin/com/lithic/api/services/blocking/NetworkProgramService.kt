// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.NetworkProgram
import com.lithic.api.models.NetworkProgramListPage
import com.lithic.api.models.NetworkProgramListParams
import com.lithic.api.models.NetworkProgramRetrieveParams
import java.util.function.Consumer

interface NetworkProgramService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkProgramService

    /** Get network program. */
    fun retrieve(networkProgramToken: String): NetworkProgram =
        retrieve(networkProgramToken, NetworkProgramRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        networkProgramToken: String,
        params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkProgram =
        retrieve(
            params.toBuilder().networkProgramToken(networkProgramToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        networkProgramToken: String,
        params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
    ): NetworkProgram = retrieve(networkProgramToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: NetworkProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkProgram

    /** @see [retrieve] */
    fun retrieve(params: NetworkProgramRetrieveParams): NetworkProgram =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(networkProgramToken: String, requestOptions: RequestOptions): NetworkProgram =
        retrieve(networkProgramToken, NetworkProgramRetrieveParams.none(), requestOptions)

    /** List network programs. */
    fun list(): NetworkProgramListPage = list(NetworkProgramListParams.none())

    /** @see [list] */
    fun list(
        params: NetworkProgramListParams = NetworkProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): NetworkProgramListPage

    /** @see [list] */
    fun list(
        params: NetworkProgramListParams = NetworkProgramListParams.none()
    ): NetworkProgramListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): NetworkProgramListPage =
        list(NetworkProgramListParams.none(), requestOptions)

    /**
     * A view of [NetworkProgramService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkProgramService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/network_programs/{network_program_token}`, but
         * is otherwise the same as [NetworkProgramService.retrieve].
         */
        @MustBeClosed
        fun retrieve(networkProgramToken: String): HttpResponseFor<NetworkProgram> =
            retrieve(networkProgramToken, NetworkProgramRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            networkProgramToken: String,
            params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkProgram> =
            retrieve(
                params.toBuilder().networkProgramToken(networkProgramToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            networkProgramToken: String,
            params: NetworkProgramRetrieveParams = NetworkProgramRetrieveParams.none(),
        ): HttpResponseFor<NetworkProgram> =
            retrieve(networkProgramToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: NetworkProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkProgram>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: NetworkProgramRetrieveParams): HttpResponseFor<NetworkProgram> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            networkProgramToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkProgram> =
            retrieve(networkProgramToken, NetworkProgramRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/network_programs`, but is otherwise the same as
         * [NetworkProgramService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<NetworkProgramListPage> = list(NetworkProgramListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: NetworkProgramListParams = NetworkProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<NetworkProgramListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: NetworkProgramListParams = NetworkProgramListParams.none()
        ): HttpResponseFor<NetworkProgramListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<NetworkProgramListPage> =
            list(NetworkProgramListParams.none(), requestOptions)
    }
}
