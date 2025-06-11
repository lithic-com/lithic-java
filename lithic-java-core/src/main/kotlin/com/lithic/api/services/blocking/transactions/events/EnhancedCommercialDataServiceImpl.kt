// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.transactions.events

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.JsonValue
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.withErrorHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.EnhancedData
import com.lithic.api.models.TransactionEventEnhancedCommercialDataRetrieveParams
import kotlin.jvm.optionals.getOrNull

class EnhancedCommercialDataServiceImpl
internal constructor(private val clientOptions: ClientOptions) : EnhancedCommercialDataService {

    private val withRawResponse: EnhancedCommercialDataService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EnhancedCommercialDataService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: TransactionEventEnhancedCommercialDataRetrieveParams,
        requestOptions: RequestOptions,
    ): EnhancedData =
        // get /v1/transactions/events/{event_token}/enhanced_commercial_data
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EnhancedCommercialDataService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<EnhancedData> =
            jsonHandler<EnhancedData>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: TransactionEventEnhancedCommercialDataRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EnhancedData> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("eventToken", params.eventToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "transactions",
                        "events",
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
