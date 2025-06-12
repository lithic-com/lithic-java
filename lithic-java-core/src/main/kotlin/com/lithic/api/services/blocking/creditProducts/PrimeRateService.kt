// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CreditProductPrimeRateCreateParams
import com.lithic.api.models.CreditProductPrimeRateRetrieveParams
import com.lithic.api.models.PrimeRateRetrieveResponse
import java.util.function.Consumer

interface PrimeRateService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrimeRateService

    /** Post Credit Product Prime Rate */
    fun create(creditProductToken: String, params: CreditProductPrimeRateCreateParams) =
        create(creditProductToken, params, RequestOptions.none())

    /** @see [create] */
    fun create(
        creditProductToken: String,
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ) = create(params.toBuilder().creditProductToken(creditProductToken).build(), requestOptions)

    /** @see [create] */
    fun create(params: CreditProductPrimeRateCreateParams) = create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** Get Credit Product Prime Rates */
    fun retrieve(creditProductToken: String): PrimeRateRetrieveResponse =
        retrieve(creditProductToken, CreditProductPrimeRateRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        creditProductToken: String,
        params: CreditProductPrimeRateRetrieveParams = CreditProductPrimeRateRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrimeRateRetrieveResponse =
        retrieve(params.toBuilder().creditProductToken(creditProductToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        creditProductToken: String,
        params: CreditProductPrimeRateRetrieveParams = CreditProductPrimeRateRetrieveParams.none(),
    ): PrimeRateRetrieveResponse = retrieve(creditProductToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditProductPrimeRateRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PrimeRateRetrieveResponse

    /** @see [retrieve] */
    fun retrieve(params: CreditProductPrimeRateRetrieveParams): PrimeRateRetrieveResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        creditProductToken: String,
        requestOptions: RequestOptions,
    ): PrimeRateRetrieveResponse =
        retrieve(creditProductToken, CreditProductPrimeRateRetrieveParams.none(), requestOptions)

    /** A view of [PrimeRateService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): PrimeRateService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/credit_products/{credit_product_token}/prime_rates`, but is otherwise the same as
         * [PrimeRateService.create].
         */
        @MustBeClosed
        fun create(
            creditProductToken: String,
            params: CreditProductPrimeRateCreateParams,
        ): HttpResponse = create(creditProductToken, params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            creditProductToken: String,
            params: CreditProductPrimeRateCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            create(
                params.toBuilder().creditProductToken(creditProductToken).build(),
                requestOptions,
            )

        /** @see [create] */
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
        fun retrieve(creditProductToken: String): HttpResponseFor<PrimeRateRetrieveResponse> =
            retrieve(creditProductToken, CreditProductPrimeRateRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String,
            params: CreditProductPrimeRateRetrieveParams =
                CreditProductPrimeRateRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrimeRateRetrieveResponse> =
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
        ): HttpResponseFor<PrimeRateRetrieveResponse> =
            retrieve(creditProductToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditProductPrimeRateRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PrimeRateRetrieveResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditProductPrimeRateRetrieveParams
        ): HttpResponseFor<PrimeRateRetrieveResponse> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PrimeRateRetrieveResponse> =
            retrieve(
                creditProductToken,
                CreditProductPrimeRateRetrieveParams.none(),
                requestOptions,
            )
    }
}
