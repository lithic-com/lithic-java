// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.accounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AccountCreditConfigurationRetrieveParams
import com.lithic.api.models.AccountCreditConfigurationUpdateParams
import com.lithic.api.models.BusinessAccount
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class CreditConfigurationServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CreditConfigurationServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<BusinessAccount> =
        jsonHandler<BusinessAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an Account's credit configuration */
    override fun retrieve(
        params: AccountCreditConfigurationRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BusinessAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("accounts", params.getPathParam(0), "credit_configuration")
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

    private val updateHandler: Handler<BusinessAccount> =
        jsonHandler<BusinessAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Business Accounts credit configuration */
    override fun update(
        params: AccountCreditConfigurationUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<BusinessAccount> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("accounts", params.getPathParam(0), "credit_configuration")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
