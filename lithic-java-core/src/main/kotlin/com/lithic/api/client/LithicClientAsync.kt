// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.client

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ApiStatus
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.async.AccountActivityServiceAsync
import com.lithic.api.services.async.AccountHolderServiceAsync
import com.lithic.api.services.async.AccountServiceAsync
import com.lithic.api.services.async.AggregateBalanceServiceAsync
import com.lithic.api.services.async.AuthRuleServiceAsync
import com.lithic.api.services.async.AuthStreamEnrollmentServiceAsync
import com.lithic.api.services.async.BalanceServiceAsync
import com.lithic.api.services.async.BookTransferServiceAsync
import com.lithic.api.services.async.CardBulkOrderServiceAsync
import com.lithic.api.services.async.CardProgramServiceAsync
import com.lithic.api.services.async.CardServiceAsync
import com.lithic.api.services.async.CreditProductServiceAsync
import com.lithic.api.services.async.DigitalCardArtServiceAsync
import com.lithic.api.services.async.DisputeServiceAsync
import com.lithic.api.services.async.DisputesV2ServiceAsync
import com.lithic.api.services.async.EventServiceAsync
import com.lithic.api.services.async.ExternalBankAccountServiceAsync
import com.lithic.api.services.async.ExternalPaymentServiceAsync
import com.lithic.api.services.async.FinancialAccountServiceAsync
import com.lithic.api.services.async.FraudServiceAsync
import com.lithic.api.services.async.FundingEventServiceAsync
import com.lithic.api.services.async.InternalTransactionServiceAsync
import com.lithic.api.services.async.ManagementOperationServiceAsync
import com.lithic.api.services.async.NetworkProgramServiceAsync
import com.lithic.api.services.async.PaymentServiceAsync
import com.lithic.api.services.async.ReportServiceAsync
import com.lithic.api.services.async.ResponderEndpointServiceAsync
import com.lithic.api.services.async.ThreeDSServiceAsync
import com.lithic.api.services.async.TokenizationDecisioningServiceAsync
import com.lithic.api.services.async.TokenizationServiceAsync
import com.lithic.api.services.async.TransactionServiceAsync
import com.lithic.api.services.async.TransferServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

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

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LithicClientAsync

    fun accounts(): AccountServiceAsync

    fun accountHolders(): AccountHolderServiceAsync

    fun authRules(): AuthRuleServiceAsync

    fun authStreamEnrollment(): AuthStreamEnrollmentServiceAsync

    fun tokenizationDecisioning(): TokenizationDecisioningServiceAsync

    fun tokenizations(): TokenizationServiceAsync

    fun cards(): CardServiceAsync

    fun cardBulkOrders(): CardBulkOrderServiceAsync

    fun balances(): BalanceServiceAsync

    fun aggregateBalances(): AggregateBalanceServiceAsync

    fun disputes(): DisputeServiceAsync

    fun disputesV2(): DisputesV2ServiceAsync

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

    fun internalTransaction(): InternalTransactionServiceAsync

    fun fundingEvents(): FundingEventServiceAsync

    fun fraud(): FraudServiceAsync

    fun networkPrograms(): NetworkProgramServiceAsync

    fun accountActivity(): AccountActivityServiceAsync

    /** Status of api */
    fun apiStatus(): CompletableFuture<ApiStatus> = apiStatus(ClientApiStatusParams.none())

    /** @see apiStatus */
    fun apiStatus(
        params: ClientApiStatusParams = ClientApiStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<ApiStatus>

    /** @see apiStatus */
    fun apiStatus(
        params: ClientApiStatusParams = ClientApiStatusParams.none()
    ): CompletableFuture<ApiStatus> = apiStatus(params, RequestOptions.none())

    /** @see apiStatus */
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

    /** A view of [LithicClientAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): LithicClientAsync.WithRawResponse

        fun accounts(): AccountServiceAsync.WithRawResponse

        fun accountHolders(): AccountHolderServiceAsync.WithRawResponse

        fun authRules(): AuthRuleServiceAsync.WithRawResponse

        fun authStreamEnrollment(): AuthStreamEnrollmentServiceAsync.WithRawResponse

        fun tokenizationDecisioning(): TokenizationDecisioningServiceAsync.WithRawResponse

        fun tokenizations(): TokenizationServiceAsync.WithRawResponse

        fun cards(): CardServiceAsync.WithRawResponse

        fun cardBulkOrders(): CardBulkOrderServiceAsync.WithRawResponse

        fun balances(): BalanceServiceAsync.WithRawResponse

        fun aggregateBalances(): AggregateBalanceServiceAsync.WithRawResponse

        fun disputes(): DisputeServiceAsync.WithRawResponse

        fun disputesV2(): DisputesV2ServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        fun transfers(): TransferServiceAsync.WithRawResponse

        fun financialAccounts(): FinancialAccountServiceAsync.WithRawResponse

        fun transactions(): TransactionServiceAsync.WithRawResponse

        fun responderEndpoints(): ResponderEndpointServiceAsync.WithRawResponse

        fun externalBankAccounts(): ExternalBankAccountServiceAsync.WithRawResponse

        fun payments(): PaymentServiceAsync.WithRawResponse

        fun threeDS(): ThreeDSServiceAsync.WithRawResponse

        fun reports(): ReportServiceAsync.WithRawResponse

        fun cardPrograms(): CardProgramServiceAsync.WithRawResponse

        fun digitalCardArt(): DigitalCardArtServiceAsync.WithRawResponse

        fun bookTransfers(): BookTransferServiceAsync.WithRawResponse

        fun creditProducts(): CreditProductServiceAsync.WithRawResponse

        fun externalPayments(): ExternalPaymentServiceAsync.WithRawResponse

        fun managementOperations(): ManagementOperationServiceAsync.WithRawResponse

        fun internalTransaction(): InternalTransactionServiceAsync.WithRawResponse

        fun fundingEvents(): FundingEventServiceAsync.WithRawResponse

        fun fraud(): FraudServiceAsync.WithRawResponse

        fun networkPrograms(): NetworkProgramServiceAsync.WithRawResponse

        fun accountActivity(): AccountActivityServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/status`, but is otherwise the same as
         * [LithicClientAsync.apiStatus].
         */
        fun apiStatus(): CompletableFuture<HttpResponseFor<ApiStatus>> =
            apiStatus(ClientApiStatusParams.none())

        /** @see apiStatus */
        fun apiStatus(
            params: ClientApiStatusParams = ClientApiStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<ApiStatus>>

        /** @see apiStatus */
        fun apiStatus(
            params: ClientApiStatusParams = ClientApiStatusParams.none()
        ): CompletableFuture<HttpResponseFor<ApiStatus>> = apiStatus(params, RequestOptions.none())

        /** @see apiStatus */
        fun apiStatus(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<ApiStatus>> =
            apiStatus(ClientApiStatusParams.none(), requestOptions)
    }
}
