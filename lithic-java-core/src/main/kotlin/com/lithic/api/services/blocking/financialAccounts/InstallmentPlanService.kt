// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountInstallmentPlanListPage
import com.lithic.api.models.FinancialAccountInstallmentPlanListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanRetrieveParams
import com.lithic.api.models.InstallmentPlan
import java.util.function.Consumer

interface InstallmentPlanService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstallmentPlanService

    /** Get a specific installment plan for a given financial account. */
    fun retrieve(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanRetrieveParams,
    ): InstallmentPlan = retrieve(installmentPlanToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstallmentPlan =
        retrieve(
            params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(params: FinancialAccountInstallmentPlanRetrieveParams): InstallmentPlan =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInstallmentPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InstallmentPlan

    /** List the installment plans for a given financial account. */
    fun list(financialAccountToken: String): FinancialAccountInstallmentPlanListPage =
        list(financialAccountToken, FinancialAccountInstallmentPlanListParams.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountInstallmentPlanListParams =
            FinancialAccountInstallmentPlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInstallmentPlanListPage =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountInstallmentPlanListParams =
            FinancialAccountInstallmentPlanListParams.none(),
    ): FinancialAccountInstallmentPlanListPage =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FinancialAccountInstallmentPlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountInstallmentPlanListPage

    /** @see list */
    fun list(
        params: FinancialAccountInstallmentPlanListParams
    ): FinancialAccountInstallmentPlanListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountInstallmentPlanListPage =
        list(
            financialAccountToken,
            FinancialAccountInstallmentPlanListParams.none(),
            requestOptions,
        )

    /**
     * A view of [InstallmentPlanService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): InstallmentPlanService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}`,
         * but is otherwise the same as [InstallmentPlanService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanRetrieveParams,
        ): HttpResponseFor<InstallmentPlan> =
            retrieve(installmentPlanToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstallmentPlan> =
            retrieve(
                params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountInstallmentPlanRetrieveParams
        ): HttpResponseFor<InstallmentPlan> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountInstallmentPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InstallmentPlan>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans`, but is otherwise the
         * same as [InstallmentPlanService.list].
         */
        @MustBeClosed
        fun list(
            financialAccountToken: String
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPage> =
            list(financialAccountToken, FinancialAccountInstallmentPlanListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountInstallmentPlanListParams =
                FinancialAccountInstallmentPlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPage> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountInstallmentPlanListParams =
                FinancialAccountInstallmentPlanListParams.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPage> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountInstallmentPlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountInstallmentPlanListParams
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountInstallmentPlanListPage> =
            list(
                financialAccountToken,
                FinancialAccountInstallmentPlanListParams.none(),
                requestOptions,
            )
    }
}
