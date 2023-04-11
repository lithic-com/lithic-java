@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
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
import java.util.concurrent.CompletableFuture

interface CardServiceAsync {

    /**
     * Create a new virtual or physical card. Parameters `pin`, `shipping_address`, and `product_id`
     * only apply to physical cards.
     */
    @JvmOverloads
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /** Get card configuration such as spend limit and state. */
    @JvmOverloads
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /**
     * Update the specified properties of the card. Unsupplied properties will remain unchanged.
     * `pin` parameter only applies to physical cards.
     *
     * _Note: setting a card to a `CLOSED` state is a final action that cannot be undone._
     */
    @JvmOverloads
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /** List cards. */
    @JvmOverloads
    fun list(
        params: CardListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardListPageAsync>

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
    @JvmOverloads
    fun embed(
        params: CardEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<String>

    /**
     * Allow your cardholders to directly add payment cards to the device's digital wallet (e.g.
     * Apple Pay) with one touch from your app.
     *
     * This requires some additional setup and configuration. Please
     * [Contact Us](https://lithic.com/contact) or your Customer Success representative for more
     * information.
     */
    @JvmOverloads
    fun provision(
        params: CardProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardProvisionResponse>

    /**
     * Initiate print and shipment of a duplicate physical card.
     *
     * Only applies to cards of type `PHYSICAL`.
     */
    @JvmOverloads
    fun reissue(
        params: CardReissueParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    fun getEmbedHtml(
        params: CardGetEmbedHtmlParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<String>

    fun getEmbedUrl(
        params: CardGetEmbedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): String
}
