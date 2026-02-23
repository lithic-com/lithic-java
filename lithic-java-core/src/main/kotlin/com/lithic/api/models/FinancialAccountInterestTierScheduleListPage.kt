// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.InterestTierScheduleService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InterestTierScheduleService.list */
class FinancialAccountInterestTierScheduleListPage
private constructor(
    private val service: InterestTierScheduleService,
    private val params: FinancialAccountInterestTierScheduleListParams,
    private val response: FinancialAccountInterestTierScheduleListPageResponse,
) : Page<InterestTierSchedule> {

    /**
     * Delegates to [FinancialAccountInterestTierScheduleListPageResponse], but gracefully handles
     * missing data.
     *
     * @see FinancialAccountInterestTierScheduleListPageResponse.data
     */
    fun data(): List<InterestTierSchedule> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountInterestTierScheduleListPageResponse], but gracefully handles
     * missing data.
     *
     * @see FinancialAccountInterestTierScheduleListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<InterestTierSchedule> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): FinancialAccountInterestTierScheduleListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): FinancialAccountInterestTierScheduleListPage =
        service.list(nextPageParams())

    fun autoPager(): AutoPager<InterestTierSchedule> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountInterestTierScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountInterestTierScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInterestTierScheduleListPage].
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

    /** A builder for [FinancialAccountInterestTierScheduleListPage]. */
    class Builder internal constructor() {

        private var service: InterestTierScheduleService? = null
        private var params: FinancialAccountInterestTierScheduleListParams? = null
        private var response: FinancialAccountInterestTierScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            financialAccountInterestTierScheduleListPage:
                FinancialAccountInterestTierScheduleListPage
        ) = apply {
            service = financialAccountInterestTierScheduleListPage.service
            params = financialAccountInterestTierScheduleListPage.params
            response = financialAccountInterestTierScheduleListPage.response
        }

        fun service(service: InterestTierScheduleService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountInterestTierScheduleListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountInterestTierScheduleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountInterestTierScheduleListPage].
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
        fun build(): FinancialAccountInterestTierScheduleListPage =
            FinancialAccountInterestTierScheduleListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInterestTierScheduleListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FinancialAccountInterestTierScheduleListPage{service=$service, params=$params, response=$response}"
}
