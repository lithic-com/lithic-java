// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Hold
import com.lithic.api.models.HoldCreateParams
import com.lithic.api.models.HoldListPageAsync
import com.lithic.api.models.HoldListParams
import com.lithic.api.models.HoldRetrieveParams
import com.lithic.api.models.HoldVoidParams
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface HoldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldServiceAsync

    /**
     * Create a hold on a financial account. Holds reserve funds by moving them from available to
     * pending balance. They can be resolved via settlement (linked to a payment or book transfer),
     * voiding, or expiration.
     */
    fun create(financialAccountToken: String, params: HoldCreateParams): CompletableFuture<Hold> =
        create(financialAccountToken, params, RequestOptions.none())

    /** @see create */
    fun create(
        financialAccountToken: String,
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold> =
        create(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see create */
    fun create(params: HoldCreateParams): CompletableFuture<Hold> =
        create(params, RequestOptions.none())

    /** @see create */
    fun create(
        params: HoldCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold>

    /** Get hold by token. */
    fun retrieve(holdToken: String): CompletableFuture<Hold> =
        retrieve(holdToken, HoldRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        holdToken: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold> =
        retrieve(params.toBuilder().holdToken(holdToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        holdToken: String,
        params: HoldRetrieveParams = HoldRetrieveParams.none(),
    ): CompletableFuture<Hold> = retrieve(holdToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: HoldRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold>

    /** @see retrieve */
    fun retrieve(params: HoldRetrieveParams): CompletableFuture<Hold> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(holdToken: String, requestOptions: RequestOptions): CompletableFuture<Hold> =
        retrieve(holdToken, HoldRetrieveParams.none(), requestOptions)

    /** List holds for a financial account. */
    fun list(financialAccountToken: String): CompletableFuture<HoldListPageAsync> =
        list(financialAccountToken, HoldListParams.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: HoldListParams = HoldListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HoldListPageAsync> =
        list(
            params.toBuilder().financialAccountToken(financialAccountToken).build(),
            requestOptions,
        )

    /** @see list */
    fun list(
        financialAccountToken: String,
        params: HoldListParams = HoldListParams.none(),
    ): CompletableFuture<HoldListPageAsync> =
        list(financialAccountToken, params, RequestOptions.none())

    /** @see list */
    fun list(
        params: HoldListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<HoldListPageAsync>

    /** @see list */
    fun list(params: HoldListParams): CompletableFuture<HoldListPageAsync> =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(
        financialAccountToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<HoldListPageAsync> =
        list(financialAccountToken, HoldListParams.none(), requestOptions)

    /**
     * Void an active hold. This returns the held funds from pending back to available balance. Only
     * holds in PENDING status can be voided.
     */
    fun void_(holdToken: String): CompletableFuture<Hold> = void_(holdToken, HoldVoidParams.none())

    /** @see void_ */
    fun void_(
        holdToken: String,
        params: HoldVoidParams = HoldVoidParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold> =
        void_(params.toBuilder().holdToken(holdToken).build(), requestOptions)

    /** @see void_ */
    fun void_(
        holdToken: String,
        params: HoldVoidParams = HoldVoidParams.none(),
    ): CompletableFuture<Hold> = void_(holdToken, params, RequestOptions.none())

    /** @see void_ */
    fun void_(
        params: HoldVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Hold>

    /** @see void_ */
    fun void_(params: HoldVoidParams): CompletableFuture<Hold> =
        void_(params, RequestOptions.none())

    /** @see void_ */
    fun void_(holdToken: String, requestOptions: RequestOptions): CompletableFuture<Hold> =
        void_(holdToken, HoldVoidParams.none(), requestOptions)

    /** A view of [HoldServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: Consumer<ClientOptions.Builder>): HoldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /v1/financial_accounts/{financial_account_token}/holds`, but is otherwise the same as
         * [HoldServiceAsync.create].
         */
        fun create(
            financialAccountToken: String,
            params: HoldCreateParams,
        ): CompletableFuture<HttpResponseFor<Hold>> =
            create(financialAccountToken, params, RequestOptions.none())

        /** @see create */
        fun create(
            financialAccountToken: String,
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>> =
            create(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see create */
        fun create(params: HoldCreateParams): CompletableFuture<HttpResponseFor<Hold>> =
            create(params, RequestOptions.none())

        /** @see create */
        fun create(
            params: HoldCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>>

        /**
         * Returns a raw HTTP response for `get /v1/holds/{hold_token}`, but is otherwise the same
         * as [HoldServiceAsync.retrieve].
         */
        fun retrieve(holdToken: String): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(holdToken, HoldRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            holdToken: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(params.toBuilder().holdToken(holdToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            holdToken: String,
            params: HoldRetrieveParams = HoldRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(holdToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: HoldRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>>

        /** @see retrieve */
        fun retrieve(params: HoldRetrieveParams): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            holdToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Hold>> =
            retrieve(holdToken, HoldRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /v1/financial_accounts/{financial_account_token}/holds`, but is otherwise the same as
         * [HoldServiceAsync.list].
         */
        fun list(
            financialAccountToken: String
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>> =
            list(financialAccountToken, HoldListParams.none())

        /** @see list */
        fun list(
            financialAccountToken: String,
            params: HoldListParams = HoldListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>> =
            list(
                params.toBuilder().financialAccountToken(financialAccountToken).build(),
                requestOptions,
            )

        /** @see list */
        fun list(
            financialAccountToken: String,
            params: HoldListParams = HoldListParams.none(),
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>> =
            list(financialAccountToken, params, RequestOptions.none())

        /** @see list */
        fun list(
            params: HoldListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>>

        /** @see list */
        fun list(params: HoldListParams): CompletableFuture<HttpResponseFor<HoldListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            financialAccountToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<HoldListPageAsync>> =
            list(financialAccountToken, HoldListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /v1/holds/{hold_token}/void`, but is otherwise the
         * same as [HoldServiceAsync.void_].
         */
        fun void_(holdToken: String): CompletableFuture<HttpResponseFor<Hold>> =
            void_(holdToken, HoldVoidParams.none())

        /** @see void_ */
        fun void_(
            holdToken: String,
            params: HoldVoidParams = HoldVoidParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>> =
            void_(params.toBuilder().holdToken(holdToken).build(), requestOptions)

        /** @see void_ */
        fun void_(
            holdToken: String,
            params: HoldVoidParams = HoldVoidParams.none(),
        ): CompletableFuture<HttpResponseFor<Hold>> =
            void_(holdToken, params, RequestOptions.none())

        /** @see void_ */
        fun void_(
            params: HoldVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Hold>>

        /** @see void_ */
        fun void_(params: HoldVoidParams): CompletableFuture<HttpResponseFor<Hold>> =
            void_(params, RequestOptions.none())

        /** @see void_ */
        fun void_(
            holdToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Hold>> =
            void_(holdToken, HoldVoidParams.none(), requestOptions)
    }
}
