// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.ExternalPaymentServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalPaymentServiceAsync.list] */
class ExternalPaymentListPageAsync
private constructor(
    private val service: ExternalPaymentServiceAsync,
    private val params: ExternalPaymentListParams,
    private val response: ExternalPaymentListPageResponse,
) {

    /**
     * Delegates to [ExternalPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalPaymentListPageResponse.data]
     */
    fun data(): List<ExternalPayment> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalPaymentListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<ExternalPaymentListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ExternalPaymentListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalPaymentServiceAsync? = null
        private var params: ExternalPaymentListParams? = null
        private var response: ExternalPaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalPaymentListPageAsync: ExternalPaymentListPageAsync) = apply {
            service = externalPaymentListPageAsync.service
            params = externalPaymentListPageAsync.params
            response = externalPaymentListPageAsync.response
        }

        fun service(service: ExternalPaymentServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalPaymentListPageAsync =
            ExternalPaymentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExternalPaymentListPageAsync) {

        fun forEach(
            action: Predicate<ExternalPayment>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalPaymentListPageAsync>>.forEach(
                action: (ExternalPayment) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExternalPayment>> {
            val values = mutableListOf<ExternalPayment>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalPaymentListPageAsync{service=$service, params=$params, response=$response}"
}
