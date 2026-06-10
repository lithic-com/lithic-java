// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.transactionMonitoring.cases.FileService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FileService.list */
class TransactionMonitoringCaseFileListPage
private constructor(
    private val service: FileService,
    private val params: TransactionMonitoringCaseFileListParams,
    private val response: TransactionMonitoringCaseFileListPageResponse,
) : Page<CaseFile> {

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

    override fun nextPage(): TransactionMonitoringCaseFileListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CaseFile> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseFileListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseFileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseFileListPage].
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

    /** A builder for [TransactionMonitoringCaseFileListPage]. */
    class Builder internal constructor() {

        private var service: FileService? = null
        private var params: TransactionMonitoringCaseFileListParams? = null
        private var response: TransactionMonitoringCaseFileListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseFileListPage: TransactionMonitoringCaseFileListPage
        ) = apply {
            service = transactionMonitoringCaseFileListPage.service
            params = transactionMonitoringCaseFileListPage.params
            response = transactionMonitoringCaseFileListPage.response
        }

        fun service(service: FileService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseFileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseFileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseFileListPage].
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
        fun build(): TransactionMonitoringCaseFileListPage =
            TransactionMonitoringCaseFileListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseFileListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransactionMonitoringCaseFileListPage{service=$service, params=$params, response=$response}"
}
