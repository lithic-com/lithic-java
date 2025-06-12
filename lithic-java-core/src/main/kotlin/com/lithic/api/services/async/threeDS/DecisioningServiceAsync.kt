// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.DecisioningRetrieveSecretResponse
import com.lithic.api.models.ThreeDSDecisioningChallengeResponseParams
import com.lithic.api.models.ThreeDSDecisioningRetrieveSecretParams
import com.lithic.api.models.ThreeDSDecisioningRotateSecretParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface DecisioningServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): DecisioningServiceAsync

    /** Card program's response to a 3DS Challenge Request (CReq) */
    fun challengeResponse(
        params: ThreeDSDecisioningChallengeResponseParams
    ): CompletableFuture<Void?> = challengeResponse(params, RequestOptions.none())

    /** @see [challengeResponse] */
    fun challengeResponse(
        params: ThreeDSDecisioningChallengeResponseParams,
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
        retrieveSecret(ThreeDSDecisioningRetrieveSecretParams.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: ThreeDSDecisioningRetrieveSecretParams =
            ThreeDSDecisioningRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<DecisioningRetrieveSecretResponse>

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: ThreeDSDecisioningRetrieveSecretParams =
            ThreeDSDecisioningRetrieveSecretParams.none()
    ): CompletableFuture<DecisioningRetrieveSecretResponse> =
        retrieveSecret(params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        requestOptions: RequestOptions
    ): CompletableFuture<DecisioningRetrieveSecretResponse> =
        retrieveSecret(ThreeDSDecisioningRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    fun rotateSecret(): CompletableFuture<Void?> =
        rotateSecret(ThreeDSDecisioningRotateSecretParams.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: ThreeDSDecisioningRotateSecretParams = ThreeDSDecisioningRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: ThreeDSDecisioningRotateSecretParams = ThreeDSDecisioningRotateSecretParams.none()
    ): CompletableFuture<Void?> = rotateSecret(params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(requestOptions: RequestOptions): CompletableFuture<Void?> =
        rotateSecret(ThreeDSDecisioningRotateSecretParams.none(), requestOptions)

    /**
     * A view of [DecisioningServiceAsync] that provides access to raw HTTP responses for each
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
        ): DecisioningServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/challenge_response`, but
         * is otherwise the same as [DecisioningServiceAsync.challengeResponse].
         */
        fun challengeResponse(
            params: ThreeDSDecisioningChallengeResponseParams
        ): CompletableFuture<HttpResponse> = challengeResponse(params, RequestOptions.none())

        /** @see [challengeResponse] */
        fun challengeResponse(
            params: ThreeDSDecisioningChallengeResponseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get /v1/three_ds_decisioning/secret`, but is otherwise
         * the same as [DecisioningServiceAsync.retrieveSecret].
         */
        fun retrieveSecret():
            CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>> =
            retrieveSecret(ThreeDSDecisioningRetrieveSecretParams.none())

        /** @see [retrieveSecret] */
        fun retrieveSecret(
            params: ThreeDSDecisioningRetrieveSecretParams =
                ThreeDSDecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>>

        /** @see [retrieveSecret] */
        fun retrieveSecret(
            params: ThreeDSDecisioningRetrieveSecretParams =
                ThreeDSDecisioningRetrieveSecretParams.none()
        ): CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>> =
            retrieveSecret(params, RequestOptions.none())

        /** @see [retrieveSecret] */
        fun retrieveSecret(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>> =
            retrieveSecret(ThreeDSDecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/three_ds_decisioning/secret/rotate`, but is
         * otherwise the same as [DecisioningServiceAsync.rotateSecret].
         */
        fun rotateSecret(): CompletableFuture<HttpResponse> =
            rotateSecret(ThreeDSDecisioningRotateSecretParams.none())

        /** @see [rotateSecret] */
        fun rotateSecret(
            params: ThreeDSDecisioningRotateSecretParams =
                ThreeDSDecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see [rotateSecret] */
        fun rotateSecret(
            params: ThreeDSDecisioningRotateSecretParams =
                ThreeDSDecisioningRotateSecretParams.none()
        ): CompletableFuture<HttpResponse> = rotateSecret(params, RequestOptions.none())

        /** @see [rotateSecret] */
        fun rotateSecret(requestOptions: RequestOptions): CompletableFuture<HttpResponse> =
            rotateSecret(ThreeDSDecisioningRotateSecretParams.none(), requestOptions)
    }
}
