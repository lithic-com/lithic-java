// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.CardServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CardServiceAsync.list] */
class CardListPageAsync
private constructor(
    private val service: CardServiceAsync,
    private val params: CardListParams,
    private val response: CardListPageResponse,
) {

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

    fun getNextPage(): CompletableFuture<Optional<CardListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardListPageAsync].
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

    /** A builder for [CardListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardServiceAsync? = null
        private var params: CardListParams? = null
        private var response: CardListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardListPageAsync: CardListPageAsync) = apply {
            service = cardListPageAsync.service
            params = cardListPageAsync.params
            response = cardListPageAsync.response
        }

        fun service(service: CardServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardListPageAsync].
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
        fun build(): CardListPageAsync =
            CardListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardListPageAsync{service=$service, params=$params, response=$response}"
}
