// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
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
import com.lithic.api.models.CaseCard
import com.lithic.api.models.MonitoringCase
import com.lithic.api.models.TransactionMonitoringCaseListActivityPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListActivityPageResponse
import com.lithic.api.models.TransactionMonitoringCaseListActivityParams
import com.lithic.api.models.TransactionMonitoringCaseListPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListPageResponse
import com.lithic.api.models.TransactionMonitoringCaseListParams
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsPageAsync
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsPageResponse
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveCardsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveParams
import com.lithic.api.models.TransactionMonitoringCaseUpdateParams
import com.lithic.api.services.async.transactionMonitoring.cases.CommentServiceAsync
import com.lithic.api.services.async.transactionMonitoring.cases.CommentServiceAsyncImpl
import com.lithic.api.services.async.transactionMonitoring.cases.FileServiceAsync
import com.lithic.api.services.async.transactionMonitoring.cases.FileServiceAsyncImpl
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CaseServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CaseServiceAsync {

    private val withRawResponse: CaseServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val comments: CommentServiceAsync by lazy { CommentServiceAsyncImpl(clientOptions) }

    private val files: FileServiceAsync by lazy { FileServiceAsyncImpl(clientOptions) }

    override fun withRawResponse(): CaseServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CaseServiceAsync =
        CaseServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun comments(): CommentServiceAsync = comments

    override fun files(): FileServiceAsync = files

    override fun retrieve(
        params: TransactionMonitoringCaseRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MonitoringCase> =
        // get /v1/transaction_monitoring/cases/{case_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TransactionMonitoringCaseUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<MonitoringCase> =
        // patch /v1/transaction_monitoring/cases/{case_token}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: TransactionMonitoringCaseListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionMonitoringCaseListPageAsync> =
        // get /v1/transaction_monitoring/cases
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun listActivity(
        params: TransactionMonitoringCaseListActivityParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionMonitoringCaseListActivityPageAsync> =
        // get /v1/transaction_monitoring/cases/{case_token}/activity
        withRawResponse().listActivity(params, requestOptions).thenApply { it.parse() }

    override fun listTransactions(
        params: TransactionMonitoringCaseListTransactionsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<TransactionMonitoringCaseListTransactionsPageAsync> =
        // get /v1/transaction_monitoring/cases/{case_token}/transactions
        withRawResponse().listTransactions(params, requestOptions).thenApply { it.parse() }

    override fun retrieveCards(
        params: TransactionMonitoringCaseRetrieveCardsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<List<CaseCard>> =
        // get /v1/transaction_monitoring/cases/{case_token}/cards
        withRawResponse().retrieveCards(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CaseServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val comments: CommentServiceAsync.WithRawResponse by lazy {
            CommentServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileServiceAsync.WithRawResponse by lazy {
            FileServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CaseServiceAsync.WithRawResponse =
            CaseServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun comments(): CommentServiceAsync.WithRawResponse = comments

        override fun files(): FileServiceAsync.WithRawResponse = files

        private val retrieveHandler: Handler<MonitoringCase> =
            jsonHandler<MonitoringCase>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransactionMonitoringCaseRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("caseToken", params.caseToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "cases", params._pathParam(0))
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

        private val updateHandler: Handler<MonitoringCase> =
            jsonHandler<MonitoringCase>(clientOptions.jsonMapper)

        override fun update(
            params: TransactionMonitoringCaseUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<MonitoringCase>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("caseToken", params.caseToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "cases", params._pathParam(0))
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

        private val listHandler: Handler<TransactionMonitoringCaseListPageResponse> =
            jsonHandler<TransactionMonitoringCaseListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransactionMonitoringCaseListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "cases")
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
                                TransactionMonitoringCaseListPageAsync.builder()
                                    .service(CaseServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listActivityHandler:
            Handler<TransactionMonitoringCaseListActivityPageResponse> =
            jsonHandler<TransactionMonitoringCaseListActivityPageResponse>(clientOptions.jsonMapper)

        override fun listActivity(
            params: TransactionMonitoringCaseListActivityParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListActivityPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("caseToken", params.caseToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "activity",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listActivityHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TransactionMonitoringCaseListActivityPageAsync.builder()
                                    .service(CaseServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val listTransactionsHandler:
            Handler<TransactionMonitoringCaseListTransactionsPageResponse> =
            jsonHandler<TransactionMonitoringCaseListTransactionsPageResponse>(
                clientOptions.jsonMapper
            )

        override fun listTransactions(
            params: TransactionMonitoringCaseListTransactionsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<TransactionMonitoringCaseListTransactionsPageAsync>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("caseToken", params.caseToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "transactions",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listTransactionsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                TransactionMonitoringCaseListTransactionsPageAsync.builder()
                                    .service(CaseServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveCardsHandler: Handler<List<CaseCard>> =
            jsonHandler<List<CaseCard>>(clientOptions.jsonMapper)

        override fun retrieveCards(
            params: TransactionMonitoringCaseRetrieveCardsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<List<CaseCard>>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("caseToken", params.caseToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "cards",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveCardsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.forEach { it.validate() }
                                }
                            }
                    }
                }
        }
    }
}
