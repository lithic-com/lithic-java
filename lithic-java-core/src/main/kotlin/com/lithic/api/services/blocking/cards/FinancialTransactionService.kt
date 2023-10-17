// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.cards

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.CardFinancialTransactionListPage
import com.lithic.api.models.CardFinancialTransactionListParams
import com.lithic.api.models.CardFinancialTransactionRetrieveParams
import com.lithic.api.models.FinancialTransaction

interface FinancialTransactionService {

    /** Get the card financial transaction for the provided token. */
    @JvmOverloads
    fun retrieve(
        params: CardFinancialTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialTransaction

    /** List the financial transactions for a given card. */
    @JvmOverloads
    fun list(
        params: CardFinancialTransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardFinancialTransactionListPage
}
