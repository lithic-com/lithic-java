// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.DigitalCardArtService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [DigitalCardArtService.list] */
class DigitalCardArtListPage
private constructor(
    private val service: DigitalCardArtService,
    private val params: DigitalCardArtListParams,
    private val response: DigitalCardArtListPageResponse,
) {

    /**
     * Delegates to [DigitalCardArtListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardArtListPageResponse.data]
     */
    fun data(): List<DigitalCardArt> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [DigitalCardArtListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardArtListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<DigitalCardArtListParams> {
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

    fun getNextPage(): Optional<DigitalCardArtListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DigitalCardArtListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalCardArtListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DigitalCardArtListPage].
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

    /** A builder for [DigitalCardArtListPage]. */
    class Builder internal constructor() {

        private var service: DigitalCardArtService? = null
        private var params: DigitalCardArtListParams? = null
        private var response: DigitalCardArtListPageResponse? = null

        @JvmSynthetic
        internal fun from(digitalCardArtListPage: DigitalCardArtListPage) = apply {
            service = digitalCardArtListPage.service
            params = digitalCardArtListPage.params
            response = digitalCardArtListPage.response
        }

        fun service(service: DigitalCardArtService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalCardArtListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalCardArtListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DigitalCardArtListPage].
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
        fun build(): DigitalCardArtListPage =
            DigitalCardArtListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DigitalCardArtListPage) : Iterable<DigitalCardArt> {

        override fun iterator(): Iterator<DigitalCardArt> = iterator {
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

        fun stream(): Stream<DigitalCardArt> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardArtListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardArtListPage{service=$service, params=$params, response=$response}"
}
