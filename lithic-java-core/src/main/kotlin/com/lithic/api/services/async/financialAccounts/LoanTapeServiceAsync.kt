// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountLoanTapeListPageAsync
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import com.lithic.api.models.FinancialAccountLoanTapeRetrieveParams
import com.lithic.api.models.LoanTape
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface LoanTapeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LoanTapeServiceAsync

    /** Get a specific loan tape for a given financial account. */
    fun retrieve(
        loanTapeToken: String,
        params: FinancialAccountLoanTapeRetrieveParams,
    ): CompletableFuture<LoanTape> = retrieve(loanTapeToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        loanTapeToken: String,
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoanTape> =
        retrieve(params.toBuilder().loanTapeToken(loanTapeToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(params: FinancialAccountLoanTapeRetrieveParams): CompletableFuture<LoanTape> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<LoanTape>

    /** List the loan tapes for a given financial account. */
    fun list(
        financialAccountToken: String
    ): CompletableFuture<FinancialAccountLoanTapeListPageAsync> =
        list(financialAccountToken, FinancialAccountLoanTapeListParams.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountLoanTapeListParams = FinancialAccountLoanTapeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountLoanTapeListPageAsync> =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        params: FinancialAccountLoanTapeListParams = FinancialAccountLoanTapeListParams.none(),
    ): CompletableFuture<FinancialAccountLoanTapeListPageAsync> =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see [list] */
    fun list(
        params: FinancialAccountLoanTapeListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountLoanTapeListPageAsync>

    /** @see [list] */
    fun list(
        params: FinancialAccountLoanTapeListParams
    ): CompletableFuture<FinancialAccountLoanTapeListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountLoanTapeListPageAsync> =
        list(financialAccountToken, FinancialAccountLoanTapeListParams.none(), requestOptions)

    /**
     * A view of [LoanTapeServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LoanTapeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}`, but is
         * otherwise the same as [LoanTapeServiceAsync.retrieve].
         */
        fun retrieve(
            loanTapeToken: String,
            params: FinancialAccountLoanTapeRetrieveParams,
        ): CompletableFuture<HttpResponseFor<LoanTape>> =
            retrieve(loanTapeToken, params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            loanTapeToken: String,
            params: FinancialAccountLoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoanTape>> =
            retrieve(params.toBuilder().loanTapeToken(loanTapeToken).build(), requestOptions)

        /** @see [retrieve] */
        fun retrieve(
            params: FinancialAccountLoanTapeRetrieveParams
        ): CompletableFuture<HttpResponseFor<LoanTape>> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        fun retrieve(
            params: FinancialAccountLoanTapeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<LoanTape>>

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/loan_tapes`, but is otherwise the same
         * as [LoanTapeServiceAsync.list].
         */
        fun list(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccountLoanTapeListPageAsync>> =
            list(financialAccountToken, FinancialAccountLoanTapeListParams.none())

        /** @see [list] */
        fun list(
            financialAccountToken: String,
            params: FinancialAccountLoanTapeListParams = FinancialAccountLoanTapeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountLoanTapeListPageAsync>> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see [list] */
        fun list(
            financialAccountToken: String,
            params: FinancialAccountLoanTapeListParams = FinancialAccountLoanTapeListParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountLoanTapeListPageAsync>> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see [list] */
        fun list(
            params: FinancialAccountLoanTapeListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountLoanTapeListPageAsync>>

        /** @see [list] */
        fun list(
            params: FinancialAccountLoanTapeListParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountLoanTapeListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountLoanTapeListPageAsync>> =
            list(financialAccountToken, FinancialAccountLoanTapeListParams.none(), requestOptions)
    }
}
