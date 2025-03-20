// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

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
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.FinancialAccountLoanTapeListPageAsync
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import com.lithic.api.models.FinancialAccountLoanTapeRetrieveParams
import com.lithic.api.models.LoanTape
import java.util.concurrent.CompletableFuture

class LoanTapeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LoanTapeServiceAsync {

    private val withRawResponse: LoanTapeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LoanTapeServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<LoanTape> =
        // get /v1/financial_accounts/{financial_account_token}/loan_tapes/{loan_tape_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: FinancialAccountLoanTapeListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountLoanTapeListPageAsync> =
        // get /v1/financial_accounts/{financial_account_token}/loan_tapes
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LoanTapeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<LoanTape> =
            jsonHandler<LoanTape>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: FinancialAccountLoanTapeRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<LoanTape>> {
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
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<FinancialAccountLoanTapeListPageAsync.Response> =
            jsonHandler<FinancialAccountLoanTapeListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FinancialAccountLoanTapeListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountLoanTapeListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "loan_tapes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                FinancialAccountLoanTapeListPageAsync.of(
                                    LoanTapeServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
