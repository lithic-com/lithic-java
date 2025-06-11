// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.FundingEventListPage
import com.lithic.api.models.FundingEventListPageResponse
import com.lithic.api.models.FundingEventListParams
import com.lithic.api.models.FundingEventRetrieveDetailsParams
import com.lithic.api.models.FundingEventRetrieveDetailsResponse
import com.lithic.api.models.FundingEventRetrieveParams
import com.lithic.api.models.FundingEventRetrieveResponse
import kotlin.jvm.optionals.getOrNull

class FundingEventServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    FundingEventService {

    private val withRawResponse: FundingEventService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FundingEventService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: FundingEventRetrieveParams,
        requestOptions: RequestOptions,
    ): FundingEventRetrieveResponse =
        // get /v1/funding_events/{funding_event_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: FundingEventListParams,
        requestOptions: RequestOptions,
    ): FundingEventListPage =
        // get /v1/funding_events
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveDetails(
        params: FundingEventRetrieveDetailsParams,
        requestOptions: RequestOptions,
    ): FundingEventRetrieveDetailsResponse =
        // get /v1/funding_events/{funding_event_token}/details
        withRawResponse().retrieveDetails(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FundingEventService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<FundingEventRetrieveResponse> =
            jsonHandler<FundingEventRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: FundingEventRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fundingEventToken", params.fundingEventToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "funding_events", params._pathParam(0))
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

        private val listHandler: Handler<FundingEventListPageResponse> =
            jsonHandler<FundingEventListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FundingEventListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "funding_events")
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
                        FundingEventListPage.builder()
                            .service(FundingEventServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveDetailsHandler: Handler<FundingEventRetrieveDetailsResponse> =
            jsonHandler<FundingEventRetrieveDetailsResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieveDetails(
            params: FundingEventRetrieveDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FundingEventRetrieveDetailsResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fundingEventToken", params.fundingEventToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "funding_events", params._pathParam(0), "details")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveDetailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
