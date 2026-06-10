// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.transactionMonitoring.cases

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
import com.lithic.api.models.CaseActivityEntry
import com.lithic.api.models.TransactionMonitoringCaseCommentCreateParams
import com.lithic.api.models.TransactionMonitoringCaseCommentDeleteParams
import com.lithic.api.models.TransactionMonitoringCaseCommentUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CommentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CommentServiceAsync {

    private val withRawResponse: CommentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CommentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CommentServiceAsync =
        CommentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: TransactionMonitoringCaseCommentCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CaseActivityEntry> =
        // post /v1/transaction_monitoring/cases/{case_token}/comments
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: TransactionMonitoringCaseCommentUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CaseActivityEntry> =
        // patch /v1/transaction_monitoring/cases/{case_token}/comments/{comment_token}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun delete(
        params: TransactionMonitoringCaseCommentDeleteParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        // delete /v1/transaction_monitoring/cases/{case_token}/comments/{comment_token}
        withRawResponse().delete(params, requestOptions).thenAccept {}

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CommentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CommentServiceAsync.WithRawResponse =
            CommentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<CaseActivityEntry> =
            jsonHandler<CaseActivityEntry>(clientOptions.jsonMapper)

        override fun create(
            params: TransactionMonitoringCaseCommentCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>> {
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
                        "comments",
                    )
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

        private val updateHandler: Handler<CaseActivityEntry> =
            jsonHandler<CaseActivityEntry>(clientOptions.jsonMapper)

        override fun update(
            params: TransactionMonitoringCaseCommentUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CaseActivityEntry>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commentToken", params.commentToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "comments",
                        params._pathParam(1),
                    )
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

        private val deleteHandler: Handler<Void?> = emptyHandler()

        override fun delete(
            params: TransactionMonitoringCaseCommentDeleteParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("commentToken", params.commentToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transaction_monitoring",
                        "cases",
                        params._pathParam(0),
                        "comments",
                        params._pathParam(1),
                    )
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
