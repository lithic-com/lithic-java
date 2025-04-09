// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.cards

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
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.CardAggregateBalanceListPage
import com.lithic.api.models.CardAggregateBalanceListPageResponse
import com.lithic.api.models.CardAggregateBalanceListParams

class AggregateBalanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AggregateBalanceService {

    private val withRawResponse: AggregateBalanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AggregateBalanceService.WithRawResponse = withRawResponse

    override fun list(
        params: CardAggregateBalanceListParams,
        requestOptions: RequestOptions,
    ): CardAggregateBalanceListPage =
        // get /v1/cards/aggregate_balances
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AggregateBalanceService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val listHandler: Handler<CardAggregateBalanceListPageResponse> =
            jsonHandler<CardAggregateBalanceListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: CardAggregateBalanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardAggregateBalanceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("v1", "cards", "aggregate_balances")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CardAggregateBalanceListPage.builder()
                            .service(AggregateBalanceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
