// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.reports.settlement.NetworkTotalServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [NetworkTotalServiceAsync.list] */
class ReportSettlementNetworkTotalListPageAsync
private constructor(
    private val service: NetworkTotalServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ReportSettlementNetworkTotalListParams,
    private val response: ReportSettlementNetworkTotalListPageResponse,
) : PageAsync<NetworkTotalListResponse> {

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

    override fun items(): List<NetworkTotalListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ReportSettlementNetworkTotalListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<ReportSettlementNetworkTotalListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NetworkTotalListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ReportSettlementNetworkTotalListParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportSettlementNetworkTotalListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportSettlementNetworkTotalListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ReportSettlementNetworkTotalListPageAsync]. */
    class Builder internal constructor() {

        private var service: NetworkTotalServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ReportSettlementNetworkTotalListParams? = null
        private var response: ReportSettlementNetworkTotalListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            reportSettlementNetworkTotalListPageAsync: ReportSettlementNetworkTotalListPageAsync
        ) = apply {
            service = reportSettlementNetworkTotalListPageAsync.service
            streamHandlerExecutor = reportSettlementNetworkTotalListPageAsync.streamHandlerExecutor
            params = reportSettlementNetworkTotalListPageAsync.params
            response = reportSettlementNetworkTotalListPageAsync.response
        }

        fun service(service: NetworkTotalServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ReportSettlementNetworkTotalListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportSettlementNetworkTotalListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportSettlementNetworkTotalListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ReportSettlementNetworkTotalListPageAsync =
            ReportSettlementNetworkTotalListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ReportSettlementNetworkTotalListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ReportSettlementNetworkTotalListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
