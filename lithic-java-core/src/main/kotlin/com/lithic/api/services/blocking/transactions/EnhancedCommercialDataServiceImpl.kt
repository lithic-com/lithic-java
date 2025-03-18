// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions

import com.lithic.api.core.ClientOptions
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
import com.lithic.api.errors.LithicError
import com.lithic.api.models.EnhancedCommercialDataRetrieveResponse
import com.lithic.api.models.TransactionEnhancedCommercialDataRetrieveParams

class EnhancedCommercialDataServiceImpl
internal constructor(private val clientOptions: ClientOptions) : EnhancedCommercialDataService {

    private val withRawResponse: EnhancedCommercialDataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnhancedCommercialDataService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: TransactionEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions,
    ): EnhancedCommercialDataRetrieveResponse =
        // get /v1/transactions/{transaction_token}/enhanced_commercial_data
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnhancedCommercialDataService.WithRawResponse {

        private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<EnhancedCommercialDataRetrieveResponse> =
            jsonHandler<EnhancedCommercialDataRetrieveResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun retrieve(
            params: TransactionEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnhancedCommercialDataRetrieveResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "v1",
                        "transactions",
                        params._pathParam(0),
                        "enhanced_commercial_data",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
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
