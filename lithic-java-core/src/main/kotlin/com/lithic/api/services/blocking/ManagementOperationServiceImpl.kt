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
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPage
import com.lithic.api.models.ManagementOperationListPageResponse
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ManagementOperationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ManagementOperationService {

    private val withRawResponse: ManagementOperationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ManagementOperationService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): ManagementOperationService =
        ManagementOperationServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction =
        // post /v1/management_operations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction =
        // get /v1/management_operations/{management_operation_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: ManagementOperationListParams,
        requestOptions: RequestOptions,
    ): ManagementOperationListPage =
        // get /v1/management_operations
        withRawResponse().list(params, requestOptions).parse()

    override fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction =
        // post /v1/management_operations/{management_operation_token}/reverse
        withRawResponse().reverse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ManagementOperationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ManagementOperationService.WithRawResponse =
            ManagementOperationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<ManagementOperationTransaction> =
            jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)

        override fun create(
            params: ManagementOperationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "management_operations")
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

        private val retrieveHandler: Handler<ManagementOperationTransaction> =
            jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ManagementOperationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("managementOperationToken", params.managementOperationToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "management_operations", params._pathParam(0))
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

        private val listHandler: Handler<ManagementOperationListPageResponse> =
            jsonHandler<ManagementOperationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ManagementOperationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "management_operations")
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
                        ManagementOperationListPage.builder()
                            .service(ManagementOperationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val reverseHandler: Handler<ManagementOperationTransaction> =
            jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)

        override fun reverse(
            params: ManagementOperationReverseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ManagementOperationTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("managementOperationToken", params.managementOperationToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "management_operations", params._pathParam(0), "reverse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { reverseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
