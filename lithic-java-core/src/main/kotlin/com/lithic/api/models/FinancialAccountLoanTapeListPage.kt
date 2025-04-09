// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.financialAccounts.LoanTapeService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List the loan tapes for a given financial account. */
class FinancialAccountLoanTapeListPage
private constructor(
    private val loanTapesService: LoanTapeService,
    private val params: FinancialAccountLoanTapeListParams,
    private val response: FinancialAccountLoanTapeListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FinancialAccountLoanTapeListPageResponse = response

    /**
     * Delegates to [FinancialAccountLoanTapeListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountLoanTapeListPageResponse.data]
     */
    fun data(): List<LoanTape> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountLoanTapeListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountLoanTapeListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountLoanTapeListPage && loanTapesService == other.loanTapesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(loanTapesService, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountLoanTapeListPage{loanTapesService=$loanTapesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialAccountLoanTapeListParams> {
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

    fun getNextPage(): Optional<FinancialAccountLoanTapeListPage> {
        return getNextPageParams().map { loanTapesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            loanTapesService: LoanTapeService,
            params: FinancialAccountLoanTapeListParams,
            response: FinancialAccountLoanTapeListPageResponse,
        ) = FinancialAccountLoanTapeListPage(loanTapesService, params, response)
    }

    class AutoPager(private val firstPage: FinancialAccountLoanTapeListPage) : Iterable<LoanTape> {

        override fun iterator(): Iterator<LoanTape> = iterator {
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

        fun stream(): Stream<LoanTape> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
