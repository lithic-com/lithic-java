// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import com.lithic.api.models.ExtendedCredit

interface ExtendedCreditService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the extended credit for a given credit product under a program */
    fun retrieve(creditProductToken: String): ExtendedCredit =
        retrieve(creditProductToken, CreditProductExtendedCreditRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        creditProductToken: String,
        params: CreditProductExtendedCreditRetrieveParams =
            CreditProductExtendedCreditRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtendedCredit =
        retrieve(params.toBuilder().creditProductToken(creditProductToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        creditProductToken: String,
        params: CreditProductExtendedCreditRetrieveParams =
            CreditProductExtendedCreditRetrieveParams.none(),
    ): ExtendedCredit = retrieve(creditProductToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtendedCredit

    /** @see [retrieve] */
    fun retrieve(params: CreditProductExtendedCreditRetrieveParams): ExtendedCredit =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(creditProductToken: String, requestOptions: RequestOptions): ExtendedCredit =
        retrieve(
            creditProductToken,
            CreditProductExtendedCreditRetrieveParams.none(),
            requestOptions,
        )

    /**
     * A view of [ExtendedCreditService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/extended_credit`, but is otherwise the same as
         * [ExtendedCreditService.retrieve].
         */
        @MustBeClosed
        fun retrieve(creditProductToken: String): HttpResponseFor<ExtendedCredit> =
            retrieve(creditProductToken, CreditProductExtendedCreditRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String,
            params: CreditProductExtendedCreditRetrieveParams =
                CreditProductExtendedCreditRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtendedCredit> =
            retrieve(
                params.toBuilder().creditProductToken(creditProductToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String,
            params: CreditProductExtendedCreditRetrieveParams =
                CreditProductExtendedCreditRetrieveParams.none(),
        ): HttpResponseFor<ExtendedCredit> =
            retrieve(creditProductToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtendedCredit>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams
        ): HttpResponseFor<ExtendedCredit> = retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            creditProductToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtendedCredit> =
            retrieve(
                creditProductToken,
                CreditProductExtendedCreditRetrieveParams.none(),
                requestOptions,
            )
    }
}
