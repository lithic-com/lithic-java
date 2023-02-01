@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.lithic.api.services.blocking

import okhttp3.HttpUrl
import okhttp3.Request
import com.fasterxml.jackson.databind.json.JsonMapper
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.util.Base64
import java.util.Optional
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.Transaction
import com.lithic.api.models.TransactionListPage
import com.lithic.api.models.TransactionListParams
import com.lithic.api.models.TransactionRetrieveParams
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
import com.lithic.api.core.ClientOptions
import com.lithic.api.core.http.HttpMethod
import com.lithic.api.core.http.HttpRequest
import com.lithic.api.core.http.HttpResponse.Handler
import com.lithic.api.core.JsonField
import com.lithic.api.core.RequestOptions
import com.lithic.api.errors.LithicError
import com.lithic.api.services.emptyHandler
import com.lithic.api.services.errorHandler
import com.lithic.api.services.json
import com.lithic.api.services.jsonHandler
import com.lithic.api.services.stringHandler
import com.lithic.api.services.withErrorHandler

interface TransactionService {

    /**
     * Get specific transaction.
     *
     * _Note that the transaction object returned via this endpoint will be changing in
     * Sandbox on January 4, 2023 and in Production on February 8, 2023. Please refer
     * to [this page](https://docs.lithic.com/docs/guide-to-q1-2023-lithic-api-changes)
     * for more information._
     */
    @JvmOverloads
    fun retrieve(params: TransactionRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Transaction

    /**
     * List transactions.
     *
     * _Note that the transaction object returned via this endpoint will be changing in
     * Sandbox on January 4, 2023 and in Production on February 8, 2023. Please refer
     * to [this page](https://docs.lithic.com/docs/guide-to-q1-2023-lithic-api-changes)
     * for more information._
     */
    @JvmOverloads
    fun list(params: TransactionListParams, requestOptions: RequestOptions = RequestOptions.none()): TransactionListPage

    /**
     * Simulates an authorization request from the payment network as if it came from a
     * merchant acquirer. If you're configured for ASA, simulating auths requires your
     * ASA client to be set up properly (respond with a valid JSON to the ASA request).
     * For users that are not configured for ASA, a daily transaction limit of $5000
     * USD is applied by default. This limit can be modified via the
     * [update account](https://docs.lithic.com/reference/patchaccountbytoken)
     * endpoint.
     */
    @JvmOverloads
    fun simulateAuthorization(params: TransactionSimulateAuthorizationParams, requestOptions: RequestOptions = RequestOptions.none()): TransactionSimulateAuthorizationResponse

    /**
     * Clears an existing authorization. After this event, the transaction is no longer
     * pending.
     *
     * If no `amount` is supplied to this endpoint, the amount of the transaction will
     * be captured. Any transaction that has any amount completed at all do not have
     * access to this behavior.
     */
    @JvmOverloads
    fun simulateClearing(params: TransactionSimulateClearingParams, requestOptions: RequestOptions = RequestOptions.none()): TransactionSimulateClearingResponse

    /**
     * Simulates a credit authorization advice message from the payment network. This
     * message indicates that a credit authorization was approved on your behalf by the
     * network.
     */
    @JvmOverloads
    fun simulateCreditAuthorization(params: TransactionSimulateCreditAuthorizationParams, requestOptions: RequestOptions = RequestOptions.none()): TransactionSimulateCreditAuthorizationResponse

    /**
     * Returns (aka refunds) an amount back to a card. Returns are cleared immediately
     * and do not spend time in a `PENDING` state.
     */
    @JvmOverloads
    fun simulateReturn(params: TransactionSimulateReturnParams, requestOptions: RequestOptions = RequestOptions.none()): TransactionSimulateReturnResponse

    /**
     * Voids a settled credit transaction – i.e., a transaction with a negative amount
     * and `SETTLED` status. These can be credit authorizations that have already
     * cleared or financial credit authorizations. This endpoint will be available
     * beginning January 4, 2023.
     */
    @JvmOverloads
    fun simulateReturnReversal(params: TransactionSimulateReturnReversalParams, requestOptions: RequestOptions = RequestOptions.none()): TransactionSimulateReturnReversalResponse

    /**
     * Voids an existing, uncleared (aka pending) authorization. If amount is not sent
     * the full amount will be voided. Cannot be used on partially completed
     * transactions, but can be used on partially voided transactions. _Note that
     * simulating an authorization expiry on credit authorizations or credit
     * authorization advice is not currently supported but will be added soon._
     */
    @JvmOverloads
    fun simulateVoid(params: TransactionSimulateVoidParams, requestOptions: RequestOptions = RequestOptions.none()): TransactionSimulateVoidResponse
}
