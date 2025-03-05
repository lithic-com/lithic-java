// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.emptyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.AuthStreamEnrollmentRotateSecretParams
import com.lithic.api.models.AuthStreamSecret

class AuthStreamEnrollmentServiceImpl
internal constructor(private val clientOptions: ClientOptions) : AuthStreamEnrollmentService {

    private val withRawResponse: AuthStreamEnrollmentService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AuthStreamEnrollmentService.WithRawResponse = withRawResponse

    override fun retrieveSecret(
        params: AuthStreamEnrollmentRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): AuthStreamSecret =
        // get /v1/auth_stream/secret
        withRawResponse().retrieveSecret(params, requestOptions).parse()

    override fun rotateSecret(
        params: AuthStreamEnrollmentRotateSecretParams,
        requestOptions: RequestOptions,
    ) {
        // post /v1/auth_stream/secret/rotate
        withRawResponse().rotateSecret(params, requestOptions)
    }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AuthStreamEnrollmentService.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveSecretHandler: Handler<AuthStreamSecret> =
            jsonHandler<AuthStreamSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieveSecret(
            params: AuthStreamEnrollmentRetrieveSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AuthStreamSecret> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "auth_stream", "secret")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveSecretHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val rotateSecretHandler: Handler<Void?> =
            emptyHandler().withErrorHandler(errorHandler)

        override fun rotateSecret(
            params: AuthStreamEnrollmentRotateSecretParams,
            requestOptions: RequestOptions,
        ): HttpResponse {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("v1", "auth_stream", "secret", "rotate")
                    .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable { response.use { rotateSecretHandler.handle(it) } }
        }
    }
}
