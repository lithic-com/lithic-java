// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.financialAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FinancialAccountLoanTapeListPageAsync
import com.lithic.api.models.FinancialAccountLoanTapeListParams
import com.lithic.api.models.FinancialAccountLoanTapeRetrieveParams
import com.lithic.api.models.LoanTape
import java.util.concurrent.CompletableFuture

class LoanTapeServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : LoanTapeServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<LoanTape> =
        jsonHandler<LoanTape>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get a specific loan tape for a given financial account. */
    override fun retrieve(
        params: FinancialAccountLoanTapeRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<LoanTape> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "financial_accounts",
                    params.getPathParam(0),
                    "loan_tapes",
                    params.getPathParam(1)
                )
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }

    private val listHandler: Handler<FinancialAccountLoanTapeListPageAsync.Response> =
        jsonHandler<FinancialAccountLoanTapeListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List the loan tapes for a given financial account. */
    override fun list(
        params: FinancialAccountLoanTapeListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<FinancialAccountLoanTapeListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "financial_accounts", params.getPathParam(0), "loan_tapes")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
                    .let { FinancialAccountLoanTapeListPageAsync.of(this, params, it) }
            }
    }
}
