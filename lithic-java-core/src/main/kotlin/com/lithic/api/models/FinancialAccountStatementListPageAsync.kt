// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List the statements for a given financial account. */
class FinancialAccountStatementListPageAsync
private constructor(
    private val statementsService: StatementServiceAsync,
    private val params: FinancialAccountStatementListParams,
    private val response: Statements,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): Statements = response

    /**
     * Delegates to [Statements], but gracefully handles missing data.
     *
     * @see [Statements.data]
     */
    fun data(): List<Statement> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [Statements], but gracefully handles missing data.
     *
     * @see [Statements.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementListPageAsync && statementsService == other.statementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(statementsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementListPageAsync{statementsService=$statementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialAccountStatementListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<FinancialAccountStatementListPageAsync>> {
        return getNextPageParams()
            .map { statementsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            statementsService: StatementServiceAsync,
            params: FinancialAccountStatementListParams,
            response: Statements,
        ) = FinancialAccountStatementListPageAsync(statementsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountStatementListPageAsync) {

        fun forEach(action: Predicate<Statement>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FinancialAccountStatementListPageAsync>>.forEach(
                action: (Statement) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Statement>> {
            val values = mutableListOf<Statement>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
