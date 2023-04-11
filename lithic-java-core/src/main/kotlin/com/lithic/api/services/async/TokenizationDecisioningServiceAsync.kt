@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.TokenizationSecret
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.JsonField
import com.lithic.api.core.RequestOptions
import com.lithic.api.errors.LithicError
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler

interface TokenizationDecisioningServiceAsync {

    /**
     * Retrieve the Tokenization Decisioning secret key. If one does not exist your
     * program yet, calling this endpoint will create one for you. The headers of the
     * Tokenization Decisioning request will contain a hmac signature which you can use
     * to verify requests originate from Lithic. See
     * [this page](https://docs.lithic.com/docs/events-api#verifying-webhooks) for more
     * detail about verifying Tokenization Decisioning requests.
     */
    @JvmOverloads
    fun retrieveSecret(params: TokenizationDecisioningRetrieveSecretParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TokenizationSecret>

    /**
     * Generate a new Tokenization Decisioning secret key. The old Tokenization
     * Decisioning secret key will be deactivated 24 hours after a successful request
     * to this endpoint.
     */
    @JvmOverloads
    fun rotateSecret(params: TokenizationDecisioningRotateSecretParams, requestOptions: RequestOptions = RequestOptions.none()): CompletableFuture<TokenizationDecisioningRotateSecretResponse>
}
