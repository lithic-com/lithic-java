// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking.financialAccounts.statements

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.FinancialAccountStatementLineItemListPage
import com.lithic.api.models.FinancialAccountStatementLineItemListParams

interface LineItemService {

    /** List the line items for a given statement within a given financial account. */
    @JvmOverloads
    fun list(
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): FinancialAccountStatementLineItemListPage
}
