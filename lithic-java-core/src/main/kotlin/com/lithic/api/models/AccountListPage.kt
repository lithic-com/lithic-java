// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.services.blocking.AccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** List account configurations. */
class AccountListPage
private constructor(
    private val accountsService: AccountService,
    private val params: AccountListParams,
    private val response: AccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountListPageResponse = response

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountListPageResponse.data]
     */
    fun data(): List<Account> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountListPage && accountsService == other.accountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountsService, params, response) /* spotless:on */

    override fun toString() =
        "AccountListPage{accountsService=$accountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AccountListParams> {
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

    fun getNextPage(): Optional<AccountListPage> {
        return getNextPageParams().map { accountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        @JvmStatic
        fun of(
            accountsService: AccountService,
            params: AccountListParams,
            response: AccountListPageResponse,
        ) = AccountListPage(accountsService, params, response)
    }

    class AutoPager(private val firstPage: AccountListPage) : Iterable<Account> {

        override fun iterator(): Iterator<Account> = iterator {
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

        fun stream(): Stream<Account> {
            return StreamSupport.stream(spliterator(), false)
        }
    }
}
