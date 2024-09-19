// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.client

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.*
import com.lithic.api.services.blocking.*

interface LithicClient {

    fun async(): LithicClientAsync

    fun accounts(): AccountService

    fun accountHolders(): AccountHolderService

    fun authRules(): AuthRuleService

    fun authStreamEnrollment(): AuthStreamEnrollmentService

    fun tokenizationDecisioning(): TokenizationDecisioningService

    fun tokenizations(): TokenizationService

    fun cards(): CardService

    fun balances(): BalanceService

    fun aggregateBalances(): AggregateBalanceService

    fun disputes(): DisputeService

    fun events(): EventService

    fun transfers(): TransferService

    fun financialAccounts(): FinancialAccountService

    fun transactions(): TransactionService

    fun responderEndpoints(): ResponderEndpointService

    fun webhooks(): WebhookService

    fun externalBankAccounts(): ExternalBankAccountService

    fun payments(): PaymentService

    fun threeDS(): ThreeDSService

    fun reports(): ReportService

    fun cardPrograms(): CardProgramService

    fun digitalCardArt(): DigitalCardArtService

    fun bookTransfers(): BookTransferService

    fun creditProducts(): CreditProductService

    fun externalPayments(): ExternalPaymentService

    /** Status of api */
    @JvmOverloads
    fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ApiStatus
}
