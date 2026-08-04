// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.transactionMonitoring.CaseServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CaseServiceAsync.list */
class TransactionMonitoringCaseListPageAsync
private constructor(
    private val service: CaseServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TransactionMonitoringCaseListParams,
    private val response: TransactionMonitoringCaseListPageResponse,
) : PageAsync<MonitoringCase> {

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

    override fun nextPage(): CompletableFuture<TransactionMonitoringCaseListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<MonitoringCase> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseListPageAsync].
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

    /** A builder for [TransactionMonitoringCaseListPageAsync]. */
    class Builder internal constructor() {

        private var service: CaseServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TransactionMonitoringCaseListParams? = null
        private var response: TransactionMonitoringCaseListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseListPageAsync: TransactionMonitoringCaseListPageAsync
        ) = apply {
            service = transactionMonitoringCaseListPageAsync.service
            streamHandlerExecutor = transactionMonitoringCaseListPageAsync.streamHandlerExecutor
            params = transactionMonitoringCaseListPageAsync.params
            response = transactionMonitoringCaseListPageAsync.response
        }

        fun service(service: CaseServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseListPageAsync].
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
        fun build(): TransactionMonitoringCaseListPageAsync =
            TransactionMonitoringCaseListPageAsync(
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

        return other is TransactionMonitoringCaseListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TransactionMonitoringCaseListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
