package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AuthRuleApplyParams
import com.lithic.api.models.AuthRuleApplyResponse
import com.lithic.api.models.AuthRuleCreateParams
import com.lithic.api.models.AuthRuleCreateResponse
import com.lithic.api.models.AuthRuleListPageAsync
import com.lithic.api.models.AuthRuleListParams
import com.lithic.api.models.AuthRuleRemoveParams
import com.lithic.api.models.AuthRuleRemoveResponse
import com.lithic.api.models.AuthRuleRetrieveParams
import com.lithic.api.models.AuthRuleRetrieveResponse
import com.lithic.api.models.AuthRuleUpdateParams
import com.lithic.api.models.AuthRuleUpdateResponse
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class AuthRuleServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : AuthRuleServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<AuthRuleCreateResponse> =
        jsonHandler<AuthRuleCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Creates an authorization rule (Auth Rule) and applies it at the program, account, or card
     * level.
     */
    override fun create(
        params: AuthRuleCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRuleCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("auth_rules")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<AuthRuleRetrieveResponse> =
        jsonHandler<AuthRuleRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Detail the properties and entities (program, accounts, and cards) associated with an existing
     * authorization rule (Auth Rule).
     */
    override fun retrieve(
        params: AuthRuleRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRuleRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("auth_rules", params.getPathParam(0))
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<AuthRuleUpdateResponse> =
        jsonHandler<AuthRuleUpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the properties associated with an existing authorization rule (Auth Rule). */
    override fun update(
        params: AuthRuleUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRuleUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("auth_rules", params.getPathParam(0))
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<AuthRuleListPageAsync.Response> =
        jsonHandler<AuthRuleListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Return all of the Auth Rules under the program. */
    override fun list(
        params: AuthRuleListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRuleListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("auth_rules")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AuthRuleListPageAsync.of(this, params, it) }
        }
    }

    private val applyHandler: Handler<AuthRuleApplyResponse> =
        jsonHandler<AuthRuleApplyResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Applies an existing authorization rule (Auth Rule) to an program, account, or card level. */
    override fun apply(
        params: AuthRuleApplyParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRuleApplyResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("auth_rules", params.getPathParam(0), "apply")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { applyHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val removeHandler: Handler<AuthRuleRemoveResponse> =
        jsonHandler<AuthRuleRemoveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Remove an existing authorization rule (Auth Rule) from an program, account, or card-level.
     */
    override fun remove(
        params: AuthRuleRemoveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRuleRemoveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("auth_rules", "remove")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { removeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
