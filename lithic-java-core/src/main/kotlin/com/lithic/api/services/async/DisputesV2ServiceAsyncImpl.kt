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
import com.lithic.api.models.DisputeV2
import com.lithic.api.models.DisputesV2ListPageAsync
import com.lithic.api.models.DisputesV2ListPageResponse
import com.lithic.api.models.DisputesV2ListParams
import com.lithic.api.models.DisputesV2RetrieveParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DisputesV2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DisputesV2ServiceAsync {

    private val withRawResponse: DisputesV2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DisputesV2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputesV2ServiceAsync =
        DisputesV2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: DisputesV2RetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DisputeV2> =
        // get /v2/disputes/{dispute_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: DisputesV2ListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<DisputesV2ListPageAsync> =
        // get /v2/disputes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DisputesV2ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DisputesV2ServiceAsync.WithRawResponse =
            DisputesV2ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<DisputeV2> =
            jsonHandler<DisputeV2>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DisputesV2RetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DisputeV2>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeToken", params.disputeToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "disputes", params._pathParam(0))
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

        private val listHandler: Handler<DisputesV2ListPageResponse> =
            jsonHandler<DisputesV2ListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DisputesV2ListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<DisputesV2ListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "disputes")
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
                                DisputesV2ListPageAsync.builder()
                                    .service(DisputesV2ServiceAsyncImpl(clientOptions))
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
