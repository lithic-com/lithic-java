// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorBodyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.DigitalCardArt
import com.lithic.api.models.DigitalCardArtListPageAsync
import com.lithic.api.models.DigitalCardArtListPageResponse
import com.lithic.api.models.DigitalCardArtListParams
import com.lithic.api.models.DigitalCardArtRetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DigitalCardArtServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DigitalCardArtServiceAsync {

    private val withRawResponse: DigitalCardArtServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DigitalCardArtServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): DigitalCardArtServiceAsync =
        DigitalCardArtServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardArt> =
        // get /v1/digital_card_art/{digital_card_art_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DigitalCardArtListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DigitalCardArtListPageAsync> =
        // get /v1/digital_card_art
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigitalCardArtServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DigitalCardArtServiceAsync.WithRawResponse =
            DigitalCardArtServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<DigitalCardArt> =
            jsonHandler<DigitalCardArt>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DigitalCardArtRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardArt>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalCardArtToken", params.digitalCardArtToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "digital_card_art", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<DigitalCardArtListPageResponse> =
            jsonHandler<DigitalCardArtListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DigitalCardArtListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DigitalCardArtListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "digital_card_art")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                DigitalCardArtListPageAsync.builder()
                                    .service(DigitalCardArtServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
