// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

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
import com.lithic.api.models.TokenizationActivateParams
import com.lithic.api.models.TokenizationDeactivateParams
import com.lithic.api.models.TokenizationListPage
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

class TokenizationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TokenizationService {

    private val withRawResponse: TokenizationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TokenizationService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: TokenizationRetrieveParams,
        requestOptions: RequestOptions,
    ): TokenizationRetrieveResponse =
        // get /v1/tokenizations/{tokenization_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TokenizationListParams,
        requestOptions: RequestOptions,
    ): TokenizationListPage =
        // get /v1/tokenizations
        withRawResponse().list(params, requestOptions).parse()

    override fun activate(params: TokenizationActivateParams, requestOptions: RequestOptions) {
        // post /v1/tokenizations/{tokenization_token}/activate
        withRawResponse().activate(params, requestOptions)
    }

    override fun deactivate(params: TokenizationDeactivateParams, requestOptions: RequestOptions) {
        // post /v1/tokenizations/{tokenization_token}/deactivate
        withRawResponse().deactivate(params, requestOptions)
    }

    override fun pause(params: TokenizationPauseParams, requestOptions: RequestOptions) {
        // post /v1/tokenizations/{tokenization_token}/pause
        withRawResponse().pause(params, requestOptions)
    }

    override fun resendActivationCode(
        params: TokenizationResendActivationCodeParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/tokenizations/{tokenization_token}/resend_activation_code
        withRawResponse().resendActivationCode(params, requestOptions)
    }

    override fun simulate(
        params: TokenizationSimulateParams,
        requestOptions: RequestOptions,
    ): TokenizationSimulateResponse =
        // post /v1/simulate/tokenizations
        withRawResponse().simulate(params, requestOptions).parse()

    override fun unpause(params: TokenizationUnpauseParams, requestOptions: RequestOptions) {
        // post /v1/tokenizations/{tokenization_token}/unpause
        withRawResponse().unpause(params, requestOptions)
    }

    override fun updateDigitalCardArt(
        params: TokenizationUpdateDigitalCardArtParams,
        requestOptions: RequestOptions,
    ): TokenizationUpdateDigitalCardArtResponse =
        // post /v1/tokenizations/{tokenization_token}/update_digital_card_art
        withRawResponse().updateDigitalCardArt(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TokenizationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<TokenizationRetrieveResponse> =
            jsonHandler<TokenizationRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: TokenizationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
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
        ): HttpResponseFor<TokenizationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "tokenizations")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TokenizationListPage.of(TokenizationServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val activateHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun activate(
            params: TokenizationActivateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0), "activate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { activateHandler.handle(it) } }
        }

        private val deactivateHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun deactivate(
            params: TokenizationDeactivateParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0), "deactivate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { deactivateHandler.handle(it) } }
        }

        private val pauseHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun pause(
            params: TokenizationPauseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0), "pause")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { pauseHandler.handle(it) } }
        }

        private val resendActivationCodeHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun resendActivationCode(
            params: TokenizationResendActivationCodeParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { resendActivationCodeHandler.handle(it) } }
        }

        private val simulateHandler: Handler<TokenizationSimulateResponse> =
            jsonHandler<TokenizationSimulateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulate(
            params: TokenizationSimulateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationSimulateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "tokenizations")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val unpauseHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun unpause(
            params: TokenizationUnpauseParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "tokenizations", params._pathParam(0), "unpause")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { unpauseHandler.handle(it) } }
        }

        private val updateDigitalCardArtHandler: Handler<TokenizationUpdateDigitalCardArtResponse> =
            jsonHandler<TokenizationUpdateDigitalCardArtResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun updateDigitalCardArt(
            params: TokenizationUpdateDigitalCardArtParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TokenizationUpdateDigitalCardArtResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
