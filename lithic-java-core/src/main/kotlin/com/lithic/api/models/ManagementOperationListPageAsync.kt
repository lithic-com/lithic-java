// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.ManagementOperationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ManagementOperationServiceAsync.list] */
class ManagementOperationListPageAsync
private constructor(
    private val service: ManagementOperationServiceAsync,
    private val params: ManagementOperationListParams,
    private val response: ManagementOperationListPageResponse,
) {

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

    fun getNextPage(): CompletableFuture<Optional<ManagementOperationListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ManagementOperationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ManagementOperationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ManagementOperationListPageAsync].
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

    /** A builder for [ManagementOperationListPageAsync]. */
    class Builder internal constructor() {

        private var service: ManagementOperationServiceAsync? = null
        private var params: ManagementOperationListParams? = null
        private var response: ManagementOperationListPageResponse? = null

        @JvmSynthetic
        internal fun from(managementOperationListPageAsync: ManagementOperationListPageAsync) =
            apply {
                service = managementOperationListPageAsync.service
                params = managementOperationListPageAsync.params
                response = managementOperationListPageAsync.response
            }

        fun service(service: ManagementOperationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ManagementOperationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ManagementOperationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ManagementOperationListPageAsync].
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
        fun build(): ManagementOperationListPageAsync =
            ManagementOperationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ManagementOperationListPageAsync{service=$service, params=$params, response=$response}"
}
