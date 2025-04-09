// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.ExternalBankAccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List all the external bank accounts for the provided search criteria. */
class ExternalBankAccountListPageAsync
private constructor(
    private val externalBankAccountsService: ExternalBankAccountServiceAsync,
    private val params: ExternalBankAccountListParams,
    private val response: ExternalBankAccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalBankAccountListPageResponse = response

    /**
     * Delegates to [ExternalBankAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalBankAccountListPageResponse.data]
     */
    fun data(): List<ExternalBankAccountListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalBankAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalBankAccountListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountListPageAsync && externalBankAccountsService == other.externalBankAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalBankAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountListPageAsync{externalBankAccountsService=$externalBankAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<ExternalBankAccountListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<ExternalBankAccountListPageAsync>> {
        return getNextPageParams()
            .map { externalBankAccountsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalBankAccountsService: ExternalBankAccountServiceAsync,
            params: ExternalBankAccountListParams,
            response: ExternalBankAccountListPageResponse,
        ) = ExternalBankAccountListPageAsync(externalBankAccountsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalBankAccountListPageAsync) {

        fun forEach(
            action: Predicate<ExternalBankAccountListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<ExternalBankAccountListPageAsync>>.forEach(
                action: (ExternalBankAccountListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<ExternalBankAccountListResponse>> {
            val values = mutableListOf<ExternalBankAccountListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
