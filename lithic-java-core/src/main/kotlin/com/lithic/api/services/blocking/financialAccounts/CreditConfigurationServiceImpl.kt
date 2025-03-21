// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

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
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountCreditConfigurationRetrieveParams
import com.lithic.api.models.FinancialAccountCreditConfigurationUpdateParams

class CreditConfigurationServiceImpl
internal constructor(private val clientOptions: ClientOptions) : CreditConfigurationService {

    private val withRawResponse: CreditConfigurationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CreditConfigurationService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: FinancialAccountCreditConfigurationRetrieveParams,
        requestOptions: RequestOptions,
    ): FinancialAccountCreditConfig =
        // get /v1/financial_accounts/{financial_account_token}/credit_configuration
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(
        params: FinancialAccountCreditConfigurationUpdateParams,
        requestOptions: RequestOptions,
    ): FinancialAccountCreditConfig =
        // patch /v1/financial_accounts/{financial_account_token}/credit_configuration
        withRawResponse().update(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CreditConfigurationService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<FinancialAccountCreditConfig> =
            jsonHandler<FinancialAccountCreditConfig>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: FinancialAccountCreditConfigurationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountCreditConfig> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "credit_configuration",
                    )
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

        private val updateHandler: Handler<FinancialAccountCreditConfig> =
            jsonHandler<FinancialAccountCreditConfig>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun update(
            params: FinancialAccountCreditConfigurationUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FinancialAccountCreditConfig> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "credit_configuration",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
