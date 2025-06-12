// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DigitalCardArt
import com.lithic.api.models.DigitalCardArtListPage
import com.lithic.api.models.DigitalCardArtListParams
import com.lithic.api.models.DigitalCardArtRetrieveParams
import java.util.function.Consumer

interface DigitalCardArtService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DigitalCardArtService

    /** Get digital card art by token. */
    fun retrieve(digitalCardArtToken: String): DigitalCardArt =
        retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        digitalCardArtToken: String,
        params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardArt =
        retrieve(
            params.toBuilder().digitalCardArtToken(digitalCardArtToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        digitalCardArtToken: String,
        params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
    ): DigitalCardArt = retrieve(digitalCardArtToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardArt

    /** @see [retrieve] */
    fun retrieve(params: DigitalCardArtRetrieveParams): DigitalCardArt =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(digitalCardArtToken: String, requestOptions: RequestOptions): DigitalCardArt =
        retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none(), requestOptions)

    /** List digital card art. */
    fun list(): DigitalCardArtListPage = list(DigitalCardArtListParams.none())

    /** @see [list] */
    fun list(
        params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardArtListPage

    /** @see [list] */
    fun list(
        params: DigitalCardArtListParams = DigitalCardArtListParams.none()
    ): DigitalCardArtListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DigitalCardArtListPage =
        list(DigitalCardArtListParams.none(), requestOptions)

    /**
     * A view of [DigitalCardArtService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigitalCardArtService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art/{digital_card_art_token}`, but
         * is otherwise the same as [DigitalCardArtService.retrieve].
         */
        @MustBeClosed
        fun retrieve(digitalCardArtToken: String): HttpResponseFor<DigitalCardArt> =
            retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            digitalCardArtToken: String,
            params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardArt> =
            retrieve(
                params.toBuilder().digitalCardArtToken(digitalCardArtToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            digitalCardArtToken: String,
            params: DigitalCardArtRetrieveParams = DigitalCardArtRetrieveParams.none(),
        ): HttpResponseFor<DigitalCardArt> =
            retrieve(digitalCardArtToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DigitalCardArtRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardArt>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: DigitalCardArtRetrieveParams): HttpResponseFor<DigitalCardArt> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            digitalCardArtToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardArt> =
            retrieve(digitalCardArtToken, DigitalCardArtRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art`, but is otherwise the same as
         * [DigitalCardArtService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<DigitalCardArtListPage> = list(DigitalCardArtListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardArtListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: DigitalCardArtListParams = DigitalCardArtListParams.none()
        ): HttpResponseFor<DigitalCardArtListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalCardArtListPage> =
            list(DigitalCardArtListParams.none(), requestOptions)
    }
}
