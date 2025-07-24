// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.BalanceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BalanceService.list */
class FinancialAccountBalanceListPage
private constructor(
    private val service: BalanceService,
    private val params: FinancialAccountBalanceListParams,
    private val response: FinancialAccountBalanceListPageResponse,
) : Page<BalanceListResponse> {

    /**
     * Delegates to [FinancialAccountBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see FinancialAccountBalanceListPageResponse.data
     */
    fun data(): List<BalanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see FinancialAccountBalanceListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<BalanceListResponse> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): FinancialAccountBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): FinancialAccountBalanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BalanceListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountBalanceListPage].
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

    /** A builder for [FinancialAccountBalanceListPage]. */
    class Builder internal constructor() {

        private var service: BalanceService? = null
        private var params: FinancialAccountBalanceListParams? = null
        private var response: FinancialAccountBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(financialAccountBalanceListPage: FinancialAccountBalanceListPage) =
            apply {
                service = financialAccountBalanceListPage.service
                params = financialAccountBalanceListPage.params
                response = financialAccountBalanceListPage.response
            }

        fun service(service: BalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountBalanceListPage].
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
        fun build(): FinancialAccountBalanceListPage =
            FinancialAccountBalanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountBalanceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountBalanceListPage{service=$service, params=$params, response=$response}"
}
