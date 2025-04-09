// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.DigitalCardArtServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [DigitalCardArtServiceAsync.list] */
class DigitalCardArtListPageAsync
private constructor(
    private val service: DigitalCardArtServiceAsync,
    private val params: DigitalCardArtListParams,
    private val response: DigitalCardArtListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<DigitalCardArtListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<DigitalCardArtListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [DigitalCardArtListPageAsync]. */
    class Builder internal constructor() {

        private var service: DigitalCardArtServiceAsync? = null
        private var params: DigitalCardArtListParams? = null
        private var response: DigitalCardArtListPageResponse? = null

        @JvmSynthetic
        internal fun from(digitalCardArtListPageAsync: DigitalCardArtListPageAsync) = apply {
            service = digitalCardArtListPageAsync.service
            params = digitalCardArtListPageAsync.params
            response = digitalCardArtListPageAsync.response
        }

        fun service(service: DigitalCardArtServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalCardArtListPageAsync =
            DigitalCardArtListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DigitalCardArtListPageAsync) {

        fun forEach(
            action: Predicate<DigitalCardArt>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DigitalCardArtListPageAsync>>.forEach(
                action: (DigitalCardArt) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DigitalCardArt>> {
            val values = mutableListOf<DigitalCardArt>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardArtListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardArtListPageAsync{service=$service, params=$params, response=$response}"
}
