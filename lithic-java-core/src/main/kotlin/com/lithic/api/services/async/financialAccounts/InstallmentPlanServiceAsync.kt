// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountInstallmentPlanListPageAsync
import com.lithic.api.models.FinancialAccountInstallmentPlanListParams
import com.lithic.api.models.FinancialAccountInstallmentPlanRetrieveParams
import com.lithic.api.models.InstallmentPlan
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface InstallmentPlanServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): InstallmentPlanServiceAsync

    /** Get a specific installment plan for a given financial account. */
    fun retrieve(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanRetrieveParams,
    ): CompletableFuture<InstallmentPlan> =
        retrieve(installmentPlanToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        installmentPlanToken: String,
        params: FinancialAccountInstallmentPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstallmentPlan> =
        retrieve(
            params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInstallmentPlanRetrieveParams
    ): CompletableFuture<InstallmentPlan> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountInstallmentPlanRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<InstallmentPlan>

    /** List the installment plans for a given financial account. */
    fun list(
        financialAccountToken: String
    ): CompletableFuture<FinancialAccountInstallmentPlanListPageAsync> =
        list(financialAccountToken, FinancialAccountInstallmentPlanListParams.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountInstallmentPlanListParams =
            FinancialAccountInstallmentPlanListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountInstallmentPlanListPageAsync> =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountInstallmentPlanListParams =
            FinancialAccountInstallmentPlanListParams.none(),
    ): CompletableFuture<FinancialAccountInstallmentPlanListPageAsync> =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FinancialAccountInstallmentPlanListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountInstallmentPlanListPageAsync>

    /** @see list */
    fun list(
        params: FinancialAccountInstallmentPlanListParams
    ): CompletableFuture<FinancialAccountInstallmentPlanListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountInstallmentPlanListPageAsync> =
        list(
            financialAccountToken,
            FinancialAccountInstallmentPlanListParams.none(),
            requestOptions,
        )

    /**
     * A view of [InstallmentPlanServiceAsync] that provides access to raw HTTP responses for each
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
        ): InstallmentPlanServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans/{installment_plan_token}`,
         * but is otherwise the same as [InstallmentPlanServiceAsync.retrieve].
         */
        fun retrieve(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanRetrieveParams,
        ): CompletableFuture<HttpResponseFor<InstallmentPlan>> =
            retrieve(installmentPlanToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            installmentPlanToken: String,
            params: FinancialAccountInstallmentPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstallmentPlan>> =
            retrieve(
                params.toBuilder().installmentPlanToken(installmentPlanToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountInstallmentPlanRetrieveParams
        ): CompletableFuture<HttpResponseFor<InstallmentPlan>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountInstallmentPlanRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<InstallmentPlan>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/installment_plans`, but is otherwise the
         * same as [InstallmentPlanServiceAsync.list].
         */
        fun list(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync>> =
            list(financialAccountToken, FinancialAccountInstallmentPlanListParams.none())

        /** @see list */
        fun list(
            financialAccountToken: String,
            params: FinancialAccountInstallmentPlanListParams =
                FinancialAccountInstallmentPlanListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync>> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        fun list(
            financialAccountToken: String,
            params: FinancialAccountInstallmentPlanListParams =
                FinancialAccountInstallmentPlanListParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync>> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: FinancialAccountInstallmentPlanListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync>>

        /** @see list */
        fun list(
            params: FinancialAccountInstallmentPlanListParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountInstallmentPlanListPageAsync>> =
            list(
                financialAccountToken,
                FinancialAccountInstallmentPlanListParams.none(),
                requestOptions,
            )
    }
}
