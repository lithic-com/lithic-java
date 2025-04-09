// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.PaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List all the payments for the provided search criteria. */
class PaymentListPageAsync
private constructor(
    private val paymentsService: PaymentServiceAsync,
    private val params: PaymentListParams,
    private val response: PaymentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PaymentListPageResponse = response

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [PaymentListPageResponse.data]
     */
    fun data(): List<Payment> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [PaymentListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentListPageAsync && paymentsService == other.paymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(paymentsService, params, response) /* spotless:on */

    override fun toString() =
        "PaymentListPageAsync{paymentsService=$paymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<PaymentListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<PaymentListPageAsync>> {
        return getNextPageParams()
            .map { paymentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            paymentsService: PaymentServiceAsync,
            params: PaymentListParams,
            response: PaymentListPageResponse,
        ) = PaymentListPageAsync(paymentsService, params, response)
    }

    class AutoPager(private val firstPage: PaymentListPageAsync) {

        fun forEach(action: Predicate<Payment>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<PaymentListPageAsync>>.forEach(
                action: (Payment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Payment>> {
            val values = mutableListOf<Payment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
