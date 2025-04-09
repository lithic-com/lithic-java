// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.CardProgramServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List card programs. */
class CardProgramListPageAsync
private constructor(
    private val cardProgramsService: CardProgramServiceAsync,
    private val params: CardProgramListParams,
    private val response: CardProgramListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardProgramListPageResponse = response

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [CardProgramListPageResponse.data]
     */
    fun data(): List<CardProgram> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [CardProgramListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgramListPageAsync && cardProgramsService == other.cardProgramsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardProgramsService, params, response) /* spotless:on */

    override fun toString() =
        "CardProgramListPageAsync{cardProgramsService=$cardProgramsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<CardProgramListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<CardProgramListPageAsync>> {
        return getNextPageParams()
            .map { cardProgramsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardProgramsService: CardProgramServiceAsync,
            params: CardProgramListParams,
            response: CardProgramListPageResponse,
        ) = CardProgramListPageAsync(cardProgramsService, params, response)
    }

    class AutoPager(private val firstPage: CardProgramListPageAsync) {

        fun forEach(action: Predicate<CardProgram>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CardProgramListPageAsync>>.forEach(
                action: (CardProgram) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<CardProgram>> {
            val values = mutableListOf<CardProgram>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
