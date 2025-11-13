// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.DisputesV2Service
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see DisputesV2Service.list */
class DisputesV2ListPage
private constructor(
    private val service: DisputesV2Service,
    private val params: DisputesV2ListParams,
    private val response: DisputesV2ListPageResponse,
) : Page<DisputeV2> {

    /**
     * Delegates to [DisputesV2ListPageResponse], but gracefully handles missing data.
     *
     * @see DisputesV2ListPageResponse.data
     */
    fun data(): List<DisputeV2> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DisputesV2ListPageResponse], but gracefully handles missing data.
     *
     * @see DisputesV2ListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<DisputeV2> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DisputesV2ListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): DisputesV2ListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<DisputeV2> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DisputesV2ListParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputesV2ListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DisputesV2ListPage].
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

    /** A builder for [DisputesV2ListPage]. */
    class Builder internal constructor() {

        private var service: DisputesV2Service? = null
        private var params: DisputesV2ListParams? = null
        private var response: DisputesV2ListPageResponse? = null

        @JvmSynthetic
        internal fun from(disputesV2ListPage: DisputesV2ListPage) = apply {
            service = disputesV2ListPage.service
            params = disputesV2ListPage.params
            response = disputesV2ListPage.response
        }

        fun service(service: DisputesV2Service) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DisputesV2ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputesV2ListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DisputesV2ListPage].
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
        fun build(): DisputesV2ListPage =
            DisputesV2ListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DisputesV2ListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DisputesV2ListPage{service=$service, params=$params, response=$response}"
}
