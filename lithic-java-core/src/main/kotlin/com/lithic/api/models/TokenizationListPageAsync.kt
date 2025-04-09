// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.TokenizationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List card tokenizations */
class TokenizationListPageAsync
private constructor(
    private val tokenizationsService: TokenizationServiceAsync,
    private val params: TokenizationListParams,
    private val response: TokenizationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): TokenizationListPageResponse = response

    /**
     * Delegates to [TokenizationListPageResponse], but gracefully handles missing data.
     *
     * @see [TokenizationListPageResponse.data]
     */
    fun data(): List<Tokenization> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TokenizationListPageResponse], but gracefully handles missing data.
     *
     * @see [TokenizationListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationListPageAsync && tokenizationsService == other.tokenizationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(tokenizationsService, params, response) /* spotless:on */

    override fun toString() =
        "TokenizationListPageAsync{tokenizationsService=$tokenizationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<TokenizationListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<TokenizationListPageAsync>> {
        return getNextPageParams()
            .map { tokenizationsService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            tokenizationsService: TokenizationServiceAsync,
            params: TokenizationListParams,
            response: TokenizationListPageResponse,
        ) = TokenizationListPageAsync(tokenizationsService, params, response)
    }

    class AutoPager(private val firstPage: TokenizationListPageAsync) {

        fun forEach(action: Predicate<Tokenization>, executor: Executor): CompletableFuture<Void> {
            fun CompletableFuture<Optional<TokenizationListPageAsync>>.forEach(
                action: (Tokenization) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<Tokenization>> {
            val values = mutableListOf<Tokenization>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
