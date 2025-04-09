// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.reports.settlement.NetworkTotalService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List network total records with optional filters. Not available in sandbox. */
class ReportSettlementNetworkTotalListPage
private constructor(
    private val networkTotalsService: NetworkTotalService,
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

        return /* spotless:off */ other is ReportSettlementNetworkTotalListPage && networkTotalsService == other.networkTotalsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(networkTotalsService, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementNetworkTotalListPage{networkTotalsService=$networkTotalsService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<ReportSettlementNetworkTotalListPage> {
        return getNextPageParams().map { networkTotalsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            networkTotalsService: NetworkTotalService,
            params: ReportSettlementNetworkTotalListParams,
            response: ReportSettlementNetworkTotalListPageResponse,
        ) = ReportSettlementNetworkTotalListPage(networkTotalsService, params, response)
    }

    class AutoPager(private val firstPage: ReportSettlementNetworkTotalListPage) :
        Iterable<NetworkTotalListResponse> {

        override fun iterator(): Iterator<NetworkTotalListResponse> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<NetworkTotalListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
