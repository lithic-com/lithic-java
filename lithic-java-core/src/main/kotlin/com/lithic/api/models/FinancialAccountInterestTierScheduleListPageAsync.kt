// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.InterestTierScheduleServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see InterestTierScheduleServiceAsync.list */
class FinancialAccountInterestTierScheduleListPageAsync
private constructor(
    private val service: InterestTierScheduleServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FinancialAccountInterestTierScheduleListParams,
    private val response: FinancialAccountInterestTierScheduleListPageResponse,
) : PageAsync<InterestTierSchedule> {

    /**
     * Delegates to [FinancialAccountInterestTierScheduleListPageResponse], but gracefully handles
     * missing data.
     *
     * @see FinancialAccountInterestTierScheduleListPageResponse.data
     */
    fun data(): List<InterestTierSchedule> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountInterestTierScheduleListPageResponse], but gracefully handles
     * missing data.
     *
     * @see FinancialAccountInterestTierScheduleListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<InterestTierSchedule> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): FinancialAccountInterestTierScheduleListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<FinancialAccountInterestTierScheduleListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InterestTierSchedule> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountInterestTierScheduleListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountInterestTierScheduleListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInterestTierScheduleListPageAsync].
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

    /** A builder for [FinancialAccountInterestTierScheduleListPageAsync]. */
    class Builder internal constructor() {

        private var service: InterestTierScheduleServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FinancialAccountInterestTierScheduleListParams? = null
        private var response: FinancialAccountInterestTierScheduleListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            financialAccountInterestTierScheduleListPageAsync:
                FinancialAccountInterestTierScheduleListPageAsync
        ) = apply {
            service = financialAccountInterestTierScheduleListPageAsync.service
            streamHandlerExecutor =
                financialAccountInterestTierScheduleListPageAsync.streamHandlerExecutor
            params = financialAccountInterestTierScheduleListPageAsync.params
            response = financialAccountInterestTierScheduleListPageAsync.response
        }

        fun service(service: InterestTierScheduleServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountInterestTierScheduleListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountInterestTierScheduleListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountInterestTierScheduleListPageAsync].
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
        fun build(): FinancialAccountInterestTierScheduleListPageAsync =
            FinancialAccountInterestTierScheduleListPageAsync(
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

        return other is FinancialAccountInterestTierScheduleListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FinancialAccountInterestTierScheduleListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
