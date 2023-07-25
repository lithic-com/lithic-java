package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.ExternalBankAccountCreateParams
import com.lithic.api.models.ExternalBankAccountCreateResponse
import com.lithic.api.models.ExternalBankAccountListPageAsync
import com.lithic.api.models.ExternalBankAccountListParams
import com.lithic.api.models.ExternalBankAccountRetrieveParams
import com.lithic.api.models.ExternalBankAccountRetrieveResponse
import com.lithic.api.models.ExternalBankAccountUpdateParams
import com.lithic.api.models.ExternalBankAccountUpdateResponse
import com.lithic.api.services.async.externalBankAccounts.MicroDepositServiceAsync
import com.lithic.api.services.async.externalBankAccounts.MicroDepositServiceAsyncImpl
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler
import java.util.concurrent.CompletableFuture

class ExternalBankAccountServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : ExternalBankAccountServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val microDeposits: MicroDepositServiceAsync by lazy {
        MicroDepositServiceAsyncImpl(clientOptions)
    }

    override fun microDeposits(): MicroDepositServiceAsync = microDeposits

    private val createHandler: Handler<ExternalBankAccountCreateResponse> =
        jsonHandler<ExternalBankAccountCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Creates an external bank account within a program or Lithic account. */
    override fun create(
        params: ExternalBankAccountCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalBankAccountCreateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("external_bank_accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<ExternalBankAccountRetrieveResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("external_bank_accounts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
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
    ): CompletableFuture<ExternalBankAccountUpdateResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("external_bank_accounts", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<ExternalBankAccountListPageAsync.Response> =
        jsonHandler<ExternalBankAccountListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all the external bank accounts for the provided search criteria. */
    override fun list(
        params: ExternalBankAccountListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<ExternalBankAccountListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("external_bank_accounts")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { ExternalBankAccountListPageAsync.of(this, params, it) }
        }
    }
}
