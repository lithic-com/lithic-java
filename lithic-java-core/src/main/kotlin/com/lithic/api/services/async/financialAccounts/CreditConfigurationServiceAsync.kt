// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountCreditConfigurationRetrieveParams
import com.lithic.api.models.FinancialAccountCreditConfigurationUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CreditConfigurationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CreditConfigurationServiceAsync

    /** Get an Account's credit configuration */
    fun retrieve(financialAccountToken: String): CompletableFuture<FinancialAccountCreditConfig> =
        retrieve(financialAccountToken, FinancialAccountCreditConfigurationRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountCreditConfigurationRetrieveParams =
            FinancialAccountCreditConfigurationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountCreditConfig> =
        retrieve(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        params: FinancialAccountCreditConfigurationRetrieveParams =
            FinancialAccountCreditConfigurationRetrieveParams.none(),
    ): CompletableFuture<FinancialAccountCreditConfig> =
        retrieve(financialAccountToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountCreditConfigurationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountCreditConfig>

    /** @see retrieve */
    fun retrieve(
        params: FinancialAccountCreditConfigurationRetrieveParams
    ): CompletableFuture<FinancialAccountCreditConfig> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountCreditConfig> =
        retrieve(
            financialAccountToken,
            FinancialAccountCreditConfigurationRetrieveParams.none(),
            requestOptions,
        )

    /** Update an account's credit configuration */
    fun update(financialAccountToken: String): CompletableFuture<FinancialAccountCreditConfig> =
        update(financialAccountToken, FinancialAccountCreditConfigurationUpdateParams.none())

    /** @see update */
    fun update(
        financialAccountToken: String,
        params: FinancialAccountCreditConfigurationUpdateParams =
            FinancialAccountCreditConfigurationUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountCreditConfig> =
        update(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see update */
    fun update(
        financialAccountToken: String,
        params: FinancialAccountCreditConfigurationUpdateParams =
            FinancialAccountCreditConfigurationUpdateParams.none(),
    ): CompletableFuture<FinancialAccountCreditConfig> =
        update(financialAccountToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        params: FinancialAccountCreditConfigurationUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<FinancialAccountCreditConfig>

    /** @see update */
    fun update(
        params: FinancialAccountCreditConfigurationUpdateParams
    ): CompletableFuture<FinancialAccountCreditConfig> = update(params, RequestOptions.none())

    /** @see update */
    fun update(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountCreditConfig> =
        update(
            financialAccountToken,
            FinancialAccountCreditConfigurationUpdateParams.none(),
            requestOptions,
        )

    /**
     * A view of [CreditConfigurationServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CreditConfigurationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationServiceAsync.retrieve].
         */
        fun retrieve(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            retrieve(
                financialAccountToken,
                FinancialAccountCreditConfigurationRetrieveParams.none(),
            )

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountCreditConfigurationRetrieveParams =
                FinancialAccountCreditConfigurationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            retrieve(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            params: FinancialAccountCreditConfigurationRetrieveParams =
                FinancialAccountCreditConfigurationRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            retrieve(financialAccountToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountCreditConfigurationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>>

        /** @see retrieve */
        fun retrieve(
            params: FinancialAccountCreditConfigurationRetrieveParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            retrieve(
                financialAccountToken,
                FinancialAccountCreditConfigurationRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `patch
         * /v1/financial_accounts/{financial_account_token}/credit_configuration`, but is otherwise
         * the same as [CreditConfigurationServiceAsync.update].
         */
        fun update(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            update(financialAccountToken, FinancialAccountCreditConfigurationUpdateParams.none())

        /** @see update */
        fun update(
            financialAccountToken: String,
            params: FinancialAccountCreditConfigurationUpdateParams =
                FinancialAccountCreditConfigurationUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            update(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see update */
        fun update(
            financialAccountToken: String,
            params: FinancialAccountCreditConfigurationUpdateParams =
                FinancialAccountCreditConfigurationUpdateParams.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            update(financialAccountToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            params: FinancialAccountCreditConfigurationUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>>

        /** @see update */
        fun update(
            params: FinancialAccountCreditConfigurationUpdateParams
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            update(params, RequestOptions.none())

        /** @see update */
        fun update(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountCreditConfig>> =
            update(
                financialAccountToken,
                FinancialAccountCreditConfigurationUpdateParams.none(),
                requestOptions,
            )
    }
}
