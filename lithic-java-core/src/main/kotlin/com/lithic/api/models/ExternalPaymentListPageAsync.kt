// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.ExternalPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List external payments */
class ExternalPaymentListPageAsync
private constructor(
    private val externalPaymentsService: ExternalPaymentServiceAsync,
    private val params: ExternalPaymentListParams,
    private val response: ExternalPaymentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalPaymentListPageResponse = response

    /**
     * Delegates to [ExternalPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalPaymentListPageResponse.data]
     */
    fun data(): List<ExternalPayment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalPaymentListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentListPageAsync && externalPaymentsService == other.externalPaymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalPaymentsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalPaymentListPageAsync{externalPaymentsService=$externalPaymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<ExternalPaymentListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ExternalPaymentListPageAsync>> {
        return getNextPageParams()
            .map { externalPaymentsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalPaymentsService: ExternalPaymentServiceAsync,
            params: ExternalPaymentListParams,
            response: ExternalPaymentListPageResponse,
        ) = ExternalPaymentListPageAsync(externalPaymentsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalPaymentListPageAsync) {

        fun forEach(
            action: Predicate<ExternalPayment>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalPaymentListPageAsync>>.forEach(
                action: (ExternalPayment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExternalPayment>> {
            val values = mutableListOf<ExternalPayment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
