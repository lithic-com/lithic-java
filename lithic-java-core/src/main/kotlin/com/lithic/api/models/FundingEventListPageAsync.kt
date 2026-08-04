// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.FundingEventServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see FundingEventServiceAsync.list */
class FundingEventListPageAsync
private constructor(
    private val service: FundingEventServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FundingEventListParams,
    private val response: FundingEventListPageResponse,
) : PageAsync<FundingEvent> {

    /**
     * Delegates to [FundingEventListPageResponse], but gracefully handles missing data.
     *
     * @see FundingEventListPageResponse.data
     */
    fun data(): List<FundingEvent> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FundingEventListPageResponse], but gracefully handles missing data.
     *
     * @see FundingEventListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<FundingEvent> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FundingEventListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<FundingEventListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FundingEvent> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FundingEventListParams = params

    /** The response that this page was parsed from. */
    fun response(): FundingEventListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FundingEventListPageAsync].
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

    /** A builder for [FundingEventListPageAsync]. */
    class Builder internal constructor() {

        private var service: FundingEventServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FundingEventListParams? = null
        private var response: FundingEventListPageResponse? = null

        @JvmSynthetic
        internal fun from(fundingEventListPageAsync: FundingEventListPageAsync) = apply {
            service = fundingEventListPageAsync.service
            streamHandlerExecutor = fundingEventListPageAsync.streamHandlerExecutor
            params = fundingEventListPageAsync.params
            response = fundingEventListPageAsync.response
        }

        fun service(service: FundingEventServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FundingEventListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FundingEventListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FundingEventListPageAsync].
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
        fun build(): FundingEventListPageAsync =
            FundingEventListPageAsync(
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

        return other is FundingEventListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FundingEventListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
