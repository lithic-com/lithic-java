// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.financialAccounts.FinancialTransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List the financial transactions for a given financial account. */
class FinancialTransactionListPageAsync
private constructor(
    private val financialTransactionsService: FinancialTransactionServiceAsync,
    private val params: FinancialTransactionListParams,
    private val response: FinancialTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FinancialTransactionListPageResponse = response

    /**
     * Delegates to [FinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialTransactionListPageResponse.data]
     */
    fun data(): List<FinancialTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialTransactionListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialTransactionListPageAsync && financialTransactionsService == other.financialTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialTransactionListPageAsync{financialTransactionsService=$financialTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialTransactionListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<FinancialTransactionListPageAsync>> {
        return getNextPageParams()
            .map { financialTransactionsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            financialTransactionsService: FinancialTransactionServiceAsync,
            params: FinancialTransactionListParams,
            response: FinancialTransactionListPageResponse,
        ) = FinancialTransactionListPageAsync(financialTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialTransactionListPageAsync) {

        fun forEach(
            action: Predicate<FinancialTransaction>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FinancialTransactionListPageAsync>>.forEach(
                action: (FinancialTransaction) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<FinancialTransaction>> {
            val values = mutableListOf<FinancialTransaction>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
