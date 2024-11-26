// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import com.lithic.api.core.RequestOptions
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionListPage
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
import com.lithic.api.services.blocking.transactions.EnhancedCommercialDataService
import com.lithic.api.services.blocking.transactions.EventService

interface TransactionService {

    fun enhancedCommercialData(): EnhancedCommercialDataService

    fun events(): EventService

    /**
     * Get a specific card transaction. All amounts are in the smallest unit of their respective
     * currency (e.g., cents for USD).
     */
    @JvmOverloads
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction

    /**
     * List card transactions. All amounts are in the smallest unit of their respective currency
     * (e.g., cents for USD) and inclusive of any acquirer fees.
     */
    @JvmOverloads
    fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionListPage

    /**
     * Simulates an authorization request from the card network as if it came from a merchant
     * acquirer. If you are configured for ASA, simulating authorizations requires your ASA client
     * to be set up properly, i.e. be able to respond to the ASA request with a valid JSON. For
     * users that are not configured for ASA, a daily transaction limit of $5000 USD is applied by
     * default. You can update this limit via the
     * [update account](https://docs.lithic.com/reference/patchaccountbytoken) endpoint.
     */
    @JvmOverloads
    fun simulateAuthorization(
        params: TransactionSimulateAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateAuthorizationResponse

    /**
     * Simulates an authorization advice from the card network as if it came from a merchant
     * acquirer. An authorization advice changes the pending amount of the transaction.
     */
    @JvmOverloads
    fun simulateAuthorizationAdvice(
        params: TransactionSimulateAuthorizationAdviceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateAuthorizationAdviceResponse

    /**
     * Clears an existing authorization, either debit or credit. After this event, the transaction
     * transitions from `PENDING` to `SETTLED` status.
     *
     * If `amount` is not set, the full amount of the transaction will be cleared. Transactions that
     * have already cleared, either partially or fully, cannot be cleared again using this endpoint.
     */
    @JvmOverloads
    fun simulateClearing(
        params: TransactionSimulateClearingParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateClearingResponse

    /**
     * Simulates a credit authorization advice from the card network. This message indicates that
     * the network approved a credit authorization on your behalf.
     */
    @JvmOverloads
    fun simulateCreditAuthorization(
        params: TransactionSimulateCreditAuthorizationParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateCreditAuthorizationResponse

    /**
     * Returns, or refunds, an amount back to a card. Returns simulated via this endpoint clear
     * immediately, without prior authorization, and result in a `SETTLED` transaction status.
     */
    @JvmOverloads
    fun simulateReturn(
        params: TransactionSimulateReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateReturnResponse

    /**
     * Reverses a return, i.e. a credit transaction with a `SETTLED` status. Returns can be
     * financial credit authorizations, or credit authorizations that have cleared.
     */
    @JvmOverloads
    fun simulateReturnReversal(
        params: TransactionSimulateReturnReversalParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateReturnReversalResponse

    /**
     * Voids a pending authorization. If `amount` is not set, the full amount will be voided. Can be
     * used on partially voided transactions but not partially cleared transactions. _Simulating an
     * authorization expiry on credit authorizations or credit authorization advice is not currently
     * supported but will be added soon._
     */
    @JvmOverloads
    fun simulateVoid(
        params: TransactionSimulateVoidParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): TransactionSimulateVoidResponse
}
