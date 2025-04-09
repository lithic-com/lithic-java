// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.ManagementOperationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List management operations */
class ManagementOperationListPageAsync
private constructor(
    private val managementOperationsService: ManagementOperationServiceAsync,
    private val params: ManagementOperationListParams,
    private val response: ManagementOperationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ManagementOperationListPageResponse = response

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.data]
     */
    fun data(): List<ManagementOperationTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationListPageAsync && managementOperationsService == other.managementOperationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(managementOperationsService, params, response) /* spotless:on */

    override fun toString() =
        "ManagementOperationListPageAsync{managementOperationsService=$managementOperationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<ManagementOperationListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ManagementOperationListPageAsync>> {
        return getNextPageParams()
            .map { managementOperationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            managementOperationsService: ManagementOperationServiceAsync,
            params: ManagementOperationListParams,
            response: ManagementOperationListPageResponse,
        ) = ManagementOperationListPageAsync(managementOperationsService, params, response)
    }

    class AutoPager(private val firstPage: ManagementOperationListPageAsync) {

        fun forEach(
            action: Predicate<ManagementOperationTransaction>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ManagementOperationListPageAsync>>.forEach(
                action: (ManagementOperationTransaction) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ManagementOperationTransaction>> {
            val values = mutableListOf<ManagementOperationTransaction>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
