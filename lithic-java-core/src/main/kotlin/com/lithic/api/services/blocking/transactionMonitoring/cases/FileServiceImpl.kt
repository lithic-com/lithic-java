// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactionMonitoring.cases

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
import com.lithic.api.core.prepare
import com.lithic.api.models.CaseFile
import com.lithic.api.models.TransactionMonitoringCaseFileCreateParams
import com.lithic.api.models.TransactionMonitoringCaseFileDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseFileListPage
import com.lithic.api.models.TransactionMonitoringCaseFileListPageResponse
import com.lithic.api.models.TransactionMonitoringCaseFileListParams
import com.lithic.api.models.TransactionMonitoringCaseFileRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class FileServiceImpl internal constructor(private val clientOptions: ClientOptions) : FileService {

    private val withRawResponse: FileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): FileService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): FileService =
        FileServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TransactionMonitoringCaseFileCreateParams,
        requestOptions: RequestOptions,
    ): CaseFile =
        // post /v1/transaction_monitoring/cases/{case_token}/files
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: TransactionMonitoringCaseFileRetrieveParams,
        requestOptions: RequestOptions,
    ): CaseFile =
        // get /v1/transaction_monitoring/cases/{case_token}/files/{file_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: TransactionMonitoringCaseFileListParams,
        requestOptions: RequestOptions,
    ): TransactionMonitoringCaseFileListPage =
        // get /v1/transaction_monitoring/cases/{case_token}/files
        withRawResponse().list(params, requestOptions).parse()

    override fun delete(
        params: TransactionMonitoringCaseFileDeleteParams,
        requestOptions: RequestOptions,
    ) {
        // delete /v1/transaction_monitoring/cases/{case_token}/files/{file_token}
        withRawResponse().delete(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        FileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): FileService.WithRawResponse =
            FileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CaseFile> =
            jsonHandler<CaseFile>(clientOptions.jsonMapper)

        override fun create(
            params: TransactionMonitoringCaseFileCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CaseFile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("caseToken", params.caseToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "files",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<CaseFile> =
            jsonHandler<CaseFile>(clientOptions.jsonMapper)

        override fun retrieve(
            params: TransactionMonitoringCaseFileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CaseFile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileToken", params.fileToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<TransactionMonitoringCaseFileListPageResponse> =
            jsonHandler<TransactionMonitoringCaseFileListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: TransactionMonitoringCaseFileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionMonitoringCaseFileListPage> {
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
                        "files",
                    )
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
                        TransactionMonitoringCaseFileListPage.builder()
                            .service(FileServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TransactionMonitoringCaseFileDeleteParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("fileToken", params.fileToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "files",
                        params._pathParam(1),
                    )
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response.use { deleteHandler.handle(it) }
            }
        }
    }
}
