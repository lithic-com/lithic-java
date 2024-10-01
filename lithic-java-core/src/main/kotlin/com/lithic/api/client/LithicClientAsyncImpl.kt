// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.client

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.*
import com.lithic.api.services.async.*
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class LithicClientAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : LithicClientAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val sync: LithicClient by lazy { LithicClientImpl(clientOptions) }

    private val accounts: AccountServiceAsync by lazy { AccountServiceAsyncImpl(clientOptions) }

    private val accountHolders: AccountHolderServiceAsync by lazy {
        AccountHolderServiceAsyncImpl(clientOptions)
    }

    private val authRules: AuthRuleServiceAsync by lazy { AuthRuleServiceAsyncImpl(clientOptions) }

    private val authStreamEnrollment: AuthStreamEnrollmentServiceAsync by lazy {
        AuthStreamEnrollmentServiceAsyncImpl(clientOptions)
    }

    private val tokenizationDecisioning: TokenizationDecisioningServiceAsync by lazy {
        TokenizationDecisioningServiceAsyncImpl(clientOptions)
    }

    private val tokenizations: TokenizationServiceAsync by lazy {
        TokenizationServiceAsyncImpl(clientOptions)
    }

    private val cards: CardServiceAsync by lazy { CardServiceAsyncImpl(clientOptions) }

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val aggregateBalances: AggregateBalanceServiceAsync by lazy {
        AggregateBalanceServiceAsyncImpl(clientOptions)
    }

    private val disputes: DisputeServiceAsync by lazy { DisputeServiceAsyncImpl(clientOptions) }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    private val transfers: TransferServiceAsync by lazy { TransferServiceAsyncImpl(clientOptions) }

    private val financialAccounts: FinancialAccountServiceAsync by lazy {
        FinancialAccountServiceAsyncImpl(clientOptions)
    }

    private val transactions: TransactionServiceAsync by lazy {
        TransactionServiceAsyncImpl(clientOptions)
    }

    private val responderEndpoints: ResponderEndpointServiceAsync by lazy {
        ResponderEndpointServiceAsyncImpl(clientOptions)
    }

    private val externalBankAccounts: ExternalBankAccountServiceAsync by lazy {
        ExternalBankAccountServiceAsyncImpl(clientOptions)
    }

    private val payments: PaymentServiceAsync by lazy { PaymentServiceAsyncImpl(clientOptions) }

    private val threeDS: ThreeDSServiceAsync by lazy { ThreeDSServiceAsyncImpl(clientOptions) }

    private val reports: ReportServiceAsync by lazy { ReportServiceAsyncImpl(clientOptions) }

    private val cardPrograms: CardProgramServiceAsync by lazy {
        CardProgramServiceAsyncImpl(clientOptions)
    }

    private val digitalCardArt: DigitalCardArtServiceAsync by lazy {
        DigitalCardArtServiceAsyncImpl(clientOptions)
    }

    private val bookTransfers: BookTransferServiceAsync by lazy {
        BookTransferServiceAsyncImpl(clientOptions)
    }

    private val creditProducts: CreditProductServiceAsync by lazy {
        CreditProductServiceAsyncImpl(clientOptions)
    }

    private val externalPayments: ExternalPaymentServiceAsync by lazy {
        ExternalPaymentServiceAsyncImpl(clientOptions)
    }

    private val managementOperations: ManagementOperationServiceAsync by lazy {
        ManagementOperationServiceAsyncImpl(clientOptions)
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
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
