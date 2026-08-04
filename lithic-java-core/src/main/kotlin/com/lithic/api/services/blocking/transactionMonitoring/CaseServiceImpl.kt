// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring

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
import com.lithic.api.core.prepare
import com.lithic.api.models.CaseCard
import com.lithic.api.models.MonitoringCase
import com.lithic.api.models.TransactionMonitoringCaseListActivityPage
import com.lithic.api.models.TransactionMonitoringCaseListActivityPageResponse
import com.lithic.api.models.TransactionMonitoringCaseListActivityParams
import com.lithic.api.models.TransactionMonitoringCaseListPage
import com.lithic.api.models.TransactionMonitoringCaseListPageResponse
import com.lithic.api.models.TransactionMonitoringCaseListParams
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsPage
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsPageResponse
import com.lithic.api.models.TransactionMonitoringCaseListTransactionsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveCardsParams
import com.lithic.api.models.TransactionMonitoringCaseRetrieveParams
import com.lithic.api.models.TransactionMonitoringCaseUpdateParams
import com.lithic.api.services.blocking.transactionMonitoring.cases.CommentService
import com.lithic.api.services.blocking.transactionMonitoring.cases.CommentServiceImpl
import com.lithic.api.services.blocking.transactionMonitoring.cases.FileService
import com.lithic.api.services.blocking.transactionMonitoring.cases.FileServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CaseServiceImpl internal constructor(private val clientOptions: ClientOptions) : CaseService {

    private val withRawResponse: CaseService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val comments: CommentService by lazy { CommentServiceImpl(clientOptions) }

    private val files: FileService by lazy { FileServiceImpl(clientOptions) }

    override fun withRawResponse(): CaseService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CaseService =
        CaseServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun comments(): CommentService = comments

    override fun files(): FileService = files

    override fun retrieve(
        params: TransactionMonitoringCaseRetrieveParams,
        requestOptions: RequestOptions,
    ): MonitoringCase =
        // get /v1/transaction_monitoring/cases/{case_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: TransactionMonitoringCaseUpdateParams,
        requestOptions: RequestOptions,
    ): MonitoringCase =
        // patch /v1/transaction_monitoring/cases/{case_token}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: TransactionMonitoringCaseListParams,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseListPage =
        // get /v1/transaction_monitoring/cases
        withRawResponse().list(params, requestOptions).parse()

    override fun listActivity(
        params: TransactionMonitoringCaseListActivityParams,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseListActivityPage =
        // get /v1/transaction_monitoring/cases/{case_token}/activity
        withRawResponse().listActivity(params, requestOptions).parse()

    override fun listTransactions(
        params: TransactionMonitoringCaseListTransactionsParams,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseListTransactionsPage =
        // get /v1/transaction_monitoring/cases/{case_token}/transactions
        withRawResponse().listTransactions(params, requestOptions).parse()

    override fun retrieveCards(
        params: TransactionMonitoringCaseRetrieveCardsParams,
        requestOptions: RequestOptions,
    ): List<CaseCard> =
        // get /v1/transaction_monitoring/cases/{case_token}/cards
        withRawResponse().retrieveCards(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CaseService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val comments: CommentService.WithRawResponse by lazy {
            CommentServiceImpl.WithRawResponseImpl(clientOptions)
        }

        private val files: FileService.WithRawResponse by lazy {
            FileServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CaseService.WithRawResponse =
            CaseServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun comments(): CommentService.WithRawResponse = comments

        override fun files(): FileService.WithRawResponse = files

        private val retrieveHandler: Handler<MonitoringCase> =
            jsonHandler<MonitoringCase>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransactionMonitoringCaseRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitoringCase> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("caseToken", params.caseToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "cases", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<MonitoringCase> =
            jsonHandler<MonitoringCase>(clientOptions.jsonMapper)

        override fun update(
            params: TransactionMonitoringCaseUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MonitoringCase> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<TransactionMonitoringCaseListPageResponse> =
            jsonHandler<TransactionMonitoringCaseListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransactionMonitoringCaseListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "transaction_monitoring", "cases")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TransactionMonitoringCaseListPage.builder()
                            .service(CaseServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val listActivityHandler:
            Handler<TransactionMonitoringCaseListActivityPageResponse> =
            jsonHandler<TransactionMonitoringCaseListActivityPageResponse>(clientOptions.jsonMapper)

        override fun listActivity(
            params: TransactionMonitoringCaseListActivityParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseListActivityPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listActivityHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TransactionMonitoringCaseListActivityPage.builder()
                            .service(CaseServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
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
        ): HttpResponseFor<TransactionMonitoringCaseListTransactionsPage> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listTransactionsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        TransactionMonitoringCaseListTransactionsPage.builder()
                            .service(CaseServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveCardsHandler: Handler<List<CaseCard>> =
            jsonHandler<List<CaseCard>>(clientOptions.jsonMapper)

        override fun retrieveCards(
            params: TransactionMonitoringCaseRetrieveCardsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<CaseCard>> {
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
