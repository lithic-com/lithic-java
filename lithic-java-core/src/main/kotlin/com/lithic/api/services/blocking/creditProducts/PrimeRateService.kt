// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CreditProductPrimeRateCreateParams
import com.lithic.api.models.CreditProductPrimeRateRetrieveParams
import com.lithic.api.models.PrimeRateRetrieveResponse

interface PrimeRateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Post Credit Product Prime Rate */
    fun create(params: CreditProductPrimeRateCreateParams) = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get Credit Product Prime Rates */
    fun retrieve(params: CreditProductPrimeRateRetrieveParams): PrimeRateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditProductPrimeRateRetrieveParams,
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
        fun create(params: CreditProductPrimeRateCreateParams): HttpResponse =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CreditProductPrimeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CreditProductPrimeRateRetrieveParams
        ): HttpResponseFor<PrimeRateRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditProductPrimeRateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrimeRateRetrieveResponse>
    }
}
