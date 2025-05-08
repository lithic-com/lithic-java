// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountStatementListPageAsync
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import com.lithic.api.models.Statement
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync
import java.util.concurrent.CompletableFuture

interface StatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lineItems(): LineItemServiceAsync

    /** Get a specific statement for a given financial account. */
    fun retrieve(
        statementToken: String,
        params: FinancialAccountStatementRetrieveParams,
    ): CompletableFuture<Statement> = retrieve(statementToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        statementToken: String,
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Statement> =
        retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: FinancialAccountStatementRetrieveParams): CompletableFuture<Statement> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Statement>

    /** List the statements for a given financial account. */
    fun list(
        financialAccountToken: String
    ): CompletableFuture<FinancialAccountStatementListPageAsync> =
        list(financialAccountToken, FinancialAccountStatementListParams.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountStatementListParams = FinancialAccountStatementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountStatementListPageAsync> =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountStatementListParams = FinancialAccountStatementListParams.none(),
    ): CompletableFuture<FinancialAccountStatementListPageAsync> =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FinancialAccountStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountStatementListPageAsync>

    /** @see [list] */
    fun list(
        params: FinancialAccountStatementListParams
    ): CompletableFuture<FinancialAccountStatementListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountStatementListPageAsync> =
        list(financialAccountToken, FinancialAccountStatementListParams.none(), requestOptions)

    /**
     * A view of [StatementServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        fun lineItems(): LineItemServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements/{statement_token}`, but is
         * otherwise the same as [StatementServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            statementToken: String,
            params: FinancialAccountStatementRetrieveParams,
        ): CompletableFuture<HttpResponseFor<Statement>> =
            retrieve(statementToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            statementToken: String,
            params: FinancialAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Statement>> =
            retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountStatementRetrieveParams
        ): CompletableFuture<HttpResponseFor<Statement>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Statement>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements`, but is otherwise the same
         * as [StatementServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccountStatementListPageAsync>> =
            list(financialAccountToken, FinancialAccountStatementListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountStatementListParams =
                FinancialAccountStatementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountStatementListPageAsync>> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountStatementListParams = FinancialAccountStatementListParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountStatementListPageAsync>> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountStatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountStatementListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountStatementListParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountStatementListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountStatementListPageAsync>> =
            list(financialAccountToken, FinancialAccountStatementListParams.none(), requestOptions)
    }
}
