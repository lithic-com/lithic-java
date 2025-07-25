// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.FinancialAccountStatementListPage
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import com.lithic.api.models.Statement
import com.lithic.api.models.Statements
import com.lithic.api.services.blocking.financialAccounts.statements.LineItemService
import com.lithic.api.services.blocking.financialAccounts.statements.LineItemServiceImpl
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class StatementServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    StatementService {

    private val withRawResponse: StatementService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val lineItems: LineItemService by lazy { LineItemServiceImpl(clientOptions) }

    override fun withRawResponse(): StatementService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): StatementService =
        StatementServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun lineItems(): LineItemService = lineItems

    override fun retrieve(
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions,
    ): Statement =
        // get /v1/financial_accounts/{financial_account_token}/statements/{statement_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: FinancialAccountStatementListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountStatementListPage =
        // get /v1/financial_accounts/{financial_account_token}/statements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        StatementService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val lineItems: LineItemService.WithRawResponse by lazy {
            LineItemServiceImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): StatementService.WithRawResponse =
            StatementServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun lineItems(): LineItemService.WithRawResponse = lineItems

        private val retrieveHandler: Handler<Statement> =
            jsonHandler<Statement>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FinancialAccountStatementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Statement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("statementToken", params.statementToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
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

        private val listHandler: Handler<Statements> =
            jsonHandler<Statements>(clientOptions.jsonMapper)

        override fun list(
            params: FinancialAccountStatementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountStatementListPage> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "statements")
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
                        FinancialAccountStatementListPage.builder()
                            .service(StatementServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
