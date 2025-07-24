// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountStatementListPage
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import com.lithic.api.models.Statement
import com.lithic.api.services.blocking.financialAccounts.statements.LineItemService
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

    fun lineItems(): LineItemService

    /** Get a specific statement for a given financial account. */
    fun retrieve(
        statementToken: String,
        params: FinancialAccountStatementRetrieveParams,
    ): Statement = retrieve(statementToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        statementToken: String,
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Statement =
        retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(params: FinancialAccountStatementRetrieveParams): Statement =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Statement

    /** List the statements for a given financial account. */
    fun list(financialAccountToken: String): FinancialAccountStatementListPage =
        list(financialAccountToken, FinancialAccountStatementListParams.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountStatementListParams = FinancialAccountStatementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountStatementListPage =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountStatementListParams = FinancialAccountStatementListParams.none(),
    ): FinancialAccountStatementListPage =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FinancialAccountStatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountStatementListPage

    /** @see list */
    fun list(params: FinancialAccountStatementListParams): FinancialAccountStatementListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): FinancialAccountStatementListPage =
        list(financialAccountToken, FinancialAccountStatementListParams.none(), requestOptions)

    /** A view of [StatementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementService.WithRawResponse

        fun lineItems(): LineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements/{statement_token}`, but is
         * otherwise the same as [StatementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            statementToken: String,
            params: FinancialAccountStatementRetrieveParams,
        ): HttpResponseFor<Statement> = retrieve(statementToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            statementToken: String,
            params: FinancialAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Statement> =
            retrieve(params.toBuilder().statementToken(statementToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: FinancialAccountStatementRetrieveParams): HttpResponseFor<Statement> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Statement>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements`, but is otherwise the same
         * as [StatementService.list].
         */
        @MustBeClosed
        fun list(
            financialAccountToken: String
        ): HttpResponseFor<FinancialAccountStatementListPage> =
            list(financialAccountToken, FinancialAccountStatementListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountStatementListParams =
                FinancialAccountStatementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountStatementListPage> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            params: FinancialAccountStatementListParams = FinancialAccountStatementListParams.none(),
        ): HttpResponseFor<FinancialAccountStatementListPage> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountStatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountStatementListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountStatementListParams
        ): HttpResponseFor<FinancialAccountStatementListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountStatementListPage> =
            list(financialAccountToken, FinancialAccountStatementListParams.none(), requestOptions)
    }
}
