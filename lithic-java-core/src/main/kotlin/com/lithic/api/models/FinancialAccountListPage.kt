// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.FinancialAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [FinancialAccountService.list] */
class FinancialAccountListPage
private constructor(
    private val service: FinancialAccountService,
    private val params: FinancialAccountListParams,
    private val response: FinancialAccountListPageResponse,
) {

    /**
     * Delegates to [FinancialAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountListPageResponse.data]
     */
    fun data(): List<FinancialAccount> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [FinancialAccountListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<FinancialAccountListParams> = Optional.empty()

    fun getNextPage(): Optional<FinancialAccountListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FinancialAccountListPage].
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

    /** A builder for [FinancialAccountListPage]. */
    class Builder internal constructor() {

        private var service: FinancialAccountService? = null
        private var params: FinancialAccountListParams? = null
        private var response: FinancialAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(financialAccountListPage: FinancialAccountListPage) = apply {
            service = financialAccountListPage.service
            params = financialAccountListPage.params
            response = financialAccountListPage.response
        }

        fun service(service: FinancialAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountListPage].
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
        fun build(): FinancialAccountListPage =
            FinancialAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: FinancialAccountListPage) : Iterable<FinancialAccount> {

        override fun iterator(): Iterator<FinancialAccount> = iterator {
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

        fun stream(): Stream<FinancialAccount> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FinancialAccountListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "FinancialAccountListPage{service=$service, params=$params, response=$response}"
}
