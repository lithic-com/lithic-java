// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

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
import com.lithic.api.core.prepare
import com.lithic.api.models.AccountActivityListPage
import com.lithic.api.models.AccountActivityListPageResponse
import com.lithic.api.models.AccountActivityListParams
import com.lithic.api.models.AccountActivityRetrieveTransactionParams
import com.lithic.api.models.AccountActivityRetrieveTransactionResponse
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class AccountActivityServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountActivityService {

    private val withRawResponse: AccountActivityService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountActivityService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): AccountActivityService =
        AccountActivityServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun list(
        params: AccountActivityListParams,
        requestOptions: RequestOptions,
    ): AccountActivityListPage =
        // get /v1/account_activity
        withRawResponse().list(params, requestOptions).parse()

    override fun retrieveTransaction(
        params: AccountActivityRetrieveTransactionParams,
        requestOptions: RequestOptions,
    ): AccountActivityRetrieveTransactionResponse =
        // get /v1/account_activity/{transaction_token}
        withRawResponse().retrieveTransaction(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountActivityService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): AccountActivityService.WithRawResponse =
            AccountActivityServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val listHandler: Handler<AccountActivityListPageResponse> =
            jsonHandler<AccountActivityListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: AccountActivityListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountActivityListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "account_activity")
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
                        AccountActivityListPage.builder()
                            .service(AccountActivityServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val retrieveTransactionHandler:
            Handler<AccountActivityRetrieveTransactionResponse> =
            jsonHandler<AccountActivityRetrieveTransactionResponse>(clientOptions.jsonMapper)

        override fun retrieveTransaction(
            params: AccountActivityRetrieveTransactionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountActivityRetrieveTransactionResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("transactionToken", params.transactionToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "account_activity", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
