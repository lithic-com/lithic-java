// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardBulkOrder
import com.lithic.api.models.CardBulkOrderCreateParams
import com.lithic.api.models.CardBulkOrderListPageAsync
import com.lithic.api.models.CardBulkOrderListParams
import com.lithic.api.models.CardBulkOrderRetrieveParams
import com.lithic.api.models.CardBulkOrderUpdateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface CardBulkOrderServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardBulkOrderServiceAsync

    /**
     * Create a new bulk order for physical card shipments **[BETA]**. Cards can be added to the
     * order via the POST /v1/cards endpoint by specifying the bulk_order_token. Lock the order via
     * PATCH /v1/card_bulk_orders/{bulk_order_token} to prepare for shipment. Please work with your
     * Customer Success Manager and card personalization bureau to ensure bulk shipping is supported
     * for your program.
     */
    fun create(params: CardBulkOrderCreateParams): CompletableFuture<CardBulkOrder> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardBulkOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBulkOrder>

    /** Retrieve a specific bulk order by token **[BETA]** */
    fun retrieve(bulkOrderToken: String): CompletableFuture<CardBulkOrder> =
        retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bulkOrderToken: String,
        params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBulkOrder> =
        retrieve(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bulkOrderToken: String,
        params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
    ): CompletableFuture<CardBulkOrder> = retrieve(bulkOrderToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardBulkOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBulkOrder>

    /** @see retrieve */
    fun retrieve(params: CardBulkOrderRetrieveParams): CompletableFuture<CardBulkOrder> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        bulkOrderToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<CardBulkOrder> =
        retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none(), requestOptions)

    /**
     * Update a bulk order **[BETA]**. Primarily used to lock the order, preventing additional cards
     * from being added
     */
    fun update(
        bulkOrderToken: String,
        params: CardBulkOrderUpdateParams,
    ): CompletableFuture<CardBulkOrder> = update(bulkOrderToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        bulkOrderToken: String,
        params: CardBulkOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBulkOrder> =
        update(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

    /** @see update */
    fun update(params: CardBulkOrderUpdateParams): CompletableFuture<CardBulkOrder> =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardBulkOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBulkOrder>

    /** List bulk orders for physical card shipments **[BETA]** */
    fun list(): CompletableFuture<CardBulkOrderListPageAsync> = list(CardBulkOrderListParams.none())

    /** @see list */
    fun list(
        params: CardBulkOrderListParams = CardBulkOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<CardBulkOrderListPageAsync>

    /** @see list */
    fun list(
        params: CardBulkOrderListParams = CardBulkOrderListParams.none()
    ): CompletableFuture<CardBulkOrderListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<CardBulkOrderListPageAsync> =
        list(CardBulkOrderListParams.none(), requestOptions)

    /**
     * A view of [CardBulkOrderServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardBulkOrderServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/card_bulk_orders`, but is otherwise the same as
         * [CardBulkOrderServiceAsync.create].
         */
        fun create(
            params: CardBulkOrderCreateParams
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>> = create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: CardBulkOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>>

        /**
         * Returns a raw HTTP response for `get /v1/card_bulk_orders/{bulk_order_token}`, but is
         * otherwise the same as [CardBulkOrderServiceAsync.retrieve].
         */
        fun retrieve(bulkOrderToken: String): CompletableFuture<HttpResponseFor<CardBulkOrder>> =
            retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            bulkOrderToken: String,
            params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>> =
            retrieve(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            bulkOrderToken: String,
            params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>> =
            retrieve(bulkOrderToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: CardBulkOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>>

        /** @see retrieve */
        fun retrieve(
            params: CardBulkOrderRetrieveParams
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            bulkOrderToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>> =
            retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/card_bulk_orders/{bulk_order_token}`, but is
         * otherwise the same as [CardBulkOrderServiceAsync.update].
         */
        fun update(
            bulkOrderToken: String,
            params: CardBulkOrderUpdateParams,
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>> =
            update(bulkOrderToken, params, RequestOptions.none())

        /** @see update */
        fun update(
            bulkOrderToken: String,
            params: CardBulkOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>> =
            update(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

        /** @see update */
        fun update(
            params: CardBulkOrderUpdateParams
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>> = update(params, RequestOptions.none())

        /** @see update */
        fun update(
            params: CardBulkOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBulkOrder>>

        /**
         * Returns a raw HTTP response for `get /v1/card_bulk_orders`, but is otherwise the same as
         * [CardBulkOrderServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<CardBulkOrderListPageAsync>> =
            list(CardBulkOrderListParams.none())

        /** @see list */
        fun list(
            params: CardBulkOrderListParams = CardBulkOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<CardBulkOrderListPageAsync>>

        /** @see list */
        fun list(
            params: CardBulkOrderListParams = CardBulkOrderListParams.none()
        ): CompletableFuture<HttpResponseFor<CardBulkOrderListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<CardBulkOrderListPageAsync>> =
            list(CardBulkOrderListParams.none(), requestOptions)
    }
}
