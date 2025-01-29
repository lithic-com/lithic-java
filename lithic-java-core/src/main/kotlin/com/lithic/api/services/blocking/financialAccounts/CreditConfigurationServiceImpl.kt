// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

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
import com.lithic.api.models.FinancialAccountCreditConfig
import com.lithic.api.models.FinancialAccountCreditConfigurationRetrieveParams
import com.lithic.api.models.FinancialAccountCreditConfigurationUpdateParams

class CreditConfigurationServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CreditConfigurationService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<FinancialAccountCreditConfig> =
        jsonHandler<FinancialAccountCreditConfig>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get an Account's credit configuration */
    override fun retrieve(
        params: FinancialAccountCreditConfigurationRetrieveParams,
        requestOptions: RequestOptions
    ): FinancialAccountCreditConfig {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments(
                    "v1",
                    "financial_accounts",
                    params.getPathParam(0),
                    "credit_configuration"
                )
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<FinancialAccountCreditConfig> =
        jsonHandler<FinancialAccountCreditConfig>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update an account's credit configuration */
    override fun update(
        params: FinancialAccountCreditConfigurationUpdateParams,
        requestOptions: RequestOptions
    ): FinancialAccountCreditConfig {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments(
                    "v1",
                    "financial_accounts",
                    params.getPathParam(0),
                    "credit_configuration"
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
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
