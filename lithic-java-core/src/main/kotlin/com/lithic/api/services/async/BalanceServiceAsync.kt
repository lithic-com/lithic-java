// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.balances.BalanceListPageAsync
import com.lithic.api.models.balances.BalanceListParams
import java.util.concurrent.CompletableFuture

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Get the balances for a program, business, or a given end-user account */
    fun list(): CompletableFuture<BalanceListPageAsync> = list(BalanceListParams.none())

    /** @see [list] */
    fun list(
        params: BalanceListParams = BalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceListPageAsync>

    /** @see [list] */
    fun list(
        params: BalanceListParams = BalanceListParams.none()
    ): CompletableFuture<BalanceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<BalanceListPageAsync> =
        list(BalanceListParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /v1/balances`, but is otherwise the same as
         * [BalanceServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(BalanceListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BalanceListParams = BalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: BalanceListParams = BalanceListParams.none()
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(BalanceListParams.none(), requestOptions)
    }
}
