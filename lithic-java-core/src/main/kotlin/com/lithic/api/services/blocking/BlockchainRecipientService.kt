// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BlockchainRecipient
import com.lithic.api.models.BlockchainRecipientCreateParams
import com.lithic.api.models.BlockchainRecipientRetrieveParams
import java.util.function.Consumer

interface BlockchainRecipientService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlockchainRecipientService

    /**
     * Register a blockchain address as a withdrawal destination for a financial account
     *
     * The recipient is created with a `PENDING` verification state and cannot receive a payout
     * until screening of the address completes. Registering an address that is already registered
     * to the same financial account returns the existing recipient and its current verification
     * state, rather than creating a second one
     */
    fun create(params: BlockchainRecipientCreateParams): BlockchainRecipient =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BlockchainRecipientCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockchainRecipient

    /**
     * Get a blockchain recipient by token
     *
     * Use this to poll the `verification_state` after registering an address: a recipient cannot
     * receive a payout until screening completes and moves it out of `PENDING`
     */
    fun retrieve(blockchainRecipientToken: String): BlockchainRecipient =
        retrieve(blockchainRecipientToken, BlockchainRecipientRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        blockchainRecipientToken: String,
        params: BlockchainRecipientRetrieveParams = BlockchainRecipientRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockchainRecipient =
        retrieve(
            params.toBuilder().blockchainRecipientToken(blockchainRecipientToken).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        blockchainRecipientToken: String,
        params: BlockchainRecipientRetrieveParams = BlockchainRecipientRetrieveParams.none(),
    ): BlockchainRecipient = retrieve(blockchainRecipientToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: BlockchainRecipientRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BlockchainRecipient

    /** @see retrieve */
    fun retrieve(params: BlockchainRecipientRetrieveParams): BlockchainRecipient =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        blockchainRecipientToken: String,
        requestOptions: RequestOptions,
    ): BlockchainRecipient =
        retrieve(blockchainRecipientToken, BlockchainRecipientRetrieveParams.none(), requestOptions)

    /**
     * A view of [BlockchainRecipientService] that provides access to raw HTTP responses for each
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
        ): BlockchainRecipientService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/blockchain_recipients`, but is otherwise the
         * same as [BlockchainRecipientService.create].
         */
        @MustBeClosed
        fun create(params: BlockchainRecipientCreateParams): HttpResponseFor<BlockchainRecipient> =
            create(params, RequestOptions.none())

        /** @see create */
        @MustBeClosed
        fun create(
            params: BlockchainRecipientCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockchainRecipient>

        /**
         * Returns a raw HTTP response for `get
         * /v1/blockchain_recipients/{blockchain_recipient_token}`, but is otherwise the same as
         * [BlockchainRecipientService.retrieve].
         */
        @MustBeClosed
        fun retrieve(blockchainRecipientToken: String): HttpResponseFor<BlockchainRecipient> =
            retrieve(blockchainRecipientToken, BlockchainRecipientRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            blockchainRecipientToken: String,
            params: BlockchainRecipientRetrieveParams = BlockchainRecipientRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockchainRecipient> =
            retrieve(
                params.toBuilder().blockchainRecipientToken(blockchainRecipientToken).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            blockchainRecipientToken: String,
            params: BlockchainRecipientRetrieveParams = BlockchainRecipientRetrieveParams.none(),
        ): HttpResponseFor<BlockchainRecipient> =
            retrieve(blockchainRecipientToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BlockchainRecipientRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BlockchainRecipient>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: BlockchainRecipientRetrieveParams
        ): HttpResponseFor<BlockchainRecipient> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            blockchainRecipientToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BlockchainRecipient> =
            retrieve(
                blockchainRecipientToken,
                BlockchainRecipientRetrieveParams.none(),
                requestOptions,
            )
    }
}
