// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.client

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.getPackageVersion
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.ApiStatus
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.blocking.AccountHolderService
import com.lithic.api.services.blocking.AccountHolderServiceImpl
import com.lithic.api.services.blocking.AccountService
import com.lithic.api.services.blocking.AccountServiceImpl
import com.lithic.api.services.blocking.AggregateBalanceService
import com.lithic.api.services.blocking.AggregateBalanceServiceImpl
import com.lithic.api.services.blocking.AuthRuleService
import com.lithic.api.services.blocking.AuthRuleServiceImpl
import com.lithic.api.services.blocking.AuthStreamEnrollmentService
import com.lithic.api.services.blocking.AuthStreamEnrollmentServiceImpl
import com.lithic.api.services.blocking.BalanceService
import com.lithic.api.services.blocking.BalanceServiceImpl
import com.lithic.api.services.blocking.BookTransferService
import com.lithic.api.services.blocking.BookTransferServiceImpl
import com.lithic.api.services.blocking.CardProgramService
import com.lithic.api.services.blocking.CardProgramServiceImpl
import com.lithic.api.services.blocking.CardService
import com.lithic.api.services.blocking.CardServiceImpl
import com.lithic.api.services.blocking.CreditProductService
import com.lithic.api.services.blocking.CreditProductServiceImpl
import com.lithic.api.services.blocking.DigitalCardArtService
import com.lithic.api.services.blocking.DigitalCardArtServiceImpl
import com.lithic.api.services.blocking.DisputeService
import com.lithic.api.services.blocking.DisputeServiceImpl
import com.lithic.api.services.blocking.EventService
import com.lithic.api.services.blocking.EventServiceImpl
import com.lithic.api.services.blocking.ExternalBankAccountService
import com.lithic.api.services.blocking.ExternalBankAccountServiceImpl
import com.lithic.api.services.blocking.ExternalPaymentService
import com.lithic.api.services.blocking.ExternalPaymentServiceImpl
import com.lithic.api.services.blocking.FinancialAccountService
import com.lithic.api.services.blocking.FinancialAccountServiceImpl
import com.lithic.api.services.blocking.ManagementOperationService
import com.lithic.api.services.blocking.ManagementOperationServiceImpl
import com.lithic.api.services.blocking.PaymentService
import com.lithic.api.services.blocking.PaymentServiceImpl
import com.lithic.api.services.blocking.ReportService
import com.lithic.api.services.blocking.ReportServiceImpl
import com.lithic.api.services.blocking.ResponderEndpointService
import com.lithic.api.services.blocking.ResponderEndpointServiceImpl
import com.lithic.api.services.blocking.ThreeDSService
import com.lithic.api.services.blocking.ThreeDSServiceImpl
import com.lithic.api.services.blocking.TokenizationDecisioningService
import com.lithic.api.services.blocking.TokenizationDecisioningServiceImpl
import com.lithic.api.services.blocking.TokenizationService
import com.lithic.api.services.blocking.TokenizationServiceImpl
import com.lithic.api.services.blocking.TransactionService
import com.lithic.api.services.blocking.TransactionServiceImpl
import com.lithic.api.services.blocking.TransferService
import com.lithic.api.services.blocking.TransferServiceImpl
import com.lithic.api.services.blocking.WebhookService
import com.lithic.api.services.blocking.WebhookServiceImpl

class LithicClientImpl(private val clientOptions: ClientOptions) : LithicClient {

    private val clientOptionsWithUserAgent =
        if (clientOptions.headers.names().contains("User-Agent")) clientOptions
        else
            clientOptions
                .toBuilder()
                .putHeader("User-Agent", "${javaClass.simpleName}/Java ${getPackageVersion()}")
                .build()

    // Pass the original clientOptions so that this client sets its own User-Agent.
    private val async: LithicClientAsync by lazy { LithicClientAsyncImpl(clientOptions) }

    private val withRawResponse: LithicClient.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val accounts: AccountService by lazy { AccountServiceImpl(clientOptionsWithUserAgent) }

    private val accountHolders: AccountHolderService by lazy {
        AccountHolderServiceImpl(clientOptionsWithUserAgent)
    }

    private val authRules: AuthRuleService by lazy {
        AuthRuleServiceImpl(clientOptionsWithUserAgent)
    }

    private val authStreamEnrollment: AuthStreamEnrollmentService by lazy {
        AuthStreamEnrollmentServiceImpl(clientOptionsWithUserAgent)
    }

    private val tokenizationDecisioning: TokenizationDecisioningService by lazy {
        TokenizationDecisioningServiceImpl(clientOptionsWithUserAgent)
    }

    private val tokenizations: TokenizationService by lazy {
        TokenizationServiceImpl(clientOptionsWithUserAgent)
    }

    private val cards: CardService by lazy { CardServiceImpl(clientOptionsWithUserAgent) }

    private val balances: BalanceService by lazy { BalanceServiceImpl(clientOptionsWithUserAgent) }

    private val aggregateBalances: AggregateBalanceService by lazy {
        AggregateBalanceServiceImpl(clientOptionsWithUserAgent)
    }

    private val disputes: DisputeService by lazy { DisputeServiceImpl(clientOptionsWithUserAgent) }

    private val events: EventService by lazy { EventServiceImpl(clientOptionsWithUserAgent) }

    private val transfers: TransferService by lazy {
        TransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val financialAccounts: FinancialAccountService by lazy {
        FinancialAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val transactions: TransactionService by lazy {
        TransactionServiceImpl(clientOptionsWithUserAgent)
    }

    private val responderEndpoints: ResponderEndpointService by lazy {
        ResponderEndpointServiceImpl(clientOptionsWithUserAgent)
    }

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

    private val externalBankAccounts: ExternalBankAccountService by lazy {
        ExternalBankAccountServiceImpl(clientOptionsWithUserAgent)
    }

    private val payments: PaymentService by lazy { PaymentServiceImpl(clientOptionsWithUserAgent) }

    private val threeDS: ThreeDSService by lazy { ThreeDSServiceImpl(clientOptionsWithUserAgent) }

    private val reports: ReportService by lazy { ReportServiceImpl(clientOptionsWithUserAgent) }

    private val cardPrograms: CardProgramService by lazy {
        CardProgramServiceImpl(clientOptionsWithUserAgent)
    }

    private val digitalCardArt: DigitalCardArtService by lazy {
        DigitalCardArtServiceImpl(clientOptionsWithUserAgent)
    }

    private val bookTransfers: BookTransferService by lazy {
        BookTransferServiceImpl(clientOptionsWithUserAgent)
    }

    private val creditProducts: CreditProductService by lazy {
        CreditProductServiceImpl(clientOptionsWithUserAgent)
    }

    private val externalPayments: ExternalPaymentService by lazy {
        ExternalPaymentServiceImpl(clientOptionsWithUserAgent)
    }

    private val managementOperations: ManagementOperationService by lazy {
        ManagementOperationServiceImpl(clientOptionsWithUserAgent)
    }

    override fun async(): LithicClientAsync = async

    override fun withRawResponse(): LithicClient.WithRawResponse = withRawResponse

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

    override fun webhooks(): WebhookService = webhooks

    override fun externalBankAccounts(): ExternalBankAccountService = externalBankAccounts

    override fun payments(): PaymentService = payments

    override fun threeDS(): ThreeDSService = threeDS

    override fun reports(): ReportService = reports

    override fun cardPrograms(): CardProgramService = cardPrograms

    override fun digitalCardArt(): DigitalCardArtService = digitalCardArt

    override fun bookTransfers(): BookTransferService = bookTransfers

    override fun creditProducts(): CreditProductService = creditProducts

    override fun externalPayments(): ExternalPaymentService = externalPayments

    override fun managementOperations(): ManagementOperationService = managementOperations

    override fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions,
    ): ApiStatus =
        // get /v1/status
        withRawResponse().apiStatus(params, requestOptions).parse()

    override fun close() = clientOptions.httpClient.close()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LithicClient.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val accounts: AccountService.WithRawResponse by lazy {
            AccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val accountHolders: AccountHolderService.WithRawResponse by lazy {
            AccountHolderServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val authRules: AuthRuleService.WithRawResponse by lazy {
            AuthRuleServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val authStreamEnrollment: AuthStreamEnrollmentService.WithRawResponse by lazy {
            AuthStreamEnrollmentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokenizationDecisioning:
            TokenizationDecisioningService.WithRawResponse by lazy {
            TokenizationDecisioningServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val tokenizations: TokenizationService.WithRawResponse by lazy {
            TokenizationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cards: CardService.WithRawResponse by lazy {
            CardServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val balances: BalanceService.WithRawResponse by lazy {
            BalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val aggregateBalances: AggregateBalanceService.WithRawResponse by lazy {
            AggregateBalanceServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val disputes: DisputeService.WithRawResponse by lazy {
            DisputeServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transfers: TransferService.WithRawResponse by lazy {
            TransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val financialAccounts: FinancialAccountService.WithRawResponse by lazy {
            FinancialAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val transactions: TransactionService.WithRawResponse by lazy {
            TransactionServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val responderEndpoints: ResponderEndpointService.WithRawResponse by lazy {
            ResponderEndpointServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalBankAccounts: ExternalBankAccountService.WithRawResponse by lazy {
            ExternalBankAccountServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val payments: PaymentService.WithRawResponse by lazy {
            PaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val threeDS: ThreeDSService.WithRawResponse by lazy {
            ThreeDSServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val reports: ReportService.WithRawResponse by lazy {
            ReportServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val cardPrograms: CardProgramService.WithRawResponse by lazy {
            CardProgramServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val digitalCardArt: DigitalCardArtService.WithRawResponse by lazy {
            DigitalCardArtServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val bookTransfers: BookTransferService.WithRawResponse by lazy {
            BookTransferServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val creditProducts: CreditProductService.WithRawResponse by lazy {
            CreditProductServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val externalPayments: ExternalPaymentService.WithRawResponse by lazy {
            ExternalPaymentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val managementOperations: ManagementOperationService.WithRawResponse by lazy {
            ManagementOperationServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun accounts(): AccountService.WithRawResponse = accounts

        override fun accountHolders(): AccountHolderService.WithRawResponse = accountHolders

        override fun authRules(): AuthRuleService.WithRawResponse = authRules

        override fun authStreamEnrollment(): AuthStreamEnrollmentService.WithRawResponse =
            authStreamEnrollment

        override fun tokenizationDecisioning(): TokenizationDecisioningService.WithRawResponse =
            tokenizationDecisioning

        override fun tokenizations(): TokenizationService.WithRawResponse = tokenizations

        override fun cards(): CardService.WithRawResponse = cards

        override fun balances(): BalanceService.WithRawResponse = balances

        override fun aggregateBalances(): AggregateBalanceService.WithRawResponse =
            aggregateBalances

        override fun disputes(): DisputeService.WithRawResponse = disputes

        override fun events(): EventService.WithRawResponse = events

        override fun transfers(): TransferService.WithRawResponse = transfers

        override fun financialAccounts(): FinancialAccountService.WithRawResponse =
            financialAccounts

        override fun transactions(): TransactionService.WithRawResponse = transactions

        override fun responderEndpoints(): ResponderEndpointService.WithRawResponse =
            responderEndpoints

        override fun externalBankAccounts(): ExternalBankAccountService.WithRawResponse =
            externalBankAccounts

        override fun payments(): PaymentService.WithRawResponse = payments

        override fun threeDS(): ThreeDSService.WithRawResponse = threeDS

        override fun reports(): ReportService.WithRawResponse = reports

        override fun cardPrograms(): CardProgramService.WithRawResponse = cardPrograms

        override fun digitalCardArt(): DigitalCardArtService.WithRawResponse = digitalCardArt

        override fun bookTransfers(): BookTransferService.WithRawResponse = bookTransfers

        override fun creditProducts(): CreditProductService.WithRawResponse = creditProducts

        override fun externalPayments(): ExternalPaymentService.WithRawResponse = externalPayments

        override fun managementOperations(): ManagementOperationService.WithRawResponse =
            managementOperations

        private val apiStatusHandler: Handler<ApiStatus> =
            jsonHandler<ApiStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun apiStatus(
            params: ClientApiStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ApiStatus> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "status")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { apiStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
