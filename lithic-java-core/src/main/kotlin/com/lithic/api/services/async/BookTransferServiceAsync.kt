// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.booktransfers.BookTransferCreateParams
import com.lithic.api.models.booktransfers.BookTransferListPageAsync
import com.lithic.api.models.booktransfers.BookTransferListParams
import com.lithic.api.models.booktransfers.BookTransferResponse
import com.lithic.api.models.booktransfers.BookTransferRetrieveParams
import com.lithic.api.models.booktransfers.BookTransferReverseParams
import java.util.concurrent.CompletableFuture

interface BookTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    fun create(params: BookTransferCreateParams): CompletableFuture<BookTransferResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookTransferResponse>

    /** Get book transfer by token */
    fun retrieve(params: BookTransferRetrieveParams): CompletableFuture<BookTransferResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookTransferResponse>

    /** List book transfers */
    fun list(): CompletableFuture<BookTransferListPageAsync> = list(BookTransferListParams.none())

    /** @see [list] */
    fun list(
        params: BookTransferListParams = BookTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookTransferListPageAsync>

    /** @see [list] */
    fun list(
        params: BookTransferListParams = BookTransferListParams.none()
    ): CompletableFuture<BookTransferListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BookTransferListPageAsync> =
        list(BookTransferListParams.none(), requestOptions)

    /** Reverse a book transfer */
    fun reverse(params: BookTransferReverseParams): CompletableFuture<BookTransferResponse> =
        reverse(params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BookTransferResponse>

    /**
     * A view of [BookTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /v1/book_transfers`, but is otherwise the same as
         * [BookTransferServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: BookTransferCreateParams
        ): CompletableFuture<HttpResponseFor<BookTransferResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BookTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookTransferResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers/{book_transfer_token}`, but is
         * otherwise the same as [BookTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BookTransferRetrieveParams
        ): CompletableFuture<HttpResponseFor<BookTransferResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BookTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookTransferResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers`, but is otherwise the same as
         * [BookTransferServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<BookTransferListPageAsync>> =
            list(BookTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookTransferListParams = BookTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookTransferListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookTransferListParams = BookTransferListParams.none()
        ): CompletableFuture<HttpResponseFor<BookTransferListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BookTransferListPageAsync>> =
            list(BookTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/book_transfers/{book_transfer_token}/reverse`,
         * but is otherwise the same as [BookTransferServiceAsync.reverse].
         */
        @MustBeClosed
        fun reverse(
            params: BookTransferReverseParams
        ): CompletableFuture<HttpResponseFor<BookTransferResponse>> =
            reverse(params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: BookTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BookTransferResponse>>
    }
}
