// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules.v2

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
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
import com.lithic.api.models.AuthRuleV2BacktestCreateParams
import com.lithic.api.models.AuthRuleV2BacktestRetrieveParams
import com.lithic.api.models.BacktestCreateResponse
import com.lithic.api.models.BacktestResults
import java.util.concurrent.CompletableFuture
import kotlin.jvm.optionals.getOrNull

class BacktestServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BacktestServiceAsync {

    private val withRawResponse: BacktestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BacktestServiceAsync.WithRawResponse = withRawResponse

    override fun create(
        params: AuthRuleV2BacktestCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BacktestCreateResponse> =
        // post /v2/auth_rules/{auth_rule_token}/backtests
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: AuthRuleV2BacktestRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<BacktestResults> =
        // get /v2/auth_rules/{auth_rule_token}/backtests/{auth_rule_backtest_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BacktestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BacktestCreateResponse> =
            jsonHandler<BacktestCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AuthRuleV2BacktestCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BacktestCreateResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "backtests")
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

        private val retrieveHandler: Handler<BacktestResults> =
            jsonHandler<BacktestResults>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AuthRuleV2BacktestRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BacktestResults>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleBacktestToken", params.authRuleBacktestToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v2",
                        "auth_rules",
                        params._pathParam(0),
                        "backtests",
                        params._pathParam(1),
                    )
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
    }
}
