// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.AggregateBalanceListPageAsync
import com.lithic.api.models.AggregateBalanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface AggregateBalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): AggregateBalanceServiceAsync

    /** Get the aggregated balance across all end-user accounts by financial account type */
    fun list(): CompletableFuture<AggregateBalanceListPageAsync> =
        list(AggregateBalanceListParams.none())

    /** @see [list] */
    fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<AggregateBalanceListPageAsync>

    /** @see [list] */
    fun list(
        params: AggregateBalanceListParams = AggregateBalanceListParams.none()
    ): CompletableFuture<AggregateBalanceListPageAsync> = list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<AggregateBalanceListPageAsync> =
        list(AggregateBalanceListParams.none(), requestOptions)

    /**
     * A view of [AggregateBalanceServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AggregateBalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/aggregate_balances`, but is otherwise the same
         * as [AggregateBalanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<AggregateBalanceListPageAsync>> =
            list(AggregateBalanceListParams.none())

        /** @see [list] */
        fun list(
            params: AggregateBalanceListParams = AggregateBalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<AggregateBalanceListPageAsync>>

        /** @see [list] */
        fun list(
            params: AggregateBalanceListParams = AggregateBalanceListParams.none()
        ): CompletableFuture<HttpResponseFor<AggregateBalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<AggregateBalanceListPageAsync>> =
            list(AggregateBalanceListParams.none(), requestOptions)
    }
}
