// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.transactionMonitoring.CaseService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CaseService.list */
class TransactionMonitoringCaseListPage
private constructor(
    private val service: CaseService,
    private val params: TransactionMonitoringCaseListParams,
    private val response: TransactionMonitoringCaseListPageResponse,
) : Page<MonitoringCase> {

    /**
     * Delegates to [TransactionMonitoringCaseListPageResponse], but gracefully handles missing
     * data.
     *
     * @see TransactionMonitoringCaseListPageResponse.data
     */
    fun data(): List<MonitoringCase> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionMonitoringCaseListPageResponse], but gracefully handles missing
     * data.
     *
     * @see TransactionMonitoringCaseListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<MonitoringCase> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransactionMonitoringCaseListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): TransactionMonitoringCaseListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<MonitoringCase> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseListPage].
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

    /** A builder for [TransactionMonitoringCaseListPage]. */
    class Builder internal constructor() {

        private var service: CaseService? = null
        private var params: TransactionMonitoringCaseListParams? = null
        private var response: TransactionMonitoringCaseListPageResponse? = null

        @JvmSynthetic
        internal fun from(transactionMonitoringCaseListPage: TransactionMonitoringCaseListPage) =
            apply {
                service = transactionMonitoringCaseListPage.service
                params = transactionMonitoringCaseListPage.params
                response = transactionMonitoringCaseListPage.response
            }

        fun service(service: CaseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseListPage].
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
        fun build(): TransactionMonitoringCaseListPage =
            TransactionMonitoringCaseListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransactionMonitoringCaseListPage{service=$service, params=$params, response=$response}"
}
