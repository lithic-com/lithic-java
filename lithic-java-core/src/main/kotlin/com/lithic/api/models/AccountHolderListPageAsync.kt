// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.AccountHolderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Get a list of individual or business account holders and their KYC or KYB evaluation status. */
class AccountHolderListPageAsync
private constructor(
    private val accountHoldersService: AccountHolderServiceAsync,
    private val params: AccountHolderListParams,
    private val response: AccountHolderListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountHolderListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderListPageAsync && accountHoldersService == other.accountHoldersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountHoldersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountHolderListPageAsync{accountHoldersService=$accountHoldersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AccountHolderListParams> = Optional.empty()

    fun getNextPage(): CompletableFuture<Optional<AccountHolderListPageAsync>> {
        return getNextPageParams()
            .map { accountHoldersService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountHoldersService: AccountHolderServiceAsync,
            params: AccountHolderListParams,
            response: AccountHolderListPageResponse,
        ) = AccountHolderListPageAsync(accountHoldersService, params, response)
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
}
