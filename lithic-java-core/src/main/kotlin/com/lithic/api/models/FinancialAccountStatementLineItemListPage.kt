// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.statements.LineItemService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List the line items for a given statement within a given financial account. */
class FinancialAccountStatementLineItemListPage
private constructor(
    private val lineItemsService: LineItemService,
    private val params: FinancialAccountStatementLineItemListParams,
    private val response: StatementLineItems,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): StatementLineItems = response

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see [StatementLineItems.data]
     */
    fun data(): List<StatementLineItems.StatementLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see [StatementLineItems.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementLineItemListPage && lineItemsService == other.lineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementLineItemListPage{lineItemsService=$lineItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialAccountStatementLineItemListParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            if (params.endingBefore().isPresent) {
                params
                    .toBuilder()
                    .endingBefore(data().first()._token().getOptional("token"))
                    .build()
            } else {
                params
                    .toBuilder()
                    .startingAfter(data().last()._token().getOptional("token"))
                    .build()
            }
        )
    }

    fun getNextPage(): Optional<FinancialAccountStatementLineItemListPage> {
        return getNextPageParams().map { lineItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemService,
            params: FinancialAccountStatementLineItemListParams,
            response: StatementLineItems,
        ) = FinancialAccountStatementLineItemListPage(lineItemsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountStatementLineItemListPage) :
        Iterable<StatementLineItems.StatementLineItemResponse> {

        override fun iterator(): Iterator<StatementLineItems.StatementLineItemResponse> = iterator {
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

        fun stream(): Stream<StatementLineItems.StatementLineItemResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
