// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.authRules.V2ServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see V2ServiceAsync.list */
class AuthRuleV2ListPageAsync
private constructor(
    private val service: V2ServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AuthRuleV2ListParams,
    private val response: AuthRuleV2ListPageResponse,
) : PageAsync<V2ListResponse> {

    /**
     * Delegates to [AuthRuleV2ListPageResponse], but gracefully handles missing data.
     *
     * @see AuthRuleV2ListPageResponse.data
     */
    fun data(): List<V2ListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AuthRuleV2ListPageResponse], but gracefully handles missing data.
     *
     * @see AuthRuleV2ListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<V2ListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AuthRuleV2ListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<AuthRuleV2ListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<V2ListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AuthRuleV2ListParams = params

    /** The response that this page was parsed from. */
    fun response(): AuthRuleV2ListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AuthRuleV2ListPageAsync].
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRuleV2ListPageAsync]. */
    class Builder internal constructor() {

        private var service: V2ServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AuthRuleV2ListParams? = null
        private var response: AuthRuleV2ListPageResponse? = null

        @JvmSynthetic
        internal fun from(authRuleV2ListPageAsync: AuthRuleV2ListPageAsync) = apply {
            service = authRuleV2ListPageAsync.service
            streamHandlerExecutor = authRuleV2ListPageAsync.streamHandlerExecutor
            params = authRuleV2ListPageAsync.params
            response = authRuleV2ListPageAsync.response
        }

        fun service(service: V2ServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AuthRuleV2ListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AuthRuleV2ListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AuthRuleV2ListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .service()
         * .streamHandlerExecutor()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRuleV2ListPageAsync =
            AuthRuleV2ListPageAsync(
                checkRequired("service", service),
                checkRequired("streamHandlerExecutor", streamHandlerExecutor),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRuleV2ListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AuthRuleV2ListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
