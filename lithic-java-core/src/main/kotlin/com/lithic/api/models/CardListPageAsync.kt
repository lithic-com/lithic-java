// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.CardServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List cards. */
class CardListPageAsync
private constructor(
    private val cardsService: CardServiceAsync,
    private val params: CardListParams,
    private val response: CardListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardListPageResponse = response

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see [CardListPageResponse.data]
     */
    fun data(): List<Card> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see [CardListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardListPageAsync && cardsService == other.cardsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardsService, params, response) /* spotless:on */

    override fun toString() =
        "CardListPageAsync{cardsService=$cardsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<CardListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CardListPageAsync>> {
        return getNextPageParams()
            .map { cardsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardsService: CardServiceAsync,
            params: CardListParams,
            response: CardListPageResponse,
        ) = CardListPageAsync(cardsService, params, response)
    }

    class AutoPager(private val firstPage: CardListPageAsync) {

        fun forEach(action: Predicate<Card>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CardListPageAsync>>.forEach(
                action: (Card) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Card>> {
            val values = mutableListOf<Card>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
