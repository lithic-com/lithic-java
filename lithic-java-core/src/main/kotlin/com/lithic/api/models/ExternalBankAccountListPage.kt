// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.ExternalBankAccountService
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [ExternalBankAccountService.list] */
class ExternalBankAccountListPage
private constructor(
    private val service: ExternalBankAccountService,
    private val params: ExternalBankAccountListParams,
    private val response: ExternalBankAccountListPageResponse,
) {

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

    fun getNextPage(): Optional<ExternalBankAccountListPage> =
        getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalBankAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalBankAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalBankAccountListPage].
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

    /** A builder for [ExternalBankAccountListPage]. */
    class Builder internal constructor() {

        private var service: ExternalBankAccountService? = null
        private var params: ExternalBankAccountListParams? = null
        private var response: ExternalBankAccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(externalBankAccountListPage: ExternalBankAccountListPage) = apply {
            service = externalBankAccountListPage.service
            params = externalBankAccountListPage.params
            response = externalBankAccountListPage.response
        }

        fun service(service: ExternalBankAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalBankAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalBankAccountListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ExternalBankAccountListPage].
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
        fun build(): ExternalBankAccountListPage =
            ExternalBankAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalBankAccountListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalBankAccountListPage{service=$service, params=$params, response=$response}"
}
