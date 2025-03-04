// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ManagementOperationCreateParams
import com.lithic.api.models.ManagementOperationListPage
import com.lithic.api.models.ManagementOperationListParams
import com.lithic.api.models.ManagementOperationRetrieveParams
import com.lithic.api.models.ManagementOperationReverseParams
import com.lithic.api.models.ManagementOperationTransaction

class ManagementOperationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : ManagementOperationService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ManagementOperationTransaction> =
        jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create management operation */
    override fun create(
        params: ManagementOperationCreateParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "management_operations")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<ManagementOperationTransaction> =
        jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get management operation */
    override fun retrieve(
        params: ManagementOperationRetrieveParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "management_operations", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ManagementOperationListPage.Response> =
        jsonHandler<ManagementOperationListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List management operations */
    override fun list(
        params: ManagementOperationListParams,
        requestOptions: RequestOptions,
    ): ManagementOperationListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "management_operations")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
            .let { ManagementOperationListPage.of(this, params, it) }
    }

    private val reverseHandler: Handler<ManagementOperationTransaction> =
        jsonHandler<ManagementOperationTransaction>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Reverse a management operation */
    override fun reverse(
        params: ManagementOperationReverseParams,
        requestOptions: RequestOptions,
    ): ManagementOperationTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "management_operations", params.getPathParam(0), "reverse")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { reverseHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }
}
