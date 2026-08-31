// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.BlockchainRecipient
import com.lithic.api.models.BlockchainRecipientCreateParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface BlockchainRecipientServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): BlockchainRecipientServiceAsync

    /**
     * Register a blockchain address as a withdrawal destination for a financial account
     *
     * The recipient is created with a `PENDING` verification state and cannot receive a payout
     * until screening of the address completes. Registering an address that is already registered
     * to the same financial account returns the existing recipient and its current verification
     * state, rather than creating a second one
     */
    fun create(params: BlockchainRecipientCreateParams): CompletableFuture<BlockchainRecipient> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: BlockchainRecipientCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<BlockchainRecipient>

    /**
     * A view of [BlockchainRecipientServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): BlockchainRecipientServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /v1/blockchain_recipients`, but is otherwise the
         * same as [BlockchainRecipientServiceAsync.create].
         */
        fun create(
            params: BlockchainRecipientCreateParams
        ): CompletableFuture<HttpResponseFor<BlockchainRecipient>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: BlockchainRecipientCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<BlockchainRecipient>>
    }
}
