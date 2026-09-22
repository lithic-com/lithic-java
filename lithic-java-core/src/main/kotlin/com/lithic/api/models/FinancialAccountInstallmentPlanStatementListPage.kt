// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.installmentPlans.StatementService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see StatementService.list */
class FinancialAccountInstallmentPlanStatementListPage
private constructor(
    private val service: StatementService,
    private val params: FinancialAccountInstallmentPlanStatementListParams,
    private val response: FinancialAccountInstallmentPlanStatementListPageResponse,
) : Page<InstallmentPlanStatement> {

    /**
     * Delegates to [FinancialAccountInstallmentPlanStatementListPageResponse], but gracefully
     * handles missing data.
     *
     * @see FinancialAccountInstallmentPlanStatementListPageResponse.data
     */
    fun data(): List<InstallmentPlanStatement> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountInstallmentPlanStatementListPageResponse], but gracefully
     * handles missing data.
     *
     * @see FinancialAccountInstallmentPlanStatementListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<InstallmentPlanStatement> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountInstallmentPlanStatementListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): FinancialAccountInstallmentPlanStatementListPage =
        service.list(nextPageParams())

    fun autoPager(): AutoPager<InstallmentPlanStatement> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountInstallmentPlanStatementListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountInstallmentPlanStatementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInstallmentPlanStatementListPage].
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

    /** A builder for [FinancialAccountInstallmentPlanStatementListPage]. */
    class Builder internal constructor() {

        private var service: StatementService? = null
        private var params: FinancialAccountInstallmentPlanStatementListParams? = null
        private var response: FinancialAccountInstallmentPlanStatementListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            financialAccountInstallmentPlanStatementListPage:
                FinancialAccountInstallmentPlanStatementListPage
        ) = apply {
            service = financialAccountInstallmentPlanStatementListPage.service
            params = financialAccountInstallmentPlanStatementListPage.params
            response = financialAccountInstallmentPlanStatementListPage.response
        }

        fun service(service: StatementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountInstallmentPlanStatementListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountInstallmentPlanStatementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountInstallmentPlanStatementListPage].
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
        fun build(): FinancialAccountInstallmentPlanStatementListPage =
            FinancialAccountInstallmentPlanStatementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FinancialAccountInstallmentPlanStatementListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FinancialAccountInstallmentPlanStatementListPage{service=$service, params=$params, response=$response}"
}
