// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AggregateBalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [AggregateBalanceServiceAsync.list] */
class AggregateBalanceListPageAsync
private constructor(
    private val service: AggregateBalanceServiceAsync,
    private val params: AggregateBalanceListParams,
    private val response: AggregateBalanceListPageResponse,
) {

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregateBalanceListPageResponse.data]
     */
    fun data(): List<AggregateBalance> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [AggregateBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AggregateBalanceListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<AggregateBalanceListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AggregateBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): AggregateBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AggregateBalanceListPageAsync].
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

    /** A builder for [AggregateBalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: AggregateBalanceServiceAsync? = null
        private var params: AggregateBalanceListParams? = null
        private var response: AggregateBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(aggregateBalanceListPageAsync: AggregateBalanceListPageAsync) = apply {
            service = aggregateBalanceListPageAsync.service
            params = aggregateBalanceListPageAsync.params
            response = aggregateBalanceListPageAsync.response
        }

        fun service(service: AggregateBalanceServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AggregateBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AggregateBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AggregateBalanceListPageAsync].
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
        fun build(): AggregateBalanceListPageAsync =
            AggregateBalanceListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AggregateBalanceListPageAsync) {

        fun forEach(
            action: Predicate<AggregateBalance>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AggregateBalanceListPageAsync>>.forEach(
                action: (AggregateBalance) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AggregateBalance>> {
            val values = mutableListOf<AggregateBalance>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregateBalanceListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AggregateBalanceListPageAsync{service=$service, params=$params, response=$response}"
}
