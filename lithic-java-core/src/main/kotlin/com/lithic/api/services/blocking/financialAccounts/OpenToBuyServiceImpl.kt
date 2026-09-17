// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking.financialAccounts

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
import com.lithic.api.models.FinancialAccountOpenToBuyRetrieveParams
import com.lithic.api.models.OpenToBuy
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class OpenToBuyServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OpenToBuyService {

    private val withRawResponse: OpenToBuyService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OpenToBuyService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): OpenToBuyService =
        OpenToBuyServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: FinancialAccountOpenToBuyRetrieveParams,
        requestOptions: RequestOptions,
    ): OpenToBuy =
        // get /v1/financial_accounts/{financial_account_token}/open_to_buy
        withRawResponse().retrieve(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OpenToBuyService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): OpenToBuyService.WithRawResponse =
            OpenToBuyServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<OpenToBuy> =
            jsonHandler<OpenToBuy>(clientOptions.jsonMapper)

        override fun retrieve(
            params: FinancialAccountOpenToBuyRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OpenToBuy> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("financialAccountToken", params.financialAccountToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "v1",
                        "financial_accounts",
                        params._pathParam(0),
                        "open_to_buy",
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
