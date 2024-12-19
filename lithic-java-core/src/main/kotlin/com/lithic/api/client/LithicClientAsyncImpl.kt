// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.client

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.getPackageVersion
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ApiStatus
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.async.AccountHolderServiceAsync
import com.lithic.api.services.async.AccountHolderServiceAsyncImpl
import com.lithic.api.services.async.AccountServiceAsync
import com.lithic.api.services.async.AccountServiceAsyncImpl
import com.lithic.api.services.async.AggregateBalanceServiceAsync
import com.lithic.api.services.async.AggregateBalanceServiceAsyncImpl
import com.lithic.api.services.async.AuthRuleServiceAsync
import com.lithic.api.services.async.AuthRuleServiceAsyncImpl
import com.lithic.api.services.async.AuthStreamEnrollmentServiceAsync
import com.lithic.api.services.async.AuthStreamEnrollmentServiceAsyncImpl
import com.lithic.api.services.async.BalanceServiceAsync
import com.lithic.api.services.async.BalanceServiceAsyncImpl
import com.lithic.api.services.async.BookTransferServiceAsync
import com.lithic.api.services.async.BookTransferServiceAsyncImpl
import com.lithic.api.services.async.CardProgramServiceAsync
import com.lithic.api.services.async.CardProgramServiceAsyncImpl
import com.lithic.api.services.async.CardServiceAsync
import com.lithic.api.services.async.CardServiceAsyncImpl
import com.lithic.api.services.async.CreditProductServiceAsync
import com.lithic.api.services.async.CreditProductServiceAsyncImpl
import com.lithic.api.services.async.DigitalCardArtServiceAsync
import com.lithic.api.services.async.DigitalCardArtServiceAsyncImpl
import com.lithic.api.services.async.DisputeServiceAsync
import com.lithic.api.services.async.DisputeServiceAsyncImpl
import com.lithic.api.services.async.EventServiceAsync
import com.lithic.api.services.async.EventServiceAsyncImpl
import com.lithic.api.services.async.ExternalBankAccountServiceAsync
import com.lithic.api.services.async.ExternalBankAccountServiceAsyncImpl
import com.lithic.api.services.async.ExternalPaymentServiceAsync
import com.lithic.api.services.async.ExternalPaymentServiceAsyncImpl
import com.lithic.api.services.async.FinancialAccountServiceAsync
import com.lithic.api.services.async.FinancialAccountServiceAsyncImpl
import com.lithic.api.services.async.ManagementOperationServiceAsync
import com.lithic.api.services.async.ManagementOperationServiceAsyncImpl
import com.lithic.api.services.async.PaymentServiceAsync
import com.lithic.api.services.async.PaymentServiceAsyncImpl
import com.lithic.api.services.async.ReportServiceAsync
import com.lithic.api.services.async.ReportServiceAsyncImpl
import com.lithic.api.services.async.ResponderEndpointServiceAsync
import com.lithic.api.services.async.ResponderEndpointServiceAsyncImpl
import com.lithic.api.services.async.ThreeDSServiceAsync
import com.lithic.api.services.async.ThreeDSServiceAsyncImpl
import com.lithic.api.services.async.TokenizationDecisioningServiceAsync
import com.lithic.api.services.async.TokenizationDecisioningServiceAsyncImpl
import com.lithic.api.services.async.TokenizationServiceAsync
import com.lithic.api.services.async.TokenizationServiceAsyncImpl
import com.lithic.api.services.async.TransactionServiceAsync
import com.lithic.api.services.async.TransactionServiceAsyncImpl
import com.lithic.api.services.async.TransferServiceAsync
import com.lithic.api.services.async.TransferServiceAsyncImpl
import com.lithic.api.services.async.WebhookServiceAsync
import com.lithic.api.services.async.WebhookServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class LithicClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LithicClientAsync {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val sync: LithicClient by lazy { LithicClientImpl(clientOptions) }

    private val accounts: AccountServiceAsync by lazy {
        AccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val accountHolders: AccountHolderServiceAsync by lazy {
        AccountHolderServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val authRules: AuthRuleServiceAsync by lazy {
        AuthRuleServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val authStreamEnrollment: AuthStreamEnrollmentServiceAsync by lazy {
        AuthStreamEnrollmentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tokenizationDecisioning: TokenizationDecisioningServiceAsync by lazy {
        TokenizationDecisioningServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val tokenizations: TokenizationServiceAsync by lazy {
        TokenizationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptionsWithUserAgent) }

    private val balances: BalanceServiceAsync by lazy {
        BalanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val aggregateBalances: AggregateBalanceServiceAsync by lazy {
        AggregateBalanceServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val disputes: DisputeServiceAsync by lazy {
        DisputeServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val events: EventServiceAsync by lazy {
        EventServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transfers: TransferServiceAsync by lazy {
        TransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val financialAccounts: FinancialAccountServiceAsync by lazy {
        FinancialAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val responderEndpoints: ResponderEndpointServiceAsync by lazy {
        ResponderEndpointServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookServiceAsync by lazy { WebhookServiceAsyncImpl(clientOptions) }

    private val externalBankAccounts: ExternalBankAccountServiceAsync by lazy {
        ExternalBankAccountServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val payments: PaymentServiceAsync by lazy {
        PaymentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val threeDS: ThreeDSServiceAsync by lazy {
        ThreeDSServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val reports: ReportServiceAsync by lazy {
        ReportServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val cardPrograms: CardProgramServiceAsync by lazy {
        CardProgramServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val digitalCardArt: DigitalCardArtServiceAsync by lazy {
        DigitalCardArtServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val bookTransfers: BookTransferServiceAsync by lazy {
        BookTransferServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val creditProducts: CreditProductServiceAsync by lazy {
        CreditProductServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val externalPayments: ExternalPaymentServiceAsync by lazy {
        ExternalPaymentServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    private val managementOperations: ManagementOperationServiceAsync by lazy {
        ManagementOperationServiceAsyncImpl(clientOptionsWithUserAgent)
    }

    override fun sync(): LithicClient = sync

    override fun accounts(): AccountServiceAsync = accounts

    override fun accountHolders(): AccountHolderServiceAsync = accountHolders

    override fun authRules(): AuthRuleServiceAsync = authRules

    override fun authStreamEnrollment(): AuthStreamEnrollmentServiceAsync = authStreamEnrollment

    override fun tokenizationDecisioning(): TokenizationDecisioningServiceAsync =
        tokenizationDecisioning

    override fun tokenizations(): TokenizationServiceAsync = tokenizations

    override fun cards(): CardServiceAsync = cards

    override fun balances(): BalanceServiceAsync = balances

    override fun aggregateBalances(): AggregateBalanceServiceAsync = aggregateBalances

    override fun disputes(): DisputeServiceAsync = disputes

    override fun events(): EventServiceAsync = events

    override fun transfers(): TransferServiceAsync = transfers

    override fun financialAccounts(): FinancialAccountServiceAsync = financialAccounts

    override fun transactions(): TransactionServiceAsync = transactions

    override fun responderEndpoints(): ResponderEndpointServiceAsync = responderEndpoints

    override fun webhooks(): WebhookServiceAsync = webhooks

    override fun externalBankAccounts(): ExternalBankAccountServiceAsync = externalBankAccounts

    override fun payments(): PaymentServiceAsync = payments

    override fun threeDS(): ThreeDSServiceAsync = threeDS

    override fun reports(): ReportServiceAsync = reports

    override fun cardPrograms(): CardProgramServiceAsync = cardPrograms

    override fun digitalCardArt(): DigitalCardArtServiceAsync = digitalCardArt

    override fun bookTransfers(): BookTransferServiceAsync = bookTransfers

    override fun creditProducts(): CreditProductServiceAsync = creditProducts

    override fun externalPayments(): ExternalPaymentServiceAsync = externalPayments

    override fun managementOperations(): ManagementOperationServiceAsync = managementOperations

    private val apiStatusHandler: Handler<ApiStatus> =
        jsonHandler<ApiStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Status of api */
    override fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ApiStatus> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "status")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { apiStatusHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
