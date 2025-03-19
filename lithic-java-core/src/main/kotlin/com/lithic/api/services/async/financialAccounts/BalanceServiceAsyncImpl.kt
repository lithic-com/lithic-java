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
import com.lithic.api.models.FinancialAccountBalanceListPageAsync
import com.lithic.api.models.FinancialAccountBalanceListParams
import java.util.concurrent.CompletableFuture

class BalanceServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceServiceAsync {

    private val withRawResponse: BalanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BalanceServiceAsync.WithRawResponse = withRawResponse

    override fun list(
        params: FinancialAccountBalanceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<FinancialAccountBalanceListPageAsync> =
        // get /v1/financial_accounts/{financial_account_token}/balances
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BalanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<FinancialAccountBalanceListPageAsync.Response> =
            jsonHandler<FinancialAccountBalanceListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: FinancialAccountBalanceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<FinancialAccountBalanceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "financial_accounts", params._pathParam(0), "balances")
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
                                FinancialAccountBalanceListPageAsync.of(
                                    BalanceServiceAsyncImpl(clientOptions),
                                    params,
                                    it,
                                )
                            }
                    }
                }
        }
    }
}
