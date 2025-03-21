// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts.statements

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
import com.lithic.api.models.FinancialAccountStatementLineItemListPage
import com.lithic.api.models.FinancialAccountStatementLineItemListParams

class LineItemServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LineItemService {

    private val withRawResponse: LineItemService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LineItemService.WithRawResponse = withRawResponse

    override fun list(
        params: FinancialAccountStatementLineItemListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountStatementLineItemListPage =
        // get
        // /v1/financial_accounts/{financial_account_token}/statements/{statement_token}/line_items
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LineItemService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<FinancialAccountStatementLineItemListPage.Response> =
            jsonHandler<FinancialAccountStatementLineItemListPage.Response>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override fun list(
            params: FinancialAccountStatementLineItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountStatementLineItemListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "statements",
                        params._pathParam(1),
                        "line_items",
                    )
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
                    .let {
                        FinancialAccountStatementLineItemListPage.of(
                            LineItemServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
