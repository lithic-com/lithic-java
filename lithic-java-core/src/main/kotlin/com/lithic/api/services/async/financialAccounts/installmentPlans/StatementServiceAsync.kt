// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts.installmentPlans

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListPageAsync
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementRetrieveParams
import com.lithic.api.models.InstallmentPlanStatement
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface StatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementServiceAsync

    /** Get a specific statement snapshot for a given installment plan. */
    fun retrieve(
        statementToken: String,
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
    ): CompletableFuture<InstallmentPlanStatement> =
        retrieve(statementToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        statementToken: String,
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstallmentPlanStatement> =
        retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInstallmentPlanStatementRetrieveParams
    ): CompletableFuture<InstallmentPlanStatement> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstallmentPlanStatement>

    /** List the statement snapshots for a given installment plan. */
    fun list(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanStatementListParams,
    ): CompletableFuture<FinancialAccountInstallmentPlanStatementListPageAsync> =
        list(installmentPlanToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountInstallmentPlanStatementListPageAsync> =
        list(params.toBuilder().installmentPlanToken(installmentPlanToken).build(), requestOptions)

    /** @see list */
    fun list(
        params: FinancialAccountInstallmentPlanStatementListParams
    ): CompletableFuture<FinancialAccountInstallmentPlanStatementListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FinancialAccountInstallmentPlanStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountInstallmentPlanStatementListPageAsync>

    /**
     * A view of [StatementServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements/{statement_token}`,
         * but is otherwise the same as [StatementServiceAsync.retrieve].
         */
        fun retrieve(
            statementToken: String,
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        ): CompletableFuture<HttpResponseFor<InstallmentPlanStatement>> =
            retrieve(statementToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            statementToken: String,
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstallmentPlanStatement>> =
            retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountInstallmentPlanStatementRetrieveParams
        ): CompletableFuture<HttpResponseFor<InstallmentPlanStatement>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstallmentPlanStatement>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements`,
         * but is otherwise the same as [StatementServiceAsync.list].
         */
        fun list(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanStatementListParams,
        ): CompletableFuture<
            HttpResponseFor<FinancialAccountInstallmentPlanStatementListPageAsync>
        > = list(installmentPlanToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanStatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<
            HttpResponseFor<FinancialAccountInstallmentPlanStatementListPageAsync>
        > =
            list(
                params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
                requestOptions,
            )

        /** @see list */
        fun list(
            params: FinancialAccountInstallmentPlanStatementListParams
        ): CompletableFuture<
            HttpResponseFor<FinancialAccountInstallmentPlanStatementListPageAsync>
        > = list(params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FinancialAccountInstallmentPlanStatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountInstallmentPlanStatementListPageAsync>>
    }
}
