// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditProducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CreditProductPrimeRateCreateParams
import com.lithic.api.models.CreditProductPrimeRateRetrieveParams
import com.lithic.api.models.PrimeRateRetrieveResponse
import java.util.concurrent.CompletableFuture

interface PrimeRateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Post Credit Product Prime Rate */
    fun create(
        creditProductToken: String,
        params: CreditProductPrimeRateCreateParams,
    ): CompletableFuture<Void?> = create(creditProductToken, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        creditProductToken: String,
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        create(params.toBuilder().creditProductToken(creditProductToken).build(), requestOptions)

    /** @see [create] */
    fun create(params: CreditProductPrimeRateCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get Credit Product Prime Rates */
    fun retrieve(creditProductToken: String): CompletableFuture<PrimeRateRetrieveResponse> =
        retrieve(creditProductToken, CreditProductPrimeRateRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        creditProductToken: String,
        params: CreditProductPrimeRateRetrieveParams = CreditProductPrimeRateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrimeRateRetrieveResponse> =
        retrieve(params.toBuilder().creditProductToken(creditProductToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        creditProductToken: String,
        params: CreditProductPrimeRateRetrieveParams = CreditProductPrimeRateRetrieveParams.none(),
    ): CompletableFuture<PrimeRateRetrieveResponse> =
        retrieve(creditProductToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditProductPrimeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrimeRateRetrieveResponse>

    /** @see [retrieve] */
    fun retrieve(
        params: CreditProductPrimeRateRetrieveParams
    ): CompletableFuture<PrimeRateRetrieveResponse> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        creditProductToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PrimeRateRetrieveResponse> =
        retrieve(creditProductToken, CreditProductPrimeRateRetrieveParams.none(), requestOptions)

    /**
     * A view of [PrimeRateServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            creditProductToken: String,
            params: CreditProductPrimeRateCreateParams,
        ): CompletableFuture<HttpResponse> =
            create(creditProductToken, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            creditProductToken: String,
            params: CreditProductPrimeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            create(
                params.toBuilder().creditProductToken(creditProductToken).build(),
                requestOptions,
            )

        /** @see [create] */
        @MustBeClosed
        fun create(params: CreditProductPrimeRateCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CreditProductPrimeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String
        ): CompletableFuture<HttpResponseFor<PrimeRateRetrieveResponse>> =
            retrieve(creditProductToken, CreditProductPrimeRateRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String,
            params: CreditProductPrimeRateRetrieveParams =
                CreditProductPrimeRateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrimeRateRetrieveResponse>> =
            retrieve(
                params.toBuilder().creditProductToken(creditProductToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String,
            params: CreditProductPrimeRateRetrieveParams =
                CreditProductPrimeRateRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<PrimeRateRetrieveResponse>> =
            retrieve(creditProductToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditProductPrimeRateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrimeRateRetrieveResponse>>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditProductPrimeRateRetrieveParams
        ): CompletableFuture<HttpResponseFor<PrimeRateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PrimeRateRetrieveResponse>> =
            retrieve(
                creditProductToken,
                CreditProductPrimeRateRetrieveParams.none(),
                requestOptions,
            )
    }
}
