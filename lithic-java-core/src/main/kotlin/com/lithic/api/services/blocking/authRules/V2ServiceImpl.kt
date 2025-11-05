// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.authRules

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
import com.lithic.api.core.prepare
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DeleteParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPage
import com.lithic.api.models.AuthRuleV2ListPageResponse
import com.lithic.api.models.AuthRuleV2ListParams
import com.lithic.api.models.AuthRuleV2PromoteParams
import com.lithic.api.models.AuthRuleV2RetrieveFeaturesParams
import com.lithic.api.models.AuthRuleV2RetrieveParams
import com.lithic.api.models.AuthRuleV2RetrieveReportParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.V2CreateResponse
import com.lithic.api.models.V2DraftResponse
import com.lithic.api.models.V2PromoteResponse
import com.lithic.api.models.V2RetrieveFeaturesResponse
import com.lithic.api.models.V2RetrieveReportResponse
import com.lithic.api.models.V2RetrieveResponse
import com.lithic.api.models.V2UpdateResponse
import com.lithic.api.services.blocking.authRules.v2.BacktestService
import com.lithic.api.services.blocking.authRules.v2.BacktestServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class V2ServiceImpl internal constructor(private val clientOptions: ClientOptions) : V2Service {

    private val withRawResponse: V2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val backtests: BacktestService by lazy { BacktestServiceImpl(clientOptions) }

    override fun withRawResponse(): V2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service =
        V2ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun backtests(): BacktestService = backtests

    override fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions,
    ): V2CreateResponse =
        // post /v2/auth_rules
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions,
    ): V2RetrieveResponse =
        // get /v2/auth_rules/{auth_rule_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions,
    ): V2UpdateResponse =
        // patch /v2/auth_rules/{auth_rule_token}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: AuthRuleV2ListParams,
        requestOptions: RequestOptions,
    ): AuthRuleV2ListPage =
        // get /v2/auth_rules
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(params: AuthRuleV2DeleteParams, requestOptions: RequestOptions) {
        // delete /v2/auth_rules/{auth_rule_token}
        withRawResponse().delete(params, requestOptions)
    }

    override fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions,
    ): V2DraftResponse =
        // post /v2/auth_rules/{auth_rule_token}/draft
        withRawResponse().draft(params, requestOptions).parse()

    override fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions,
    ): V2PromoteResponse =
        // post /v2/auth_rules/{auth_rule_token}/promote
        withRawResponse().promote(params, requestOptions).parse()

    override fun retrieveFeatures(
        params: AuthRuleV2RetrieveFeaturesParams,
        requestOptions: RequestOptions,
    ): V2RetrieveFeaturesResponse =
        // get /v2/auth_rules/{auth_rule_token}/features
        withRawResponse().retrieveFeatures(params, requestOptions).parse()

    override fun retrieveReport(
        params: AuthRuleV2RetrieveReportParams,
        requestOptions: RequestOptions,
    ): V2RetrieveReportResponse =
        // get /v2/auth_rules/{auth_rule_token}/report
        withRawResponse().retrieveReport(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        V2Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val backtests: BacktestService.WithRawResponse by lazy {
            BacktestServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): V2Service.WithRawResponse =
            V2ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun backtests(): BacktestService.WithRawResponse = backtests

        private val createHandler: Handler<V2CreateResponse> =
            jsonHandler<V2CreateResponse>(clientOptions.jsonMapper)

        override fun create(
            params: AuthRuleV2CreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2CreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<V2RetrieveResponse> =
            jsonHandler<V2RetrieveResponse>(clientOptions.jsonMapper)

        override fun retrieve(
            params: AuthRuleV2RetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<V2UpdateResponse> =
            jsonHandler<V2UpdateResponse>(clientOptions.jsonMapper)

        override fun update(
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2UpdateResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AuthRuleV2ListPageResponse> =
            jsonHandler<AuthRuleV2ListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AuthRuleV2ListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthRuleV2ListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AuthRuleV2ListPage.builder()
                            .service(V2ServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: AuthRuleV2DeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }

        private val draftHandler: Handler<V2DraftResponse> =
            jsonHandler<V2DraftResponse>(clientOptions.jsonMapper)

        override fun draft(
            params: AuthRuleV2DraftParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2DraftResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { draftHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val promoteHandler: Handler<V2PromoteResponse> =
            jsonHandler<V2PromoteResponse>(clientOptions.jsonMapper)

        override fun promote(
            params: AuthRuleV2PromoteParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2PromoteResponse> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { promoteHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveFeaturesHandler: Handler<V2RetrieveFeaturesResponse> =
            jsonHandler<V2RetrieveFeaturesResponse>(clientOptions.jsonMapper)

        override fun retrieveFeatures(
            params: AuthRuleV2RetrieveFeaturesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveFeaturesResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "features")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveFeaturesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveReportHandler: Handler<V2RetrieveReportResponse> =
            jsonHandler<V2RetrieveReportResponse>(clientOptions.jsonMapper)

        override fun retrieveReport(
            params: AuthRuleV2RetrieveReportParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveReportResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("authRuleToken", params.authRuleToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "auth_rules", params._pathParam(0), "report")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
