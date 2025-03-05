// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.financialAccounts.statements

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountStatementLineItemListPageAsync
import com.lithic.api.models.FinancialAccountStatementLineItemListParams
import java.util.concurrent.CompletableFuture

interface LineItemServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** List the line items for a given statement within a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountStatementLineItemListPageAsync>

    /**
     * A view of [LineItemServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/statements/{statement_token}/line_items`,
         * but is otherwise the same as [LineItemServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: FinancialAccountStatementLineItemListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountStatementLineItemListPageAsync>>
    }
}
