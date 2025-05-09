// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.DigitalCardArtServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [DigitalCardArtServiceAsync.list] */
class DigitalCardArtListPageAsync
private constructor(
    private val service: DigitalCardArtServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DigitalCardArtListParams,
    private val response: DigitalCardArtListPageResponse,
) : PageAsync<DigitalCardArt> {

    /**
     * Delegates to [DigitalCardArtListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardArtListPageResponse.data]
     */
    fun data(): List<DigitalCardArt> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalCardArtListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardArtListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<DigitalCardArt> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DigitalCardArtListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<DigitalCardArtListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DigitalCardArt> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DigitalCardArtListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalCardArtListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DigitalCardArtListPageAsync].
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

    /** A builder for [DigitalCardArtListPageAsync]. */
    class Builder internal constructor() {

        private var service: DigitalCardArtServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DigitalCardArtListParams? = null
        private var response: DigitalCardArtListPageResponse? = null

        @JvmSynthetic
        internal fun from(digitalCardArtListPageAsync: DigitalCardArtListPageAsync) = apply {
            service = digitalCardArtListPageAsync.service
            streamHandlerExecutor = digitalCardArtListPageAsync.streamHandlerExecutor
            params = digitalCardArtListPageAsync.params
            response = digitalCardArtListPageAsync.response
        }

        fun service(service: DigitalCardArtServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalCardArtListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalCardArtListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DigitalCardArtListPageAsync].
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
        fun build(): DigitalCardArtListPageAsync =
            DigitalCardArtListPageAsync(
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

        return /* spotless:off */ other is DigitalCardArtListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardArtListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
