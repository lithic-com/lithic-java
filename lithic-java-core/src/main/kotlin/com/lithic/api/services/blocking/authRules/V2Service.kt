// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.authRules

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DeleteParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPage
import com.lithic.api.models.AuthRuleV2ListParams
import com.lithic.api.models.AuthRuleV2PromoteParams
import com.lithic.api.models.AuthRuleV2RetrieveFeaturesParams
import com.lithic.api.models.AuthRuleV2RetrieveParams
import com.lithic.api.models.AuthRuleV2RetrieveReportParams
import com.lithic.api.models.AuthRuleV2UpdateParams
import com.lithic.api.models.V2CreateResponse
import com.lithic.api.models.V2DraftResponse
import com.lithic.api.models.V2PromoteResponse
import com.lithic.api.models.V2RetrieveFeaturesResponse
import com.lithic.api.models.V2RetrieveReportResponse
import com.lithic.api.models.V2RetrieveResponse
import com.lithic.api.models.V2UpdateResponse
import com.lithic.api.services.blocking.authRules.v2.BacktestService
import java.util.function.Consumer

interface V2Service {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service

    fun backtests(): BacktestService

    /** Creates a new V2 Auth rule in draft mode */
    fun create(params: AuthRuleV2CreateParams): V2CreateResponse =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2CreateResponse

    /** Fetches a V2 Auth rule by its token */
    fun retrieve(authRuleToken: String): V2RetrieveResponse =
        retrieve(authRuleToken, AuthRuleV2RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        authRuleToken: String,
        params: AuthRuleV2RetrieveParams = AuthRuleV2RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2RetrieveResponse =
        retrieve(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        authRuleToken: String,
        params: AuthRuleV2RetrieveParams = AuthRuleV2RetrieveParams.none(),
    ): V2RetrieveResponse = retrieve(authRuleToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2RetrieveResponse

    /** @see retrieve */
    fun retrieve(params: AuthRuleV2RetrieveParams): V2RetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(authRuleToken: String, requestOptions: RequestOptions): V2RetrieveResponse =
        retrieve(authRuleToken, AuthRuleV2RetrieveParams.none(), requestOptions)

    /**
     * Updates a V2 Auth rule's properties
     *
     * If `account_tokens`, `card_tokens`, `program_level`, or `excluded_card_tokens` is provided,
     * this will replace existing associations with the provided list of entities.
     */
    fun update(authRuleToken: String, params: AuthRuleV2UpdateParams): V2UpdateResponse =
        update(authRuleToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        authRuleToken: String,
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2UpdateResponse =
        update(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see update */
    fun update(params: AuthRuleV2UpdateParams): V2UpdateResponse =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2UpdateResponse

    /** Lists V2 Auth rules */
    fun list(): AuthRuleV2ListPage = list(AuthRuleV2ListParams.none())

    /** @see list */
    fun list(
        params: AuthRuleV2ListParams = AuthRuleV2ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuthRuleV2ListPage

    /** @see list */
    fun list(params: AuthRuleV2ListParams = AuthRuleV2ListParams.none()): AuthRuleV2ListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): AuthRuleV2ListPage =
        list(AuthRuleV2ListParams.none(), requestOptions)

    /** Deletes a V2 Auth rule */
    fun delete(authRuleToken: String) = delete(authRuleToken, AuthRuleV2DeleteParams.none())

    /** @see delete */
    fun delete(
        authRuleToken: String,
        params: AuthRuleV2DeleteParams = AuthRuleV2DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = delete(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see delete */
    fun delete(
        authRuleToken: String,
        params: AuthRuleV2DeleteParams = AuthRuleV2DeleteParams.none(),
    ) = delete(authRuleToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AuthRuleV2DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see delete */
    fun delete(params: AuthRuleV2DeleteParams) = delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(authRuleToken: String, requestOptions: RequestOptions) =
        delete(authRuleToken, AuthRuleV2DeleteParams.none(), requestOptions)

    /**
     * Creates a new draft version of a rule that will be ran in shadow mode.
     *
     * This can also be utilized to reset the draft parameters, causing a draft version to no longer
     * be ran in shadow mode.
     */
    fun draft(authRuleToken: String): V2DraftResponse =
        draft(authRuleToken, AuthRuleV2DraftParams.none())

    /** @see draft */
    fun draft(
        authRuleToken: String,
        params: AuthRuleV2DraftParams = AuthRuleV2DraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2DraftResponse =
        draft(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see draft */
    fun draft(
        authRuleToken: String,
        params: AuthRuleV2DraftParams = AuthRuleV2DraftParams.none(),
    ): V2DraftResponse = draft(authRuleToken, params, RequestOptions.none())

    /** @see draft */
    fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2DraftResponse

    /** @see draft */
    fun draft(params: AuthRuleV2DraftParams): V2DraftResponse = draft(params, RequestOptions.none())

    /** @see draft */
    fun draft(authRuleToken: String, requestOptions: RequestOptions): V2DraftResponse =
        draft(authRuleToken, AuthRuleV2DraftParams.none(), requestOptions)

    /**
     * Promotes the draft version of an Auth rule to the currently active version such that it is
     * enforced in the respective stream.
     */
    fun promote(authRuleToken: String): V2PromoteResponse =
        promote(authRuleToken, AuthRuleV2PromoteParams.none())

    /** @see promote */
    fun promote(
        authRuleToken: String,
        params: AuthRuleV2PromoteParams = AuthRuleV2PromoteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2PromoteResponse =
        promote(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see promote */
    fun promote(
        authRuleToken: String,
        params: AuthRuleV2PromoteParams = AuthRuleV2PromoteParams.none(),
    ): V2PromoteResponse = promote(authRuleToken, params, RequestOptions.none())

    /** @see promote */
    fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2PromoteResponse

    /** @see promote */
    fun promote(params: AuthRuleV2PromoteParams): V2PromoteResponse =
        promote(params, RequestOptions.none())

    /** @see promote */
    fun promote(authRuleToken: String, requestOptions: RequestOptions): V2PromoteResponse =
        promote(authRuleToken, AuthRuleV2PromoteParams.none(), requestOptions)

    /**
     * Fetches the current calculated Feature values for the given Auth Rule
     *
     * This only calculates the features for the active version.
     * - VelocityLimit Rules calculates the current Velocity Feature data. This requires a
     *   `card_token` or `account_token` matching what the rule is Scoped to.
     * - ConditionalBlock Rules calculates the CARD_TRANSACTION_COUNT_* attributes on the rule. This
     *   requires a `card_token`
     */
    fun retrieveFeatures(authRuleToken: String): V2RetrieveFeaturesResponse =
        retrieveFeatures(authRuleToken, AuthRuleV2RetrieveFeaturesParams.none())

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        authRuleToken: String,
        params: AuthRuleV2RetrieveFeaturesParams = AuthRuleV2RetrieveFeaturesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2RetrieveFeaturesResponse =
        retrieveFeatures(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        authRuleToken: String,
        params: AuthRuleV2RetrieveFeaturesParams = AuthRuleV2RetrieveFeaturesParams.none(),
    ): V2RetrieveFeaturesResponse = retrieveFeatures(authRuleToken, params, RequestOptions.none())

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        params: AuthRuleV2RetrieveFeaturesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2RetrieveFeaturesResponse

    /** @see retrieveFeatures */
    fun retrieveFeatures(params: AuthRuleV2RetrieveFeaturesParams): V2RetrieveFeaturesResponse =
        retrieveFeatures(params, RequestOptions.none())

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        authRuleToken: String,
        requestOptions: RequestOptions,
    ): V2RetrieveFeaturesResponse =
        retrieveFeatures(authRuleToken, AuthRuleV2RetrieveFeaturesParams.none(), requestOptions)

    /**
     * Retrieves a performance report for an Auth rule containing daily statistics and evaluation
     * outcomes.
     *
     * **Time Range Limitations:**
     * - Reports are supported for the past 3 months only
     * - Maximum interval length is 1 month
     * - Report data is available only through the previous day in UTC (current day data is not
     *   available)
     *
     * The report provides daily statistics for both current and draft versions of the Auth rule,
     * including approval, decline, and challenge counts along with sample events.
     */
    fun retrieveReport(
        authRuleToken: String,
        params: AuthRuleV2RetrieveReportParams,
    ): V2RetrieveReportResponse = retrieveReport(authRuleToken, params, RequestOptions.none())

    /** @see retrieveReport */
    fun retrieveReport(
        authRuleToken: String,
        params: AuthRuleV2RetrieveReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2RetrieveReportResponse =
        retrieveReport(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see retrieveReport */
    fun retrieveReport(params: AuthRuleV2RetrieveReportParams): V2RetrieveReportResponse =
        retrieveReport(params, RequestOptions.none())

    /** @see retrieveReport */
    fun retrieveReport(
        params: AuthRuleV2RetrieveReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): V2RetrieveReportResponse

    /** A view of [V2Service] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2Service.WithRawResponse

        fun backtests(): BacktestService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules`, but is otherwise the same as
         * [V2Service.create].
         */
        @MustBeClosed
        fun create(params: AuthRuleV2CreateParams): HttpResponseFor<V2CreateResponse> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: AuthRuleV2CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2CreateResponse>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules/{auth_rule_token}`, but is otherwise
         * the same as [V2Service.retrieve].
         */
        @MustBeClosed
        fun retrieve(authRuleToken: String): HttpResponseFor<V2RetrieveResponse> =
            retrieve(authRuleToken, AuthRuleV2RetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            authRuleToken: String,
            params: AuthRuleV2RetrieveParams = AuthRuleV2RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2RetrieveResponse> =
            retrieve(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            authRuleToken: String,
            params: AuthRuleV2RetrieveParams = AuthRuleV2RetrieveParams.none(),
        ): HttpResponseFor<V2RetrieveResponse> =
            retrieve(authRuleToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AuthRuleV2RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2RetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: AuthRuleV2RetrieveParams): HttpResponseFor<V2RetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveResponse> =
            retrieve(authRuleToken, AuthRuleV2RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/auth_rules/{auth_rule_token}`, but is
         * otherwise the same as [V2Service.update].
         */
        @MustBeClosed
        fun update(
            authRuleToken: String,
            params: AuthRuleV2UpdateParams,
        ): HttpResponseFor<V2UpdateResponse> = update(authRuleToken, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            authRuleToken: String,
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2UpdateResponse> =
            update(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: AuthRuleV2UpdateParams): HttpResponseFor<V2UpdateResponse> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2UpdateResponse>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules`, but is otherwise the same as
         * [V2Service.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<AuthRuleV2ListPage> = list(AuthRuleV2ListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthRuleV2ListParams = AuthRuleV2ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuthRuleV2ListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: AuthRuleV2ListParams = AuthRuleV2ListParams.none()
        ): HttpResponseFor<AuthRuleV2ListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AuthRuleV2ListPage> =
            list(AuthRuleV2ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/auth_rules/{auth_rule_token}`, but is
         * otherwise the same as [V2Service.delete].
         */
        @MustBeClosed
        fun delete(authRuleToken: String): HttpResponse =
            delete(authRuleToken, AuthRuleV2DeleteParams.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            authRuleToken: String,
            params: AuthRuleV2DeleteParams = AuthRuleV2DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            delete(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see delete */
        @MustBeClosed
        fun delete(
            authRuleToken: String,
            params: AuthRuleV2DeleteParams = AuthRuleV2DeleteParams.none(),
        ): HttpResponse = delete(authRuleToken, params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(
            params: AuthRuleV2DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see delete */
        @MustBeClosed
        fun delete(params: AuthRuleV2DeleteParams): HttpResponse =
            delete(params, RequestOptions.none())

        /** @see delete */
        @MustBeClosed
        fun delete(authRuleToken: String, requestOptions: RequestOptions): HttpResponse =
            delete(authRuleToken, AuthRuleV2DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/draft`, but is
         * otherwise the same as [V2Service.draft].
         */
        @MustBeClosed
        fun draft(authRuleToken: String): HttpResponseFor<V2DraftResponse> =
            draft(authRuleToken, AuthRuleV2DraftParams.none())

        /** @see draft */
        @MustBeClosed
        fun draft(
            authRuleToken: String,
            params: AuthRuleV2DraftParams = AuthRuleV2DraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2DraftResponse> =
            draft(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see draft */
        @MustBeClosed
        fun draft(
            authRuleToken: String,
            params: AuthRuleV2DraftParams = AuthRuleV2DraftParams.none(),
        ): HttpResponseFor<V2DraftResponse> = draft(authRuleToken, params, RequestOptions.none())

        /** @see draft */
        @MustBeClosed
        fun draft(
            params: AuthRuleV2DraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2DraftResponse>

        /** @see draft */
        @MustBeClosed
        fun draft(params: AuthRuleV2DraftParams): HttpResponseFor<V2DraftResponse> =
            draft(params, RequestOptions.none())

        /** @see draft */
        @MustBeClosed
        fun draft(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2DraftResponse> =
            draft(authRuleToken, AuthRuleV2DraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/promote`, but is
         * otherwise the same as [V2Service.promote].
         */
        @MustBeClosed
        fun promote(authRuleToken: String): HttpResponseFor<V2PromoteResponse> =
            promote(authRuleToken, AuthRuleV2PromoteParams.none())

        /** @see promote */
        @MustBeClosed
        fun promote(
            authRuleToken: String,
            params: AuthRuleV2PromoteParams = AuthRuleV2PromoteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2PromoteResponse> =
            promote(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see promote */
        @MustBeClosed
        fun promote(
            authRuleToken: String,
            params: AuthRuleV2PromoteParams = AuthRuleV2PromoteParams.none(),
        ): HttpResponseFor<V2PromoteResponse> =
            promote(authRuleToken, params, RequestOptions.none())

        /** @see promote */
        @MustBeClosed
        fun promote(
            params: AuthRuleV2PromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2PromoteResponse>

        /** @see promote */
        @MustBeClosed
        fun promote(params: AuthRuleV2PromoteParams): HttpResponseFor<V2PromoteResponse> =
            promote(params, RequestOptions.none())

        /** @see promote */
        @MustBeClosed
        fun promote(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2PromoteResponse> =
            promote(authRuleToken, AuthRuleV2PromoteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules/{auth_rule_token}/features`, but is
         * otherwise the same as [V2Service.retrieveFeatures].
         */
        @MustBeClosed
        fun retrieveFeatures(authRuleToken: String): HttpResponseFor<V2RetrieveFeaturesResponse> =
            retrieveFeatures(authRuleToken, AuthRuleV2RetrieveFeaturesParams.none())

        /** @see retrieveFeatures */
        @MustBeClosed
        fun retrieveFeatures(
            authRuleToken: String,
            params: AuthRuleV2RetrieveFeaturesParams = AuthRuleV2RetrieveFeaturesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2RetrieveFeaturesResponse> =
            retrieveFeatures(
                params.toBuilder().authRuleToken(authRuleToken).build(),
                requestOptions,
            )

        /** @see retrieveFeatures */
        @MustBeClosed
        fun retrieveFeatures(
            authRuleToken: String,
            params: AuthRuleV2RetrieveFeaturesParams = AuthRuleV2RetrieveFeaturesParams.none(),
        ): HttpResponseFor<V2RetrieveFeaturesResponse> =
            retrieveFeatures(authRuleToken, params, RequestOptions.none())

        /** @see retrieveFeatures */
        @MustBeClosed
        fun retrieveFeatures(
            params: AuthRuleV2RetrieveFeaturesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2RetrieveFeaturesResponse>

        /** @see retrieveFeatures */
        @MustBeClosed
        fun retrieveFeatures(
            params: AuthRuleV2RetrieveFeaturesParams
        ): HttpResponseFor<V2RetrieveFeaturesResponse> =
            retrieveFeatures(params, RequestOptions.none())

        /** @see retrieveFeatures */
        @MustBeClosed
        fun retrieveFeatures(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<V2RetrieveFeaturesResponse> =
            retrieveFeatures(authRuleToken, AuthRuleV2RetrieveFeaturesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules/{auth_rule_token}/report`, but is
         * otherwise the same as [V2Service.retrieveReport].
         */
        @MustBeClosed
        fun retrieveReport(
            authRuleToken: String,
            params: AuthRuleV2RetrieveReportParams,
        ): HttpResponseFor<V2RetrieveReportResponse> =
            retrieveReport(authRuleToken, params, RequestOptions.none())

        /** @see retrieveReport */
        @MustBeClosed
        fun retrieveReport(
            authRuleToken: String,
            params: AuthRuleV2RetrieveReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2RetrieveReportResponse> =
            retrieveReport(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see retrieveReport */
        @MustBeClosed
        fun retrieveReport(
            params: AuthRuleV2RetrieveReportParams
        ): HttpResponseFor<V2RetrieveReportResponse> = retrieveReport(params, RequestOptions.none())

        /** @see retrieveReport */
        @MustBeClosed
        fun retrieveReport(
            params: AuthRuleV2RetrieveReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<V2RetrieveReportResponse>
    }
}
