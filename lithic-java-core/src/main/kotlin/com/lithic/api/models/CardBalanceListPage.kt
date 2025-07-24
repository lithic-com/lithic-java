// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.cards.BalanceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see BalanceService.list */
class CardBalanceListPage
private constructor(
    private val service: BalanceService,
    private val params: CardBalanceListParams,
    private val response: CardBalanceListPageResponse,
) : Page<BalanceListResponse> {

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see CardBalanceListPageResponse.data
     */
    fun data(): List<BalanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see CardBalanceListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<BalanceListResponse> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): CardBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CardBalanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BalanceListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardBalanceListPage].
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

    /** A builder for [CardBalanceListPage]. */
    class Builder internal constructor() {

        private var service: BalanceService? = null
        private var params: CardBalanceListParams? = null
        private var response: CardBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardBalanceListPage: CardBalanceListPage) = apply {
            service = cardBalanceListPage.service
            params = cardBalanceListPage.params
            response = cardBalanceListPage.response
        }

        fun service(service: BalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardBalanceListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardBalanceListPage].
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
        fun build(): CardBalanceListPage =
            CardBalanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardBalanceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardBalanceListPage{service=$service, params=$params, response=$response}"
}
