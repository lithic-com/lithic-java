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
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.Hold
import com.lithic.api.models.HoldCreateParams
import com.lithic.api.models.HoldListPageAsync
import com.lithic.api.models.HoldListPageResponse
import com.lithic.api.models.HoldListParams
import com.lithic.api.models.HoldRetrieveParams
import com.lithic.api.models.HoldVoidParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HoldServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    HoldServiceAsync {

    private val withRawResponse: HoldServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HoldServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldServiceAsync =
        HoldServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Hold> =
        // post /v1/financial_accounts/{financial_account_token}/holds
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Hold> =
        // get /v1/holds/{hold_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: HoldListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<HoldListPageAsync> =
        // get /v1/financial_accounts/{financial_account_token}/holds
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun void_(
        params: HoldVoidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Hold> =
        // post /v1/holds/{hold_token}/void
        withRawResponse().void_(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HoldServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HoldServiceAsync.WithRawResponse =
            HoldServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Hold> = jsonHandler<Hold>(clientOptions.jsonMapper)

        override fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Hold>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "holds")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Hold> = jsonHandler<Hold>(clientOptions.jsonMapper)

        override fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Hold>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("holdToken", params.holdToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "holds", params._pathParam(0))
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

        private val listHandler: Handler<HoldListPageResponse> =
            jsonHandler<HoldListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: HoldListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "holds")
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
                                HoldListPageAsync.builder()
                                    .service(HoldServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val voidHandler: Handler<Hold> = jsonHandler<Hold>(clientOptions.jsonMapper)

        override fun void_(
            params: HoldVoidParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Hold>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("holdToken", params.holdToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "holds", params._pathParam(0), "void")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { voidHandler.handle(it) }
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
