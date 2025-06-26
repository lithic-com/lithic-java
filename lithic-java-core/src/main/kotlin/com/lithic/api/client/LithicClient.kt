// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.client

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.ApiStatus
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.blocking.AccountHolderService
import com.lithic.api.services.blocking.AccountService
import com.lithic.api.services.blocking.AggregateBalanceService
import com.lithic.api.services.blocking.AuthRuleService
import com.lithic.api.services.blocking.AuthStreamEnrollmentService
import com.lithic.api.services.blocking.BalanceService
import com.lithic.api.services.blocking.BookTransferService
import com.lithic.api.services.blocking.CardProgramService
import com.lithic.api.services.blocking.CardService
import com.lithic.api.services.blocking.CreditProductService
import com.lithic.api.services.blocking.DigitalCardArtService
import com.lithic.api.services.blocking.DisputeService
import com.lithic.api.services.blocking.EventService
import com.lithic.api.services.blocking.ExternalBankAccountService
import com.lithic.api.services.blocking.ExternalPaymentService
import com.lithic.api.services.blocking.FinancialAccountService
import com.lithic.api.services.blocking.FraudService
import com.lithic.api.services.blocking.FundingEventService
import com.lithic.api.services.blocking.ManagementOperationService
import com.lithic.api.services.blocking.PaymentService
import com.lithic.api.services.blocking.ReportService
import com.lithic.api.services.blocking.ResponderEndpointService
import com.lithic.api.services.blocking.ThreeDSService
import com.lithic.api.services.blocking.TokenizationDecisioningService
import com.lithic.api.services.blocking.TokenizationService
import com.lithic.api.services.blocking.TransactionService
import com.lithic.api.services.blocking.TransferService
import com.lithic.api.services.blocking.WebhookService
import java.util.function.Consumer

/**
 * A client for interacting with the Lithic REST API synchronously. You can also switch to
 * asynchronous execution via the [async] method.
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
interface LithicClient {

    /**
     * Returns a version of this client that uses asynchronous execution.
     *
     * The returned client shares its resources, like its connection pool and thread pools, with
     * this client.
     */
    fun async(): LithicClientAsync

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): LithicClient

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

    fun managementOperations(): ManagementOperationService

    fun fundingEvents(): FundingEventService

    fun fraud(): FraudService

    /** Status of api */
    fun apiStatus(): ApiStatus = apiStatus(ClientApiStatusParams.none())

    /** @see [apiStatus] */
    fun apiStatus(
        params: ClientApiStatusParams = ClientApiStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ApiStatus

    /** @see [apiStatus] */
    fun apiStatus(params: ClientApiStatusParams = ClientApiStatusParams.none()): ApiStatus =
        apiStatus(params, RequestOptions.none())

    /** @see [apiStatus] */
    fun apiStatus(requestOptions: RequestOptions): ApiStatus =
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

    /** A view of [LithicClient] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): LithicClient.WithRawResponse

        fun accounts(): AccountService.WithRawResponse

        fun accountHolders(): AccountHolderService.WithRawResponse

        fun authRules(): AuthRuleService.WithRawResponse

        fun authStreamEnrollment(): AuthStreamEnrollmentService.WithRawResponse

        fun tokenizationDecisioning(): TokenizationDecisioningService.WithRawResponse

        fun tokenizations(): TokenizationService.WithRawResponse

        fun cards(): CardService.WithRawResponse

        fun balances(): BalanceService.WithRawResponse

        fun aggregateBalances(): AggregateBalanceService.WithRawResponse

        fun disputes(): DisputeService.WithRawResponse

        fun events(): EventService.WithRawResponse

        fun transfers(): TransferService.WithRawResponse

        fun financialAccounts(): FinancialAccountService.WithRawResponse

        fun transactions(): TransactionService.WithRawResponse

        fun responderEndpoints(): ResponderEndpointService.WithRawResponse

        fun externalBankAccounts(): ExternalBankAccountService.WithRawResponse

        fun payments(): PaymentService.WithRawResponse

        fun threeDS(): ThreeDSService.WithRawResponse

        fun reports(): ReportService.WithRawResponse

        fun cardPrograms(): CardProgramService.WithRawResponse

        fun digitalCardArt(): DigitalCardArtService.WithRawResponse

        fun bookTransfers(): BookTransferService.WithRawResponse

        fun creditProducts(): CreditProductService.WithRawResponse

        fun externalPayments(): ExternalPaymentService.WithRawResponse

        fun managementOperations(): ManagementOperationService.WithRawResponse

        fun fundingEvents(): FundingEventService.WithRawResponse

        fun fraud(): FraudService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/status`, but is otherwise the same as
         * [LithicClient.apiStatus].
         */
        @MustBeClosed
        fun apiStatus(): HttpResponseFor<ApiStatus> = apiStatus(ClientApiStatusParams.none())

        /** @see [apiStatus] */
        @MustBeClosed
        fun apiStatus(
            params: ClientApiStatusParams = ClientApiStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ApiStatus>

        /** @see [apiStatus] */
        @MustBeClosed
        fun apiStatus(
            params: ClientApiStatusParams = ClientApiStatusParams.none()
        ): HttpResponseFor<ApiStatus> = apiStatus(params, RequestOptions.none())

        /** @see [apiStatus] */
        @MustBeClosed
        fun apiStatus(requestOptions: RequestOptions): HttpResponseFor<ApiStatus> =
            apiStatus(ClientApiStatusParams.none(), requestOptions)
    }
}
