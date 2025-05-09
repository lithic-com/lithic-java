// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.events.SubscriptionService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [SubscriptionService.listAttempts] */
class EventSubscriptionListAttemptsPage
private constructor(
    private val service: SubscriptionService,
    private val params: EventSubscriptionListAttemptsParams,
    private val response: EventSubscriptionListAttemptsPageResponse,
) : Page<MessageAttempt> {

    /**
     * Delegates to [EventSubscriptionListAttemptsPageResponse], but gracefully handles missing
     * data.
     *
     * @see [EventSubscriptionListAttemptsPageResponse.data]
     */
    fun data(): List<MessageAttempt> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventSubscriptionListAttemptsPageResponse], but gracefully handles missing
     * data.
     *
     * @see [EventSubscriptionListAttemptsPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<MessageAttempt> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EventSubscriptionListAttemptsParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): EventSubscriptionListAttemptsPage =
        service.listAttempts(nextPageParams())

    fun autoPager(): AutoPager<MessageAttempt> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventSubscriptionListAttemptsParams = params

    /** The response that this page was parsed from. */
    fun response(): EventSubscriptionListAttemptsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [EventSubscriptionListAttemptsPage].
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

    /** A builder for [EventSubscriptionListAttemptsPage]. */
    class Builder internal constructor() {

        private var service: SubscriptionService? = null
        private var params: EventSubscriptionListAttemptsParams? = null
        private var response: EventSubscriptionListAttemptsPageResponse? = null

        @JvmSynthetic
        internal fun from(eventSubscriptionListAttemptsPage: EventSubscriptionListAttemptsPage) =
            apply {
                service = eventSubscriptionListAttemptsPage.service
                params = eventSubscriptionListAttemptsPage.params
                response = eventSubscriptionListAttemptsPage.response
            }

        fun service(service: SubscriptionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventSubscriptionListAttemptsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventSubscriptionListAttemptsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [EventSubscriptionListAttemptsPage].
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
        fun build(): EventSubscriptionListAttemptsPage =
            EventSubscriptionListAttemptsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListAttemptsPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListAttemptsPage{service=$service, params=$params, response=$response}"
}
