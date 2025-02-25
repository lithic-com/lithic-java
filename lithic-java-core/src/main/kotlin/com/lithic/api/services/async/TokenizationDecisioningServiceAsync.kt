// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.TokenizationSecret
import java.util.concurrent.CompletableFuture

interface TokenizationDecisioningServiceAsync {

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
}
