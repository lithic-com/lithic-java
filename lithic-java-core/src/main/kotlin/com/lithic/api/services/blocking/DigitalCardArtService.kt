// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DigitalCardArt
import com.lithic.api.models.DigitalCardArtListPage
import com.lithic.api.models.DigitalCardArtListParams
import com.lithic.api.models.DigitalCardArtRetrieveParams

interface DigitalCardArtService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get digital card art by token. */
    @JvmOverloads
    fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardArt

    /** List digital card art. */
    @JvmOverloads
    fun list(
        params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalCardArtListPage

    /** List digital card art. */
    fun list(requestOptions: RequestOptions): DigitalCardArtListPage =
        list(DigitalCardArtListParams.none(), requestOptions)

    /**
     * A view of [DigitalCardArtService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art/{digital_card_art_token}`, but
         * is otherwise the same as [DigitalCardArtService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: DigitalCardArtRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardArt>

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art`, but is otherwise the same as
         * [DigitalCardArtService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: DigitalCardArtListParams = DigitalCardArtListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalCardArtListPage>

        /**
         * Returns a raw HTTP response for `get /v1/digital_card_art`, but is otherwise the same as
         * [DigitalCardArtService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalCardArtListPage> =
            list(DigitalCardArtListParams.none(), requestOptions)
    }
}
