// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List network total records with optional filters. Not available in sandbox. */
class ReportSettlementNetworkTotalListPageAsync
private constructor(
    private val networkTotalsService: NetworkTotalServiceAsync,
    private val params: ReportSettlementNetworkTotalListParams,
    private val response: ReportSettlementNetworkTotalListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ReportSettlementNetworkTotalListPageResponse = response

    /**
     * Delegates to [ReportSettlementNetworkTotalListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ReportSettlementNetworkTotalListPageResponse.data]
     */
    fun data(): List<NetworkTotalListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReportSettlementNetworkTotalListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ReportSettlementNetworkTotalListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementNetworkTotalListPageAsync && networkTotalsService == other.networkTotalsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(networkTotalsService, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementNetworkTotalListPageAsync{networkTotalsService=$networkTotalsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<ReportSettlementNetworkTotalListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ReportSettlementNetworkTotalListPageAsync>> {
        return getNextPageParams()
            .map { networkTotalsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            networkTotalsService: NetworkTotalServiceAsync,
            params: ReportSettlementNetworkTotalListParams,
            response: ReportSettlementNetworkTotalListPageResponse,
        ) = ReportSettlementNetworkTotalListPageAsync(networkTotalsService, params, response)
    }

    class AutoPager(private val firstPage: ReportSettlementNetworkTotalListPageAsync) {

        fun forEach(
            action: Predicate<NetworkTotalListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ReportSettlementNetworkTotalListPageAsync>>.forEach(
                action: (NetworkTotalListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<NetworkTotalListResponse>> {
            val values = mutableListOf<NetworkTotalListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
