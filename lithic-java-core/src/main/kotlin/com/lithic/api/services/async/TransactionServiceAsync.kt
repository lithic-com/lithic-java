// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.async

import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionExpireAuthorizationParams
import com.lithic.api.models.TransactionListPageAsync
import com.lithic.api.models.TransactionListParams
import com.lithic.api.models.TransactionRetrieveParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceResponse
import com.lithic.api.models.TransactionSimulateAuthorizationParams
import com.lithic.api.models.TransactionSimulateAuthorizationResponse
import com.lithic.api.models.TransactionSimulateClearingParams
import com.lithic.api.models.TransactionSimulateClearingResponse
import com.lithic.api.models.TransactionSimulateCreditAuthorizationParams
import com.lithic.api.models.TransactionSimulateCreditAuthorizationResponse
import com.lithic.api.models.TransactionSimulateReturnParams
import com.lithic.api.models.TransactionSimulateReturnResponse
import com.lithic.api.models.TransactionSimulateReturnReversalParams
import com.lithic.api.models.TransactionSimulateReturnReversalResponse
import com.lithic.api.models.TransactionSimulateVoidParams
import com.lithic.api.models.TransactionSimulateVoidResponse
import com.lithic.api.services.async.transactions.EnhancedCommercialDataServiceAsync
import com.lithic.api.services.async.transactions.EventServiceAsync
import java.util.concurrent.CompletableFuture
import java.util.function.Consumer

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionServiceAsync

    fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync

    fun events(): EventServiceAsync

    /**
     * Get a specific card transaction. All amounts are in the smallest unit of their respective
     * currency (e.g., cents for USD).
     */
    fun retrieve(transactionToken: String): CompletableFuture<Transaction> =
        retrieve(transactionToken, TransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        transactionToken: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction> =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        transactionToken: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): CompletableFuture<Transaction> = retrieve(transactionToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Transaction>

    /** @see retrieve */
    fun retrieve(params: TransactionRetrieveParams): CompletableFuture<Transaction> =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Transaction> =
        retrieve(transactionToken, TransactionRetrieveParams.none(), requestOptions)

    /**
     * List card transactions. All amounts are in the smallest unit of their respective currency
     * (e.g., cents for USD) and inclusive of any acquirer fees.
     */
    fun list(): CompletableFuture<TransactionListPageAsync> = list(TransactionListParams.none())

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionListPageAsync>

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none()
    ): CompletableFuture<TransactionListPageAsync> = list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): CompletableFuture<TransactionListPageAsync> =
        list(TransactionListParams.none(), requestOptions)

    /** Expire authorization */
    fun expireAuthorization(transactionToken: String): CompletableFuture<Void?> =
        expireAuthorization(transactionToken, TransactionExpireAuthorizationParams.none())

    /** @see expireAuthorization */
    fun expireAuthorization(
        transactionToken: String,
        params: TransactionExpireAuthorizationParams = TransactionExpireAuthorizationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?> =
        expireAuthorization(
            params.toBuilder().transactionToken(transactionToken).build(),
            requestOptions,
        )

    /** @see expireAuthorization */
    fun expireAuthorization(
        transactionToken: String,
        params: TransactionExpireAuthorizationParams = TransactionExpireAuthorizationParams.none(),
    ): CompletableFuture<Void?> =
        expireAuthorization(transactionToken, params, RequestOptions.none())

    /** @see expireAuthorization */
    fun expireAuthorization(
        params: TransactionExpireAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<Void?>

    /** @see expireAuthorization */
    fun expireAuthorization(
        params: TransactionExpireAuthorizationParams
    ): CompletableFuture<Void?> = expireAuthorization(params, RequestOptions.none())

    /** @see expireAuthorization */
    fun expireAuthorization(
        transactionToken: String,
        requestOptions: RequestOptions,
    ): CompletableFuture<Void?> =
        expireAuthorization(
            transactionToken,
            TransactionExpireAuthorizationParams.none(),
            requestOptions,
        )

    /**
     * Simulates an authorization request from the card network as if it came from a merchant
     * acquirer. If you are configured for ASA, simulating authorizations requires your ASA client
     * to be set up properly, i.e. be able to respond to the ASA request with a valid JSON. For
     * users that are not configured for ASA, a daily transaction limit of $5000 USD is applied by
     * default. You can update this limit via the
     * [update account](https://docs.lithic.com/reference/patchaccountbytoken) endpoint.
     */
    fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams
    ): CompletableFuture<TransactionSimulateAuthorizationResponse> =
        simulateAuthorization(params, RequestOptions.none())

    /** @see simulateAuthorization */
    fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionSimulateAuthorizationResponse>

    /**
     * Simulates an authorization advice from the card network as if it came from a merchant
     * acquirer. An authorization advice changes the pending amount of the transaction.
     */
    fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams
    ): CompletableFuture<TransactionSimulateAuthorizationAdviceResponse> =
        simulateAuthorizationAdvice(params, RequestOptions.none())

    /** @see simulateAuthorizationAdvice */
    fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionSimulateAuthorizationAdviceResponse>

    /**
     * Clears an existing authorization, either debit or credit. After this event, the transaction
     * transitions from `PENDING` to `SETTLED` status.
     *
     * If `amount` is not set, the full amount of the transaction will be cleared. Transactions that
     * have already cleared, either partially or fully, cannot be cleared again using this endpoint.
     */
    fun simulateClearing(
        params: TransactionSimulateClearingParams
    ): CompletableFuture<TransactionSimulateClearingResponse> =
        simulateClearing(params, RequestOptions.none())

    /** @see simulateClearing */
    fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionSimulateClearingResponse>

    /**
     * Simulates a credit authorization advice from the card network. This message indicates that
     * the network approved a credit authorization on your behalf.
     */
    fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams
    ): CompletableFuture<TransactionSimulateCreditAuthorizationResponse> =
        simulateCreditAuthorization(params, RequestOptions.none())

    /** @see simulateCreditAuthorization */
    fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionSimulateCreditAuthorizationResponse>

    /**
     * Returns, or refunds, an amount back to a card. Returns simulated via this endpoint clear
     * immediately, without prior authorization, and result in a `SETTLED` transaction status.
     */
    fun simulateReturn(
        params: TransactionSimulateReturnParams
    ): CompletableFuture<TransactionSimulateReturnResponse> =
        simulateReturn(params, RequestOptions.none())

    /** @see simulateReturn */
    fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionSimulateReturnResponse>

    /**
     * Reverses a return, i.e. a credit transaction with a `SETTLED` status. Returns can be
     * financial credit authorizations, or credit authorizations that have cleared.
     */
    fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams
    ): CompletableFuture<TransactionSimulateReturnReversalResponse> =
        simulateReturnReversal(params, RequestOptions.none())

    /** @see simulateReturnReversal */
    fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionSimulateReturnReversalResponse>

    /**
     * Voids a pending authorization. If `amount` is not set, the full amount will be voided. Can be
     * used on partially voided transactions but not partially cleared transactions. _Simulating an
     * authorization expiry on credit authorizations or credit authorization advice is not currently
     * supported but will be added soon._
     */
    fun simulateVoid(
        params: TransactionSimulateVoidParams
    ): CompletableFuture<TransactionSimulateVoidResponse> =
        simulateVoid(params, RequestOptions.none())

    /** @see simulateVoid */
    fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CompletableFuture<TransactionSimulateVoidResponse>

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionServiceAsync.WithRawResponse

        fun enhancedCommercialData(): EnhancedCommercialDataServiceAsync.WithRawResponse

        fun events(): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionServiceAsync.retrieve].
         */
        fun retrieve(transactionToken: String): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(transactionToken, TransactionRetrieveParams.none())

        /** @see retrieve */
        fun retrieve(
            transactionToken: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see retrieve */
        fun retrieve(
            transactionToken: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(transactionToken, params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<Transaction>>

        /** @see retrieve */
        fun retrieve(
            params: TransactionRetrieveParams
        ): CompletableFuture<HttpResponseFor<Transaction>> = retrieve(params, RequestOptions.none())

        /** @see retrieve */
        fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponseFor<Transaction>> =
            retrieve(transactionToken, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        fun list(): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(TransactionListParams.none())

        /** @see list */
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>>

        /** @see list */
        fun list(
            params: TransactionListParams = TransactionListParams.none()
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(params, RequestOptions.none())

        /** @see list */
        fun list(
            requestOptions: RequestOptions
        ): CompletableFuture<HttpResponseFor<TransactionListPageAsync>> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/transactions/{transaction_token}/expire_authorization`, but is otherwise the same as
         * [TransactionServiceAsync.expireAuthorization].
         */
        fun expireAuthorization(transactionToken: String): CompletableFuture<HttpResponse> =
            expireAuthorization(transactionToken, TransactionExpireAuthorizationParams.none())

        /** @see expireAuthorization */
        fun expireAuthorization(
            transactionToken: String,
            params: TransactionExpireAuthorizationParams =
                TransactionExpireAuthorizationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse> =
            expireAuthorization(
                params.toBuilder().transactionToken(transactionToken).build(),
                requestOptions,
            )

        /** @see expireAuthorization */
        fun expireAuthorization(
            transactionToken: String,
            params: TransactionExpireAuthorizationParams =
                TransactionExpireAuthorizationParams.none(),
        ): CompletableFuture<HttpResponse> =
            expireAuthorization(transactionToken, params, RequestOptions.none())

        /** @see expireAuthorization */
        fun expireAuthorization(
            params: TransactionExpireAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponse>

        /** @see expireAuthorization */
        fun expireAuthorization(
            params: TransactionExpireAuthorizationParams
        ): CompletableFuture<HttpResponse> = expireAuthorization(params, RequestOptions.none())

        /** @see expireAuthorization */
        fun expireAuthorization(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): CompletableFuture<HttpResponse> =
            expireAuthorization(
                transactionToken,
                TransactionExpireAuthorizationParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/simulate/authorize`, but is otherwise the same
         * as [TransactionServiceAsync.simulateAuthorization].
         */
        fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams
        ): CompletableFuture<HttpResponseFor<TransactionSimulateAuthorizationResponse>> =
            simulateAuthorization(params, RequestOptions.none())

        /** @see simulateAuthorization */
        fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionSimulateAuthorizationResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/authorization_advice`, but is
         * otherwise the same as [TransactionServiceAsync.simulateAuthorizationAdvice].
         */
        fun simulateAuthorizationAdvice(
            params: TransactionSimulateAuthorizationAdviceParams
        ): CompletableFuture<HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse>> =
            simulateAuthorizationAdvice(params, RequestOptions.none())

        /** @see simulateAuthorizationAdvice */
        fun simulateAuthorizationAdvice(
            params: TransactionSimulateAuthorizationAdviceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/clearing`, but is otherwise the same
         * as [TransactionServiceAsync.simulateClearing].
         */
        fun simulateClearing(
            params: TransactionSimulateClearingParams
        ): CompletableFuture<HttpResponseFor<TransactionSimulateClearingResponse>> =
            simulateClearing(params, RequestOptions.none())

        /** @see simulateClearing */
        fun simulateClearing(
            params: TransactionSimulateClearingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionSimulateClearingResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/credit_authorization_advice`, but is
         * otherwise the same as [TransactionServiceAsync.simulateCreditAuthorization].
         */
        fun simulateCreditAuthorization(
            params: TransactionSimulateCreditAuthorizationParams
        ): CompletableFuture<HttpResponseFor<TransactionSimulateCreditAuthorizationResponse>> =
            simulateCreditAuthorization(params, RequestOptions.none())

        /** @see simulateCreditAuthorization */
        fun simulateCreditAuthorization(
            params: TransactionSimulateCreditAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionSimulateCreditAuthorizationResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/return`, but is otherwise the same as
         * [TransactionServiceAsync.simulateReturn].
         */
        fun simulateReturn(
            params: TransactionSimulateReturnParams
        ): CompletableFuture<HttpResponseFor<TransactionSimulateReturnResponse>> =
            simulateReturn(params, RequestOptions.none())

        /** @see simulateReturn */
        fun simulateReturn(
            params: TransactionSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionSimulateReturnResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/return_reversal`, but is otherwise the
         * same as [TransactionServiceAsync.simulateReturnReversal].
         */
        fun simulateReturnReversal(
            params: TransactionSimulateReturnReversalParams
        ): CompletableFuture<HttpResponseFor<TransactionSimulateReturnReversalResponse>> =
            simulateReturnReversal(params, RequestOptions.none())

        /** @see simulateReturnReversal */
        fun simulateReturnReversal(
            params: TransactionSimulateReturnReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionSimulateReturnReversalResponse>>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/void`, but is otherwise the same as
         * [TransactionServiceAsync.simulateVoid].
         */
        fun simulateVoid(
            params: TransactionSimulateVoidParams
        ): CompletableFuture<HttpResponseFor<TransactionSimulateVoidResponse>> =
            simulateVoid(params, RequestOptions.none())

        /** @see simulateVoid */
        fun simulateVoid(
            params: TransactionSimulateVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): CompletableFuture<HttpResponseFor<TransactionSimulateVoidResponse>>
    }
}
