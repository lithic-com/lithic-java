// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.TransferLimitListPageAsync
import com.lithic.api.models.TransferLimitListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransferLimitServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferLimitServiceAsync

    /** Get transfer limits for a specified date */
    fun list(): CompletableFuture<TransferLimitListPageAsync> = list(TransferLimitListParams.none())

    /** @see list */
    fun list(
        params: TransferLimitListParams = TransferLimitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransferLimitListPageAsync>

    /** @see list */
    fun list(
        params: TransferLimitListParams = TransferLimitListParams.none()
    ): CompletableFuture<TransferLimitListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransferLimitListPageAsync> =
        list(TransferLimitListParams.none(), requestOptions)

    /**
     * A view of [TransferLimitServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransferLimitServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transfer_limits`, but is otherwise the same as
         * [TransferLimitServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransferLimitListPageAsync>> =
            list(TransferLimitListParams.none())

        /** @see list */
        fun list(
            params: TransferLimitListParams = TransferLimitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransferLimitListPageAsync>>

        /** @see list */
        fun list(
            params: TransferLimitListParams = TransferLimitListParams.none()
        ): CompletableFuture<HttpResponseFor<TransferLimitListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransferLimitListPageAsync>> =
            list(TransferLimitListParams.none(), requestOptions)
    }
}
