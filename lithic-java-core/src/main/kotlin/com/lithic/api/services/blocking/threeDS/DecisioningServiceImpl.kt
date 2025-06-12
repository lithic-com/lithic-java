// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeDS

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
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
import com.lithic.api.core.prepare
import com.lithic.api.models.DecisioningRetrieveSecretResponse
import com.lithic.api.models.ThreeDSDecisioningChallengeResponseParams
import com.lithic.api.models.ThreeDSDecisioningRetrieveSecretParams
import com.lithic.api.models.ThreeDSDecisioningRotateSecretParams
import java.util.function.Consumer

class DecisioningServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DecisioningService {

    private val withRawResponse: DecisioningService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DecisioningService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DecisioningService =
        DecisioningServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun challengeResponse(
        params: ThreeDSDecisioningChallengeResponseParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/three_ds_decisioning/challenge_response
        withRawResponse().challengeResponse(params, requestOptions)
    }

    override fun retrieveSecret(
        params: ThreeDSDecisioningRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): DecisioningRetrieveSecretResponse =
        // get /v1/three_ds_decisioning/secret
        withRawResponse().retrieveSecret(params, requestOptions).parse()

    override fun rotateSecret(
        params: ThreeDSDecisioningRotateSecretParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/three_ds_decisioning/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DecisioningService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DecisioningService.WithRawResponse =
            DecisioningServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val challengeResponseHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun challengeResponse(
            params: ThreeDSDecisioningChallengeResponseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "three_ds_decisioning", "challenge_response")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { challengeResponseHandler.handle(it) } }
        }

        private val retrieveSecretHandler: Handler<DecisioningRetrieveSecretResponse> =
            jsonHandler<DecisioningRetrieveSecretResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveSecret(
            params: ThreeDSDecisioningRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DecisioningRetrieveSecretResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "three_ds_decisioning", "secret")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveSecretHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rotateSecretHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun rotateSecret(
            params: ThreeDSDecisioningRotateSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "three_ds_decisioning", "secret", "rotate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { rotateSecretHandler.handle(it) } }
        }
    }
}
