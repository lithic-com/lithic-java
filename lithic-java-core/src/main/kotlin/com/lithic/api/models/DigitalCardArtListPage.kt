// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.DigitalCardArtService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List digital card art. */
class DigitalCardArtListPage
private constructor(
    private val digitalCardArtService: DigitalCardArtService,
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

        return /* spotless:off */ other is DigitalCardArtListPage && digitalCardArtService == other.digitalCardArtService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalCardArtService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardArtListPage{digitalCardArtService=$digitalCardArtService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<DigitalCardArtListPage> {
        return getNextPageParams().map { digitalCardArtService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            digitalCardArtService: DigitalCardArtService,
            params: DigitalCardArtListParams,
            response: DigitalCardArtListPageResponse,
        ) = DigitalCardArtListPage(digitalCardArtService, params, response)
    }

    class AutoPager(private val firstPage: DigitalCardArtListPage) : Iterable<DigitalCardArt> {

        override fun iterator(): Iterator<DigitalCardArt> = iterator {
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

        fun stream(): Stream<DigitalCardArt> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
