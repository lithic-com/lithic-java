package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.errors.LithicError
import com.lithic.api.models.Card
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardGetEmbedHtmlParams
import com.lithic.api.models.CardGetEmbedUrlParams
import com.lithic.api.models.CardListPageAsync
import com.lithic.api.models.CardListParams
import com.lithic.api.models.CardProvisionParams
import com.lithic.api.models.CardProvisionResponse
import com.lithic.api.models.CardReissueParams
import com.lithic.api.models.CardRetrieveParams
import com.lithic.api.models.CardUpdateParams
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler
import java.net.URI
import java.util.Base64
import java.util.concurrent.CompletableFuture
import javax.crypto.Mac
import javax.crypto.spec.SecretKeySpec
import org.apache.hc.core5.net.URIBuilder

class CardServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardServiceAsync {

    private val errorHandler: Handler<LithicError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Create a new virtual or physical card. Parameters `pin`, `shipping_address`, and `product_id`
     * only apply to physical cards.
     */
    override fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Card> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("cards")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get card configuration such as spend limit and state. */
    override fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Card> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cards", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val updateHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Update the specified properties of the card. Unsupplied properties will remain unchanged.
     * `pin` parameter only applies to physical cards.
     *
     * _Note: setting a card to a `CLOSED` state is a final action that cannot be undone._
     */
    override fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Card> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("cards", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CardListPageAsync.Response> =
        jsonHandler<CardListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List cards. */
    override fun list(
        params: CardListParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardListPageAsync> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cards")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CardListPageAsync.of(this, params, it) }
        }
    }

    private val embedHandler: Handler<String> = stringHandler().withErrorHandler(errorHandler)

    /**
     * Handling full card PANs and CVV codes requires that you comply with the Payment Card Industry
     * Data Security Standards (PCI DSS). Some clients choose to reduce their compliance obligations
     * by leveraging our embedded card UI solution documented below.
     *
     * In this setup, PANs and CVV codes are presented to the end-user via a card UI that we
     * provide, optionally styled in the customer's branding using a specified css stylesheet. A
     * user's browser makes the request directly to api.lithic.com, so card PANs and CVVs never
     * touch the API customer's servers while full card data is displayed to their end-users. The
     * response contains an HTML document. This means that the url for the request can be inserted
     * straight into the `src` attribute of an iframe.
     *
     * ```html
     * <iframe
     *   id="card-iframe"
     *   src="https://sandbox.lithic.com/v1/embed/card?embed_request=eyJjc3MiO...;hmac=r8tx1..."
     *   allow="clipboard-write"
     *   class="content"
     * ></iframe>
     * ```
     *
     * You should compute the request payload on the server side. You can render it (or the whole
     * iframe) on the server or make an ajax call from your front end code, but **do not ever embed
     * your API key into front end code, as doing so introduces a serious security vulnerability**.
     */
    override fun embed(
        params: CardEmbedParams,
        requestOptions: RequestOptions
    ): CompletableFuture<String> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("embed", "card")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response.let { embedHandler.handle(it) }
        }
    }

    private val provisionHandler: Handler<CardProvisionResponse> =
        jsonHandler<CardProvisionResponse>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Allow your cardholders to directly add payment cards to the device's digital wallet (e.g.
     * Apple Pay) with one touch from your app.
     *
     * This requires some additional setup and configuration. Please
     * [Contact Us](https://lithic.com/contact) or your Customer Success representative for more
     * information.
     */
    override fun provision(
        params: CardProvisionParams,
        requestOptions: RequestOptions
    ): CompletableFuture<CardProvisionResponse> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("cards", params.getPathParam(0), "provision")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { provisionHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val reissueHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Initiate print and shipment of a duplicate physical card.
     *
     * Only applies to cards of type `PHYSICAL` [beta].
     */
    override fun reissue(
        params: CardReissueParams,
        requestOptions: RequestOptions
    ): CompletableFuture<Card> {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("cards", params.getPathParam(0), "reissue")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response
                .let { reissueHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    override fun getEmbedHtml(
        params: CardGetEmbedHtmlParams,
        requestOptions: RequestOptions
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
                .addPathSegments("embed", "card")
                .putQueryParam("embed_request", embed_request)
                .putQueryParam("hmac", embed_request_hmac)
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .putHeader("Accept", "text/html")
                .build()
        return clientOptions.httpClient.executeAsync(request).thenApply { response ->
            response.let { embedHandler.handle(it) }
        }
    }

    override fun getEmbedUrl(
        params: CardGetEmbedUrlParams,
        requestOptions: RequestOptions
    ): String {
        val embed_request =
            Base64.getEncoder()
                .encodeToString(clientOptions.jsonMapper.writeValueAsBytes(params.getBody()))

        val mac: Mac = Mac.getInstance("HmacSHA256")
        mac.init(SecretKeySpec(clientOptions.apiKey.toByteArray(), "HmacSHA256"))
        val embed_request_hmac =
            Base64.getEncoder().encodeToString(mac.doFinal(embed_request.toByteArray()))

        return URIBuilder(URI.create(clientOptions.baseUrl))
            .appendPathSegments("embed", "card")
            .addParameter("embed_request", embed_request)
            .addParameter("hmac", embed_request_hmac)
            .toString()
    }
}
