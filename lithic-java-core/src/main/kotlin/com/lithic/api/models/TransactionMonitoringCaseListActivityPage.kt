// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.transactionMonitoring.CaseService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CaseService.listActivity */
class TransactionMonitoringCaseListActivityPage
private constructor(
    private val service: CaseService,
    private val params: TransactionMonitoringCaseListActivityParams,
    private val response: TransactionMonitoringCaseListActivityPageResponse,
) : Page<CaseActivityEntry> {

    /**
     * Delegates to [TransactionMonitoringCaseListActivityPageResponse], but gracefully handles
     * missing data.
     *
     * @see TransactionMonitoringCaseListActivityPageResponse.data
     */
    fun data(): List<CaseActivityEntry> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionMonitoringCaseListActivityPageResponse], but gracefully handles
     * missing data.
     *
     * @see TransactionMonitoringCaseListActivityPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<CaseActivityEntry> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TransactionMonitoringCaseListActivityParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): TransactionMonitoringCaseListActivityPage =
        service.listActivity(nextPageParams())

    fun autoPager(): AutoPager<CaseActivityEntry> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseListActivityParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseListActivityPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseListActivityPage].
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

    /** A builder for [TransactionMonitoringCaseListActivityPage]. */
    class Builder internal constructor() {

        private var service: CaseService? = null
        private var params: TransactionMonitoringCaseListActivityParams? = null
        private var response: TransactionMonitoringCaseListActivityPageResponse? = null

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseListActivityPage: TransactionMonitoringCaseListActivityPage
        ) = apply {
            service = transactionMonitoringCaseListActivityPage.service
            params = transactionMonitoringCaseListActivityPage.params
            response = transactionMonitoringCaseListActivityPage.response
        }

        fun service(service: CaseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseListActivityParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseListActivityPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseListActivityPage].
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
        fun build(): TransactionMonitoringCaseListActivityPage =
            TransactionMonitoringCaseListActivityPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseListActivityPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransactionMonitoringCaseListActivityPage{service=$service, params=$params, response=$response}"
}
