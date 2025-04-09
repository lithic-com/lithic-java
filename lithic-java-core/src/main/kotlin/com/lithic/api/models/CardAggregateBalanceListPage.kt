// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.cards.AggregateBalanceService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get the aggregated card balance across all end-user accounts. */
class CardAggregateBalanceListPage
private constructor(
    private val aggregateBalancesService: AggregateBalanceService,
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

        return /* spotless:off */ other is CardAggregateBalanceListPage && aggregateBalancesService == other.aggregateBalancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(aggregateBalancesService, params, response) /* spotless:on */

    override fun toString() =
        "CardAggregateBalanceListPage{aggregateBalancesService=$aggregateBalancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<CardAggregateBalanceListParams> = Optional.empty()

    fun getNextPage(): Optional<CardAggregateBalanceListPage> {
        return getNextPageParams().map { aggregateBalancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            aggregateBalancesService: AggregateBalanceService,
            params: CardAggregateBalanceListParams,
            response: CardAggregateBalanceListPageResponse,
        ) = CardAggregateBalanceListPage(aggregateBalancesService, params, response)
    }

    class AutoPager(private val firstPage: CardAggregateBalanceListPage) :
        Iterable<AggregateBalanceListResponse> {

        override fun iterator(): Iterator<AggregateBalanceListResponse> = iterator {
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

        fun stream(): Stream<AggregateBalanceListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
