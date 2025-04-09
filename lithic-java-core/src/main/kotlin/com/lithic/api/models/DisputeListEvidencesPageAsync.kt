// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.DisputeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [DisputeServiceAsync.listEvidences] */
class DisputeListEvidencesPageAsync
private constructor(
    private val service: DisputeServiceAsync,
    private val params: DisputeListEvidencesParams,
    private val response: DisputeListEvidencesPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<DisputeListEvidencesParams> {
        if (!hasNextPage()) {
            return Optional.empty()
        }

        return Optional.of(
            if (params.endingBefore().isPresent) {
                params
                    .toBuilder()
                    .endingBefore(data().first()._token().getOptional("token"))
                    .build()
            } else {
                params
                    .toBuilder()
                    .startingAfter(data().last()._token().getOptional("token"))
                    .build()
            }
        )
    }

    fun getNextPage(): CompletableFuture<Optional<DisputeListEvidencesPageAsync>> =
        getNextPageParams()
            .map { service.listEvidences(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DisputeListEvidencesPageAsync]. */
    class Builder internal constructor() {

        private var service: DisputeServiceAsync? = null
        private var params: DisputeListEvidencesParams? = null
        private var response: DisputeListEvidencesPageResponse? = null

        @JvmSynthetic
        internal fun from(disputeListEvidencesPageAsync: DisputeListEvidencesPageAsync) = apply {
            service = disputeListEvidencesPageAsync.service
            params = disputeListEvidencesPageAsync.params
            response = disputeListEvidencesPageAsync.response
        }

        fun service(service: DisputeServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DisputeListEvidencesPageAsync =
            DisputeListEvidencesPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DisputeListEvidencesPageAsync) {

        fun forEach(
            action: Predicate<DisputeEvidence>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DisputeListEvidencesPageAsync>>.forEach(
                action: (DisputeEvidence) -> Boolean,
                executor: Executor,
            ): CompletableFuture<Void> =
                thenComposeAsync(
                    { page ->
                        page
                            .filter { it.data().all(action) }
                            .map { it.getNextPage().forEach(action, executor) }
                            .orElseGet { CompletableFuture.completedFuture(null) }
                    },
                    executor,
                )
            return CompletableFuture.completedFuture(Optional.of(firstPage))
                .forEach(action::test, executor)
        }

        fun toList(executor: Executor): CompletableFuture<List<DisputeEvidence>> {
            val values = mutableListOf<DisputeEvidence>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListEvidencesPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListEvidencesPageAsync{service=$service, params=$params, response=$response}"
}
