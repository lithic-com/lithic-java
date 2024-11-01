// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.errorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.json
import com.lithic.api.core.jsonHandler
import com.lithic.api.core.withErrorHandler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountCreateResponse
import com.lithic.api.models.ExternalBankAccountListPage
import com.lithic.api.models.ExternalBankAccountListParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsParams
import com.lithic.api.models.ExternalBankAccountRetryMicroDepositsResponse
import com.lithic.api.models.ExternalBankAccountRetryPrenoteParams
import com.lithic.api.models.ExternalBankAccountRetryPrenoteResponse
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.ExternalBankAccountUpdateResponse
import com.lithic.api.services.blocking.externalBankAccounts.MicroDepositService
import com.lithic.api.services.blocking.externalBankAccounts.MicroDepositServiceImpl

class ExternalBankAccountServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExternalBankAccountService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val microDeposits: MicroDepositService by lazy {
        MicroDepositServiceImpl(clientOptions)
    }

    override fun microDeposits(): MicroDepositService = microDeposits

    private val createHandler: Handler<ExternalBankAccountCreateResponse> =
        jsonHandler<ExternalBankAccountCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Creates an external bank account within a program or Lithic account. */
    override fun create(
        params: ExternalBankAccountCreateParams,
        requestOptions: RequestOptions
    ): ExternalBankAccountCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("v1", "external_bank_accounts")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<ExternalBankAccountRetrieveResponse> =
        jsonHandler<ExternalBankAccountRetrieveResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the external bank account by token. */
    override fun retrieve(
        params: ExternalBankAccountRetrieveParams,
        requestOptions: RequestOptions
    ): ExternalBankAccountRetrieveResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "external_bank_accounts", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
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

    private val updateHandler: Handler<ExternalBankAccountUpdateResponse> =
        jsonHandler<ExternalBankAccountUpdateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Update the external bank account by token. */
    override fun update(
        params: ExternalBankAccountUpdateParams,
        requestOptions: RequestOptions
    ): ExternalBankAccountUpdateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("v1", "external_bank_accounts", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
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

    private val listHandler: Handler<ExternalBankAccountListPage.Response> =
        jsonHandler<ExternalBankAccountListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all the external bank accounts for the provided search criteria. */
    override fun list(
        params: ExternalBankAccountListParams,
        requestOptions: RequestOptions
    ): ExternalBankAccountListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "external_bank_accounts")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ExternalBankAccountListPage.of(this, params, it) }
        }
    }

    private val retryMicroDepositsHandler: Handler<ExternalBankAccountRetryMicroDepositsResponse> =
        jsonHandler<ExternalBankAccountRetryMicroDepositsResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retry external bank account micro deposit verification. */
    override fun retryMicroDeposits(
        params: ExternalBankAccountRetryMicroDepositsParams,
        requestOptions: RequestOptions
    ): ExternalBankAccountRetryMicroDepositsResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "external_bank_accounts",
                    params.getPathParam(0),
                    "retry_micro_deposits"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retryMicroDepositsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retryPrenoteHandler: Handler<ExternalBankAccountRetryPrenoteResponse> =
        jsonHandler<ExternalBankAccountRetryPrenoteResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retry external bank account prenote verification. */
    override fun retryPrenote(
        params: ExternalBankAccountRetryPrenoteParams,
        requestOptions: RequestOptions
    ): ExternalBankAccountRetryPrenoteResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "v1",
                    "external_bank_accounts",
                    params.getPathParam(0),
                    "retry_prenote"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retryPrenoteHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
