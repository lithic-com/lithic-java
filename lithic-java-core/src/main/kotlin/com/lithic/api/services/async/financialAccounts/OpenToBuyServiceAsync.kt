// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountOpenToBuyRetrieveParams
import com.lithic.api.models.OpenToBuy
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface OpenToBuyServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenToBuyServiceAsync

    /**
     * Get the funds available for card spend backed by a given Security Account, along with the
     * balances that amount is derived from.
     *
     * Open to buy is the amount Lithic authorizes card spend against. It is not a stored balance,
     * so it is recalculated on every request from the Security Account, the funds held against
     * spend Lithic has already paid out to the networks on your behalf, and the spend that has not
     * yet been collected. The accounts that feed the calculation depend on your program setup, so
     * `summary.settled_funds` is `null` outside Commercial Charge.
     *
     * Supported for Commercial Charge, Dynamic Reserve, and Secured Charge programs. Returns `404`
     * if `financial_account_token` is not a Security Account you own, or if your program setup does
     * not use an open to buy calculation.
     */
    fun retrieve(financialAccountToken: String): CompletableFuture<OpenToBuy> =
        retrieve(financialAccountToken, FinancialAccountOpenToBuyRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountOpenToBuyRetrieveParams =
            FinancialAccountOpenToBuyRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenToBuy> =
        retrieve(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountOpenToBuyRetrieveParams =
            FinancialAccountOpenToBuyRetrieveParams.none(),
    ): CompletableFuture<OpenToBuy> = retrieve(financialAccountToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountOpenToBuyRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<OpenToBuy>

    /** @see retrieve */
    fun retrieve(params: FinancialAccountOpenToBuyRetrieveParams): CompletableFuture<OpenToBuy> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<OpenToBuy> =
        retrieve(
            financialAccountToken,
            FinancialAccountOpenToBuyRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [OpenToBuyServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenToBuyServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/open_to_buy`, but is otherwise the same
         * as [OpenToBuyServiceAsync.retrieve].
         */
        fun retrieve(financialAccountToken: String): CompletableFuture<HttpResponseFor<OpenToBuy>> =
            retrieve(financialAccountToken, FinancialAccountOpenToBuyRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountOpenToBuyRetrieveParams =
                FinancialAccountOpenToBuyRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenToBuy>> =
            retrieve(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountOpenToBuyRetrieveParams =
                FinancialAccountOpenToBuyRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<OpenToBuy>> =
            retrieve(financialAccountToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountOpenToBuyRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<OpenToBuy>>

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountOpenToBuyRetrieveParams
        ): CompletableFuture<HttpResponseFor<OpenToBuy>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<OpenToBuy>> =
            retrieve(
                financialAccountToken,
                FinancialAccountOpenToBuyRetrieveParams.none(),
                requestOptions,
            )
    }
}
