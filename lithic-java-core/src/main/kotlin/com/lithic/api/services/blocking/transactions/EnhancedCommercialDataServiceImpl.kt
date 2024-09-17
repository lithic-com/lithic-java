// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.EnhancedCommercialDataRetrieveResponse
import com.lithic.api.models.TransactionEnhancedCommercialDataRetrieveParams
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class EnhancedCommercialDataServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : EnhancedCommercialDataService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<EnhancedCommercialDataRetrieveResponse> =
        jsonHandler<EnhancedCommercialDataRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Get all L2/L3 enhanced commercial data associated with a transaction. Not available in
     * sandbox.
     */
    override fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions
    ): EnhancedCommercialDataRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "transactions",
                    params.getPathParam(0),
                    "enhanced_commercial_data"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
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
