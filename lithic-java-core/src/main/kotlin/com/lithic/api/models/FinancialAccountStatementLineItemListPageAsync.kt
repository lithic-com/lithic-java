// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.statements.LineItemServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [LineItemServiceAsync.list] */
class FinancialAccountStatementLineItemListPageAsync
private constructor(
    private val service: LineItemServiceAsync,
    private val params: FinancialAccountStatementLineItemListParams,
    private val response: StatementLineItems,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialAccountStatementLineItemListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<FinancialAccountStatementLineItemListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountStatementLineItemListPageAsync]. */
    class Builder internal constructor() {

        private var service: LineItemServiceAsync? = null
        private var params: FinancialAccountStatementLineItemListParams? = null
        private var response: StatementLineItems? = null

        @JvmSynthetic
        internal fun from(
            financialAccountStatementLineItemListPageAsync:
                FinancialAccountStatementLineItemListPageAsync
        ) = apply {
            service = financialAccountStatementLineItemListPageAsync.service
            params = financialAccountStatementLineItemListPageAsync.params
            response = financialAccountStatementLineItemListPageAsync.response
        }

        fun service(service: LineItemServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountStatementLineItemListPageAsync =
            FinancialAccountStatementLineItemListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: FinancialAccountStatementLineItemListPageAsync) {

        fun forEach(
            action: Predicate<StatementLineItems.StatementLineItemResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FinancialAccountStatementLineItemListPageAsync>>.forEach(
                action: (StatementLineItems.StatementLineItemResponse) -> Boolean,
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

        fun toList(
            executor: Executor
        ): CompletableFuture<List<StatementLineItems.StatementLineItemResponse>> {
            val values = mutableListOf<StatementLineItems.StatementLineItemResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementLineItemListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementLineItemListPageAsync{service=$service, params=$params, response=$response}"
}
