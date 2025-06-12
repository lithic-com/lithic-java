// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPage
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams
import java.util.function.Consumer

interface BookTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BookTransferService

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    fun create(params: BookTransferCreateParams): BookTransferResponse =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** Get book transfer by token */
    fun retrieve(bookTransferToken: String): BookTransferResponse =
        retrieve(bookTransferToken, BookTransferRetrieveParams.none())

    /** @see [retrieve] */
    fun retrieve(
        bookTransferToken: String,
        params: BookTransferRetrieveParams = BookTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse =
        retrieve(params.toBuilder().bookTransferToken(bookTransferToken).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        bookTransferToken: String,
        params: BookTransferRetrieveParams = BookTransferRetrieveParams.none(),
    ): BookTransferResponse = retrieve(bookTransferToken, params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** @see [retrieve] */
    fun retrieve(params: BookTransferRetrieveParams): BookTransferResponse =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(bookTransferToken: String, requestOptions: RequestOptions): BookTransferResponse =
        retrieve(bookTransferToken, BookTransferRetrieveParams.none(), requestOptions)

    /** List book transfers */
    fun list(): BookTransferListPage = list(BookTransferListParams.none())

    /** @see [list] */
    fun list(
        params: BookTransferListParams = BookTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferListPage

    /** @see [list] */
    fun list(params: BookTransferListParams = BookTransferListParams.none()): BookTransferListPage =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BookTransferListPage =
        list(BookTransferListParams.none(), requestOptions)

    /** Reverse a book transfer */
    fun reverse(bookTransferToken: String): BookTransferResponse =
        reverse(bookTransferToken, BookTransferReverseParams.none())

    /** @see [reverse] */
    fun reverse(
        bookTransferToken: String,
        params: BookTransferReverseParams = BookTransferReverseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse =
        reverse(params.toBuilder().bookTransferToken(bookTransferToken).build(), requestOptions)

    /** @see [reverse] */
    fun reverse(
        bookTransferToken: String,
        params: BookTransferReverseParams = BookTransferReverseParams.none(),
    ): BookTransferResponse = reverse(bookTransferToken, params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** @see [reverse] */
    fun reverse(params: BookTransferReverseParams): BookTransferResponse =
        reverse(params, RequestOptions.none())

    /** @see [reverse] */
    fun reverse(bookTransferToken: String, requestOptions: RequestOptions): BookTransferResponse =
        reverse(bookTransferToken, BookTransferReverseParams.none(), requestOptions)

    /**
     * A view of [BookTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BookTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/book_transfers`, but is otherwise the same as
         * [BookTransferService.create].
         */
        @MustBeClosed
        fun create(params: BookTransferCreateParams): HttpResponseFor<BookTransferResponse> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: BookTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers/{book_transfer_token}`, but is
         * otherwise the same as [BookTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(bookTransferToken: String): HttpResponseFor<BookTransferResponse> =
            retrieve(bookTransferToken, BookTransferRetrieveParams.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookTransferToken: String,
            params: BookTransferRetrieveParams = BookTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse> =
            retrieve(
                params.toBuilder().bookTransferToken(bookTransferToken).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookTransferToken: String,
            params: BookTransferRetrieveParams = BookTransferRetrieveParams.none(),
        ): HttpResponseFor<BookTransferResponse> =
            retrieve(bookTransferToken, params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: BookTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(params: BookTransferRetrieveParams): HttpResponseFor<BookTransferResponse> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            bookTransferToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> =
            retrieve(bookTransferToken, BookTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/book_transfers`, but is otherwise the same as
         * [BookTransferService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<BookTransferListPage> = list(BookTransferListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookTransferListParams = BookTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BookTransferListParams = BookTransferListParams.none()
        ): HttpResponseFor<BookTransferListPage> = list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BookTransferListPage> =
            list(BookTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/book_transfers/{book_transfer_token}/reverse`,
         * but is otherwise the same as [BookTransferService.reverse].
         */
        @MustBeClosed
        fun reverse(bookTransferToken: String): HttpResponseFor<BookTransferResponse> =
            reverse(bookTransferToken, BookTransferReverseParams.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            bookTransferToken: String,
            params: BookTransferReverseParams = BookTransferReverseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse> =
            reverse(params.toBuilder().bookTransferToken(bookTransferToken).build(), requestOptions)

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            bookTransferToken: String,
            params: BookTransferReverseParams = BookTransferReverseParams.none(),
        ): HttpResponseFor<BookTransferResponse> =
            reverse(bookTransferToken, params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            params: BookTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookTransferResponse>

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(params: BookTransferReverseParams): HttpResponseFor<BookTransferResponse> =
            reverse(params, RequestOptions.none())

        /** @see [reverse] */
        @MustBeClosed
        fun reverse(
            bookTransferToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookTransferResponse> =
            reverse(bookTransferToken, BookTransferReverseParams.none(), requestOptions)
    }
}
