// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.errorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.jsonHandler
import com.lithic.api.core.withErrorHandler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionListPage
import com.lithic.api.models.TransactionListParams
import com.lithic.api.models.TransactionRetrieveParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceResponse
import com.lithic.api.models.TransactionSimulateAuthorizationParams
import com.lithic.api.models.TransactionSimulateAuthorizationResponse
import com.lithic.api.models.TransactionSimulateClearingParams
import com.lithic.api.models.TransactionSimulateClearingResponse
import com.lithic.api.models.TransactionSimulateCreditAuthorizationParams
import com.lithic.api.models.TransactionSimulateCreditAuthorizationResponse
import com.lithic.api.models.TransactionSimulateReturnParams
import com.lithic.api.models.TransactionSimulateReturnResponse
import com.lithic.api.models.TransactionSimulateReturnReversalParams
import com.lithic.api.models.TransactionSimulateReturnReversalResponse
import com.lithic.api.models.TransactionSimulateVoidParams
import com.lithic.api.models.TransactionSimulateVoidResponse
import com.lithic.api.services.blocking.transactions.EnhancedCommercialDataService
import com.lithic.api.services.blocking.transactions.EnhancedCommercialDataServiceImpl
import com.lithic.api.services.blocking.transactions.EventService
import com.lithic.api.services.blocking.transactions.EventServiceImpl

class TransactionServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TransactionService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val enhancedCommercialData: EnhancedCommercialDataService by lazy {
        EnhancedCommercialDataServiceImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    override fun enhancedCommercialData(): EnhancedCommercialDataService = enhancedCommercialData

    override fun events(): EventService = events

    private val retrieveHandler: Handler<Transaction> =
        jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get specific card transaction. */
    override fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions
    ): Transaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "transactions", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<TransactionListPage.Response> =
        jsonHandler<TransactionListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List card transactions. */
    override fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions
    ): TransactionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "transactions")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { TransactionListPage.of(this, params, it) }
        }
    }

    private val simulateAuthorizationHandler: Handler<TransactionSimulateAuthorizationResponse> =
        jsonHandler<TransactionSimulateAuthorizationResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an authorization request from the payment network as if it came from a merchant
     * acquirer. If you're configured for ASA, simulating auths requires your ASA client to be set
     * up properly (respond with a valid JSON to the ASA request). For users that are not configured
     * for ASA, a daily transaction limit of $5000 USD is applied by default. This limit can be
     * modified via the [update account](https://docs.lithic.com/reference/patchaccountbytoken)
     * endpoint.
     */
    override fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions
    ): TransactionSimulateAuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "authorize")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateAuthorizationHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val simulateAuthorizationAdviceHandler:
        Handler<TransactionSimulateAuthorizationAdviceResponse> =
        jsonHandler<TransactionSimulateAuthorizationAdviceResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an authorization advice request from the payment network as if it came from a
     * merchant acquirer. An authorization advice request changes the amount of the transaction.
     */
    override fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions
    ): TransactionSimulateAuthorizationAdviceResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "authorization_advice")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateAuthorizationAdviceHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val simulateClearingHandler: Handler<TransactionSimulateClearingResponse> =
        jsonHandler<TransactionSimulateClearingResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Clears an existing authorization. After this event, the transaction is no longer pending.
     *
     * If no `amount` is supplied to this endpoint, the amount of the transaction will be captured.
     * Any transaction that has any amount completed at all do not have access to this behavior.
     */
    override fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions
    ): TransactionSimulateClearingResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "clearing")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateClearingHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val simulateCreditAuthorizationHandler:
        Handler<TransactionSimulateCreditAuthorizationResponse> =
        jsonHandler<TransactionSimulateCreditAuthorizationResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates a credit authorization advice message from the payment network. This message
     * indicates that a credit authorization was approved on your behalf by the network.
     */
    override fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions
    ): TransactionSimulateCreditAuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "credit_authorization_advice")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateCreditAuthorizationHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val simulateReturnHandler: Handler<TransactionSimulateReturnResponse> =
        jsonHandler<TransactionSimulateReturnResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns (aka refunds) an amount back to a card. Returns are cleared immediately and do not
     * spend time in a `PENDING` state.
     */
    override fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions
    ): TransactionSimulateReturnResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "return")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateReturnHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val simulateReturnReversalHandler: Handler<TransactionSimulateReturnReversalResponse> =
        jsonHandler<TransactionSimulateReturnReversalResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Voids a settled credit transaction – i.e., a transaction with a negative amount and `SETTLED`
     * status. These can be credit authorizations that have already cleared or financial credit
     * authorizations.
     */
    override fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions
    ): TransactionSimulateReturnReversalResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "return_reversal")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateReturnReversalHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val simulateVoidHandler: Handler<TransactionSimulateVoidResponse> =
        jsonHandler<TransactionSimulateVoidResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Voids an existing, uncleared (aka pending) authorization. If amount is not sent the full
     * amount will be voided. Cannot be used on partially completed transactions, but can be used on
     * partially voided transactions. _Note that simulating an authorization expiry on credit
     * authorizations or credit authorization advice is not currently supported but will be added
     * soon._
     */
    override fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions
    ): TransactionSimulateVoidResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "void")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateVoidHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
