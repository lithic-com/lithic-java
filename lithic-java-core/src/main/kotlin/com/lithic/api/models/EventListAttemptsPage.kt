// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.EventService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see EventService.listAttempts */
class EventListAttemptsPage
private constructor(
    private val service: EventService,
    private val params: EventListAttemptsParams,
    private val response: EventListAttemptsPageResponse,
) : Page<MessageAttempt> {

    /**
     * Delegates to [EventListAttemptsPageResponse], but gracefully handles missing data.
     *
     * @see EventListAttemptsPageResponse.data
     */
    fun data(): List<MessageAttempt> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [EventListAttemptsPageResponse], but gracefully handles missing data.
     *
     * @see EventListAttemptsPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<MessageAttempt> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): EventListAttemptsParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): EventListAttemptsPage = service.listAttempts(nextPageParams())

    fun autoPager(): AutoPager<MessageAttempt> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): EventListAttemptsParams = params

    /** The response that this page was parsed from. */
    fun response(): EventListAttemptsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EventListAttemptsPage].
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

    /** A builder for [EventListAttemptsPage]. */
    class Builder internal constructor() {

        private var service: EventService? = null
        private var params: EventListAttemptsParams? = null
        private var response: EventListAttemptsPageResponse? = null

        @JvmSynthetic
        internal fun from(eventListAttemptsPage: EventListAttemptsPage) = apply {
            service = eventListAttemptsPage.service
            params = eventListAttemptsPage.params
            response = eventListAttemptsPage.response
        }

        fun service(service: EventService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EventListAttemptsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EventListAttemptsPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EventListAttemptsPage].
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
        fun build(): EventListAttemptsPage =
            EventListAttemptsPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is EventListAttemptsPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "EventListAttemptsPage{service=$service, params=$params, response=$response}"
}
