// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ExternalPayment
import com.lithic.api.models.ExternalPaymentCancelParams
import com.lithic.api.models.ExternalPaymentCreateParams
import com.lithic.api.models.ExternalPaymentListPageAsync
import com.lithic.api.models.ExternalPaymentListParams
import com.lithic.api.models.ExternalPaymentReleaseParams
import com.lithic.api.models.ExternalPaymentRetrieveParams
import com.lithic.api.models.ExternalPaymentReverseParams
import com.lithic.api.models.ExternalPaymentSettleParams
import java.util.concurrent.CompletableFuture

interface ExternalPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create external payment */
    fun create(params: ExternalPaymentCreateParams): CompletableFuture<ExternalPayment> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** Get external payment */
    fun retrieve(params: ExternalPaymentRetrieveParams): CompletableFuture<ExternalPayment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** List external payments */
    fun list(): CompletableFuture<ExternalPaymentListPageAsync> =
        list(ExternalPaymentListParams.none())

    /** @see [list] */
    fun list(
        params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPaymentListPageAsync>

    /** @see [list] */
    fun list(
        params: ExternalPaymentListParams = ExternalPaymentListParams.none()
    ): CompletableFuture<ExternalPaymentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalPaymentListPageAsync> =
        list(ExternalPaymentListParams.none(), requestOptions)

    /** Cancel external payment */
    fun cancel(params: ExternalPaymentCancelParams): CompletableFuture<ExternalPayment> =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** Release external payment */
    fun release(params: ExternalPaymentReleaseParams): CompletableFuture<ExternalPayment> =
        release(params, RequestOptions.none())

    /** @see [release] */
    fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** Reverse external payment */
    fun reverse(params: ExternalPaymentReverseParams): CompletableFuture<ExternalPayment> =
        reverse(params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** Settle external payment */
    fun settle(params: ExternalPaymentSettleParams): CompletableFuture<ExternalPayment> =
        settle(params, RequestOptions.none())

    /** @see [settle] */
    fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /**
     * A view of [ExternalPaymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/external_payments`, but is otherwise the same
         * as [ExternalPaymentServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: ExternalPaymentCreateParams
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalPayment>>

        /**
         * Returns a raw HTTP response for `get /v1/external_payments/{external_payment_token}`, but
         * is otherwise the same as [ExternalPaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: ExternalPaymentRetrieveParams
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalPayment>>

        /**
         * Returns a raw HTTP response for `get /v1/external_payments`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<ExternalPaymentListPageAsync>> =
            list(ExternalPaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalPaymentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalPaymentListParams = ExternalPaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<ExternalPaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ExternalPaymentListPageAsync>> =
            list(ExternalPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/cancel`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.cancel].
         */
        @MustBeClosed
        fun cancel(
            params: ExternalPaymentCancelParams
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            params: ExternalPaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalPayment>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/release`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.release].
         */
        @MustBeClosed
        fun release(
            params: ExternalPaymentReleaseParams
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> =
            release(params, RequestOptions.none())

        /** @see [release] */
        @MustBeClosed
        fun release(
            params: ExternalPaymentReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalPayment>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/reverse`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.reverse].
         */
        @MustBeClosed
        fun reverse(
            params: ExternalPaymentReverseParams
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> =
            reverse(params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: ExternalPaymentReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalPayment>>

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/settle`, but is otherwise the same as
         * [ExternalPaymentServiceAsync.settle].
         */
        @MustBeClosed
        fun settle(
            params: ExternalPaymentSettleParams
        ): CompletableFuture<HttpResponseFor<ExternalPayment>> =
            settle(params, RequestOptions.none())

        /** @see [settle] */
        @MustBeClosed
        fun settle(
            params: ExternalPaymentSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ExternalPayment>>
    }
}
