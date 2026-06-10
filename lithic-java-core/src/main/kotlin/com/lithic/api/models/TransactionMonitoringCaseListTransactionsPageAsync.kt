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

/** @see CaseServiceAsync.listTransactions */
class TransactionMonitoringCaseListTransactionsPageAsync
private constructor(
    private val service: CaseServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TransactionMonitoringCaseListTransactionsParams,
    private val response: TransactionMonitoringCaseListTransactionsPageResponse,
) : PageAsync<CaseTransaction> {

    /**
     * Delegates to [TransactionMonitoringCaseListTransactionsPageResponse], but gracefully handles
     * missing data.
     *
     * @see TransactionMonitoringCaseListTransactionsPageResponse.data
     */
    fun data(): List<CaseTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionMonitoringCaseListTransactionsPageResponse], but gracefully handles
     * missing data.
     *
     * @see TransactionMonitoringCaseListTransactionsPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<CaseTransaction> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransactionMonitoringCaseListTransactionsParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<TransactionMonitoringCaseListTransactionsPageAsync> =
        service.listTransactions(nextPageParams())

    fun autoPager(): AutoPagerAsync<CaseTransaction> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseListTransactionsParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseListTransactionsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseListTransactionsPageAsync].
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

    /** A builder for [TransactionMonitoringCaseListTransactionsPageAsync]. */
    class Builder internal constructor() {

        private var service: CaseServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TransactionMonitoringCaseListTransactionsParams? = null
        private var response: TransactionMonitoringCaseListTransactionsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseListTransactionsPageAsync:
                TransactionMonitoringCaseListTransactionsPageAsync
        ) = apply {
            service = transactionMonitoringCaseListTransactionsPageAsync.service
            streamHandlerExecutor =
                transactionMonitoringCaseListTransactionsPageAsync.streamHandlerExecutor
            params = transactionMonitoringCaseListTransactionsPageAsync.params
            response = transactionMonitoringCaseListTransactionsPageAsync.response
        }

        fun service(service: CaseServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseListTransactionsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseListTransactionsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseListTransactionsPageAsync].
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
        fun build(): TransactionMonitoringCaseListTransactionsPageAsync =
            TransactionMonitoringCaseListTransactionsPageAsync(
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

        return other is TransactionMonitoringCaseListTransactionsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TransactionMonitoringCaseListTransactionsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
