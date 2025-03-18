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
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccountLoanTapeListPage
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import com.lithic.api.models.FinancialAccountLoanTapeRetrieveParams
import com.lithic.api.models.LoanTape

class LoanTapeServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LoanTapeService {

    private val withRawResponse: LoanTapeService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LoanTapeService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions,
    ): LoanTape =
        // get /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: FinancialAccountLoanTapeListParams,
        requestOptions: RequestOptions,
    ): FinancialAccountLoanTapeListPage =
        // get /v1/financial_accounts/{financial_account_token}/loan_tapes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LoanTapeService.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<LoanTape> =
            jsonHandler<LoanTape>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: FinancialAccountLoanTapeRetrieveParams,
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

        private val listHandler: Handler<FinancialAccountLoanTapeListPage.Response> =
            jsonHandler<FinancialAccountLoanTapeListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FinancialAccountLoanTapeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountLoanTapeListPage> {
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
                    .let {
                        FinancialAccountLoanTapeListPage.of(
                            LoanTapeServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
