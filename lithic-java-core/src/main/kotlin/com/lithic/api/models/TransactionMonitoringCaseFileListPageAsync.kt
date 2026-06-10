// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.transactionMonitoring.cases.FileServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FileServiceAsync.list */
class TransactionMonitoringCaseFileListPageAsync
private constructor(
    private val service: FileServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TransactionMonitoringCaseFileListParams,
    private val response: TransactionMonitoringCaseFileListPageResponse,
) : PageAsync<CaseFile> {

    /**
     * Delegates to [TransactionMonitoringCaseFileListPageResponse], but gracefully handles missing
     * data.
     *
     * @see TransactionMonitoringCaseFileListPageResponse.data
     */
    fun data(): List<CaseFile> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionMonitoringCaseFileListPageResponse], but gracefully handles missing
     * data.
     *
     * @see TransactionMonitoringCaseFileListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<CaseFile> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransactionMonitoringCaseFileListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<TransactionMonitoringCaseFileListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CaseFile> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseFileListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseFileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseFileListPageAsync].
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

    /** A builder for [TransactionMonitoringCaseFileListPageAsync]. */
    class Builder internal constructor() {

        private var service: FileServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TransactionMonitoringCaseFileListParams? = null
        private var response: TransactionMonitoringCaseFileListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseFileListPageAsync: TransactionMonitoringCaseFileListPageAsync
        ) = apply {
            service = transactionMonitoringCaseFileListPageAsync.service
            streamHandlerExecutor = transactionMonitoringCaseFileListPageAsync.streamHandlerExecutor
            params = transactionMonitoringCaseFileListPageAsync.params
            response = transactionMonitoringCaseFileListPageAsync.response
        }

        fun service(service: FileServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseFileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseFileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseFileListPageAsync].
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
        fun build(): TransactionMonitoringCaseFileListPageAsync =
            TransactionMonitoringCaseFileListPageAsync(
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

        return other is TransactionMonitoringCaseFileListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TransactionMonitoringCaseFileListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
