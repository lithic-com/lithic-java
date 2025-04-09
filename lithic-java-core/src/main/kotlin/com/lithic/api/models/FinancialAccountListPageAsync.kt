// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.FinancialAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Retrieve information on your financial accounts including routing and account number. */
class FinancialAccountListPageAsync
private constructor(
    private val financialAccountsService: FinancialAccountServiceAsync,
    private val params: FinancialAccountListParams,
    private val response: FinancialAccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FinancialAccountListPageResponse = response

    /**
     * Delegates to [FinancialAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountListPageResponse.data]
     */
    fun data(): List<FinancialAccount> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountListPageAsync && financialAccountsService == other.financialAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(financialAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountListPageAsync{financialAccountsService=$financialAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialAccountListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<FinancialAccountListPageAsync>> {
        return getNextPageParams()
            .map { financialAccountsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            financialAccountsService: FinancialAccountServiceAsync,
            params: FinancialAccountListParams,
            response: FinancialAccountListPageResponse,
        ) = FinancialAccountListPageAsync(financialAccountsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountListPageAsync) {

        fun forEach(
            action: Predicate<FinancialAccount>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FinancialAccountListPageAsync>>.forEach(
                action: (FinancialAccount) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<FinancialAccount>> {
            val values = mutableListOf<FinancialAccount>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
