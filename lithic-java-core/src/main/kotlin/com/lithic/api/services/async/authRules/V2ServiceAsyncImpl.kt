// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPageAsync
import com.lithic.api.models.AuthRuleV2ListParams
import com.lithic.api.models.AuthRuleV2PromoteParams
import com.lithic.api.models.AuthRuleV2ReportParams
import com.lithic.api.models.AuthRuleV2RetrieveParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.V2ApplyResponse
import com.lithic.api.models.V2CreateResponse
import com.lithic.api.models.V2DraftResponse
import com.lithic.api.models.V2PromoteResponse
import com.lithic.api.models.V2ReportResponse
import com.lithic.api.models.V2RetrieveResponse
import com.lithic.api.models.V2UpdateResponse
import java.util.concurrent.CompletableFuture

class V2ServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : V2ServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<V2CreateResponse> =
        jsonHandler<V2CreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Creates a new V2 authorization rule in draft mode */
    override fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<V2CreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "auth_rules")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val retrieveHandler: Handler<V2RetrieveResponse> =
        jsonHandler<V2RetrieveResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Fetches an authorization rule by its token */
    override fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<V2RetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v2", "auth_rules", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val updateHandler: Handler<V2UpdateResponse> =
        jsonHandler<V2UpdateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Updates an authorization rule's properties */
    override fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<V2UpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v2", "auth_rules", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val listHandler: Handler<AuthRuleV2ListPageAsync.Response> =
        jsonHandler<AuthRuleV2ListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Lists V2 authorization rules */
    override fun list(
        params: AuthRuleV2ListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthRuleV2ListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v2", "auth_rules")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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
                .let { AuthRuleV2ListPageAsync.of(this, params, it) }
        }
    }

    private val applyHandler: Handler<V2ApplyResponse> =
        jsonHandler<V2ApplyResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Associates an authorization rules with a card program, the provided account(s) or card(s).
     *
     * This endpoint will replace any existing associations with the provided list of entities.
     */
    override fun apply(
        params: AuthRuleV2ApplyParams,
        requestOptions: RequestOptions
    ): CompletableFuture<V2ApplyResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "auth_rules", params.getPathParam(0), "apply")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
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

    private val draftHandler: Handler<V2DraftResponse> =
        jsonHandler<V2DraftResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Creates a new draft version of an authorization rules that will be ran in shadow mode.
     *
     * This can also be utilized to reset the draft parameters, causing a draft version to no longer
     * be ran in shadow mode.
     */
    override fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions
    ): CompletableFuture<V2DraftResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "auth_rules", params.getPathParam(0), "draft")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { draftHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val promoteHandler: Handler<V2PromoteResponse> =
        jsonHandler<V2PromoteResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Promotes a draft version of an authorization rule to the currently active version such that
     * it is enforced in the authorization stream.
     */
    override fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions
    ): CompletableFuture<V2PromoteResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "auth_rules", params.getPathParam(0), "promote")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { promoteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val reportHandler: Handler<V2ReportResponse> =
        jsonHandler<V2ReportResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Requests a performance report of an authorization rule to be asynchronously generated.
     * Reports can only be run on rules in draft or active mode and will included approved and
     * declined statistics as well as examples. The generated report will be delivered
     * asynchronously through a webhook with `event_type` = `auth_rules.performance_report.created`.
     * See the docs on setting up [webhook subscriptions](https://docs.lithic.com/docs/events-api).
     *
     * Reports are generated based on data collected by Lithic's authorization processing system in
     * the trailing week. The performance of the auth rule will be assessed on the configuration of
     * the auth rule at the time the report is requested. This implies that if a performance report
     * is requested, right after updating an auth rule, depending on the number of authorizations
     * processed for a card program, it may be the case that no data is available for the report.
     * Therefore Lithic recommends to decouple making updates to an Auth Rule, and requesting
     * performance reports.
     *
     * To make this concrete, consider the following example:
     * 1. At time `t`, a new Auth Rule is created, and applies to all authorizations on a card
     *    program. The Auth Rule has not yet been promoted, causing the draft version of the rule to
     *    be applied in shadow mode.
     * 2. At time `t + 1 hour` a performance report is requested for the Auth Rule. This performance
     *    report will _only_ contain data for the Auth Rule being executed in the window between `t`
     *    and `t + 1 hour`. This is because Lithic's transaction processing system will only start
     *    capturing data for the Auth Rule at the time it is created.
     * 3. At time `t + 2 hours` the draft version of the Auth Rule is promoted to the active version
     *    of the Auth Rule by calling the `/v2/auth_rules/{auth_rule_token}/promote` endpoint. If a
     *    performance report is requested at this moment it will still only contain data for this
     *    version of the rule, but the window of available data will now span from `t` to `t + 2
     *    hours`.
     * 4. At time `t + 3 hours` a new version of the rule is drafted by calling the
     *    `/v2/auth_rules/{auth_rule_token}/draft` endpoint. If a performance report is requested
     *    right at this moment, it will only contain data for authorizations to which both the
     *    active version and the draft version is applied. Lithic does this to ensure that
     *    performance reports represent a fair comparison between rules. Because there may be no
     *    authorizations in this window, and because there may be some lag before data is available
     *    in a performance report, the requested performance report could contain no to little data.
     * 5. At time `t + 4 hours` another performance report is requested: this time the performance
     *    report will contain data from the window between `t + 3 hours` and `t + 4 hours`, for any
     *    authorizations to which both the current version of the authorization rule (in enforcing
     *    mode) and the draft version of the authorization rule (in shadow mode) applied.
     *
     * Note that generating a report may take up to 15 minutes and that delivery is not guaranteed.
     * Customers are required to have created an event subscription to receive the webhook.
     * Additionally, there is a delay of approximately 15 minutes between when Lithic's transaction
     * processing systems have processed the transaction, and when a transaction will be included in
     * the report.
     */
    override fun report(
        params: AuthRuleV2ReportParams,
        requestOptions: RequestOptions
    ): CompletableFuture<V2ReportResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "auth_rules", params.getPathParam(0), "report")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { reportHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
