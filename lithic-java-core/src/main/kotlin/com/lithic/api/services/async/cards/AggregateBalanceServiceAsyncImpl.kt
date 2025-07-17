// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.cards

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
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.CardAggregateBalanceListPageAsync
import com.lithic.api.models.CardAggregateBalanceListPageResponse
import com.lithic.api.models.CardAggregateBalanceListParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

class AggregateBalanceServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AggregateBalanceServiceAsync {

    private val withRawResponse: AggregateBalanceServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AggregateBalanceServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AggregateBalanceServiceAsync =
        AggregateBalanceServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: CardAggregateBalanceListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardAggregateBalanceListPageAsync> =
        // get /v1/cards/aggregate_balances
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AggregateBalanceServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AggregateBalanceServiceAsync.WithRawResponse =
            AggregateBalanceServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<CardAggregateBalanceListPageResponse> =
            jsonHandler<CardAggregateBalanceListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardAggregateBalanceListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardAggregateBalanceListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", "aggregate_balances")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { listHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                            .let {
                                CardAggregateBalanceListPageAsync.builder()
                                    .service(AggregateBalanceServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }
    }
}
