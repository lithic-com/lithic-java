// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.TokenizationService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see TokenizationService.list */
class TokenizationListPage
private constructor(
    private val service: TokenizationService,
    private val params: TokenizationListParams,
    private val response: TokenizationListPageResponse,
) : Page<Tokenization> {

    /**
     * Delegates to [TokenizationListPageResponse], but gracefully handles missing data.
     *
     * @see TokenizationListPageResponse.data
     */
    fun data(): List<Tokenization> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [TokenizationListPageResponse], but gracefully handles missing data.
     *
     * @see TokenizationListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<Tokenization> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): TokenizationListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): TokenizationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Tokenization> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): TokenizationListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenizationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenizationListPage].
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

    /** A builder for [TokenizationListPage]. */
    class Builder internal constructor() {

        private var service: TokenizationService? = null
        private var params: TokenizationListParams? = null
        private var response: TokenizationListPageResponse? = null

        @JvmSynthetic
        internal fun from(tokenizationListPage: TokenizationListPage) = apply {
            service = tokenizationListPage.service
            params = tokenizationListPage.params
            response = tokenizationListPage.response
        }

        fun service(service: TokenizationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: TokenizationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenizationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenizationListPage].
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
        fun build(): TokenizationListPage =
            TokenizationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenizationListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "TokenizationListPage{service=$service, params=$params, response=$response}"
}
