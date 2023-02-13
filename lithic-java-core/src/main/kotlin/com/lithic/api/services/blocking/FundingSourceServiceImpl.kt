package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.FundingSource
import com.lithic.api.models.FundingSourceCreateParams
import com.lithic.api.models.FundingSourceListPage
import com.lithic.api.models.FundingSourceListParams
import com.lithic.api.models.FundingSourceUpdateParams
import com.lithic.api.models.FundingSourceVerifyParams
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class FundingSourceServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : FundingSourceService {

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
    override fun create(
        params: FundingSourceCreateParams,
        requestOptions: RequestOptions
    ): FundingSource {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("funding_sources")
                .putAllQueryParams(params.getQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
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
    override fun update(
        params: FundingSourceUpdateParams,
        requestOptions: RequestOptions
    ): FundingSource {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("funding_sources", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<FundingSourceListPage.Response> =
        jsonHandler<FundingSourceListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List all the funding sources associated with the Lithic account. */
    override fun list(
        params: FundingSourceListParams,
        requestOptions: RequestOptions
    ): FundingSourceListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("funding_sources")
                .putAllQueryParams(params.getQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { FundingSourceListPage.of(this, params, it) }
        }
    }

    private val verifyHandler: Handler<FundingSource> =
        jsonHandler<FundingSource>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Verify a bank account as a funding source by providing received micro-deposit amounts. */
    override fun verify(
        params: FundingSourceVerifyParams,
        requestOptions: RequestOptions
    ): FundingSource {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("funding_sources", params.getPathParam(0), "verify")
                .putAllQueryParams(params.getQueryParams())
                .putHeader("Authorization", clientOptions.apiKey)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request).let { response ->
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
