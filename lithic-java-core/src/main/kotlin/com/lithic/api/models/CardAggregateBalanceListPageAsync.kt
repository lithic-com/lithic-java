// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [AggregateBalanceServiceAsync.list] */
class CardAggregateBalanceListPageAsync
private constructor(
    private val service: AggregateBalanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardAggregateBalanceListParams,
    private val response: CardAggregateBalanceListPageResponse,
) : PageAsync<AggregateBalanceListResponse> {

    /**
     * Delegates to [CardAggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardAggregateBalanceListPageResponse.data]
     */
    fun data(): List<AggregateBalanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardAggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardAggregateBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<AggregateBalanceListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CardAggregateBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<CardAggregateBalanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AggregateBalanceListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CardAggregateBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardAggregateBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardAggregateBalanceListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardAggregateBalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: AggregateBalanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardAggregateBalanceListParams? = null
        private var response: CardAggregateBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardAggregateBalanceListPageAsync: CardAggregateBalanceListPageAsync) =
            apply {
                service = cardAggregateBalanceListPageAsync.service
                streamHandlerExecutor = cardAggregateBalanceListPageAsync.streamHandlerExecutor
                params = cardAggregateBalanceListPageAsync.params
                response = cardAggregateBalanceListPageAsync.response
            }

        fun service(service: AggregateBalanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CardAggregateBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardAggregateBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardAggregateBalanceListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardAggregateBalanceListPageAsync =
            CardAggregateBalanceListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardAggregateBalanceListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CardAggregateBalanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
