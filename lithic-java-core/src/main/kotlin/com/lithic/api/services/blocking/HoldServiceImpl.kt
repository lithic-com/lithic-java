// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

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
import com.lithic.api.core.prepare
import com.lithic.api.models.Hold
import com.lithic.api.models.HoldCreateParams
import com.lithic.api.models.HoldListPage
import com.lithic.api.models.HoldListPageResponse
import com.lithic.api.models.HoldListParams
import com.lithic.api.models.HoldRetrieveParams
import com.lithic.api.models.HoldVoidParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class HoldServiceImpl internal constructor(private val clientOptions: ClientOptions) : HoldService {

    private val withRawResponse: HoldService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): HoldService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldService =
        HoldServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(params: HoldCreateParams, requestOptions: RequestOptions): Hold =
        // post /v1/financial_accounts/{financial_account_token}/holds
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: HoldRetrieveParams, requestOptions: RequestOptions): Hold =
        // get /v1/holds/{hold_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: HoldListParams, requestOptions: RequestOptions): HoldListPage =
        // get /v1/financial_accounts/{financial_account_token}/holds
        withRawResponse().list(params, requestOptions).parse()

    override fun void_(params: HoldVoidParams, requestOptions: RequestOptions): Hold =
        // post /v1/holds/{hold_token}/void
        withRawResponse().void_(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        HoldService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): HoldService.WithRawResponse =
            HoldServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Hold> = jsonHandler<Hold>(clientOptions.jsonMapper)

        override fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Hold> {
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

        private val retrieveHandler: Handler<Hold> = jsonHandler<Hold>(clientOptions.jsonMapper)

        override fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Hold> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("holdToken", params.holdToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "holds", params._pathParam(0))
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

        private val listHandler: Handler<HoldListPageResponse> =
            jsonHandler<HoldListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: HoldListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<HoldListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "holds")
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
                        HoldListPage.builder()
                            .service(HoldServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val voidHandler: Handler<Hold> = jsonHandler<Hold>(clientOptions.jsonMapper)

        override fun void_(
            params: HoldVoidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Hold> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
