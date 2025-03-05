// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.threeDS

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DecisioningRetrieveSecretResponse
import com.lithic.api.models.DecisioningSimulateChallengeResponse
import com.lithic.api.models.ThreeDSDecisioningChallengeResponseParams
import com.lithic.api.models.ThreeDSDecisioningRetrieveSecretParams
import com.lithic.api.models.ThreeDSDecisioningRotateSecretParams
import com.lithic.api.models.ThreeDSDecisioningSimulateChallengeParams
import com.lithic.api.models.ThreeDSDecisioningSimulateChallengeResponseParams

interface DecisioningService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Card program's response to a 3DS Challenge Request (CReq) */
    @JvmOverloads
    fun challengeResponse(
        params: ThreeDSDecisioningChallengeResponseParams,
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
    @JvmOverloads
    fun retrieveSecret(
        params: ThreeDSDecisioningRetrieveSecretParams =
            ThreeDSDecisioningRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecisioningRetrieveSecretResponse

    /**
     * Retrieve the 3DS Decisioning HMAC secret key. If one does not exist for your program yet,
     * calling this endpoint will create one for you. The headers (which you can use to verify 3DS
     * Decisioning requests) will begin appearing shortly after calling this endpoint for the first
     * time. See
     * [this page](https://docs.lithic.com/docs/3ds-decisioning#3ds-decisioning-hmac-secrets) for
     * more detail about verifying 3DS Decisioning requests.
     */
    fun retrieveSecret(requestOptions: RequestOptions): DecisioningRetrieveSecretResponse =
        retrieveSecret(ThreeDSDecisioningRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    @JvmOverloads
    fun rotateSecret(
        params: ThreeDSDecisioningRotateSecretParams = ThreeDSDecisioningRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    fun rotateSecret(requestOptions: RequestOptions) =
        rotateSecret(ThreeDSDecisioningRotateSecretParams.none(), requestOptions)

    /**
     * Simulates a 3DS authentication challenge request from the payment network as if it came from
     * an ACS. Requires being configured for 3DS Customer Decisioning, and enrolled with Lithic's
     * Challenge solution.
     */
    @JvmOverloads
    fun simulateChallenge(
        params: ThreeDSDecisioningSimulateChallengeParams =
            ThreeDSDecisioningSimulateChallengeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DecisioningSimulateChallengeResponse

    /**
     * Simulates a 3DS authentication challenge request from the payment network as if it came from
     * an ACS. Requires being configured for 3DS Customer Decisioning, and enrolled with Lithic's
     * Challenge solution.
     */
    fun simulateChallenge(requestOptions: RequestOptions): DecisioningSimulateChallengeResponse =
        simulateChallenge(ThreeDSDecisioningSimulateChallengeParams.none(), requestOptions)

    /**
     * Endpoint for responding to a 3DS Challenge initiated by a call to
     * /v1/three_ds_decisioning/simulate/challenge
     */
    @JvmOverloads
    fun simulateChallengeResponse(
        params: ThreeDSDecisioningSimulateChallengeResponseParams,
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
        @JvmOverloads
        @MustBeClosed
        fun challengeResponse(
            params: ThreeDSDecisioningChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get /v1/three_ds_decisioning/secret`, but is otherwise
         * the same as [DecisioningService.retrieveSecret].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieveSecret(
            params: ThreeDSDecisioningRetrieveSecretParams =
                ThreeDSDecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecisioningRetrieveSecretResponse>

        /**
         * Returns a raw HTTP response for `get /v1/three_ds_decisioning/secret`, but is otherwise
         * the same as [DecisioningService.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(
            requestOptions: RequestOptions
        ): HttpResponseFor<DecisioningRetrieveSecretResponse> =
            retrieveSecret(ThreeDSDecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/secret/rotate`, but is
         * otherwise the same as [DecisioningService.rotateSecret].
         */
        @JvmOverloads
        @MustBeClosed
        fun rotateSecret(
            params: ThreeDSDecisioningRotateSecretParams =
                ThreeDSDecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/secret/rotate`, but is
         * otherwise the same as [DecisioningService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(requestOptions: RequestOptions): HttpResponse =
            rotateSecret(ThreeDSDecisioningRotateSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/simulate/challenge`, but
         * is otherwise the same as [DecisioningService.simulateChallenge].
         */
        @JvmOverloads
        @MustBeClosed
        fun simulateChallenge(
            params: ThreeDSDecisioningSimulateChallengeParams =
                ThreeDSDecisioningSimulateChallengeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DecisioningSimulateChallengeResponse>

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/simulate/challenge`, but
         * is otherwise the same as [DecisioningService.simulateChallenge].
         */
        @MustBeClosed
        fun simulateChallenge(
            requestOptions: RequestOptions
        ): HttpResponseFor<DecisioningSimulateChallengeResponse> =
            simulateChallenge(ThreeDSDecisioningSimulateChallengeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/three_ds_decisioning/simulate/challenge_response`, but is otherwise the same as
         * [DecisioningService.simulateChallengeResponse].
         */
        @JvmOverloads
        @MustBeClosed
        fun simulateChallengeResponse(
            params: ThreeDSDecisioningSimulateChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse
    }
}
