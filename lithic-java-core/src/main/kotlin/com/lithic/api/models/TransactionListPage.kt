// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.TransactionService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [TransactionService.list] */
class TransactionListPage
private constructor(
    private val service: TransactionService,
    private val params: TransactionListParams,
    private val response: TransactionListPageResponse,
) {

    /**
     * Delegates to [TransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionListPageResponse.data]
     */
    fun data(): List<Transaction> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [TransactionListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<TransactionListParams> {
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

    fun getNextPage(): Optional<TransactionListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): TransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): TransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TransactionListPage].
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

    /** A builder for [TransactionListPage]. */
    class Builder internal constructor() {

        private var service: TransactionService? = null
        private var params: TransactionListParams? = null
        private var response: TransactionListPageResponse? = null

        @JvmSynthetic
        internal fun from(transactionListPage: TransactionListPage) = apply {
            service = transactionListPage.service
            params = transactionListPage.params
            response = transactionListPage.response
        }

        fun service(service: TransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TransactionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TransactionListPage].
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
        fun build(): TransactionListPage =
            TransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: TransactionListPage) : Iterable<Transaction> {

        override fun iterator(): Iterator<Transaction> = iterator {
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

        fun stream(): Stream<Transaction> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "TransactionListPage{service=$service, params=$params, response=$response}"
}
