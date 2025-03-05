// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
    @JvmOverloads
    fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExtendedCredit

    /**
     * A view of [ExtendedCreditService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /v1/credit_products/{credit_product_token}/extended_credit`, but is otherwise the same as
         * [ExtendedCreditService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExtendedCredit>
    }
}
