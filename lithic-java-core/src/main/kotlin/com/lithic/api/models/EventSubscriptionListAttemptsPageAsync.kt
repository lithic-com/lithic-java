// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.events.SubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List all the message attempts for a given event subscription. */
class EventSubscriptionListAttemptsPageAsync
private constructor(
    private val subscriptionsService: SubscriptionServiceAsync,
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

        return /* spotless:off */ other is EventSubscriptionListAttemptsPageAsync && subscriptionsService == other.subscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(subscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListAttemptsPageAsync{subscriptionsService=$subscriptionsService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<EventSubscriptionListAttemptsPageAsync>> {
        return getNextPageParams()
            .map { subscriptionsService.listAttempts(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            subscriptionsService: SubscriptionServiceAsync,
            params: EventSubscriptionListAttemptsParams,
            response: EventSubscriptionListAttemptsPageResponse,
        ) = EventSubscriptionListAttemptsPageAsync(subscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: EventSubscriptionListAttemptsPageAsync) {

        fun forEach(
            action: Predicate<MessageAttempt>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<EventSubscriptionListAttemptsPageAsync>>.forEach(
                action: (MessageAttempt) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<MessageAttempt>> {
            val values = mutableListOf<MessageAttempt>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
