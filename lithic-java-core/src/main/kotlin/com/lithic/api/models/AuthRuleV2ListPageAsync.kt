// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.authRules.V2ServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** Lists V2 authorization rules */
class AuthRuleV2ListPageAsync
private constructor(
    private val v2Service: V2ServiceAsync,
    private val params: AuthRuleV2ListParams,
    private val response: AuthRuleV2ListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AuthRuleV2ListPageResponse = response

    /**
     * Delegates to [AuthRuleV2ListPageResponse], but gracefully handles missing data.
     *
     * @see [AuthRuleV2ListPageResponse.data]
     */
    fun data(): List<V2ListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AuthRuleV2ListPageResponse], but gracefully handles missing data.
     *
     * @see [AuthRuleV2ListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2ListPageAsync && v2Service == other.v2Service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(v2Service, params, response) /* spotless:on */

    override fun toString() =
        "AuthRuleV2ListPageAsync{v2Service=$v2Service, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AuthRuleV2ListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<AuthRuleV2ListPageAsync>> {
        return getNextPageParams()
            .map { v2Service.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            v2Service: V2ServiceAsync,
            params: AuthRuleV2ListParams,
            response: AuthRuleV2ListPageResponse,
        ) = AuthRuleV2ListPageAsync(v2Service, params, response)
    }

    class AutoPager(private val firstPage: AuthRuleV2ListPageAsync) {

        fun forEach(
            action: Predicate<V2ListResponse>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<AuthRuleV2ListPageAsync>>.forEach(
                action: (V2ListResponse) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<V2ListResponse>> {
            val values = mutableListOf<V2ListResponse>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
