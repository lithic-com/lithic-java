// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.CardBalanceListPage
import com.lithic.api.models.CardBalanceListParams

class BalanceServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : BalanceService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<CardBalanceListPage.Response> =
        jsonHandler<CardBalanceListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the balances for a given card. */
    override fun list(
        params: CardBalanceListParams,
        requestOptions: RequestOptions
    ): CardBalanceListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "cards", params.getPathParam(0), "balances")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CardBalanceListPage.of(this, params, it) }
        }
    }
}
