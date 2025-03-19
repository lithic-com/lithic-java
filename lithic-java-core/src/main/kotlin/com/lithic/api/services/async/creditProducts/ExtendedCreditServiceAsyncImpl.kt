// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async.creditProducts

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
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import com.lithic.api.models.ExtendedCredit
import java.util.concurrent.CompletableFuture

class ExtendedCreditServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExtendedCreditServiceAsync {

    private val withRawResponse: ExtendedCreditServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExtendedCreditServiceAsync.WithRawResponse = withRawResponse

    override fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<ExtendedCredit> =
        // get /v1/credit_products/{credit_product_token}/extended_credit
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtendedCreditServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ExtendedCredit> =
            jsonHandler<ExtendedCredit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<ExtendedCredit>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "credit_products",
                        params._pathParam(0),
                        "extended_credit",
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    response.parseable {
                        response
                            .use { retrieveHandler.handle(it) }
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
