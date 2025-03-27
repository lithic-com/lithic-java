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
import com.lithic.api.models.financialaccounts.loantapes.LoanTape
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeListPage
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeListParams
import com.lithic.api.models.financialaccounts.loantapes.LoanTapeRetrieveParams

class LoanTapeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LoanTapeService {

    private val withRawResponse: LoanTapeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LoanTapeService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: LoanTapeRetrieveParams,
        requestOptions: RequestOptions,
    ): LoanTape =
        // get /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: LoanTapeListParams,
        requestOptions: RequestOptions,
    ): LoanTapeListPage =
        // get /v1/financial_accounts/{financial_account_token}/loan_tapes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LoanTapeService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<LoanTape> =
            jsonHandler<LoanTape>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: LoanTapeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LoanTape> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "loan_tapes",
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

        private val listHandler: Handler<LoanTapeListPage.Response> =
            jsonHandler<LoanTapeListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: LoanTapeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LoanTapeListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "loan_tapes")
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
                    .let { LoanTapeListPage.of(LoanTapeServiceImpl(clientOptions), params, it) }
            }
        }
    }
}
