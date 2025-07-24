// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.ExternalBankAccountService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see ExternalBankAccountService.list */
class ExternalBankAccountListPage
private constructor(
    private val service: ExternalBankAccountService,
    private val params: ExternalBankAccountListParams,
    private val response: ExternalBankAccountListPageResponse,
) : Page<ExternalBankAccountListResponse> {

    /**
     * Delegates to [ExternalBankAccountListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalBankAccountListPageResponse.data
     */
    fun data(): List<ExternalBankAccountListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [ExternalBankAccountListPageResponse], but gracefully handles missing data.
     *
     * @see ExternalBankAccountListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<ExternalBankAccountListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): ExternalBankAccountListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): ExternalBankAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalBankAccountListResponse> = AutoPager.from(this)

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
