// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.TokenizationSecret

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
    @JvmOverloads
    fun retrieveSecret(
        params: TokenizationDecisioningRetrieveSecretParams =
            TokenizationDecisioningRetrieveSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenizationSecret

    /**
     * Retrieve the Tokenization Decisioning secret key. If one does not exist your program yet,
     * calling this endpoint will create one for you. The headers of the Tokenization Decisioning
     * request will contain a hmac signature which you can use to verify requests originate from
     * Lithic. See [this page](https://docs.lithic.com/docs/events-api#verifying-webhooks) for more
     * detail about verifying Tokenization Decisioning requests.
     */
    fun retrieveSecret(requestOptions: RequestOptions): TokenizationSecret =
        retrieveSecret(TokenizationDecisioningRetrieveSecretParams.none(), requestOptions)

    /**
     * Generate a new Tokenization Decisioning secret key. The old Tokenization Decisioning secret
     * key will be deactivated 24 hours after a successful request to this endpoint.
     */
    @JvmOverloads
    fun rotateSecret(
        params: TokenizationDecisioningRotateSecretParams =
            TokenizationDecisioningRotateSecretParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TokenizationDecisioningRotateSecretResponse

    /**
     * Generate a new Tokenization Decisioning secret key. The old Tokenization Decisioning secret
     * key will be deactivated 24 hours after a successful request to this endpoint.
     */
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
        @JvmOverloads
        @MustBeClosed
        fun retrieveSecret(
            params: TokenizationDecisioningRetrieveSecretParams =
                TokenizationDecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenizationSecret>

        /**
         * Returns a raw HTTP response for `get /v1/tokenization_decisioning/secret`, but is
         * otherwise the same as [TokenizationDecisioningService.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(requestOptions: RequestOptions): HttpResponseFor<TokenizationSecret> =
            retrieveSecret(TokenizationDecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tokenization_decisioning/secret/rotate`, but is
         * otherwise the same as [TokenizationDecisioningService.rotateSecret].
         */
        @JvmOverloads
        @MustBeClosed
        fun rotateSecret(
            params: TokenizationDecisioningRotateSecretParams =
                TokenizationDecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TokenizationDecisioningRotateSecretResponse>

        /**
         * Returns a raw HTTP response for `post /v1/tokenization_decisioning/secret/rotate`, but is
         * otherwise the same as [TokenizationDecisioningService.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(
            requestOptions: RequestOptions
        ): HttpResponseFor<TokenizationDecisioningRotateSecretResponse> =
            rotateSecret(TokenizationDecisioningRotateSecretParams.none(), requestOptions)
    }
}
