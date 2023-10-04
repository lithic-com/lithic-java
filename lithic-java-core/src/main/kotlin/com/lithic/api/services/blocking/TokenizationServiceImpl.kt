// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.TokenizationSimulateParams
import com.lithic.api.models.TokenizationSimulateResponse
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class TokenizationServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : TokenizationService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val simulateHandler: Handler<TokenizationSimulateResponse> =
        jsonHandler<TokenizationSimulateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint is used to simulate a card's tokenization in the Digital Wallet and merchant
     * tokenization ecosystem.
     */
    override fun simulate(
        params: TokenizationSimulateParams,
        requestOptions: RequestOptions
    ): TokenizationSimulateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulate", "tokenizations")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { simulateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
