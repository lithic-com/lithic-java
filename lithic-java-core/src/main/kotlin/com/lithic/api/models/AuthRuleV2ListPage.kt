// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.authRules.V2Service
import java.util.Objects
import java.util.Optional
import java.util.stream.Stream
import java.util.stream.StreamSupport
import kotlin.jvm.optionals.getOrNull

/** @see [V2Service.list] */
class AuthRuleV2ListPage
private constructor(
    private val service: V2Service,
    private val params: AuthRuleV2ListParams,
    private val response: AuthRuleV2ListPageResponse,
) {

    /**
     * Delegates to [AuthRuleV2ListPageResponse], but gracefully handles missing data.
     *
     * @see [AuthRuleV2ListPageResponse.data]
     */
    fun data(): List<V2ListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AuthRuleV2ListPageResponse], but gracefully handles missing data.
     *
     * @see [AuthRuleV2ListPageResponse.hasMore]
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    fun hasNextPage(): Boolean = data().isNotEmpty()

    fun getNextPageParams(): Optional<AuthRuleV2ListParams> {
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

    fun getNextPage(): Optional<AuthRuleV2ListPage> = getNextPageParams().map { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): AuthRuleV2ListParams = params

    /** The response that this page was parsed from. */
    fun response(): AuthRuleV2ListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthRuleV2ListPage].
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

    /** A builder for [AuthRuleV2ListPage]. */
    class Builder internal constructor() {

        private var service: V2Service? = null
        private var params: AuthRuleV2ListParams? = null
        private var response: AuthRuleV2ListPageResponse? = null

        @JvmSynthetic
        internal fun from(authRuleV2ListPage: AuthRuleV2ListPage) = apply {
            service = authRuleV2ListPage.service
            params = authRuleV2ListPage.params
            response = authRuleV2ListPage.response
        }

        fun service(service: V2Service) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AuthRuleV2ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AuthRuleV2ListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AuthRuleV2ListPage].
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
        fun build(): AuthRuleV2ListPage =
            AuthRuleV2ListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: AuthRuleV2ListPage) : Iterable<V2ListResponse> {

        override fun iterator(): Iterator<V2ListResponse> = iterator {
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

        fun stream(): Stream<V2ListResponse> {
            return StreamSupport.stream(spliterator(), false)
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRuleV2ListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AuthRuleV2ListPage{service=$service, params=$params, response=$response}"
}
