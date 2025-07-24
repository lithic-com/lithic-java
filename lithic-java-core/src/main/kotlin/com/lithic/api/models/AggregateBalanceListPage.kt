// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.AggregateBalanceService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AggregateBalanceService.list */
class AggregateBalanceListPage
private constructor(
    private val service: AggregateBalanceService,
    private val params: AggregateBalanceListParams,
    private val response: AggregateBalanceListPageResponse,
) : Page<AggregateBalance> {

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see AggregateBalanceListPageResponse.data
     */
    fun data(): List<AggregateBalance> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AggregateBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see AggregateBalanceListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<AggregateBalance> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): AggregateBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AggregateBalanceListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AggregateBalance> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AggregateBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): AggregateBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AggregateBalanceListPage].
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

    /** A builder for [AggregateBalanceListPage]. */
    class Builder internal constructor() {

        private var service: AggregateBalanceService? = null
        private var params: AggregateBalanceListParams? = null
        private var response: AggregateBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(aggregateBalanceListPage: AggregateBalanceListPage) = apply {
            service = aggregateBalanceListPage.service
            params = aggregateBalanceListPage.params
            response = aggregateBalanceListPage.response
        }

        fun service(service: AggregateBalanceService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AggregateBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AggregateBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AggregateBalanceListPage].
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
        fun build(): AggregateBalanceListPage =
            AggregateBalanceListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AggregateBalanceListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AggregateBalanceListPage{service=$service, params=$params, response=$response}"
}
