// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.ExternalBankAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List all the external bank accounts for the provided search criteria. */
class ExternalBankAccountListPage
private constructor(
    private val externalBankAccountsService: ExternalBankAccountService,
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

        return /* spotless:off */ other is ExternalBankAccountListPage && externalBankAccountsService == other.externalBankAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalBankAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountListPage{externalBankAccountsService=$externalBankAccountsService, params=$params, response=$response}"

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

    fun getNextPage(): Optional<ExternalBankAccountListPage> {
        return getNextPageParams().map { externalBankAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            externalBankAccountsService: ExternalBankAccountService,
            params: ExternalBankAccountListParams,
            response: ExternalBankAccountListPageResponse,
        ) = ExternalBankAccountListPage(externalBankAccountsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalBankAccountListPage) :
        Iterable<ExternalBankAccountListResponse> {

        override fun iterator(): Iterator<ExternalBankAccountListResponse> = iterator {
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

        fun stream(): Stream<ExternalBankAccountListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
