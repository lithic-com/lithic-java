// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepare
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

class TransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val enhancedCommercialData: EnhancedCommercialDataService by lazy {
        EnhancedCommercialDataServiceImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    override fun enhancedCommercialData(): EnhancedCommercialDataService = enhancedCommercialData

    override fun events(): EventService = events

    private val retrieveHandler: Handler<Transaction> =
        jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get a specific card transaction. All amounts are in the smallest unit of their respective
     * currency (e.g., cents for USD).
     */
    override fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): Transaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "transactions", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<TransactionListPage.Response> =
        jsonHandler<TransactionListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * List card transactions. All amounts are in the smallest unit of their respective currency
     * (e.g., cents for USD) and inclusive of any acquirer fees.
     */
    override fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): TransactionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "transactions")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { TransactionListPage.of(this, params, it) }
    }

    private val simulateAuthorizationHandler: Handler<TransactionSimulateAuthorizationResponse> =
        jsonHandler<TransactionSimulateAuthorizationResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an authorization request from the card network as if it came from a merchant
     * acquirer. If you are configured for ASA, simulating authorizations requires your ASA client
     * to be set up properly, i.e. be able to respond to the ASA request with a valid JSON. For
     * users that are not configured for ASA, a daily transaction limit of $5000 USD is applied by
     * default. You can update this limit via the
     * [update account](https://docs.lithic.com/reference/patchaccountbytoken) endpoint.
     */
    override fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateAuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "authorize")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateAuthorizationHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val simulateAuthorizationAdviceHandler:
        Handler<TransactionSimulateAuthorizationAdviceResponse> =
        jsonHandler<TransactionSimulateAuthorizationAdviceResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an authorization advice from the card network as if it came from a merchant
     * acquirer. An authorization advice changes the pending amount of the transaction.
     */
    override fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateAuthorizationAdviceResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "authorization_advice")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateAuthorizationAdviceHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val simulateClearingHandler: Handler<TransactionSimulateClearingResponse> =
        jsonHandler<TransactionSimulateClearingResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Clears an existing authorization, either debit or credit. After this event, the transaction
     * transitions from `PENDING` to `SETTLED` status.
     *
     * If `amount` is not set, the full amount of the transaction will be cleared. Transactions that
     * have already cleared, either partially or fully, cannot be cleared again using this endpoint.
     */
    override fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateClearingResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "clearing")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateClearingHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val simulateCreditAuthorizationHandler:
        Handler<TransactionSimulateCreditAuthorizationResponse> =
        jsonHandler<TransactionSimulateCreditAuthorizationResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates a credit authorization advice from the card network. This message indicates that
     * the network approved a credit authorization on your behalf.
     */
    override fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateCreditAuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "credit_authorization_advice")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateCreditAuthorizationHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val simulateReturnHandler: Handler<TransactionSimulateReturnResponse> =
        jsonHandler<TransactionSimulateReturnResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Returns, or refunds, an amount back to a card. Returns simulated via this endpoint clear
     * immediately, without prior authorization, and result in a `SETTLED` transaction status.
     */
    override fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateReturnResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "return")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateReturnHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val simulateReturnReversalHandler: Handler<TransactionSimulateReturnReversalResponse> =
        jsonHandler<TransactionSimulateReturnReversalResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Reverses a return, i.e. a credit transaction with a `SETTLED` status. Returns can be
     * financial credit authorizations, or credit authorizations that have cleared.
     */
    override fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateReturnReversalResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "return_reversal")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateReturnReversalHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val simulateVoidHandler: Handler<TransactionSimulateVoidResponse> =
        jsonHandler<TransactionSimulateVoidResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Voids a pending authorization. If `amount` is not set, the full amount will be voided. Can be
     * used on partially voided transactions but not partially cleared transactions. _Simulating an
     * authorization expiry on credit authorizations or credit authorization advice is not currently
     * supported but will be added soon._
     */
    override fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateVoidResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "simulate", "void")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { simulateVoidHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
