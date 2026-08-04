// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.HoldService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see HoldService.list */
class HoldListPage
private constructor(
    private val service: HoldService,
    private val params: HoldListParams,
    private val response: HoldListPageResponse,
) : Page<Hold> {

    /**
     * Delegates to [HoldListPageResponse], but gracefully handles missing data.
     *
     * @see HoldListPageResponse.data
     */
    fun data(): List<Hold> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [HoldListPageResponse], but gracefully handles missing data.
     *
     * @see HoldListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<Hold> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): HoldListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): HoldListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Hold> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): HoldListParams = params

    /** The response that this page was parsed from. */
    fun response(): HoldListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HoldListPage].
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

    /** A builder for [HoldListPage]. */
    class Builder internal constructor() {

        private var service: HoldService? = null
        private var params: HoldListParams? = null
        private var response: HoldListPageResponse? = null

        @JvmSynthetic
        internal fun from(holdListPage: HoldListPage) = apply {
            service = holdListPage.service
            params = holdListPage.params
            response = holdListPage.response
        }

        fun service(service: HoldService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: HoldListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HoldListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [HoldListPage].
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
        fun build(): HoldListPage =
            HoldListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is HoldListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() = "HoldListPage{service=$service, params=$params, response=$response}"
}
