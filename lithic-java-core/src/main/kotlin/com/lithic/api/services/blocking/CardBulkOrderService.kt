// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.CardBulkOrder
import com.lithic.api.models.CardBulkOrderCreateParams
import com.lithic.api.models.CardBulkOrderListPage
import com.lithic.api.models.CardBulkOrderListParams
import com.lithic.api.models.CardBulkOrderRetrieveParams
import com.lithic.api.models.CardBulkOrderUpdateParams
import java.util.function.Consumer

interface CardBulkOrderService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): CardBulkOrderService

    /**
     * Create a new bulk order for physical card shipments **[BETA]**. Cards can be added to the
     * order via the POST /v1/cards endpoint by specifying the bulk_order_token. Lock the order via
     * PATCH /v1/card_bulk_orders/{bulk_order_token} to prepare for shipment. Please work with your
     * Customer Success Manager and card personalization bureau to ensure bulk shipping is supported
     * for your program.
     */
    fun create(params: CardBulkOrderCreateParams): CardBulkOrder =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: CardBulkOrderCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder

    /** Retrieve a specific bulk order by token **[BETA]** */
    fun retrieve(bulkOrderToken: String): CardBulkOrder =
        retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        bulkOrderToken: String,
        params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder =
        retrieve(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        bulkOrderToken: String,
        params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
    ): CardBulkOrder = retrieve(bulkOrderToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: CardBulkOrderRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder

    /** @see retrieve */
    fun retrieve(params: CardBulkOrderRetrieveParams): CardBulkOrder =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(bulkOrderToken: String, requestOptions: RequestOptions): CardBulkOrder =
        retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none(), requestOptions)

    /**
     * Update a bulk order **[BETA]**. Primarily used to lock the order, preventing additional cards
     * from being added
     */
    fun update(bulkOrderToken: String, params: CardBulkOrderUpdateParams): CardBulkOrder =
        update(bulkOrderToken, params, RequestOptions.none())

    /** @see update */
    fun update(
        bulkOrderToken: String,
        params: CardBulkOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder =
        update(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

    /** @see update */
    fun update(params: CardBulkOrderUpdateParams): CardBulkOrder =
        update(params, RequestOptions.none())

    /** @see update */
    fun update(
        params: CardBulkOrderUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrder

    /** List bulk orders for physical card shipments **[BETA]** */
    fun list(): CardBulkOrderListPage = list(CardBulkOrderListParams.none())

    /** @see list */
    fun list(
        params: CardBulkOrderListParams = CardBulkOrderListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardBulkOrderListPage

    /** @see list */
    fun list(
        params: CardBulkOrderListParams = CardBulkOrderListParams.none()
    ): CardBulkOrderListPage = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CardBulkOrderListPage =
        list(CardBulkOrderListParams.none(), requestOptions)

    /**
     * A view of [CardBulkOrderService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): CardBulkOrderService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/card_bulk_orders`, but is otherwise the same as
         * [CardBulkOrderService.create].
         */
        @MustBeClosed
        fun create(params: CardBulkOrderCreateParams): HttpResponseFor<CardBulkOrder> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: CardBulkOrderCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder>

        /**
         * Returns a raw HTTP response for `get /v1/card_bulk_orders/{bulk_order_token}`, but is
         * otherwise the same as [CardBulkOrderService.retrieve].
         */
        @MustBeClosed
        fun retrieve(bulkOrderToken: String): HttpResponseFor<CardBulkOrder> =
            retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bulkOrderToken: String,
            params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder> =
            retrieve(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bulkOrderToken: String,
            params: CardBulkOrderRetrieveParams = CardBulkOrderRetrieveParams.none(),
        ): HttpResponseFor<CardBulkOrder> = retrieve(bulkOrderToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardBulkOrderRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: CardBulkOrderRetrieveParams): HttpResponseFor<CardBulkOrder> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bulkOrderToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardBulkOrder> =
            retrieve(bulkOrderToken, CardBulkOrderRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /v1/card_bulk_orders/{bulk_order_token}`, but is
         * otherwise the same as [CardBulkOrderService.update].
         */
        @MustBeClosed
        fun update(
            bulkOrderToken: String,
            params: CardBulkOrderUpdateParams,
        ): HttpResponseFor<CardBulkOrder> = update(bulkOrderToken, params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            bulkOrderToken: String,
            params: CardBulkOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder> =
            update(params.toBuilder().bulkOrderToken(bulkOrderToken).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        fun update(params: CardBulkOrderUpdateParams): HttpResponseFor<CardBulkOrder> =
            update(params, RequestOptions.none())

        /** @see update */
        @MustBeClosed
        fun update(
            params: CardBulkOrderUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrder>

        /**
         * Returns a raw HTTP response for `get /v1/card_bulk_orders`, but is otherwise the same as
         * [CardBulkOrderService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<CardBulkOrderListPage> = list(CardBulkOrderListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardBulkOrderListParams = CardBulkOrderListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardBulkOrderListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: CardBulkOrderListParams = CardBulkOrderListParams.none()
        ): HttpResponseFor<CardBulkOrderListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardBulkOrderListPage> =
            list(CardBulkOrderListParams.none(), requestOptions)
    }
}
