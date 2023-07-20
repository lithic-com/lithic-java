package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.BalanceListPage
import com.lithic.api.models.BalanceListParams
import com.lithic.api.services.errorHandler
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.withErrorHandler

class BalanceServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : BalanceService {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val listHandler: Handler<BalanceListPage.Response> =
        jsonHandler<BalanceListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Get the balances for a program or a given end-user account */
    override fun list(params: BalanceListParams, requestOptions: RequestOptions): BalanceListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("balances")
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
                .let { BalanceListPage.of(this, params, it) }
        }
    }
}
