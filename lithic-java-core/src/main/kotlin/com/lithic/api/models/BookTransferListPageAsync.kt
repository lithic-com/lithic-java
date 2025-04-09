// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.BookTransferServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List book transfers */
class BookTransferListPageAsync
private constructor(
    private val bookTransfersService: BookTransferServiceAsync,
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

        return /* spotless:off */ other is BookTransferListPageAsync && bookTransfersService == other.bookTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "BookTransferListPageAsync{bookTransfersService=$bookTransfersService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<BookTransferListPageAsync>> {
        return getNextPageParams()
            .map { bookTransfersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            bookTransfersService: BookTransferServiceAsync,
            params: BookTransferListParams,
            response: BookTransferListPageResponse,
        ) = BookTransferListPageAsync(bookTransfersService, params, response)
    }

    class AutoPager(private val firstPage: BookTransferListPageAsync) {

        fun forEach(
            action: Predicate<BookTransferResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<BookTransferListPageAsync>>.forEach(
                action: (BookTransferResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BookTransferResponse>> {
            val values = mutableListOf<BookTransferResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
