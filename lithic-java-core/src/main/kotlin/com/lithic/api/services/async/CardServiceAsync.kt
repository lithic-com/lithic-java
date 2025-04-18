// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardConvertPhysicalParams
import com.lithic.api.models.CardConvertPhysicalResponse
import com.lithic.api.models.CardCreateParams
import com.lithic.api.models.CardCreateResponse
import com.lithic.api.models.CardEmbedParams
import com.lithic.api.models.CardGetEmbedHtmlParams
import com.lithic.api.models.CardGetEmbedUrlParams
import com.lithic.api.models.CardListPageAsync
import com.lithic.api.models.CardListParams
import com.lithic.api.models.CardProvisionParams
import com.lithic.api.models.CardProvisionResponse
import com.lithic.api.models.CardReissueParams
import com.lithic.api.models.CardReissueResponse
import com.lithic.api.models.CardRenewParams
import com.lithic.api.models.CardRenewResponse
import com.lithic.api.models.CardRetrieveParams
import com.lithic.api.models.CardRetrieveResponse
import com.lithic.api.models.CardRetrieveSpendLimitsParams
import com.lithic.api.models.CardSearchByPanParams
import com.lithic.api.models.CardSearchByPanResponse
import com.lithic.api.models.CardSpendLimits
import com.lithic.api.models.CardUpdateParams
import com.lithic.api.models.CardUpdateResponse
import com.lithic.api.services.async.cards.AggregateBalanceServiceAsync
import com.lithic.api.services.async.cards.BalanceServiceAsync
import com.lithic.api.services.async.cards.FinancialTransactionServiceAsync
import java.util.concurrent.CompletableFuture

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    fun aggregateBalances(): AggregateBalanceServiceAsync

    fun balances(): BalanceServiceAsync

    fun financialTransactions(): FinancialTransactionServiceAsync

    /**
     * Create a new virtual or physical card. Parameters `shipping_address` and `product_id` only
     * apply to physical cards.
     */
    fun create(params: CardCreateParams): CompletableFuture<CardCreateResponse> =
        create(params, RequestOptions.none())

    /** @see [create] */
    fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardCreateResponse>

    /** Get card configuration such as spend limit and state. */
    fun retrieve(params: CardRetrieveParams): CompletableFuture<CardRetrieveResponse> =
        retrieve(params, RequestOptions.none())

    /** @see [retrieve] */
    fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardRetrieveResponse>

    /**
     * Update the specified properties of the card. Unsupplied properties will remain unchanged.
     *
     * _Note: setting a card to a `CLOSED` state is a final action that cannot be undone._
     */
    fun update(params: CardUpdateParams): CompletableFuture<CardUpdateResponse> =
        update(params, RequestOptions.none())

    /** @see [update] */
    fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardUpdateResponse>

    /** List cards. */
    fun list(): CompletableFuture<CardListPageAsync> = list(CardListParams.none())

    /** @see [list] */
    fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardListPageAsync>

    /** @see [list] */
    fun list(params: CardListParams = CardListParams.none()): CompletableFuture<CardListPageAsync> =
        list(params, RequestOptions.none())

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardListPageAsync> =
        list(CardListParams.none(), requestOptions)

    /**
     * Convert a virtual card into a physical card and manufacture it. Customer must supply relevant
     * fields for physical card creation including `product_id`, `carrier`, `shipping_method`, and
     * `shipping_address`. The card token will be unchanged. The card's type will be altered to
     * `PHYSICAL`. The card will be set to state `PENDING_FULFILLMENT` and fulfilled at next
     * fulfillment cycle. Virtual cards created on card programs which do not support physical cards
     * cannot be converted. The card program cannot be changed as part of the conversion. Cards must
     * be in an `OPEN` state to be converted. Only applies to cards of type `VIRTUAL` (or existing
     * cards with deprecated types of `DIGITAL_WALLET` and `UNLOCKED`).
     */
    fun convertPhysical(
        params: CardConvertPhysicalParams
    ): CompletableFuture<CardConvertPhysicalResponse> =
        convertPhysical(params, RequestOptions.none())

    /** @see [convertPhysical] */
    fun convertPhysical(
        params: CardConvertPhysicalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardConvertPhysicalResponse>

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
    fun embed(params: CardEmbedParams): CompletableFuture<String> =
        embed(params, RequestOptions.none())

    /** @see [embed] */
    fun embed(
        params: CardEmbedParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    /**
     * Allow your cardholders to directly add payment cards to the device's digital wallet (e.g.
     * Apple Pay) with one touch from your app.
     *
     * This requires some additional setup and configuration. Please
     * [Contact Us](https://lithic.com/contact) or your Customer Success representative for more
     * information.
     */
    fun provision(params: CardProvisionParams): CompletableFuture<CardProvisionResponse> =
        provision(params, RequestOptions.none())

    /** @see [provision] */
    fun provision(
        params: CardProvisionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardProvisionResponse>

    /**
     * Initiate print and shipment of a duplicate physical card (e.g. card is physically damaged).
     * The PAN, expiry, and CVC2 will remain the same and the original card can continue to be used
     * until the new card is activated. Only applies to cards of type `PHYSICAL`. A card can be
     * replaced or renewed a total of 8 times.
     */
    fun reissue(params: CardReissueParams): CompletableFuture<CardReissueResponse> =
        reissue(params, RequestOptions.none())

    /** @see [reissue] */
    fun reissue(
        params: CardReissueParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardReissueResponse>

    /**
     * Applies to card types `PHYSICAL` and `VIRTUAL`. For `PHYSICAL`, creates a new card with the
     * same card token and PAN, but updated expiry and CVC2 code. The original card will keep
     * working for card-present transactions until the new card is activated. For card-not-present
     * transactions, the original card details (expiry, CVC2) will also keep working until the new
     * card is activated. A `PHYSICAL` card can be replaced or renewed a total of 8 times. For
     * `VIRTUAL`, the card will retain the same card token and PAN and receive an updated expiry and
     * CVC2 code. `product_id`, `shipping_method`, `shipping_address`, `carrier` are only relevant
     * for renewing `PHYSICAL` cards.
     */
    fun renew(params: CardRenewParams): CompletableFuture<CardRenewResponse> =
        renew(params, RequestOptions.none())

    /** @see [renew] */
    fun renew(
        params: CardRenewParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardRenewResponse>

    /**
     * Get a Card's available spend limit, which is based on the spend limit configured on the Card
     * and the amount already spent over the spend limit's duration. For example, if the Card has a
     * monthly spend limit of $1000 configured, and has spent $600 in the last month, the available
     * spend limit returned would be $400.
     */
    fun retrieveSpendLimits(
        params: CardRetrieveSpendLimitsParams
    ): CompletableFuture<CardSpendLimits> = retrieveSpendLimits(params, RequestOptions.none())

    /** @see [retrieveSpendLimits] */
    fun retrieveSpendLimits(
        params: CardRetrieveSpendLimitsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardSpendLimits>

    /**
     * Get card configuration such as spend limit and state. Customers must be PCI compliant to use
     * this endpoint. Please contact [support@lithic.com](mailto:support@lithic.com) for questions.
     * _Note: this is a `POST` endpoint because it is more secure to send sensitive data in a
     * request body than in a URL._
     */
    fun searchByPan(params: CardSearchByPanParams): CompletableFuture<CardSearchByPanResponse> =
        searchByPan(params, RequestOptions.none())

    /** @see [searchByPan] */
    fun searchByPan(
        params: CardSearchByPanParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardSearchByPanResponse>

    fun getEmbedHtml(
        params: CardGetEmbedHtmlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<String>

    fun getEmbedUrl(
        params: CardGetEmbedUrlParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): String

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        fun aggregateBalances(): AggregateBalanceServiceAsync.WithRawResponse

        fun balances(): BalanceServiceAsync.WithRawResponse

        fun financialTransactions(): FinancialTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/cards`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        @MustBeClosed
        fun create(
            params: CardCreateParams
        ): CompletableFuture<HttpResponseFor<CardCreateResponse>> =
            create(params, RequestOptions.none())

        /** @see [create] */
        @MustBeClosed
        fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardCreateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}`, but is otherwise the same
         * as [CardServiceAsync.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CardRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardRetrieveResponse>> =
            retrieve(params, RequestOptions.none())

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardRetrieveResponse>>

        /**
         * Returns a raw HTTP response for `patch /v1/cards/{card_token}`, but is otherwise the same
         * as [CardServiceAsync.update].
         */
        @MustBeClosed
        fun update(
            params: CardUpdateParams
        ): CompletableFuture<HttpResponseFor<CardUpdateResponse>> =
            update(params, RequestOptions.none())

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardUpdateResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/cards`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        fun list(): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(CardListParams.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>>

        /** @see [list] */
        @MustBeClosed
        fun list(
            params: CardListParams = CardListParams.none()
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardListPageAsync>> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/convert_physical`, but is
         * otherwise the same as [CardServiceAsync.convertPhysical].
         */
        @MustBeClosed
        fun convertPhysical(
            params: CardConvertPhysicalParams
        ): CompletableFuture<HttpResponseFor<CardConvertPhysicalResponse>> =
            convertPhysical(params, RequestOptions.none())

        /** @see [convertPhysical] */
        @MustBeClosed
        fun convertPhysical(
            params: CardConvertPhysicalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardConvertPhysicalResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/embed/card`, but is otherwise the same as
         * [CardServiceAsync.embed].
         */
        @MustBeClosed
        fun embed(params: CardEmbedParams): CompletableFuture<HttpResponseFor<String>> =
            embed(params, RequestOptions.none())

        /** @see [embed] */
        @MustBeClosed
        fun embed(
            params: CardEmbedParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<String>>

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/provision`, but is otherwise
         * the same as [CardServiceAsync.provision].
         */
        @MustBeClosed
        fun provision(
            params: CardProvisionParams
        ): CompletableFuture<HttpResponseFor<CardProvisionResponse>> =
            provision(params, RequestOptions.none())

        /** @see [provision] */
        @MustBeClosed
        fun provision(
            params: CardProvisionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardProvisionResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/reissue`, but is otherwise
         * the same as [CardServiceAsync.reissue].
         */
        @MustBeClosed
        fun reissue(
            params: CardReissueParams
        ): CompletableFuture<HttpResponseFor<CardReissueResponse>> =
            reissue(params, RequestOptions.none())

        /** @see [reissue] */
        @MustBeClosed
        fun reissue(
            params: CardReissueParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardReissueResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/cards/{card_token}/renew`, but is otherwise the
         * same as [CardServiceAsync.renew].
         */
        @MustBeClosed
        fun renew(params: CardRenewParams): CompletableFuture<HttpResponseFor<CardRenewResponse>> =
            renew(params, RequestOptions.none())

        /** @see [renew] */
        @MustBeClosed
        fun renew(
            params: CardRenewParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardRenewResponse>>

        /**
         * Returns a raw HTTP response for `get /v1/cards/{card_token}/spend_limits`, but is
         * otherwise the same as [CardServiceAsync.retrieveSpendLimits].
         */
        @MustBeClosed
        fun retrieveSpendLimits(
            params: CardRetrieveSpendLimitsParams
        ): CompletableFuture<HttpResponseFor<CardSpendLimits>> =
            retrieveSpendLimits(params, RequestOptions.none())

        /** @see [retrieveSpendLimits] */
        @MustBeClosed
        fun retrieveSpendLimits(
            params: CardRetrieveSpendLimitsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardSpendLimits>>

        /**
         * Returns a raw HTTP response for `post /v1/cards/search_by_pan`, but is otherwise the same
         * as [CardServiceAsync.searchByPan].
         */
        @MustBeClosed
        fun searchByPan(
            params: CardSearchByPanParams
        ): CompletableFuture<HttpResponseFor<CardSearchByPanResponse>> =
            searchByPan(params, RequestOptions.none())

        /** @see [searchByPan] */
        @MustBeClosed
        fun searchByPan(
            params: CardSearchByPanParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardSearchByPanResponse>>
    }
}
