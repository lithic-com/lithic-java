// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.cards.AggregateBalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Get the aggregated card balance across all end-user accounts. */
class CardAggregateBalanceListPageAsync
private constructor(
    private val aggregateBalancesService: AggregateBalanceServiceAsync,
    private val params: CardAggregateBalanceListParams,
    private val response: CardAggregateBalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardAggregateBalanceListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardAggregateBalanceListPageAsync && aggregateBalancesService == other.aggregateBalancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aggregateBalancesService, params, response) /* spotless:on */

    override fun toString() =
        "CardAggregateBalanceListPageAsync{aggregateBalancesService=$aggregateBalancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<CardAggregateBalanceListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<CardAggregateBalanceListPageAsync>> {
        return getNextPageParams()
            .map { aggregateBalancesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            aggregateBalancesService: AggregateBalanceServiceAsync,
            params: CardAggregateBalanceListParams,
            response: CardAggregateBalanceListPageResponse,
        ) = CardAggregateBalanceListPageAsync(aggregateBalancesService, params, response)
    }

    class AutoPager(private val firstPage: CardAggregateBalanceListPageAsync) {

        fun forEach(
            action: Predicate<AggregateBalanceListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CardAggregateBalanceListPageAsync>>.forEach(
                action: (AggregateBalanceListResponse) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<AggregateBalanceListResponse>> {
            val values = mutableListOf<AggregateBalanceListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
