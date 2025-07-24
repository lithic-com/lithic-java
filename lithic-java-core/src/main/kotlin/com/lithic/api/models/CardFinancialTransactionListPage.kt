// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.cards.FinancialTransactionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see FinancialTransactionService.list */
class CardFinancialTransactionListPage
private constructor(
    private val service: FinancialTransactionService,
    private val params: CardFinancialTransactionListParams,
    private val response: CardFinancialTransactionListPageResponse,
) : Page<FinancialTransaction> {

    /**
     * Delegates to [CardFinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see CardFinancialTransactionListPageResponse.data
     */
    fun data(): List<FinancialTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardFinancialTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see CardFinancialTransactionListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<FinancialTransaction> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): CardFinancialTransactionListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CardFinancialTransactionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FinancialTransaction> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardFinancialTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardFinancialTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardFinancialTransactionListPage].
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

    /** A builder for [CardFinancialTransactionListPage]. */
    class Builder internal constructor() {

        private var service: FinancialTransactionService? = null
        private var params: CardFinancialTransactionListParams? = null
        private var response: CardFinancialTransactionListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardFinancialTransactionListPage: CardFinancialTransactionListPage) =
            apply {
                service = cardFinancialTransactionListPage.service
                params = cardFinancialTransactionListPage.params
                response = cardFinancialTransactionListPage.response
            }

        fun service(service: FinancialTransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardFinancialTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardFinancialTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardFinancialTransactionListPage].
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
        fun build(): CardFinancialTransactionListPage =
            CardFinancialTransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardFinancialTransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardFinancialTransactionListPage{service=$service, params=$params, response=$response}"
}
