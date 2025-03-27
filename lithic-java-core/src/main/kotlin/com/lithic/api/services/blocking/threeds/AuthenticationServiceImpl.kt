// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.threeds

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.threeds.authentication.AuthenticationRetrieveParams
import com.lithic.api.models.threeds.authentication.AuthenticationRetrieveResponse
import com.lithic.api.models.threeds.authentication.AuthenticationSimulateParams
import com.lithic.api.models.threeds.authentication.AuthenticationSimulateResponse

class AuthenticationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AuthenticationService {

    private val withRawResponse: AuthenticationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthenticationService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: AuthenticationRetrieveParams,
        requestOptions: RequestOptions,
    ): AuthenticationRetrieveResponse =
        // get /v1/three_ds_authentication/{three_ds_authentication_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun simulate(
        params: AuthenticationSimulateParams,
        requestOptions: RequestOptions,
    ): AuthenticationSimulateResponse =
        // post /v1/three_ds_authentication/simulate
        withRawResponse().simulate(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthenticationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<AuthenticationRetrieveResponse> =
            jsonHandler<AuthenticationRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: AuthenticationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "three_ds_authentication", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val simulateHandler: Handler<AuthenticationSimulateResponse> =
            jsonHandler<AuthenticationSimulateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun simulate(
            params: AuthenticationSimulateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthenticationSimulateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "three_ds_authentication", "simulate")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { simulateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
