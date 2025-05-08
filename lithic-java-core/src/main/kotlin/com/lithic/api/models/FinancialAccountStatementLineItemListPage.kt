// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.financialAccounts.statements.LineItemService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [LineItemService.list] */
class FinancialAccountStatementLineItemListPage
private constructor(
    private val service: LineItemService,
    private val params: FinancialAccountStatementLineItemListParams,
    private val response: StatementLineItems,
) : Page<StatementLineItems.StatementLineItemResponse> {

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see [StatementLineItems.data]
     */
    fun data(): List<StatementLineItems.StatementLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see [StatementLineItems.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<StatementLineItems.StatementLineItemResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountStatementLineItemListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): FinancialAccountStatementLineItemListPage =
        service.list(nextPageParams())

    fun autoPager(): AutoPager<StatementLineItems.StatementLineItemResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountStatementLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): StatementLineItems = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountStatementLineItemListPage].
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

    /** A builder for [FinancialAccountStatementLineItemListPage]. */
    class Builder internal constructor() {

        private var service: LineItemService? = null
        private var params: FinancialAccountStatementLineItemListParams? = null
        private var response: StatementLineItems? = null

        @JvmSynthetic
        internal fun from(
            financialAccountStatementLineItemListPage: FinancialAccountStatementLineItemListPage
        ) = apply {
            service = financialAccountStatementLineItemListPage.service
            params = financialAccountStatementLineItemListPage.params
            response = financialAccountStatementLineItemListPage.response
        }

        fun service(service: LineItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountStatementLineItemListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: StatementLineItems) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FinancialAccountStatementLineItemListPage].
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
        fun build(): FinancialAccountStatementLineItemListPage =
            FinancialAccountStatementLineItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementLineItemListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementLineItemListPage{service=$service, params=$params, response=$response}"
}
