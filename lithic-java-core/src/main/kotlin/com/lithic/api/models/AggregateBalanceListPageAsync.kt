// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.AggregateBalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Get the aggregated balance across all end-user accounts by financial account type */
class AggregateBalanceListPageAsync
private constructor(
    private val aggregateBalancesService: AggregateBalanceServiceAsync,
    private val params: AggregateBalanceListParams,
    private val response: AggregateBalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AggregateBalanceListPageResponse = response

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregateBalanceListPageResponse.data]
     */
    fun data(): List<AggregateBalance> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregateBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregateBalanceListPageAsync && aggregateBalancesService == other.aggregateBalancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aggregateBalancesService, params, response) /* spotless:on */

    override fun toString() =
        "AggregateBalanceListPageAsync{aggregateBalancesService=$aggregateBalancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AggregateBalanceListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<AggregateBalanceListPageAsync>> {
        return getNextPageParams()
            .map { aggregateBalancesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            aggregateBalancesService: AggregateBalanceServiceAsync,
            params: AggregateBalanceListParams,
            response: AggregateBalanceListPageResponse,
        ) = AggregateBalanceListPageAsync(aggregateBalancesService, params, response)
    }

    class AutoPager(private val firstPage: AggregateBalanceListPageAsync) {

        fun forEach(
            action: Predicate<AggregateBalance>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AggregateBalanceListPageAsync>>.forEach(
                action: (AggregateBalance) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AggregateBalance>> {
            val values = mutableListOf<AggregateBalance>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
