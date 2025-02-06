// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.externalBankAccounts

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse

class MicroDepositServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : MicroDepositService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<MicroDepositCreateResponse> =
        jsonHandler<MicroDepositCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Verify the external bank account by providing the micro deposit amounts. */
    override fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions
    ): MicroDepositCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "external_bank_accounts",
                    params.getPathParam(0),
                    "micro_deposits"
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
