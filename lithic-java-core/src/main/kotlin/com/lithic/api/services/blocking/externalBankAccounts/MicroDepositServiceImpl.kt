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
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ExternalBankAccountMicroDepositCreateParams
import com.lithic.api.models.MicroDepositCreateResponse

class MicroDepositServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    MicroDepositService {

    private val withRawResponse: MicroDepositService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): MicroDepositService.WithRawResponse = withRawResponse

    override fun create(
        params: ExternalBankAccountMicroDepositCreateParams,
        requestOptions: RequestOptions,
    ): MicroDepositCreateResponse =
        // post /v1/external_bank_accounts/{external_bank_account_token}/micro_deposits
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        MicroDepositService.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<MicroDepositCreateResponse> =
            jsonHandler<MicroDepositCreateResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun create(
            params: ExternalBankAccountMicroDepositCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<MicroDepositCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "v1",
                        "external_bank_accounts",
                        params._pathParam(0),
                        "micro_deposits",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
