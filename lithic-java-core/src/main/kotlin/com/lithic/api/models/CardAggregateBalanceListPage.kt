// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.cards.AggregateBalanceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [AggregateBalanceService.list] */
class CardAggregateBalanceListPage
private constructor(
    private val service: AggregateBalanceService,
    private val params: CardAggregateBalanceListParams,
    private val response: CardAggregateBalanceListPageResponse,
) : Page<AggregateBalanceListResponse> {

    /**
     * Delegates to [CardAggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardAggregateBalanceListPageResponse.data]
     */
    fun data(): List<AggregateBalanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardAggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [CardAggregateBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<AggregateBalanceListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CardAggregateBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CardAggregateBalanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AggregateBalanceListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardAggregateBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardAggregateBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardAggregateBalanceListPage].
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

    /** A builder for [CardAggregateBalanceListPage]. */
    class Builder internal constructor() {

        private var service: AggregateBalanceService? = null
        private var params: CardAggregateBalanceListParams? = null
        private var response: CardAggregateBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardAggregateBalanceListPage: CardAggregateBalanceListPage) = apply {
            service = cardAggregateBalanceListPage.service
            params = cardAggregateBalanceListPage.params
            response = cardAggregateBalanceListPage.response
        }

        fun service(service: AggregateBalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardAggregateBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardAggregateBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardAggregateBalanceListPage].
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
        fun build(): CardAggregateBalanceListPage =
            CardAggregateBalanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardAggregateBalanceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardAggregateBalanceListPage{service=$service, params=$params, response=$response}"
}
