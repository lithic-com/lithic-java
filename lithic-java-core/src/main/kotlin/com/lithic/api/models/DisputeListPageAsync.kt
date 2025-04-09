// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.DisputeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List disputes. */
class DisputeListPageAsync
private constructor(
    private val disputesService: DisputeServiceAsync,
    private val params: DisputeListParams,
    private val response: DisputeListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DisputeListPageResponse = response

    /**
     * Delegates to [DisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListPageResponse.data]
     */
    fun data(): List<Dispute> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListPageAsync && disputesService == other.disputesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputesService, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListPageAsync{disputesService=$disputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<DisputeListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<DisputeListPageAsync>> {
        return getNextPageParams()
            .map { disputesService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            disputesService: DisputeServiceAsync,
            params: DisputeListParams,
            response: DisputeListPageResponse,
        ) = DisputeListPageAsync(disputesService, params, response)
    }

    class AutoPager(private val firstPage: DisputeListPageAsync) {

        fun forEach(action: Predicate<Dispute>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DisputeListPageAsync>>.forEach(
                action: (Dispute) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Dispute>> {
            val values = mutableListOf<Dispute>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
