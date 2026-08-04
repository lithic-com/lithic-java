// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.CardProgramServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see CardProgramServiceAsync.list */
class CardProgramListPageAsync
private constructor(
    private val service: CardProgramServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: CardProgramListParams,
    private val response: CardProgramListPageResponse,
) : PageAsync<CardProgram> {

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see CardProgramListPageResponse.data
     */
    fun data(): List<CardProgram> = response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [CardProgramListPageResponse], but gracefully handles missing data.
     *
     * @see CardProgramListPageResponse.hasMore
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

    override fun nextPage(): CompletableFuture<CardProgramListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardProgram> = AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): CardProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardProgramListPageAsync].
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

    /** A builder for [CardProgramListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardProgramServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: CardProgramListParams? = null
        private var response: CardProgramListPageResponse? = null

        @JvmSynthetic
        internal fun from(cardProgramListPageAsync: CardProgramListPageAsync) = apply {
            service = cardProgramListPageAsync.service
            streamHandlerExecutor = cardProgramListPageAsync.streamHandlerExecutor
            params = cardProgramListPageAsync.params
            response = cardProgramListPageAsync.response
        }

        fun service(service: CardProgramServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: CardProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardProgramListPageAsync].
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
        fun build(): CardProgramListPageAsync =
            CardProgramListPageAsync(
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

        return other is CardProgramListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "CardProgramListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
