// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.models.CardAuthorizationChallengeResponseParams
import java.util.function.Consumer

interface CardAuthorizationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardAuthorizationService

    /**
     * Card program's response to Authorization Challenge. Programs that have Authorization
     * Challenges configured as Out of Band receive a
     * [card_authorization.challenge](https://docs.lithic.com/reference/post_card-authorization-challenge)
     * webhook when an authorization attempt triggers a challenge. The card program should respond
     * using this endpoint after the cardholder completes the challenge.
     */
    fun challengeResponse(eventToken: String, params: CardAuthorizationChallengeResponseParams) =
        challengeResponse(eventToken, params, RequestOptions.none())

    /** @see challengeResponse */
    fun challengeResponse(
        eventToken: String,
        params: CardAuthorizationChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = challengeResponse(params.toBuilder().eventToken(eventToken).build(), requestOptions)

    /** @see challengeResponse */
    fun challengeResponse(params: CardAuthorizationChallengeResponseParams) =
        challengeResponse(params, RequestOptions.none())

    /** @see challengeResponse */
    fun challengeResponse(
        params: CardAuthorizationChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [CardAuthorizationService] that provides access to raw HTTP responses for each
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
        ): CardAuthorizationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/card_authorizations/{event_token}/challenge_response`, but is otherwise the same as
         * [CardAuthorizationService.challengeResponse].
         */
        @MustBeClosed
        fun challengeResponse(
            eventToken: String,
            params: CardAuthorizationChallengeResponseParams,
        ): HttpResponse = challengeResponse(eventToken, params, RequestOptions.none())

        /** @see challengeResponse */
        @MustBeClosed
        fun challengeResponse(
            eventToken: String,
            params: CardAuthorizationChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            challengeResponse(params.toBuilder().eventToken(eventToken).build(), requestOptions)

        /** @see challengeResponse */
        @MustBeClosed
        fun challengeResponse(params: CardAuthorizationChallengeResponseParams): HttpResponse =
            challengeResponse(params, RequestOptions.none())

        /** @see challengeResponse */
        @MustBeClosed
        fun challengeResponse(
            params: CardAuthorizationChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
