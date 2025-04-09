// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.events.SubscriptionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [SubscriptionServiceAsync.listAttempts] */
class EventSubscriptionListAttemptsPageAsync
private constructor(
    private val service: SubscriptionServiceAsync,
    private val params: EventSubscriptionListAttemptsParams,
    private val response: EventSubscriptionListAttemptsPageResponse,
) {

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

    fun getNextPage(): CompletableFuture<Optional<EventSubscriptionListAttemptsPageAsync>> =
        getNextPageParams()
            .map { service.listAttempts(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): EventSubscriptionListAttemptsParams = params

    /** The response that this page was parsed from. */
    fun response(): EventSubscriptionListAttemptsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventSubscriptionListAttemptsPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [EventSubscriptionListAttemptsPageAsync]. */
    class Builder internal constructor() {

        private var service: SubscriptionServiceAsync? = null
        private var params: EventSubscriptionListAttemptsParams? = null
        private var response: EventSubscriptionListAttemptsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            eventSubscriptionListAttemptsPageAsync: EventSubscriptionListAttemptsPageAsync
        ) = apply {
            service = eventSubscriptionListAttemptsPageAsync.service
            params = eventSubscriptionListAttemptsPageAsync.params
            response = eventSubscriptionListAttemptsPageAsync.response
        }

        fun service(service: SubscriptionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventSubscriptionListAttemptsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventSubscriptionListAttemptsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EventSubscriptionListAttemptsPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EventSubscriptionListAttemptsPageAsync =
            EventSubscriptionListAttemptsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListAttemptsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListAttemptsPageAsync{service=$service, params=$params, response=$response}"
}
