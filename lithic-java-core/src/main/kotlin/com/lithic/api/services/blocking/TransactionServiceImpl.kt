// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionExpireAuthorizationParams
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

    private val withRawResponse: TransactionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enhancedCommercialData: EnhancedCommercialDataService by lazy {
        EnhancedCommercialDataServiceImpl(clientOptions)
    }

    private val events: EventService by lazy { EventServiceImpl(clientOptions) }

    override fun withRawResponse(): TransactionService.WithRawResponse = withRawResponse

    override fun enhancedCommercialData(): EnhancedCommercialDataService = enhancedCommercialData

    override fun events(): EventService = events

    override fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): Transaction =
        // get /v1/transactions/{transaction_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): TransactionListPage =
        // get /v1/transactions
        withRawResponse().list(params, requestOptions).parse()

    override fun expireAuthorization(
        params: TransactionExpireAuthorizationParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/transactions/{transaction_token}/expire_authorization
        withRawResponse().expireAuthorization(params, requestOptions)
    }

    override fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateAuthorizationResponse =
        // post /v1/simulate/authorize
        withRawResponse().simulateAuthorization(params, requestOptions).parse()

    override fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateAuthorizationAdviceResponse =
        // post /v1/simulate/authorization_advice
        withRawResponse().simulateAuthorizationAdvice(params, requestOptions).parse()

    override fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateClearingResponse =
        // post /v1/simulate/clearing
        withRawResponse().simulateClearing(params, requestOptions).parse()

    override fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateCreditAuthorizationResponse =
        // post /v1/simulate/credit_authorization_advice
        withRawResponse().simulateCreditAuthorization(params, requestOptions).parse()

    override fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateReturnResponse =
        // post /v1/simulate/return
        withRawResponse().simulateReturn(params, requestOptions).parse()

    override fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateReturnReversalResponse =
        // post /v1/simulate/return_reversal
        withRawResponse().simulateReturnReversal(params, requestOptions).parse()

    override fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions,
    ): TransactionSimulateVoidResponse =
        // post /v1/simulate/void
        withRawResponse().simulateVoid(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionService.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val enhancedCommercialData: EnhancedCommercialDataService.WithRawResponse by lazy {
            EnhancedCommercialDataServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventService.WithRawResponse by lazy {
            EventServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun enhancedCommercialData(): EnhancedCommercialDataService.WithRawResponse =
            enhancedCommercialData

        override fun events(): EventService.WithRawResponse = events

        private val retrieveHandler: Handler<Transaction> =
            jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Transaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "transactions", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TransactionListPage.Response> =
            jsonHandler<TransactionListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "transactions")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TransactionListPage.of(TransactionServiceImpl(clientOptions), params, it)
                    }
            }
        }

        private val expireAuthorizationHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun expireAuthorization(
            params: TransactionExpireAuthorizationParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "transactions",
                        params._pathParam(0),
                        "expire_authorization",
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { expireAuthorizationHandler.handle(it) } }
        }

        private val simulateAuthorizationHandler:
            Handler<TransactionSimulateAuthorizationResponse> =
            jsonHandler<TransactionSimulateAuthorizationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateAuthorizationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "authorize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateAuthorizationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateAuthorizationAdviceHandler:
            Handler<TransactionSimulateAuthorizationAdviceResponse> =
            jsonHandler<TransactionSimulateAuthorizationAdviceResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateAuthorizationAdvice(
            params: TransactionSimulateAuthorizationAdviceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "authorization_advice")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateAuthorizationAdviceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateClearingHandler: Handler<TransactionSimulateClearingResponse> =
            jsonHandler<TransactionSimulateClearingResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateClearing(
            params: TransactionSimulateClearingParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateClearingResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "clearing")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateClearingHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateCreditAuthorizationHandler:
            Handler<TransactionSimulateCreditAuthorizationResponse> =
            jsonHandler<TransactionSimulateCreditAuthorizationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateCreditAuthorization(
            params: TransactionSimulateCreditAuthorizationParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateCreditAuthorizationResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "credit_authorization_advice")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateCreditAuthorizationHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateReturnHandler: Handler<TransactionSimulateReturnResponse> =
            jsonHandler<TransactionSimulateReturnResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateReturn(
            params: TransactionSimulateReturnParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateReturnResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateReturnHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateReturnReversalHandler:
            Handler<TransactionSimulateReturnReversalResponse> =
            jsonHandler<TransactionSimulateReturnReversalResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateReturnReversal(
            params: TransactionSimulateReturnReversalParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateReturnReversalResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "return_reversal")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateReturnReversalHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateVoidHandler: Handler<TransactionSimulateVoidResponse> =
            jsonHandler<TransactionSimulateVoidResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateVoid(
            params: TransactionSimulateVoidParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionSimulateVoidResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "void")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateVoidHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
