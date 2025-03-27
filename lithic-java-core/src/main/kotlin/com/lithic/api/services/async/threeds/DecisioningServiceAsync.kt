// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeds

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
import java.util.concurrent.CompletableFuture

interface DecisioningServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Card program's response to a 3DS Challenge Request (CReq) */
    fun challengeResponse(params: DecisioningChallengeResponseParams): CompletableFuture<Void?> =
        challengeResponse(params, RequestOptions.none())

    /** @see [challengeResponse] */
    fun challengeResponse(
        params: DecisioningChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Retrieve the 3DS Decisioning HMAC secret key. If one does not exist for your program yet,
     * calling this endpoint will create one for you. The headers (which you can use to verify 3DS
     * Decisioning requests) will begin appearing shortly after calling this endpoint for the first
     * time. See
     * [this page](https://docs.lithic.com/docs/3ds-decisioning#3ds-decisioning-hmac-secrets) for
     * more detail about verifying 3DS Decisioning requests.
     */
    fun retrieveSecret(): CompletableFuture<DecisioningRetrieveSecretResponse> =
        retrieveSecret(DecisioningRetrieveSecretParams.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DecisioningRetrieveSecretResponse>

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none()
    ): CompletableFuture<DecisioningRetrieveSecretResponse> =
        retrieveSecret(params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        requestOptions: RequestOptions
    ): CompletableFuture<DecisioningRetrieveSecretResponse> =
        retrieveSecret(DecisioningRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    fun rotateSecret(): CompletableFuture<Void?> =
        rotateSecret(DecisioningRotateSecretParams.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none()
    ): CompletableFuture<Void?> = rotateSecret(params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(requestOptions: RequestOptions): CompletableFuture<Void?> =
        rotateSecret(DecisioningRotateSecretParams.none(), requestOptions)

    /**
     * Simulates a 3DS authentication challenge request from the payment network as if it came from
     * an ACS. Requires being configured for 3DS Customer Decisioning, and enrolled with Lithic's
     * Challenge solution.
     */
    fun simulateChallenge(): CompletableFuture<DecisioningSimulateChallengeResponse> =
        simulateChallenge(DecisioningSimulateChallengeParams.none())

    /** @see [simulateChallenge] */
    fun simulateChallenge(
        params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DecisioningSimulateChallengeResponse>

    /** @see [simulateChallenge] */
    fun simulateChallenge(
        params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none()
    ): CompletableFuture<DecisioningSimulateChallengeResponse> =
        simulateChallenge(params, RequestOptions.none())

    /** @see [simulateChallenge] */
    fun simulateChallenge(
        requestOptions: RequestOptions
    ): CompletableFuture<DecisioningSimulateChallengeResponse> =
        simulateChallenge(DecisioningSimulateChallengeParams.none(), requestOptions)

    /**
     * Endpoint for responding to a 3DS Challenge initiated by a call to
     * /v1/three_ds_decisioning/simulate/challenge
     */
    fun simulateChallengeResponse(
        params: DecisioningSimulateChallengeResponseParams
    ): CompletableFuture<Void?> = simulateChallengeResponse(params, RequestOptions.none())

    /** @see [simulateChallengeResponse] */
    fun simulateChallengeResponse(
        params: DecisioningSimulateChallengeResponseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * A view of [DecisioningServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/challenge_response`, but
         * is otherwise the same as [DecisioningServiceAsync.challengeResponse].
         */
        @MustBeClosed
        fun challengeResponse(
            params: DecisioningChallengeResponseParams
        ): CompletableFuture<HttpResponse> = challengeResponse(params, RequestOptions.none())

        /** @see [challengeResponse] */
        @MustBeClosed
        fun challengeResponse(
            params: DecisioningChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /v1/three_ds_decisioning/secret`, but is otherwise
         * the same as [DecisioningServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret():
            CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>> =
            retrieveSecret(DecisioningRetrieveSecretParams.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>>

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: DecisioningRetrieveSecretParams = DecisioningRetrieveSecretParams.none()
        ): CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>> =
            retrieveSecret(params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>> =
            retrieveSecret(DecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/secret/rotate`, but is
         * otherwise the same as [DecisioningServiceAsync.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(): CompletableFuture<HttpResponse> =
            rotateSecret(DecisioningRotateSecretParams.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: DecisioningRotateSecretParams = DecisioningRotateSecretParams.none()
        ): CompletableFuture<HttpResponse> = rotateSecret(params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            rotateSecret(DecisioningRotateSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/simulate/challenge`, but
         * is otherwise the same as [DecisioningServiceAsync.simulateChallenge].
         */
        @MustBeClosed
        fun simulateChallenge():
            CompletableFuture<HttpResponseFor<DecisioningSimulateChallengeResponse>> =
            simulateChallenge(DecisioningSimulateChallengeParams.none())

        /** @see [simulateChallenge] */
        @MustBeClosed
        fun simulateChallenge(
            params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DecisioningSimulateChallengeResponse>>

        /** @see [simulateChallenge] */
        @MustBeClosed
        fun simulateChallenge(
            params: DecisioningSimulateChallengeParams = DecisioningSimulateChallengeParams.none()
        ): CompletableFuture<HttpResponseFor<DecisioningSimulateChallengeResponse>> =
            simulateChallenge(params, RequestOptions.none())

        /** @see [simulateChallenge] */
        @MustBeClosed
        fun simulateChallenge(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DecisioningSimulateChallengeResponse>> =
            simulateChallenge(DecisioningSimulateChallengeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/three_ds_decisioning/simulate/challenge_response`, but is otherwise the same as
         * [DecisioningServiceAsync.simulateChallengeResponse].
         */
        @MustBeClosed
        fun simulateChallengeResponse(
            params: DecisioningSimulateChallengeResponseParams
        ): CompletableFuture<HttpResponse> =
            simulateChallengeResponse(params, RequestOptions.none())

        /** @see [simulateChallengeResponse] */
        @MustBeClosed
        fun simulateChallengeResponse(
            params: DecisioningSimulateChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>
    }
}
