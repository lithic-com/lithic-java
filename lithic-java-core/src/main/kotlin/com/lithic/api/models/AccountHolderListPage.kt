// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.AccountHolderService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [AccountHolderService.list] */
class AccountHolderListPage
private constructor(
    private val service: AccountHolderService,
    private val params: AccountHolderListParams,
    private val response: AccountHolderListPageResponse,
) : Page<AccountHolder> {

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

    override fun items(): List<AccountHolder> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): AccountHolderListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): AccountHolderListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccountHolder> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountHolderListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountHolderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountHolderListPage].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AccountHolderListPage]. */
    class Builder internal constructor() {

        private var service: AccountHolderService? = null
        private var params: AccountHolderListParams? = null
        private var response: AccountHolderListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountHolderListPage: AccountHolderListPage) = apply {
            service = accountHolderListPage.service
            params = accountHolderListPage.params
            response = accountHolderListPage.response
        }

        fun service(service: AccountHolderService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountHolderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountHolderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountHolderListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AccountHolderListPage =
            AccountHolderListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountHolderListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountHolderListPage{service=$service, params=$params, response=$response}"
}
