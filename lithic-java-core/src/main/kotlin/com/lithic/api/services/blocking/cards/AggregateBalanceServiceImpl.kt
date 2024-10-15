// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.errorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.jsonHandler
import com.lithic.api.core.withErrorHandler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.CardAggregateBalanceListPage
import com.lithic.api.models.CardAggregateBalanceListParams

class AggregateBalanceServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AggregateBalanceService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CardAggregateBalanceListPage.Response> =
        jsonHandler<CardAggregateBalanceListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the aggregated card balance across all end-user accounts. */
    override fun list(
        params: CardAggregateBalanceListParams,
        requestOptions: RequestOptions
    ): CardAggregateBalanceListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "cards", "aggregate_balances")
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
                .let { CardAggregateBalanceListPage.of(this, params, it) }
        }
    }
}
