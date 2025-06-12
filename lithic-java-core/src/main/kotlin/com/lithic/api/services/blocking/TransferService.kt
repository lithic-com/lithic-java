// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Transfer
import com.lithic.api.models.TransferCreateParams
import java.util.function.Consumer

interface TransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferService

    /** Transfer funds between two financial accounts or between a financial account and card */
    @Deprecated("deprecated")
    fun create(params: TransferCreateParams): Transfer = create(params, RequestOptions.none())

    /** @see [create] */
    @Deprecated("deprecated")
    fun create(
        params: TransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transfer

    /** A view of [TransferService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/transfer`, but is otherwise the same as
         * [TransferService.create].
         */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(params: TransferCreateParams): HttpResponseFor<Transfer> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @Deprecated("deprecated")
        @MustBeClosed
        fun create(
            params: TransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transfer>
    }
}
