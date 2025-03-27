// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditproducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.creditproducts.primerates.PrimeRateCreateParams
import com.lithic.api.models.creditproducts.primerates.PrimeRateRetrieveParams
import com.lithic.api.models.creditproducts.primerates.PrimeRateRetrieveResponse
import java.util.concurrent.CompletableFuture

interface PrimeRateServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Post Credit Product Prime Rate */
    fun create(params: PrimeRateCreateParams): CompletableFuture<Void?> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** Get Credit Product Prime Rates */
    fun retrieve(params: PrimeRateRetrieveParams): CompletableFuture<PrimeRateRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PrimeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PrimeRateRetrieveResponse>

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
        fun create(params: PrimeRateCreateParams): CompletableFuture<HttpResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PrimeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: PrimeRateRetrieveParams
        ): CompletableFuture<HttpResponseFor<PrimeRateRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PrimeRateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PrimeRateRetrieveResponse>>
    }
}
