package com.lithic.api.services

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FundingSource
import com.lithic.api.models.FundingSourceCreateParams
import com.lithic.api.models.FundingSourceListPageAsync
import com.lithic.api.models.FundingSourceListParams
import com.lithic.api.models.FundingSourceUpdateParams
import com.lithic.api.models.FundingSourceVerifyParams
import com.lithic.api.services.*
import java.util.concurrent.CompletableFuture

class FundingSourceServiceAsync constructor(private val clientOptions: ClientOptions) {
    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<FundingSource> =
        jsonHandler<FundingSource>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Add a funding source using bank routing and account numbers or via Plaid.
     *
     * In the production environment, funding accounts will be set to `PENDING` state until
     * micro-deposit validation completes while funding accounts in sandbox will be set to `ENABLED`
     * state automatically.
     */
    @JvmOverloads
    fun create(
        params: FundingSourceCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FundingSource> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("funding_sources")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<FundingSource> =
        jsonHandler<FundingSource>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a funding source. */
    @JvmOverloads
    fun update(
        params: FundingSourceUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FundingSource> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("funding_sources", params.getPathParam(0))
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<FundingSourceListPageAsync.Response> =
        jsonHandler<FundingSourceListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all the funding sources associated with the Lithic account. */
    @JvmOverloads
    fun list(
        params: FundingSourceListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FundingSourceListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("funding_sources")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { FundingSourceListPageAsync.of(this, params, it) }
        }
    }

    private val verifyHandler: Handler<FundingSource> =
        jsonHandler<FundingSource>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Verify a bank account as a funding source by providing received micro-deposit amounts. */
    @JvmOverloads
    fun verify(
        params: FundingSourceVerifyParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<FundingSource> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("funding_sources", params.getPathParam(0), "verify")
                .putAllQueryParams(params.toQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.toHeaders())
                .body(json(clientOptions.jsonMapper, params.toBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { verifyHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
