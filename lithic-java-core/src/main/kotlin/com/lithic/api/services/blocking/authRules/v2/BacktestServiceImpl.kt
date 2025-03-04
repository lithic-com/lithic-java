// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.authRules.v2

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
import com.lithic.api.models.AuthRuleV2BacktestCreateParams
import com.lithic.api.models.AuthRuleV2BacktestRetrieveParams
import com.lithic.api.models.BacktestCreateResponse
import com.lithic.api.models.BacktestResults

class BacktestServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BacktestService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BacktestCreateResponse> =
        jsonHandler<BacktestCreateResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Initiates a request to asynchronously generate a backtest for an authorization rule. During
     * backtesting, both the active version (if one exists) and the draft version of the
     * Authorization Rule are evaluated by replaying historical transaction data against the rule's
     * conditions. This process allows customers to simulate and understand the effects of proposed
     * rule changes before deployment. The generated backtest report provides detailed results
     * showing whether the draft version of the Auth Rule would have approved or declined historical
     * transactions which were processed during the backtest period. These reports help evaluate how
     * changes to rule configurations might affect overall transaction approval rates.
     *
     * The generated backtest report will be delivered asynchronously through a webhook with
     * `event_type` = `auth_rules.backtest_report.created`. See the docs on setting up
     * [webhook subscriptions](https://docs.lithic.com/docs/events-api). It is also possible to
     * request backtest reports on-demand through the
     * `/v2/auth_rules/{auth_rule_token}/backtests/{auth_rule_backtest_token}` endpoint.
     *
     * Lithic currently supports backtesting for `CONDITIONAL_BLOCK` rules. Backtesting for
     * `VELOCITY_LIMIT` rules is generally not supported. In specific cases (i.e. where Lithic has
     * pre-calculated the requested velocity metrics for historical transactions), a backtest may be
     * feasible. However, such cases are uncommon and customers should not anticipate support for
     * velocity backtests under most configurations. If a historical transaction does not feature
     * the required inputs to evaluate the rule, then it will not be included in the final backtest
     * report.
     */
    override fun create(
        params: AuthRuleV2BacktestCreateParams,
        requestOptions: RequestOptions,
    ): BacktestCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v2", "auth_rules", params.getPathParam(0), "backtests")
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

    private val retrieveHandler: Handler<BacktestResults> =
        jsonHandler<BacktestResults>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Returns the backtest results of an authorization rule (if available).
     *
     * Backtesting is an asynchronous process that requires time to complete. If a customer
     * retrieves the backtest results using this endpoint before the report is fully generated, the
     * response will return null for `results.current_version` and `results.draft_version`.
     * Customers are advised to wait for the backtest creation process to complete (as indicated by
     * the webhook event auth_rules.backtest_report.created) before retrieving results from this
     * endpoint.
     *
     * Backtesting is an asynchronous process, while the backtest is being processed, results will
     * not be available which will cause `results.current_version` and `results.draft_version`
     * objects to contain `null`. The entries in `results` will also always represent the
     * configuration of the rule at the time requests are made to this endpoint. For example, the
     * results for `current_version` in the served backtest report will be consistent with which
     * version of the rule is currently activated in the Auth Stream, regardless of which version of
     * the rule was active in the Auth Stream at the time a backtest is requested.
     */
    override fun retrieve(
        params: AuthRuleV2BacktestRetrieveParams,
        requestOptions: RequestOptions,
    ): BacktestResults {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v2",
                    "auth_rules",
                    params.getPathParam(0),
                    "backtests",
                    params.getPathParam(1),
                )
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
}
