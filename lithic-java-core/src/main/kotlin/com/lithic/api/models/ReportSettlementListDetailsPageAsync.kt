// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.reports.SettlementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [SettlementServiceAsync.listDetails] */
class ReportSettlementListDetailsPageAsync
private constructor(
    private val service: SettlementServiceAsync,
    private val params: ReportSettlementListDetailsParams,
    private val response: ReportSettlementListDetailsPageResponse,
) {

    /**
     * Delegates to [ReportSettlementListDetailsPageResponse], but gracefully handles missing data.
     *
     * @see [ReportSettlementListDetailsPageResponse.data]
     */
    fun data(): List<SettlementDetail> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReportSettlementListDetailsPageResponse], but gracefully handles missing data.
     *
     * @see [ReportSettlementListDetailsPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<ReportSettlementListDetailsParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ReportSettlementListDetailsPageAsync>> =
        getNextPageParams()
            .map { service.listDetails(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportSettlementListDetailsParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportSettlementListDetailsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportSettlementListDetailsPageAsync].
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

    /** A builder for [ReportSettlementListDetailsPageAsync]. */
    class Builder internal constructor() {

        private var service: SettlementServiceAsync? = null
        private var params: ReportSettlementListDetailsParams? = null
        private var response: ReportSettlementListDetailsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            reportSettlementListDetailsPageAsync: ReportSettlementListDetailsPageAsync
        ) = apply {
            service = reportSettlementListDetailsPageAsync.service
            params = reportSettlementListDetailsPageAsync.params
            response = reportSettlementListDetailsPageAsync.response
        }

        fun service(service: SettlementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportSettlementListDetailsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportSettlementListDetailsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportSettlementListDetailsPageAsync].
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
        fun build(): ReportSettlementListDetailsPageAsync =
            ReportSettlementListDetailsPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ReportSettlementListDetailsPageAsync) {

        fun forEach(
            action: Predicate<SettlementDetail>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ReportSettlementListDetailsPageAsync>>.forEach(
                action: (SettlementDetail) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<SettlementDetail>> {
            val values = mutableListOf<SettlementDetail>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementListDetailsPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementListDetailsPageAsync{service=$service, params=$params, response=$response}"
}
