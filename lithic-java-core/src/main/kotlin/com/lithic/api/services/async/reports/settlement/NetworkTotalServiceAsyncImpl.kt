// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.reports.settlement

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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.NetworkTotalRetrieveResponse
import com.lithic.api.models.ReportSettlementNetworkTotalListPageAsync
import com.lithic.api.models.ReportSettlementNetworkTotalListParams
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams
import java.util.concurrent.CompletableFuture

class NetworkTotalServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    NetworkTotalServiceAsync {

    private val withRawResponse: NetworkTotalServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NetworkTotalServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<NetworkTotalRetrieveResponse> =
        // get /v1/reports/settlement/network_totals/{token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: ReportSettlementNetworkTotalListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ReportSettlementNetworkTotalListPageAsync> =
        // get /v1/reports/settlement/network_totals
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NetworkTotalServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<NetworkTotalRetrieveResponse> =
            jsonHandler<NetworkTotalRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<NetworkTotalRetrieveResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "reports",
                        "settlement",
                        "network_totals",
                        params._pathParam(0),
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

        private val listHandler: Handler<ReportSettlementNetworkTotalListPageAsync.Response> =
            jsonHandler<ReportSettlementNetworkTotalListPageAsync.Response>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override fun list(
            params: ReportSettlementNetworkTotalListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ReportSettlementNetworkTotalListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "reports", "settlement", "network_totals")
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
                                ReportSettlementNetworkTotalListPageAsync.of(
                                    NetworkTotalServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
