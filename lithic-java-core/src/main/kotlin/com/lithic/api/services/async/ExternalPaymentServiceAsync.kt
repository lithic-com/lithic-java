// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
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

    /** Create external payment */
    @JvmOverloads
    fun create(
        params: ExternalPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** Get external payment */
    @JvmOverloads
    fun retrieve(
        params: ExternalPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** List external payments */
    @JvmOverloads
    fun list(
        params: ExternalPaymentListParams = ExternalPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPaymentListPageAsync>

    /** List external payments */
    fun list(requestOptions: RequestOptions): CompletableFuture<ExternalPaymentListPageAsync> =
        list(ExternalPaymentListParams.none(), requestOptions)

    /** Cancel external payment */
    @JvmOverloads
    fun cancel(
        params: ExternalPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** Release external payment */
    @JvmOverloads
    fun release(
        params: ExternalPaymentReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** Reverse external payment */
    @JvmOverloads
    fun reverse(
        params: ExternalPaymentReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>

    /** Settle external payment */
    @JvmOverloads
    fun settle(
        params: ExternalPaymentSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ExternalPayment>
}
