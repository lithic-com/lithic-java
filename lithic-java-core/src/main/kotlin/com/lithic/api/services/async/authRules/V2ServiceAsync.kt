// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthRuleV2ApplyParams
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DeleteParams
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
import com.lithic.api.services.async.authRules.v2.BacktestServiceAsync
import java.util.concurrent.CompletableFuture

interface V2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun backtests(): BacktestServiceAsync

    /** Creates a new V2 authorization rule in draft mode */
    fun create(params: AuthRuleV2CreateParams): CompletableFuture<V2CreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2CreateResponse>

    /** Fetches a V2 authorization rule by its token */
    fun retrieve(params: AuthRuleV2RetrieveParams): CompletableFuture<V2RetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2RetrieveResponse>

    /**
     * Updates a V2 authorization rule's properties
     *
     * If `account_tokens`, `card_tokens`, `program_level`, or `excluded_card_tokens` is provided,
     * this will replace existing associations with the provided list of entities.
     */
    fun update(params: AuthRuleV2UpdateParams): CompletableFuture<V2UpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2UpdateResponse>

    /** Lists V2 authorization rules */
    fun list(): CompletableFuture<AuthRuleV2ListPageAsync> = list(AuthRuleV2ListParams.none())

    /** @see [list] */
    fun list(
        params: AuthRuleV2ListParams = AuthRuleV2ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthRuleV2ListPageAsync>

    /** @see [list] */
    fun list(
        params: AuthRuleV2ListParams = AuthRuleV2ListParams.none()
    ): CompletableFuture<AuthRuleV2ListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AuthRuleV2ListPageAsync> =
        list(AuthRuleV2ListParams.none(), requestOptions)

    /** Deletes a V2 authorization rule */
    fun delete(params: AuthRuleV2DeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see [delete] */
    fun delete(
        params: AuthRuleV2DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /**
     * Associates a V2 authorization rule with a card program, the provided account(s) or card(s).
     *
     * Prefer using the `PATCH` method for this operation.
     */
    fun apply(params: AuthRuleV2ApplyParams): CompletableFuture<V2ApplyResponse> =
        apply(params, RequestOptions.none())

    /** @see [apply] */
    fun apply(
        params: AuthRuleV2ApplyParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2ApplyResponse>

    /**
     * Creates a new draft version of a rule that will be ran in shadow mode.
     *
     * This can also be utilized to reset the draft parameters, causing a draft version to no longer
     * be ran in shadow mode.
     */
    fun draft(params: AuthRuleV2DraftParams): CompletableFuture<V2DraftResponse> =
        draft(params, RequestOptions.none())

    /** @see [draft] */
    fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2DraftResponse>

    /**
     * Promotes the draft version of an authorization rule to the currently active version such that
     * it is enforced in the authorization stream.
     */
    fun promote(params: AuthRuleV2PromoteParams): CompletableFuture<V2PromoteResponse> =
        promote(params, RequestOptions.none())

    /** @see [promote] */
    fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2PromoteResponse>

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
    fun report(params: AuthRuleV2ReportParams): CompletableFuture<V2ReportResponse> =
        report(params, RequestOptions.none())

    /** @see [report] */
    fun report(
        params: AuthRuleV2ReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2ReportResponse>

    /** A view of [V2ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun backtests(): BacktestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules`, but is otherwise the same as
         * [V2ServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: AuthRuleV2CreateParams
        ): CompletableFuture<HttpResponseFor<V2CreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: AuthRuleV2CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2CreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules/{auth_rule_token}`, but is otherwise
         * the same as [V2ServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: AuthRuleV2RetrieveParams
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AuthRuleV2RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch /v2/auth_rules/{auth_rule_token}`, but is
         * otherwise the same as [V2ServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: AuthRuleV2UpdateParams
        ): CompletableFuture<HttpResponseFor<V2UpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2UpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules`, but is otherwise the same as
         * [V2ServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>> =
            list(AuthRuleV2ListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AuthRuleV2ListParams = AuthRuleV2ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: AuthRuleV2ListParams = AuthRuleV2ListParams.none()
        ): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>> =
            list(AuthRuleV2ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/auth_rules/{auth_rule_token}`, but is
         * otherwise the same as [V2ServiceAsync.delete].
         */
        @MustBeClosed
        fun delete(params: AuthRuleV2DeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see [delete] */
        @MustBeClosed
        fun delete(
            params: AuthRuleV2DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/apply`, but is
         * otherwise the same as [V2ServiceAsync.apply].
         */
        @MustBeClosed
        fun apply(
            params: AuthRuleV2ApplyParams
        ): CompletableFuture<HttpResponseFor<V2ApplyResponse>> =
            apply(params, RequestOptions.none())

        /** @see [apply] */
        @MustBeClosed
        fun apply(
            params: AuthRuleV2ApplyParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2ApplyResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/draft`, but is
         * otherwise the same as [V2ServiceAsync.draft].
         */
        @MustBeClosed
        fun draft(
            params: AuthRuleV2DraftParams
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>> =
            draft(params, RequestOptions.none())

        /** @see [draft] */
        @MustBeClosed
        fun draft(
            params: AuthRuleV2DraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/promote`, but is
         * otherwise the same as [V2ServiceAsync.promote].
         */
        @MustBeClosed
        fun promote(
            params: AuthRuleV2PromoteParams
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>> =
            promote(params, RequestOptions.none())

        /** @see [promote] */
        @MustBeClosed
        fun promote(
            params: AuthRuleV2PromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>>

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/report`, but is
         * otherwise the same as [V2ServiceAsync.report].
         */
        @MustBeClosed
        fun report(
            params: AuthRuleV2ReportParams
        ): CompletableFuture<HttpResponseFor<V2ReportResponse>> =
            report(params, RequestOptions.none())

        /** @see [report] */
        @MustBeClosed
        fun report(
            params: AuthRuleV2ReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2ReportResponse>>
    }
}
