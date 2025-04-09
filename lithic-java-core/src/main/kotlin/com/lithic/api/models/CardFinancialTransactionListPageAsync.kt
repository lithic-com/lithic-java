// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [FinancialTransactionServiceAsync.list] */
class CardFinancialTransactionListPageAsync
private constructor(
    private val service: FinancialTransactionServiceAsync,
    private val params: CardFinancialTransactionListParams,
    private val response: CardFinancialTransactionListPageResponse,
) {

    /**
     * Delegates to [CardFinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [CardFinancialTransactionListPageResponse.data]
     */
    fun data(): List<FinancialTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardFinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [CardFinancialTransactionListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<CardFinancialTransactionListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<CardFinancialTransactionListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardFinancialTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardFinancialTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardFinancialTransactionListPageAsync].
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

    /** A builder for [CardFinancialTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: FinancialTransactionServiceAsync? = null
        private var params: CardFinancialTransactionListParams? = null
        private var response: CardFinancialTransactionListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            cardFinancialTransactionListPageAsync: CardFinancialTransactionListPageAsync
        ) = apply {
            service = cardFinancialTransactionListPageAsync.service
            params = cardFinancialTransactionListPageAsync.params
            response = cardFinancialTransactionListPageAsync.response
        }

        fun service(service: FinancialTransactionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardFinancialTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardFinancialTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardFinancialTransactionListPageAsync].
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
        fun build(): CardFinancialTransactionListPageAsync =
            CardFinancialTransactionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CardFinancialTransactionListPageAsync) {

        fun forEach(
            action: Predicate<FinancialTransaction>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<CardFinancialTransactionListPageAsync>>.forEach(
                action: (FinancialTransaction) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<FinancialTransaction>> {
            val values = mutableListOf<FinancialTransaction>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardFinancialTransactionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardFinancialTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
