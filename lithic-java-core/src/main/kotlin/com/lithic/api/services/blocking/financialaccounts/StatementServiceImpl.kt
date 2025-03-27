// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialaccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.financialaccounts.statements.Statement
import com.lithic.api.models.financialaccounts.statements.StatementListPage
import com.lithic.api.models.financialaccounts.statements.StatementListParams
import com.lithic.api.models.financialaccounts.statements.StatementRetrieveParams
import com.lithic.api.services.blocking.financialaccounts.statements.LineItemService
import com.lithic.api.services.blocking.financialaccounts.statements.LineItemServiceImpl

class StatementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementService {

    private val withRawResponse: StatementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lineItems: LineItemService by lazy { LineItemServiceImpl(clientOptions) }

    override fun withRawResponse(): StatementService.WithRawResponse = withRawResponse

    override fun lineItems(): LineItemService = lineItems

    override fun retrieve(
        params: StatementRetrieveParams,
        requestOptions: RequestOptions,
    ): Statement =
        // get /v1/financial_accounts/{financial_account_token}/statements/{statement_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: StatementListParams,
        requestOptions: RequestOptions,
    ): StatementListPage =
        // get /v1/financial_accounts/{financial_account_token}/statements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val lineItems: LineItemService.WithRawResponse by lazy {
            LineItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun lineItems(): LineItemService.WithRawResponse = lineItems

        private val retrieveHandler: Handler<Statement> =
            jsonHandler<Statement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: StatementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Statement> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "statements",
                        params._pathParam(1),
                    )
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

        private val listHandler: Handler<StatementListPage.Response> =
            jsonHandler<StatementListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: StatementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<StatementListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "statements")
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
                    .let { StatementListPage.of(StatementServiceImpl(clientOptions), params, it) }
            }
        }
    }
}
