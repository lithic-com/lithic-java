// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AggregateBalanceListPage
import com.lithic.api.models.AggregateBalanceListParams

class AggregateBalanceServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AggregateBalanceService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<AggregateBalanceListPage.Response> =
        jsonHandler<AggregateBalanceListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the aggregated balance across all end-user accounts by financial account type */
    override fun list(
        params: AggregateBalanceListParams,
        requestOptions: RequestOptions
    ): AggregateBalanceListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "aggregate_balances")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { AggregateBalanceListPage.of(this, params, it) }
        }
    }
}
