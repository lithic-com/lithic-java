// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AccountHolderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** @see [AccountHolderServiceAsync.list] */
class AccountHolderListPageAsync
private constructor(
    private val service: AccountHolderServiceAsync,
    private val params: AccountHolderListParams,
    private val response: AccountHolderListPageResponse,
) {

    /**
     * Delegates to [AccountHolderListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountHolderListPageResponse.data]
     */
    fun data(): List<AccountHolder> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountHolderListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountHolderListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AccountHolderListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<AccountHolderListPageAsync>> =
        getNextPageParams()
            .map { service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountHolderListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountHolderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountHolderListPageAsync].
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

    /** A builder for [AccountHolderListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountHolderServiceAsync? = null
        private var params: AccountHolderListParams? = null
        private var response: AccountHolderListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountHolderListPageAsync: AccountHolderListPageAsync) = apply {
            service = accountHolderListPageAsync.service
            params = accountHolderListPageAsync.params
            response = accountHolderListPageAsync.response
        }

        fun service(service: AccountHolderServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountHolderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountHolderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountHolderListPageAsync].
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
        fun build(): AccountHolderListPageAsync =
            AccountHolderListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AccountHolderListPageAsync) {

        fun forEach(action: Predicate<AccountHolder>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AccountHolderListPageAsync>>.forEach(
                action: (AccountHolder) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<AccountHolder>> {
            val values = mutableListOf<AccountHolder>()
            return forEach(values::add, executor).thenApply { values }
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountHolderListPageAsync{service=$service, params=$params, response=$response}"
}
