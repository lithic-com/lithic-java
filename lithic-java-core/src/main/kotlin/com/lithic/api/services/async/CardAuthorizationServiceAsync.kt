// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.models.CardAuthorizationChallengeResponseParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardAuthorizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardAuthorizationServiceAsync

    /**
     * Card program's response to Authorization Challenge. Programs that have Authorization
     * Challenges configured as Out of Band receive a
     * [card_authorization.challenge](https://docs.lithic.com/reference/post_card-authorization-challenge)
     * webhook when an authorization attempt triggers a challenge. The card program should respond
     * using this endpoint after the cardholder completes the challenge.
     */
    fun challengeResponse(
        eventToken: String,
        params: CardAuthorizationChallengeResponseParams,
    ): CompletableFuture<Void?> = challengeResponse(eventToken, params, RequestOptions.none())

    /** @see challengeResponse */
    fun challengeResponse(
        eventToken: String,
        params: CardAuthorizationChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        challengeResponse(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see challengeResponse */
    fun challengeResponse(
        params: CardAuthorizationChallengeResponseParams
    ): CompletableFuture<Void?> = challengeResponse(params, RequestOptions.none())

    /** @see challengeResponse */
    fun challengeResponse(
        params: CardAuthorizationChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [CardAuthorizationServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardAuthorizationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/card_authorizations/{event_token}/challenge_response`, but is otherwise the same as
         * [CardAuthorizationServiceAsync.challengeResponse].
         */
        fun challengeResponse(
            eventToken: String,
            params: CardAuthorizationChallengeResponseParams,
        ): CompletableFuture<HttpResponse> =
            challengeResponse(eventToken, params, RequestOptions.none())

        /** @see challengeResponse */
        fun challengeResponse(
            eventToken: String,
            params: CardAuthorizationChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            challengeResponse(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see challengeResponse */
        fun challengeResponse(
            params: CardAuthorizationChallengeResponseParams
        ): CompletableFuture<HttpResponse> = challengeResponse(params, RequestOptions.none())

        /** @see challengeResponse */
        fun challengeResponse(
            params: CardAuthorizationChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
