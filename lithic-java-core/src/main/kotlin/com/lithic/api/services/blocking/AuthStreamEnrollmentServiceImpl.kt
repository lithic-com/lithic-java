package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.AuthStreamEnrollment
import com.lithic.api.models.AuthStreamEnrollmentDisenrollParams
import com.lithic.api.models.AuthStreamEnrollmentEnrollParams
import com.lithic.api.models.AuthStreamEnrollmentRetrieveParams
import com.lithic.api.models.AuthStreamEnrollmentRetrieveSecretParams
import com.lithic.api.models.AuthStreamEnrollmentRotateSecretParams
import com.lithic.api.models.AuthStreamSecret
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class AuthStreamEnrollmentServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : AuthStreamEnrollmentService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<AuthStreamEnrollment> =
        jsonHandler<AuthStreamEnrollment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Check status for whether you have enrolled in Authorization Stream Access (ASA) for your
     * program in Sandbox.
     */
    override fun retrieve(
        params: AuthStreamEnrollmentRetrieveParams,
        requestOptions: RequestOptions
    ): AuthStreamEnrollment {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("auth_stream")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val disenrollHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /** Disenroll Authorization Stream Access (ASA) in Sandbox. */
    override fun disenroll(
        params: AuthStreamEnrollmentDisenrollParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.DELETE)
                .addPathSegments("auth_stream")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { disenrollHandler.handle(it) }
        }
    }

    private val enrollHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Authorization Stream Access (ASA) provides the ability to make custom transaction approval
     * decisions through an HTTP interface to the ISO 8583 message stream.
     *
     * ASA requests are delivered as an HTTP POST during authorization. The ASA request body adheres
     * to the Lithic transaction schema, with some additional fields added for use in decisioning. A
     * response should be sent with HTTP response code 200 and the approval decision in the response
     * body. This response is converted by Lithic back into ISO 8583 format and forwarded to the
     * network.
     *
     * In Sandbox, users can self-enroll and disenroll in ASA. In production, onboarding requires
     * manual approval and setup.
     */
    override fun enroll(params: AuthStreamEnrollmentEnrollParams, requestOptions: RequestOptions) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("auth_stream")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { enrollHandler.handle(it) }
        }
    }

    private val retrieveSecretHandler: Handler<AuthStreamSecret> =
        jsonHandler<AuthStreamSecret>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Retrieve the ASA HMAC secret key. If one does not exist your program yet, calling this
     * endpoint will create one for you. The headers (which you can use to verify webhooks) will
     * begin appearing shortly after calling this endpoint for the first time. See
     * [this page](https://docs.lithic.com/docs/auth-stream-access-asa#asa-webhook-verification) for
     * more detail about verifying ASA webhooks.
     */
    override fun retrieveSecret(
        params: AuthStreamEnrollmentRetrieveSecretParams,
        requestOptions: RequestOptions
    ): AuthStreamSecret {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("auth_stream", "secret")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { retrieveSecretHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
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
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("auth_stream", "secret", "rotate")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request).let { response ->
            response.let { rotateSecretHandler.handle(it) }
        }
    }
}
