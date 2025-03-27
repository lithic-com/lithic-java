// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.digitalcardart.DigitalCardArt
import com.lithic.api.models.digitalcardart.DigitalCardArtListPageAsync
import com.lithic.api.models.digitalcardart.DigitalCardArtListParams
import com.lithic.api.models.digitalcardart.DigitalCardArtRetrieveParams
import java.util.concurrent.CompletableFuture

interface DigitalCardArtServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get digital card art by token. */
    fun retrieve(params: DigitalCardArtRetrieveParams): CompletableFuture<DigitalCardArt> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DigitalCardArt>

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
        @MustBeClosed
        fun retrieve(
            params: DigitalCardArtRetrieveParams
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DigitalCardArtRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>>

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art`, but is otherwise the same as
         * [DigitalCardArtServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>> =
            list(DigitalCardArtListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalCardArtListParams = DigitalCardArtListParams.none()
        ): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>> =
            list(DigitalCardArtListParams.none(), requestOptions)
    }
}
