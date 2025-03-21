// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.authRules.v2

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
import com.lithic.api.core.prepare
import com.lithic.api.models.AuthRuleV2BacktestCreateParams
import com.lithic.api.models.AuthRuleV2BacktestRetrieveParams
import com.lithic.api.models.BacktestCreateResponse
import com.lithic.api.models.BacktestResults

class BacktestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BacktestService {

    private val withRawResponse: BacktestService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BacktestService.WithRawResponse = withRawResponse

    override fun create(
        params: AuthRuleV2BacktestCreateParams,
        requestOptions: RequestOptions,
    ): BacktestCreateResponse =
        // post /v2/auth_rules/{auth_rule_token}/backtests
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AuthRuleV2BacktestRetrieveParams,
        requestOptions: RequestOptions,
    ): BacktestResults =
        // get /v2/auth_rules/{auth_rule_token}/backtests/{auth_rule_backtest_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BacktestService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<BacktestCreateResponse> =
            jsonHandler<BacktestCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: AuthRuleV2BacktestCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BacktestCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "backtests")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<BacktestResults> =
            jsonHandler<BacktestResults>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: AuthRuleV2BacktestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BacktestResults> {
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
    }
}
