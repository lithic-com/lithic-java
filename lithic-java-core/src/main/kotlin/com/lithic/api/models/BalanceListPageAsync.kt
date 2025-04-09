// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.BalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Get the balances for a program, business, or a given end-user account */
class BalanceListPageAsync
private constructor(
    private val balancesService: BalanceServiceAsync,
    private val params: BalanceListParams,
    private val response: BalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BalanceListPageResponse = response

    /**
     * Delegates to [BalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [BalanceListPageResponse.data]
     */
    fun data(): List<Balance> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [BalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BalanceListPageAsync && balancesService == other.balancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balancesService, params, response) /* spotless:on */

    override fun toString() =
        "BalanceListPageAsync{balancesService=$balancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<BalanceListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<BalanceListPageAsync>> {
        return getNextPageParams()
            .map { balancesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            balancesService: BalanceServiceAsync,
            params: BalanceListParams,
            response: BalanceListPageResponse,
        ) = BalanceListPageAsync(balancesService, params, response)
    }

    class AutoPager(private val firstPage: BalanceListPageAsync) {

        fun forEach(action: Predicate<Balance>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BalanceListPageAsync>>.forEach(
                action: (Balance) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Balance>> {
            val values = mutableListOf<Balance>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
