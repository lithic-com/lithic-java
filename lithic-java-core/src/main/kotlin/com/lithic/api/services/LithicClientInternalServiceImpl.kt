package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ApiStatus
import com.lithic.api.models.ClientApiStatusParams
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class LithicClientInternalServiceImpl constructor(private val clientOptions: ClientOptions) :
    LithicClientInternalService {
    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val apiStatusHandler: Handler<ApiStatus> =
        jsonHandler<ApiStatus>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** API status check */
    override fun apiStatus(
        params: ClientApiStatusParams,
        requestOptions: RequestOptions
    ): ApiStatus {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("status")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { apiStatusHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
