// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.DisputeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [DisputeServiceAsync.listEvidences] */
class DisputeListEvidencesPageAsync
private constructor(
    private val service: DisputeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: DisputeListEvidencesParams,
    private val response: DisputeListEvidencesPageResponse,
) : PageAsync<DisputeEvidence> {

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.data]
     */
    fun data(): List<DisputeEvidence> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<DisputeEvidence> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): DisputeListEvidencesParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<DisputeListEvidencesPageAsync> =
        service.listEvidences(nextPageParams())

    fun autoPager(): AutoPagerAsync<DisputeEvidence> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): DisputeListEvidencesParams = params

    /** The response that this page was parsed from. */
    fun response(): DisputeListEvidencesPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DisputeListEvidencesPageAsync].
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

    /** A builder for [DisputeListEvidencesPageAsync]. */
    class Builder internal constructor() {

        private var service: DisputeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: DisputeListEvidencesParams? = null
        private var response: DisputeListEvidencesPageResponse? = null

        @JvmSynthetic
        internal fun from(disputeListEvidencesPageAsync: DisputeListEvidencesPageAsync) = apply {
            service = disputeListEvidencesPageAsync.service
            streamHandlerExecutor = disputeListEvidencesPageAsync.streamHandlerExecutor
            params = disputeListEvidencesPageAsync.params
            response = disputeListEvidencesPageAsync.response
        }

        fun service(service: DisputeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: DisputeListEvidencesParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DisputeListEvidencesPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DisputeListEvidencesPageAsync].
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
        fun build(): DisputeListEvidencesPageAsync =
            DisputeListEvidencesPageAsync(
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

        return /* spotless:off */ other is DisputeListEvidencesPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListEvidencesPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
