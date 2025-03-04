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
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.AuthStreamEnrollmentRotateSecretParams
import com.lithic.api.models.AuthStreamSecret

class AuthStreamEnrollmentServiceImpl
internal constructor(private val clientOptions: ClientOptions) : AuthStreamEnrollmentService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveSecretHandler: Handler<AuthStreamSecret> =
        jsonHandler<AuthStreamSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve the ASA HMAC secret key. If one does not exist for your program yet, calling this
     * endpoint will create one for you. The headers (which you can use to verify webhooks) will
     * begin appearing shortly after calling this endpoint for the first time. See
     * [this page](https://docs.lithic.com/docs/auth-stream-access-asa#asa-webhook-verification) for
     * more detail about verifying ASA webhooks.
     */
    override fun retrieveSecret(
        params: AuthStreamEnrollmentRetrieveSecretParams,
        requestOptions: RequestOptions,
    ): AuthStreamSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "auth_stream", "secret")
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveSecretHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation!!) {
                    it.validate()
                }
            }
    }

    private val rotateSecretHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Generate a new ASA HMAC secret key. The old ASA HMAC secret key will be deactivated 24 hours
     * after a successful request to this endpoint. Make a
     * [`GET /auth_stream/secret`](https://docs.lithic.com/reference/getauthstreamsecret) request to
     * retrieve the new secret key.
     */
    override fun rotateSecret(
        params: AuthStreamEnrollmentRotateSecretParams,
        requestOptions: RequestOptions,
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "auth_stream", "secret", "rotate")
                .apply { params._body().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepare(clientOptions, params)
        val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
        val response = clientOptions.httpClient.execute(request, requestOptions)
        response.use { rotateSecretHandler.handle(it) }
    }
}
