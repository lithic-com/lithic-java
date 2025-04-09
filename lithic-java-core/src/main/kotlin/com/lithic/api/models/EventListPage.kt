// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.EventService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List all events. */
class EventListPage
private constructor(
    private val eventsService: EventService,
    private val params: EventListParams,
    private val response: EventListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventListPageResponse = response

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see [EventListPageResponse.data]
     */
    fun data(): List<Event> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see [EventListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListPage && eventsService == other.eventsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, response) /* spotless:on */

    override fun toString() =
        "EventListPage{eventsService=$eventsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<EventListParams> {
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

    fun getNextPage(): Optional<EventListPage> {
        return getNextPageParams().map { eventsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            eventsService: EventService,
            params: EventListParams,
            response: EventListPageResponse,
        ) = EventListPage(eventsService, params, response)
    }

    class AutoPager(private val firstPage: EventListPage) : Iterable<Event> {

        override fun iterator(): Iterator<Event> = iterator {
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

        fun stream(): Stream<Event> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
