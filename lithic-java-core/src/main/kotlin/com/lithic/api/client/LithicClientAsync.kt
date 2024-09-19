// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.client

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.*
import com.lithic.api.services.async.*
import java.util.concurrent.CompletableFuture

interface LithicClientAsync {

    fun sync(): LithicClient

    fun accounts(): AccountServiceAsync

    fun accountHolders(): AccountHolderServiceAsync

    fun authRules(): AuthRuleServiceAsync

    fun authStreamEnrollment(): AuthStreamEnrollmentServiceAsync

    fun tokenizationDecisioning(): TokenizationDecisioningServiceAsync

    fun tokenizations(): TokenizationServiceAsync

    fun cards(): CardServiceAsync

    fun balances(): BalanceServiceAsync

    fun aggregateBalances(): AggregateBalanceServiceAsync

    fun disputes(): DisputeServiceAsync

    fun events(): EventServiceAsync

    fun transfers(): TransferServiceAsync

    fun financialAccounts(): FinancialAccountServiceAsync

    fun transactions(): TransactionServiceAsync

    fun responderEndpoints(): ResponderEndpointServiceAsync

    fun externalBankAccounts(): ExternalBankAccountServiceAsync

    fun payments(): PaymentServiceAsync

    fun threeDS(): ThreeDSServiceAsync

    fun reports(): ReportServiceAsync

    fun cardPrograms(): CardProgramServiceAsync

    fun digitalCardArt(): DigitalCardArtServiceAsync

    fun bookTransfers(): BookTransferServiceAsync

    fun creditProducts(): CreditProductServiceAsync

    fun externalPayments(): ExternalPaymentServiceAsync

    /** Status of api */
    @JvmOverloads
    fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ApiStatus>
}
