// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List the line items for a given statement within a given financial account. */
class FinancialAccountStatementLineItemListPageAsync
private constructor(
    private val lineItemsService: LineItemServiceAsync,
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

        return /* spotless:off */ other is FinancialAccountStatementLineItemListPageAsync && lineItemsService == other.lineItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lineItemsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementLineItemListPageAsync{lineItemsService=$lineItemsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<FinancialAccountStatementLineItemListPageAsync>> {
        return getNextPageParams()
            .map { lineItemsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            lineItemsService: LineItemServiceAsync,
            params: FinancialAccountStatementLineItemListParams,
            response: StatementLineItems,
        ) = FinancialAccountStatementLineItemListPageAsync(lineItemsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountStatementLineItemListPageAsync) {

        fun forEach(
            action: Predicate<StatementLineItems.StatementLineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FinancialAccountStatementLineItemListPageAsync>>.forEach(
                action: (StatementLineItems.StatementLineItemResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<StatementLineItems.StatementLineItemResponse>> {
            val values = mutableListOf<StatementLineItems.StatementLineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
