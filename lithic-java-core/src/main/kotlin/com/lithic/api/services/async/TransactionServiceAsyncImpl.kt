// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
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
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionExpireAuthorizationParams
import com.lithic.api.models.TransactionListPageAsync
import com.lithic.api.models.TransactionListPageResponse
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
import com.lithic.api.services.async.transactions.EnhancedCommercialDataServiceAsync
import com.lithic.api.services.async.transactions.EnhancedCommercialDataServiceAsyncImpl
import com.lithic.api.services.async.transactions.EventServiceAsync
import com.lithic.api.services.async.transactions.EventServiceAsyncImpl
import java.util.concurrent.CompletableFuture

class TransactionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionServiceAsync {

    private val withRawResponse: TransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val enhancedCommercialData: EnhancedCommercialDataServiceAsync by lazy {
        EnhancedCommercialDataServiceAsyncImpl(clientOptions)
    }

    private val events: EventServiceAsync by lazy { EventServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): TransactionServiceAsync.WithRawResponse = withRawResponse

    override fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync =
        enhancedCommercialData

    override fun events(): EventServiceAsync = events

    override fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Transaction> =
        // get /v1/transactions/{transaction_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionListPageAsync> =
        // get /v1/transactions
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun expireAuthorization(
        params: TransactionExpireAuthorizationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // post /v1/transactions/{transaction_token}/expire_authorization
        withRawResponse().expireAuthorization(params, requestOptions).thenAccept {}

    override fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionSimulateAuthorizationResponse> =
        // post /v1/simulate/authorize
        withRawResponse().simulateAuthorization(params, requestOptions).thenApply { it.parse() }

    override fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionSimulateAuthorizationAdviceResponse> =
        // post /v1/simulate/authorization_advice
        withRawResponse().simulateAuthorizationAdvice(params, requestOptions).thenApply {
            it.parse()
        }

    override fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionSimulateClearingResponse> =
        // post /v1/simulate/clearing
        withRawResponse().simulateClearing(params, requestOptions).thenApply { it.parse() }

    override fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionSimulateCreditAuthorizationResponse> =
        // post /v1/simulate/credit_authorization_advice
        withRawResponse().simulateCreditAuthorization(params, requestOptions).thenApply {
            it.parse()
        }

    override fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionSimulateReturnResponse> =
        // post /v1/simulate/return
        withRawResponse().simulateReturn(params, requestOptions).thenApply { it.parse() }

    override fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionSimulateReturnReversalResponse> =
        // post /v1/simulate/return_reversal
        withRawResponse().simulateReturnReversal(params, requestOptions).thenApply { it.parse() }

    override fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionSimulateVoidResponse> =
        // post /v1/simulate/void
        withRawResponse().simulateVoid(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val enhancedCommercialData:
            EnhancedCommercialDataServiceAsync.WithRawResponse by lazy {
            EnhancedCommercialDataServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val events: EventServiceAsync.WithRawResponse by lazy {
            EventServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync.WithRawResponse =
            enhancedCommercialData

        override fun events(): EventServiceAsync.WithRawResponse = events

        private val retrieveHandler: Handler<Transaction> =
            jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Transaction>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "transactions", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TransactionListPageResponse> =
            jsonHandler<TransactionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "transactions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TransactionListPageAsync.builder()
                                    .service(TransactionServiceAsyncImpl(clientOptions))
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val expireAuthorizationHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun expireAuthorization(
            params: TransactionExpireAuthorizationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable { response.use { expireAuthorizationHandler.handle(it) } }
                }
        }

        private val simulateAuthorizationHandler:
            Handler<TransactionSimulateAuthorizationResponse> =
            jsonHandler<TransactionSimulateAuthorizationResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionSimulateAuthorizationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "authorize")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateAuthorizationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "authorization_advice")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateAuthorizationAdviceHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<TransactionSimulateClearingResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "clearing")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateClearingHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<TransactionSimulateCreditAuthorizationResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "credit_authorization_advice")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateCreditAuthorizationHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<TransactionSimulateReturnResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "return")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateReturnHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<TransactionSimulateReturnReversalResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "return_reversal")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { simulateReturnReversalHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
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
        ): CompletableFuture<HttpResponseFor<TransactionSimulateVoidResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "simulate", "void")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
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
}
