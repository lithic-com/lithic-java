// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

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
import com.lithic.api.models.AggregateBalanceListPageAsync
import com.lithic.api.models.AggregateBalanceListParams
import java.util.concurrent.CompletableFuture

class AggregateBalanceServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AggregateBalanceServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AggregateBalanceListPageAsync.Response> =
        jsonHandler<AggregateBalanceListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the aggregated balance across all end-user accounts by financial account type */
    override fun list(
        params: AggregateBalanceListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AggregateBalanceListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "aggregate_balances")
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { listHandler.handle(it) }
                    .apply {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            validate()
                        }
                    }
                    .let { AggregateBalanceListPageAsync.of(this, params, it) }
            }
    }
}
