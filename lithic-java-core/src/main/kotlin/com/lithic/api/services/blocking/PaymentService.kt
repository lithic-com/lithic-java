// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.payments.Payment
import com.lithic.api.models.payments.PaymentCreateParams
import com.lithic.api.models.payments.PaymentCreateResponse
import com.lithic.api.models.payments.PaymentListPage
import com.lithic.api.models.payments.PaymentListParams
import com.lithic.api.models.payments.PaymentRetrieveParams
import com.lithic.api.models.payments.PaymentRetryParams
import com.lithic.api.models.payments.PaymentRetryResponse
import com.lithic.api.models.payments.PaymentSimulateActionParams
import com.lithic.api.models.payments.PaymentSimulateActionResponse
import com.lithic.api.models.payments.PaymentSimulateReceiptParams
import com.lithic.api.models.payments.PaymentSimulateReceiptResponse
import com.lithic.api.models.payments.PaymentSimulateReleaseParams
import com.lithic.api.models.payments.PaymentSimulateReleaseResponse
import com.lithic.api.models.payments.PaymentSimulateReturnParams
import com.lithic.api.models.payments.PaymentSimulateReturnResponse

interface PaymentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Initiates a payment between a financial account and an external bank account. */
    fun create(params: PaymentCreateParams): PaymentCreateResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentCreateResponse

    /** Get the payment by token. */
    fun retrieve(params: PaymentRetrieveParams): Payment = retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Payment

    /** List all the payments for the provided search criteria. */
    fun list(): PaymentListPage = list(PaymentListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentListPage

    /** @see [list] */
    fun list(params: PaymentListParams = PaymentListParams.none()): PaymentListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): PaymentListPage =
        list(PaymentListParams.none(), requestOptions)

    /** Retry an origination which has been returned. */
    fun retry(params: PaymentRetryParams): PaymentRetryResponse =
        retry(params, RequestOptions.none())

    /** @see [retry] */
    fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentRetryResponse

    /** Simulate payment lifecycle event */
    fun simulateAction(params: PaymentSimulateActionParams): PaymentSimulateActionResponse =
        simulateAction(params, RequestOptions.none())

    /** @see [simulateAction] */
    fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateActionResponse

    /** Simulates a receipt of a Payment. */
    fun simulateReceipt(params: PaymentSimulateReceiptParams): PaymentSimulateReceiptResponse =
        simulateReceipt(params, RequestOptions.none())

    /** @see [simulateReceipt] */
    fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReceiptResponse

    /** Simulates a release of a Payment. */
    fun simulateRelease(params: PaymentSimulateReleaseParams): PaymentSimulateReleaseResponse =
        simulateRelease(params, RequestOptions.none())

    /** @see [simulateRelease] */
    fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReleaseResponse

    /** Simulates a return of a Payment. */
    fun simulateReturn(params: PaymentSimulateReturnParams): PaymentSimulateReturnResponse =
        simulateReturn(params, RequestOptions.none())

    /** @see [simulateReturn] */
    fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PaymentSimulateReturnResponse

    /** A view of [PaymentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/payments`, but is otherwise the same as
         * [PaymentService.create].
         */
        @MustBeClosed
        fun create(params: PaymentCreateParams): HttpResponseFor<PaymentCreateResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentCreateResponse>

        /**
         * Returns a raw HTTP response for `get /v1/payments/{payment_token}`, but is otherwise the
         * same as [PaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PaymentRetrieveParams): HttpResponseFor<Payment> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Payment>

        /**
         * Returns a raw HTTP response for `get /v1/payments`, but is otherwise the same as
         * [PaymentService.list].
         */
        @MustBeClosed fun list(): HttpResponseFor<PaymentListPage> = list(PaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): HttpResponseFor<PaymentListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<PaymentListPage> =
            list(PaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/payments/{payment_token}/retry`, but is
         * otherwise the same as [PaymentService.retry].
         */
        @MustBeClosed
        fun retry(params: PaymentRetryParams): HttpResponseFor<PaymentRetryResponse> =
            retry(params, RequestOptions.none())

        /** @see [retry] */
        @MustBeClosed
        fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentRetryResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/{payment_token}/action`, but
         * is otherwise the same as [PaymentService.simulateAction].
         */
        @MustBeClosed
        fun simulateAction(
            params: PaymentSimulateActionParams
        ): HttpResponseFor<PaymentSimulateActionResponse> =
            simulateAction(params, RequestOptions.none())

        /** @see [simulateAction] */
        @MustBeClosed
        fun simulateAction(
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateActionResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/receipt`, but is otherwise
         * the same as [PaymentService.simulateReceipt].
         */
        @MustBeClosed
        fun simulateReceipt(
            params: PaymentSimulateReceiptParams
        ): HttpResponseFor<PaymentSimulateReceiptResponse> =
            simulateReceipt(params, RequestOptions.none())

        /** @see [simulateReceipt] */
        @MustBeClosed
        fun simulateReceipt(
            params: PaymentSimulateReceiptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReceiptResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/release`, but is otherwise
         * the same as [PaymentService.simulateRelease].
         */
        @MustBeClosed
        fun simulateRelease(
            params: PaymentSimulateReleaseParams
        ): HttpResponseFor<PaymentSimulateReleaseResponse> =
            simulateRelease(params, RequestOptions.none())

        /** @see [simulateRelease] */
        @MustBeClosed
        fun simulateRelease(
            params: PaymentSimulateReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReleaseResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/return`, but is otherwise the
         * same as [PaymentService.simulateReturn].
         */
        @MustBeClosed
        fun simulateReturn(
            params: PaymentSimulateReturnParams
        ): HttpResponseFor<PaymentSimulateReturnResponse> =
            simulateReturn(params, RequestOptions.none())

        /** @see [simulateReturn] */
        @MustBeClosed
        fun simulateReturn(
            params: PaymentSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PaymentSimulateReturnResponse>
    }
}
