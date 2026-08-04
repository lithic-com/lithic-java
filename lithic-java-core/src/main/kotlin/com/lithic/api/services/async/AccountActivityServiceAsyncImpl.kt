// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
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
import com.lithic.api.models.AccountActivityListPageAsync
import com.lithic.api.models.AccountActivityListPageResponse
import com.lithic.api.models.AccountActivityListParams
import com.lithic.api.models.AccountActivityRetrieveTransactionParams
import com.lithic.api.models.AccountActivityRetrieveTransactionResponse
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccountActivityServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AccountActivityServiceAsync {

    private val withRawResponse: AccountActivityServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountActivityServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): AccountActivityServiceAsync =
        AccountActivityServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AccountActivityListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountActivityListPageAsync> =
        // get /v1/account_activity
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun retrieveTransaction(
        params: AccountActivityRetrieveTransactionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<AccountActivityRetrieveTransactionResponse> =
        // get /v1/account_activity/{transaction_token}
        withRawResponse().retrieveTransaction(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountActivityServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountActivityServiceAsync.WithRawResponse =
            AccountActivityServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AccountActivityListPageResponse> =
            jsonHandler<AccountActivityListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccountActivityListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountActivityListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "account_activity")
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
                                AccountActivityListPageAsync.builder()
                                    .service(AccountActivityServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val retrieveTransactionHandler:
            Handler<AccountActivityRetrieveTransactionResponse> =
            jsonHandler<AccountActivityRetrieveTransactionResponse>(clientOptions.jsonMapper)

        override fun retrieveTransaction(
            params: AccountActivityRetrieveTransactionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<AccountActivityRetrieveTransactionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionToken", params.transactionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "account_activity", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveTransactionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }
}
