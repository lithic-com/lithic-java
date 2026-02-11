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

/** @see V2ServiceAsync.listResults */
class AuthRuleV2ListResultsPageAsync
private constructor(
    private val service: V2ServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AuthRuleV2ListResultsParams,
    private val response: AuthRuleV2ListResultsPageResponse,
) : PageAsync<V2ListResultsResponse> {

    /**
     * Delegates to [AuthRuleV2ListResultsPageResponse], but gracefully handles missing data.
     *
     * @see AuthRuleV2ListResultsPageResponse.data
     */
    fun data(): List<V2ListResultsResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AuthRuleV2ListResultsPageResponse], but gracefully handles missing data.
     *
     * @see AuthRuleV2ListResultsPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<V2ListResultsResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AuthRuleV2ListResultsParams =
        if (params.endingBefore().isPresent) {
            params
                .toBuilder()
                .endingBefore(
                    items()
                        .first()
                        .accept(
                            object : V2ListResultsResponse.Visitor<Optional<String>> {
                                override fun visitAuthorizationResult(
                                    authorizationResult: V2ListResultsResponse.AuthorizationResult
                                ): Optional<String> =
                                    authorizationResult._token().getOptional("token")

                                override fun visitAuthentication3dsResult(
                                    authentication3dsResult:
                                        V2ListResultsResponse.Authentication3dsResult
                                ): Optional<String> =
                                    authentication3dsResult._token().getOptional("token")

                                override fun visitTokenizationResult(
                                    tokenizationResult: V2ListResultsResponse.TokenizationResult
                                ): Optional<String> =
                                    tokenizationResult._token().getOptional("token")

                                override fun visitAchResult(
                                    achResult: V2ListResultsResponse.AchResult
                                ): Optional<String> = achResult._token().getOptional("token")
                            }
                        )
                )
                .build()
        } else {
            params
                .toBuilder()
                .startingAfter(
                    items()
                        .last()
                        .accept(
                            object : V2ListResultsResponse.Visitor<Optional<String>> {
                                override fun visitAuthorizationResult(
                                    authorizationResult: V2ListResultsResponse.AuthorizationResult
                                ): Optional<String> =
                                    authorizationResult._token().getOptional("token")

                                override fun visitAuthentication3dsResult(
                                    authentication3dsResult:
                                        V2ListResultsResponse.Authentication3dsResult
                                ): Optional<String> =
                                    authentication3dsResult._token().getOptional("token")

                                override fun visitTokenizationResult(
                                    tokenizationResult: V2ListResultsResponse.TokenizationResult
                                ): Optional<String> =
                                    tokenizationResult._token().getOptional("token")

                                override fun visitAchResult(
                                    achResult: V2ListResultsResponse.AchResult
                                ): Optional<String> = achResult._token().getOptional("token")
                            }
                        )
                )
                .build()
        }

    override fun nextPage(): CompletableFuture<AuthRuleV2ListResultsPageAsync> =
        service.listResults(nextPageParams())

    fun autoPager(): AutoPagerAsync<V2ListResultsResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AuthRuleV2ListResultsParams = params

    /** The response that this page was parsed from. */
    fun response(): AuthRuleV2ListResultsPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AuthRuleV2ListResultsPageAsync].
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

    /** A builder for [AuthRuleV2ListResultsPageAsync]. */
    class Builder internal constructor() {

        private var service: V2ServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AuthRuleV2ListResultsParams? = null
        private var response: AuthRuleV2ListResultsPageResponse? = null

        @JvmSynthetic
        internal fun from(authRuleV2ListResultsPageAsync: AuthRuleV2ListResultsPageAsync) = apply {
            service = authRuleV2ListResultsPageAsync.service
            streamHandlerExecutor = authRuleV2ListResultsPageAsync.streamHandlerExecutor
            params = authRuleV2ListResultsPageAsync.params
            response = authRuleV2ListResultsPageAsync.response
        }

        fun service(service: V2ServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AuthRuleV2ListResultsParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AuthRuleV2ListResultsPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AuthRuleV2ListResultsPageAsync].
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
        fun build(): AuthRuleV2ListResultsPageAsync =
            AuthRuleV2ListResultsPageAsync(
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

        return other is AuthRuleV2ListResultsPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AuthRuleV2ListResultsPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
