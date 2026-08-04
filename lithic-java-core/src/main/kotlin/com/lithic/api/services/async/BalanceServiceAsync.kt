// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BalanceListPageAsync
import com.lithic.api.models.BalanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BalanceServiceAsync

    /** Get the balances for a program, business, or a given end-user account */
    fun list(): CompletableFuture<BalanceListPageAsync> = list(BalanceListParams.none())

    /** @see list */
    fun list(
        params: BalanceListParams = BalanceListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BalanceListPageAsync>

    /** @see list */
    fun list(
        params: BalanceListParams = BalanceListParams.none()
    ): CompletableFuture<BalanceListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<BalanceListPageAsync> =
        list(BalanceListParams.none(), requestOptions)

    /**
     * A view of [BalanceServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/balances`, but is otherwise the same as
         * [BalanceServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(BalanceListParams.none())

        /** @see list */
        fun list(
            params: BalanceListParams = BalanceListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>>

        /** @see list */
        fun list(
            params: BalanceListParams = BalanceListParams.none()
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<BalanceListPageAsync>> =
            list(BalanceListParams.none(), requestOptions)
    }
}
