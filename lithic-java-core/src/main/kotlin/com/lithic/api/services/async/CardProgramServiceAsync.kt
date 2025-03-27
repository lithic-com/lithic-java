// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.cardprograms.CardProgram
import com.lithic.api.models.cardprograms.CardProgramListPageAsync
import com.lithic.api.models.cardprograms.CardProgramListParams
import com.lithic.api.models.cardprograms.CardProgramRetrieveParams
import java.util.concurrent.CompletableFuture

interface CardProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get card program. */
    fun retrieve(params: CardProgramRetrieveParams): CompletableFuture<CardProgram> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardProgram>

    /** List card programs. */
    fun list(): CompletableFuture<CardProgramListPageAsync> = list(CardProgramListParams.none())

    /** @see [list] */
    fun list(
        params: CardProgramListParams = CardProgramListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardProgramListPageAsync>

    /** @see [list] */
    fun list(
        params: CardProgramListParams = CardProgramListParams.none()
    ): CompletableFuture<CardProgramListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardProgramListPageAsync> =
        list(CardProgramListParams.none(), requestOptions)

    /**
     * A view of [CardProgramServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/card_programs/{card_program_token}`, but is
         * otherwise the same as [CardProgramServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CardProgramRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardProgram>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardProgram>>

        /**
         * Returns a raw HTTP response for `get /v1/card_programs`, but is otherwise the same as
         * [CardProgramServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CardProgramListPageAsync>> =
            list(CardProgramListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardProgramListParams = CardProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardProgramListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardProgramListParams = CardProgramListParams.none()
        ): CompletableFuture<HttpResponseFor<CardProgramListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardProgramListPageAsync>> =
            list(CardProgramListParams.none(), requestOptions)
    }
}
