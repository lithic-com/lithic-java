// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.AggregateBalanceService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get the aggregated balance across all end-user accounts by financial account type */
class AggregateBalanceListPage
private constructor(
    private val aggregateBalancesService: AggregateBalanceService,
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

        return /* spotless:off */ other is AggregateBalanceListPage && aggregateBalancesService == other.aggregateBalancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aggregateBalancesService, params, response) /* spotless:on */

    override fun toString() =
        "AggregateBalanceListPage{aggregateBalancesService=$aggregateBalancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AggregateBalanceListParams> = Optional.empty()

    fun getNextPage(): Optional<AggregateBalanceListPage> {
        return getNextPageParams().map { aggregateBalancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            aggregateBalancesService: AggregateBalanceService,
            params: AggregateBalanceListParams,
            response: AggregateBalanceListPageResponse,
        ) = AggregateBalanceListPage(aggregateBalancesService, params, response)
    }

    class AutoPager(private val firstPage: AggregateBalanceListPage) : Iterable<AggregateBalance> {

        override fun iterator(): Iterator<AggregateBalance> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<AggregateBalance> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
