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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.DisputeV2
import com.lithic.api.models.DisputesV2ListPage
import com.lithic.api.models.DisputesV2ListPageResponse
import com.lithic.api.models.DisputesV2ListParams
import com.lithic.api.models.DisputesV2RetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class DisputesV2ServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DisputesV2Service {

    private val withRawResponse: DisputesV2Service.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DisputesV2Service.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): DisputesV2Service =
        DisputesV2ServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: DisputesV2RetrieveParams,
        requestOptions: RequestOptions,
    ): DisputeV2 =
        // get /v2/disputes/{dispute_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: DisputesV2ListParams,
        requestOptions: RequestOptions,
    ): DisputesV2ListPage =
        // get /v2/disputes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DisputesV2Service.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): DisputesV2Service.WithRawResponse =
            DisputesV2ServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<DisputeV2> =
            jsonHandler<DisputeV2>(clientOptions.jsonMapper)

        override fun retrieve(
            params: DisputesV2RetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputeV2> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("disputeToken", params.disputeToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "disputes", params._pathParam(0))
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

        private val listHandler: Handler<DisputesV2ListPageResponse> =
            jsonHandler<DisputesV2ListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: DisputesV2ListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DisputesV2ListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v2", "disputes")
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
                        DisputesV2ListPage.builder()
                            .service(DisputesV2ServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
