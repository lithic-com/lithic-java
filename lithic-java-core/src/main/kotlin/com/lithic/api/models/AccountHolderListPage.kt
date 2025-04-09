// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.AccountHolderService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** Get a list of individual or business account holders and their KYC or KYB evaluation status. */
class AccountHolderListPage
private constructor(
    private val accountHoldersService: AccountHolderService,
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

        return /* spotless:off */ other is AccountHolderListPage && accountHoldersService == other.accountHoldersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountHoldersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountHolderListPage{accountHoldersService=$accountHoldersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AccountHolderListParams> = Optional.empty()

    fun getNextPage(): Optional<AccountHolderListPage> {
        return getNextPageParams().map { accountHoldersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountHoldersService: AccountHolderService,
            params: AccountHolderListParams,
            response: AccountHolderListPageResponse,
        ) = AccountHolderListPage(accountHoldersService, params, response)
    }

    class AutoPager(private val firstPage: AccountHolderListPage) : Iterable<AccountHolder> {

        override fun iterator(): Iterator<AccountHolder> = iterator {
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

        fun stream(): Stream<AccountHolder> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
