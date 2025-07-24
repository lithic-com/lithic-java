// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.ExternalPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see ExternalPaymentServiceAsync.list */
class ExternalPaymentListPageAsync
private constructor(
    private val service: ExternalPaymentServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: ExternalPaymentListParams,
    private val response: ExternalPaymentListPageResponse,
) : PageAsync<ExternalPayment> {

    /**
     * Delegates to [ExternalPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalPaymentListPageResponse.data
     */
    fun data(): List<ExternalPayment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalPaymentListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<ExternalPayment> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ExternalPaymentListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<ExternalPaymentListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<ExternalPayment> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): ExternalPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalPaymentListPageAsync].
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

    /** A builder for [ExternalPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalPaymentServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: ExternalPaymentListParams? = null
        private var response: ExternalPaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalPaymentListPageAsync: ExternalPaymentListPageAsync) = apply {
            service = externalPaymentListPageAsync.service
            streamHandlerExecutor = externalPaymentListPageAsync.streamHandlerExecutor
            params = externalPaymentListPageAsync.params
            response = externalPaymentListPageAsync.response
        }

        fun service(service: ExternalPaymentServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalPaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalPaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalPaymentListPageAsync].
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
        fun build(): ExternalPaymentListPageAsync =
            ExternalPaymentListPageAsync(
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

        return /* spotless:off */ other is ExternalPaymentListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "ExternalPaymentListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
