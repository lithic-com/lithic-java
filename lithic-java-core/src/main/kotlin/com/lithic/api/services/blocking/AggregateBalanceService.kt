// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AggregateBalanceListPage
import com.lithic.api.models.AggregateBalanceListParams

interface AggregateBalanceService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the aggregated balance across all end-user accounts by financial account type */
    @JvmOverloads
    fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AggregateBalanceListPage

    /** Get the aggregated balance across all end-user accounts by financial account type */
    fun list(requestOptions: RequestOptions): AggregateBalanceListPage =
        list(AggregateBalanceListParams.none(), requestOptions)

    /**
     * A view of [AggregateBalanceService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/aggregate_balances`, but is otherwise the same
         * as [AggregateBalanceService.list].
         */
        @JvmOverloads
        @MustBeClosed
        fun list(
            params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AggregateBalanceListPage>

        /**
         * Returns a raw HTTP response for `get /v1/aggregate_balances`, but is otherwise the same
         * as [AggregateBalanceService.list].
         */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AggregateBalanceListPage> =
            list(AggregateBalanceListParams.none(), requestOptions)
    }
}
