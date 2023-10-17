// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.CardProductCreditDetailParams
import com.lithic.api.models.CardProductCreditDetailResponse
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CardProductServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardProductServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val creditDetailHandler: Handler<CardProductCreditDetailResponse> =
        jsonHandler<CardProductCreditDetailResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the Credit Detail for the card product */
    override fun creditDetail(
        params: CardProductCreditDetailParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardProductCreditDetailResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_product", "credit_detail")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { creditDetailHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
