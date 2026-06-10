// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.transactionMonitoring.CaseService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CaseService.listTransactions */
class TransactionMonitoringCaseListTransactionsPage
private constructor(
    private val service: CaseService,
    private val params: TransactionMonitoringCaseListTransactionsParams,
    private val response: TransactionMonitoringCaseListTransactionsPageResponse,
) : Page<CaseTransaction> {

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

    override fun nextPage(): TransactionMonitoringCaseListTransactionsPage =
        service.listTransactions(nextPageParams())

    fun autoPager(): AutoPager<CaseTransaction> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionMonitoringCaseListTransactionsParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionMonitoringCaseListTransactionsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TransactionMonitoringCaseListTransactionsPage].
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

    /** A builder for [TransactionMonitoringCaseListTransactionsPage]. */
    class Builder internal constructor() {

        private var service: CaseService? = null
        private var params: TransactionMonitoringCaseListTransactionsParams? = null
        private var response: TransactionMonitoringCaseListTransactionsPageResponse? = null

        @JvmSynthetic
        internal fun from(
            transactionMonitoringCaseListTransactionsPage:
                TransactionMonitoringCaseListTransactionsPage
        ) = apply {
            service = transactionMonitoringCaseListTransactionsPage.service
            params = transactionMonitoringCaseListTransactionsPage.params
            response = transactionMonitoringCaseListTransactionsPage.response
        }

        fun service(service: CaseService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionMonitoringCaseListTransactionsParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: TransactionMonitoringCaseListTransactionsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [TransactionMonitoringCaseListTransactionsPage].
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
        fun build(): TransactionMonitoringCaseListTransactionsPage =
            TransactionMonitoringCaseListTransactionsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransactionMonitoringCaseListTransactionsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransactionMonitoringCaseListTransactionsPage{service=$service, params=$params, response=$response}"
}
