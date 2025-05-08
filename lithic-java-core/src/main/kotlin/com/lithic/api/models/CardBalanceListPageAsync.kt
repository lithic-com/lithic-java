// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.cards.BalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [BalanceServiceAsync.list] */
class CardBalanceListPageAsync
private constructor(
    private val service: BalanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardBalanceListParams,
    private val response: CardBalanceListPageResponse,
) : PageAsync<BalanceListResponse> {

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardBalanceListPageResponse.data]
     */
    fun data(): List<BalanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<BalanceListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CardBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<CardBalanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BalanceListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CardBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardBalanceListPageAsync].
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

    /** A builder for [CardBalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardBalanceListParams? = null
        private var response: CardBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardBalanceListPageAsync: CardBalanceListPageAsync) = apply {
            service = cardBalanceListPageAsync.service
            streamHandlerExecutor = cardBalanceListPageAsync.streamHandlerExecutor
            params = cardBalanceListPageAsync.params
            response = cardBalanceListPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CardBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardBalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardBalanceListPageAsync].
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
        fun build(): CardBalanceListPageAsync =
            CardBalanceListPageAsync(
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

        return /* spotless:off */ other is CardBalanceListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "CardBalanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
