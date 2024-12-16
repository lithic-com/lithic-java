// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.async

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Card
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardListPageAsync
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
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsync
import com.lithic.api.services.async.cards.BalanceServiceAsync
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import java.util.concurrent.CompletableFuture

interface CardServiceAsync {

    fun aggregateBalances(): AggregateBalanceServiceAsync

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    /**
     * Create a new virtual or physical card. Parameters `shipping_address` and `product_id` only
     * apply to physical cards.
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
     * Convert a virtual card into a physical card and manufacture it. Customer must supply relevant
     * fields for physical card creation including `product_id`, `carrier`, `shipping_method`, and
     * `shipping_address`. The card token will be unchanged. The card's type will be altered to
     * `PHYSICAL`. The card will be set to state `PENDING_FULFILLMENT` and fulfilled at next
     * fulfillment cycle. Virtual cards created on card programs which do not support physical cards
     * cannot be converted. The card program cannot be changed as part of the conversion. Cards must
     * be in a state of either `OPEN` or `PAUSED` to be converted. Only applies to cards of type
     * `VIRTUAL` (or existing cards with deprecated types of `DIGITAL_WALLET` and `UNLOCKED`).
     */
    @JvmOverloads
    fun convertPhysical(
        params: CardConvertPhysicalParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /**
     * Handling full card PANs and CVV codes requires that you comply with the Payment Card Industry
     * Data Security Standards (PCI DSS). Some clients choose to reduce their compliance obligations
     * by leveraging our embedded card UI solution documented below.
     *
     * In this setup, PANs and CVV codes are presented to the end-user via a card UI that we
     * provide, optionally styled in the customer's branding using a specified css stylesheet. A
     * user's browser makes the request directly to api.lithic.com, so card PANs and CVVs never
     * touch the API customer's servers while full card data is displayed to their end-users. The
     * response contains an HTML document (see Embedded Card UI or Changelog for upcoming changes in
     * January). This means that the url for the request can be inserted straight into the `src`
     * attribute of an iframe.
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
     * Initiate print and shipment of a duplicate physical card (e.g. card is physically damaged).
     * The PAN, expiry, and CVC2 will remain the same and the original card can continue to be used
     * until the new card is activated. A card can be reissued a maximum of 8 times. Only applies to
     * cards of type `PHYSICAL`.
     */
    @JvmOverloads
    fun reissue(
        params: CardReissueParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /**
     * Creates a new card with the same card token and PAN, but updated expiry and CVC2 code. The
     * original card will keep working for card-present transactions until the new card is
     * activated. For card-not-present transactions, the original card details (expiry, CVC2) will
     * also keep working until the new card is activated. Applies to card types `PHYSICAL` and
     * `VIRTUAL`.
     */
    @JvmOverloads
    fun renew(
        params: CardRenewParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>

    /**
     * Get a Card's available spend limit, which is based on the spend limit configured on the Card
     * and the amount already spent over the spend limit's duration. For example, if the Card has a
     * monthly spend limit of $1000 configured, and has spent $600 in the last month, the available
     * spend limit returned would be $400.
     */
    @JvmOverloads
    fun retrieveSpendLimits(
        params: CardRetrieveSpendLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<CardSpendLimits>

    /**
     * Get card configuration such as spend limit and state. Customers must be PCI compliant to use
     * this endpoint. Please contact [support@lithic.com](mailto:support@lithic.com) for questions.
     * _Note: this is a `POST` endpoint because it is more secure to send sensitive data in a
     * request body than in a URL._
     */
    @JvmOverloads
    fun searchByPan(
        params: CardSearchByPanParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CompletableFuture<Card>
}
