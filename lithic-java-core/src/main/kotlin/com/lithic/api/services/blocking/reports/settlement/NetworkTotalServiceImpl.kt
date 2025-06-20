// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.reports.settlement

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
import com.lithic.api.models.NetworkTotalRetrieveResponse
import com.lithic.api.models.ReportSettlementNetworkTotalListPage
import com.lithic.api.models.ReportSettlementNetworkTotalListPageResponse
import com.lithic.api.models.ReportSettlementNetworkTotalListParams
import com.lithic.api.models.ReportSettlementNetworkTotalRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NetworkTotalServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NetworkTotalService {

    private val withRawResponse: NetworkTotalService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NetworkTotalService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkTotalService =
        NetworkTotalServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: ReportSettlementNetworkTotalRetrieveParams,
        requestOptions: RequestOptions,
    ): NetworkTotalRetrieveResponse =
        // get /v1/reports/settlement/network_totals/{token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ReportSettlementNetworkTotalListParams,
        requestOptions: RequestOptions,
    ): ReportSettlementNetworkTotalListPage =
        // get /v1/reports/settlement/network_totals
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NetworkTotalService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkTotalService.WithRawResponse =
            NetworkTotalServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<NetworkTotalRetrieveResponse> =
            jsonHandler<NetworkTotalRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: ReportSettlementNetworkTotalRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkTotalRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("token", params.token().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "reports",
                        "settlement",
                        "network_totals",
                        params._pathParam(0),
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

        private val listHandler: Handler<ReportSettlementNetworkTotalListPageResponse> =
            jsonHandler<ReportSettlementNetworkTotalListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: ReportSettlementNetworkTotalListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ReportSettlementNetworkTotalListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "reports", "settlement", "network_totals")
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
                        ReportSettlementNetworkTotalListPage.builder()
                            .service(NetworkTotalServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
