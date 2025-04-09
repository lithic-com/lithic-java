// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.CardProgramServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [CardProgramServiceAsync.list] */
class CardProgramListPageAsync
private constructor(
    private val service: CardProgramServiceAsync,
    private val params: CardProgramListParams,
    private val response: CardProgramListPageResponse,
) {

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

    fun getNextPage(): CompletableFuture<Optional<CardProgramListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardProgramListPageAsync].
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

    /** A builder for [CardProgramListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardProgramServiceAsync? = null
        private var params: CardProgramListParams? = null
        private var response: CardProgramListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardProgramListPageAsync: CardProgramListPageAsync) = apply {
            service = cardProgramListPageAsync.service
            params = cardProgramListPageAsync.params
            response = cardProgramListPageAsync.response
        }

        fun service(service: CardProgramServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardProgramListPageAsync].
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
        fun build(): CardProgramListPageAsync =
            CardProgramListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgramListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardProgramListPageAsync{service=$service, params=$params, response=$response}"
}
