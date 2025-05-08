// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.BookTransferService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [BookTransferService.list] */
class BookTransferListPage
private constructor(
    private val service: BookTransferService,
    private val params: BookTransferListParams,
    private val response: BookTransferListPageResponse,
) : Page<BookTransferResponse> {

    /**
     * Delegates to [BookTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [BookTransferListPageResponse.data]
     */
    fun data(): List<BookTransferResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [BookTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [BookTransferListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<BookTransferResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): BookTransferListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): BookTransferListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<BookTransferResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BookTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookTransferListPage].
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

    /** A builder for [BookTransferListPage]. */
    class Builder internal constructor() {

        private var service: BookTransferService? = null
        private var params: BookTransferListParams? = null
        private var response: BookTransferListPageResponse? = null

        @JvmSynthetic
        internal fun from(bookTransferListPage: BookTransferListPage) = apply {
            service = bookTransferListPage.service
            params = bookTransferListPage.params
            response = bookTransferListPage.response
        }

        fun service(service: BookTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [BookTransferListPage].
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
        fun build(): BookTransferListPage =
            BookTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BookTransferListPage{service=$service, params=$params, response=$response}"
}
