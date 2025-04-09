// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.reports.SettlementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List details. */
class ReportSettlementListDetailsPageAsync
private constructor(
    private val settlementService: SettlementServiceAsync,
    private val params: ReportSettlementListDetailsParams,
    private val response: ReportSettlementListDetailsPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ReportSettlementListDetailsPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementListDetailsPageAsync && settlementService == other.settlementService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(settlementService, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementListDetailsPageAsync{settlementService=$settlementService, params=$params, response=$response}"

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

    fun getNextPage(): CompletableFuture<Optional<ReportSettlementListDetailsPageAsync>> {
        return getNextPageParams()
            .map { settlementService.listDetails(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            settlementService: SettlementServiceAsync,
            params: ReportSettlementListDetailsParams,
            response: ReportSettlementListDetailsPageResponse,
        ) = ReportSettlementListDetailsPageAsync(settlementService, params, response)
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
}
