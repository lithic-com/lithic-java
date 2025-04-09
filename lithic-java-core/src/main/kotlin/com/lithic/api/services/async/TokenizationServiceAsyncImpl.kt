// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

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
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.TokenizationActivateParams
import com.lithic.api.models.TokenizationDeactivateParams
import com.lithic.api.models.TokenizationListPageAsync
import com.lithic.api.models.TokenizationListPageResponse
import com.lithic.api.models.TokenizationListParams
import com.lithic.api.models.TokenizationPauseParams
import com.lithic.api.models.TokenizationResendActivationCodeParams
import com.lithic.api.models.TokenizationRetrieveParams
import com.lithic.api.models.TokenizationRetrieveResponse
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationSimulateResponse
import com.lithic.api.models.TokenizationUnpauseParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtParams
import com.lithic.api.models.TokenizationUpdateDigitalCardArtResponse
import java.util.concurrent.CompletableFuture

class TokenizationServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenizationServiceAsync {

    private val withRawResponse: TokenizationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenizationServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: TokenizationRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenizationRetrieveResponse> =
        // get /v1/tokenizations/{tokenization_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TokenizationListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenizationListPageAsync> =
        // get /v1/tokenizations
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun activate(
        params: TokenizationActivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/tokenizations/{tokenization_token}/activate
        withRawResponse().activate(params, requestOptions).thenAccept {}

    override fun deactivate(
        params: TokenizationDeactivateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/tokenizations/{tokenization_token}/deactivate
        withRawResponse().deactivate(params, requestOptions).thenAccept {}

    override fun pause(
        params: TokenizationPauseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/tokenizations/{tokenization_token}/pause
        withRawResponse().pause(params, requestOptions).thenAccept {}

    override fun resendActivationCode(
        params: TokenizationResendActivationCodeParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/tokenizations/{tokenization_token}/resend_activation_code
        withRawResponse().resendActivationCode(params, requestOptions).thenAccept {}

    override fun simulate(
        params: TokenizationSimulateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenizationSimulateResponse> =
        // post /v1/simulate/tokenizations
        withRawResponse().simulate(params, requestOptions).thenApply { it.parse() }

    override fun unpause(
        params: TokenizationUnpauseParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/tokenizations/{tokenization_token}/unpause
        withRawResponse().unpause(params, requestOptions).thenAccept {}

    override fun updateDigitalCardArt(
        params: TokenizationUpdateDigitalCardArtParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TokenizationUpdateDigitalCardArtResponse> =
        // post /v1/tokenizations/{tokenization_token}/update_digital_card_art
        withRawResponse().updateDigitalCardArt(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenizationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<TokenizationRetrieveResponse> =
            jsonHandler<TokenizationRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: TokenizationRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenizationRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TokenizationListPageResponse> =
            jsonHandler<TokenizationListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TokenizationListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenizationListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenizations")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TokenizationListPageAsync.of(
                                    TokenizationServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val activateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun activate(
            params: TokenizationActivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0), "activate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { activateHandler.handle(it) } }
                }
        }

        private val deactivateHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun deactivate(
            params: TokenizationDeactivateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0), "deactivate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deactivateHandler.handle(it) } }
                }
        }

        private val pauseHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun pause(
            params: TokenizationPauseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0), "pause")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { pauseHandler.handle(it) } }
                }
        }

        private val resendActivationCodeHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun resendActivationCode(
            params: TokenizationResendActivationCodeParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "tokenizations",
                        params._pathParam(0),
                        "resend_activation_code",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { resendActivationCodeHandler.handle(it) } }
                }
        }

        private val simulateHandler: Handler<TokenizationSimulateResponse> =
            jsonHandler<TokenizationSimulateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulate(
            params: TokenizationSimulateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenizationSimulateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "tokenizations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val unpauseHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun unpause(
            params: TokenizationUnpauseParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0), "unpause")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { unpauseHandler.handle(it) } }
                }
        }

        private val updateDigitalCardArtHandler: Handler<TokenizationUpdateDigitalCardArtResponse> =
            jsonHandler<TokenizationUpdateDigitalCardArtResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateDigitalCardArt(
            params: TokenizationUpdateDigitalCardArtParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TokenizationUpdateDigitalCardArtResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "tokenizations",
                        params._pathParam(0),
                        "update_digital_card_art",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateDigitalCardArtHandler.handle(it) }
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
