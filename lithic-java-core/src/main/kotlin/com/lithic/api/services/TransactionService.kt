package com.lithic.api.services

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionListPage
import com.lithic.api.models.TransactionListParams
import com.lithic.api.models.TransactionRetrieveParams
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
import com.lithic.api.services.*

class TransactionService constructor(private val clientOptions: ClientOptions) {
    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Transaction> =
        jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get specific transaction.
     *
     * _Note that the transaction object returned via this endpoint will be changing in Sandbox on
     * January 4, 2023 and in Production on February 8, 2023. Please refer to
     * [this page](https://docs.lithic.com/docs/guide-to-q1-2023-lithic-api-changes) for more
     * information._
     */
    @JvmOverloads
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("transactions", params.getPathParam(0))
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { retrieveHandler.handle(it) }
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

    /**
     * List transactions.
     *
     * _Note that the transaction object returned via this endpoint will be changing in Sandbox on
     * January 4, 2023 and in Production on February 8, 2023. Please refer to
     * [this page](https://docs.lithic.com/docs/guide-to-q1-2023-lithic-api-changes) for more
     * information._
     */
    @JvmOverloads
    fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("transactions")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { listHandler.handle(it) }
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
    @JvmOverloads
    fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateAuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "authorize")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { simulateAuthorizationHandler.handle(it) }
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
    @JvmOverloads
    fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateClearingResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "clearing")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { simulateClearingHandler.handle(it) }
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
    @JvmOverloads
    fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateCreditAuthorizationResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "credit_authorization_advice")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { simulateCreditAuthorizationHandler.handle(it) }
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
    @JvmOverloads
    fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateReturnResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "return")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { simulateReturnHandler.handle(it) }
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
     * authorizations. This endpoint will be available beginning January 4, 2023.
     */
    @JvmOverloads
    fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateReturnReversalResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "return_reversal")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { simulateReturnReversalHandler.handle(it) }
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
    @JvmOverloads
    fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateVoidResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "void")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { simulateVoidHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
