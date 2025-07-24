// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.LoanTapeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see LoanTapeService.list */
class FinancialAccountLoanTapeListPage
private constructor(
    private val service: LoanTapeService,
    private val params: FinancialAccountLoanTapeListParams,
    private val response: FinancialAccountLoanTapeListPageResponse,
) : Page<LoanTape> {

    /**
     * Delegates to [FinancialAccountLoanTapeListPageResponse], but gracefully handles missing data.
     *
     * @see FinancialAccountLoanTapeListPageResponse.data
     */
    fun data(): List<LoanTape> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountLoanTapeListPageResponse], but gracefully handles missing data.
     *
     * @see FinancialAccountLoanTapeListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<LoanTape> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountLoanTapeListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): FinancialAccountLoanTapeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LoanTape> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountLoanTapeListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountLoanTapeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountLoanTapeListPage].
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

    /** A builder for [FinancialAccountLoanTapeListPage]. */
    class Builder internal constructor() {

        private var service: LoanTapeService? = null
        private var params: FinancialAccountLoanTapeListParams? = null
        private var response: FinancialAccountLoanTapeListPageResponse? = null

        @JvmSynthetic
        internal fun from(financialAccountLoanTapeListPage: FinancialAccountLoanTapeListPage) =
            apply {
                service = financialAccountLoanTapeListPage.service
                params = financialAccountLoanTapeListPage.params
                response = financialAccountLoanTapeListPage.response
            }

        fun service(service: LoanTapeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountLoanTapeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountLoanTapeListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountLoanTapeListPage].
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
        fun build(): FinancialAccountLoanTapeListPage =
            FinancialAccountLoanTapeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountLoanTapeListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountLoanTapeListPage{service=$service, params=$params, response=$response}"
}
