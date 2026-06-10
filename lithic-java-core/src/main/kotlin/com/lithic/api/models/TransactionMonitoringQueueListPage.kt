// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.transactionMonitoring.QueueService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see QueueService.list */
class TransactionMonitoringQueueListPage
private constructor(
    private val service: QueueService,
    private val params: TransactionMonitoringQueueListParams,
    private val response: TransactionMonitoringQueueListPageResponse,
) : Page<Queue> {

    /**
     * Delegates to [TransactionMonitoringQueueListPageResponse], but gracefully handles missing
     * data.
     *
     * @see TransactionMonitoringQueueListPageResponse.data
     */
    fun data(): List<Queue> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionMonitoringQueueListPageResponse], but gracefully handles missing
     * data.
     *
     * @see TransactionMonitoringQueueListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<Queue> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransactionMonitoringQueueListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): TransactionMonitoringQueueListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Queue> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringQueueListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringQueueListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringQueueListPage].
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

    /** A builder for [TransactionMonitoringQueueListPage]. */
    class Builder internal constructor() {

        private var service: QueueService? = null
        private var params: TransactionMonitoringQueueListParams? = null
        private var response: TransactionMonitoringQueueListPageResponse? = null

        @JvmSynthetic
        internal fun from(transactionMonitoringQueueListPage: TransactionMonitoringQueueListPage) =
            apply {
                service = transactionMonitoringQueueListPage.service
                params = transactionMonitoringQueueListPage.params
                response = transactionMonitoringQueueListPage.response
            }

        fun service(service: QueueService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringQueueListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringQueueListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringQueueListPage].
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
        fun build(): TransactionMonitoringQueueListPage =
            TransactionMonitoringQueueListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringQueueListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransactionMonitoringQueueListPage{service=$service, params=$params, response=$response}"
}
