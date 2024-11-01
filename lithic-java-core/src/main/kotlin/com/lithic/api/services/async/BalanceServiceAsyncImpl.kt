// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.errorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.jsonHandler
import com.lithic.api.core.withErrorHandler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.BalanceListPageAsync
import com.lithic.api.models.BalanceListParams
import java.util.concurrent.CompletableFuture

class BalanceServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BalanceServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<BalanceListPageAsync.Response> =
        jsonHandler<BalanceListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the balances for a program or a given end-user account */
    override fun list(
        params: BalanceListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BalanceListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "balances")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { BalanceListPageAsync.of(this, params, it) }
        }
    }
}
