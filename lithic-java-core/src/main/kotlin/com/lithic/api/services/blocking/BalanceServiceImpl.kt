// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.prepare
import com.lithic.api.errors.LithicError
import com.lithic.api.models.BalanceListPage
import com.lithic.api.models.BalanceListParams

class BalanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BalanceService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<BalanceListPage.Response> =
        jsonHandler<BalanceListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the balances for a program, business, or a given end-user account */
    override fun list(params: BalanceListParams, requestOptions: RequestOptions): BalanceListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "balances")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { BalanceListPage.of(this, params, it) }
    }
}
