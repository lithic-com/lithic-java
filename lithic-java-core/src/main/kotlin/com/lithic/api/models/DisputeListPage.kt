// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.DisputeService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DisputeService.list */
class DisputeListPage
private constructor(
    private val service: DisputeService,
    private val params: DisputeListParams,
    private val response: DisputeListPageResponse,
) : Page<Dispute> {

    /**
     * Delegates to [DisputeListPageResponse], but gracefully handles missing data.
     *
     * @see DisputeListPageResponse.data
     */
    fun data(): List<Dispute> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DisputeListPageResponse], but gracefully handles missing data.
     *
     * @see DisputeListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<Dispute> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DisputeListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): DisputeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Dispute> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DisputeListParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DisputeListPage].
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

    /** A builder for [DisputeListPage]. */
    class Builder internal constructor() {

        private var service: DisputeService? = null
        private var params: DisputeListParams? = null
        private var response: DisputeListPageResponse? = null

        @JvmSynthetic
        internal fun from(disputeListPage: DisputeListPage) = apply {
            service = disputeListPage.service
            params = disputeListPage.params
            response = disputeListPage.response
        }

        fun service(service: DisputeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DisputeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DisputeListPage].
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
        fun build(): DisputeListPage =
            DisputeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListPage{service=$service, params=$params, response=$response}"
}
