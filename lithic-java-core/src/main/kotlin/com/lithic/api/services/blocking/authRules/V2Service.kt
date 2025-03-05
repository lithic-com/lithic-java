// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.authRules

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DeleteParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPage
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
import com.lithic.api.services.blocking.authRules.v2.BacktestService

interface V2Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun backtests(): BacktestService

    /** Creates a new V2 authorization rule in draft mode */
    @JvmOverloads
    fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2CreateResponse

    /** Fetches a V2 authorization rule by its token */
    @JvmOverloads
    fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2RetrieveResponse

    /**
     * Updates a V2 authorization rule's properties
     *
     * If `account_tokens`, `card_tokens`, `program_level`, or `excluded_card_tokens` is provided,
     * this will replace existing associations with the provided list of entities.
     */
    @JvmOverloads
    fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2UpdateResponse

    /** Lists V2 authorization rules */
    @JvmOverloads
    fun list(
        params: AuthRuleV2ListParams = AuthRuleV2ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRuleV2ListPage

    /** Lists V2 authorization rules */
    fun list(requestOptions: RequestOptions): AuthRuleV2ListPage =
        list(AuthRuleV2ListParams.none(), requestOptions)

    /** Deletes a V2 authorization rule */
    @JvmOverloads
    fun delete(
        params: AuthRuleV2DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /**
     * Associates a V2 authorization rule with a card program, the provided account(s) or card(s).
     *
     * Prefer using the `PATCH` method for this operation.
     */
    @JvmOverloads
    fun apply(
        params: AuthRuleV2ApplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ApplyResponse

    /**
     * Creates a new draft version of a rule that will be ran in shadow mode.
     *
     * This can also be utilized to reset the draft parameters, causing a draft version to no longer
     * be ran in shadow mode.
     */
    @JvmOverloads
    fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2DraftResponse

    /**
     * Promotes the draft version of an authorization rule to the currently active version such that
     * it is enforced in the authorization stream.
     */
    @JvmOverloads
    fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2PromoteResponse

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
    @JvmOverloads
    fun report(
        params: AuthRuleV2ReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2ReportResponse

    /** A view of [V2Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun backtests(): BacktestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules`, but is otherwise the same as
         * [V2Service.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: AuthRuleV2CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2CreateResponse>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules/{auth_rule_token}`, but is otherwise
         * the same as [V2Service.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: AuthRuleV2RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2RetrieveResponse>

        /**
         * Returns a raw HTTP response for `patch /v2/auth_rules/{auth_rule_token}`, but is
         * otherwise the same as [V2Service.update].
         */
        @JvmOverloads
        @MustBeClosed
        fun update(
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2UpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules`, but is otherwise the same as
         * [V2Service.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AuthRuleV2ListParams = AuthRuleV2ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRuleV2ListPage>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules`, but is otherwise the same as
         * [V2Service.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuthRuleV2ListPage> =
            list(AuthRuleV2ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/auth_rules/{auth_rule_token}`, but is
         * otherwise the same as [V2Service.delete].
         */
        @JvmOverloads
        @MustBeClosed
        fun delete(
            params: AuthRuleV2DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/apply`, but is
         * otherwise the same as [V2Service.apply].
         */
        @JvmOverloads
        @MustBeClosed
        fun apply(
            params: AuthRuleV2ApplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2ApplyResponse>

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/draft`, but is
         * otherwise the same as [V2Service.draft].
         */
        @JvmOverloads
        @MustBeClosed
        fun draft(
            params: AuthRuleV2DraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2DraftResponse>

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/promote`, but is
         * otherwise the same as [V2Service.promote].
         */
        @JvmOverloads
        @MustBeClosed
        fun promote(
            params: AuthRuleV2PromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2PromoteResponse>

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/report`, but is
         * otherwise the same as [V2Service.report].
         */
        @JvmOverloads
        @MustBeClosed
        fun report(
            params: AuthRuleV2ReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2ReportResponse>
    }
}
