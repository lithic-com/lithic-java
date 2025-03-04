// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ExternalPayment
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentListPage
import com.lithic.api.models.ExternalPaymentListParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams

interface ExternalPaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create external payment */
    @JvmOverloads
    fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Get external payment */
    @JvmOverloads
    fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** List external payments */
    @JvmOverloads
    fun list(
        params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPaymentListPage

    /** List external payments */
    fun list(requestOptions: RequestOptions): ExternalPaymentListPage =
        list(ExternalPaymentListParams.none(), requestOptions)

    /** Cancel external payment */
    @JvmOverloads
    fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Release external payment */
    @JvmOverloads
    fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Reverse external payment */
    @JvmOverloads
    fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Settle external payment */
    @JvmOverloads
    fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /**
     * A view of [ExternalPaymentService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/external_payments`, but is otherwise the same
         * as [ExternalPaymentService.create].
         */
        @JvmOverloads
        @MustBeClosed
        fun create(
            params: ExternalPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `get /v1/external_payments/{external_payment_token}`, but
         * is otherwise the same as [ExternalPaymentService.retrieve].
         */
        @JvmOverloads
        @MustBeClosed
        fun retrieve(
            params: ExternalPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `get /v1/external_payments`, but is otherwise the same as
         * [ExternalPaymentService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPaymentListPage>

        /**
         * Returns a raw HTTP response for `get /v1/external_payments`, but is otherwise the same as
         * [ExternalPaymentService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalPaymentListPage> =
            list(ExternalPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/cancel`, but is otherwise the same as
         * [ExternalPaymentService.cancel].
         */
        @JvmOverloads
        @MustBeClosed
        fun cancel(
            params: ExternalPaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/release`, but is otherwise the same as
         * [ExternalPaymentService.release].
         */
        @JvmOverloads
        @MustBeClosed
        fun release(
            params: ExternalPaymentReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/reverse`, but is otherwise the same as
         * [ExternalPaymentService.reverse].
         */
        @JvmOverloads
        @MustBeClosed
        fun reverse(
            params: ExternalPaymentReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/settle`, but is otherwise the same as
         * [ExternalPaymentService.settle].
         */
        @JvmOverloads
        @MustBeClosed
        fun settle(
            params: ExternalPaymentSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>
    }
}
