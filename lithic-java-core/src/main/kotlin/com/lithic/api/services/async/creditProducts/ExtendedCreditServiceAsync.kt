// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditProducts

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import com.lithic.api.models.ExtendedCredit
import java.util.concurrent.CompletableFuture

interface ExtendedCreditServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the extended credit for a given credit product under a program */
    fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams
    ): CompletableFuture<ExtendedCredit> = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExtendedCredit>

    /**
     * A view of [ExtendedCreditServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/extended_credit`, but is otherwise the same as
         * [ExtendedCreditServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>>
    }
}
