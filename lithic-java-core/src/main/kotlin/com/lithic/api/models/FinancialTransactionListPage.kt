// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.FinancialTransactionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [FinancialTransactionService.list] */
class FinancialTransactionListPage
private constructor(
    private val service: FinancialTransactionService,
    private val params: FinancialTransactionListParams,
    private val response: FinancialTransactionListPageResponse,
) : Page<FinancialTransaction> {

    /**
     * Delegates to [FinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialTransactionListPageResponse.data]
     */
    fun data(): List<FinancialTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialTransactionListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<FinancialTransaction> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): FinancialTransactionListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): FinancialTransactionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FinancialTransaction> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FinancialTransactionListPage].
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

    /** A builder for [FinancialTransactionListPage]. */
    class Builder internal constructor() {

        private var service: FinancialTransactionService? = null
        private var params: FinancialTransactionListParams? = null
        private var response: FinancialTransactionListPageResponse? = null

        @JvmSynthetic
        internal fun from(financialTransactionListPage: FinancialTransactionListPage) = apply {
            service = financialTransactionListPage.service
            params = financialTransactionListPage.params
            response = financialTransactionListPage.response
        }

        fun service(service: FinancialTransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialTransactionListPage].
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
        fun build(): FinancialTransactionListPage =
            FinancialTransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialTransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialTransactionListPage{service=$service, params=$params, response=$response}"
}
