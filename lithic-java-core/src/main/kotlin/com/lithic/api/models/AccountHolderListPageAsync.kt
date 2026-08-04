// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AccountHolderServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AccountHolderServiceAsync.list */
class AccountHolderListPageAsync
private constructor(
    private val service: AccountHolderServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountHolderListParams,
    private val response: AccountHolderListPageResponse,
) : PageAsync<AccountHolder> {

    /**
     * Delegates to [AccountHolderListPageResponse], but gracefully handles missing data.
     *
     * @see AccountHolderListPageResponse.data
     */
    fun data(): List<AccountHolder> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountHolderListPageResponse], but gracefully handles missing data.
     *
     * @see AccountHolderListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<AccountHolder> = data()

    override fun hasNextPage(): Boolean = false

    fun nextPageParams(): AccountHolderListParams =
        throw IllegalStateException("Cannot construct next page params")

    override fun nextPage(): CompletableFuture<AccountHolderListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountHolder> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountHolderListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountHolderListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountHolderListPageAsync].
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

    /** A builder for [AccountHolderListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountHolderServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountHolderListParams? = null
        private var response: AccountHolderListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountHolderListPageAsync: AccountHolderListPageAsync) = apply {
            service = accountHolderListPageAsync.service
            streamHandlerExecutor = accountHolderListPageAsync.streamHandlerExecutor
            params = accountHolderListPageAsync.params
            response = accountHolderListPageAsync.response
        }

        fun service(service: AccountHolderServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountHolderListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountHolderListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountHolderListPageAsync].
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
        fun build(): AccountHolderListPageAsync =
            AccountHolderListPageAsync(
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

        return other is AccountHolderListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AccountHolderListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
