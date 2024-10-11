// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AuthRule
import com.lithic.api.models.AuthRuleApplyParams
import com.lithic.api.models.AuthRuleCreateParams
import com.lithic.api.models.AuthRuleListPageAsync
import com.lithic.api.models.AuthRuleListParams
import com.lithic.api.models.AuthRuleMigrateV1ToV2Params
import com.lithic.api.models.AuthRuleRemoveParams
import com.lithic.api.models.AuthRuleRemoveResponse
import com.lithic.api.models.AuthRuleRetrieveParams
import com.lithic.api.models.AuthRuleRetrieveResponse
import com.lithic.api.models.AuthRuleUpdateParams
import com.lithic.api.services.async.authRules.V2ServiceAsync
import com.lithic.api.services.async.authRules.V2ServiceAsyncImpl
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

    private val v2: V2ServiceAsync by lazy { V2ServiceAsyncImpl(clientOptions) }

    override fun v2(): V2ServiceAsync = v2

    private val createHandler: Handler<AuthRule> =
        jsonHandler<AuthRule>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Creates an authorization rule (Auth Rule) and applies it at the program, account, or card
     * level.
     */
    override fun create(
        params: AuthRuleCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRule> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "auth_rules")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { createHandler.handle(it) }
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
                .addPathSegments("v1", "auth_rules", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<AuthRule> =
        jsonHandler<AuthRule>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the properties associated with an existing authorization rule (Auth Rule). */
    override fun update(
        params: AuthRuleUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRule> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PUT)
                .addPathSegments("v1", "auth_rules", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
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
                .addPathSegments("v1", "auth_rules")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AuthRuleListPageAsync.of(this, params, it) }
        }
    }

    private val applyHandler: Handler<AuthRule> =
        jsonHandler<AuthRule>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Applies an existing authorization rule (Auth Rule) to an program, account, or card level. */
    override fun apply(
        params: AuthRuleApplyParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRule> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "auth_rules", params.getPathParam(0), "apply")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { applyHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val migrateV1ToV2Handler: Handler<List<AuthRule>> =
        jsonHandler<List<AuthRule>>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Migrates an existing V1 authorization rule to a V2 authorization rule. Depending on the
     * configuration of the V1 Auth Rule, this will yield one or two V2 authorization rules. This
     * endpoint will alter the internal structure of the Auth Rule such that the resulting rules
     * become a V2 Authorization Rule that can be operated on through the /v2/auth_rules endpoints.
     *
     * After a V1 Auth Rule has been migrated, it can no longer be operated on through the
     * /v1/auth_rules/\* endpoints. Eventually, Lithic will deprecate the /v1/auth_rules endpoints
     * and migrate all existing V1 Auth Rules to V2 Auth Rules.
     */
    override fun migrateV1ToV2(
        params: AuthRuleMigrateV1ToV2Params,
        requestOptions: RequestOptions
    ): CompletableFuture<List<AuthRule>> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "auth_rules", params.getPathParam(0), "migrate")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { migrateV1ToV2Handler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        forEach { it.validate() }
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
                .addPathSegments("v1", "auth_rules", "remove")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { removeHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
