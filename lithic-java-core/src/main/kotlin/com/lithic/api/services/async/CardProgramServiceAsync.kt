// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPageAsync
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardProgramServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardProgramServiceAsync

    /** Get card program. */
    fun retrieve(cardProgramToken: String): CompletableFuture<CardProgram> =
        retrieve(cardProgramToken, CardProgramRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        cardProgramToken: String,
        params: CardProgramRetrieveParams = CardProgramRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardProgram> =
        retrieve(params.toBuilder().cardProgramToken(cardProgramToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        cardProgramToken: String,
        params: CardProgramRetrieveParams = CardProgramRetrieveParams.none(),
    ): CompletableFuture<CardProgram> = retrieve(cardProgramToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardProgram>

    /** @see [retrieve] */
    fun retrieve(params: CardProgramRetrieveParams): CompletableFuture<CardProgram> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        cardProgramToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardProgram> =
        retrieve(cardProgramToken, CardProgramRetrieveParams.none(), requestOptions)

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardProgramServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/card_programs/{card_program_token}`, but is
         * otherwise the same as [CardProgramServiceAsync.retrieve].
         */
        fun retrieve(cardProgramToken: String): CompletableFuture<HttpResponseFor<CardProgram>> =
            retrieve(cardProgramToken, CardProgramRetrieveParams.none())

        /** @see [retrieve] */
        fun retrieve(
            cardProgramToken: String,
            params: CardProgramRetrieveParams = CardProgramRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardProgram>> =
            retrieve(params.toBuilder().cardProgramToken(cardProgramToken).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            cardProgramToken: String,
            params: CardProgramRetrieveParams = CardProgramRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardProgram>> =
            retrieve(cardProgramToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: CardProgramRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardProgram>>

        /** @see [retrieve] */
        fun retrieve(
            params: CardProgramRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardProgram>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            cardProgramToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardProgram>> =
            retrieve(cardProgramToken, CardProgramRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/card_programs`, but is otherwise the same as
         * [CardProgramServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardProgramListPageAsync>> =
            list(CardProgramListParams.none())

        /** @see [list] */
        fun list(
            params: CardProgramListParams = CardProgramListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardProgramListPageAsync>>

        /** @see [list] */
        fun list(
            params: CardProgramListParams = CardProgramListParams.none()
        ): CompletableFuture<HttpResponseFor<CardProgramListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardProgramListPageAsync>> =
            list(CardProgramListParams.none(), requestOptions)
    }
}
