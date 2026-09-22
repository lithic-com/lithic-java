// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.financialAccounts.installmentPlans.StatementServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see StatementServiceAsync.list */
class FinancialAccountInstallmentPlanStatementListPageAsync
private constructor(
    private val service: StatementServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: FinancialAccountInstallmentPlanStatementListParams,
    private val response: FinancialAccountInstallmentPlanStatementListPageResponse,
) : PageAsync<InstallmentPlanStatement> {

    /**
     * Delegates to [FinancialAccountInstallmentPlanStatementListPageResponse], but gracefully
     * handles missing data.
     *
     * @see FinancialAccountInstallmentPlanStatementListPageResponse.data
     */
    fun data(): List<InstallmentPlanStatement> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [FinancialAccountInstallmentPlanStatementListPageResponse], but gracefully
     * handles missing data.
     *
     * @see FinancialAccountInstallmentPlanStatementListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<InstallmentPlanStatement> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): FinancialAccountInstallmentPlanStatementListParams =
        if (params.endingBefore().isPresent) {
            params.toBuilder().endingBefore(items().first()._token().getOptional("token")).build()
        } else {
            params.toBuilder().startingAfter(items().last()._token().getOptional("token")).build()
        }

    override fun nextPage():
        CompletableFuture<FinancialAccountInstallmentPlanStatementListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InstallmentPlanStatement> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): FinancialAccountInstallmentPlanStatementListParams = params

    /** The response that this page was parsed from. */
    fun response(): FinancialAccountInstallmentPlanStatementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [FinancialAccountInstallmentPlanStatementListPageAsync].
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

    /** A builder for [FinancialAccountInstallmentPlanStatementListPageAsync]. */
    class Builder internal constructor() {

        private var service: StatementServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: FinancialAccountInstallmentPlanStatementListParams? = null
        private var response: FinancialAccountInstallmentPlanStatementListPageResponse? = null

        @JvmSynthetic
        internal fun from(
            financialAccountInstallmentPlanStatementListPageAsync:
                FinancialAccountInstallmentPlanStatementListPageAsync
        ) = apply {
            service = financialAccountInstallmentPlanStatementListPageAsync.service
            streamHandlerExecutor =
                financialAccountInstallmentPlanStatementListPageAsync.streamHandlerExecutor
            params = financialAccountInstallmentPlanStatementListPageAsync.params
            response = financialAccountInstallmentPlanStatementListPageAsync.response
        }

        fun service(service: StatementServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: FinancialAccountInstallmentPlanStatementListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: FinancialAccountInstallmentPlanStatementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [FinancialAccountInstallmentPlanStatementListPageAsync].
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
        fun build(): FinancialAccountInstallmentPlanStatementListPageAsync =
            FinancialAccountInstallmentPlanStatementListPageAsync(
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

        return other is FinancialAccountInstallmentPlanStatementListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "FinancialAccountInstallmentPlanStatementListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
