// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.ExternalPaymentService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalPaymentService.list] */
class ExternalPaymentListPage
private constructor(
    private val service: ExternalPaymentService,
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

    fun getNextPage(): Optional<ExternalPaymentListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalPaymentListPage].
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

    /** A builder for [ExternalPaymentListPage]. */
    class Builder internal constructor() {

        private var service: ExternalPaymentService? = null
        private var params: ExternalPaymentListParams? = null
        private var response: ExternalPaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalPaymentListPage: ExternalPaymentListPage) = apply {
            service = externalPaymentListPage.service
            params = externalPaymentListPage.params
            response = externalPaymentListPage.response
        }

        fun service(service: ExternalPaymentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalPaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalPaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalPaymentListPage].
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
        fun build(): ExternalPaymentListPage =
            ExternalPaymentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExternalPaymentListPage) : Iterable<ExternalPayment> {

        override fun iterator(): Iterator<ExternalPayment> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<ExternalPayment> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalPaymentListPage{service=$service, params=$params, response=$response}"
}
