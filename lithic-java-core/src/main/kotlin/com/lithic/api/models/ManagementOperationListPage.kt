// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.ManagementOperationService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List management operations */
class ManagementOperationListPage
private constructor(
    private val managementOperationsService: ManagementOperationService,
    private val params: ManagementOperationListParams,
    private val response: ManagementOperationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ManagementOperationListPageResponse = response

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.data]
     */
    fun data(): List<ManagementOperationTransaction> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ManagementOperationListPageResponse], but gracefully handles missing data.
     *
     * @see [ManagementOperationListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationListPage && managementOperationsService == other.managementOperationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(managementOperationsService, params, response) /* spotless:on */

    override fun toString() =
        "ManagementOperationListPage{managementOperationsService=$managementOperationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<ManagementOperationListParams> {
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

    fun getNextPage(): Optional<ManagementOperationListPage> {
        return getNextPageParams().map { managementOperationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            managementOperationsService: ManagementOperationService,
            params: ManagementOperationListParams,
            response: ManagementOperationListPageResponse,
        ) = ManagementOperationListPage(managementOperationsService, params, response)
    }

    class AutoPager(private val firstPage: ManagementOperationListPage) :
        Iterable<ManagementOperationTransaction> {

        override fun iterator(): Iterator<ManagementOperationTransaction> = iterator {
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

        fun stream(): Stream<ManagementOperationTransaction> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
