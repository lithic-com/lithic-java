// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts.statements

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountStatementLineItemListPage
import com.lithic.api.models.FinancialAccountStatementLineItemListParams
import java.util.function.Consumer

interface LineItemService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LineItemService

    /** List the line items for a given statement within a given financial account. */
    fun list(
        statementToken: String,
        params: FinancialAccountStatementLineItemListParams,
    ): FinancialAccountStatementLineItemListPage =
        list(statementToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        statementToken: String,
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountStatementLineItemListPage =
        list(params.toBuilder().statementToken(statementToken).build(), requestOptions)

    /** @see list */
    fun list(
        params: FinancialAccountStatementLineItemListParams
    ): FinancialAccountStatementLineItemListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountStatementLineItemListPage

    /** A view of [LineItemService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements/{statement_token}/line_items`,
         * but is otherwise the same as [LineItemService.list].
         */
        @MustBeClosed
        fun list(
            statementToken: String,
            params: FinancialAccountStatementLineItemListParams,
        ): HttpResponseFor<FinancialAccountStatementLineItemListPage> =
            list(statementToken, params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            statementToken: String,
            params: FinancialAccountStatementLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountStatementLineItemListPage> =
            list(params.toBuilder().statementToken(statementToken).build(), requestOptions)

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountStatementLineItemListParams
        ): HttpResponseFor<FinancialAccountStatementLineItemListPage> =
            list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: FinancialAccountStatementLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountStatementLineItemListPage>
    }
}
