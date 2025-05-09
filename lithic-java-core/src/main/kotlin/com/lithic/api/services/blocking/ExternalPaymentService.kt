// File generated from our OpenAPI spec by Stainless.

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
    fun create(params: ExternalPaymentCreateParams): ExternalPayment =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Get external payment */
    fun retrieve(externalPaymentToken: String): ExternalPayment =
        retrieve(externalPaymentToken, ExternalPaymentRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        externalPaymentToken: String,
        params: ExternalPaymentRetrieveParams = ExternalPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        retrieve(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        externalPaymentToken: String,
        params: ExternalPaymentRetrieveParams = ExternalPaymentRetrieveParams.none(),
    ): ExternalPayment = retrieve(externalPaymentToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** @see [retrieve] */
    fun retrieve(params: ExternalPaymentRetrieveParams): ExternalPayment =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(externalPaymentToken: String, requestOptions: RequestOptions): ExternalPayment =
        retrieve(externalPaymentToken, ExternalPaymentRetrieveParams.none(), requestOptions)

    /** List external payments */
    fun list(): ExternalPaymentListPage = list(ExternalPaymentListParams.none())

    /** @see [list] */
    fun list(
        params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPaymentListPage

    /** @see [list] */
    fun list(
        params: ExternalPaymentListParams = ExternalPaymentListParams.none()
    ): ExternalPaymentListPage = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): ExternalPaymentListPage =
        list(ExternalPaymentListParams.none(), requestOptions)

    /** Cancel external payment */
    fun cancel(externalPaymentToken: String, params: ExternalPaymentCancelParams): ExternalPayment =
        cancel(externalPaymentToken, params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        externalPaymentToken: String,
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        cancel(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [cancel] */
    fun cancel(params: ExternalPaymentCancelParams): ExternalPayment =
        cancel(params, RequestOptions.none())

    /** @see [cancel] */
    fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Release external payment */
    fun release(
        externalPaymentToken: String,
        params: ExternalPaymentReleaseParams,
    ): ExternalPayment = release(externalPaymentToken, params, RequestOptions.none())

    /** @see [release] */
    fun release(
        externalPaymentToken: String,
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        release(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [release] */
    fun release(params: ExternalPaymentReleaseParams): ExternalPayment =
        release(params, RequestOptions.none())

    /** @see [release] */
    fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Reverse external payment */
    fun reverse(
        externalPaymentToken: String,
        params: ExternalPaymentReverseParams,
    ): ExternalPayment = reverse(externalPaymentToken, params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        externalPaymentToken: String,
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        reverse(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [reverse] */
    fun reverse(params: ExternalPaymentReverseParams): ExternalPayment =
        reverse(params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment

    /** Settle external payment */
    fun settle(externalPaymentToken: String, params: ExternalPaymentSettleParams): ExternalPayment =
        settle(externalPaymentToken, params, RequestOptions.none())

    /** @see [settle] */
    fun settle(
        externalPaymentToken: String,
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExternalPayment =
        settle(
            params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
            requestOptions,
        )

    /** @see [settle] */
    fun settle(params: ExternalPaymentSettleParams): ExternalPayment =
        settle(params, RequestOptions.none())

    /** @see [settle] */
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
        @MustBeClosed
        fun create(params: ExternalPaymentCreateParams): HttpResponseFor<ExternalPayment> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: ExternalPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /**
         * Returns a raw HTTP response for `get /v1/external_payments/{external_payment_token}`, but
         * is otherwise the same as [ExternalPaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(externalPaymentToken: String): HttpResponseFor<ExternalPayment> =
            retrieve(externalPaymentToken, ExternalPaymentRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            externalPaymentToken: String,
            params: ExternalPaymentRetrieveParams = ExternalPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            retrieve(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            externalPaymentToken: String,
            params: ExternalPaymentRetrieveParams = ExternalPaymentRetrieveParams.none(),
        ): HttpResponseFor<ExternalPayment> =
            retrieve(externalPaymentToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: ExternalPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: ExternalPaymentRetrieveParams): HttpResponseFor<ExternalPayment> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            externalPaymentToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExternalPayment> =
            retrieve(externalPaymentToken, ExternalPaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/external_payments`, but is otherwise the same as
         * [ExternalPaymentService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<ExternalPaymentListPage> =
            list(ExternalPaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPaymentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: ExternalPaymentListParams = ExternalPaymentListParams.none()
        ): HttpResponseFor<ExternalPaymentListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalPaymentListPage> =
            list(ExternalPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/external_payments/{external_payment_token}/cancel`, but is otherwise the same as
         * [ExternalPaymentService.cancel].
         */
        @MustBeClosed
        fun cancel(
            externalPaymentToken: String,
            params: ExternalPaymentCancelParams,
        ): HttpResponseFor<ExternalPayment> =
            cancel(externalPaymentToken, params, RequestOptions.none())

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(
            externalPaymentToken: String,
            params: ExternalPaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            cancel(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [cancel] */
        @MustBeClosed
        fun cancel(params: ExternalPaymentCancelParams): HttpResponseFor<ExternalPayment> =
            cancel(params, RequestOptions.none())

        /** @see [cancel] */
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
        @MustBeClosed
        fun release(
            externalPaymentToken: String,
            params: ExternalPaymentReleaseParams,
        ): HttpResponseFor<ExternalPayment> =
            release(externalPaymentToken, params, RequestOptions.none())

        /** @see [release] */
        @MustBeClosed
        fun release(
            externalPaymentToken: String,
            params: ExternalPaymentReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            release(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [release] */
        @MustBeClosed
        fun release(params: ExternalPaymentReleaseParams): HttpResponseFor<ExternalPayment> =
            release(params, RequestOptions.none())

        /** @see [release] */
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
        @MustBeClosed
        fun reverse(
            externalPaymentToken: String,
            params: ExternalPaymentReverseParams,
        ): HttpResponseFor<ExternalPayment> =
            reverse(externalPaymentToken, params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            externalPaymentToken: String,
            params: ExternalPaymentReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            reverse(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(params: ExternalPaymentReverseParams): HttpResponseFor<ExternalPayment> =
            reverse(params, RequestOptions.none())

        /** @see [reverse] */
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
        @MustBeClosed
        fun settle(
            externalPaymentToken: String,
            params: ExternalPaymentSettleParams,
        ): HttpResponseFor<ExternalPayment> =
            settle(externalPaymentToken, params, RequestOptions.none())

        /** @see [settle] */
        @MustBeClosed
        fun settle(
            externalPaymentToken: String,
            params: ExternalPaymentSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment> =
            settle(
                params.toBuilder().externalPaymentToken(externalPaymentToken).build(),
                requestOptions,
            )

        /** @see [settle] */
        @MustBeClosed
        fun settle(params: ExternalPaymentSettleParams): HttpResponseFor<ExternalPayment> =
            settle(params, RequestOptions.none())

        /** @see [settle] */
        @MustBeClosed
        fun settle(
            params: ExternalPaymentSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExternalPayment>
    }
}
