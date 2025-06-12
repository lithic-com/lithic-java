// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Transfer
import com.lithic.api.models.TransferCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferServiceAsync

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
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/transfer`, but is otherwise the same as
         * [TransferServiceAsync.create].
         */
        @Deprecated("deprecated")
        fun create(params: TransferCreateParams): CompletableFuture<HttpResponseFor<Transfer>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @Deprecated("deprecated")
        fun create(
            params: TransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transfer>>
    }
}
