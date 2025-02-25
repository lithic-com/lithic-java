// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.BookTransferCreateParams
import com.lithic.api.models.BookTransferListPage
import com.lithic.api.models.BookTransferListParams
import com.lithic.api.models.BookTransferResponse
import com.lithic.api.models.BookTransferRetrieveParams
import com.lithic.api.models.BookTransferReverseParams

interface BookTransferService {

    /**
     * Book transfer funds between two financial accounts or between a financial account and card
     */
    @JvmOverloads
    fun create(
        params: BookTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** Get book transfer by token */
    @JvmOverloads
    fun retrieve(
        params: BookTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse

    /** List book transfers */
    @JvmOverloads
    fun list(
        params: BookTransferListParams = BookTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferListPage

    /** List book transfers */
    fun list(requestOptions: RequestOptions): BookTransferListPage =
        list(BookTransferListParams.none(), requestOptions)

    /** Reverse a book transfer */
    @JvmOverloads
    fun reverse(
        params: BookTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookTransferResponse
}
