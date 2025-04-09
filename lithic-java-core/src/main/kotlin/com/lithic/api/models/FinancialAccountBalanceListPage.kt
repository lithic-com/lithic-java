// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.BalanceService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get the balances for a given financial account. */
class FinancialAccountBalanceListPage
private constructor(
    private val balancesService: BalanceService,
    private val params: FinancialAccountBalanceListParams,
    private val response: FinancialAccountBalanceListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FinancialAccountBalanceListPageResponse = response

    /**
     * Delegates to [FinancialAccountBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountBalanceListPageResponse.data]
     */
    fun data(): List<BalanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountBalanceListPage && balancesService == other.balancesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(balancesService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountBalanceListPage{balancesService=$balancesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialAccountBalanceListParams> = Optional.empty()

    fun getNextPage(): Optional<FinancialAccountBalanceListPage> {
        return getNextPageParams().map { balancesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            balancesService: BalanceService,
            params: FinancialAccountBalanceListParams,
            response: FinancialAccountBalanceListPageResponse,
        ) = FinancialAccountBalanceListPage(balancesService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountBalanceListPage) :
        Iterable<BalanceListResponse> {

        override fun iterator(): Iterator<BalanceListResponse> = iterator {
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

        fun stream(): Stream<BalanceListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
