// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.TokenizationServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see TokenizationServiceAsync.list */
class TokenizationListPageAsync
private constructor(
    private val service: TokenizationServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: TokenizationListParams,
    private val response: TokenizationListPageResponse,
) : PageAsync<Tokenization> {

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

    override fun nextPage(): CompletableFuture<TokenizationListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Tokenization> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): TokenizationListParams = params

    /** The response that this page was parsed from. */
    fun response(): TokenizationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [TokenizationListPageAsync].
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

    /** A builder for [TokenizationListPageAsync]. */
    class Builder internal constructor() {

        private var service: TokenizationServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: TokenizationListParams? = null
        private var response: TokenizationListPageResponse? = null

        @JvmSynthetic
        internal fun from(tokenizationListPageAsync: TokenizationListPageAsync) = apply {
            service = tokenizationListPageAsync.service
            streamHandlerExecutor = tokenizationListPageAsync.streamHandlerExecutor
            params = tokenizationListPageAsync.params
            response = tokenizationListPageAsync.response
        }

        fun service(service: TokenizationServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: TokenizationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: TokenizationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [TokenizationListPageAsync].
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
        fun build(): TokenizationListPageAsync =
            TokenizationListPageAsync(
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

        return /* spotless:off */ other is TokenizationListPageAsync && service == other.service && streamHandlerExecutor == other.streamHandlerExecutor && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, streamHandlerExecutor, params, response) /* spotless:on */

    override fun toString() =
        "TokenizationListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
