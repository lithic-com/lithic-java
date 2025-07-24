// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditProducts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import com.lithic.api.models.ExtendedCredit
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface ExtendedCreditServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtendedCreditServiceAsync

    /** Get the extended credit for a given credit product under a program */
    fun retrieve(creditProductToken: String): CompletableFuture<ExtendedCredit> =
        retrieve(creditProductToken, CreditProductExtendedCreditRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        creditProductToken: String,
        params: CreditProductExtendedCreditRetrieveParams =
            CreditProductExtendedCreditRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtendedCredit> =
        retrieve(params.toBuilder().creditProductToken(creditProductToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        creditProductToken: String,
        params: CreditProductExtendedCreditRetrieveParams =
            CreditProductExtendedCreditRetrieveParams.none(),
    ): CompletableFuture<ExtendedCredit> =
        retrieve(creditProductToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtendedCredit>

    /** @see retrieve */
    fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams
    ): CompletableFuture<ExtendedCredit> = retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        creditProductToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtendedCredit> =
        retrieve(
            creditProductToken,
            CreditProductExtendedCreditRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [ExtendedCreditServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtendedCreditServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/extended_credit`, but is otherwise the same as
         * [ExtendedCreditServiceAsync.retrieve].
         */
        fun retrieve(
            creditProductToken: String
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>> =
            retrieve(creditProductToken, CreditProductExtendedCreditRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            creditProductToken: String,
            params: CreditProductExtendedCreditRetrieveParams =
                CreditProductExtendedCreditRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>> =
            retrieve(
                params.toBuilder().creditProductToken(creditProductToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        fun retrieve(
            creditProductToken: String,
            params: CreditProductExtendedCreditRetrieveParams =
                CreditProductExtendedCreditRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>> =
            retrieve(creditProductToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>>

        /** @see retrieve */
        fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            creditProductToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>> =
            retrieve(
                creditProductToken,
                CreditProductExtendedCreditRetrieveParams.none(),
                requestOptions,
            )
    }
}
