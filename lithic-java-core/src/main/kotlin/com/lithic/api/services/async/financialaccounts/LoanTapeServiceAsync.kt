// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialaccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.financialaccounts.loantapes.LoanTape
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeListPageAsync
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeListParams
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeRetrieveParams
import java.util.concurrent.CompletableFuture

interface LoanTapeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a specific loan tape for a given financial account. */
    fun retrieve(params: LoanTapeRetrieveParams): CompletableFuture<LoanTape> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: LoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoanTape>

    /** List the loan tapes for a given financial account. */
    fun list(params: LoanTapeListParams): CompletableFuture<LoanTapeListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: LoanTapeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoanTapeListPageAsync>

    /**
     * A view of [LoanTapeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}`, but is
         * otherwise the same as [LoanTapeServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: LoanTapeRetrieveParams): CompletableFuture<HttpResponseFor<LoanTape>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: LoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoanTape>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes`, but is otherwise the same
         * as [LoanTapeServiceAsync.list].
         */
        @MustBeClosed
        fun list(
            params: LoanTapeListParams
        ): CompletableFuture<HttpResponseFor<LoanTapeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: LoanTapeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoanTapeListPageAsync>>
    }
}
