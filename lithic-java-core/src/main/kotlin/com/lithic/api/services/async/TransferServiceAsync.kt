// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Transfer
import com.lithic.api.models.TransferCreateParams
import java.util.concurrent.CompletableFuture

interface TransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Transfer funds between two financial accounts or between a financial account and card */
    @Deprecated("deprecated")
    fun create(params: TransferCreateParams): CompletableFuture<Transfer> =
        create(params, RequestOptions.none())

    /** @see [create] */
    @Deprecated("deprecated")
    fun create(
        params: TransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transfer>

    /**
     * A view of [TransferServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/transfer`, but is otherwise the same as
         * [TransferServiceAsync.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: TransferCreateParams): CompletableFuture<HttpResponseFor<Transfer>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: TransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transfer>>
    }
}
