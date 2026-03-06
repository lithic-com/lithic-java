// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.HoldServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see HoldServiceAsync.list */
class HoldListPageAsync
private constructor(
    private val service: HoldServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: HoldListParams,
    private val response: HoldListPageResponse,
) : PageAsync<Hold> {

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

    override fun nextPage(): CompletableFuture<HoldListPageAsync> = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Hold> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): HoldListParams = params

    /** The response that this page was parsed from. */
    fun response(): HoldListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [HoldListPageAsync].
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

    /** A builder for [HoldListPageAsync]. */
    class Builder internal constructor() {

        private var service: HoldServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: HoldListParams? = null
        private var response: HoldListPageResponse? = null

        @JvmSynthetic
        internal fun from(holdListPageAsync: HoldListPageAsync) = apply {
            service = holdListPageAsync.service
            streamHandlerExecutor = holdListPageAsync.streamHandlerExecutor
            params = holdListPageAsync.params
            response = holdListPageAsync.response
        }

        fun service(service: HoldServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: HoldListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: HoldListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [HoldListPageAsync].
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
        fun build(): HoldListPageAsync =
            HoldListPageAsync(
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

        return other is HoldListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "HoldListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
