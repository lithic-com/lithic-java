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
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepare
import com.lithic.api.models.BlockchainRecipient
import com.lithic.api.models.BlockchainRecipientCreateParams
import java.util.function.Consumer

class BlockchainRecipientServiceImpl
internal constructor(private val clientOptions: ClientOptions) : BlockchainRecipientService {

    private val withRawResponse: BlockchainRecipientService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BlockchainRecipientService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: Consumer<ClientOptions.Builder>
    ): BlockchainRecipientService =
        BlockchainRecipientServiceImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun create(
        params: BlockchainRecipientCreateParams,
        requestOptions: RequestOptions,
    ): BlockchainRecipient =
        // post /v1/blockchain_recipients
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BlockchainRecipientService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlockchainRecipientService.WithRawResponse =
            BlockchainRecipientServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        private val createHandler: Handler<BlockchainRecipient> =
            jsonHandler<BlockchainRecipient>(clientOptions.jsonMapper)

        override fun create(
            params: BlockchainRecipientCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockchainRecipient> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "blockchain_recipients")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
