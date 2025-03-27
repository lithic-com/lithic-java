// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeds

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.threeds.decisioning.DecisioningChallengeResponseParams
import com.lithic.api.models.threeds.decisioning.DecisioningRetrieveSecretParams
import com.lithic.api.models.threeds.decisioning.DecisioningRetrieveSecretResponse
import com.lithic.api.models.threeds.decisioning.DecisioningRotateSecretParams
import com.lithic.api.models.threeds.decisioning.DecisioningSimulateChallengeParams
import com.lithic.api.models.threeds.decisioning.DecisioningSimulateChallengeResponse
import com.lithic.api.models.threeds.decisioning.DecisioningSimulateChallengeResponseParams

interface DecisioningService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Card program's response to a 3DS Challenge Request (CReq) */
    fun challengeResponse(params: DecisioningChallengeResponseParams) =
        challengeResponse(params, RequestOptions.none())

    /** @see [challengeResponse] */
    fun challengeResponse(
        params: DecisioningChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Retrieve the 3DS Decisioning HMAC secret key. If one does not exist for your program yet,
     * calling this endpoint will create one for you. The headers (which you can use to verify 3DS
     * Decisioning requests) will begin appearing shortly after calling this endpoint for the first
     * time. See
     * [this page](https://docs.lithic.com/docs/3ds-decisioning#3ds-decisioning-hmac-secrets) for
     * more detail about verifying 3DS Decisioning requests.
     */
    fun retrieveSecret(): DecisioningRetrieveSecretResponse =
        retrieveSecret(DecisioningRetrieveSecretParams.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecisioningRetrieveSecretResponse

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none()
    ): DecisioningRetrieveSecretResponse = retrieveSecret(params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(requestOptions: RequestOptions): DecisioningRetrieveSecretResponse =
        retrieveSecret(DecisioningRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    fun rotateSecret() = rotateSecret(DecisioningRotateSecretParams.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see [rotateSecret] */
    fun rotateSecret(params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none()) =
        rotateSecret(params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(requestOptions: RequestOptions) =
        rotateSecret(DecisioningRotateSecretParams.none(), requestOptions)

    /**
     * Simulates a 3DS authentication challenge request from the payment network as if it came from
     * an ACS. Requires being configured for 3DS Customer Decisioning, and enrolled with Lithic's
     * Challenge solution.
     */
    fun simulateChallenge(): DecisioningSimulateChallengeResponse =
        simulateChallenge(DecisioningSimulateChallengeParams.none())

    /** @see [simulateChallenge] */
    fun simulateChallenge(
        params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecisioningSimulateChallengeResponse

    /** @see [simulateChallenge] */
    fun simulateChallenge(
        params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none()
    ): DecisioningSimulateChallengeResponse = simulateChallenge(params, RequestOptions.none())

    /** @see [simulateChallenge] */
    fun simulateChallenge(requestOptions: RequestOptions): DecisioningSimulateChallengeResponse =
        simulateChallenge(DecisioningSimulateChallengeParams.none(), requestOptions)

    /**
     * Endpoint for responding to a 3DS Challenge initiated by a call to
     * /v1/three_ds_decisioning/simulate/challenge
     */
    fun simulateChallengeResponse(params: DecisioningSimulateChallengeResponseParams) =
        simulateChallengeResponse(params, RequestOptions.none())

    /** @see [simulateChallengeResponse] */
    fun simulateChallengeResponse(
        params: DecisioningSimulateChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * A view of [DecisioningService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/challenge_response`, but
         * is otherwise the same as [DecisioningService.challengeResponse].
         */
        @MustBeClosed
        fun challengeResponse(params: DecisioningChallengeResponseParams): HttpResponse =
            challengeResponse(params, RequestOptions.none())

        /** @see [challengeResponse] */
        @MustBeClosed
        fun challengeResponse(
            params: DecisioningChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/three_ds_decisioning/secret`, but is otherwise
         * the same as [DecisioningService.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(): HttpResponseFor<DecisioningRetrieveSecretResponse> =
            retrieveSecret(DecisioningRetrieveSecretParams.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecisioningRetrieveSecretResponse>

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none()
        ): HttpResponseFor<DecisioningRetrieveSecretResponse> =
            retrieveSecret(params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            requestOptions: RequestOptions
        ): HttpResponseFor<DecisioningRetrieveSecretResponse> =
            retrieveSecret(DecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/secret/rotate`, but is
         * otherwise the same as [DecisioningService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(): HttpResponse = rotateSecret(DecisioningRotateSecretParams.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none()
        ): HttpResponse = rotateSecret(params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(requestOptions: RequestOptions): HttpResponse =
            rotateSecret(DecisioningRotateSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/simulate/challenge`, but
         * is otherwise the same as [DecisioningService.simulateChallenge].
         */
        @MustBeClosed
        fun simulateChallenge(): HttpResponseFor<DecisioningSimulateChallengeResponse> =
            simulateChallenge(DecisioningSimulateChallengeParams.none())

        /** @see [simulateChallenge] */
        @MustBeClosed
        fun simulateChallenge(
            params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecisioningSimulateChallengeResponse>

        /** @see [simulateChallenge] */
        @MustBeClosed
        fun simulateChallenge(
            params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none()
        ): HttpResponseFor<DecisioningSimulateChallengeResponse> =
            simulateChallenge(params, RequestOptions.none())

        /** @see [simulateChallenge] */
        @MustBeClosed
        fun simulateChallenge(
            requestOptions: RequestOptions
        ): HttpResponseFor<DecisioningSimulateChallengeResponse> =
            simulateChallenge(DecisioningSimulateChallengeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/three_ds_decisioning/simulate/challenge_response`, but is otherwise the same as
         * [DecisioningService.simulateChallengeResponse].
         */
        @MustBeClosed
        fun simulateChallengeResponse(
            params: DecisioningSimulateChallengeResponseParams
        ): HttpResponse = simulateChallengeResponse(params, RequestOptions.none())

        /** @see [simulateChallengeResponse] */
        @MustBeClosed
        fun simulateChallengeResponse(
            params: DecisioningSimulateChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
