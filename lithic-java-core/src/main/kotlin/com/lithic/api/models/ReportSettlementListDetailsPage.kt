// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.reports.SettlementService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see SettlementService.listDetails */
class ReportSettlementListDetailsPage
private constructor(
    private val service: SettlementService,
    private val params: ReportSettlementListDetailsParams,
    private val response: ReportSettlementListDetailsPageResponse,
) : Page<SettlementDetail> {

    /**
     * Delegates to [ReportSettlementListDetailsPageResponse], but gracefully handles missing data.
     *
     * @see ReportSettlementListDetailsPageResponse.data
     */
    fun data(): List<SettlementDetail> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ReportSettlementListDetailsPageResponse], but gracefully handles missing data.
     *
     * @see ReportSettlementListDetailsPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<SettlementDetail> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ReportSettlementListDetailsParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): ReportSettlementListDetailsPage = service.listDetails(nextPageParams())

    fun autoPager(): AutoPager<SettlementDetail> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ReportSettlementListDetailsParams = params

    /** The response that this page was parsed from. */
    fun response(): ReportSettlementListDetailsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ReportSettlementListDetailsPage].
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

    /** A builder for [ReportSettlementListDetailsPage]. */
    class Builder internal constructor() {

        private var service: SettlementService? = null
        private var params: ReportSettlementListDetailsParams? = null
        private var response: ReportSettlementListDetailsPageResponse? = null

        @JvmSynthetic
        internal fun from(reportSettlementListDetailsPage: ReportSettlementListDetailsPage) =
            apply {
                service = reportSettlementListDetailsPage.service
                params = reportSettlementListDetailsPage.params
                response = reportSettlementListDetailsPage.response
            }

        fun service(service: SettlementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ReportSettlementListDetailsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ReportSettlementListDetailsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ReportSettlementListDetailsPage].
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
        fun build(): ReportSettlementListDetailsPage =
            ReportSettlementListDetailsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ReportSettlementListDetailsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ReportSettlementListDetailsPage{service=$service, params=$params, response=$response}"
}
