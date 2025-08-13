// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.reports.settlement.NetworkTotalService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see NetworkTotalService.list */
class ReportSettlementNetworkTotalListPage
private constructor(
    private val service: NetworkTotalService,
    private val params: ReportSettlementNetworkTotalListParams,
    private val response: ReportSettlementNetworkTotalListPageResponse,
) : Page<NetworkTotalListResponse> {

    /**
     * Delegates to [ReportSettlementNetworkTotalListPageResponse], but gracefully handles missing
     * data.
     *
     * @see ReportSettlementNetworkTotalListPageResponse.data
     */
    fun data(): List<NetworkTotalListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReportSettlementNetworkTotalListPageResponse], but gracefully handles missing
     * data.
     *
     * @see ReportSettlementNetworkTotalListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<NetworkTotalListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ReportSettlementNetworkTotalListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): ReportSettlementNetworkTotalListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NetworkTotalListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportSettlementNetworkTotalListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportSettlementNetworkTotalListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportSettlementNetworkTotalListPage].
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

    /** A builder for [ReportSettlementNetworkTotalListPage]. */
    class Builder internal constructor() {

        private var service: NetworkTotalService? = null
        private var params: ReportSettlementNetworkTotalListParams? = null
        private var response: ReportSettlementNetworkTotalListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            reportSettlementNetworkTotalListPage: ReportSettlementNetworkTotalListPage
        ) = apply {
            service = reportSettlementNetworkTotalListPage.service
            params = reportSettlementNetworkTotalListPage.params
            response = reportSettlementNetworkTotalListPage.response
        }

        fun service(service: NetworkTotalService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportSettlementNetworkTotalListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportSettlementNetworkTotalListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportSettlementNetworkTotalListPage].
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
        fun build(): ReportSettlementNetworkTotalListPage =
            ReportSettlementNetworkTotalListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportSettlementNetworkTotalListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ReportSettlementNetworkTotalListPage{service=$service, params=$params, response=$response}"
}
