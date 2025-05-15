// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.FundingEventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [FundingEventService.list] */
class FundingEventListPage
private constructor(
    private val service: FundingEventService,
    private val params: FundingEventListParams,
    private val response: FundingEventListPageResponse,
) : Page<FundingEventListResponse> {

    /**
     * Delegates to [FundingEventListPageResponse], but gracefully handles missing data.
     *
     * @see [FundingEventListPageResponse.data]
     */
    fun data(): List<FundingEventListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FundingEventListPageResponse], but gracefully handles missing data.
     *
     * @see [FundingEventListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<FundingEventListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FundingEventListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): FundingEventListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<FundingEventListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FundingEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): FundingEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FundingEventListPage].
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

    /** A builder for [FundingEventListPage]. */
    class Builder internal constructor() {

        private var service: FundingEventService? = null
        private var params: FundingEventListParams? = null
        private var response: FundingEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(fundingEventListPage: FundingEventListPage) = apply {
            service = fundingEventListPage.service
            params = fundingEventListPage.params
            response = fundingEventListPage.response
        }

        fun service(service: FundingEventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FundingEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FundingEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FundingEventListPage].
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
        fun build(): FundingEventListPage =
            FundingEventListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FundingEventListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FundingEventListPage{service=$service, params=$params, response=$response}"
}
