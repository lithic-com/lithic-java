// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions.events

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.EnhancedData
import com.lithic.api.models.TransactionEventEnhancedCommercialDataRetrieveParams

class EnhancedCommercialDataServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EnhancedCommercialDataService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<EnhancedData> =
        jsonHandler<EnhancedData>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Get L2/L3 enhanced commercial data associated with a transaction event. Not available in
     * sandbox.
     */
    override fun retrieve(
        params: TransactionEventEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions
    ): EnhancedData {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "transactions",
                    "events",
                    params.getPathParam(0),
                    "enhanced_commercial_data"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
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
}
