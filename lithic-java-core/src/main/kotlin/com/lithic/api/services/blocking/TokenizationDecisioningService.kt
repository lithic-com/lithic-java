// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.tokenizationdecisioning.TokenizationSecret

interface TokenizationDecisioningService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Retrieve the Tokenization Decisioning secret key. If one does not exist your program yet,
     * calling this endpoint will create one for you. The headers of the Tokenization Decisioning
     * request will contain a hmac signature which you can use to verify requests originate from
     * Lithic. See [this page](https://docs.lithic.com/docs/events-api#verifying-webhooks) for more
     * detail about verifying Tokenization Decisioning requests.
     */
    fun retrieveSecret(): TokenizationSecret =
        retrieveSecret(TokenizationDecisioningRetrieveSecretParams.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: TokenizationDecisioningRetrieveSecretParams =
            TokenizationDecisioningRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenizationSecret

    /** @see [retrieveSecret] */
    fun retrieveSecret(
        params: TokenizationDecisioningRetrieveSecretParams =
            TokenizationDecisioningRetrieveSecretParams.none()
    ): TokenizationSecret = retrieveSecret(params, RequestOptions.none())

    /** @see [retrieveSecret] */
    fun retrieveSecret(requestOptions: RequestOptions): TokenizationSecret =
        retrieveSecret(TokenizationDecisioningRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new Tokenization Decisioning secret key. The old Tokenization Decisioning secret
     * key will be deactivated 24 hours after a successful request to this endpoint.
     */
    fun rotateSecret(): TokenizationDecisioningRotateSecretResponse =
        rotateSecret(TokenizationDecisioningRotateSecretParams.none())

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: TokenizationDecisioningRotateSecretParams =
            TokenizationDecisioningRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenizationDecisioningRotateSecretResponse

    /** @see [rotateSecret] */
    fun rotateSecret(
        params: TokenizationDecisioningRotateSecretParams =
            TokenizationDecisioningRotateSecretParams.none()
    ): TokenizationDecisioningRotateSecretResponse = rotateSecret(params, RequestOptions.none())

    /** @see [rotateSecret] */
    fun rotateSecret(requestOptions: RequestOptions): TokenizationDecisioningRotateSecretResponse =
        rotateSecret(TokenizationDecisioningRotateSecretParams.none(), requestOptions)

    /**
     * A view of [TokenizationDecisioningService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/tokenization_decisioning/secret`, but is
         * otherwise the same as [TokenizationDecisioningService.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(): HttpResponseFor<TokenizationSecret> =
            retrieveSecret(TokenizationDecisioningRetrieveSecretParams.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: TokenizationDecisioningRetrieveSecretParams =
                TokenizationDecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenizationSecret>

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(
            params: TokenizationDecisioningRetrieveSecretParams =
                TokenizationDecisioningRetrieveSecretParams.none()
        ): HttpResponseFor<TokenizationSecret> = retrieveSecret(params, RequestOptions.none())

        /** @see [retrieveSecret] */
        @MustBeClosed
        fun retrieveSecret(requestOptions: RequestOptions): HttpResponseFor<TokenizationSecret> =
            retrieveSecret(TokenizationDecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tokenization_decisioning/secret/rotate`, but is
         * otherwise the same as [TokenizationDecisioningService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(): HttpResponseFor<TokenizationDecisioningRotateSecretResponse> =
            rotateSecret(TokenizationDecisioningRotateSecretParams.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: TokenizationDecisioningRotateSecretParams =
                TokenizationDecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenizationDecisioningRotateSecretResponse>

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            params: TokenizationDecisioningRotateSecretParams =
                TokenizationDecisioningRotateSecretParams.none()
        ): HttpResponseFor<TokenizationDecisioningRotateSecretResponse> =
            rotateSecret(params, RequestOptions.none())

        /** @see [rotateSecret] */
        @MustBeClosed
        fun rotateSecret(
            requestOptions: RequestOptions
        ): HttpResponseFor<TokenizationDecisioningRotateSecretResponse> =
            rotateSecret(TokenizationDecisioningRotateSecretParams.none(), requestOptions)
    }
}
