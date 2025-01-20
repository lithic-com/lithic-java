// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts.statements

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccountStatementLineItemListPage
import com.lithic.api.models.FinancialAccountStatementLineItemListParams

class LineItemServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LineItemService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<FinancialAccountStatementLineItemListPage.Response> =
        jsonHandler<FinancialAccountStatementLineItemListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the line items for a given statement within a given financial account. */
    override fun list(
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions
    ): FinancialAccountStatementLineItemListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "financial_accounts",
                    params.getPathParam(0),
                    "statements",
                    params.getPathParam(1),
                    "line_items"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { FinancialAccountStatementLineItemListPage.of(this, params, it) }
        }
    }
}
