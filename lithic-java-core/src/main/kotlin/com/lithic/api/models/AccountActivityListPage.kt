// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.lithic.api.core.AutoPager
import com.lithic.api.core.Page
import com.lithic.api.core.checkRequired
import com.lithic.api.services.blocking.AccountActivityService
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/** @see AccountActivityService.list */
class AccountActivityListPage
private constructor(
    private val service: AccountActivityService,
    private val params: AccountActivityListParams,
    private val response: AccountActivityListPageResponse,
) : Page<AccountActivityListResponse> {

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

    override fun nextPage(): AccountActivityListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AccountActivityListResponse> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountActivityListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountActivityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountActivityListPage].
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

    /** A builder for [AccountActivityListPage]. */
    class Builder internal constructor() {

        private var service: AccountActivityService? = null
        private var params: AccountActivityListParams? = null
        private var response: AccountActivityListPageResponse? = null

        @JvmSynthetic
        internal fun from(accountActivityListPage: AccountActivityListPage) = apply {
            service = accountActivityListPage.service
            params = accountActivityListPage.params
            response = accountActivityListPage.response
        }

        fun service(service: AccountActivityService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountActivityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountActivityListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountActivityListPage].
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
        fun build(): AccountActivityListPage =
            AccountActivityListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountActivityListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountActivityListPage{service=$service, params=$params, response=$response}"
}
