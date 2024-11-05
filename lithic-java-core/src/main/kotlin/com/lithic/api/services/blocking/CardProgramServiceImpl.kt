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
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPage
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams

class CardProgramServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardProgramService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CardProgram> =
        jsonHandler<CardProgram>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get card program. */
    override fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions
    ): CardProgram {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "card_programs", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CardProgramListPage.Response> =
        jsonHandler<CardProgramListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List card programs. */
    override fun list(
        params: CardProgramListParams,
        requestOptions: RequestOptions
    ): CardProgramListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "card_programs")
                .putAllQueryParams(clientOptions.queryParams.asMap())
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers.asMap())
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
                .let { CardProgramListPage.of(this, params, it) }
        }
    }
}
