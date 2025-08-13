// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AccountServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AccountServiceAsync.list */
class AccountListPageAsync
private constructor(
    private val service: AccountServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountListParams,
    private val response: AccountListPageResponse,
) : PageAsync<Account> {

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see AccountListPageResponse.data
     */
    fun data(): List<Account> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see AccountListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<Account> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AccountListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage(): CompletableFuture<AccountListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Account> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountListPageAsync].
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

    /** A builder for [AccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountListParams? = null
        private var response: AccountListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountListPageAsync: AccountListPageAsync) = apply {
            service = accountListPageAsync.service
            streamHandlerExecutor = accountListPageAsync.streamHandlerExecutor
            params = accountListPageAsync.params
            response = accountListPageAsync.response
        }

        fun service(service: AccountServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountListPageAsync].
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
        fun build(): AccountListPageAsync =
            AccountListPageAsync(
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

        return other is AccountListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AccountListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
