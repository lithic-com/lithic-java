// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.RequestOptions
import com.lithic.api.core.http.HttpResponse
import com.lithic.api.core.http.HttpResponseFor
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionExpireAuthorizationParams
import com.lithic.api.models.TransactionListPage
import com.lithic.api.models.TransactionListParams
import com.lithic.api.models.TransactionRetrieveParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceParams
import com.lithic.api.models.TransactionSimulateAuthorizationAdviceResponse
import com.lithic.api.models.TransactionSimulateAuthorizationParams
import com.lithic.api.models.TransactionSimulateAuthorizationResponse
import com.lithic.api.models.TransactionSimulateClearingParams
import com.lithic.api.models.TransactionSimulateClearingResponse
import com.lithic.api.models.TransactionSimulateCreditAuthorizationAdviceParams
import com.lithic.api.models.TransactionSimulateCreditAuthorizationAdviceResponse
import com.lithic.api.models.TransactionSimulateCreditAuthorizationParams
import com.lithic.api.models.TransactionSimulateCreditAuthorizationResponse
import com.lithic.api.models.TransactionSimulateReturnParams
import com.lithic.api.models.TransactionSimulateReturnResponse
import com.lithic.api.models.TransactionSimulateReturnReversalParams
import com.lithic.api.models.TransactionSimulateReturnReversalResponse
import com.lithic.api.models.TransactionSimulateVoidParams
import com.lithic.api.models.TransactionSimulateVoidResponse
import com.lithic.api.services.blocking.transactions.EnhancedCommercialDataService
import com.lithic.api.services.blocking.transactions.EventService
import java.util.function.Consumer

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: Consumer<ClientOptions.Builder>): TransactionService

    fun enhancedCommercialData(): EnhancedCommercialDataService

    fun events(): EventService

    /**
     * Get a specific card transaction. All amounts are in the smallest unit of their respective
     * currency (e.g., cents for USD).
     */
    fun retrieve(transactionToken: String): Transaction =
        retrieve(transactionToken, TransactionRetrieveParams.none())

    /** @see retrieve */
    fun retrieve(
        transactionToken: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction =
        retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        transactionToken: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
    ): Transaction = retrieve(transactionToken, params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** @see retrieve */
    fun retrieve(params: TransactionRetrieveParams): Transaction =
        retrieve(params, RequestOptions.none())

    /** @see retrieve */
    fun retrieve(transactionToken: String, requestOptions: RequestOptions): Transaction =
        retrieve(transactionToken, TransactionRetrieveParams.none(), requestOptions)

    /**
     * List card transactions. All amounts are in the smallest unit of their respective currency
     * (e.g., cents for USD) and inclusive of any acquirer fees.
     */
    fun list(): TransactionListPage = list(TransactionListParams.none())

    /** @see list */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPage

    /** @see list */
    fun list(params: TransactionListParams = TransactionListParams.none()): TransactionListPage =
        list(params, RequestOptions.none())

    /** @see list */
    fun list(requestOptions: RequestOptions): TransactionListPage =
        list(TransactionListParams.none(), requestOptions)

    /** Expire authorization */
    fun expireAuthorization(transactionToken: String) =
        expireAuthorization(transactionToken, TransactionExpireAuthorizationParams.none())

    /** @see expireAuthorization */
    fun expireAuthorization(
        transactionToken: String,
        params: TransactionExpireAuthorizationParams = TransactionExpireAuthorizationParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ) =
        expireAuthorization(
            params.toBuilder().transactionToken(transactionToken).build(),
            requestOptions,
        )

    /** @see expireAuthorization */
    fun expireAuthorization(
        transactionToken: String,
        params: TransactionExpireAuthorizationParams = TransactionExpireAuthorizationParams.none(),
    ) = expireAuthorization(transactionToken, params, RequestOptions.none())

    /** @see expireAuthorization */
    fun expireAuthorization(
        params: TransactionExpireAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    )

    /** @see expireAuthorization */
    fun expireAuthorization(params: TransactionExpireAuthorizationParams) =
        expireAuthorization(params, RequestOptions.none())

    /** @see expireAuthorization */
    fun expireAuthorization(transactionToken: String, requestOptions: RequestOptions) =
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
    ): TransactionSimulateAuthorizationResponse =
        simulateAuthorization(params, RequestOptions.none())

    /** @see simulateAuthorization */
    fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateAuthorizationResponse

    /**
     * Simulates an authorization advice from the card network as if it came from a merchant
     * acquirer. An authorization advice changes the pending amount of the transaction.
     */
    fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams
    ): TransactionSimulateAuthorizationAdviceResponse =
        simulateAuthorizationAdvice(params, RequestOptions.none())

    /** @see simulateAuthorizationAdvice */
    fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateAuthorizationAdviceResponse

    /**
     * Clears an existing authorization, either debit or credit. After this event, the transaction
     * transitions from `PENDING` to `SETTLED` status.
     *
     * If `amount` is not set, the full amount of the transaction will be cleared. Transactions that
     * have already cleared, either partially or fully, cannot be cleared again using this endpoint.
     */
    fun simulateClearing(
        params: TransactionSimulateClearingParams
    ): TransactionSimulateClearingResponse = simulateClearing(params, RequestOptions.none())

    /** @see simulateClearing */
    fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateClearingResponse

    /**
     * Simulates a credit authorization advice from the card network. This message indicates that
     * the network approved a credit authorization on your behalf.
     */
    @Deprecated("use `simulateCreditAuthorizationAdvice` instead")
    fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams
    ): TransactionSimulateCreditAuthorizationResponse =
        simulateCreditAuthorization(params, RequestOptions.none())

    /** @see simulateCreditAuthorization */
    @Deprecated("use `simulateCreditAuthorizationAdvice` instead")
    fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateCreditAuthorizationResponse

    /**
     * Simulates a credit authorization advice from the card network. This message indicates that
     * the network approved a credit authorization on your behalf.
     */
    fun simulateCreditAuthorizationAdvice(
        params: TransactionSimulateCreditAuthorizationAdviceParams
    ): TransactionSimulateCreditAuthorizationAdviceResponse =
        simulateCreditAuthorizationAdvice(params, RequestOptions.none())

    /** @see simulateCreditAuthorizationAdvice */
    fun simulateCreditAuthorizationAdvice(
        params: TransactionSimulateCreditAuthorizationAdviceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateCreditAuthorizationAdviceResponse

    /**
     * Returns, or refunds, an amount back to a card. Returns simulated via this endpoint clear
     * immediately, without prior authorization, and result in a `SETTLED` transaction status.
     */
    fun simulateReturn(params: TransactionSimulateReturnParams): TransactionSimulateReturnResponse =
        simulateReturn(params, RequestOptions.none())

    /** @see simulateReturn */
    fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateReturnResponse

    /**
     * Reverses a return, i.e. a credit transaction with a `SETTLED` status. Returns can be
     * financial credit authorizations, or credit authorizations that have cleared.
     */
    fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams
    ): TransactionSimulateReturnReversalResponse =
        simulateReturnReversal(params, RequestOptions.none())

    /** @see simulateReturnReversal */
    fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateReturnReversalResponse

    /**
     * Voids a pending authorization. If `amount` is not set, the full amount will be voided. Can be
     * used on partially voided transactions but not partially cleared transactions. _Simulating an
     * authorization expiry on credit authorizations or credit authorization advice is not currently
     * supported but will be added soon._
     */
    fun simulateVoid(params: TransactionSimulateVoidParams): TransactionSimulateVoidResponse =
        simulateVoid(params, RequestOptions.none())

    /** @see simulateVoid */
    fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionSimulateVoidResponse

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: Consumer<ClientOptions.Builder>
        ): TransactionService.WithRawResponse

        fun enhancedCommercialData(): EnhancedCommercialDataService.WithRawResponse

        fun events(): EventService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /v1/transactions/{transaction_token}`, but is
         * otherwise the same as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(transactionToken: String): HttpResponseFor<Transaction> =
            retrieve(transactionToken, TransactionRetrieveParams.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction> =
            retrieve(params.toBuilder().transactionToken(transactionToken).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        ): HttpResponseFor<Transaction> = retrieve(transactionToken, params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(params: TransactionRetrieveParams): HttpResponseFor<Transaction> =
            retrieve(params, RequestOptions.none())

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Transaction> =
            retrieve(transactionToken, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /v1/transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(): HttpResponseFor<TransactionListPage> = list(TransactionListParams.none())

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none()
        ): HttpResponseFor<TransactionListPage> = list(params, RequestOptions.none())

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionListPage> =
            list(TransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /v1/transactions/{transaction_token}/expire_authorization`, but is otherwise the same as
         * [TransactionService.expireAuthorization].
         */
        @MustBeClosed
        fun expireAuthorization(transactionToken: String): HttpResponse =
            expireAuthorization(transactionToken, TransactionExpireAuthorizationParams.none())

        /** @see expireAuthorization */
        @MustBeClosed
        fun expireAuthorization(
            transactionToken: String,
            params: TransactionExpireAuthorizationParams =
                TransactionExpireAuthorizationParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse =
            expireAuthorization(
                params.toBuilder().transactionToken(transactionToken).build(),
                requestOptions,
            )

        /** @see expireAuthorization */
        @MustBeClosed
        fun expireAuthorization(
            transactionToken: String,
            params: TransactionExpireAuthorizationParams =
                TransactionExpireAuthorizationParams.none(),
        ): HttpResponse = expireAuthorization(transactionToken, params, RequestOptions.none())

        /** @see expireAuthorization */
        @MustBeClosed
        fun expireAuthorization(
            params: TransactionExpireAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponse

        /** @see expireAuthorization */
        @MustBeClosed
        fun expireAuthorization(params: TransactionExpireAuthorizationParams): HttpResponse =
            expireAuthorization(params, RequestOptions.none())

        /** @see expireAuthorization */
        @MustBeClosed
        fun expireAuthorization(
            transactionToken: String,
            requestOptions: RequestOptions,
        ): HttpResponse =
            expireAuthorization(
                transactionToken,
                TransactionExpireAuthorizationParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post /v1/simulate/authorize`, but is otherwise the same
         * as [TransactionService.simulateAuthorization].
         */
        @MustBeClosed
        fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams
        ): HttpResponseFor<TransactionSimulateAuthorizationResponse> =
            simulateAuthorization(params, RequestOptions.none())

        /** @see simulateAuthorization */
        @MustBeClosed
        fun simulateAuthorization(
            params: TransactionSimulateAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateAuthorizationResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/authorization_advice`, but is
         * otherwise the same as [TransactionService.simulateAuthorizationAdvice].
         */
        @MustBeClosed
        fun simulateAuthorizationAdvice(
            params: TransactionSimulateAuthorizationAdviceParams
        ): HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse> =
            simulateAuthorizationAdvice(params, RequestOptions.none())

        /** @see simulateAuthorizationAdvice */
        @MustBeClosed
        fun simulateAuthorizationAdvice(
            params: TransactionSimulateAuthorizationAdviceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateAuthorizationAdviceResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/clearing`, but is otherwise the same
         * as [TransactionService.simulateClearing].
         */
        @MustBeClosed
        fun simulateClearing(
            params: TransactionSimulateClearingParams
        ): HttpResponseFor<TransactionSimulateClearingResponse> =
            simulateClearing(params, RequestOptions.none())

        /** @see simulateClearing */
        @MustBeClosed
        fun simulateClearing(
            params: TransactionSimulateClearingParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateClearingResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/credit_authorization_advice`, but is
         * otherwise the same as [TransactionService.simulateCreditAuthorization].
         */
        @Deprecated("use `simulateCreditAuthorizationAdvice` instead")
        @MustBeClosed
        fun simulateCreditAuthorization(
            params: TransactionSimulateCreditAuthorizationParams
        ): HttpResponseFor<TransactionSimulateCreditAuthorizationResponse> =
            simulateCreditAuthorization(params, RequestOptions.none())

        /** @see simulateCreditAuthorization */
        @Deprecated("use `simulateCreditAuthorizationAdvice` instead")
        @MustBeClosed
        fun simulateCreditAuthorization(
            params: TransactionSimulateCreditAuthorizationParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateCreditAuthorizationResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/credit_authorization_advice`, but is
         * otherwise the same as [TransactionService.simulateCreditAuthorizationAdvice].
         */
        @MustBeClosed
        fun simulateCreditAuthorizationAdvice(
            params: TransactionSimulateCreditAuthorizationAdviceParams
        ): HttpResponseFor<TransactionSimulateCreditAuthorizationAdviceResponse> =
            simulateCreditAuthorizationAdvice(params, RequestOptions.none())

        /** @see simulateCreditAuthorizationAdvice */
        @MustBeClosed
        fun simulateCreditAuthorizationAdvice(
            params: TransactionSimulateCreditAuthorizationAdviceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateCreditAuthorizationAdviceResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/return`, but is otherwise the same as
         * [TransactionService.simulateReturn].
         */
        @MustBeClosed
        fun simulateReturn(
            params: TransactionSimulateReturnParams
        ): HttpResponseFor<TransactionSimulateReturnResponse> =
            simulateReturn(params, RequestOptions.none())

        /** @see simulateReturn */
        @MustBeClosed
        fun simulateReturn(
            params: TransactionSimulateReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateReturnResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/return_reversal`, but is otherwise the
         * same as [TransactionService.simulateReturnReversal].
         */
        @MustBeClosed
        fun simulateReturnReversal(
            params: TransactionSimulateReturnReversalParams
        ): HttpResponseFor<TransactionSimulateReturnReversalResponse> =
            simulateReturnReversal(params, RequestOptions.none())

        /** @see simulateReturnReversal */
        @MustBeClosed
        fun simulateReturnReversal(
            params: TransactionSimulateReturnReversalParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateReturnReversalResponse>

        /**
         * Returns a raw HTTP response for `post /v1/simulate/void`, but is otherwise the same as
         * [TransactionService.simulateVoid].
         */
        @MustBeClosed
        fun simulateVoid(
            params: TransactionSimulateVoidParams
        ): HttpResponseFor<TransactionSimulateVoidResponse> =
            simulateVoid(params, RequestOptions.none())

        /** @see simulateVoid */
        @MustBeClosed
        fun simulateVoid(
            params: TransactionSimulateVoidParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionSimulateVoidResponse>
    }
}
