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
import com.lithic.api.models.NetworkProgram
import com.lithic.api.models.NetworkProgramListPage
import com.lithic.api.models.NetworkProgramListPageResponse
import com.lithic.api.models.NetworkProgramListParams
import com.lithic.api.models.NetworkProgramRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class NetworkProgramServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    NetworkProgramService {

    private val withRawResponse: NetworkProgramService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): NetworkProgramService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): NetworkProgramService =
        NetworkProgramServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: NetworkProgramRetrieveParams,
        requestOptions: RequestOptions,
    ): NetworkProgram =
        // get /v1/network_programs/{network_program_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: NetworkProgramListParams,
        requestOptions: RequestOptions,
    ): NetworkProgramListPage =
        // get /v1/network_programs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        NetworkProgramService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): NetworkProgramService.WithRawResponse =
            NetworkProgramServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<NetworkProgram> =
            jsonHandler<NetworkProgram>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: NetworkProgramRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkProgram> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("networkProgramToken", params.networkProgramToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "network_programs", params._pathParam(0))
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

        private val listHandler: Handler<NetworkProgramListPageResponse> =
            jsonHandler<NetworkProgramListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: NetworkProgramListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<NetworkProgramListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "network_programs")
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
                        NetworkProgramListPage.builder()
                            .service(NetworkProgramServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
