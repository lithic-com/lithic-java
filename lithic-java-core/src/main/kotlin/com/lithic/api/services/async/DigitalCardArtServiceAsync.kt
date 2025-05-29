// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DigitalCardArt
import com.lithic.api.models.DigitalCardArtListPageAsync
import com.lithic.api.models.DigitalCardArtListParams
import com.lithic.api.models.DigitalCardArtRetrieveParams
import java.util.concurrent.CompletableFuture

interface DigitalCardArtServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get digital card art by token. */
    fun retrieve(digitalCardArtToken: String): CompletableFuture<DigitalCardArt> =
        retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        digitalCardArtToken: String,
        params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardArt> =
        retrieve(
            params.toBuilder().digitalCardArtToken(digitalCardArtToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        digitalCardArtToken: String,
        params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
    ): CompletableFuture<DigitalCardArt> =
        retrieve(digitalCardArtToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardArt>

    /** @see [retrieve] */
    fun retrieve(params: DigitalCardArtRetrieveParams): CompletableFuture<DigitalCardArt> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        digitalCardArtToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardArt> =
        retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none(), requestOptions)

    /** List digital card art. */
    fun list(): CompletableFuture<DigitalCardArtListPageAsync> =
        list(DigitalCardArtListParams.none())

    /** @see [list] */
    fun list(
        params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardArtListPageAsync>

    /** @see [list] */
    fun list(
        params: DigitalCardArtListParams = DigitalCardArtListParams.none()
    ): CompletableFuture<DigitalCardArtListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<DigitalCardArtListPageAsync> =
        list(DigitalCardArtListParams.none(), requestOptions)

    /**
     * A view of [DigitalCardArtServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art/{digital_card_art_token}`, but
         * is otherwise the same as [DigitalCardArtServiceAsync.retrieve].
         */
        fun retrieve(
            digitalCardArtToken: String
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>> =
            retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            digitalCardArtToken: String,
            params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>> =
            retrieve(
                params.toBuilder().digitalCardArtToken(digitalCardArtToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        fun retrieve(
            digitalCardArtToken: String,
            params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>> =
            retrieve(digitalCardArtToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: DigitalCardArtRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>>

        /** @see [retrieve] */
        fun retrieve(
            params: DigitalCardArtRetrieveParams
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            digitalCardArtToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>> =
            retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art`, but is otherwise the same as
         * [DigitalCardArtServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>> =
            list(DigitalCardArtListParams.none())

        /** @see [list] */
        fun list(
            params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>>

        /** @see [list] */
        fun list(
            params: DigitalCardArtListParams = DigitalCardArtListParams.none()
        ): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>> =
            list(DigitalCardArtListParams.none(), requestOptions)
    }
}
