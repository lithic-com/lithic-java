// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.creditProducts

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
import com.lithic.api.models.CreditProductExtendedCreditRetrieveParams
import com.lithic.api.models.ExtendedCredit
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class ExtendedCreditServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExtendedCreditService {

    private val withRawResponse: ExtendedCreditService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExtendedCreditService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): ExtendedCreditService =
        ExtendedCreditServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CreditProductExtendedCreditRetrieveParams,
        requestOptions: RequestOptions,
    ): ExtendedCredit =
        // get /v1/credit_products/{credit_product_token}/extended_credit
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExtendedCreditService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): ExtendedCreditService.WithRawResponse =
            ExtendedCreditServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<ExtendedCredit> =
            jsonHandler<ExtendedCredit>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CreditProductExtendedCreditRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExtendedCredit> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("creditProductToken", params.creditProductToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "credit_products",
                        params._pathParam(0),
                        "extended_credit",
                    )
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
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
