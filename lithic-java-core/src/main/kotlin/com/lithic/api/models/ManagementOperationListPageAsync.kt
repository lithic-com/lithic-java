// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.ManagementOperationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [ManagementOperationServiceAsync.list] */
class ManagementOperationListPageAsync
private constructor(
    private val service: ManagementOperationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ManagementOperationListParams,
    private val response: ManagementOperationListPageResponse,
) : PageAsync<ManagementOperationTransaction> {

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.data]
     */
    fun data(): List<ManagementOperationTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<ManagementOperationTransaction> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ManagementOperationListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<ManagementOperationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ManagementOperationTransaction> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ManagementOperationListParams = params

    /** The response that this page was parsed from. */
    fun response(): ManagementOperationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ManagementOperationListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ManagementOperationListPageAsync]. */
    class Builder internal constructor() {

        private var service: ManagementOperationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ManagementOperationListParams? = null
        private var response: ManagementOperationListPageResponse? = null

        @JvmSynthetic
        internal fun from(managementOperationListPageAsync: ManagementOperationListPageAsync) =
            apply {
                service = managementOperationListPageAsync.service
                streamHandlerExecutor = managementOperationListPageAsync.streamHandlerExecutor
                params = managementOperationListPageAsync.params
                response = managementOperationListPageAsync.response
            }

        fun service(service: ManagementOperationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ManagementOperationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ManagementOperationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ManagementOperationListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ManagementOperationListPageAsync =
            ManagementOperationListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ManagementOperationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
