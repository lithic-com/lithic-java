// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.DisputesV2ServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see DisputesV2ServiceAsync.list */
class DisputesV2ListPageAsync
private constructor(
    private val service: DisputesV2ServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DisputesV2ListParams,
    private val response: DisputesV2ListPageResponse,
) : PageAsync<DisputeV2> {

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

    override fun nextPage(): CompletableFuture<DisputesV2ListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DisputeV2> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DisputesV2ListParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputesV2ListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DisputesV2ListPageAsync].
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

    /** A builder for [DisputesV2ListPageAsync]. */
    class Builder internal constructor() {

        private var service: DisputesV2ServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DisputesV2ListParams? = null
        private var response: DisputesV2ListPageResponse? = null

        @JvmSynthetic
        internal fun from(disputesV2ListPageAsync: DisputesV2ListPageAsync) = apply {
            service = disputesV2ListPageAsync.service
            streamHandlerExecutor = disputesV2ListPageAsync.streamHandlerExecutor
            params = disputesV2ListPageAsync.params
            response = disputesV2ListPageAsync.response
        }

        fun service(service: DisputesV2ServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DisputesV2ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputesV2ListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DisputesV2ListPageAsync].
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
        fun build(): DisputesV2ListPageAsync =
            DisputesV2ListPageAsync(
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

        return other is DisputesV2ListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "DisputesV2ListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
