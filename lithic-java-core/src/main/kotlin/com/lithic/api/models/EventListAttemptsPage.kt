// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.EventService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List all the message attempts for a given event. */
class EventListAttemptsPage
private constructor(
    private val eventsService: EventService,
    private val params: EventListAttemptsParams,
    private val response: EventListAttemptsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventListAttemptsPageResponse = response

    /**
     * Delegates to [EventListAttemptsPageResponse], but gracefully handles missing data.
     *
     * @see [EventListAttemptsPageResponse.data]
     */
    fun data(): List<MessageAttempt> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventListAttemptsPageResponse], but gracefully handles missing data.
     *
     * @see [EventListAttemptsPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListAttemptsPage && eventsService == other.eventsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, response) /* spotless:on */

    override fun toString() =
        "EventListAttemptsPage{eventsService=$eventsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<EventListAttemptsParams> {
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

    fun getNextPage(): Optional<EventListAttemptsPage> {
        return getNextPageParams().map { eventsService.listAttempts(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            eventsService: EventService,
            params: EventListAttemptsParams,
            response: EventListAttemptsPageResponse,
        ) = EventListAttemptsPage(eventsService, params, response)
    }

    class AutoPager(private val firstPage: EventListAttemptsPage) : Iterable<MessageAttempt> {

        override fun iterator(): Iterator<MessageAttempt> = iterator {
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

        fun stream(): Stream<MessageAttempt> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
