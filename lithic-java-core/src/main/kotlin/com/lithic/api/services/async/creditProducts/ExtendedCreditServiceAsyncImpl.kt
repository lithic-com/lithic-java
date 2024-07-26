// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditProducts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import com.lithic.api.models.ExtendedCredit
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ExtendedCreditServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExtendedCreditServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<ExtendedCredit> =
        jsonHandler<ExtendedCredit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get the extended credit for a given credit product under a program */
    override fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExtendedCredit> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("credit_products", params.getPathParam(0), "extended_credit")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
