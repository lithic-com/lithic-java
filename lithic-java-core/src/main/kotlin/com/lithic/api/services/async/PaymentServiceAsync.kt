// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
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

    /** Initiates a payment between a financial account and an external bank account. */
    @JvmOverloads
    fun create(
        params: PaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentCreateResponse>

    /** Get the payment by token. */
    @JvmOverloads
    fun retrieve(
        params: PaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Payment>

    /** List all the payments for the provided search criteria. */
    @JvmOverloads
    fun list(
        params: PaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentListPageAsync>

    /** Retry an origination which has been returned. */
    @JvmOverloads
    fun retry(
        params: PaymentRetryParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentRetryResponse>

    /** Simulate payment lifecycle event */
    @JvmOverloads
    fun simulateAction(
        params: PaymentSimulateActionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentSimulateActionResponse>

    /** Simulates a receipt of a Payment. */
    @JvmOverloads
    fun simulateReceipt(
        params: PaymentSimulateReceiptParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentSimulateReceiptResponse>

    /** Simulates a release of a Payment. */
    @JvmOverloads
    fun simulateRelease(
        params: PaymentSimulateReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentSimulateReleaseResponse>

    /** Simulates a return of a Payment. */
    @JvmOverloads
    fun simulateReturn(
        params: PaymentSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<PaymentSimulateReturnResponse>
}
