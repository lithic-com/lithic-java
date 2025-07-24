// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.LoanTapeServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see LoanTapeServiceAsync.list */
class FinancialAccountLoanTapeListPageAsync
private constructor(
    private val service: LoanTapeServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FinancialAccountLoanTapeListParams,
    private val response: FinancialAccountLoanTapeListPageResponse,
) : PageAsync<LoanTape> {

    /**
     * Delegates to [FinancialAccountLoanTapeListPageResponse], but gracefully handles missing data.
     *
     * @see FinancialAccountLoanTapeListPageResponse.data
     */
    fun data(): List<LoanTape> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountLoanTapeListPageResponse], but gracefully handles missing data.
     *
     * @see FinancialAccountLoanTapeListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<LoanTape> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountLoanTapeListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<FinancialAccountLoanTapeListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LoanTape> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountLoanTapeListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountLoanTapeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountLoanTapeListPageAsync].
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

    /** A builder for [FinancialAccountLoanTapeListPageAsync]. */
    class Builder internal constructor() {

        private var service: LoanTapeServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FinancialAccountLoanTapeListParams? = null
        private var response: FinancialAccountLoanTapeListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            financialAccountLoanTapeListPageAsync: FinancialAccountLoanTapeListPageAsync
        ) = apply {
            service = financialAccountLoanTapeListPageAsync.service
            streamHandlerExecutor = financialAccountLoanTapeListPageAsync.streamHandlerExecutor
            params = financialAccountLoanTapeListPageAsync.params
            response = financialAccountLoanTapeListPageAsync.response
        }

        fun service(service: LoanTapeServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountLoanTapeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountLoanTapeListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountLoanTapeListPageAsync].
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
        fun build(): FinancialAccountLoanTapeListPageAsync =
            FinancialAccountLoanTapeListPageAsync(
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

        return /* spotless:off */ other is FinancialAccountLoanTapeListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountLoanTapeListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
