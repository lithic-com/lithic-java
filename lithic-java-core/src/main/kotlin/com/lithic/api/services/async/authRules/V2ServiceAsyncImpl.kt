// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.emptyHandler
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
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DeleteParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPageAsync
import com.lithic.api.models.AuthRuleV2ListPageResponse
import com.lithic.api.models.AuthRuleV2ListParams
import com.lithic.api.models.AuthRuleV2PromoteParams
import com.lithic.api.models.AuthRuleV2RetrieveFeaturesParams
import com.lithic.api.models.AuthRuleV2RetrieveParams
import com.lithic.api.models.AuthRuleV2RetrieveReportParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.V2ApplyResponse
import com.lithic.api.models.V2CreateResponse
import com.lithic.api.models.V2DraftResponse
import com.lithic.api.models.V2PromoteResponse
import com.lithic.api.models.V2RetrieveFeaturesResponse
import com.lithic.api.models.V2RetrieveReportResponse
import com.lithic.api.models.V2RetrieveResponse
import com.lithic.api.models.V2UpdateResponse
import com.lithic.api.services.async.authRules.v2.BacktestServiceAsync
import com.lithic.api.services.async.authRules.v2.BacktestServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V2ServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    V2ServiceAsync {

    private val withRawResponse: V2ServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val backtests: BacktestServiceAsync by lazy { BacktestServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): V2ServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync =
        V2ServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

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

    @Deprecated("deprecated")
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

    override fun retrieveFeatures(
        params: AuthRuleV2RetrieveFeaturesParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2RetrieveFeaturesResponse> =
        // get /v2/auth_rules/{auth_rule_token}/features
        withRawResponse().retrieveFeatures(params, requestOptions).thenApply { it.parse() }

    override fun retrieveReport(
        params: AuthRuleV2RetrieveReportParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2RetrieveReportResponse> =
        // get /v2/auth_rules/{auth_rule_token}/report
        withRawResponse().retrieveReport(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2ServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val backtests: BacktestServiceAsync.WithRawResponse by lazy {
            BacktestServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2ServiceAsync.WithRawResponse =
            V2ServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun backtests(): BacktestServiceAsync.WithRawResponse = backtests

        private val createHandler: Handler<V2CreateResponse> =
            jsonHandler<V2CreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AuthRuleV2CreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2CreateResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules")
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

        private val retrieveHandler: Handler<V2RetrieveResponse> =
            jsonHandler<V2RetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AuthRuleV2RetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
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

        private val updateHandler: Handler<V2UpdateResponse> =
            jsonHandler<V2UpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2UpdateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val listHandler: Handler<AuthRuleV2ListPageResponse> =
            jsonHandler<AuthRuleV2ListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuthRuleV2ListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules")
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
                                AuthRuleV2ListPageAsync.builder()
                                    .service(V2ServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AuthRuleV2DeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }

        private val applyHandler: Handler<V2ApplyResponse> =
            jsonHandler<V2ApplyResponse>(clientOptions.jsonMapper)

        @Deprecated("deprecated")
        override fun apply(
            params: AuthRuleV2ApplyParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2ApplyResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "apply")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
            jsonHandler<V2DraftResponse>(clientOptions.jsonMapper)

        override fun draft(
            params: AuthRuleV2DraftParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "draft")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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
            jsonHandler<V2PromoteResponse>(clientOptions.jsonMapper)

        override fun promote(
            params: AuthRuleV2PromoteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "promote")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveFeaturesHandler: Handler<V2RetrieveFeaturesResponse> =
            jsonHandler<V2RetrieveFeaturesResponse>(clientOptions.jsonMapper)

        override fun retrieveFeatures(
            params: AuthRuleV2RetrieveFeaturesParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2RetrieveFeaturesResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "features")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveFeaturesHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveReportHandler: Handler<V2RetrieveReportResponse> =
            jsonHandler<V2RetrieveReportResponse>(clientOptions.jsonMapper)

        override fun retrieveReport(
            params: AuthRuleV2RetrieveReportParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2RetrieveReportResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "report")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveReportHandler.handle(it) }
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
