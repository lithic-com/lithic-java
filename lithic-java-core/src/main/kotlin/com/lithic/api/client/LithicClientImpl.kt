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

    private val webhooks: WebhookService by lazy { WebhookServiceImpl(clientOptions) }

    override fun async(): LithicClientAsync = async

    override fun accounts(): AccountService = accounts

    override fun accountHolders(): AccountHolderService = accountHolders

    override fun authRules(): AuthRuleService = authRules

    override fun authStreamEnrollment(): AuthStreamEnrollmentService = authStreamEnrollment

    override fun tokenizationDecisioning(): TokenizationDecisioningService = tokenizationDecisioning

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

    private val apiStatusHandler: Handler<ApiStatus> =
        jsonHandler<ApiStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** API status check */
    override fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions
    ): ApiStatus {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("status")
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
