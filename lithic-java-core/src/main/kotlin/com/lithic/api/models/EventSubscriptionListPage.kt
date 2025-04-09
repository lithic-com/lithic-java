// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.events.SubscriptionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List all the event subscriptions. */
class EventSubscriptionListPage
private constructor(
    private val subscriptionsService: SubscriptionService,
    private val params: EventSubscriptionListParams,
    private val response: EventSubscriptionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventSubscriptionListPageResponse = response

    /**
     * Delegates to [EventSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see [EventSubscriptionListPageResponse.data]
     */
    fun data(): List<EventSubscription> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see [EventSubscriptionListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListPage && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListPage{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<EventSubscriptionListParams> {
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

    fun getNextPage(): Optional<EventSubscriptionListPage> {
        return getNextPageParams().map { subscriptionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            subscriptionsService: SubscriptionService,
            params: EventSubscriptionListParams,
            response: EventSubscriptionListPageResponse,
        ) = EventSubscriptionListPage(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: EventSubscriptionListPage) :
        Iterable<EventSubscription> {

        override fun iterator(): Iterator<EventSubscription> = iterator {
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

        fun stream(): Stream<EventSubscription> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
