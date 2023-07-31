package com.lithic.api.services.blocking.threeDS

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.DescisioningRetrieveSecretResponse
import com.lithic.api.models.ThreeDDescisioningRetrieveSecretParams
import com.lithic.api.models.ThreeDDescisioningRotateSecretParams
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class DescisioningServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : DescisioningService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveSecretHandler: Handler<DescisioningRetrieveSecretResponse> =
        jsonHandler<DescisioningRetrieveSecretResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Retrieve the 3DS Decisioning HMAC secret key. If one does not exist for your program yet,
     * calling this endpoint will create one for you. The headers (which you can use to verify 3DS
     * Decisioning requests) will begin appearing shortly after calling this endpoint for the first
     * time. See
     * [this page](https://docs.lithic.com/docs/3ds-decisioning#3ds-decisioning-hmac-secrets) for
     * more detail about verifying 3DS Decisioning requests.
     */
    override fun retrieveSecret(
        params: ThreeDDescisioningRetrieveSecretParams,
        requestOptions: RequestOptions
    ): DescisioningRetrieveSecretResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("three_ds_decisioning", "secret")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveSecretHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val rotateSecretHandler: Handler<Void?> = emptyHandler().withErrorHandler(errorHandler)

    /**
     * Generate a new 3DS Decisioning HMAC secret key. The old secret key will be deactivated 24
     * hours after a successful request to this endpoint. Make a
     * [`GET /three_ds_decisioning/secret`](https://docs.lithic.com/reference/getthreedsdecisioningsecret)
     * request to retrieve the new secret key.
     */
    override fun rotateSecret(
        params: ThreeDDescisioningRotateSecretParams,
        requestOptions: RequestOptions
    ) {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("three_ds_decisioning", "secret", "rotate")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .apply { params.getBody().ifPresent { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response.use { rotateSecretHandler.handle(it) }
        }
    }
}
