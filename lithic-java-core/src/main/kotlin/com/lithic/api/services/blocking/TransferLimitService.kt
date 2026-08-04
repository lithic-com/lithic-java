// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.TransferLimitListPage
import com.lithic.api.models.TransferLimitListParams
import java.util.function.Consumer

interface TransferLimitService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransferLimitService

    /** Get transfer limits for a specified date */
    fun list(): TransferLimitListPage = list(TransferLimitListParams.none())

    /** @see list */
    fun list(
        params: TransferLimitListParams = TransferLimitListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransferLimitListPage

    /** @see list */
    fun list(
        params: TransferLimitListParams = TransferLimitListParams.none()
    ): TransferLimitListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TransferLimitListPage =
        list(TransferLimitListParams.none(), requestOptions)

    /**
     * A view of [TransferLimitService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransferLimitService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transfer_limits`, but is otherwise the same as
         * [TransferLimitService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TransferLimitListPage> = list(TransferLimitListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransferLimitListParams = TransferLimitListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransferLimitListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransferLimitListParams = TransferLimitListParams.none()
        ): HttpResponseFor<TransferLimitListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransferLimitListPage> =
            list(TransferLimitListParams.none(), requestOptions)
    }
}
