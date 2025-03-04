// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.DecisioningRetrieveSecretResponse
import com.lithic.api.models.ThreeDSDecisioningChallengeResponseParams
import com.lithic.api.models.ThreeDSDecisioningRetrieveSecretParams
import com.lithic.api.models.ThreeDSDecisioningRotateSecretParams
import java.util.concurrent.CompletableFuture

class DecisioningServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DecisioningServiceAsync {

    private val withRawResponse: DecisioningServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DecisioningServiceAsync.WithRawResponse = withRawResponse

    override fun challengeResponse(
        params: ThreeDSDecisioningChallengeResponseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/three_ds_decisioning/challenge_response
        withRawResponse().challengeResponse(params, requestOptions).thenAccept {}

    override fun retrieveSecret(
        params: ThreeDSDecisioningRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DecisioningRetrieveSecretResponse> =
        // get /v1/three_ds_decisioning/secret
        withRawResponse().retrieveSecret(params, requestOptions).thenApply { it.parse() }

    override fun rotateSecret(
        params: ThreeDSDecisioningRotateSecretParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/three_ds_decisioning/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DecisioningServiceAsync.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val challengeResponseHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun challengeResponse(
            params: ThreeDSDecisioningChallengeResponseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "three_ds_decisioning", "challenge_response")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { challengeResponseHandler.handle(it) } }
                }
        }

        private val retrieveSecretHandler: Handler<DecisioningRetrieveSecretResponse> =
            jsonHandler<DecisioningRetrieveSecretResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveSecret(
            params: ThreeDSDecisioningRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DecisioningRetrieveSecretResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "three_ds_decisioning", "secret")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveSecretHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val rotateSecretHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun rotateSecret(
            params: ThreeDSDecisioningRotateSecretParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "three_ds_decisioning", "secret", "rotate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { rotateSecretHandler.handle(it) } }
                }
        }
    }
}
