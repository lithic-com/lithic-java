// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.handlers.errorBodyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.AggregateBalanceListPage
import com.lithic.api.models.AggregateBalanceListPageResponse
import com.lithic.api.models.AggregateBalanceListParams
import java.util.function.Consumer

class AggregateBalanceServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AggregateBalanceService {

    private val withRawResponse: AggregateBalanceService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AggregateBalanceService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AggregateBalanceService =
        AggregateBalanceServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AggregateBalanceListParams,
        requestOptions: RequestOptions,
    ): AggregateBalanceListPage =
        // get /v1/aggregate_balances
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AggregateBalanceService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AggregateBalanceService.WithRawResponse =
            AggregateBalanceServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AggregateBalanceListPageResponse> =
            jsonHandler<AggregateBalanceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AggregateBalanceListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AggregateBalanceListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "aggregate_balances")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        AggregateBalanceListPage.builder()
                            .service(AggregateBalanceServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
