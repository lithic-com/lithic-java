// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [LineItemServiceAsync.list] */
class FinancialAccountStatementLineItemListPageAsync
private constructor(
    private val service: LineItemServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FinancialAccountStatementLineItemListParams,
    private val response: StatementLineItems,
) : PageAsync<StatementLineItems.StatementLineItemResponse> {

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see [StatementLineItems.data]
     */
    fun data(): List<StatementLineItems.StatementLineItemResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [StatementLineItems], but gracefully handles missing data.
     *
     * @see [StatementLineItems.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<StatementLineItems.StatementLineItemResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountStatementLineItemListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<FinancialAccountStatementLineItemListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<StatementLineItems.StatementLineItemResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountStatementLineItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): StatementLineItems = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountStatementLineItemListPageAsync].
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

    /** A builder for [FinancialAccountStatementLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: LineItemServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FinancialAccountStatementLineItemListParams? = null
        private var response: StatementLineItems? = null

        @JvmSynthetic
        internal fun from(
            financialAccountStatementLineItemListPageAsync:
                FinancialAccountStatementLineItemListPageAsync
        ) = apply {
            service = financialAccountStatementLineItemListPageAsync.service
            streamHandlerExecutor =
                financialAccountStatementLineItemListPageAsync.streamHandlerExecutor
            params = financialAccountStatementLineItemListPageAsync.params
            response = financialAccountStatementLineItemListPageAsync.response
        }

        fun service(service: LineItemServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountStatementLineItemListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: StatementLineItems) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FinancialAccountStatementLineItemListPageAsync].
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
        fun build(): FinancialAccountStatementLineItemListPageAsync =
            FinancialAccountStatementLineItemListPageAsync(
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

        return /* spotless:off */ other is FinancialAccountStatementLineItemListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementLineItemListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
