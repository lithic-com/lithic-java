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
import com.lithic.api.models.CardProgram
import com.lithic.api.models.CardProgramListPage
import com.lithic.api.models.CardProgramListPageResponse
import com.lithic.api.models.CardProgramListParams
import com.lithic.api.models.CardProgramRetrieveParams
import java.util.function.Consumer
import kotlin.jvm.optionals.getOrNull

class CardProgramServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardProgramService {

    private val withRawResponse: CardProgramService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardProgramService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardProgramService =
        CardProgramServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun retrieve(
        params: CardProgramRetrieveParams,
        requestOptions: RequestOptions,
    ): CardProgram =
        // get /v1/card_programs/{card_program_token}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CardProgramListParams,
        requestOptions: RequestOptions,
    ): CardProgramListPage =
        // get /v1/card_programs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardProgramService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardProgramService.WithRawResponse =
            CardProgramServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val retrieveHandler: Handler<CardProgram> =
            jsonHandler<CardProgram>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CardProgramRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardProgram> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardProgramToken", params.cardProgramToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "card_programs", params._pathParam(0))
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

        private val listHandler: Handler<CardProgramListPageResponse> =
            jsonHandler<CardProgramListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardProgramListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardProgramListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "card_programs")
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
                        CardProgramListPage.builder()
                            .service(CardProgramServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
