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
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.DigitalCardArt
import com.lithic.api.models.DigitalCardArtListPage
import com.lithic.api.models.DigitalCardArtListParams
import com.lithic.api.models.DigitalCardArtRetrieveParams

class DigitalCardArtServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    DigitalCardArtService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DigitalCardArt> =
        jsonHandler<DigitalCardArt>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get digital card art by token. */
    override fun retrieve(
        params: DigitalCardArtRetrieveParams,
        requestOptions: RequestOptions,
    ): DigitalCardArt {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "digital_card_art", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<DigitalCardArtListPage.Response> =
        jsonHandler<DigitalCardArtListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List digital card art. */
    override fun list(
        params: DigitalCardArtListParams,
        requestOptions: RequestOptions,
    ): DigitalCardArtListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "digital_card_art")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { DigitalCardArtListPage.of(this, params, it) }
    }
}
