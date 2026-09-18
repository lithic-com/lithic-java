// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.InstallmentPlanService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see InstallmentPlanService.list */
class FinancialAccountInstallmentPlanListPage
private constructor(
    private val service: InstallmentPlanService,
    private val params: FinancialAccountInstallmentPlanListParams,
    private val response: FinancialAccountInstallmentPlanListPageResponse,
) : Page<InstallmentPlan> {

    /**
     * Delegates to [FinancialAccountInstallmentPlanListPageResponse], but gracefully handles
     * missing data.
     *
     * @see FinancialAccountInstallmentPlanListPageResponse.data
     */
    fun data(): List<InstallmentPlan> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountInstallmentPlanListPageResponse], but gracefully handles
     * missing data.
     *
     * @see FinancialAccountInstallmentPlanListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<InstallmentPlan> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountInstallmentPlanListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): FinancialAccountInstallmentPlanListPage =
        service.list(nextPageParams())

    fun autoPager(): AutoPager<InstallmentPlan> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountInstallmentPlanListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountInstallmentPlanListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInstallmentPlanListPage].
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

    /** A builder for [FinancialAccountInstallmentPlanListPage]. */
    class Builder internal constructor() {

        private var service: InstallmentPlanService? = null
        private var params: FinancialAccountInstallmentPlanListParams? = null
        private var response: FinancialAccountInstallmentPlanListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            financialAccountInstallmentPlanListPage: FinancialAccountInstallmentPlanListPage
        ) = apply {
            service = financialAccountInstallmentPlanListPage.service
            params = financialAccountInstallmentPlanListPage.params
            response = financialAccountInstallmentPlanListPage.response
        }

        fun service(service: InstallmentPlanService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountInstallmentPlanListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountInstallmentPlanListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountInstallmentPlanListPage].
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
        fun build(): FinancialAccountInstallmentPlanListPage =
            FinancialAccountInstallmentPlanListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInstallmentPlanListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FinancialAccountInstallmentPlanListPage{service=$service, params=$params, response=$response}"
}
