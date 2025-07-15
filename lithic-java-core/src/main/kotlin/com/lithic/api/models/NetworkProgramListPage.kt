// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.NetworkProgramService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [NetworkProgramService.list] */
class NetworkProgramListPage
private constructor(
    private val service: NetworkProgramService,
    private val params: NetworkProgramListParams,
    private val response: NetworkProgramListPageResponse,
) : Page<NetworkProgram> {

    /**
     * Delegates to [NetworkProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [NetworkProgramListPageResponse.data]
     */
    fun data(): List<NetworkProgram> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NetworkProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [NetworkProgramListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<NetworkProgram> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): NetworkProgramListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): NetworkProgramListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<NetworkProgram> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): NetworkProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkProgramListPage].
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

    /** A builder for [NetworkProgramListPage]. */
    class Builder internal constructor() {

        private var service: NetworkProgramService? = null
        private var params: NetworkProgramListParams? = null
        private var response: NetworkProgramListPageResponse? = null

        @JvmSynthetic
        internal fun from(networkProgramListPage: NetworkProgramListPage) = apply {
            service = networkProgramListPage.service
            params = networkProgramListPage.params
            response = networkProgramListPage.response
        }

        fun service(service: NetworkProgramService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NetworkProgramListPage].
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
        fun build(): NetworkProgramListPage =
            NetworkProgramListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is NetworkProgramListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "NetworkProgramListPage{service=$service, params=$params, response=$response}"
}
