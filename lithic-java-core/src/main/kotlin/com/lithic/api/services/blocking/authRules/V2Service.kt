// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.authRules

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
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

    fun backtests(): BacktestService

    /** Creates a new V2 authorization rule in draft mode */
    @JvmOverloads
    fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2CreateResponse

    /** Fetches an authorization rule by its token */
    @JvmOverloads
    fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2RetrieveResponse

    /** Updates an authorization rule's properties */
    @JvmOverloads
    fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2UpdateResponse

    /** Lists V2 authorization rules */
    @JvmOverloads
    fun list(
        params: AuthRuleV2ListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AuthRuleV2ListPage

    /**
     * Associates an authorization rules with a card program, the provided account(s) or card(s).
     *
     * This endpoint will replace any existing associations with the provided list of entities.
     */
    @JvmOverloads
    fun apply(
        params: AuthRuleV2ApplyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2ApplyResponse

    /**
     * Creates a new draft version of an authorization rules that will be ran in shadow mode.
     *
     * This can also be utilized to reset the draft parameters, causing a draft version to no longer
     * be ran in shadow mode.
     */
    @JvmOverloads
    fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2DraftResponse

    /**
     * Promotes a draft version of an authorization rule to the currently active version such that
     * it is enforced in the authorization stream.
     */
    @JvmOverloads
    fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions = RequestOptions.none()
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
        requestOptions: RequestOptions = RequestOptions.none()
    ): V2ReportResponse
}
