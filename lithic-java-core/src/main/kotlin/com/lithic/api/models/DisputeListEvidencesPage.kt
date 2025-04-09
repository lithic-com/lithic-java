// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.DisputeService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List evidence metadata for a dispute. */
class DisputeListEvidencesPage
private constructor(
    private val disputesService: DisputeService,
    private val params: DisputeListEvidencesParams,
    private val response: DisputeListEvidencesPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DisputeListEvidencesPageResponse = response

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.data]
     */
    fun data(): List<DisputeEvidence> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DisputeListEvidencesPageResponse], but gracefully handles missing data.
     *
     * @see [DisputeListEvidencesPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DisputeListEvidencesPage && disputesService == other.disputesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(disputesService, params, response) /* spotless:on */

    override fun toString() =
        "DisputeListEvidencesPage{disputesService=$disputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<DisputeListEvidencesParams> {
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

    fun getNextPage(): Optional<DisputeListEvidencesPage> {
        return getNextPageParams().map { disputesService.listEvidences(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            disputesService: DisputeService,
            params: DisputeListEvidencesParams,
            response: DisputeListEvidencesPageResponse,
        ) = DisputeListEvidencesPage(disputesService, params, response)
    }

    class AutoPager(private val firstPage: DisputeListEvidencesPage) : Iterable<DisputeEvidence> {

        override fun iterator(): Iterator<DisputeEvidence> = iterator {
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

        fun stream(): Stream<DisputeEvidence> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
