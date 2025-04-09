// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.TokenizationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List card tokenizations */
class TokenizationListPage
private constructor(
    private val tokenizationsService: TokenizationService,
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

        return /* spotless:off */ other is TokenizationListPage && tokenizationsService == other.tokenizationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(tokenizationsService, params, response) /* spotless:on */

    override fun toString() =
        "TokenizationListPage{tokenizationsService=$tokenizationsService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<TokenizationListPage> {
        return getNextPageParams().map { tokenizationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            tokenizationsService: TokenizationService,
            params: TokenizationListParams,
            response: TokenizationListPageResponse,
        ) = TokenizationListPage(tokenizationsService, params, response)
    }

    class AutoPager(private val firstPage: TokenizationListPage) : Iterable<Tokenization> {

        override fun iterator(): Iterator<Tokenization> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage().getOrNull() ?: break
                index = 0
            }
        }

        fun stream(): Stream<Tokenization> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
