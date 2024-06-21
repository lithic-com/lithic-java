// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPageAsync
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams
import java.util.concurrent.CompletableFuture

interface BookTransferServiceAsync {

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    @JvmOverloads
    fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookTransferResponse>

    /** Get book transfer by token */
    @JvmOverloads
    fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookTransferResponse>

    /** List book transfers */
    @JvmOverloads
    fun list(
        params: BookTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookTransferListPageAsync>

    /** Reverse a book transfer */
    @JvmOverloads
    fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<BookTransferResponse>
}
