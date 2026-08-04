// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.TransferLimitServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TransferLimitServiceAsync.list */
class TransferLimitListPageAsync
private constructor(
    private val service: TransferLimitServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TransferLimitListParams,
    private val response: TransferLimitsResponse,
) : PageAsync<TransferLimitsResponse.TransferLimitItem> {

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

    override fun nextPage(): CompletableFuture<TransferLimitListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<TransferLimitsResponse.TransferLimitItem> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TransferLimitListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransferLimitsResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransferLimitListPageAsync].
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

    /** A builder for [TransferLimitListPageAsync]. */
    class Builder internal constructor() {

        private var service: TransferLimitServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TransferLimitListParams? = null
        private var response: TransferLimitsResponse? = null

        @JvmSynthetic
        internal fun from(transferLimitListPageAsync: TransferLimitListPageAsync) = apply {
            service = transferLimitListPageAsync.service
            streamHandlerExecutor = transferLimitListPageAsync.streamHandlerExecutor
            params = transferLimitListPageAsync.params
            response = transferLimitListPageAsync.response
        }

        fun service(service: TransferLimitServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TransferLimitListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransferLimitsResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TransferLimitListPageAsync].
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
        fun build(): TransferLimitListPageAsync =
            TransferLimitListPageAsync(
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

        return other is TransferLimitListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "TransferLimitListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
