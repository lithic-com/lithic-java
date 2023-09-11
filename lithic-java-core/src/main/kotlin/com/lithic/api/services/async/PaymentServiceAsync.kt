@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Payment
import com.lithic.api.models.PaymentCreateParams
import com.lithic.api.models.PaymentCreateResponse
import com.lithic.api.models.PaymentListPageAsync
import com.lithic.api.models.PaymentListParams
import com.lithic.api.models.PaymentRetrieveParams
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
