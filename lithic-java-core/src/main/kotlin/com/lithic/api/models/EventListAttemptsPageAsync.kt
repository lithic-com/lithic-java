// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.EventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [EventServiceAsync.listAttempts] */
class EventListAttemptsPageAsync
private constructor(
    private val service: EventServiceAsync,
    private val params: EventListAttemptsParams,
    private val response: EventListAttemptsPageResponse,
) {

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

    fun getNextPage(): CompletableFuture<Optional<EventListAttemptsPageAsync>> =
        getNextPageParams()
            .map { service.listAttempts(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): EventListAttemptsParams = params

    /** The response that this page was parsed from. */
    fun response(): EventListAttemptsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventListAttemptsPageAsync].
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

    /** A builder for [EventListAttemptsPageAsync]. */
    class Builder internal constructor() {

        private var service: EventServiceAsync? = null
        private var params: EventListAttemptsParams? = null
        private var response: EventListAttemptsPageResponse? = null

        @JvmSynthetic
        internal fun from(eventListAttemptsPageAsync: EventListAttemptsPageAsync) = apply {
            service = eventListAttemptsPageAsync.service
            params = eventListAttemptsPageAsync.params
            response = eventListAttemptsPageAsync.response
        }

        fun service(service: EventServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventListAttemptsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventListAttemptsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventListAttemptsPageAsync].
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
        fun build(): EventListAttemptsPageAsync =
            EventListAttemptsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: EventListAttemptsPageAsync) {

        fun forEach(
            action: Predicate<MessageAttempt>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<EventListAttemptsPageAsync>>.forEach(
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

        return /* spotless:off */ other is EventListAttemptsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventListAttemptsPageAsync{service=$service, params=$params, response=$response}"
}
