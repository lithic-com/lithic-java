// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.CardBulkOrderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CardBulkOrderServiceAsync.list */
class CardBulkOrderListPageAsync
private constructor(
    private val service: CardBulkOrderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardBulkOrderListParams,
    private val response: CardBulkOrderListPageResponse,
) : PageAsync<CardBulkOrder> {

    /**
     * Delegates to [CardBulkOrderListPageResponse], but gracefully handles missing data.
     *
     * @see CardBulkOrderListPageResponse.data
     */
    fun data(): List<CardBulkOrder> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardBulkOrderListPageResponse], but gracefully handles missing data.
     *
     * @see CardBulkOrderListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<CardBulkOrder> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CardBulkOrderListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<CardBulkOrderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardBulkOrder> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CardBulkOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardBulkOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardBulkOrderListPageAsync].
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

    /** A builder for [CardBulkOrderListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardBulkOrderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardBulkOrderListParams? = null
        private var response: CardBulkOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardBulkOrderListPageAsync: CardBulkOrderListPageAsync) = apply {
            service = cardBulkOrderListPageAsync.service
            streamHandlerExecutor = cardBulkOrderListPageAsync.streamHandlerExecutor
            params = cardBulkOrderListPageAsync.params
            response = cardBulkOrderListPageAsync.response
        }

        fun service(service: CardBulkOrderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CardBulkOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardBulkOrderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardBulkOrderListPageAsync].
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
        fun build(): CardBulkOrderListPageAsync =
            CardBulkOrderListPageAsync(
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

        return other is CardBulkOrderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CardBulkOrderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
