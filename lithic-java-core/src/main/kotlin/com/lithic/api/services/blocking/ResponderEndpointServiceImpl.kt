// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ResponderEndpointCheckStatusParams
import com.lithic.api.models.ResponderEndpointCreateParams
import com.lithic.api.models.ResponderEndpointCreateResponse
import com.lithic.api.models.ResponderEndpointDeleteParams
import com.lithic.api.models.ResponderEndpointStatus

class ResponderEndpointServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : ResponderEndpointService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ResponderEndpointCreateResponse> =
        jsonHandler<ResponderEndpointCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Enroll a responder endpoint */
    override fun create(
        params: ResponderEndpointCreateParams,
        requestOptions: RequestOptions
    ): ResponderEndpointCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "responder_endpoints")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val deleteHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Disenroll a responder endpoint */
    override fun delete(params: ResponderEndpointDeleteParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("v1", "responder_endpoints")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { deleteHandler.handle(it) }
        }
    }

    private val checkStatusHandler: Handler<ResponderEndpointStatus> =
        jsonHandler<ResponderEndpointStatus>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Check the status of a responder endpoint */
    override fun checkStatus(
        params: ResponderEndpointCheckStatusParams,
        requestOptions: RequestOptions
    ): ResponderEndpointStatus {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "responder_endpoints")
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { checkStatusHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
