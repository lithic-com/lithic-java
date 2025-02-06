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
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPageAsync
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams
import java.util.concurrent.CompletableFuture

class CardProgramServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CardProgramServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CardProgram> =
        jsonHandler<CardProgram>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get card program. */
    override fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardProgram> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "card_programs", params.getPathParam(0))
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

    private val listHandler: Handler<CardProgramListPageAsync.Response> =
        jsonHandler<CardProgramListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List card programs. */
    override fun list(
        params: CardProgramListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardProgramListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "card_programs")
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
                    .let { CardProgramListPageAsync.of(this, params, it) }
            }
    }
}
