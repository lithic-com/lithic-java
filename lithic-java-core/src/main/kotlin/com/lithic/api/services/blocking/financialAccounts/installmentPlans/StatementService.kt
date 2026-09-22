// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts.installmentPlans

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListPage
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanStatementRetrieveParams
import com.lithic.api.models.InstallmentPlanStatement
import java.util.function.Consumer

interface StatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementService

    /** Get a specific statement snapshot for a given installment plan. */
    fun retrieve(
        statementToken: String,
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
    ): InstallmentPlanStatement = retrieve(statementToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        statementToken: String,
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstallmentPlanStatement =
        retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInstallmentPlanStatementRetrieveParams
    ): InstallmentPlanStatement = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstallmentPlanStatement

    /** List the statement snapshots for a given installment plan. */
    fun list(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanStatementListParams,
    ): FinancialAccountInstallmentPlanStatementListPage =
        list(installmentPlanToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInstallmentPlanStatementListPage =
        list(params.toBuilder().installmentPlanToken(installmentPlanToken).build(), requestOptions)

    /** @see list */
    fun list(
        params: FinancialAccountInstallmentPlanStatementListParams
    ): FinancialAccountInstallmentPlanStatementListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FinancialAccountInstallmentPlanStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInstallmentPlanStatementListPage

    /** A view of [StatementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements/{statement_token}`,
         * but is otherwise the same as [StatementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            statementToken: String,
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
        ): HttpResponseFor<InstallmentPlanStatement> =
            retrieve(statementToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            statementToken: String,
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstallmentPlanStatement> =
            retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountInstallmentPlanStatementRetrieveParams
        ): HttpResponseFor<InstallmentPlanStatement> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountInstallmentPlanStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstallmentPlanStatement>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}/statements`,
         * but is otherwise the same as [StatementService.list].
         */
        @MustBeClosed
        fun list(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanStatementListParams,
        ): HttpResponseFor<FinancialAccountInstallmentPlanStatementListPage> =
            list(installmentPlanToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanStatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanStatementListPage> =
            list(
                params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountInstallmentPlanStatementListParams
        ): HttpResponseFor<FinancialAccountInstallmentPlanStatementListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountInstallmentPlanStatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanStatementListPage>
    }
}
