// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentListPageAsync
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentRetryParams
import com.lithic.api.models.PaymentRetryResponse
import com.lithic.api.models.PaymentSimulateActionParams
import com.lithic.api.models.PaymentSimulateActionResponse
import com.lithic.api.models.PaymentSimulateReceiptParams
import com.lithic.api.models.PaymentSimulateReceiptResponse
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReleaseResponse
import com.lithic.api.models.PaymentSimulateReturnParams
import com.lithic.api.models.PaymentSimulateReturnResponse
import java.util.concurrent.CompletableFuture

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Initiates a payment between a financial account and an external bank account. */
    fun create(params: PaymentCreateParams): CompletableFuture<PaymentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentCreateResponse>

    /** Get the payment by token. */
    fun retrieve(params: PaymentRetrieveParams): CompletableFuture<Payment> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Payment>

    /** List all the payments for the provided search criteria. */
    fun list(): CompletableFuture<PaymentListPageAsync> = list(PaymentListParams.none())

    /** @see [list] */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentListPageAsync>

    /** @see [list] */
    fun list(
        params: PaymentListParams = PaymentListParams.none()
    ): CompletableFuture<PaymentListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentListPageAsync> =
        list(PaymentListParams.none(), requestOptions)

    /** Retry an origination which has been returned. */
    fun retry(params: PaymentRetryParams): CompletableFuture<PaymentRetryResponse> =
        retry(params, RequestOptions.none())

    /** @see [retry] */
    fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentRetryResponse>

    /** Simulate payment lifecycle event */
    fun simulateAction(
        params: PaymentSimulateActionParams
    ): CompletableFuture<PaymentSimulateActionResponse> =
        simulateAction(params, RequestOptions.none())

    /** @see [simulateAction] */
    fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateActionResponse>

    /** Simulates a receipt of a Payment. */
    fun simulateReceipt(
        params: PaymentSimulateReceiptParams
    ): CompletableFuture<PaymentSimulateReceiptResponse> =
        simulateReceipt(params, RequestOptions.none())

    /** @see [simulateReceipt] */
    fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateReceiptResponse>

    /** Simulates a release of a Payment. */
    fun simulateRelease(
        params: PaymentSimulateReleaseParams
    ): CompletableFuture<PaymentSimulateReleaseResponse> =
        simulateRelease(params, RequestOptions.none())

    /** @see [simulateRelease] */
    fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateReleaseResponse>

    /** Simulates a return of a Payment. */
    fun simulateReturn(
        params: PaymentSimulateReturnParams
    ): CompletableFuture<PaymentSimulateReturnResponse> =
        simulateReturn(params, RequestOptions.none())

    /** @see [simulateReturn] */
    fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateReturnResponse>

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/payments`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: PaymentCreateParams
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/payments/{payment_token}`, but is otherwise the
         * same as [PaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: PaymentRetrieveParams): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Payment>>

        /**
         * Returns a raw HTTP response for `get /v1/payments`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/payments/{payment_token}/retry`, but is
         * otherwise the same as [PaymentServiceAsync.retry].
         */
        @MustBeClosed
        fun retry(
            params: PaymentRetryParams
        ): CompletableFuture<HttpResponseFor<PaymentRetryResponse>> =
            retry(params, RequestOptions.none())

        /** @see [retry] */
        @MustBeClosed
        fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetryResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/{payment_token}/action`, but
         * is otherwise the same as [PaymentServiceAsync.simulateAction].
         */
        @MustBeClosed
        fun simulateAction(
            params: PaymentSimulateActionParams
        ): CompletableFuture<HttpResponseFor<PaymentSimulateActionResponse>> =
            simulateAction(params, RequestOptions.none())

        /** @see [simulateAction] */
        @MustBeClosed
        fun simulateAction(
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateActionResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/receipt`, but is otherwise
         * the same as [PaymentServiceAsync.simulateReceipt].
         */
        @MustBeClosed
        fun simulateReceipt(
            params: PaymentSimulateReceiptParams
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReceiptResponse>> =
            simulateReceipt(params, RequestOptions.none())

        /** @see [simulateReceipt] */
        @MustBeClosed
        fun simulateReceipt(
            params: PaymentSimulateReceiptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReceiptResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/release`, but is otherwise
         * the same as [PaymentServiceAsync.simulateRelease].
         */
        @MustBeClosed
        fun simulateRelease(
            params: PaymentSimulateReleaseParams
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReleaseResponse>> =
            simulateRelease(params, RequestOptions.none())

        /** @see [simulateRelease] */
        @MustBeClosed
        fun simulateRelease(
            params: PaymentSimulateReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReleaseResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/return`, but is otherwise the
         * same as [PaymentServiceAsync.simulateReturn].
         */
        @MustBeClosed
        fun simulateReturn(
            params: PaymentSimulateReturnParams
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReturnResponse>> =
            simulateReturn(params, RequestOptions.none())

        /** @see [simulateReturn] */
        @MustBeClosed
        fun simulateReturn(
            params: PaymentSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReturnResponse>>
    }
}
