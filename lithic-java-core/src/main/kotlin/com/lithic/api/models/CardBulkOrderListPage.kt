// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.CardBulkOrderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see CardBulkOrderService.list */
class CardBulkOrderListPage
private constructor(
    private val service: CardBulkOrderService,
    private val params: CardBulkOrderListParams,
    private val response: CardBulkOrderListPageResponse,
) : Page<CardBulkOrder> {

    /**
     * Delegates to [CardBulkOrderListPageResponse], but gracefully handles missing data.
     *
     * @see CardBulkOrderListPageResponse.data
     */
    fun data(): List<CardBulkOrder> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardBulkOrderListPageResponse], but gracefully handles missing data.
     *
     * @see CardBulkOrderListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<CardBulkOrder> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CardBulkOrderListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CardBulkOrderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CardBulkOrder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardBulkOrderListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardBulkOrderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardBulkOrderListPage].
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

    /** A builder for [CardBulkOrderListPage]. */
    class Builder internal constructor() {

        private var service: CardBulkOrderService? = null
        private var params: CardBulkOrderListParams? = null
        private var response: CardBulkOrderListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardBulkOrderListPage: CardBulkOrderListPage) = apply {
            service = cardBulkOrderListPage.service
            params = cardBulkOrderListPage.params
            response = cardBulkOrderListPage.response
        }

        fun service(service: CardBulkOrderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardBulkOrderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardBulkOrderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardBulkOrderListPage].
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
        fun build(): CardBulkOrderListPage =
            CardBulkOrderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardBulkOrderListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CardBulkOrderListPage{service=$service, params=$params, response=$response}"
}
