// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccountStatementListPage
import com.lithic.api.models.FinancialAccountStatementListParams
import com.lithic.api.models.FinancialAccountStatementRetrieveParams
import com.lithic.api.models.Statement
import com.lithic.api.services.blocking.financialAccounts.statements.LineItemService
import com.lithic.api.services.blocking.financialAccounts.statements.LineItemServiceImpl

class StatementServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : StatementService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val lineItems: LineItemService by lazy { LineItemServiceImpl(clientOptions) }

    override fun lineItems(): LineItemService = lineItems

    private val retrieveHandler: Handler<Statement> =
        jsonHandler<Statement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific statement for a given financial account. */
    override fun retrieve(
        params: FinancialAccountStatementRetrieveParams,
        requestOptions: RequestOptions
    ): Statement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "financial_accounts",
                    params.getPathParam(0),
                    "statements",
                    params.getPathParam(1)
                )
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<FinancialAccountStatementListPage.Response> =
        jsonHandler<FinancialAccountStatementListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the statements for a given financial account. */
    override fun list(
        params: FinancialAccountStatementListParams,
        requestOptions: RequestOptions
    ): FinancialAccountStatementListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "financial_accounts", params.getPathParam(0), "statements")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { FinancialAccountStatementListPage.of(this, params, it) }
    }
}
