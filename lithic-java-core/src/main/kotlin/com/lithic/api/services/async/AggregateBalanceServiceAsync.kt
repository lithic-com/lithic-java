// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.AggregateBalanceListPageAsync
import com.lithic.api.models.AggregateBalanceListParams
import java.util.concurrent.CompletableFuture

interface AggregateBalanceServiceAsync {

    /** Get the aggregated balance across all end-user accounts by financial account type */
    @JvmOverloads
    fun list(
        params: AggregateBalanceListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregateBalanceListPageAsync>
}
