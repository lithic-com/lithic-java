// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.client

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.*
import com.lithic.api.services.blocking.*
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class LithicClientImpl
constructor(
    private val clientOptions: ClientOptions,
) : LithicClient {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val async: LithicClientAsync by lazy { LithicClientAsyncImpl(clientOptions) }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptions) }

    private val accountHolders: AccountHolderService by lazy {
        AccountHolderServiceImpl(clientOptions)
    }

    private val authRules: AuthRuleService by lazy { AuthRuleServiceImpl(clientOptions) }

    private val authStreamEnrollment: AuthStreamEnrollmentService by lazy {
        AuthStreamEnrollmentServiceImpl(clientOptions)
    }

    private val tokenizationDecisioning: TokenizationDecisioningService by lazy {
        TokenizationDecisioningServiceImpl(clientOptions)
    }

    private val tokenizations: TokenizationService by lazy {
        TokenizationServiceImpl(clientOptions)
    }

    private val cards: CardService by lazy { CardServiceImpl(clientOptions) }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptions) }

    private val aggregateBalances: AggregateBalanceService by lazy {
        AggregateBalanceServiceImpl(clientOptions)
    }

    private val disputes: DisputeService by lazy { DisputeServiceImpl(clientOptions) }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    private val transfers: TransferService by lazy { TransferServiceImpl(clientOptions) }

    private val financialAccounts: FinancialAccountService by lazy {
        FinancialAccountServiceImpl(clientOptions)
    }

    private val transactions: TransactionService by lazy { TransactionServiceImpl(clientOptions) }

    private val responderEndpoints: ResponderEndpointService by lazy {
        ResponderEndpointServiceImpl(clientOptions)
    }

    private val externalBankAccounts: ExternalBankAccountService by lazy {
        ExternalBankAccountServiceImpl(clientOptions)
    }

    private val payments: PaymentService by lazy { PaymentServiceImpl(clientOptions) }

    private val threeDS: ThreeDSService by lazy { ThreeDSServiceImpl(clientOptions) }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptions) }

    private val cardPrograms: CardProgramService by lazy { CardProgramServiceImpl(clientOptions) }

    private val digitalCardArt: DigitalCardArtService by lazy {
        DigitalCardArtServiceImpl(clientOptions)
    }

    private val bookTransfers: BookTransferService by lazy {
        BookTransferServiceImpl(clientOptions)
    }

    private val creditProducts: CreditProductService by lazy {
        CreditProductServiceImpl(clientOptions)
    }

    private val externalPayments: ExternalPaymentService by lazy {
        ExternalPaymentServiceImpl(clientOptions)
    }

    override fun async(): LithicClientAsync = async

    override fun accounts(): AccountService = accounts

    override fun accountHolders(): AccountHolderService = accountHolders

    override fun authRules(): AuthRuleService = authRules

    override fun authStreamEnrollment(): AuthStreamEnrollmentService = authStreamEnrollment

    override fun tokenizationDecisioning(): TokenizationDecisioningService = tokenizationDecisioning

    override fun tokenizations(): TokenizationService = tokenizations

    override fun cards(): CardService = cards

    override fun balances(): BalanceService = balances

    override fun aggregateBalances(): AggregateBalanceService = aggregateBalances

    override fun disputes(): DisputeService = disputes

    override fun events(): EventService = events

    override fun transfers(): TransferService = transfers

    override fun financialAccounts(): FinancialAccountService = financialAccounts

    override fun transactions(): TransactionService = transactions

    override fun responderEndpoints(): ResponderEndpointService = responderEndpoints

    override fun externalBankAccounts(): ExternalBankAccountService = externalBankAccounts

    override fun payments(): PaymentService = payments

    override fun threeDS(): ThreeDSService = threeDS

    override fun reports(): ReportService = reports

    override fun cardPrograms(): CardProgramService = cardPrograms

    override fun digitalCardArt(): DigitalCardArtService = digitalCardArt

    override fun bookTransfers(): BookTransferService = bookTransfers

    override fun creditProducts(): CreditProductService = creditProducts

    override fun externalPayments(): ExternalPaymentService = externalPayments

    private val apiStatusHandler: Handler<ApiStatus> =
        jsonHandler<ApiStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Status of api */
    override fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions
    ): ApiStatus {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "status")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
