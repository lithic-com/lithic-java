// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.StatementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [StatementServiceAsync.list] */
class FinancialAccountStatementListPageAsync
private constructor(
    private val service: StatementServiceAsync,
    private val params: FinancialAccountStatementListParams,
    private val response: Statements,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialAccountStatementListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<FinancialAccountStatementListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

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
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountStatementListPageAsync]. */
    class Builder internal constructor() {

        private var service: StatementServiceAsync? = null
        private var params: FinancialAccountStatementListParams? = null
        private var response: Statements? = null

        @JvmSynthetic
        internal fun from(
            financialAccountStatementListPageAsync: FinancialAccountStatementListPageAsync
        ) = apply {
            service = financialAccountStatementListPageAsync.service
            params = financialAccountStatementListPageAsync.params
            response = financialAccountStatementListPageAsync.response
        }

        fun service(service: StatementServiceAsync) = apply { this.service = service }

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
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): FinancialAccountStatementListPageAsync =
            FinancialAccountStatementListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: FinancialAccountStatementListPageAsync) {

        fun forEach(action: Predicate<Statement>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<FinancialAccountStatementListPageAsync>>.forEach(
                action: (Statement) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Statement>> {
            val values = mutableListOf<Statement>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountStatementListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountStatementListPageAsync{service=$service, params=$params, response=$response}"
}
