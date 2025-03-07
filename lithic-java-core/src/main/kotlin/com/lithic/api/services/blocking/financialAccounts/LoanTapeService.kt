// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountLoanTapeListPage
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import com.lithic.api.models.FinancialAccountLoanTapeRetrieveParams
import com.lithic.api.models.LoanTape

interface LoanTapeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get a specific loan tape for a given financial account. */
    fun retrieve(params: FinancialAccountLoanTapeRetrieveParams): LoanTape =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): LoanTape

    /** List the loan tapes for a given financial account. */
    fun list(params: FinancialAccountLoanTapeListParams): FinancialAccountLoanTapeListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FinancialAccountLoanTapeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FinancialAccountLoanTapeListPage

    /** A view of [LoanTapeService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}`, but is
         * otherwise the same as [LoanTapeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: FinancialAccountLoanTapeRetrieveParams): HttpResponseFor<LoanTape> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: FinancialAccountLoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<LoanTape>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes`, but is otherwise the same
         * as [LoanTapeService.list].
         */
        @MustBeClosed
        fun list(
            params: FinancialAccountLoanTapeListParams
        ): HttpResponseFor<FinancialAccountLoanTapeListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: FinancialAccountLoanTapeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FinancialAccountLoanTapeListPage>
    }
}
