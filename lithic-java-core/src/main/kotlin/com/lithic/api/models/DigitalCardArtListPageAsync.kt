// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.async.DigitalCardArtServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import java.util.function.Predicate
import kotlin.jvm.optionals.getOrNull

/** List digital card art. */
class DigitalCardArtListPageAsync
private constructor(
    private val digitalCardArtService: DigitalCardArtServiceAsync,
    private val params: DigitalCardArtListParams,
    private val response: DigitalCardArtListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DigitalCardArtListPageResponse = response

    /**
     * Delegates to [DigitalCardArtListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardArtListPageResponse.data]
     */
    fun data(): List<DigitalCardArt> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalCardArtListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardArtListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardArtListPageAsync && digitalCardArtService == other.digitalCardArtService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalCardArtService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardArtListPageAsync{digitalCardArtService=$digitalCardArtService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<DigitalCardArtListParams> {
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

    fun getNextPage(): CompletableFuture<Optional<DigitalCardArtListPageAsync>> {
        return getNextPageParams()
            .map { digitalCardArtService.list(it).thenApply { Optional.of(it) } }
            .orElseGet { CompletableFuture.completedFuture(Optional.empty()) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            digitalCardArtService: DigitalCardArtServiceAsync,
            params: DigitalCardArtListParams,
            response: DigitalCardArtListPageResponse,
        ) = DigitalCardArtListPageAsync(digitalCardArtService, params, response)
    }

    class AutoPager(private val firstPage: DigitalCardArtListPageAsync) {

        fun forEach(
            action: Predicate<DigitalCardArt>,
            executor: Executor,
        ): CompletableFuture<Void> {
            fun CompletableFuture<Optional<DigitalCardArtListPageAsync>>.forEach(
                action: (DigitalCardArt) -> Boolean,
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

        fun toList(executor: Executor): CompletableFuture<List<DigitalCardArt>> {
            val values = mutableListOf<DigitalCardArt>()
            return forEach(values::add, executor).thenApply { values }
        }
    }
}
