// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.NetworkProgramServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see NetworkProgramServiceAsync.list */
class NetworkProgramListPageAsync
private constructor(
    private val service: NetworkProgramServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: NetworkProgramListParams,
    private val response: NetworkProgramListPageResponse,
) : PageAsync<NetworkProgram> {

    /**
     * Delegates to [NetworkProgramListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkProgramListPageResponse.data
     */
    fun data(): List<NetworkProgram> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [NetworkProgramListPageResponse], but gracefully handles missing data.
     *
     * @see NetworkProgramListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<NetworkProgram> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): NetworkProgramListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<NetworkProgramListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<NetworkProgram> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): NetworkProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): NetworkProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [NetworkProgramListPageAsync].
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

    /** A builder for [NetworkProgramListPageAsync]. */
    class Builder internal constructor() {

        private var service: NetworkProgramServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: NetworkProgramListParams? = null
        private var response: NetworkProgramListPageResponse? = null

        @JvmSynthetic
        internal fun from(networkProgramListPageAsync: NetworkProgramListPageAsync) = apply {
            service = networkProgramListPageAsync.service
            streamHandlerExecutor = networkProgramListPageAsync.streamHandlerExecutor
            params = networkProgramListPageAsync.params
            response = networkProgramListPageAsync.response
        }

        fun service(service: NetworkProgramServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: NetworkProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: NetworkProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [NetworkProgramListPageAsync].
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
        fun build(): NetworkProgramListPageAsync =
            NetworkProgramListPageAsync(
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

        return other is NetworkProgramListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "NetworkProgramListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
