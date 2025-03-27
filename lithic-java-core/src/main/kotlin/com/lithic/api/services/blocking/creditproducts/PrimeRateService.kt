// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditproducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.creditproducts.primerates.PrimeRateCreateParams
import com.lithic.api.models.creditproducts.primerates.PrimeRateRetrieveParams
import com.lithic.api.models.creditproducts.primerates.PrimeRateRetrieveResponse

interface PrimeRateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Post Credit Product Prime Rate */
    fun create(params: PrimeRateCreateParams) = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get Credit Product Prime Rates */
    fun retrieve(params: PrimeRateRetrieveParams): PrimeRateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PrimeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrimeRateRetrieveResponse

    /** A view of [PrimeRateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateService.create].
         */
        @MustBeClosed
        fun create(params: PrimeRateCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PrimeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PrimeRateRetrieveParams): HttpResponseFor<PrimeRateRetrieveResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PrimeRateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrimeRateRetrieveResponse>
    }
}
