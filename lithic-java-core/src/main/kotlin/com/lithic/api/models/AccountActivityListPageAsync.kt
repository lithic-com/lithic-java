// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPagerAsync
import com.lithic.api.core.PageAsync
import com.lithic.api.core.checkRequired
import com.lithic.api.services.async.AccountActivityServiceAsync
import java.util.Objects
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Executor
import kotlin.jvm.optionals.getOrNull

/** @see AccountActivityServiceAsync.list */
class AccountActivityListPageAsync
private constructor(
    private val service: AccountActivityServiceAsync,
    private val streamHandlerExecutor: Executor,
    private val params: AccountActivityListParams,
    private val response: AccountActivityListPageResponse,
) : PageAsync<AccountActivityListResponse> {

    /**
     * Delegates to [AccountActivityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountActivityListPageResponse.data
     */
    fun data(): List<AccountActivityListResponse> =
        response._data().getOptional("data").getOrNull() ?: emptyList()

    /**
     * Delegates to [AccountActivityListPageResponse], but gracefully handles missing data.
     *
     * @see AccountActivityListPageResponse.hasMore
     */
    fun hasMore(): Optional<Boolean> = response._hasMore().getOptional("has_more")

    override fun items(): List<AccountActivityListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty()

    fun nextPageParams(): AccountActivityListParams =
        if (params.endingBefore().isPresent) {
            params
                .toBuilder()
                .endingBefore(
                    items()
                        .first()
                        .accept(
                            object : AccountActivityListResponse.Visitor<Optional<String>> {
                                override fun visitFinancialTransaction(
                                    financialTransaction:
                                        AccountActivityListResponse.FinancialTransaction
                                ): Optional<String> =
                                    financialTransaction._token().getOptional("token")

                                override fun visitBookTransferTransaction(
                                    bookTransferTransaction:
                                        AccountActivityListResponse.BookTransferTransaction
                                ): Optional<String> =
                                    bookTransferTransaction._token().getOptional("token")

                                override fun visitCardTransaction(
                                    cardTransaction: AccountActivityListResponse.CardTransaction
                                ): Optional<String> = cardTransaction._token().getOptional("token")

                                override fun visitPaymentTransaction(
                                    paymentTransaction:
                                        AccountActivityListResponse.PaymentTransaction
                                ): Optional<String> =
                                    paymentTransaction._token().getOptional("token")

                                override fun visitExternalPayment(
                                    externalPayment: ExternalPayment
                                ): Optional<String> = externalPayment._token().getOptional("token")

                                override fun visitManagementOperationTransaction(
                                    managementOperationTransaction: ManagementOperationTransaction
                                ): Optional<String> =
                                    managementOperationTransaction._token().getOptional("token")
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
                            object : AccountActivityListResponse.Visitor<Optional<String>> {
                                override fun visitFinancialTransaction(
                                    financialTransaction:
                                        AccountActivityListResponse.FinancialTransaction
                                ): Optional<String> =
                                    financialTransaction._token().getOptional("token")

                                override fun visitBookTransferTransaction(
                                    bookTransferTransaction:
                                        AccountActivityListResponse.BookTransferTransaction
                                ): Optional<String> =
                                    bookTransferTransaction._token().getOptional("token")

                                override fun visitCardTransaction(
                                    cardTransaction: AccountActivityListResponse.CardTransaction
                                ): Optional<String> = cardTransaction._token().getOptional("token")

                                override fun visitPaymentTransaction(
                                    paymentTransaction:
                                        AccountActivityListResponse.PaymentTransaction
                                ): Optional<String> =
                                    paymentTransaction._token().getOptional("token")

                                override fun visitExternalPayment(
                                    externalPayment: ExternalPayment
                                ): Optional<String> = externalPayment._token().getOptional("token")

                                override fun visitManagementOperationTransaction(
                                    managementOperationTransaction: ManagementOperationTransaction
                                ): Optional<String> =
                                    managementOperationTransaction._token().getOptional("token")
                            }
                        )
                )
                .build()
        }

    override fun nextPage(): CompletableFuture<AccountActivityListPageAsync> =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountActivityListResponse> =
        AutoPagerAsync.from(this, streamHandlerExecutor)

    /** The parameters that were used to request this page. */
    fun params(): AccountActivityListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountActivityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountActivityListPageAsync].
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

    /** A builder for [AccountActivityListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountActivityServiceAsync? = null
        private var streamHandlerExecutor: Executor? = null
        private var params: AccountActivityListParams? = null
        private var response: AccountActivityListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountActivityListPageAsync: AccountActivityListPageAsync) = apply {
            service = accountActivityListPageAsync.service
            streamHandlerExecutor = accountActivityListPageAsync.streamHandlerExecutor
            params = accountActivityListPageAsync.params
            response = accountActivityListPageAsync.response
        }

        fun service(service: AccountActivityServiceAsync) = apply { this.service = service }

        fun streamHandlerExecutor(streamHandlerExecutor: Executor) = apply {
            this.streamHandlerExecutor = streamHandlerExecutor
        }

        /** The parameters that were used to request this page. */
        fun params(params: AccountActivityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountActivityListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountActivityListPageAsync].
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
        fun build(): AccountActivityListPageAsync =
            AccountActivityListPageAsync(
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

        return other is AccountActivityListPageAsync &&
            service == other.service &&
            streamHandlerExecutor == other.streamHandlerExecutor &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, streamHandlerExecutor, params, response)

    override fun toString() =
        "AccountActivityListPageAsync{service=$service, streamHandlerExecutor=$streamHandlerExecutor, params=$params, response=$response}"
}
