// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.TokenizationSecret
import java.util.concurrent.CompletableFuture

interface TokenizationDecisioningServiceAsync {

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
    ): CompletableFuture<TokenizationSecret>

    /**
     * Retrieve the Tokenization Decisioning secret key. If one does not exist your program yet,
     * calling this endpoint will create one for you. The headers of the Tokenization Decisioning
     * request will contain a hmac signature which you can use to verify requests originate from
     * Lithic. See [this page](https://docs.lithic.com/docs/events-api#verifying-webhooks) for more
     * detail about verifying Tokenization Decisioning requests.
     */
    fun retrieveSecret(requestOptions: RequestOptions): CompletableFuture<TokenizationSecret> =
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
    ): CompletableFuture<TokenizationDecisioningRotateSecretResponse>

    /**
     * Generate a new Tokenization Decisioning secret key. The old Tokenization Decisioning secret
     * key will be deactivated 24 hours after a successful request to this endpoint.
     */
    fun rotateSecret(
        requestOptions: RequestOptions
    ): CompletableFuture<TokenizationDecisioningRotateSecretResponse> =
        rotateSecret(TokenizationDecisioningRotateSecretParams.none(), requestOptions)

    /**
     * A view of [TokenizationDecisioningServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/tokenization_decisioning/secret`, but is
         * otherwise the same as [TokenizationDecisioningServiceAsync.retrieveSecret].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieveSecret(
            params: TokenizationDecisioningRetrieveSecretParams =
                TokenizationDecisioningRetrieveSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationSecret>>

        /**
         * Returns a raw HTTP response for `get /v1/tokenization_decisioning/secret`, but is
         * otherwise the same as [TokenizationDecisioningServiceAsync.retrieveSecret].
         */
        @MustBeClosed
        fun retrieveSecret(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenizationSecret>> =
            retrieveSecret(TokenizationDecisioningRetrieveSecretParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/tokenization_decisioning/secret/rotate`, but is
         * otherwise the same as [TokenizationDecisioningServiceAsync.rotateSecret].
         */
        @JvmOverloads
        @MustBeClosed
        fun rotateSecret(
            params: TokenizationDecisioningRotateSecretParams =
                TokenizationDecisioningRotateSecretParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TokenizationDecisioningRotateSecretResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/tokenization_decisioning/secret/rotate`, but is
         * otherwise the same as [TokenizationDecisioningServiceAsync.rotateSecret].
         */
        @MustBeClosed
        fun rotateSecret(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TokenizationDecisioningRotateSecretResponse>> =
            rotateSecret(TokenizationDecisioningRotateSecretParams.none(), requestOptions)
    }
}
