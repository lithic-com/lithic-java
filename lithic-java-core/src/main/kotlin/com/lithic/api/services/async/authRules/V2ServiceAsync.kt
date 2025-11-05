// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.authRules

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AuthRuleV2CreateParams
import com.lithic.api.models.AuthRuleV2DeleteParams
import com.lithic.api.models.AuthRuleV2DraftParams
import com.lithic.api.models.AuthRuleV2ListPageAsync
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
import com.lithic.api.services.async.authRules.v2.BacktestServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface V2ServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync

    fun backtests(): BacktestServiceAsync

    /** Creates a new V2 Auth rule in draft mode */
    fun create(params: AuthRuleV2CreateParams): CompletableFuture<V2CreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: AuthRuleV2CreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2CreateResponse>

    /** Fetches a V2 Auth rule by its token */
    fun retrieve(authRuleToken: String): CompletableFuture<V2RetrieveResponse> =
        retrieve(authRuleToken, AuthRuleV2RetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        authRuleToken: String,
        params: AuthRuleV2RetrieveParams = AuthRuleV2RetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2RetrieveResponse> =
        retrieve(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        authRuleToken: String,
        params: AuthRuleV2RetrieveParams = AuthRuleV2RetrieveParams.none(),
    ): CompletableFuture<V2RetrieveResponse> =
        retrieve(authRuleToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: AuthRuleV2RetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2RetrieveResponse>

    /** @see retrieve */
    fun retrieve(params: AuthRuleV2RetrieveParams): CompletableFuture<V2RetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        authRuleToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2RetrieveResponse> =
        retrieve(authRuleToken, AuthRuleV2RetrieveParams.none(), requestOptions)

    /**
     * Updates a V2 Auth rule's properties
     *
     * If `account_tokens`, `card_tokens`, `program_level`, or `excluded_card_tokens` is provided,
     * this will replace existing associations with the provided list of entities.
     */
    fun update(
        authRuleToken: String,
        params: AuthRuleV2UpdateParams,
    ): CompletableFuture<V2UpdateResponse> = update(authRuleToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        authRuleToken: String,
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2UpdateResponse> =
        update(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see update */
    fun update(params: AuthRuleV2UpdateParams): CompletableFuture<V2UpdateResponse> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: AuthRuleV2UpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2UpdateResponse>

    /** Lists V2 Auth rules */
    fun list(): CompletableFuture<AuthRuleV2ListPageAsync> = list(AuthRuleV2ListParams.none())

    /** @see list */
    fun list(
        params: AuthRuleV2ListParams = AuthRuleV2ListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AuthRuleV2ListPageAsync>

    /** @see list */
    fun list(
        params: AuthRuleV2ListParams = AuthRuleV2ListParams.none()
    ): CompletableFuture<AuthRuleV2ListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<AuthRuleV2ListPageAsync> =
        list(AuthRuleV2ListParams.none(), requestOptions)

    /** Deletes a V2 Auth rule */
    fun delete(authRuleToken: String): CompletableFuture<Void?> =
        delete(authRuleToken, AuthRuleV2DeleteParams.none())

    /** @see delete */
    fun delete(
        authRuleToken: String,
        params: AuthRuleV2DeleteParams = AuthRuleV2DeleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        delete(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see delete */
    fun delete(
        authRuleToken: String,
        params: AuthRuleV2DeleteParams = AuthRuleV2DeleteParams.none(),
    ): CompletableFuture<Void?> = delete(authRuleToken, params, RequestOptions.none())

    /** @see delete */
    fun delete(
        params: AuthRuleV2DeleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see delete */
    fun delete(params: AuthRuleV2DeleteParams): CompletableFuture<Void?> =
        delete(params, RequestOptions.none())

    /** @see delete */
    fun delete(authRuleToken: String, requestOptions: RequestOptions): CompletableFuture<Void?> =
        delete(authRuleToken, AuthRuleV2DeleteParams.none(), requestOptions)

    /**
     * Creates a new draft version of a rule that will be ran in shadow mode.
     *
     * This can also be utilized to reset the draft parameters, causing a draft version to no longer
     * be ran in shadow mode.
     */
    fun draft(authRuleToken: String): CompletableFuture<V2DraftResponse> =
        draft(authRuleToken, AuthRuleV2DraftParams.none())

    /** @see draft */
    fun draft(
        authRuleToken: String,
        params: AuthRuleV2DraftParams = AuthRuleV2DraftParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2DraftResponse> =
        draft(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see draft */
    fun draft(
        authRuleToken: String,
        params: AuthRuleV2DraftParams = AuthRuleV2DraftParams.none(),
    ): CompletableFuture<V2DraftResponse> = draft(authRuleToken, params, RequestOptions.none())

    /** @see draft */
    fun draft(
        params: AuthRuleV2DraftParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2DraftResponse>

    /** @see draft */
    fun draft(params: AuthRuleV2DraftParams): CompletableFuture<V2DraftResponse> =
        draft(params, RequestOptions.none())

    /** @see draft */
    fun draft(
        authRuleToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2DraftResponse> =
        draft(authRuleToken, AuthRuleV2DraftParams.none(), requestOptions)

    /**
     * Promotes the draft version of an Auth rule to the currently active version such that it is
     * enforced in the respective stream.
     */
    fun promote(authRuleToken: String): CompletableFuture<V2PromoteResponse> =
        promote(authRuleToken, AuthRuleV2PromoteParams.none())

    /** @see promote */
    fun promote(
        authRuleToken: String,
        params: AuthRuleV2PromoteParams = AuthRuleV2PromoteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2PromoteResponse> =
        promote(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see promote */
    fun promote(
        authRuleToken: String,
        params: AuthRuleV2PromoteParams = AuthRuleV2PromoteParams.none(),
    ): CompletableFuture<V2PromoteResponse> = promote(authRuleToken, params, RequestOptions.none())

    /** @see promote */
    fun promote(
        params: AuthRuleV2PromoteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2PromoteResponse>

    /** @see promote */
    fun promote(params: AuthRuleV2PromoteParams): CompletableFuture<V2PromoteResponse> =
        promote(params, RequestOptions.none())

    /** @see promote */
    fun promote(
        authRuleToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2PromoteResponse> =
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
    fun retrieveFeatures(authRuleToken: String): CompletableFuture<V2RetrieveFeaturesResponse> =
        retrieveFeatures(authRuleToken, AuthRuleV2RetrieveFeaturesParams.none())

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        authRuleToken: String,
        params: AuthRuleV2RetrieveFeaturesParams = AuthRuleV2RetrieveFeaturesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2RetrieveFeaturesResponse> =
        retrieveFeatures(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        authRuleToken: String,
        params: AuthRuleV2RetrieveFeaturesParams = AuthRuleV2RetrieveFeaturesParams.none(),
    ): CompletableFuture<V2RetrieveFeaturesResponse> =
        retrieveFeatures(authRuleToken, params, RequestOptions.none())

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        params: AuthRuleV2RetrieveFeaturesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2RetrieveFeaturesResponse>

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        params: AuthRuleV2RetrieveFeaturesParams
    ): CompletableFuture<V2RetrieveFeaturesResponse> =
        retrieveFeatures(params, RequestOptions.none())

    /** @see retrieveFeatures */
    fun retrieveFeatures(
        authRuleToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<V2RetrieveFeaturesResponse> =
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
    ): CompletableFuture<V2RetrieveReportResponse> =
        retrieveReport(authRuleToken, params, RequestOptions.none())

    /** @see retrieveReport */
    fun retrieveReport(
        authRuleToken: String,
        params: AuthRuleV2RetrieveReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2RetrieveReportResponse> =
        retrieveReport(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

    /** @see retrieveReport */
    fun retrieveReport(
        params: AuthRuleV2RetrieveReportParams
    ): CompletableFuture<V2RetrieveReportResponse> = retrieveReport(params, RequestOptions.none())

    /** @see retrieveReport */
    fun retrieveReport(
        params: AuthRuleV2RetrieveReportParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<V2RetrieveReportResponse>

    /** A view of [V2ServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): V2ServiceAsync.WithRawResponse

        fun backtests(): BacktestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules`, but is otherwise the same as
         * [V2ServiceAsync.create].
         */
        fun create(
            params: AuthRuleV2CreateParams
        ): CompletableFuture<HttpResponseFor<V2CreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: AuthRuleV2CreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2CreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules/{auth_rule_token}`, but is otherwise
         * the same as [V2ServiceAsync.retrieve].
         */
        fun retrieve(
            authRuleToken: String
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>> =
            retrieve(authRuleToken, AuthRuleV2RetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            authRuleToken: String,
            params: AuthRuleV2RetrieveParams = AuthRuleV2RetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>> =
            retrieve(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            authRuleToken: String,
            params: AuthRuleV2RetrieveParams = AuthRuleV2RetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>> =
            retrieve(authRuleToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: AuthRuleV2RetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>>

        /** @see retrieve */
        fun retrieve(
            params: AuthRuleV2RetrieveParams
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2RetrieveResponse>> =
            retrieve(authRuleToken, AuthRuleV2RetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v2/auth_rules/{auth_rule_token}`, but is
         * otherwise the same as [V2ServiceAsync.update].
         */
        fun update(
            authRuleToken: String,
            params: AuthRuleV2UpdateParams,
        ): CompletableFuture<HttpResponseFor<V2UpdateResponse>> =
            update(authRuleToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            authRuleToken: String,
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2UpdateResponse>> =
            update(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see update */
        fun update(
            params: AuthRuleV2UpdateParams
        ): CompletableFuture<HttpResponseFor<V2UpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: AuthRuleV2UpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2UpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules`, but is otherwise the same as
         * [V2ServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>> =
            list(AuthRuleV2ListParams.none())

        /** @see list */
        fun list(
            params: AuthRuleV2ListParams = AuthRuleV2ListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>>

        /** @see list */
        fun list(
            params: AuthRuleV2ListParams = AuthRuleV2ListParams.none()
        ): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AuthRuleV2ListPageAsync>> =
            list(AuthRuleV2ListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `delete /v2/auth_rules/{auth_rule_token}`, but is
         * otherwise the same as [V2ServiceAsync.delete].
         */
        fun delete(authRuleToken: String): CompletableFuture<HttpResponse> =
            delete(authRuleToken, AuthRuleV2DeleteParams.none())

        /** @see delete */
        fun delete(
            authRuleToken: String,
            params: AuthRuleV2DeleteParams = AuthRuleV2DeleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            delete(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see delete */
        fun delete(
            authRuleToken: String,
            params: AuthRuleV2DeleteParams = AuthRuleV2DeleteParams.none(),
        ): CompletableFuture<HttpResponse> = delete(authRuleToken, params, RequestOptions.none())

        /** @see delete */
        fun delete(
            params: AuthRuleV2DeleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see delete */
        fun delete(params: AuthRuleV2DeleteParams): CompletableFuture<HttpResponse> =
            delete(params, RequestOptions.none())

        /** @see delete */
        fun delete(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            delete(authRuleToken, AuthRuleV2DeleteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/draft`, but is
         * otherwise the same as [V2ServiceAsync.draft].
         */
        fun draft(authRuleToken: String): CompletableFuture<HttpResponseFor<V2DraftResponse>> =
            draft(authRuleToken, AuthRuleV2DraftParams.none())

        /** @see draft */
        fun draft(
            authRuleToken: String,
            params: AuthRuleV2DraftParams = AuthRuleV2DraftParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>> =
            draft(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see draft */
        fun draft(
            authRuleToken: String,
            params: AuthRuleV2DraftParams = AuthRuleV2DraftParams.none(),
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>> =
            draft(authRuleToken, params, RequestOptions.none())

        /** @see draft */
        fun draft(
            params: AuthRuleV2DraftParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>>

        /** @see draft */
        fun draft(
            params: AuthRuleV2DraftParams
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>> =
            draft(params, RequestOptions.none())

        /** @see draft */
        fun draft(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2DraftResponse>> =
            draft(authRuleToken, AuthRuleV2DraftParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v2/auth_rules/{auth_rule_token}/promote`, but is
         * otherwise the same as [V2ServiceAsync.promote].
         */
        fun promote(authRuleToken: String): CompletableFuture<HttpResponseFor<V2PromoteResponse>> =
            promote(authRuleToken, AuthRuleV2PromoteParams.none())

        /** @see promote */
        fun promote(
            authRuleToken: String,
            params: AuthRuleV2PromoteParams = AuthRuleV2PromoteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>> =
            promote(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see promote */
        fun promote(
            authRuleToken: String,
            params: AuthRuleV2PromoteParams = AuthRuleV2PromoteParams.none(),
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>> =
            promote(authRuleToken, params, RequestOptions.none())

        /** @see promote */
        fun promote(
            params: AuthRuleV2PromoteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>>

        /** @see promote */
        fun promote(
            params: AuthRuleV2PromoteParams
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>> =
            promote(params, RequestOptions.none())

        /** @see promote */
        fun promote(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2PromoteResponse>> =
            promote(authRuleToken, AuthRuleV2PromoteParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules/{auth_rule_token}/features`, but is
         * otherwise the same as [V2ServiceAsync.retrieveFeatures].
         */
        fun retrieveFeatures(
            authRuleToken: String
        ): CompletableFuture<HttpResponseFor<V2RetrieveFeaturesResponse>> =
            retrieveFeatures(authRuleToken, AuthRuleV2RetrieveFeaturesParams.none())

        /** @see retrieveFeatures */
        fun retrieveFeatures(
            authRuleToken: String,
            params: AuthRuleV2RetrieveFeaturesParams = AuthRuleV2RetrieveFeaturesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveFeaturesResponse>> =
            retrieveFeatures(
                params.toBuilder().authRuleToken(authRuleToken).build(),
                requestOptions,
            )

        /** @see retrieveFeatures */
        fun retrieveFeatures(
            authRuleToken: String,
            params: AuthRuleV2RetrieveFeaturesParams = AuthRuleV2RetrieveFeaturesParams.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveFeaturesResponse>> =
            retrieveFeatures(authRuleToken, params, RequestOptions.none())

        /** @see retrieveFeatures */
        fun retrieveFeatures(
            params: AuthRuleV2RetrieveFeaturesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveFeaturesResponse>>

        /** @see retrieveFeatures */
        fun retrieveFeatures(
            params: AuthRuleV2RetrieveFeaturesParams
        ): CompletableFuture<HttpResponseFor<V2RetrieveFeaturesResponse>> =
            retrieveFeatures(params, RequestOptions.none())

        /** @see retrieveFeatures */
        fun retrieveFeatures(
            authRuleToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<V2RetrieveFeaturesResponse>> =
            retrieveFeatures(authRuleToken, AuthRuleV2RetrieveFeaturesParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v2/auth_rules/{auth_rule_token}/report`, but is
         * otherwise the same as [V2ServiceAsync.retrieveReport].
         */
        fun retrieveReport(
            authRuleToken: String,
            params: AuthRuleV2RetrieveReportParams,
        ): CompletableFuture<HttpResponseFor<V2RetrieveReportResponse>> =
            retrieveReport(authRuleToken, params, RequestOptions.none())

        /** @see retrieveReport */
        fun retrieveReport(
            authRuleToken: String,
            params: AuthRuleV2RetrieveReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveReportResponse>> =
            retrieveReport(params.toBuilder().authRuleToken(authRuleToken).build(), requestOptions)

        /** @see retrieveReport */
        fun retrieveReport(
            params: AuthRuleV2RetrieveReportParams
        ): CompletableFuture<HttpResponseFor<V2RetrieveReportResponse>> =
            retrieveReport(params, RequestOptions.none())

        /** @see retrieveReport */
        fun retrieveReport(
            params: AuthRuleV2RetrieveReportParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<V2RetrieveReportResponse>>
    }
}
