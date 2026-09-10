// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentCreateStablecoinParams
import com.lithic.api.models.PaymentCreateStablecoinResponse
import com.lithic.api.models.PaymentListPageAsync
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
import com.lithic.api.models.PaymentRetryParams
import com.lithic.api.models.PaymentRetryResponse
import com.lithic.api.models.PaymentReturnParams
import com.lithic.api.models.PaymentSimulateActionParams
import com.lithic.api.models.PaymentSimulateActionResponse
import com.lithic.api.models.PaymentSimulateReceiptParams
import com.lithic.api.models.PaymentSimulateReceiptResponse
import com.lithic.api.models.PaymentSimulateReleaseParams
import com.lithic.api.models.PaymentSimulateReleaseResponse
import com.lithic.api.models.PaymentSimulateReturnParams
import com.lithic.api.models.PaymentSimulateReturnResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface PaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): PaymentServiceAsync

    /**
     * Initiates an ACH payment between a financial account and an external bank account.
     *
     * This endpoint originates on the ACH rail only. To send a stablecoin payout, use the
     * [Create stablecoin payment](https://docs.lithic.com/reference/createstablecoinpayment)
     * endpoint. Payments on every rail are read back through
     * [List payments](https://docs.lithic.com/reference/searchpayments).
     */
    fun create(params: PaymentCreateParams): CompletableFuture<PaymentCreateResponse> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentCreateResponse>

    /** Get the payment by token. */
    fun retrieve(paymentToken: String): CompletableFuture<Payment> =
        retrieve(paymentToken, PaymentRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        paymentToken: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Payment> =
        retrieve(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        paymentToken: String,
        params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
    ): CompletableFuture<Payment> = retrieve(paymentToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Payment>

    /** @see retrieve */
    fun retrieve(params: PaymentRetrieveParams): CompletableFuture<Payment> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(paymentToken: String, requestOptions: RequestOptions): CompletableFuture<Payment> =
        retrieve(paymentToken, PaymentRetrieveParams.none(), requestOptions)

    /** List all the payments for the provided search criteria. */
    fun list(): CompletableFuture<PaymentListPageAsync> = list(PaymentListParams.none())

    /** @see list */
    fun list(
        params: PaymentListParams = PaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentListPageAsync>

    /** @see list */
    fun list(
        params: PaymentListParams = PaymentListParams.none()
    ): CompletableFuture<PaymentListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<PaymentListPageAsync> =
        list(PaymentListParams.none(), requestOptions)

    /**
     * Initiates a stablecoin payout from a financial account to a registered blockchain recipient.
     *
     * The recipient must have been registered with
     * [Create blockchain recipient](https://docs.lithic.com/reference/createblockchainrecipient)
     * and have completed address screening — only a recipient in the `ENABLED` verification state
     * can receive a payout. The destination address and chain come from the recipient, so they are
     * not supplied here.
     *
     * Only payouts are initiated through this endpoint. Stablecoin pay-ins are credited from
     * on-chain deposits to a financial account's deposit address and are not created through the
     * API. Funds are placed on hold when the payout is initiated, and a payout that fails on chain
     * reverses that hold. A payout cannot be cancelled once it has been submitted on chain.
     *
     * This endpoint is only available to stablecoin-enabled programs. Contact your customer success
     * manager to learn more.
     */
    fun createStablecoin(
        params: PaymentCreateStablecoinParams
    ): CompletableFuture<PaymentCreateStablecoinResponse> =
        createStablecoin(params, RequestOptions.none())

    /** @see createStablecoin */
    fun createStablecoin(
        params: PaymentCreateStablecoinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentCreateStablecoinResponse>

    /** Retry an origination which has been returned. */
    fun retry(paymentToken: String): CompletableFuture<PaymentRetryResponse> =
        retry(paymentToken, PaymentRetryParams.none())

    /** @see retry */
    fun retry(
        paymentToken: String,
        params: PaymentRetryParams = PaymentRetryParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentRetryResponse> =
        retry(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see retry */
    fun retry(
        paymentToken: String,
        params: PaymentRetryParams = PaymentRetryParams.none(),
    ): CompletableFuture<PaymentRetryResponse> = retry(paymentToken, params, RequestOptions.none())

    /** @see retry */
    fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentRetryResponse>

    /** @see retry */
    fun retry(params: PaymentRetryParams): CompletableFuture<PaymentRetryResponse> =
        retry(params, RequestOptions.none())

    /** @see retry */
    fun retry(
        paymentToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<PaymentRetryResponse> =
        retry(paymentToken, PaymentRetryParams.none(), requestOptions)

    /**
     * Return an ACH payment with a specified return reason code. Returns must be initiated within
     * the time window specified by NACHA rules for each return code (typically 2 banking days for
     * most codes, 60 calendar days for unauthorized debits). For a complete list of return codes
     * and their meanings, see the
     * [ACH Return Reasons documentation](https://docs.lithic.com/docs/ach-overview#ach-return-reasons).
     *
     * Note:
     * * This endpoint does not modify the state of the financial account associated with the
     *   payment. If you would like to change the account state, use the
     *   [Update financial account status](https://docs.lithic.com/reference/updatefinancialaccountstatus)
     *   endpoint.
     * * By default this endpoint is not enabled for your account. Please contact your
     *   implementations manager to enable this feature.
     */
    fun return_(paymentToken: String, params: PaymentReturnParams): CompletableFuture<Payment> =
        return_(paymentToken, params, RequestOptions.none())

    /** @see return_ */
    fun return_(
        paymentToken: String,
        params: PaymentReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Payment> =
        return_(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see return_ */
    fun return_(params: PaymentReturnParams): CompletableFuture<Payment> =
        return_(params, RequestOptions.none())

    /** @see return_ */
    fun return_(
        params: PaymentReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Payment>

    /** Simulate payment lifecycle event */
    fun simulateAction(
        paymentToken: String,
        params: PaymentSimulateActionParams,
    ): CompletableFuture<PaymentSimulateActionResponse> =
        simulateAction(paymentToken, params, RequestOptions.none())

    /** @see simulateAction */
    fun simulateAction(
        paymentToken: String,
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateActionResponse> =
        simulateAction(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

    /** @see simulateAction */
    fun simulateAction(
        params: PaymentSimulateActionParams
    ): CompletableFuture<PaymentSimulateActionResponse> =
        simulateAction(params, RequestOptions.none())

    /** @see simulateAction */
    fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateActionResponse>

    /** Simulates a receipt of a Payment. */
    fun simulateReceipt(
        params: PaymentSimulateReceiptParams
    ): CompletableFuture<PaymentSimulateReceiptResponse> =
        simulateReceipt(params, RequestOptions.none())

    /** @see simulateReceipt */
    fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateReceiptResponse>

    /** Simulates a release of a Payment. */
    fun simulateRelease(
        params: PaymentSimulateReleaseParams
    ): CompletableFuture<PaymentSimulateReleaseResponse> =
        simulateRelease(params, RequestOptions.none())

    /** @see simulateRelease */
    fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateReleaseResponse>

    /** Simulates a return of a Payment. */
    fun simulateReturn(
        params: PaymentSimulateReturnParams
    ): CompletableFuture<PaymentSimulateReturnResponse> =
        simulateReturn(params, RequestOptions.none())

    /** @see simulateReturn */
    fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<PaymentSimulateReturnResponse>

    /**
     * A view of [PaymentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): PaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/payments`, but is otherwise the same as
         * [PaymentServiceAsync.create].
         */
        fun create(
            params: PaymentCreateParams
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: PaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/payments/{payment_token}`, but is otherwise the
         * same as [PaymentServiceAsync.retrieve].
         */
        fun retrieve(paymentToken: String): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(paymentToken, PaymentRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            paymentToken: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            paymentToken: String,
            params: PaymentRetrieveParams = PaymentRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(paymentToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: PaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Payment>>

        /** @see retrieve */
        fun retrieve(params: PaymentRetrieveParams): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            paymentToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Payment>> =
            retrieve(paymentToken, PaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/payments`, but is otherwise the same as
         * [PaymentServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none())

        /** @see list */
        fun list(
            params: PaymentListParams = PaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>>

        /** @see list */
        fun list(
            params: PaymentListParams = PaymentListParams.none()
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<PaymentListPageAsync>> =
            list(PaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/payments/stablecoin`, but is otherwise the same
         * as [PaymentServiceAsync.createStablecoin].
         */
        fun createStablecoin(
            params: PaymentCreateStablecoinParams
        ): CompletableFuture<HttpResponseFor<PaymentCreateStablecoinResponse>> =
            createStablecoin(params, RequestOptions.none())

        /** @see createStablecoin */
        fun createStablecoin(
            params: PaymentCreateStablecoinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentCreateStablecoinResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/payments/{payment_token}/retry`, but is
         * otherwise the same as [PaymentServiceAsync.retry].
         */
        fun retry(paymentToken: String): CompletableFuture<HttpResponseFor<PaymentRetryResponse>> =
            retry(paymentToken, PaymentRetryParams.none())

        /** @see retry */
        fun retry(
            paymentToken: String,
            params: PaymentRetryParams = PaymentRetryParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetryResponse>> =
            retry(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see retry */
        fun retry(
            paymentToken: String,
            params: PaymentRetryParams = PaymentRetryParams.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetryResponse>> =
            retry(paymentToken, params, RequestOptions.none())

        /** @see retry */
        fun retry(
            params: PaymentRetryParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentRetryResponse>>

        /** @see retry */
        fun retry(
            params: PaymentRetryParams
        ): CompletableFuture<HttpResponseFor<PaymentRetryResponse>> =
            retry(params, RequestOptions.none())

        /** @see retry */
        fun retry(
            paymentToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<PaymentRetryResponse>> =
            retry(paymentToken, PaymentRetryParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/payments/{payment_token}/return`, but is
         * otherwise the same as [PaymentServiceAsync.return_].
         */
        fun return_(
            paymentToken: String,
            params: PaymentReturnParams,
        ): CompletableFuture<HttpResponseFor<Payment>> =
            return_(paymentToken, params, RequestOptions.none())

        /** @see return_ */
        fun return_(
            paymentToken: String,
            params: PaymentReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Payment>> =
            return_(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see return_ */
        fun return_(params: PaymentReturnParams): CompletableFuture<HttpResponseFor<Payment>> =
            return_(params, RequestOptions.none())

        /** @see return_ */
        fun return_(
            params: PaymentReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Payment>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/{payment_token}/action`, but
         * is otherwise the same as [PaymentServiceAsync.simulateAction].
         */
        fun simulateAction(
            paymentToken: String,
            params: PaymentSimulateActionParams,
        ): CompletableFuture<HttpResponseFor<PaymentSimulateActionResponse>> =
            simulateAction(paymentToken, params, RequestOptions.none())

        /** @see simulateAction */
        fun simulateAction(
            paymentToken: String,
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateActionResponse>> =
            simulateAction(params.toBuilder().paymentToken(paymentToken).build(), requestOptions)

        /** @see simulateAction */
        fun simulateAction(
            params: PaymentSimulateActionParams
        ): CompletableFuture<HttpResponseFor<PaymentSimulateActionResponse>> =
            simulateAction(params, RequestOptions.none())

        /** @see simulateAction */
        fun simulateAction(
            params: PaymentSimulateActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateActionResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/receipt`, but is otherwise
         * the same as [PaymentServiceAsync.simulateReceipt].
         */
        fun simulateReceipt(
            params: PaymentSimulateReceiptParams
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReceiptResponse>> =
            simulateReceipt(params, RequestOptions.none())

        /** @see simulateReceipt */
        fun simulateReceipt(
            params: PaymentSimulateReceiptParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReceiptResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/release`, but is otherwise
         * the same as [PaymentServiceAsync.simulateRelease].
         */
        fun simulateRelease(
            params: PaymentSimulateReleaseParams
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReleaseResponse>> =
            simulateRelease(params, RequestOptions.none())

        /** @see simulateRelease */
        fun simulateRelease(
            params: PaymentSimulateReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReleaseResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/payments/return`, but is otherwise the
         * same as [PaymentServiceAsync.simulateReturn].
         */
        fun simulateReturn(
            params: PaymentSimulateReturnParams
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReturnResponse>> =
            simulateReturn(params, RequestOptions.none())

        /** @see simulateReturn */
        fun simulateReturn(
            params: PaymentSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<PaymentSimulateReturnResponse>>
    }
}
