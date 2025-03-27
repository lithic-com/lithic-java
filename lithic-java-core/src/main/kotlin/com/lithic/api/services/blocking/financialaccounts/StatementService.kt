// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.financialaccounts.statements.Statement
import com.lithic.api.models.financialaccounts.statements.StatementListPage
import com.lithic.api.models.financialaccounts.statements.StatementListParams
import com.lithic.api.models.financialaccounts.statements.StatementRetrieveParams
import com.lithic.api.services.blocking.financialaccounts.statements.LineItemService

interface StatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun lineItems(): LineItemService

    /** Get a specific statement for a given financial account. */
    fun retrieve(params: StatementRetrieveParams): Statement =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: StatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Statement

    /** List the statements for a given financial account. */
    fun list(params: StatementListParams): StatementListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: StatementListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): StatementListPage

    /** A view of [StatementService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun lineItems(): LineItemService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements/{statement_token}`, but is
         * otherwise the same as [StatementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: StatementRetrieveParams): HttpResponseFor<Statement> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: StatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Statement>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements`, but is otherwise the same
         * as [StatementService.list].
         */
        @MustBeClosed
        fun list(params: StatementListParams): HttpResponseFor<StatementListPage> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: StatementListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<StatementListPage>
    }
}
