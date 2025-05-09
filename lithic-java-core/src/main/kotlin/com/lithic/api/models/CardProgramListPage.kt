// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.CardProgramService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see [CardProgramService.list] */
class CardProgramListPage
private constructor(
    private val service: CardProgramService,
    private val params: CardProgramListParams,
    private val response: CardProgramListPageResponse,
) : Page<CardProgram> {

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [CardProgramListPageResponse.data]
     */
    fun data(): List<CardProgram> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [CardProgramListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<CardProgram> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): CardProgramListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CardProgramListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CardProgram> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardProgramListPage].
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

    /** A builder for [CardProgramListPage]. */
    class Builder internal constructor() {

        private var service: CardProgramService? = null
        private var params: CardProgramListParams? = null
        private var response: CardProgramListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardProgramListPage: CardProgramListPage) = apply {
            service = cardProgramListPage.service
            params = cardProgramListPage.params
            response = cardProgramListPage.response
        }

        fun service(service: CardProgramService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardProgramListPage].
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
        fun build(): CardProgramListPage =
            CardProgramListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardProgramListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardProgramListPage{service=$service, params=$params, response=$response}"
}
