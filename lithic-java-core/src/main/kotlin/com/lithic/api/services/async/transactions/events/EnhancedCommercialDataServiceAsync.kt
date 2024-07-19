// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async.transactions.events

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.EnhancedData
import com.lithic.api.models.TransactionEventEnhancedCommercialDataRetrieveParams
import java.util.concurrent.CompletableFuture

interface EnhancedCommercialDataServiceAsync {

    /** Get L2/L3 enhanced commercial data associated with a transaction event. */
    @JvmOverloads
    fun retrieve(
        params: TransactionEventEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<EnhancedData>
}
