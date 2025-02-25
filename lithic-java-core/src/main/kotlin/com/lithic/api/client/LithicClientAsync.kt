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
import com.lithic.api.services.async.WebhookServiceAsync
import java.util.concurrent.CompletableFuture

/**
 * A client for interacting with the Lithic REST API asynchronously. You can also switch to
 * synchronous execution via the [sync] method.
 *
 * This client performs best when you create a single instance and reuse it for all interactions
 * with the REST API. This is because each client holds its own connection pool and thread pools.
 * Reusing connections and threads reduces latency and saves memory. The client also handles rate
 * limiting per client. This means that creating and using multiple instances at the same time will
 * not respect rate limits.
 *
 * The threads and connections that are held will be released automatically if they remain idle. But
 * if you are writing an application that needs to aggressively release unused resources, then you
 * may call [close].
 */
interface LithicClientAsync {

    /**
     * Returns a version of this client that uses synchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
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

    fun webhooks(): WebhookServiceAsync

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
        params: ClientApiStatusParams = ClientApiStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiStatus>

    /** Status of api */
    fun apiStatus(requestOptions: RequestOptions): CompletableFuture<ApiStatus> =
        apiStatus(ClientApiStatusParams.none(), requestOptions)

    /**
     * Closes this client, relinquishing any underlying resources.
     *
     * This is purposefully not inherited from [AutoCloseable] because the client is long-lived and
     * usually should not be synchronously closed via try-with-resources.
     *
     * It's also usually not necessary to call this method at all. the default HTTP client
     * automatically releases threads and connections if they remain idle, but if you are writing an
     * application that needs to aggressively release unused resources, then you may call this
     * method.
     */
    fun close()
}
