// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountBalanceListPageAsync
import com.lithic.api.models.FinancialAccountBalanceListParams
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialAccountBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountBalanceListPageAsync>

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/balances`, but is otherwise the same as
         * [BalanceServiceAsync.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: FinancialAccountBalanceListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>>
    }
}
