// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorBodyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.Queue
import com.lithic.api.models.TransactionMonitoringQueueCreateParams
import com.lithic.api.models.TransactionMonitoringQueueDeleteParams
import com.lithic.api.models.TransactionMonitoringQueueListPageAsync
import com.lithic.api.models.TransactionMonitoringQueueListPageResponse
import com.lithic.api.models.TransactionMonitoringQueueListParams
import com.lithic.api.models.TransactionMonitoringQueueRetrieveParams
import com.lithic.api.models.TransactionMonitoringQueueUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class QueueServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    QueueServiceAsync {

    private val withRawResponse: QueueServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): QueueServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): QueueServiceAsync =
        QueueServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TransactionMonitoringQueueCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Queue> =
        // post /v1/transaction_monitoring/queues
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: TransactionMonitoringQueueRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Queue> =
        // get /v1/transaction_monitoring/queues/{queue_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TransactionMonitoringQueueUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Queue> =
        // patch /v1/transaction_monitoring/queues/{queue_token}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TransactionMonitoringQueueListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionMonitoringQueueListPageAsync> =
        // get /v1/transaction_monitoring/queues
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TransactionMonitoringQueueDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/transaction_monitoring/queues/{queue_token}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        QueueServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): QueueServiceAsync.WithRawResponse =
            QueueServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<Queue> = jsonHandler<Queue>(clientOptions.jsonMapper)

        override fun create(
            params: TransactionMonitoringQueueCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Queue>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { createHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveHandler: Handler<Queue> = jsonHandler<Queue>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransactionMonitoringQueueRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Queue>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueToken", params.queueToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<Queue> = jsonHandler<Queue>(clientOptions.jsonMapper)

        override fun update(
            params: TransactionMonitoringQueueUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Queue>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueToken", params.queueToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<TransactionMonitoringQueueListPageResponse> =
            jsonHandler<TransactionMonitoringQueueListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransactionMonitoringQueueListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringQueueListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TransactionMonitoringQueueListPageAsync.builder()
                                    .service(QueueServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TransactionMonitoringQueueDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("queueToken", params.queueToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "queues", params._pathParam(0))
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { deleteHandler.handle(it) }
                    }
                }
        }
    }
}
