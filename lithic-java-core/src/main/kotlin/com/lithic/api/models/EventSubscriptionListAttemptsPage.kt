// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.events.SubscriptionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List all the message attempts for a given event subscription. */
class EventSubscriptionListAttemptsPage
private constructor(
    private val subscriptionsService: SubscriptionService,
    private val params: EventSubscriptionListAttemptsParams,
    private val response: EventSubscriptionListAttemptsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventSubscriptionListAttemptsPageResponse = response

    /**
     * Delegates to [EventSubscriptionListAttemptsPageResponse], but gracefully handles missing
     * data.
     *
     * @see [EventSubscriptionListAttemptsPageResponse.data]
     */
    fun data(): List<MessageAttempt> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventSubscriptionListAttemptsPageResponse], but gracefully handles missing
     * data.
     *
     * @see [EventSubscriptionListAttemptsPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListAttemptsPage && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListAttemptsPage{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<EventSubscriptionListAttemptsParams> {
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

    fun getNextPage(): Optional<EventSubscriptionListAttemptsPage> {
        return getNextPageParams().map { subscriptionsService.listAttempts(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            subscriptionsService: SubscriptionService,
            params: EventSubscriptionListAttemptsParams,
            response: EventSubscriptionListAttemptsPageResponse,
        ) = EventSubscriptionListAttemptsPage(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: EventSubscriptionListAttemptsPage) :
        Iterable<MessageAttempt> {

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
