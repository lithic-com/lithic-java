// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRetrieveSecretParams
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRotateSecretParams
import com.lithic.api.models.tokenizationdecisioning.TokenizationDecisioningRotateSecretResponse
import com.lithic.api.models.tokenizationdecisioning.TokenizationSecret
import java.util.concurrent.CompletableFuture

class TokenizationDecisioningServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    TokenizationDecisioningServiceAsync {

    private val withRawResponse: TokenizationDecisioningServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenizationDecisioningServiceAsync.WithRawResponse =
        withRawResponse

    override fun retrieveSecret(
        params: TokenizationDecisioningRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenizationSecret> =
        // get /v1/tokenization_decisioning/secret
        withRawResponse().retrieveSecret(params, requestOptions).thenApply { it.parse() }

    override fun rotateSecret(
        params: TokenizationDecisioningRotateSecretParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenizationDecisioningRotateSecretResponse> =
        // post /v1/tokenization_decisioning/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenizationDecisioningServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveSecretHandler: Handler<TokenizationSecret> =
            jsonHandler<TokenizationSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieveSecret(
            params: TokenizationDecisioningRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenizationSecret>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenization_decisioning", "secret")
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

        private val rotateSecretHandler: Handler<TokenizationDecisioningRotateSecretResponse> =
            jsonHandler<TokenizationDecisioningRotateSecretResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun rotateSecret(
            params: TokenizationDecisioningRotateSecretParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenizationDecisioningRotateSecretResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenization_decisioning", "secret", "rotate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { rotateSecretHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
