// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.CreditProductPrimeRateCreateParams
import com.lithic.api.models.CreditProductPrimeRateRetrieveParams
import com.lithic.api.models.PrimeRateRetrieveResponse

class PrimeRateServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PrimeRateService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Post Credit Product Prime Rate */
    override fun create(
        params: CreditProductPrimeRateCreateParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "credit_products", params.getPathParam(0), "prime_rates")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { createHandler.handle(it) }
    }

    private val retrieveHandler: Handler<PrimeRateRetrieveResponse> =
        jsonHandler<PrimeRateRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get Credit Product Prime Rates */
    override fun retrieve(
        params: CreditProductPrimeRateRetrieveParams,
        requestOptions: RequestOptions,
    ): PrimeRateRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "credit_products", params.getPathParam(0), "prime_rates")
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
}
