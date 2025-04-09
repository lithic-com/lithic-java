// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.BookTransferService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List book transfers */
class BookTransferListPage
private constructor(
    private val bookTransfersService: BookTransferService,
    private val params: BookTransferListParams,
    private val response: BookTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BookTransferListPageResponse = response

    /**
     * Delegates to [BookTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [BookTransferListPageResponse.data]
     */
    fun data(): List<BookTransferResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [BookTransferListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookTransferListPage && bookTransfersService == other.bookTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "BookTransferListPage{bookTransfersService=$bookTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<BookTransferListParams> {
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

    fun getNextPage(): Optional<BookTransferListPage> {
        return getNextPageParams().map { bookTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bookTransfersService: BookTransferService,
            params: BookTransferListParams,
            response: BookTransferListPageResponse,
        ) = BookTransferListPage(bookTransfersService, params, response)
    }

    class AutoPager(private val firstPage: BookTransferListPage) : Iterable<BookTransferResponse> {

        override fun iterator(): Iterator<BookTransferResponse> = iterator {
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

        fun stream(): Stream<BookTransferResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
