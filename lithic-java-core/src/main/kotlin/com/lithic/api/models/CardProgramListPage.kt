// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.CardProgramService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List card programs. */
class CardProgramListPage
private constructor(
    private val cardProgramsService: CardProgramService,
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

        return /* spotless:off */ other is CardProgramListPage && cardProgramsService == other.cardProgramsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardProgramsService, params, response) /* spotless:on */

    override fun toString() =
        "CardProgramListPage{cardProgramsService=$cardProgramsService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<CardProgramListPage> {
        return getNextPageParams().map { cardProgramsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            cardProgramsService: CardProgramService,
            params: CardProgramListParams,
            response: CardProgramListPageResponse,
        ) = CardProgramListPage(cardProgramsService, params, response)
    }

    class AutoPager(private val firstPage: CardProgramListPage) : Iterable<CardProgram> {

        override fun iterator(): Iterator<CardProgram> = iterator {
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

        fun stream(): Stream<CardProgram> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
