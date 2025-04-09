// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.StatementService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List the statements for a given financial account. */
class FinancialAccountStatementListPage
private constructor(
    private val statementsService: StatementService,
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

        return /* spotless:off */ other is FinancialAccountStatementListPage && statementsService == other.statementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(statementsService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementListPage{statementsService=$statementsService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<FinancialAccountStatementListPage> {
        return getNextPageParams().map { statementsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            statementsService: StatementService,
            params: FinancialAccountStatementListParams,
            response: Statements,
        ) = FinancialAccountStatementListPage(statementsService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountStatementListPage) :
        Iterable<Statement> {

        override fun iterator(): Iterator<Statement> = iterator {
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

        fun stream(): Stream<Statement> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
