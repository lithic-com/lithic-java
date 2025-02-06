// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.threeDS

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepareAsync
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AuthenticationRetrieveResponse
import com.lithic.api.models.AuthenticationSimulateResponse
import com.lithic.api.models.ThreeDSAuthenticationRetrieveParams
import com.lithic.api.models.ThreeDSAuthenticationSimulateParams
import java.util.concurrent.CompletableFuture

class AuthenticationServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : AuthenticationServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<AuthenticationRetrieveResponse> =
        jsonHandler<AuthenticationRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get 3DS Authentication by token */
    override fun retrieve(
        params: ThreeDSAuthenticationRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthenticationRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "three_ds_authentication", params.getPathParam(0))
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

    private val simulateHandler: Handler<AuthenticationSimulateResponse> =
        jsonHandler<AuthenticationSimulateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates a 3DS authentication request from the payment network as if it came from an ACS. If
     * you're configured for 3DS Customer Decisioning, simulating authentications requires your
     * customer decisioning endpoint to be set up properly (respond with a valid JSON).
     */
    override fun simulate(
        params: ThreeDSAuthenticationSimulateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<AuthenticationSimulateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "three_ds_authentication", "simulate")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        return request
            .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
            .thenApply { response ->
                response
                    .use { simulateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                            it.validate()
                        }
                    }
            }
    }
}
