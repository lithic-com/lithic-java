// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.checkRequired
import com.lithic.api.core.handlers.errorBodyHandler
import com.lithic.api.core.handlers.errorHandler
import com.lithic.api.core.handlers.jsonHandler
import com.lithic.api.core.handlers.stringHandler
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.core.http.json
import com.lithic.api.core.http.parseable
import com.lithic.api.core.prepareAsync
import com.lithic.api.models.Card
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardGetEmbedHtmlParams
import com.lithic.api.models.CardGetEmbedUrlParams
import com.lithic.api.models.CardListPageAsync
import com.lithic.api.models.CardListPageResponse
import com.lithic.api.models.CardListParams
import com.lithic.api.models.CardProvisionParams
import com.lithic.api.models.CardProvisionResponse
import com.lithic.api.models.CardReissueParams
import com.lithic.api.models.CardRenewParams
import com.lithic.api.models.CardRetrieveParams
import com.lithic.api.models.CardRetrieveSpendLimitsParams
import com.lithic.api.models.CardSearchByPanParams
import com.lithic.api.models.CardSpendLimits
import com.lithic.api.models.CardUpdateParams
import com.lithic.api.models.CardWebProvisionParams
import com.lithic.api.models.CardWebProvisionResponse
import com.lithic.api.services.async.cards.BalanceServiceAsync
import com.lithic.api.services.async.cards.BalanceServiceAsyncImpl
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsyncImpl
import java.net.URI
import java.util.Base64
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import kotlin.jvm.optionals.getOrNull
import org.apache.hc.core5.net.URIBuilder

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val withRawResponse: CardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    private val balances: BalanceServiceAsync by lazy { BalanceServiceAsyncImpl(clientOptions) }

    private val financialTransactions: FinancialTransactionServiceAsync by lazy {
        FinancialTransactionServiceAsyncImpl(clientOptions)
    }

    override fun withRawResponse(): CardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardServiceAsync =
        CardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier::accept).build())

    override fun balances(): BalanceServiceAsync = balances

    override fun financialTransactions(): FinancialTransactionServiceAsync = financialTransactions

    override fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> =
        // post /v1/cards
        withRawResponse().create(params, requestOptions).thenApply { it.parse() }

    override fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> =
        // get /v1/cards/{card_token}
        withRawResponse().retrieve(params, requestOptions).thenApply { it.parse() }

    override fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> =
        // patch /v1/cards/{card_token}
        withRawResponse().update(params, requestOptions).thenApply { it.parse() }

    override fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardListPageAsync> =
        // get /v1/cards
        withRawResponse().list(params, requestOptions).thenApply { it.parse() }

    override fun convertPhysical(
        params: CardConvertPhysicalParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> =
        // post /v1/cards/{card_token}/convert_physical
        withRawResponse().convertPhysical(params, requestOptions).thenApply { it.parse() }

    override fun embed(
        params: CardEmbedParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> =
        // get /v1/embed/card
        withRawResponse().embed(params, requestOptions).thenApply { it.parse() }

    override fun provision(
        params: CardProvisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardProvisionResponse> =
        // post /v1/cards/{card_token}/provision
        withRawResponse().provision(params, requestOptions).thenApply { it.parse() }

    override fun reissue(
        params: CardReissueParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> =
        // post /v1/cards/{card_token}/reissue
        withRawResponse().reissue(params, requestOptions).thenApply { it.parse() }

    override fun renew(
        params: CardRenewParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> =
        // post /v1/cards/{card_token}/renew
        withRawResponse().renew(params, requestOptions).thenApply { it.parse() }

    override fun retrieveSpendLimits(
        params: CardRetrieveSpendLimitsParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardSpendLimits> =
        // get /v1/cards/{card_token}/spend_limits
        withRawResponse().retrieveSpendLimits(params, requestOptions).thenApply { it.parse() }

    override fun searchByPan(
        params: CardSearchByPanParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<Card> =
        // post /v1/cards/search_by_pan
        withRawResponse().searchByPan(params, requestOptions).thenApply { it.parse() }

    override fun webProvision(
        params: CardWebProvisionParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardWebProvisionResponse> =
        // post /v1/cards/{card_token}/web_provision
        withRawResponse().webProvision(params, requestOptions).thenApply { it.parse() }

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        private val balances: BalanceServiceAsync.WithRawResponse by lazy {
            BalanceServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        private val financialTransactions:
            FinancialTransactionServiceAsync.WithRawResponse by lazy {
            FinancialTransactionServiceAsyncImpl.WithRawResponseImpl(clientOptions)
        }

        override fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardServiceAsync.WithRawResponse =
            CardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier::accept).build()
            )

        override fun balances(): BalanceServiceAsync.WithRawResponse = balances

        override fun financialTransactions(): FinancialTransactionServiceAsync.WithRawResponse =
            financialTransactions

        private val createHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val retrieveHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
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

        private val updateHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { updateHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val listHandler: Handler<CardListPageResponse> =
            jsonHandler<CardListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards")
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
                                CardListPageAsync.builder()
                                    .service(CardServiceAsyncImpl(clientOptions))
                                    .streamHandlerExecutor(clientOptions.streamHandlerExecutor)
                                    .params(params)
                                    .response(it)
                                    .build()
                            }
                    }
                }
        }

        private val convertPhysicalHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper)

        override fun convertPhysical(
            params: CardConvertPhysicalParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "convert_physical")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { convertPhysicalHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val embedHandler: Handler<String> = stringHandler()

        override fun embed(
            params: CardEmbedParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<String>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "embed", "card")
                    .putHeader("Accept", "text/html")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response.use { embedHandler.handle(it) }
                    }
                }
        }

        private val provisionHandler: Handler<CardProvisionResponse> =
            jsonHandler<CardProvisionResponse>(clientOptions.jsonMapper)

        override fun provision(
            params: CardProvisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardProvisionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "provision")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { provisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val reissueHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override fun reissue(
            params: CardReissueParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "reissue")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { reissueHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val renewHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override fun renew(
            params: CardRenewParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "renew")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { renewHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val retrieveSpendLimitsHandler: Handler<CardSpendLimits> =
            jsonHandler<CardSpendLimits>(clientOptions.jsonMapper)

        override fun retrieveSpendLimits(
            params: CardRetrieveSpendLimitsParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardSpendLimits>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "spend_limits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { retrieveSpendLimitsHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val searchByPanHandler: Handler<Card> = jsonHandler<Card>(clientOptions.jsonMapper)

        override fun searchByPan(
            params: CardSearchByPanParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Card>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", "search_by_pan")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { searchByPanHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }

        private val webProvisionHandler: Handler<CardWebProvisionResponse> =
            jsonHandler<CardWebProvisionResponse>(clientOptions.jsonMapper)

        override fun webProvision(
            params: CardWebProvisionParams,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardWebProvisionResponse>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardToken", params.cardToken().getOrNull())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("v1", "cards", params._pathParam(0), "web_provision")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            return request
                .thenComposeAsync { clientOptions.httpClient.executeAsync(it, requestOptions) }
                .thenApply { response ->
                    errorHandler.handle(response).parseable {
                        response
                            .use { webProvisionHandler.handle(it) }
                            .also {
                                if (requestOptions.responseValidation!!) {
                                    it.validate()
                                }
                            }
                    }
                }
        }
    }

    private val errorHandler: Handler<HttpResponse> =
        errorHandler(errorBodyHandler(clientOptions.jsonMapper))
    private val embedHandler: Handler<String> = stringHandler()

    override fun getEmbedHtml(
        params: CardGetEmbedHtmlParams,
        requestOptions: RequestOptions,
    ): CompletableFuture<String> {
        val embed_request =
            Base64.getEncoder()
                .encodeToString(clientOptions.jsonMapper.writeValueAsBytes(params.getBody()))

        val mac: Mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(clientOptions.apiKey.toByteArray(), "HmacSHA256"))
        val embed_request_hmac =
            Base64.getEncoder().encodeToString(mac.doFinal(embed_request.toByteArray()))

        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("v1", "embed", "card")
                .putQueryParam("embed_request", embed_request)
                .putQueryParam("hmac", embed_request_hmac)
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .putHeader("Accept", "text/html")
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).thenApply { response
            ->
            errorHandler.handle(response).let { embedHandler.handle(it) }
        }
    }

    override fun getEmbedUrl(
        params: CardGetEmbedUrlParams,
        requestOptions: RequestOptions,
    ): String {
        val embed_request =
            Base64.getEncoder()
                .encodeToString(clientOptions.jsonMapper.writeValueAsBytes(params.getBody()))

        val mac: Mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(clientOptions.apiKey.toByteArray(), "HmacSHA256"))
        val embed_request_hmac =
            Base64.getEncoder().encodeToString(mac.doFinal(embed_request.toByteArray()))

        return URIBuilder(URI.create(clientOptions.baseUrl()))
            .appendPathSegments("embed", "card")
            .addParameter("embed_request", embed_request)
            .addParameter("hmac", embed_request_hmac)
            .toString()
    }
}
