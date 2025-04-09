// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.TransactionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/**
 * List card transactions. All amounts are in the smallest unit of their respective currency (e.g.,
 * cents for USD) and inclusive of any acquirer fees.
 */
class TransactionListPage
private constructor(
    private val transactionsService: TransactionService,
    private val params: TransactionListParams,
    private val response: TransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): TransactionListPageResponse = response

    /**
     * Delegates to [TransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionListPageResponse.data]
     */
    fun data(): List<Transaction> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListPage && transactionsService == other.transactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(transactionsService, params, response) /* spotless:on */

    override fun toString() =
        "TransactionListPage{transactionsService=$transactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<TransactionListParams> {
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

    fun getNextPage(): Optional<TransactionListPage> {
        return getNextPageParams().map { transactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            transactionsService: TransactionService,
            params: TransactionListParams,
            response: TransactionListPageResponse,
        ) = TransactionListPage(transactionsService, params, response)
    }

    class AutoPager(private val firstPage: TransactionListPage) : Iterable<Transaction> {

        override fun iterator(): Iterator<Transaction> = iterator {
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

        fun stream(): Stream<Transaction> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
