// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.cards.BalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [BalanceServiceAsync.list] */
class CardBalanceListPageAsync
private constructor(
    private val service: BalanceServiceAsync,
    private val params: CardBalanceListParams,
    private val response: CardBalanceListPageResponse,
) {

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardBalanceListPageResponse.data]
     */
    fun data(): List<BalanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<CardBalanceListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<CardBalanceListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardBalanceListPageAsync].
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

    /** A builder for [CardBalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var params: CardBalanceListParams? = null
        private var response: CardBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardBalanceListPageAsync: CardBalanceListPageAsync) = apply {
            service = cardBalanceListPageAsync.service
            params = cardBalanceListPageAsync.params
            response = cardBalanceListPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardBalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardBalanceListPageAsync].
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
        fun build(): CardBalanceListPageAsync =
            CardBalanceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CardBalanceListPageAsync) {

        fun forEach(
            action: Predicate<BalanceListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CardBalanceListPageAsync>>.forEach(
                action: (BalanceListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<BalanceListResponse>> {
            val values = mutableListOf<BalanceListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardBalanceListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardBalanceListPageAsync{service=$service, params=$params, response=$response}"
}
