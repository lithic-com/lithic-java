// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.client

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.ApiStatus
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.async.AccountHolderServiceAsync
import com.lithic.api.services.async.AccountServiceAsync
import com.lithic.api.services.async.AggregateBalanceServiceAsync
import com.lithic.api.services.async.AuthRuleServiceAsync
import com.lithic.api.services.async.AuthStreamEnrollmentServiceAsync
import com.lithic.api.services.async.BalanceServiceAsync
import com.lithic.api.services.async.BookTransferServiceAsync
import com.lithic.api.services.async.CardProgramServiceAsync
import com.lithic.api.services.async.CardServiceAsync
import com.lithic.api.services.async.CreditProductServiceAsync
import com.lithic.api.services.async.DigitalCardArtServiceAsync
import com.lithic.api.services.async.DisputeServiceAsync
import com.lithic.api.services.async.EventServiceAsync
import com.lithic.api.services.async.ExternalBankAccountServiceAsync
import com.lithic.api.services.async.ExternalPaymentServiceAsync
import com.lithic.api.services.async.FinancialAccountServiceAsync
import com.lithic.api.services.async.ManagementOperationServiceAsync
import com.lithic.api.services.async.PaymentServiceAsync
import com.lithic.api.services.async.ReportServiceAsync
import com.lithic.api.services.async.ResponderEndpointServiceAsync
import com.lithic.api.services.async.ThreeDSServiceAsync
import com.lithic.api.services.async.TokenizationDecisioningServiceAsync
import com.lithic.api.services.async.TokenizationServiceAsync
import com.lithic.api.services.async.TransactionServiceAsync
import com.lithic.api.services.async.TransferServiceAsync
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

    fun managementOperations(): ManagementOperationServiceAsync

    /** Status of api */
    @JvmOverloads
    fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<ApiStatus>
}
