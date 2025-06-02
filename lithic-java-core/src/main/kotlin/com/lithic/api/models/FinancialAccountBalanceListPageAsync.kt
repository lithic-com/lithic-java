// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.BalanceServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [BalanceServiceAsync.list] */
class FinancialAccountBalanceListPageAsync
private constructor(
    private val service: BalanceServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FinancialAccountBalanceListParams,
    private val response: FinancialAccountBalanceListPageResponse,
) : PageAsync<BalanceListResponse> {

    /**
     * Delegates to [FinancialAccountBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountBalanceListPageResponse.data]
     */
    fun data(): List<BalanceListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountBalanceListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountBalanceListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<BalanceListResponse> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): FinancialAccountBalanceListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<FinancialAccountBalanceListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BalanceListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountBalanceListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountBalanceListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountBalanceListPageAsync].
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

    /** A builder for [FinancialAccountBalanceListPageAsync]. */
    class Builder internal constructor() {

        private var service: BalanceServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FinancialAccountBalanceListParams? = null
        private var response: FinancialAccountBalanceListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            financialAccountBalanceListPageAsync: FinancialAccountBalanceListPageAsync
        ) = apply {
            service = financialAccountBalanceListPageAsync.service
            streamHandlerExecutor = financialAccountBalanceListPageAsync.streamHandlerExecutor
            params = financialAccountBalanceListPageAsync.params
            response = financialAccountBalanceListPageAsync.response
        }

        fun service(service: BalanceServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountBalanceListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountBalanceListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountBalanceListPageAsync].
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
        fun build(): FinancialAccountBalanceListPageAsync =
            FinancialAccountBalanceListPageAsync(
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

        return /* spotless:off */ other is FinancialAccountBalanceListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountBalanceListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
