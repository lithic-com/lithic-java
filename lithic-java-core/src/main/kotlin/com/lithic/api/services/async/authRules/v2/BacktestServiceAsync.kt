// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules.v2

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthRuleV2BacktestCreateParams
import com.lithic.api.models.AuthRuleV2BacktestRetrieveParams
import com.lithic.api.models.BacktestCreateResponse
import com.lithic.api.models.BacktestResults
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BacktestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BacktestServiceAsync

    /**
     * Initiates a request to asynchronously generate a backtest for an Auth rule. During
     * backtesting, both the active version (if one exists) and the draft version of the Auth Rule
     * are evaluated by replaying historical transaction data against the rule's conditions. This
     * process allows customers to simulate and understand the effects of proposed rule changes
     * before deployment. The generated backtest report provides detailed results showing whether
     * the draft version of the Auth Rule would have approved or declined historical transactions
     * which were processed during the backtest period. These reports help evaluate how changes to
     * rule configurations might affect overall transaction approval rates.
     *
     * The generated backtest report will be delivered asynchronously through a webhook with
     * `event_type` = `auth_rules.backtest_report.created`. See the docs on setting up
     * [webhook subscriptions](https://docs.lithic.com/docs/events-api). It is also possible to
     * request backtest reports on-demand through the
     * `/v2/auth_rules/{auth_rule_token}/backtests/{auth_rule_backtest_token}` endpoint.
     *
     * Lithic currently supports backtesting for `CONDITIONAL_BLOCK` / `CONDITIONAL_3DS_ACTION`
     * rules. Backtesting for `VELOCITY_LIMIT` rules is generally not supported. In specific cases
     * (i.e. where Lithic has pre-calculated the requested velocity metrics for historical
     * transactions), a backtest may be feasible. However, such cases are uncommon and customers
     * should not anticipate support for velocity backtests under most configurations. If a
     * historical transaction does not feature the required inputs to evaluate the rule, then it
     * will not be included in the final backtest report.
     */
    fun create(authRuleToken: String): CompletableFuture<BacktestCreateResponse> =
        create(authRuleToken, AuthRuleV2BacktestCreateParams.none())

    /** @see create */
    fun create(
        authRuleToken: String,
        params: AuthRuleV2BacktestCreateParams = AuthRuleV2BacktestCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BacktestCreateResponse> =
        create(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see create */
    fun create(
        authRuleToken: String,
        params: AuthRuleV2BacktestCreateParams = AuthRuleV2BacktestCreateParams.none(),
    ): CompletableFuture<BacktestCreateResponse> =
        create(authRuleToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthRuleV2BacktestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BacktestCreateResponse>

    /** @see create */
    fun create(params: AuthRuleV2BacktestCreateParams): CompletableFuture<BacktestCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        authRuleToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<BacktestCreateResponse> =
        create(authRuleToken, AuthRuleV2BacktestCreateParams.none(), requestOptions)

    /**
     * Returns the backtest results of an Auth rule (if available).
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
     * version of the rule is currently activated in the respective event stream, regardless of
     * which version of the rule was active in the event stream at the time a backtest is requested.
     */
    fun retrieve(
        authRuleBacktestToken: String,
        params: AuthRuleV2BacktestRetrieveParams,
    ): CompletableFuture<BacktestResults> =
        retrieve(authRuleBacktestToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        authRuleBacktestToken: String,
        params: AuthRuleV2BacktestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BacktestResults> =
        retrieve(
            params.toBuilder().authRuleBacktestToken(authRuleBacktestToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(params: AuthRuleV2BacktestRetrieveParams): CompletableFuture<BacktestResults> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AuthRuleV2BacktestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BacktestResults>

    /**
     * A view of [BacktestServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BacktestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/backtests`, but is
         * otherwise the same as [BacktestServiceAsync.create].
         */
        fun create(
            authRuleToken: String
        ): CompletableFuture<HttpResponseFor<BacktestCreateResponse>> =
            create(authRuleToken, AuthRuleV2BacktestCreateParams.none())

        /** @see create */
        fun create(
            authRuleToken: String,
            params: AuthRuleV2BacktestCreateParams = AuthRuleV2BacktestCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BacktestCreateResponse>> =
            create(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see create */
        fun create(
            authRuleToken: String,
            params: AuthRuleV2BacktestCreateParams = AuthRuleV2BacktestCreateParams.none(),
        ): CompletableFuture<HttpResponseFor<BacktestCreateResponse>> =
            create(authRuleToken, params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AuthRuleV2BacktestCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BacktestCreateResponse>>

        /** @see create */
        fun create(
            params: AuthRuleV2BacktestCreateParams
        ): CompletableFuture<HttpResponseFor<BacktestCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<BacktestCreateResponse>> =
            create(authRuleToken, AuthRuleV2BacktestCreateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v2/auth_rules/{auth_rule_token}/backtests/{auth_rule_backtest_token}`, but is otherwise
         * the same as [BacktestServiceAsync.retrieve].
         */
        fun retrieve(
            authRuleBacktestToken: String,
            params: AuthRuleV2BacktestRetrieveParams,
        ): CompletableFuture<HttpResponseFor<BacktestResults>> =
            retrieve(authRuleBacktestToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            authRuleBacktestToken: String,
            params: AuthRuleV2BacktestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BacktestResults>> =
            retrieve(
                params.toBuilder().authRuleBacktestToken(authRuleBacktestToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            params: AuthRuleV2BacktestRetrieveParams
        ): CompletableFuture<HttpResponseFor<BacktestResults>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AuthRuleV2BacktestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BacktestResults>>
    }
}
