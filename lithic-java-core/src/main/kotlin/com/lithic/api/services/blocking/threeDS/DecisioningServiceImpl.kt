// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeDS

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.errors.LithicError
import com.lithic.api.models.DecisioningRetrieveSecretResponse
import com.lithic.api.models.DecisioningSimulateChallengeResponse
import com.lithic.api.models.ThreeDSDecisioningChallengeResponseParams
import com.lithic.api.models.ThreeDSDecisioningRetrieveSecretParams
import com.lithic.api.models.ThreeDSDecisioningRotateSecretParams
import com.lithic.api.models.ThreeDSDecisioningSimulateChallengeParams
import com.lithic.api.models.ThreeDSDecisioningSimulateChallengeResponseParams

class DecisioningServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DecisioningService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val challengeResponseHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /** Card program's response to a 3DS Challenge Request (CReq) */
    override fun challengeResponse(
        params: ThreeDSDecisioningChallengeResponseParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "three_ds_decisioning", "challenge_response")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { challengeResponseHandler.handle(it) }
        }
    }

    private val retrieveSecretHandler: Handler<DecisioningRetrieveSecretResponse> =
        jsonHandler<DecisioningRetrieveSecretResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve the 3DS Decisioning HMAC secret key. If one does not exist for your program yet,
     * calling this endpoint will create one for you. The headers (which you can use to verify 3DS
     * Decisioning requests) will begin appearing shortly after calling this endpoint for the first
     * time. See
     * [this page](https://docs.lithic.com/docs/3ds-decisioning#3ds-decisioning-hmac-secrets) for
     * more detail about verifying 3DS Decisioning requests.
     */
    override fun retrieveSecret(
        params: ThreeDSDecisioningRetrieveSecretParams,
        requestOptions: RequestOptions
    ): DecisioningRetrieveSecretResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "three_ds_decisioning", "secret")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveSecretHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val rotateSecretHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    override fun rotateSecret(
        params: ThreeDSDecisioningRotateSecretParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "three_ds_decisioning", "secret", "rotate")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { rotateSecretHandler.handle(it) }
        }
    }

    private val simulateChallengeHandler: Handler<DecisioningSimulateChallengeResponse> =
        jsonHandler<DecisioningSimulateChallengeResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates a 3DS authentication challenge request from the payment network as if it came from
     * an ACS. Requires being configured for 3DS Customer Decisioning, and enrolled with Lithic's
     * Challenge solution.
     */
    override fun simulateChallenge(
        params: ThreeDSDecisioningSimulateChallengeParams,
        requestOptions: RequestOptions
    ): DecisioningSimulateChallengeResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "three_ds_decisioning", "simulate", "challenge")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateChallengeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val simulateChallengeResponseHandler: Handler<Void?> =
        emptyHandler().withErrorHandler(errorHandler)

    /**
     * Endpoint for responding to a 3DS Challenge initiated by a call to
     * /v1/three_ds_decisioning/simulate/challenge
     */
    override fun simulateChallengeResponse(
        params: ThreeDSDecisioningSimulateChallengeResponseParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "three_ds_decisioning", "simulate", "challenge_response")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { simulateChallengeResponseHandler.handle(it) }
        }
    }
}
