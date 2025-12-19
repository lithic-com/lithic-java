// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.TransferLimitService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TransferLimitService.list */
class TransferLimitListPage
private constructor(
    private val service: TransferLimitService,
    private val params: TransferLimitListParams,
    private val response: TransferLimitsResponse,
) : Page<TransferLimitsResponse.TransferLimitItem> {

    /**
     * Delegates to [TransferLimitsResponse], but gracefully handles missing data.
     *
     * @see TransferLimitsResponse.data
     */
    fun data(): List<TransferLimitsResponse.TransferLimitItem> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransferLimitsResponse], but gracefully handles missing data.
     *
     * @see TransferLimitsResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<TransferLimitsResponse.TransferLimitItem> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): TransferLimitListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): TransferLimitListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<TransferLimitsResponse.TransferLimitItem> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TransferLimitListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransferLimitsResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransferLimitListPage].
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

    /** A builder for [TransferLimitListPage]. */
    class Builder internal constructor() {

        private var service: TransferLimitService? = null
        private var params: TransferLimitListParams? = null
        private var response: TransferLimitsResponse? = null

        @JvmSynthetic
        internal fun from(transferLimitListPage: TransferLimitListPage) = apply {
            service = transferLimitListPage.service
            params = transferLimitListPage.params
            response = transferLimitListPage.response
        }

        fun service(service: TransferLimitService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransferLimitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransferLimitsResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TransferLimitListPage].
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
        fun build(): TransferLimitListPage =
            TransferLimitListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TransferLimitListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TransferLimitListPage{service=$service, params=$params, response=$response}"
}
