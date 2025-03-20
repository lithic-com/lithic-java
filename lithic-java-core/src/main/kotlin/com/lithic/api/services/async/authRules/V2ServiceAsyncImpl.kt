// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules

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
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DeleteParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPageAsync
import com.lithic.api.models.AuthRuleV2ListParams
import com.lithic.api.models.AuthRuleV2PromoteParams
import com.lithic.api.models.AuthRuleV2ReportParams
import com.lithic.api.models.AuthRuleV2RetrieveParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.V2ApplyResponse
import com.lithic.api.models.V2CreateResponse
import com.lithic.api.models.V2DraftResponse
import com.lithic.api.models.V2PromoteResponse
import com.lithic.api.models.V2ReportResponse
import com.lithic.api.models.V2RetrieveResponse
import com.lithic.api.models.V2UpdateResponse
import com.lithic.api.services.async.authRules.v2.BacktestServiceAsync
import com.lithic.api.services.async.authRules.v2.BacktestServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val backtests: BacktestServiceAsync by lazy { BacktestServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun backtests(): BacktestServiceAsync = backtests

    override fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2CreateResponse> =
        // post /v2/auth_rules
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2RetrieveResponse> =
        // get /v2/auth_rules/{auth_rule_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2UpdateResponse> =
        // patch /v2/auth_rules/{auth_rule_token}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: AuthRuleV2ListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AuthRuleV2ListPageAsync> =
        // get /v2/auth_rules
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: AuthRuleV2DeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v2/auth_rules/{auth_rule_token}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    override fun apply(
        params: AuthRuleV2ApplyParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2ApplyResponse> =
        // post /v2/auth_rules/{auth_rule_token}/apply
        withRawResponse().apply(params, requestOptions).thenApply { it.parse() }

    override fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2DraftResponse> =
        // post /v2/auth_rules/{auth_rule_token}/draft
        withRawResponse().draft(params, requestOptions).thenApply { it.parse() }

    override fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2PromoteResponse> =
        // post /v2/auth_rules/{auth_rule_token}/promote
        withRawResponse().promote(params, requestOptions).thenApply { it.parse() }

    override fun report(
        params: AuthRuleV2ReportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2ReportResponse> =
        // post /v2/auth_rules/{auth_rule_token}/report
        withRawResponse().report(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val backtests: BacktestServiceAsync.WithRawResponse by lazy {
            BacktestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun backtests(): BacktestServiceAsync.WithRawResponse = backtests

        private val createHandler: Handler<V2CreateResponse> =
            jsonHandler<V2CreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: AuthRuleV2CreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2CreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "auth_rules")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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

        private val retrieveHandler: Handler<V2RetrieveResponse> =
            jsonHandler<V2RetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AuthRuleV2RetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
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

        private val updateHandler: Handler<V2UpdateResponse> =
            jsonHandler<V2UpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2UpdateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<AuthRuleV2ListPageAsync.Response> =
            jsonHandler<AuthRuleV2ListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: AuthRuleV2ListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v2", "auth_rules")
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
                                AuthRuleV2ListPageAsync.of(
                                    V2ServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

        override fun delete(
            params: AuthRuleV2DeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { deleteHandler.handle(it) } }
                }
        }

        private val applyHandler: Handler<V2ApplyResponse> =
            jsonHandler<V2ApplyResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun apply(
            params: AuthRuleV2ApplyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2ApplyResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "apply")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { applyHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val draftHandler: Handler<V2DraftResponse> =
            jsonHandler<V2DraftResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun draft(
            params: AuthRuleV2DraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "draft")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { draftHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val promoteHandler: Handler<V2PromoteResponse> =
            jsonHandler<V2PromoteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun promote(
            params: AuthRuleV2PromoteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "promote")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { promoteHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reportHandler: Handler<V2ReportResponse> =
            jsonHandler<V2ReportResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun report(
            params: AuthRuleV2ReportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2ReportResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "report")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { reportHandler.handle(it) }
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
