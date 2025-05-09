// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see [StatementServiceAsync.list] */
class FinancialAccountStatementListPageAsync
private constructor(
    private val service: StatementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FinancialAccountStatementListParams,
    private val response: Statements,
) : PageAsync<Statement> {

    /**
     * Delegates to [Statements], but gracefully handles missing data.
     *
     * @see [Statements.data]
     */
    fun data(): List<Statement> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [Statements], but gracefully handles missing data.
     *
     * @see [Statements.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<Statement> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountStatementListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<FinancialAccountStatementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Statement> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountStatementListParams = params

    /** The response that this page was parsed from. */
    fun response(): Statements = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountStatementListPageAsync].
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

    /** A builder for [FinancialAccountStatementListPageAsync]. */
    class Builder internal constructor() {

        private var service: StatementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FinancialAccountStatementListParams? = null
        private var response: Statements? = null

        @JvmSynthetic
        internal fun from(
            financialAccountStatementListPageAsync: FinancialAccountStatementListPageAsync
        ) = apply {
            service = financialAccountStatementListPageAsync.service
            streamHandlerExecutor = financialAccountStatementListPageAsync.streamHandlerExecutor
            params = financialAccountStatementListPageAsync.params
            response = financialAccountStatementListPageAsync.response
        }

        fun service(service: StatementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountStatementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: Statements) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FinancialAccountStatementListPageAsync].
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
        fun build(): FinancialAccountStatementListPageAsync =
            FinancialAccountStatementListPageAsync(
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

        return /* spotless:off */ other is FinancialAccountStatementListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
