// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.PaymentService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see PaymentService.list */
class PaymentListPage
private constructor(
    private val service: PaymentService,
    private val params: PaymentListParams,
    private val response: PaymentListPageResponse,
) : Page<Payment> {

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see PaymentListPageResponse.data
     */
    fun data(): List<Payment> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [PaymentListPageResponse], but gracefully handles missing data.
     *
     * @see PaymentListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<Payment> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): PaymentListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): PaymentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Payment> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): PaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PaymentListPage].
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

    /** A builder for [PaymentListPage]. */
    class Builder internal constructor() {

        private var service: PaymentService? = null
        private var params: PaymentListParams? = null
        private var response: PaymentListPageResponse? = null

        @JvmSynthetic
        internal fun from(paymentListPage: PaymentListPage) = apply {
            service = paymentListPage.service
            params = paymentListPage.params
            response = paymentListPage.response
        }

        fun service(service: PaymentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PaymentListPage].
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
        fun build(): PaymentListPage =
            PaymentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PaymentListPage{service=$service, params=$params, response=$response}"
}
