// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class Transaction
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val token: JsonField<String>,
    private val accountToken: JsonField<String>,
    private val acquirerFee: JsonField<Long>,
    private val acquirerReferenceNumber: JsonField<String>,
    private val amount: JsonField<Long>,
    private val amounts: JsonField<TransactionAmounts>,
    private val authorizationAmount: JsonField<Long>,
    private val authorizationCode: JsonField<String>,
    private val avs: JsonField<Avs>,
    private val cardToken: JsonField<String>,
    private val cardholderAuthentication: JsonField<CardholderAuthentication>,
    private val created: JsonField<OffsetDateTime>,
    private val financialAccountToken: JsonField<String>,
    private val merchant: JsonField<Merchant>,
    private val merchantAmount: JsonField<Long>,
    private val merchantAuthorizationAmount: JsonField<Long>,
    private val merchantCurrency: JsonField<String>,
    private val network: JsonField<Network>,
    private val networkRiskScore: JsonField<Long>,
    private val pos: JsonField<Pos>,
    private val result: JsonField<DeclineResult>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val tokenInfo: JsonField<TokenInfo>,
    private val updated: JsonField<OffsetDateTime>,
    private val events: JsonField<List<TransactionEvent>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acquirer_fee")
        @ExcludeMissing
        acquirerFee: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("acquirer_reference_number")
        @ExcludeMissing
        acquirerReferenceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amounts")
        @ExcludeMissing
        amounts: JsonField<TransactionAmounts> = JsonMissing.of(),
        @JsonProperty("authorization_amount")
        @ExcludeMissing
        authorizationAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("authorization_code")
        @ExcludeMissing
        authorizationCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("avs") @ExcludeMissing avs: JsonField<Avs> = JsonMissing.of(),
        @JsonProperty("card_token") @ExcludeMissing cardToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("cardholder_authentication")
        @ExcludeMissing
        cardholderAuthentication: JsonField<CardholderAuthentication> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("merchant") @ExcludeMissing merchant: JsonField<Merchant> = JsonMissing.of(),
        @JsonProperty("merchant_amount")
        @ExcludeMissing
        merchantAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("merchant_authorization_amount")
        @ExcludeMissing
        merchantAuthorizationAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("merchant_currency")
        @ExcludeMissing
        merchantCurrency: JsonField<String> = JsonMissing.of(),
        @JsonProperty("network") @ExcludeMissing network: JsonField<Network> = JsonMissing.of(),
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        networkRiskScore: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("pos") @ExcludeMissing pos: JsonField<Pos> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<DeclineResult> = JsonMissing.of(),
        @JsonProperty("settled_amount")
        @ExcludeMissing
        settledAmount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("token_info")
        @ExcludeMissing
        tokenInfo: JsonField<TokenInfo> = JsonMissing.of(),
        @JsonProperty("updated")
        @ExcludeMissing
        updated: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("events")
        @ExcludeMissing
        events: JsonField<List<TransactionEvent>> = JsonMissing.of(),
    ) : this(
        token,
        accountToken,
        acquirerFee,
        acquirerReferenceNumber,
        amount,
        amounts,
        authorizationAmount,
        authorizationCode,
        avs,
        cardToken,
        cardholderAuthentication,
        created,
        financialAccountToken,
        merchant,
        merchantAmount,
        merchantAuthorizationAmount,
        merchantCurrency,
        network,
        networkRiskScore,
        pos,
        result,
        settledAmount,
        status,
        tokenInfo,
        updated,
        events,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * The token for the account associated with this transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
     * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative value
     * to indicate credited fees.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun acquirerFee(): Optional<Long> = acquirerFee.getOptional("acquirer_fee")

    /**
     * Unique identifier assigned to a transaction by the acquirer that can be used in dispute and
     * chargeback filing. This field has been deprecated in favor of the `acquirer_reference_number`
     * that resides in the event-level `network_info`.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun acquirerReferenceNumber(): Optional<String> =
        acquirerReferenceNumber.getOptional("acquirer_reference_number")

    /**
     * When the transaction is pending, this represents the authorization amount of the transaction
     * in the anticipated settlement currency. Once the transaction has settled, this field
     * represents the settled amount in the settlement currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated") fun amount(): Long = amount.getRequired("amount")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amounts(): TransactionAmounts = amounts.getRequired("amounts")

    /**
     * The authorization amount of the transaction in the anticipated settlement currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun authorizationAmount(): Optional<Long> =
        authorizationAmount.getOptional("authorization_amount")

    /**
     * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
     * networks.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authorizationCode(): Optional<String> = authorizationCode.getOptional("authorization_code")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun avs(): Optional<Avs> = avs.getOptional("avs")

    /**
     * Token for the card used in this transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardToken(): String = cardToken.getRequired("card_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardholderAuthentication(): Optional<CardholderAuthentication> =
        cardholderAuthentication.getOptional("cardholder_authentication")

    /**
     * Date and time when the transaction first occurred. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun created(): OffsetDateTime = created.getRequired("created")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun financialAccountToken(): Optional<String> =
        financialAccountToken.getOptional("financial_account_token")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun merchant(): Merchant = merchant.getRequired("merchant")

    /**
     * Analogous to the 'amount', but in the merchant currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun merchantAmount(): Optional<Long> = merchantAmount.getOptional("merchant_amount")

    /**
     * Analogous to the 'authorization_amount', but in the merchant currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun merchantAuthorizationAmount(): Optional<Long> =
        merchantAuthorizationAmount.getOptional("merchant_authorization_amount")

    /**
     * 3-character alphabetic ISO 4217 code for the local currency of the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun merchantCurrency(): String = merchantCurrency.getRequired("merchant_currency")

    /**
     * Card network of the authorization. Value is `UNKNOWN` when Lithic cannot determine the
     * network code from the upstream provider.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun network(): Optional<Network> = network.getOptional("network")

    /**
     * Network-provided score assessing risk level associated with a given authorization. Scores are
     * on a range of 0-999, with 0 representing the lowest risk and 999 representing the highest
     * risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will normalize
     * the score by multiplying the raw score by 10x.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun networkRiskScore(): Optional<Long> = networkRiskScore.getOptional("network_risk_score")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun pos(): Pos = pos.getRequired("pos")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): DeclineResult = result.getRequired("result")

    /**
     * The settled amount of the transaction in the settlement currency.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    @Deprecated("deprecated")
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status of the transaction.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun tokenInfo(): Optional<TokenInfo> = tokenInfo.getOptional("token_info")

    /**
     * Date and time when the transaction last updated. UTC time zone.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun events(): Optional<List<TransactionEvent>> = events.getOptional("events")

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [accountToken].
     *
     * Unlike [accountToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Returns the raw JSON value of [acquirerFee].
     *
     * Unlike [acquirerFee], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("acquirer_fee") @ExcludeMissing fun _acquirerFee(): JsonField<Long> = acquirerFee

    /**
     * Returns the raw JSON value of [acquirerReferenceNumber].
     *
     * Unlike [acquirerReferenceNumber], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("acquirer_reference_number")
    @ExcludeMissing
    fun _acquirerReferenceNumber(): JsonField<String> = acquirerReferenceNumber

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [amounts].
     *
     * Unlike [amounts], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amounts") @ExcludeMissing fun _amounts(): JsonField<TransactionAmounts> = amounts

    /**
     * Returns the raw JSON value of [authorizationAmount].
     *
     * Unlike [authorizationAmount], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("authorization_amount")
    @ExcludeMissing
    fun _authorizationAmount(): JsonField<Long> = authorizationAmount

    /**
     * Returns the raw JSON value of [authorizationCode].
     *
     * Unlike [authorizationCode], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authorization_code")
    @ExcludeMissing
    fun _authorizationCode(): JsonField<String> = authorizationCode

    /**
     * Returns the raw JSON value of [avs].
     *
     * Unlike [avs], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("avs") @ExcludeMissing fun _avs(): JsonField<Avs> = avs

    /**
     * Returns the raw JSON value of [cardToken].
     *
     * Unlike [cardToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    /**
     * Returns the raw JSON value of [cardholderAuthentication].
     *
     * Unlike [cardholderAuthentication], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("cardholder_authentication")
    @ExcludeMissing
    fun _cardholderAuthentication(): JsonField<CardholderAuthentication> = cardholderAuthentication

    /**
     * Returns the raw JSON value of [created].
     *
     * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken(): JsonField<String> = financialAccountToken

    /**
     * Returns the raw JSON value of [merchant].
     *
     * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

    /**
     * Returns the raw JSON value of [merchantAmount].
     *
     * Unlike [merchantAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("merchant_amount")
    @ExcludeMissing
    fun _merchantAmount(): JsonField<Long> = merchantAmount

    /**
     * Returns the raw JSON value of [merchantAuthorizationAmount].
     *
     * Unlike [merchantAuthorizationAmount], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("merchant_authorization_amount")
    @ExcludeMissing
    fun _merchantAuthorizationAmount(): JsonField<Long> = merchantAuthorizationAmount

    /**
     * Returns the raw JSON value of [merchantCurrency].
     *
     * Unlike [merchantCurrency], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @Deprecated("deprecated")
    @JsonProperty("merchant_currency")
    @ExcludeMissing
    fun _merchantCurrency(): JsonField<String> = merchantCurrency

    /**
     * Returns the raw JSON value of [network].
     *
     * Unlike [network], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Returns the raw JSON value of [networkRiskScore].
     *
     * Unlike [networkRiskScore], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("network_risk_score")
    @ExcludeMissing
    fun _networkRiskScore(): JsonField<Long> = networkRiskScore

    /**
     * Returns the raw JSON value of [pos].
     *
     * Unlike [pos], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("pos") @ExcludeMissing fun _pos(): JsonField<Pos> = pos

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<DeclineResult> = result

    /**
     * Returns the raw JSON value of [settledAmount].
     *
     * Unlike [settledAmount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @Deprecated("deprecated")
    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tokenInfo].
     *
     * Unlike [tokenInfo], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_info") @ExcludeMissing fun _tokenInfo(): JsonField<TokenInfo> = tokenInfo

    /**
     * Returns the raw JSON value of [updated].
     *
     * Unlike [updated], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    /**
     * Returns the raw JSON value of [events].
     *
     * Unlike [events], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<TransactionEvent>> = events

    @JsonAnySetter
    private fun putAdditionalProperty(key: String, value: JsonValue) {
        additionalProperties.put(key, value)
    }

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> =
        Collections.unmodifiableMap(additionalProperties)

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [Transaction].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .acquirerFee()
         * .acquirerReferenceNumber()
         * .amount()
         * .amounts()
         * .authorizationAmount()
         * .authorizationCode()
         * .avs()
         * .cardToken()
         * .cardholderAuthentication()
         * .created()
         * .financialAccountToken()
         * .merchant()
         * .merchantAmount()
         * .merchantAuthorizationAmount()
         * .merchantCurrency()
         * .network()
         * .networkRiskScore()
         * .pos()
         * .result()
         * .settledAmount()
         * .status()
         * .tokenInfo()
         * .updated()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [Transaction]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var accountToken: JsonField<String>? = null
        private var acquirerFee: JsonField<Long>? = null
        private var acquirerReferenceNumber: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var amounts: JsonField<TransactionAmounts>? = null
        private var authorizationAmount: JsonField<Long>? = null
        private var authorizationCode: JsonField<String>? = null
        private var avs: JsonField<Avs>? = null
        private var cardToken: JsonField<String>? = null
        private var cardholderAuthentication: JsonField<CardholderAuthentication>? = null
        private var created: JsonField<OffsetDateTime>? = null
        private var financialAccountToken: JsonField<String>? = null
        private var merchant: JsonField<Merchant>? = null
        private var merchantAmount: JsonField<Long>? = null
        private var merchantAuthorizationAmount: JsonField<Long>? = null
        private var merchantCurrency: JsonField<String>? = null
        private var network: JsonField<Network>? = null
        private var networkRiskScore: JsonField<Long>? = null
        private var pos: JsonField<Pos>? = null
        private var result: JsonField<DeclineResult>? = null
        private var settledAmount: JsonField<Long>? = null
        private var status: JsonField<Status>? = null
        private var tokenInfo: JsonField<TokenInfo>? = null
        private var updated: JsonField<OffsetDateTime>? = null
        private var events: JsonField<MutableList<TransactionEvent>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transaction: Transaction) = apply {
            token = transaction.token
            accountToken = transaction.accountToken
            acquirerFee = transaction.acquirerFee
            acquirerReferenceNumber = transaction.acquirerReferenceNumber
            amount = transaction.amount
            amounts = transaction.amounts
            authorizationAmount = transaction.authorizationAmount
            authorizationCode = transaction.authorizationCode
            avs = transaction.avs
            cardToken = transaction.cardToken
            cardholderAuthentication = transaction.cardholderAuthentication
            created = transaction.created
            financialAccountToken = transaction.financialAccountToken
            merchant = transaction.merchant
            merchantAmount = transaction.merchantAmount
            merchantAuthorizationAmount = transaction.merchantAuthorizationAmount
            merchantCurrency = transaction.merchantCurrency
            network = transaction.network
            networkRiskScore = transaction.networkRiskScore
            pos = transaction.pos
            result = transaction.result
            settledAmount = transaction.settledAmount
            status = transaction.status
            tokenInfo = transaction.tokenInfo
            updated = transaction.updated
            events = transaction.events.map { it.toMutableList() }
            additionalProperties = transaction.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The token for the account associated with this transaction. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /**
         * Sets [Builder.accountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
         * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative
         * value to indicate credited fees.
         */
        fun acquirerFee(acquirerFee: Long?) = acquirerFee(JsonField.ofNullable(acquirerFee))

        /**
         * Alias for [Builder.acquirerFee].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun acquirerFee(acquirerFee: Long) = acquirerFee(acquirerFee as Long?)

        /** Alias for calling [Builder.acquirerFee] with `acquirerFee.orElse(null)`. */
        fun acquirerFee(acquirerFee: Optional<Long>) = acquirerFee(acquirerFee.getOrNull())

        /**
         * Sets [Builder.acquirerFee] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquirerFee] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun acquirerFee(acquirerFee: JsonField<Long>) = apply { this.acquirerFee = acquirerFee }

        /**
         * Unique identifier assigned to a transaction by the acquirer that can be used in dispute
         * and chargeback filing. This field has been deprecated in favor of the
         * `acquirer_reference_number` that resides in the event-level `network_info`.
         */
        @Deprecated("deprecated")
        fun acquirerReferenceNumber(acquirerReferenceNumber: String?) =
            acquirerReferenceNumber(JsonField.ofNullable(acquirerReferenceNumber))

        /**
         * Alias for calling [Builder.acquirerReferenceNumber] with
         * `acquirerReferenceNumber.orElse(null)`.
         */
        @Deprecated("deprecated")
        fun acquirerReferenceNumber(acquirerReferenceNumber: Optional<String>) =
            acquirerReferenceNumber(acquirerReferenceNumber.getOrNull())

        /**
         * Sets [Builder.acquirerReferenceNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.acquirerReferenceNumber] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) = apply {
            this.acquirerReferenceNumber = acquirerReferenceNumber
        }

        /**
         * When the transaction is pending, this represents the authorization amount of the
         * transaction in the anticipated settlement currency. Once the transaction has settled,
         * this field represents the settled amount in the settlement currency.
         */
        @Deprecated("deprecated") fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        @Deprecated("deprecated")
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun amounts(amounts: TransactionAmounts) = amounts(JsonField.of(amounts))

        /**
         * Sets [Builder.amounts] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amounts] with a well-typed [TransactionAmounts] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun amounts(amounts: JsonField<TransactionAmounts>) = apply { this.amounts = amounts }

        /** The authorization amount of the transaction in the anticipated settlement currency. */
        @Deprecated("deprecated")
        fun authorizationAmount(authorizationAmount: Long?) =
            authorizationAmount(JsonField.ofNullable(authorizationAmount))

        /**
         * Alias for [Builder.authorizationAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun authorizationAmount(authorizationAmount: Long) =
            authorizationAmount(authorizationAmount as Long?)

        /**
         * Alias for calling [Builder.authorizationAmount] with `authorizationAmount.orElse(null)`.
         */
        @Deprecated("deprecated")
        fun authorizationAmount(authorizationAmount: Optional<Long>) =
            authorizationAmount(authorizationAmount.getOrNull())

        /**
         * Sets [Builder.authorizationAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationAmount] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun authorizationAmount(authorizationAmount: JsonField<Long>) = apply {
            this.authorizationAmount = authorizationAmount
        }

        /**
         * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
         * networks.
         */
        fun authorizationCode(authorizationCode: String?) =
            authorizationCode(JsonField.ofNullable(authorizationCode))

        /** Alias for calling [Builder.authorizationCode] with `authorizationCode.orElse(null)`. */
        fun authorizationCode(authorizationCode: Optional<String>) =
            authorizationCode(authorizationCode.getOrNull())

        /**
         * Sets [Builder.authorizationCode] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authorizationCode] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun authorizationCode(authorizationCode: JsonField<String>) = apply {
            this.authorizationCode = authorizationCode
        }

        fun avs(avs: Avs?) = avs(JsonField.ofNullable(avs))

        /** Alias for calling [Builder.avs] with `avs.orElse(null)`. */
        fun avs(avs: Optional<Avs>) = avs(avs.getOrNull())

        /**
         * Sets [Builder.avs] to an arbitrary JSON value.
         *
         * You should usually call [Builder.avs] with a well-typed [Avs] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun avs(avs: JsonField<Avs>) = apply { this.avs = avs }

        /** Token for the card used in this transaction. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /**
         * Sets [Builder.cardToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        fun cardholderAuthentication(cardholderAuthentication: CardholderAuthentication?) =
            cardholderAuthentication(JsonField.ofNullable(cardholderAuthentication))

        /**
         * Alias for calling [Builder.cardholderAuthentication] with
         * `cardholderAuthentication.orElse(null)`.
         */
        fun cardholderAuthentication(cardholderAuthentication: Optional<CardholderAuthentication>) =
            cardholderAuthentication(cardholderAuthentication.getOrNull())

        /**
         * Sets [Builder.cardholderAuthentication] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardholderAuthentication] with a well-typed
         * [CardholderAuthentication] value instead. This method is primarily for setting the field
         * to an undocumented or not yet supported value.
         */
        fun cardholderAuthentication(
            cardholderAuthentication: JsonField<CardholderAuthentication>
        ) = apply { this.cardholderAuthentication = cardholderAuthentication }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /**
         * Sets [Builder.created] to an arbitrary JSON value.
         *
         * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun financialAccountToken(financialAccountToken: String?) =
            financialAccountToken(JsonField.ofNullable(financialAccountToken))

        /**
         * Alias for calling [Builder.financialAccountToken] with
         * `financialAccountToken.orElse(null)`.
         */
        fun financialAccountToken(financialAccountToken: Optional<String>) =
            financialAccountToken(financialAccountToken.getOrNull())

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        /**
         * Sets [Builder.merchant] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchant] with a well-typed [Merchant] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /** Analogous to the 'amount', but in the merchant currency. */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: Long?) =
            merchantAmount(JsonField.ofNullable(merchantAmount))

        /**
         * Alias for [Builder.merchantAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: Long) = merchantAmount(merchantAmount as Long?)

        /** Alias for calling [Builder.merchantAmount] with `merchantAmount.orElse(null)`. */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: Optional<Long>) =
            merchantAmount(merchantAmount.getOrNull())

        /**
         * Sets [Builder.merchantAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
            this.merchantAmount = merchantAmount
        }

        /** Analogous to the 'authorization_amount', but in the merchant currency. */
        @Deprecated("deprecated")
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: Long?) =
            merchantAuthorizationAmount(JsonField.ofNullable(merchantAuthorizationAmount))

        /**
         * Alias for [Builder.merchantAuthorizationAmount].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        @Deprecated("deprecated")
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: Long) =
            merchantAuthorizationAmount(merchantAuthorizationAmount as Long?)

        /**
         * Alias for calling [Builder.merchantAuthorizationAmount] with
         * `merchantAuthorizationAmount.orElse(null)`.
         */
        @Deprecated("deprecated")
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: Optional<Long>) =
            merchantAuthorizationAmount(merchantAuthorizationAmount.getOrNull())

        /**
         * Sets [Builder.merchantAuthorizationAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantAuthorizationAmount] with a well-typed [Long]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        @Deprecated("deprecated")
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: JsonField<Long>) = apply {
            this.merchantAuthorizationAmount = merchantAuthorizationAmount
        }

        /** 3-character alphabetic ISO 4217 code for the local currency of the transaction. */
        @Deprecated("deprecated")
        fun merchantCurrency(merchantCurrency: String) =
            merchantCurrency(JsonField.of(merchantCurrency))

        /**
         * Sets [Builder.merchantCurrency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.merchantCurrency] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        @Deprecated("deprecated")
        fun merchantCurrency(merchantCurrency: JsonField<String>) = apply {
            this.merchantCurrency = merchantCurrency
        }

        /**
         * Card network of the authorization. Value is `UNKNOWN` when Lithic cannot determine the
         * network code from the upstream provider.
         */
        fun network(network: Network?) = network(JsonField.ofNullable(network))

        /** Alias for calling [Builder.network] with `network.orElse(null)`. */
        fun network(network: Optional<Network>) = network(network.getOrNull())

        /**
         * Sets [Builder.network] to an arbitrary JSON value.
         *
         * You should usually call [Builder.network] with a well-typed [Network] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         */
        fun networkRiskScore(networkRiskScore: Long?) =
            networkRiskScore(JsonField.ofNullable(networkRiskScore))

        /**
         * Alias for [Builder.networkRiskScore].
         *
         * This unboxed primitive overload exists for backwards compatibility.
         */
        fun networkRiskScore(networkRiskScore: Long) = networkRiskScore(networkRiskScore as Long?)

        /** Alias for calling [Builder.networkRiskScore] with `networkRiskScore.orElse(null)`. */
        fun networkRiskScore(networkRiskScore: Optional<Long>) =
            networkRiskScore(networkRiskScore.getOrNull())

        /**
         * Sets [Builder.networkRiskScore] to an arbitrary JSON value.
         *
         * You should usually call [Builder.networkRiskScore] with a well-typed [Long] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
            this.networkRiskScore = networkRiskScore
        }

        fun pos(pos: Pos) = pos(JsonField.of(pos))

        /**
         * Sets [Builder.pos] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pos] with a well-typed [Pos] value instead. This method
         * is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun pos(pos: JsonField<Pos>) = apply { this.pos = pos }

        fun result(result: DeclineResult) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [DeclineResult] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun result(result: JsonField<DeclineResult>) = apply { this.result = result }

        /** The settled amount of the transaction in the settlement currency. */
        @Deprecated("deprecated")
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Sets [Builder.settledAmount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.settledAmount] with a well-typed [Long] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        @Deprecated("deprecated")
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /** Status of the transaction. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun tokenInfo(tokenInfo: TokenInfo?) = tokenInfo(JsonField.ofNullable(tokenInfo))

        /** Alias for calling [Builder.tokenInfo] with `tokenInfo.orElse(null)`. */
        fun tokenInfo(tokenInfo: Optional<TokenInfo>) = tokenInfo(tokenInfo.getOrNull())

        /**
         * Sets [Builder.tokenInfo] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenInfo] with a well-typed [TokenInfo] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun tokenInfo(tokenInfo: JsonField<TokenInfo>) = apply { this.tokenInfo = tokenInfo }

        /** Date and time when the transaction last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /**
         * Sets [Builder.updated] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updated] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun events(events: List<TransactionEvent>) = events(JsonField.of(events))

        /**
         * Sets [Builder.events] to an arbitrary JSON value.
         *
         * You should usually call [Builder.events] with a well-typed `List<TransactionEvent>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun events(events: JsonField<List<TransactionEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        /**
         * Adds a single [TransactionEvent] to [events].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addEvent(event: TransactionEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).also {
                    checkKnown("events", it).add(event)
                }
        }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalProperty)
        }

        /**
         * Returns an immutable instance of [Transaction].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .accountToken()
         * .acquirerFee()
         * .acquirerReferenceNumber()
         * .amount()
         * .amounts()
         * .authorizationAmount()
         * .authorizationCode()
         * .avs()
         * .cardToken()
         * .cardholderAuthentication()
         * .created()
         * .financialAccountToken()
         * .merchant()
         * .merchantAmount()
         * .merchantAuthorizationAmount()
         * .merchantCurrency()
         * .network()
         * .networkRiskScore()
         * .pos()
         * .result()
         * .settledAmount()
         * .status()
         * .tokenInfo()
         * .updated()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): Transaction =
            Transaction(
                checkRequired("token", token),
                checkRequired("accountToken", accountToken),
                checkRequired("acquirerFee", acquirerFee),
                checkRequired("acquirerReferenceNumber", acquirerReferenceNumber),
                checkRequired("amount", amount),
                checkRequired("amounts", amounts),
                checkRequired("authorizationAmount", authorizationAmount),
                checkRequired("authorizationCode", authorizationCode),
                checkRequired("avs", avs),
                checkRequired("cardToken", cardToken),
                checkRequired("cardholderAuthentication", cardholderAuthentication),
                checkRequired("created", created),
                checkRequired("financialAccountToken", financialAccountToken),
                checkRequired("merchant", merchant),
                checkRequired("merchantAmount", merchantAmount),
                checkRequired("merchantAuthorizationAmount", merchantAuthorizationAmount),
                checkRequired("merchantCurrency", merchantCurrency),
                checkRequired("network", network),
                checkRequired("networkRiskScore", networkRiskScore),
                checkRequired("pos", pos),
                checkRequired("result", result),
                checkRequired("settledAmount", settledAmount),
                checkRequired("status", status),
                checkRequired("tokenInfo", tokenInfo),
                checkRequired("updated", updated),
                (events ?: JsonMissing.of()).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): Transaction = apply {
        if (validated) {
            return@apply
        }

        token()
        accountToken()
        acquirerFee()
        acquirerReferenceNumber()
        amount()
        amounts().validate()
        authorizationAmount()
        authorizationCode()
        avs().ifPresent { it.validate() }
        cardToken()
        cardholderAuthentication().ifPresent { it.validate() }
        created()
        financialAccountToken()
        merchant().validate()
        merchantAmount()
        merchantAuthorizationAmount()
        merchantCurrency()
        network().ifPresent { it.validate() }
        networkRiskScore()
        pos().validate()
        result().validate()
        settledAmount()
        status().validate()
        tokenInfo().ifPresent { it.validate() }
        updated()
        events().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: LithicInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (if (token.asKnown().isPresent) 1 else 0) +
            (if (accountToken.asKnown().isPresent) 1 else 0) +
            (if (acquirerFee.asKnown().isPresent) 1 else 0) +
            (if (acquirerReferenceNumber.asKnown().isPresent) 1 else 0) +
            (if (amount.asKnown().isPresent) 1 else 0) +
            (amounts.asKnown().getOrNull()?.validity() ?: 0) +
            (if (authorizationAmount.asKnown().isPresent) 1 else 0) +
            (if (authorizationCode.asKnown().isPresent) 1 else 0) +
            (avs.asKnown().getOrNull()?.validity() ?: 0) +
            (if (cardToken.asKnown().isPresent) 1 else 0) +
            (cardholderAuthentication.asKnown().getOrNull()?.validity() ?: 0) +
            (if (created.asKnown().isPresent) 1 else 0) +
            (if (financialAccountToken.asKnown().isPresent) 1 else 0) +
            (merchant.asKnown().getOrNull()?.validity() ?: 0) +
            (if (merchantAmount.asKnown().isPresent) 1 else 0) +
            (if (merchantAuthorizationAmount.asKnown().isPresent) 1 else 0) +
            (if (merchantCurrency.asKnown().isPresent) 1 else 0) +
            (network.asKnown().getOrNull()?.validity() ?: 0) +
            (if (networkRiskScore.asKnown().isPresent) 1 else 0) +
            (pos.asKnown().getOrNull()?.validity() ?: 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0) +
            (if (settledAmount.asKnown().isPresent) 1 else 0) +
            (status.asKnown().getOrNull()?.validity() ?: 0) +
            (tokenInfo.asKnown().getOrNull()?.validity() ?: 0) +
            (if (updated.asKnown().isPresent) 1 else 0) +
            (events.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0)

    class TransactionAmounts
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val cardholder: JsonField<Cardholder>,
        private val hold: JsonField<Hold>,
        private val merchant: JsonField<Merchant>,
        private val settlement: JsonField<Settlement>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("cardholder")
            @ExcludeMissing
            cardholder: JsonField<Cardholder> = JsonMissing.of(),
            @JsonProperty("hold") @ExcludeMissing hold: JsonField<Hold> = JsonMissing.of(),
            @JsonProperty("merchant")
            @ExcludeMissing
            merchant: JsonField<Merchant> = JsonMissing.of(),
            @JsonProperty("settlement")
            @ExcludeMissing
            settlement: JsonField<Settlement> = JsonMissing.of(),
        ) : this(cardholder, hold, merchant, settlement, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun hold(): Hold = hold.getRequired("hold")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun merchant(): Merchant = merchant.getRequired("merchant")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun settlement(): Settlement = settlement.getRequired("settlement")

        /**
         * Returns the raw JSON value of [cardholder].
         *
         * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("cardholder")
        @ExcludeMissing
        fun _cardholder(): JsonField<Cardholder> = cardholder

        /**
         * Returns the raw JSON value of [hold].
         *
         * Unlike [hold], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("hold") @ExcludeMissing fun _hold(): JsonField<Hold> = hold

        /**
         * Returns the raw JSON value of [merchant].
         *
         * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

        /**
         * Returns the raw JSON value of [settlement].
         *
         * Unlike [settlement], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("settlement")
        @ExcludeMissing
        fun _settlement(): JsonField<Settlement> = settlement

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TransactionAmounts].
             *
             * The following fields are required:
             * ```java
             * .cardholder()
             * .hold()
             * .merchant()
             * .settlement()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransactionAmounts]. */
        class Builder internal constructor() {

            private var cardholder: JsonField<Cardholder>? = null
            private var hold: JsonField<Hold>? = null
            private var merchant: JsonField<Merchant>? = null
            private var settlement: JsonField<Settlement>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionAmounts: TransactionAmounts) = apply {
                cardholder = transactionAmounts.cardholder
                hold = transactionAmounts.hold
                merchant = transactionAmounts.merchant
                settlement = transactionAmounts.settlement
                additionalProperties = transactionAmounts.additionalProperties.toMutableMap()
            }

            fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

            /**
             * Sets [Builder.cardholder] to an arbitrary JSON value.
             *
             * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                this.cardholder = cardholder
            }

            fun hold(hold: Hold) = hold(JsonField.of(hold))

            /**
             * Sets [Builder.hold] to an arbitrary JSON value.
             *
             * You should usually call [Builder.hold] with a well-typed [Hold] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun hold(hold: JsonField<Hold>) = apply { this.hold = hold }

            fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

            /**
             * Sets [Builder.merchant] to an arbitrary JSON value.
             *
             * You should usually call [Builder.merchant] with a well-typed [Merchant] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

            fun settlement(settlement: Settlement) = settlement(JsonField.of(settlement))

            /**
             * Sets [Builder.settlement] to an arbitrary JSON value.
             *
             * You should usually call [Builder.settlement] with a well-typed [Settlement] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun settlement(settlement: JsonField<Settlement>) = apply {
                this.settlement = settlement
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [TransactionAmounts].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .cardholder()
             * .hold()
             * .merchant()
             * .settlement()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TransactionAmounts =
                TransactionAmounts(
                    checkRequired("cardholder", cardholder),
                    checkRequired("hold", hold),
                    checkRequired("merchant", merchant),
                    checkRequired("settlement", settlement),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TransactionAmounts = apply {
            if (validated) {
                return@apply
            }

            cardholder().validate()
            hold().validate()
            merchant().validate()
            settlement().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (cardholder.asKnown().getOrNull()?.validity() ?: 0) +
                (hold.asKnown().getOrNull()?.validity() ?: 0) +
                (merchant.asKnown().getOrNull()?.validity() ?: 0) +
                (settlement.asKnown().getOrNull()?.validity() ?: 0)

        class Cardholder
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val conversionRate: JsonField<String>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                conversionRate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, conversionRate, currency, mutableMapOf())

            /**
             * The estimated settled amount of the transaction in the cardholder billing currency.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The exchange rate used to convert the merchant amount to the cardholder billing
             * amount.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

            /**
             * 3-character alphabetic ISO 4217 currency
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [conversionRate].
             *
             * Unlike [conversionRate], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<String> = conversionRate

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Cardholder].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .conversionRate()
                 * .currency()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cardholder]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var conversionRate: JsonField<String>? = null
                private var currency: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardholder: Cardholder) = apply {
                    amount = cardholder.amount
                    conversionRate = cardholder.conversionRate
                    currency = cardholder.currency
                    additionalProperties = cardholder.additionalProperties.toMutableMap()
                }

                /**
                 * The estimated settled amount of the transaction in the cardholder billing
                 * currency.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The exchange rate used to convert the merchant amount to the cardholder billing
                 * amount.
                 */
                fun conversionRate(conversionRate: String) =
                    conversionRate(JsonField.of(conversionRate))

                /**
                 * Sets [Builder.conversionRate] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.conversionRate] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun conversionRate(conversionRate: JsonField<String>) = apply {
                    this.conversionRate = conversionRate
                }

                /** 3-character alphabetic ISO 4217 currency */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Cardholder].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .conversionRate()
                 * .currency()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Cardholder =
                    Cardholder(
                        checkRequired("amount", amount),
                        checkRequired("conversionRate", conversionRate),
                        checkRequired("currency", currency),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Cardholder = apply {
                if (validated) {
                    return@apply
                }

                amount()
                conversionRate()
                currency()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (conversionRate.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Cardholder &&
                    amount == other.amount &&
                    conversionRate == other.conversionRate &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, conversionRate, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cardholder{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
        }

        class Hold
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * The pending amount of the transaction in the anticipated settlement currency.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * 3-character alphabetic ISO 4217 currency
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Hold].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Hold]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(hold: Hold) = apply {
                    amount = hold.amount
                    currency = hold.currency
                    additionalProperties = hold.additionalProperties.toMutableMap()
                }

                /** The pending amount of the transaction in the anticipated settlement currency. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** 3-character alphabetic ISO 4217 currency */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Hold].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Hold =
                    Hold(
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Hold = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Hold &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Hold{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        class Merchant
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * The settled amount of the transaction in the merchant currency.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * 3-character alphabetic ISO 4217 currency
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Merchant].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Merchant]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(merchant: Merchant) = apply {
                    amount = merchant.amount
                    currency = merchant.currency
                    additionalProperties = merchant.additionalProperties.toMutableMap()
                }

                /** The settled amount of the transaction in the merchant currency. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** 3-character alphabetic ISO 4217 currency */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Merchant].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Merchant =
                    Merchant(
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Merchant = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Merchant &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Merchant{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        class Settlement
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                currency: JsonField<String> = JsonMissing.of(),
            ) : this(amount, currency, mutableMapOf())

            /**
             * The settled amount of the transaction in the settlement currency.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * 3-character alphabetic ISO 4217 currency
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun currency(): String = currency.getRequired("currency")

            /**
             * Returns the raw JSON value of [amount].
             *
             * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * Returns the raw JSON value of [currency].
             *
             * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<String> = currency

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [Settlement].
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Settlement]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(settlement: Settlement) = apply {
                    amount = settlement.amount
                    currency = settlement.currency
                    additionalProperties = settlement.additionalProperties.toMutableMap()
                }

                /** The settled amount of the transaction in the settlement currency. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * Sets [Builder.amount] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amount] with a well-typed [Long] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** 3-character alphabetic ISO 4217 currency */
                fun currency(currency: String) = currency(JsonField.of(currency))

                /**
                 * Sets [Builder.currency] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.currency] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [Settlement].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .amount()
                 * .currency()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Settlement =
                    Settlement(
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): Settlement = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (amount.asKnown().isPresent) 1 else 0) +
                    (if (currency.asKnown().isPresent) 1 else 0)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Settlement &&
                    amount == other.amount &&
                    currency == other.currency &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(amount, currency, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Settlement{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionAmounts &&
                cardholder == other.cardholder &&
                hold == other.hold &&
                merchant == other.merchant &&
                settlement == other.settlement &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(cardholder, hold, merchant, settlement, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionAmounts{cardholder=$cardholder, hold=$hold, merchant=$merchant, settlement=$settlement, additionalProperties=$additionalProperties}"
    }

    class Avs
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val address: JsonField<String>,
        private val zipcode: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address") @ExcludeMissing address: JsonField<String> = JsonMissing.of(),
            @JsonProperty("zipcode") @ExcludeMissing zipcode: JsonField<String> = JsonMissing.of(),
        ) : this(address, zipcode, mutableMapOf())

        /**
         * Cardholder address
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun address(): String = address.getRequired("address")

        /**
         * Cardholder ZIP code
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun zipcode(): String = zipcode.getRequired("zipcode")

        /**
         * Returns the raw JSON value of [address].
         *
         * Unlike [address], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /**
         * Returns the raw JSON value of [zipcode].
         *
         * Unlike [zipcode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Avs].
             *
             * The following fields are required:
             * ```java
             * .address()
             * .zipcode()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Avs]. */
        class Builder internal constructor() {

            private var address: JsonField<String>? = null
            private var zipcode: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(avs: Avs) = apply {
                address = avs.address
                zipcode = avs.zipcode
                additionalProperties = avs.additionalProperties.toMutableMap()
            }

            /** Cardholder address */
            fun address(address: String) = address(JsonField.of(address))

            /**
             * Sets [Builder.address] to an arbitrary JSON value.
             *
             * You should usually call [Builder.address] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Cardholder ZIP code */
            fun zipcode(zipcode: String) = zipcode(JsonField.of(zipcode))

            /**
             * Sets [Builder.zipcode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.zipcode] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun zipcode(zipcode: JsonField<String>) = apply { this.zipcode = zipcode }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Avs].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .address()
             * .zipcode()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Avs =
                Avs(
                    checkRequired("address", address),
                    checkRequired("zipcode", zipcode),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Avs = apply {
            if (validated) {
                return@apply
            }

            address()
            zipcode()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (address.asKnown().isPresent) 1 else 0) +
                (if (zipcode.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Avs &&
                address == other.address &&
                zipcode == other.zipcode &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(address, zipcode, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Avs{address=$address, zipcode=$zipcode, additionalProperties=$additionalProperties}"
    }

    /**
     * Card network of the authorization. Value is `UNKNOWN` when Lithic cannot determine the
     * network code from the upstream provider.
     */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val AMEX = of("AMEX")

            @JvmField val INTERLINK = of("INTERLINK")

            @JvmField val MAESTRO = of("MAESTRO")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA = of("VISA")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            AMEX,
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
            VISA,
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            AMEX,
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
            VISA,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AMEX -> Value.AMEX
                INTERLINK -> Value.INTERLINK
                MAESTRO -> Value.MAESTRO
                MASTERCARD -> Value.MASTERCARD
                UNKNOWN -> Value.UNKNOWN
                VISA -> Value.VISA
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AMEX -> Known.AMEX
                INTERLINK -> Known.INTERLINK
                MAESTRO -> Known.MAESTRO
                MASTERCARD -> Known.MASTERCARD
                UNKNOWN -> Known.UNKNOWN
                VISA -> Known.VISA
                else -> throw LithicInvalidDataException("Unknown Network: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Network = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Network && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Pos
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val entryMode: JsonField<PosEntryMode>,
        private val terminal: JsonField<PosTerminal>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("entry_mode")
            @ExcludeMissing
            entryMode: JsonField<PosEntryMode> = JsonMissing.of(),
            @JsonProperty("terminal")
            @ExcludeMissing
            terminal: JsonField<PosTerminal> = JsonMissing.of(),
        ) : this(entryMode, terminal, mutableMapOf())

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun entryMode(): PosEntryMode = entryMode.getRequired("entry_mode")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun terminal(): PosTerminal = terminal.getRequired("terminal")

        /**
         * Returns the raw JSON value of [entryMode].
         *
         * Unlike [entryMode], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("entry_mode")
        @ExcludeMissing
        fun _entryMode(): JsonField<PosEntryMode> = entryMode

        /**
         * Returns the raw JSON value of [terminal].
         *
         * Unlike [terminal], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("terminal") @ExcludeMissing fun _terminal(): JsonField<PosTerminal> = terminal

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Pos].
             *
             * The following fields are required:
             * ```java
             * .entryMode()
             * .terminal()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Pos]. */
        class Builder internal constructor() {

            private var entryMode: JsonField<PosEntryMode>? = null
            private var terminal: JsonField<PosTerminal>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pos: Pos) = apply {
                entryMode = pos.entryMode
                terminal = pos.terminal
                additionalProperties = pos.additionalProperties.toMutableMap()
            }

            fun entryMode(entryMode: PosEntryMode) = entryMode(JsonField.of(entryMode))

            /**
             * Sets [Builder.entryMode] to an arbitrary JSON value.
             *
             * You should usually call [Builder.entryMode] with a well-typed [PosEntryMode] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun entryMode(entryMode: JsonField<PosEntryMode>) = apply { this.entryMode = entryMode }

            fun terminal(terminal: PosTerminal) = terminal(JsonField.of(terminal))

            /**
             * Sets [Builder.terminal] to an arbitrary JSON value.
             *
             * You should usually call [Builder.terminal] with a well-typed [PosTerminal] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun terminal(terminal: JsonField<PosTerminal>) = apply { this.terminal = terminal }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [Pos].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .entryMode()
             * .terminal()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Pos =
                Pos(
                    checkRequired("entryMode", entryMode),
                    checkRequired("terminal", terminal),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Pos = apply {
            if (validated) {
                return@apply
            }

            entryMode().validate()
            terminal().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (entryMode.asKnown().getOrNull()?.validity() ?: 0) +
                (terminal.asKnown().getOrNull()?.validity() ?: 0)

        class PosEntryMode
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val card: JsonField<Card>,
            private val cardholder: JsonField<Cardholder>,
            private val pan: JsonField<Pan>,
            private val pinEntered: JsonField<Boolean>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("card") @ExcludeMissing card: JsonField<Card> = JsonMissing.of(),
                @JsonProperty("cardholder")
                @ExcludeMissing
                cardholder: JsonField<Cardholder> = JsonMissing.of(),
                @JsonProperty("pan") @ExcludeMissing pan: JsonField<Pan> = JsonMissing.of(),
                @JsonProperty("pin_entered")
                @ExcludeMissing
                pinEntered: JsonField<Boolean> = JsonMissing.of(),
            ) : this(card, cardholder, pan, pinEntered, mutableMapOf())

            /**
             * Card presence indicator
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun card(): Card = card.getRequired("card")

            /**
             * Cardholder presence indicator
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

            /**
             * Method of entry for the PAN
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pan(): Pan = pan.getRequired("pan")

            /**
             * Indicates whether the cardholder entered the PIN. True if the PIN was entered.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pinEntered(): Boolean = pinEntered.getRequired("pin_entered")

            /**
             * Returns the raw JSON value of [card].
             *
             * Unlike [card], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("card") @ExcludeMissing fun _card(): JsonField<Card> = card

            /**
             * Returns the raw JSON value of [cardholder].
             *
             * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cardholder")
            @ExcludeMissing
            fun _cardholder(): JsonField<Cardholder> = cardholder

            /**
             * Returns the raw JSON value of [pan].
             *
             * Unlike [pan], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<Pan> = pan

            /**
             * Returns the raw JSON value of [pinEntered].
             *
             * Unlike [pinEntered], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pin_entered")
            @ExcludeMissing
            fun _pinEntered(): JsonField<Boolean> = pinEntered

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PosEntryMode].
                 *
                 * The following fields are required:
                 * ```java
                 * .card()
                 * .cardholder()
                 * .pan()
                 * .pinEntered()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PosEntryMode]. */
            class Builder internal constructor() {

                private var card: JsonField<Card>? = null
                private var cardholder: JsonField<Cardholder>? = null
                private var pan: JsonField<Pan>? = null
                private var pinEntered: JsonField<Boolean>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(posEntryMode: PosEntryMode) = apply {
                    card = posEntryMode.card
                    cardholder = posEntryMode.cardholder
                    pan = posEntryMode.pan
                    pinEntered = posEntryMode.pinEntered
                    additionalProperties = posEntryMode.additionalProperties.toMutableMap()
                }

                /** Card presence indicator */
                fun card(card: Card) = card(JsonField.of(card))

                /**
                 * Sets [Builder.card] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.card] with a well-typed [Card] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun card(card: JsonField<Card>) = apply { this.card = card }

                /** Cardholder presence indicator */
                fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

                /**
                 * Sets [Builder.cardholder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                    this.cardholder = cardholder
                }

                /** Method of entry for the PAN */
                fun pan(pan: Pan) = pan(JsonField.of(pan))

                /**
                 * Sets [Builder.pan] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pan] with a well-typed [Pan] value instead. This
                 * method is primarily for setting the field to an undocumented or not yet supported
                 * value.
                 */
                fun pan(pan: JsonField<Pan>) = apply { this.pan = pan }

                /**
                 * Indicates whether the cardholder entered the PIN. True if the PIN was entered.
                 */
                fun pinEntered(pinEntered: Boolean) = pinEntered(JsonField.of(pinEntered))

                /**
                 * Sets [Builder.pinEntered] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pinEntered] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun pinEntered(pinEntered: JsonField<Boolean>) = apply {
                    this.pinEntered = pinEntered
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PosEntryMode].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .card()
                 * .cardholder()
                 * .pan()
                 * .pinEntered()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PosEntryMode =
                    PosEntryMode(
                        checkRequired("card", card),
                        checkRequired("cardholder", cardholder),
                        checkRequired("pan", pan),
                        checkRequired("pinEntered", pinEntered),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PosEntryMode = apply {
                if (validated) {
                    return@apply
                }

                card().validate()
                cardholder().validate()
                pan().validate()
                pinEntered()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (card.asKnown().getOrNull()?.validity() ?: 0) +
                    (cardholder.asKnown().getOrNull()?.validity() ?: 0) +
                    (pan.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (pinEntered.asKnown().isPresent) 1 else 0)

            /** Card presence indicator */
            class Card @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NOT_PRESENT = of("NOT_PRESENT")

                    @JvmField val PREAUTHORIZED = of("PREAUTHORIZED")

                    @JvmField val PRESENT = of("PRESENT")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Card(JsonField.of(value))
                }

                /** An enum containing [Card]'s known values. */
                enum class Known {
                    NOT_PRESENT,
                    PREAUTHORIZED,
                    PRESENT,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Card]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Card] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    NOT_PRESENT,
                    PREAUTHORIZED,
                    PRESENT,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Card] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        NOT_PRESENT -> Value.NOT_PRESENT
                        PREAUTHORIZED -> Value.PREAUTHORIZED
                        PRESENT -> Value.PRESENT
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        NOT_PRESENT -> Known.NOT_PRESENT
                        PREAUTHORIZED -> Known.PREAUTHORIZED
                        PRESENT -> Known.PRESENT
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Card: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Card = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Card && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Cardholder presence indicator */
            class Cardholder
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val DEFERRED_BILLING = of("DEFERRED_BILLING")

                    @JvmField val ELECTRONIC_ORDER = of("ELECTRONIC_ORDER")

                    @JvmField val INSTALLMENT = of("INSTALLMENT")

                    @JvmField val MAIL_ORDER = of("MAIL_ORDER")

                    @JvmField val NOT_PRESENT = of("NOT_PRESENT")

                    @JvmField val PREAUTHORIZED = of("PREAUTHORIZED")

                    @JvmField val PRESENT = of("PRESENT")

                    @JvmField val REOCCURRING = of("REOCCURRING")

                    @JvmField val TELEPHONE_ORDER = of("TELEPHONE_ORDER")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Cardholder(JsonField.of(value))
                }

                /** An enum containing [Cardholder]'s known values. */
                enum class Known {
                    DEFERRED_BILLING,
                    ELECTRONIC_ORDER,
                    INSTALLMENT,
                    MAIL_ORDER,
                    NOT_PRESENT,
                    PREAUTHORIZED,
                    PRESENT,
                    REOCCURRING,
                    TELEPHONE_ORDER,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Cardholder]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Cardholder] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    DEFERRED_BILLING,
                    ELECTRONIC_ORDER,
                    INSTALLMENT,
                    MAIL_ORDER,
                    NOT_PRESENT,
                    PREAUTHORIZED,
                    PRESENT,
                    REOCCURRING,
                    TELEPHONE_ORDER,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Cardholder] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        DEFERRED_BILLING -> Value.DEFERRED_BILLING
                        ELECTRONIC_ORDER -> Value.ELECTRONIC_ORDER
                        INSTALLMENT -> Value.INSTALLMENT
                        MAIL_ORDER -> Value.MAIL_ORDER
                        NOT_PRESENT -> Value.NOT_PRESENT
                        PREAUTHORIZED -> Value.PREAUTHORIZED
                        PRESENT -> Value.PRESENT
                        REOCCURRING -> Value.REOCCURRING
                        TELEPHONE_ORDER -> Value.TELEPHONE_ORDER
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        DEFERRED_BILLING -> Known.DEFERRED_BILLING
                        ELECTRONIC_ORDER -> Known.ELECTRONIC_ORDER
                        INSTALLMENT -> Known.INSTALLMENT
                        MAIL_ORDER -> Known.MAIL_ORDER
                        NOT_PRESENT -> Known.NOT_PRESENT
                        PREAUTHORIZED -> Known.PREAUTHORIZED
                        PRESENT -> Known.PRESENT
                        REOCCURRING -> Known.REOCCURRING
                        TELEPHONE_ORDER -> Known.TELEPHONE_ORDER
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Cardholder: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Cardholder = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cardholder && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Method of entry for the PAN */
            class Pan @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val AUTO_ENTRY = of("AUTO_ENTRY")

                    @JvmField val BAR_CODE = of("BAR_CODE")

                    @JvmField val CONTACTLESS = of("CONTACTLESS")

                    @JvmField val CREDENTIAL_ON_FILE = of("CREDENTIAL_ON_FILE")

                    @JvmField val ECOMMERCE = of("ECOMMERCE")

                    @JvmField val ERROR_KEYED = of("ERROR_KEYED")

                    @JvmField val ERROR_MAGNETIC_STRIPE = of("ERROR_MAGNETIC_STRIPE")

                    @JvmField val ICC = of("ICC")

                    @JvmField val KEY_ENTERED = of("KEY_ENTERED")

                    @JvmField val MAGNETIC_STRIPE = of("MAGNETIC_STRIPE")

                    @JvmField val MANUAL = of("MANUAL")

                    @JvmField val OCR = of("OCR")

                    @JvmField val SECURE_CARDLESS = of("SECURE_CARDLESS")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmField val UNSPECIFIED = of("UNSPECIFIED")

                    @JvmStatic fun of(value: String) = Pan(JsonField.of(value))
                }

                /** An enum containing [Pan]'s known values. */
                enum class Known {
                    AUTO_ENTRY,
                    BAR_CODE,
                    CONTACTLESS,
                    CREDENTIAL_ON_FILE,
                    ECOMMERCE,
                    ERROR_KEYED,
                    ERROR_MAGNETIC_STRIPE,
                    ICC,
                    KEY_ENTERED,
                    MAGNETIC_STRIPE,
                    MANUAL,
                    OCR,
                    SECURE_CARDLESS,
                    UNKNOWN,
                    UNSPECIFIED,
                }

                /**
                 * An enum containing [Pan]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Pan] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    AUTO_ENTRY,
                    BAR_CODE,
                    CONTACTLESS,
                    CREDENTIAL_ON_FILE,
                    ECOMMERCE,
                    ERROR_KEYED,
                    ERROR_MAGNETIC_STRIPE,
                    ICC,
                    KEY_ENTERED,
                    MAGNETIC_STRIPE,
                    MANUAL,
                    OCR,
                    SECURE_CARDLESS,
                    UNKNOWN,
                    UNSPECIFIED,
                    /**
                     * An enum member indicating that [Pan] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        AUTO_ENTRY -> Value.AUTO_ENTRY
                        BAR_CODE -> Value.BAR_CODE
                        CONTACTLESS -> Value.CONTACTLESS
                        CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
                        ECOMMERCE -> Value.ECOMMERCE
                        ERROR_KEYED -> Value.ERROR_KEYED
                        ERROR_MAGNETIC_STRIPE -> Value.ERROR_MAGNETIC_STRIPE
                        ICC -> Value.ICC
                        KEY_ENTERED -> Value.KEY_ENTERED
                        MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
                        MANUAL -> Value.MANUAL
                        OCR -> Value.OCR
                        SECURE_CARDLESS -> Value.SECURE_CARDLESS
                        UNKNOWN -> Value.UNKNOWN
                        UNSPECIFIED -> Value.UNSPECIFIED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        AUTO_ENTRY -> Known.AUTO_ENTRY
                        BAR_CODE -> Known.BAR_CODE
                        CONTACTLESS -> Known.CONTACTLESS
                        CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
                        ECOMMERCE -> Known.ECOMMERCE
                        ERROR_KEYED -> Known.ERROR_KEYED
                        ERROR_MAGNETIC_STRIPE -> Known.ERROR_MAGNETIC_STRIPE
                        ICC -> Known.ICC
                        KEY_ENTERED -> Known.KEY_ENTERED
                        MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
                        MANUAL -> Known.MANUAL
                        OCR -> Known.OCR
                        SECURE_CARDLESS -> Known.SECURE_CARDLESS
                        UNKNOWN -> Known.UNKNOWN
                        UNSPECIFIED -> Known.UNSPECIFIED
                        else -> throw LithicInvalidDataException("Unknown Pan: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Pan = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Pan && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PosEntryMode &&
                    card == other.card &&
                    cardholder == other.cardholder &&
                    pan == other.pan &&
                    pinEntered == other.pinEntered &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(card, cardholder, pan, pinEntered, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PosEntryMode{card=$card, cardholder=$cardholder, pan=$pan, pinEntered=$pinEntered, additionalProperties=$additionalProperties}"
        }

        class PosTerminal
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val attended: JsonField<Boolean>,
            private val cardRetentionCapable: JsonField<Boolean>,
            private val onPremise: JsonField<Boolean>,
            private val operator: JsonField<Operator>,
            private val partialApprovalCapable: JsonField<Boolean>,
            private val pinCapability: JsonField<PinCapability>,
            private val type: JsonField<Type>,
            private val acceptorTerminalId: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("attended")
                @ExcludeMissing
                attended: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("card_retention_capable")
                @ExcludeMissing
                cardRetentionCapable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("on_premise")
                @ExcludeMissing
                onPremise: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("operator")
                @ExcludeMissing
                operator: JsonField<Operator> = JsonMissing.of(),
                @JsonProperty("partial_approval_capable")
                @ExcludeMissing
                partialApprovalCapable: JsonField<Boolean> = JsonMissing.of(),
                @JsonProperty("pin_capability")
                @ExcludeMissing
                pinCapability: JsonField<PinCapability> = JsonMissing.of(),
                @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
                @JsonProperty("acceptor_terminal_id")
                @ExcludeMissing
                acceptorTerminalId: JsonField<String> = JsonMissing.of(),
            ) : this(
                attended,
                cardRetentionCapable,
                onPremise,
                operator,
                partialApprovalCapable,
                pinCapability,
                type,
                acceptorTerminalId,
                mutableMapOf(),
            )

            /**
             * True if a clerk is present at the sale.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun attended(): Boolean = attended.getRequired("attended")

            /**
             * True if the terminal is capable of retaining the card.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardRetentionCapable(): Boolean =
                cardRetentionCapable.getRequired("card_retention_capable")

            /**
             * True if the sale was made at the place of business (vs. mobile).
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun onPremise(): Boolean = onPremise.getRequired("on_premise")

            /**
             * The person that is designated to swipe the card
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * True if the terminal is capable of partial approval. Partial approval is when part of
             * a transaction is approved and another payment must be used for the remainder. Example
             * scenario: A $40 transaction is attempted on a prepaid card with a $25 balance. If
             * partial approval is enabled, $25 can be authorized, at which point the POS will
             * prompt the user for an additional payment of $15.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun partialApprovalCapable(): Boolean =
                partialApprovalCapable.getRequired("partial_approval_capable")

            /**
             * Status of whether the POS is able to accept PINs
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun pinCapability(): PinCapability = pinCapability.getRequired("pin_capability")

            /**
             * POS Type
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun type(): Type = type.getRequired("type")

            /**
             * Uniquely identifies a terminal at the card acceptor location of acquiring
             * institutions or merchant POS Systems
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun acceptorTerminalId(): Optional<String> =
                acceptorTerminalId.getOptional("acceptor_terminal_id")

            /**
             * Returns the raw JSON value of [attended].
             *
             * Unlike [attended], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("attended") @ExcludeMissing fun _attended(): JsonField<Boolean> = attended

            /**
             * Returns the raw JSON value of [cardRetentionCapable].
             *
             * Unlike [cardRetentionCapable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("card_retention_capable")
            @ExcludeMissing
            fun _cardRetentionCapable(): JsonField<Boolean> = cardRetentionCapable

            /**
             * Returns the raw JSON value of [onPremise].
             *
             * Unlike [onPremise], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("on_premise")
            @ExcludeMissing
            fun _onPremise(): JsonField<Boolean> = onPremise

            /**
             * Returns the raw JSON value of [operator].
             *
             * Unlike [operator], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * Returns the raw JSON value of [partialApprovalCapable].
             *
             * Unlike [partialApprovalCapable], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("partial_approval_capable")
            @ExcludeMissing
            fun _partialApprovalCapable(): JsonField<Boolean> = partialApprovalCapable

            /**
             * Returns the raw JSON value of [pinCapability].
             *
             * Unlike [pinCapability], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("pin_capability")
            @ExcludeMissing
            fun _pinCapability(): JsonField<PinCapability> = pinCapability

            /**
             * Returns the raw JSON value of [type].
             *
             * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /**
             * Returns the raw JSON value of [acceptorTerminalId].
             *
             * Unlike [acceptorTerminalId], this method doesn't throw if the JSON field has an
             * unexpected type.
             */
            @JsonProperty("acceptor_terminal_id")
            @ExcludeMissing
            fun _acceptorTerminalId(): JsonField<String> = acceptorTerminalId

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [PosTerminal].
                 *
                 * The following fields are required:
                 * ```java
                 * .attended()
                 * .cardRetentionCapable()
                 * .onPremise()
                 * .operator()
                 * .partialApprovalCapable()
                 * .pinCapability()
                 * .type()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [PosTerminal]. */
            class Builder internal constructor() {

                private var attended: JsonField<Boolean>? = null
                private var cardRetentionCapable: JsonField<Boolean>? = null
                private var onPremise: JsonField<Boolean>? = null
                private var operator: JsonField<Operator>? = null
                private var partialApprovalCapable: JsonField<Boolean>? = null
                private var pinCapability: JsonField<PinCapability>? = null
                private var type: JsonField<Type>? = null
                private var acceptorTerminalId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(posTerminal: PosTerminal) = apply {
                    attended = posTerminal.attended
                    cardRetentionCapable = posTerminal.cardRetentionCapable
                    onPremise = posTerminal.onPremise
                    operator = posTerminal.operator
                    partialApprovalCapable = posTerminal.partialApprovalCapable
                    pinCapability = posTerminal.pinCapability
                    type = posTerminal.type
                    acceptorTerminalId = posTerminal.acceptorTerminalId
                    additionalProperties = posTerminal.additionalProperties.toMutableMap()
                }

                /** True if a clerk is present at the sale. */
                fun attended(attended: Boolean) = attended(JsonField.of(attended))

                /**
                 * Sets [Builder.attended] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.attended] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun attended(attended: JsonField<Boolean>) = apply { this.attended = attended }

                /** True if the terminal is capable of retaining the card. */
                fun cardRetentionCapable(cardRetentionCapable: Boolean) =
                    cardRetentionCapable(JsonField.of(cardRetentionCapable))

                /**
                 * Sets [Builder.cardRetentionCapable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardRetentionCapable] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun cardRetentionCapable(cardRetentionCapable: JsonField<Boolean>) = apply {
                    this.cardRetentionCapable = cardRetentionCapable
                }

                /** True if the sale was made at the place of business (vs. mobile). */
                fun onPremise(onPremise: Boolean) = onPremise(JsonField.of(onPremise))

                /**
                 * Sets [Builder.onPremise] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.onPremise] with a well-typed [Boolean] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun onPremise(onPremise: JsonField<Boolean>) = apply { this.onPremise = onPremise }

                /** The person that is designated to swipe the card */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /**
                 * Sets [Builder.operator] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.operator] with a well-typed [Operator] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                /**
                 * True if the terminal is capable of partial approval. Partial approval is when
                 * part of a transaction is approved and another payment must be used for the
                 * remainder. Example scenario: A $40 transaction is attempted on a prepaid card
                 * with a $25 balance. If partial approval is enabled, $25 can be authorized, at
                 * which point the POS will prompt the user for an additional payment of $15.
                 */
                fun partialApprovalCapable(partialApprovalCapable: Boolean) =
                    partialApprovalCapable(JsonField.of(partialApprovalCapable))

                /**
                 * Sets [Builder.partialApprovalCapable] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.partialApprovalCapable] with a well-typed
                 * [Boolean] value instead. This method is primarily for setting the field to an
                 * undocumented or not yet supported value.
                 */
                fun partialApprovalCapable(partialApprovalCapable: JsonField<Boolean>) = apply {
                    this.partialApprovalCapable = partialApprovalCapable
                }

                /** Status of whether the POS is able to accept PINs */
                fun pinCapability(pinCapability: PinCapability) =
                    pinCapability(JsonField.of(pinCapability))

                /**
                 * Sets [Builder.pinCapability] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.pinCapability] with a well-typed [PinCapability]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun pinCapability(pinCapability: JsonField<PinCapability>) = apply {
                    this.pinCapability = pinCapability
                }

                /** POS Type */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * Sets [Builder.type] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.type] with a well-typed [Type] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /**
                 * Uniquely identifies a terminal at the card acceptor location of acquiring
                 * institutions or merchant POS Systems
                 */
                fun acceptorTerminalId(acceptorTerminalId: String?) =
                    acceptorTerminalId(JsonField.ofNullable(acceptorTerminalId))

                /**
                 * Alias for calling [Builder.acceptorTerminalId] with
                 * `acceptorTerminalId.orElse(null)`.
                 */
                fun acceptorTerminalId(acceptorTerminalId: Optional<String>) =
                    acceptorTerminalId(acceptorTerminalId.getOrNull())

                /**
                 * Sets [Builder.acceptorTerminalId] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.acceptorTerminalId] with a well-typed [String]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun acceptorTerminalId(acceptorTerminalId: JsonField<String>) = apply {
                    this.acceptorTerminalId = acceptorTerminalId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [PosTerminal].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .attended()
                 * .cardRetentionCapable()
                 * .onPremise()
                 * .operator()
                 * .partialApprovalCapable()
                 * .pinCapability()
                 * .type()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): PosTerminal =
                    PosTerminal(
                        checkRequired("attended", attended),
                        checkRequired("cardRetentionCapable", cardRetentionCapable),
                        checkRequired("onPremise", onPremise),
                        checkRequired("operator", operator),
                        checkRequired("partialApprovalCapable", partialApprovalCapable),
                        checkRequired("pinCapability", pinCapability),
                        checkRequired("type", type),
                        acceptorTerminalId,
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): PosTerminal = apply {
                if (validated) {
                    return@apply
                }

                attended()
                cardRetentionCapable()
                onPremise()
                operator().validate()
                partialApprovalCapable()
                pinCapability().validate()
                type().validate()
                acceptorTerminalId()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (attended.asKnown().isPresent) 1 else 0) +
                    (if (cardRetentionCapable.asKnown().isPresent) 1 else 0) +
                    (if (onPremise.asKnown().isPresent) 1 else 0) +
                    (operator.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (partialApprovalCapable.asKnown().isPresent) 1 else 0) +
                    (pinCapability.asKnown().getOrNull()?.validity() ?: 0) +
                    (type.asKnown().getOrNull()?.validity() ?: 0) +
                    (if (acceptorTerminalId.asKnown().isPresent) 1 else 0)

            /** The person that is designated to swipe the card */
            class Operator @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ADMINISTRATIVE = of("ADMINISTRATIVE")

                    @JvmField val CARDHOLDER = of("CARDHOLDER")

                    @JvmField val CARD_ACCEPTOR = of("CARD_ACCEPTOR")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                /** An enum containing [Operator]'s known values. */
                enum class Known {
                    ADMINISTRATIVE,
                    CARDHOLDER,
                    CARD_ACCEPTOR,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Operator]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Operator] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ADMINISTRATIVE,
                    CARDHOLDER,
                    CARD_ACCEPTOR,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Operator] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ADMINISTRATIVE -> Value.ADMINISTRATIVE
                        CARDHOLDER -> Value.CARDHOLDER
                        CARD_ACCEPTOR -> Value.CARD_ACCEPTOR
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ADMINISTRATIVE -> Known.ADMINISTRATIVE
                        CARDHOLDER -> Known.CARDHOLDER
                        CARD_ACCEPTOR -> Known.CARD_ACCEPTOR
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Operator: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Operator = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Operator && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Status of whether the POS is able to accept PINs */
            class PinCapability
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CAPABLE = of("CAPABLE")

                    @JvmField val INOPERATIVE = of("INOPERATIVE")

                    @JvmField val NOT_CAPABLE = of("NOT_CAPABLE")

                    @JvmField val UNSPECIFIED = of("UNSPECIFIED")

                    @JvmStatic fun of(value: String) = PinCapability(JsonField.of(value))
                }

                /** An enum containing [PinCapability]'s known values. */
                enum class Known {
                    CAPABLE,
                    INOPERATIVE,
                    NOT_CAPABLE,
                    UNSPECIFIED,
                }

                /**
                 * An enum containing [PinCapability]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [PinCapability] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    CAPABLE,
                    INOPERATIVE,
                    NOT_CAPABLE,
                    UNSPECIFIED,
                    /**
                     * An enum member indicating that [PinCapability] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        CAPABLE -> Value.CAPABLE
                        INOPERATIVE -> Value.INOPERATIVE
                        NOT_CAPABLE -> Value.NOT_CAPABLE
                        UNSPECIFIED -> Value.UNSPECIFIED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        CAPABLE -> Known.CAPABLE
                        INOPERATIVE -> Known.INOPERATIVE
                        NOT_CAPABLE -> Known.NOT_CAPABLE
                        UNSPECIFIED -> Known.UNSPECIFIED
                        else -> throw LithicInvalidDataException("Unknown PinCapability: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): PinCapability = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PinCapability && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** POS Type */
            class Type @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ADMINISTRATIVE = of("ADMINISTRATIVE")

                    @JvmField val ATM = of("ATM")

                    @JvmField val AUTHORIZATION = of("AUTHORIZATION")

                    @JvmField val COUPON_MACHINE = of("COUPON_MACHINE")

                    @JvmField val DIAL_TERMINAL = of("DIAL_TERMINAL")

                    @JvmField val ECOMMERCE = of("ECOMMERCE")

                    @JvmField val ECR = of("ECR")

                    @JvmField val FUEL_MACHINE = of("FUEL_MACHINE")

                    @JvmField val HOME_TERMINAL = of("HOME_TERMINAL")

                    @JvmField val MICR = of("MICR")

                    @JvmField val OFF_PREMISE = of("OFF_PREMISE")

                    @JvmField val PAYMENT = of("PAYMENT")

                    @JvmField val PDA = of("PDA")

                    @JvmField val PHONE = of("PHONE")

                    @JvmField val POINT = of("POINT")

                    @JvmField val POS_TERMINAL = of("POS_TERMINAL")

                    @JvmField val PUBLIC_UTILITY = of("PUBLIC_UTILITY")

                    @JvmField val SELF_SERVICE = of("SELF_SERVICE")

                    @JvmField val TELEVISION = of("TELEVISION")

                    @JvmField val TELLER = of("TELLER")

                    @JvmField val TRAVELERS_CHECK_MACHINE = of("TRAVELERS_CHECK_MACHINE")

                    @JvmField val VENDING = of("VENDING")

                    @JvmField val VOICE = of("VOICE")

                    @JvmField val UNKNOWN = of("UNKNOWN")

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

                /** An enum containing [Type]'s known values. */
                enum class Known {
                    ADMINISTRATIVE,
                    ATM,
                    AUTHORIZATION,
                    COUPON_MACHINE,
                    DIAL_TERMINAL,
                    ECOMMERCE,
                    ECR,
                    FUEL_MACHINE,
                    HOME_TERMINAL,
                    MICR,
                    OFF_PREMISE,
                    PAYMENT,
                    PDA,
                    PHONE,
                    POINT,
                    POS_TERMINAL,
                    PUBLIC_UTILITY,
                    SELF_SERVICE,
                    TELEVISION,
                    TELLER,
                    TRAVELERS_CHECK_MACHINE,
                    VENDING,
                    VOICE,
                    UNKNOWN,
                }

                /**
                 * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Type] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ADMINISTRATIVE,
                    ATM,
                    AUTHORIZATION,
                    COUPON_MACHINE,
                    DIAL_TERMINAL,
                    ECOMMERCE,
                    ECR,
                    FUEL_MACHINE,
                    HOME_TERMINAL,
                    MICR,
                    OFF_PREMISE,
                    PAYMENT,
                    PDA,
                    PHONE,
                    POINT,
                    POS_TERMINAL,
                    PUBLIC_UTILITY,
                    SELF_SERVICE,
                    TELEVISION,
                    TELLER,
                    TRAVELERS_CHECK_MACHINE,
                    VENDING,
                    VOICE,
                    UNKNOWN,
                    /**
                     * An enum member indicating that [Type] was instantiated with an unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ADMINISTRATIVE -> Value.ADMINISTRATIVE
                        ATM -> Value.ATM
                        AUTHORIZATION -> Value.AUTHORIZATION
                        COUPON_MACHINE -> Value.COUPON_MACHINE
                        DIAL_TERMINAL -> Value.DIAL_TERMINAL
                        ECOMMERCE -> Value.ECOMMERCE
                        ECR -> Value.ECR
                        FUEL_MACHINE -> Value.FUEL_MACHINE
                        HOME_TERMINAL -> Value.HOME_TERMINAL
                        MICR -> Value.MICR
                        OFF_PREMISE -> Value.OFF_PREMISE
                        PAYMENT -> Value.PAYMENT
                        PDA -> Value.PDA
                        PHONE -> Value.PHONE
                        POINT -> Value.POINT
                        POS_TERMINAL -> Value.POS_TERMINAL
                        PUBLIC_UTILITY -> Value.PUBLIC_UTILITY
                        SELF_SERVICE -> Value.SELF_SERVICE
                        TELEVISION -> Value.TELEVISION
                        TELLER -> Value.TELLER
                        TRAVELERS_CHECK_MACHINE -> Value.TRAVELERS_CHECK_MACHINE
                        VENDING -> Value.VENDING
                        VOICE -> Value.VOICE
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ADMINISTRATIVE -> Known.ADMINISTRATIVE
                        ATM -> Known.ATM
                        AUTHORIZATION -> Known.AUTHORIZATION
                        COUPON_MACHINE -> Known.COUPON_MACHINE
                        DIAL_TERMINAL -> Known.DIAL_TERMINAL
                        ECOMMERCE -> Known.ECOMMERCE
                        ECR -> Known.ECR
                        FUEL_MACHINE -> Known.FUEL_MACHINE
                        HOME_TERMINAL -> Known.HOME_TERMINAL
                        MICR -> Known.MICR
                        OFF_PREMISE -> Known.OFF_PREMISE
                        PAYMENT -> Known.PAYMENT
                        PDA -> Known.PDA
                        PHONE -> Known.PHONE
                        POINT -> Known.POINT
                        POS_TERMINAL -> Known.POS_TERMINAL
                        PUBLIC_UTILITY -> Known.PUBLIC_UTILITY
                        SELF_SERVICE -> Known.SELF_SERVICE
                        TELEVISION -> Known.TELEVISION
                        TELLER -> Known.TELLER
                        TRAVELERS_CHECK_MACHINE -> Known.TRAVELERS_CHECK_MACHINE
                        VENDING -> Known.VENDING
                        VOICE -> Known.VOICE
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): Type = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Type && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is PosTerminal &&
                    attended == other.attended &&
                    cardRetentionCapable == other.cardRetentionCapable &&
                    onPremise == other.onPremise &&
                    operator == other.operator &&
                    partialApprovalCapable == other.partialApprovalCapable &&
                    pinCapability == other.pinCapability &&
                    type == other.type &&
                    acceptorTerminalId == other.acceptorTerminalId &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(
                    attended,
                    cardRetentionCapable,
                    onPremise,
                    operator,
                    partialApprovalCapable,
                    pinCapability,
                    type,
                    acceptorTerminalId,
                    additionalProperties,
                )
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PosTerminal{attended=$attended, cardRetentionCapable=$cardRetentionCapable, onPremise=$onPremise, operator=$operator, partialApprovalCapable=$partialApprovalCapable, pinCapability=$pinCapability, type=$type, acceptorTerminalId=$acceptorTerminalId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Pos &&
                entryMode == other.entryMode &&
                terminal == other.terminal &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(entryMode, terminal, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pos{entryMode=$entryMode, terminal=$terminal, additionalProperties=$additionalProperties}"
    }

    class DeclineResult @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCOUNT_PAUSED = of("ACCOUNT_PAUSED")

            @JvmField val ACCOUNT_STATE_TRANSACTION_FAIL = of("ACCOUNT_STATE_TRANSACTION_FAIL")

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val BANK_CONNECTION_ERROR = of("BANK_CONNECTION_ERROR")

            @JvmField val BANK_NOT_VERIFIED = of("BANK_NOT_VERIFIED")

            @JvmField val CARD_CLOSED = of("CARD_CLOSED")

            @JvmField val CARD_PAUSED = of("CARD_PAUSED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val FRAUD_ADVICE = of("FRAUD_ADVICE")

            @JvmField val IGNORED_TTL_EXPIRY = of("IGNORED_TTL_EXPIRY")

            @JvmField val SUSPECTED_FRAUD = of("SUSPECTED_FRAUD")

            @JvmField val INACTIVE_ACCOUNT = of("INACTIVE_ACCOUNT")

            @JvmField val INCORRECT_PIN = of("INCORRECT_PIN")

            @JvmField val INVALID_CARD_DETAILS = of("INVALID_CARD_DETAILS")

            @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

            @JvmField val INSUFFICIENT_FUNDS_PRELOAD = of("INSUFFICIENT_FUNDS_PRELOAD")

            @JvmField val INVALID_TRANSACTION = of("INVALID_TRANSACTION")

            @JvmField val MERCHANT_BLACKLIST = of("MERCHANT_BLACKLIST")

            @JvmField val ORIGINAL_NOT_FOUND = of("ORIGINAL_NOT_FOUND")

            @JvmField val PREVIOUSLY_COMPLETED = of("PREVIOUSLY_COMPLETED")

            @JvmField val SINGLE_USE_RECHARGED = of("SINGLE_USE_RECHARGED")

            @JvmField val SWITCH_INOPERATIVE_ADVICE = of("SWITCH_INOPERATIVE_ADVICE")

            @JvmField val UNAUTHORIZED_MERCHANT = of("UNAUTHORIZED_MERCHANT")

            @JvmField val UNKNOWN_HOST_TIMEOUT = of("UNKNOWN_HOST_TIMEOUT")

            @JvmField val USER_TRANSACTION_LIMIT = of("USER_TRANSACTION_LIMIT")

            @JvmStatic fun of(value: String) = DeclineResult(JsonField.of(value))
        }

        /** An enum containing [DeclineResult]'s known values. */
        enum class Known {
            ACCOUNT_PAUSED,
            ACCOUNT_STATE_TRANSACTION_FAIL,
            APPROVED,
            BANK_CONNECTION_ERROR,
            BANK_NOT_VERIFIED,
            CARD_CLOSED,
            CARD_PAUSED,
            DECLINED,
            FRAUD_ADVICE,
            IGNORED_TTL_EXPIRY,
            SUSPECTED_FRAUD,
            INACTIVE_ACCOUNT,
            INCORRECT_PIN,
            INVALID_CARD_DETAILS,
            INSUFFICIENT_FUNDS,
            INSUFFICIENT_FUNDS_PRELOAD,
            INVALID_TRANSACTION,
            MERCHANT_BLACKLIST,
            ORIGINAL_NOT_FOUND,
            PREVIOUSLY_COMPLETED,
            SINGLE_USE_RECHARGED,
            SWITCH_INOPERATIVE_ADVICE,
            UNAUTHORIZED_MERCHANT,
            UNKNOWN_HOST_TIMEOUT,
            USER_TRANSACTION_LIMIT,
        }

        /**
         * An enum containing [DeclineResult]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DeclineResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACCOUNT_PAUSED,
            ACCOUNT_STATE_TRANSACTION_FAIL,
            APPROVED,
            BANK_CONNECTION_ERROR,
            BANK_NOT_VERIFIED,
            CARD_CLOSED,
            CARD_PAUSED,
            DECLINED,
            FRAUD_ADVICE,
            IGNORED_TTL_EXPIRY,
            SUSPECTED_FRAUD,
            INACTIVE_ACCOUNT,
            INCORRECT_PIN,
            INVALID_CARD_DETAILS,
            INSUFFICIENT_FUNDS,
            INSUFFICIENT_FUNDS_PRELOAD,
            INVALID_TRANSACTION,
            MERCHANT_BLACKLIST,
            ORIGINAL_NOT_FOUND,
            PREVIOUSLY_COMPLETED,
            SINGLE_USE_RECHARGED,
            SWITCH_INOPERATIVE_ADVICE,
            UNAUTHORIZED_MERCHANT,
            UNKNOWN_HOST_TIMEOUT,
            USER_TRANSACTION_LIMIT,
            /**
             * An enum member indicating that [DeclineResult] was instantiated with an unknown
             * value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACCOUNT_PAUSED -> Value.ACCOUNT_PAUSED
                ACCOUNT_STATE_TRANSACTION_FAIL -> Value.ACCOUNT_STATE_TRANSACTION_FAIL
                APPROVED -> Value.APPROVED
                BANK_CONNECTION_ERROR -> Value.BANK_CONNECTION_ERROR
                BANK_NOT_VERIFIED -> Value.BANK_NOT_VERIFIED
                CARD_CLOSED -> Value.CARD_CLOSED
                CARD_PAUSED -> Value.CARD_PAUSED
                DECLINED -> Value.DECLINED
                FRAUD_ADVICE -> Value.FRAUD_ADVICE
                IGNORED_TTL_EXPIRY -> Value.IGNORED_TTL_EXPIRY
                SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                INACTIVE_ACCOUNT -> Value.INACTIVE_ACCOUNT
                INCORRECT_PIN -> Value.INCORRECT_PIN
                INVALID_CARD_DETAILS -> Value.INVALID_CARD_DETAILS
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                INSUFFICIENT_FUNDS_PRELOAD -> Value.INSUFFICIENT_FUNDS_PRELOAD
                INVALID_TRANSACTION -> Value.INVALID_TRANSACTION
                MERCHANT_BLACKLIST -> Value.MERCHANT_BLACKLIST
                ORIGINAL_NOT_FOUND -> Value.ORIGINAL_NOT_FOUND
                PREVIOUSLY_COMPLETED -> Value.PREVIOUSLY_COMPLETED
                SINGLE_USE_RECHARGED -> Value.SINGLE_USE_RECHARGED
                SWITCH_INOPERATIVE_ADVICE -> Value.SWITCH_INOPERATIVE_ADVICE
                UNAUTHORIZED_MERCHANT -> Value.UNAUTHORIZED_MERCHANT
                UNKNOWN_HOST_TIMEOUT -> Value.UNKNOWN_HOST_TIMEOUT
                USER_TRANSACTION_LIMIT -> Value.USER_TRANSACTION_LIMIT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                ACCOUNT_PAUSED -> Known.ACCOUNT_PAUSED
                ACCOUNT_STATE_TRANSACTION_FAIL -> Known.ACCOUNT_STATE_TRANSACTION_FAIL
                APPROVED -> Known.APPROVED
                BANK_CONNECTION_ERROR -> Known.BANK_CONNECTION_ERROR
                BANK_NOT_VERIFIED -> Known.BANK_NOT_VERIFIED
                CARD_CLOSED -> Known.CARD_CLOSED
                CARD_PAUSED -> Known.CARD_PAUSED
                DECLINED -> Known.DECLINED
                FRAUD_ADVICE -> Known.FRAUD_ADVICE
                IGNORED_TTL_EXPIRY -> Known.IGNORED_TTL_EXPIRY
                SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                INACTIVE_ACCOUNT -> Known.INACTIVE_ACCOUNT
                INCORRECT_PIN -> Known.INCORRECT_PIN
                INVALID_CARD_DETAILS -> Known.INVALID_CARD_DETAILS
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                INSUFFICIENT_FUNDS_PRELOAD -> Known.INSUFFICIENT_FUNDS_PRELOAD
                INVALID_TRANSACTION -> Known.INVALID_TRANSACTION
                MERCHANT_BLACKLIST -> Known.MERCHANT_BLACKLIST
                ORIGINAL_NOT_FOUND -> Known.ORIGINAL_NOT_FOUND
                PREVIOUSLY_COMPLETED -> Known.PREVIOUSLY_COMPLETED
                SINGLE_USE_RECHARGED -> Known.SINGLE_USE_RECHARGED
                SWITCH_INOPERATIVE_ADVICE -> Known.SWITCH_INOPERATIVE_ADVICE
                UNAUTHORIZED_MERCHANT -> Known.UNAUTHORIZED_MERCHANT
                UNKNOWN_HOST_TIMEOUT -> Known.UNKNOWN_HOST_TIMEOUT
                USER_TRANSACTION_LIMIT -> Known.USER_TRANSACTION_LIMIT
                else -> throw LithicInvalidDataException("Unknown DeclineResult: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): DeclineResult = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DeclineResult && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Status of the transaction. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val PENDING = of("PENDING")

            @JvmField val SETTLED = of("SETTLED")

            @JvmField val VOIDED = of("VOIDED")

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                SETTLED -> Value.SETTLED
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                SETTLED -> Known.SETTLED
                VOIDED -> Known.VOIDED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class TransactionEvent
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val token: JsonField<String>,
        private val amount: JsonField<Long>,
        private val amounts: JsonField<TransactionEventAmounts>,
        private val created: JsonField<OffsetDateTime>,
        private val detailedResults: JsonField<List<DetailedResult>>,
        private val effectivePolarity: JsonField<EffectivePolarity>,
        private val networkInfo: JsonField<NetworkInfo>,
        private val result: JsonField<DeclineResult>,
        private val ruleResults: JsonField<List<RuleResult>>,
        private val type: JsonField<Type>,
        private val accountType: JsonField<AccountType>,
        private val networkSpecificData: JsonField<NetworkSpecificData>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("amounts")
            @ExcludeMissing
            amounts: JsonField<TransactionEventAmounts> = JsonMissing.of(),
            @JsonProperty("created")
            @ExcludeMissing
            created: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("detailed_results")
            @ExcludeMissing
            detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of(),
            @JsonProperty("effective_polarity")
            @ExcludeMissing
            effectivePolarity: JsonField<EffectivePolarity> = JsonMissing.of(),
            @JsonProperty("network_info")
            @ExcludeMissing
            networkInfo: JsonField<NetworkInfo> = JsonMissing.of(),
            @JsonProperty("result")
            @ExcludeMissing
            result: JsonField<DeclineResult> = JsonMissing.of(),
            @JsonProperty("rule_results")
            @ExcludeMissing
            ruleResults: JsonField<List<RuleResult>> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("account_type")
            @ExcludeMissing
            accountType: JsonField<AccountType> = JsonMissing.of(),
            @JsonProperty("network_specific_data")
            @ExcludeMissing
            networkSpecificData: JsonField<NetworkSpecificData> = JsonMissing.of(),
        ) : this(
            token,
            amount,
            amounts,
            created,
            detailedResults,
            effectivePolarity,
            networkInfo,
            result,
            ruleResults,
            type,
            accountType,
            networkSpecificData,
            mutableMapOf(),
        )

        /**
         * Transaction event identifier.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun token(): String = token.getRequired("token")

        /**
         * Amount of the event in the settlement currency.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        @Deprecated("deprecated") fun amount(): Long = amount.getRequired("amount")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun amounts(): TransactionEventAmounts = amounts.getRequired("amounts")

        /**
         * RFC 3339 date and time this event entered the system. UTC time zone.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun detailedResults(): List<DetailedResult> =
            detailedResults.getRequired("detailed_results")

        /**
         * Indicates whether the transaction event is a credit or debit to the account.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun effectivePolarity(): EffectivePolarity =
            effectivePolarity.getRequired("effective_polarity")

        /**
         * Information provided by the card network in each event. This includes common identifiers
         * shared between you, Lithic, the card network and in some cases the acquirer. These
         * identifiers often link together events within the same transaction lifecycle and can be
         * used to locate a particular transaction, such as during processing of disputes. Not all
         * fields are available in all events, and the presence of these fields is dependent on the
         * card network and the event type. If the field is populated by the network, we will pass
         * it through as is unless otherwise specified. Please consult the official network
         * documentation for more details about these fields and how to use them.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun networkInfo(): Optional<NetworkInfo> = networkInfo.getOptional("network_info")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun result(): DeclineResult = result.getRequired("result")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun ruleResults(): List<RuleResult> = ruleResults.getRequired("rule_results")

        /**
         * Type of transaction event
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun accountType(): Optional<AccountType> = accountType.getOptional("account_type")

        /**
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun networkSpecificData(): Optional<NetworkSpecificData> =
            networkSpecificData.getOptional("network_specific_data")

        /**
         * Returns the raw JSON value of [token].
         *
         * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /**
         * Returns the raw JSON value of [amount].
         *
         * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
         */
        @Deprecated("deprecated")
        @JsonProperty("amount")
        @ExcludeMissing
        fun _amount(): JsonField<Long> = amount

        /**
         * Returns the raw JSON value of [amounts].
         *
         * Unlike [amounts], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("amounts")
        @ExcludeMissing
        fun _amounts(): JsonField<TransactionEventAmounts> = amounts

        /**
         * Returns the raw JSON value of [created].
         *
         * Unlike [created], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        /**
         * Returns the raw JSON value of [detailedResults].
         *
         * Unlike [detailedResults], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("detailed_results")
        @ExcludeMissing
        fun _detailedResults(): JsonField<List<DetailedResult>> = detailedResults

        /**
         * Returns the raw JSON value of [effectivePolarity].
         *
         * Unlike [effectivePolarity], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("effective_polarity")
        @ExcludeMissing
        fun _effectivePolarity(): JsonField<EffectivePolarity> = effectivePolarity

        /**
         * Returns the raw JSON value of [networkInfo].
         *
         * Unlike [networkInfo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("network_info")
        @ExcludeMissing
        fun _networkInfo(): JsonField<NetworkInfo> = networkInfo

        /**
         * Returns the raw JSON value of [result].
         *
         * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<DeclineResult> = result

        /**
         * Returns the raw JSON value of [ruleResults].
         *
         * Unlike [ruleResults], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("rule_results")
        @ExcludeMissing
        fun _ruleResults(): JsonField<List<RuleResult>> = ruleResults

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Returns the raw JSON value of [accountType].
         *
         * Unlike [accountType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("account_type")
        @ExcludeMissing
        fun _accountType(): JsonField<AccountType> = accountType

        /**
         * Returns the raw JSON value of [networkSpecificData].
         *
         * Unlike [networkSpecificData], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("network_specific_data")
        @ExcludeMissing
        fun _networkSpecificData(): JsonField<NetworkSpecificData> = networkSpecificData

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [TransactionEvent].
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .amounts()
             * .created()
             * .detailedResults()
             * .effectivePolarity()
             * .networkInfo()
             * .result()
             * .ruleResults()
             * .type()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TransactionEvent]. */
        class Builder internal constructor() {

            private var token: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var amounts: JsonField<TransactionEventAmounts>? = null
            private var created: JsonField<OffsetDateTime>? = null
            private var detailedResults: JsonField<MutableList<DetailedResult>>? = null
            private var effectivePolarity: JsonField<EffectivePolarity>? = null
            private var networkInfo: JsonField<NetworkInfo>? = null
            private var result: JsonField<DeclineResult>? = null
            private var ruleResults: JsonField<MutableList<RuleResult>>? = null
            private var type: JsonField<Type>? = null
            private var accountType: JsonField<AccountType> = JsonMissing.of()
            private var networkSpecificData: JsonField<NetworkSpecificData> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionEvent: TransactionEvent) = apply {
                token = transactionEvent.token
                amount = transactionEvent.amount
                amounts = transactionEvent.amounts
                created = transactionEvent.created
                detailedResults = transactionEvent.detailedResults.map { it.toMutableList() }
                effectivePolarity = transactionEvent.effectivePolarity
                networkInfo = transactionEvent.networkInfo
                result = transactionEvent.result
                ruleResults = transactionEvent.ruleResults.map { it.toMutableList() }
                type = transactionEvent.type
                accountType = transactionEvent.accountType
                networkSpecificData = transactionEvent.networkSpecificData
                additionalProperties = transactionEvent.additionalProperties.toMutableMap()
            }

            /** Transaction event identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Sets [Builder.token] to an arbitrary JSON value.
             *
             * You should usually call [Builder.token] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Amount of the event in the settlement currency. */
            @Deprecated("deprecated") fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * Sets [Builder.amount] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            @Deprecated("deprecated")
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun amounts(amounts: TransactionEventAmounts) = amounts(JsonField.of(amounts))

            /**
             * Sets [Builder.amounts] to an arbitrary JSON value.
             *
             * You should usually call [Builder.amounts] with a well-typed [TransactionEventAmounts]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun amounts(amounts: JsonField<TransactionEventAmounts>) = apply {
                this.amounts = amounts
            }

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /**
             * Sets [Builder.created] to an arbitrary JSON value.
             *
             * You should usually call [Builder.created] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            /**
             * Sets [Builder.detailedResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.detailedResults] with a well-typed
             * `List<DetailedResult>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults.map { it.toMutableList() }
            }

            /**
             * Adds a single [DetailedResult] to [detailedResults].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addDetailedResult(detailedResult: DetailedResult) = apply {
                detailedResults =
                    (detailedResults ?: JsonField.of(mutableListOf())).also {
                        checkKnown("detailedResults", it).add(detailedResult)
                    }
            }

            /** Indicates whether the transaction event is a credit or debit to the account. */
            fun effectivePolarity(effectivePolarity: EffectivePolarity) =
                effectivePolarity(JsonField.of(effectivePolarity))

            /**
             * Sets [Builder.effectivePolarity] to an arbitrary JSON value.
             *
             * You should usually call [Builder.effectivePolarity] with a well-typed
             * [EffectivePolarity] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun effectivePolarity(effectivePolarity: JsonField<EffectivePolarity>) = apply {
                this.effectivePolarity = effectivePolarity
            }

            /**
             * Information provided by the card network in each event. This includes common
             * identifiers shared between you, Lithic, the card network and in some cases the
             * acquirer. These identifiers often link together events within the same transaction
             * lifecycle and can be used to locate a particular transaction, such as during
             * processing of disputes. Not all fields are available in all events, and the presence
             * of these fields is dependent on the card network and the event type. If the field is
             * populated by the network, we will pass it through as is unless otherwise specified.
             * Please consult the official network documentation for more details about these fields
             * and how to use them.
             */
            fun networkInfo(networkInfo: NetworkInfo?) =
                networkInfo(JsonField.ofNullable(networkInfo))

            /** Alias for calling [Builder.networkInfo] with `networkInfo.orElse(null)`. */
            fun networkInfo(networkInfo: Optional<NetworkInfo>) =
                networkInfo(networkInfo.getOrNull())

            /**
             * Sets [Builder.networkInfo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkInfo] with a well-typed [NetworkInfo] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun networkInfo(networkInfo: JsonField<NetworkInfo>) = apply {
                this.networkInfo = networkInfo
            }

            fun result(result: DeclineResult) = result(JsonField.of(result))

            /**
             * Sets [Builder.result] to an arbitrary JSON value.
             *
             * You should usually call [Builder.result] with a well-typed [DeclineResult] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun result(result: JsonField<DeclineResult>) = apply { this.result = result }

            fun ruleResults(ruleResults: List<RuleResult>) = ruleResults(JsonField.of(ruleResults))

            /**
             * Sets [Builder.ruleResults] to an arbitrary JSON value.
             *
             * You should usually call [Builder.ruleResults] with a well-typed `List<RuleResult>`
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun ruleResults(ruleResults: JsonField<List<RuleResult>>) = apply {
                this.ruleResults = ruleResults.map { it.toMutableList() }
            }

            /**
             * Adds a single [RuleResult] to [ruleResults].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addRuleResult(ruleResult: RuleResult) = apply {
                ruleResults =
                    (ruleResults ?: JsonField.of(mutableListOf())).also {
                        checkKnown("ruleResults", it).add(ruleResult)
                    }
            }

            /** Type of transaction event */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun accountType(accountType: AccountType) = accountType(JsonField.of(accountType))

            /**
             * Sets [Builder.accountType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.accountType] with a well-typed [AccountType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun accountType(accountType: JsonField<AccountType>) = apply {
                this.accountType = accountType
            }

            fun networkSpecificData(networkSpecificData: NetworkSpecificData) =
                networkSpecificData(JsonField.of(networkSpecificData))

            /**
             * Sets [Builder.networkSpecificData] to an arbitrary JSON value.
             *
             * You should usually call [Builder.networkSpecificData] with a well-typed
             * [NetworkSpecificData] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun networkSpecificData(networkSpecificData: JsonField<NetworkSpecificData>) = apply {
                this.networkSpecificData = networkSpecificData
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            /**
             * Returns an immutable instance of [TransactionEvent].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .token()
             * .amount()
             * .amounts()
             * .created()
             * .detailedResults()
             * .effectivePolarity()
             * .networkInfo()
             * .result()
             * .ruleResults()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): TransactionEvent =
                TransactionEvent(
                    checkRequired("token", token),
                    checkRequired("amount", amount),
                    checkRequired("amounts", amounts),
                    checkRequired("created", created),
                    checkRequired("detailedResults", detailedResults).map { it.toImmutable() },
                    checkRequired("effectivePolarity", effectivePolarity),
                    checkRequired("networkInfo", networkInfo),
                    checkRequired("result", result),
                    checkRequired("ruleResults", ruleResults).map { it.toImmutable() },
                    checkRequired("type", type),
                    accountType,
                    networkSpecificData,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): TransactionEvent = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            amounts().validate()
            created()
            detailedResults().forEach { it.validate() }
            effectivePolarity().validate()
            networkInfo().ifPresent { it.validate() }
            result().validate()
            ruleResults().forEach { it.validate() }
            type().validate()
            accountType().ifPresent { it.validate() }
            networkSpecificData().ifPresent { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (if (token.asKnown().isPresent) 1 else 0) +
                (if (amount.asKnown().isPresent) 1 else 0) +
                (amounts.asKnown().getOrNull()?.validity() ?: 0) +
                (if (created.asKnown().isPresent) 1 else 0) +
                (detailedResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (effectivePolarity.asKnown().getOrNull()?.validity() ?: 0) +
                (networkInfo.asKnown().getOrNull()?.validity() ?: 0) +
                (result.asKnown().getOrNull()?.validity() ?: 0) +
                (ruleResults.asKnown().getOrNull()?.sumOf { it.validity().toInt() } ?: 0) +
                (type.asKnown().getOrNull()?.validity() ?: 0) +
                (accountType.asKnown().getOrNull()?.validity() ?: 0) +
                (networkSpecificData.asKnown().getOrNull()?.validity() ?: 0)

        class TransactionEventAmounts
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val cardholder: JsonField<Cardholder>,
            private val merchant: JsonField<Merchant>,
            private val settlement: JsonField<Settlement>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("cardholder")
                @ExcludeMissing
                cardholder: JsonField<Cardholder> = JsonMissing.of(),
                @JsonProperty("merchant")
                @ExcludeMissing
                merchant: JsonField<Merchant> = JsonMissing.of(),
                @JsonProperty("settlement")
                @ExcludeMissing
                settlement: JsonField<Settlement> = JsonMissing.of(),
            ) : this(cardholder, merchant, settlement, mutableMapOf())

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun merchant(): Merchant = merchant.getRequired("merchant")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun settlement(): Optional<Settlement> = settlement.getOptional("settlement")

            /**
             * Returns the raw JSON value of [cardholder].
             *
             * Unlike [cardholder], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("cardholder")
            @ExcludeMissing
            fun _cardholder(): JsonField<Cardholder> = cardholder

            /**
             * Returns the raw JSON value of [merchant].
             *
             * Unlike [merchant], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("merchant")
            @ExcludeMissing
            fun _merchant(): JsonField<Merchant> = merchant

            /**
             * Returns the raw JSON value of [settlement].
             *
             * Unlike [settlement], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("settlement")
            @ExcludeMissing
            fun _settlement(): JsonField<Settlement> = settlement

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [TransactionEventAmounts].
                 *
                 * The following fields are required:
                 * ```java
                 * .cardholder()
                 * .merchant()
                 * .settlement()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [TransactionEventAmounts]. */
            class Builder internal constructor() {

                private var cardholder: JsonField<Cardholder>? = null
                private var merchant: JsonField<Merchant>? = null
                private var settlement: JsonField<Settlement>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transactionEventAmounts: TransactionEventAmounts) = apply {
                    cardholder = transactionEventAmounts.cardholder
                    merchant = transactionEventAmounts.merchant
                    settlement = transactionEventAmounts.settlement
                    additionalProperties =
                        transactionEventAmounts.additionalProperties.toMutableMap()
                }

                fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

                /**
                 * Sets [Builder.cardholder] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.cardholder] with a well-typed [Cardholder] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                    this.cardholder = cardholder
                }

                fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

                /**
                 * Sets [Builder.merchant] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.merchant] with a well-typed [Merchant] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

                fun settlement(settlement: Settlement?) =
                    settlement(JsonField.ofNullable(settlement))

                /** Alias for calling [Builder.settlement] with `settlement.orElse(null)`. */
                fun settlement(settlement: Optional<Settlement>) =
                    settlement(settlement.getOrNull())

                /**
                 * Sets [Builder.settlement] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.settlement] with a well-typed [Settlement] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun settlement(settlement: JsonField<Settlement>) = apply {
                    this.settlement = settlement
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [TransactionEventAmounts].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .cardholder()
                 * .merchant()
                 * .settlement()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TransactionEventAmounts =
                    TransactionEventAmounts(
                        checkRequired("cardholder", cardholder),
                        checkRequired("merchant", merchant),
                        checkRequired("settlement", settlement),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TransactionEventAmounts = apply {
                if (validated) {
                    return@apply
                }

                cardholder().validate()
                merchant().validate()
                settlement().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (cardholder.asKnown().getOrNull()?.validity() ?: 0) +
                    (merchant.asKnown().getOrNull()?.validity() ?: 0) +
                    (settlement.asKnown().getOrNull()?.validity() ?: 0)

            class Cardholder
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val conversionRate: JsonField<String>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, conversionRate, currency, mutableMapOf())

                /**
                 * Amount of the event in the cardholder billing currency.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Exchange rate used to convert the merchant amount to the cardholder billing
                 * amount.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

                /**
                 * 3-character alphabetic ISO 4217 currency
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<String> = conversionRate

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Cardholder].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .conversionRate()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Cardholder]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var conversionRate: JsonField<String>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardholder: Cardholder) = apply {
                        amount = cardholder.amount
                        conversionRate = cardholder.conversionRate
                        currency = cardholder.currency
                        additionalProperties = cardholder.additionalProperties.toMutableMap()
                    }

                    /** Amount of the event in the cardholder billing currency. */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Exchange rate used to convert the merchant amount to the cardholder billing
                     * amount.
                     */
                    fun conversionRate(conversionRate: String) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<String>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /** 3-character alphabetic ISO 4217 currency */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Cardholder].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .conversionRate()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Cardholder =
                        Cardholder(
                            checkRequired("amount", amount),
                            checkRequired("conversionRate", conversionRate),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Cardholder = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    conversionRate()
                    currency()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (conversionRate.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Cardholder &&
                        amount == other.amount &&
                        conversionRate == other.conversionRate &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, conversionRate, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Cardholder{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
            }

            class Merchant
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, currency, mutableMapOf())

                /**
                 * Amount of the event in the merchant currency.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * 3-character alphabetic ISO 4217 currency
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Merchant].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Merchant]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(merchant: Merchant) = apply {
                        amount = merchant.amount
                        currency = merchant.currency
                        additionalProperties = merchant.additionalProperties.toMutableMap()
                    }

                    /** Amount of the event in the merchant currency. */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /** 3-character alphabetic ISO 4217 currency */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Merchant].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Merchant =
                        Merchant(
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Merchant = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Merchant &&
                        amount == other.amount &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Merchant{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            class Settlement
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val amount: JsonField<Long>,
                private val conversionRate: JsonField<String>,
                private val currency: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("amount")
                    @ExcludeMissing
                    amount: JsonField<Long> = JsonMissing.of(),
                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    conversionRate: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("currency")
                    @ExcludeMissing
                    currency: JsonField<String> = JsonMissing.of(),
                ) : this(amount, conversionRate, currency, mutableMapOf())

                /**
                 * Amount of the event, if it is financial, in the settlement currency.
                 * Non-financial events do not contain this amount because they do not move funds.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Exchange rate used to convert the merchant amount to the settlement amount.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

                /**
                 * 3-character alphabetic ISO 4217 currency
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
                 *   unexpectedly missing or null (e.g. if the server responded with an unexpected
                 *   value).
                 */
                fun currency(): String = currency.getRequired("currency")

                /**
                 * Returns the raw JSON value of [amount].
                 *
                 * Unlike [amount], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Returns the raw JSON value of [conversionRate].
                 *
                 * Unlike [conversionRate], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<String> = conversionRate

                /**
                 * Returns the raw JSON value of [currency].
                 *
                 * Unlike [currency], this method doesn't throw if the JSON field has an unexpected
                 * type.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<String> = currency

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Settlement].
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .conversionRate()
                     * .currency()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Settlement]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var conversionRate: JsonField<String>? = null
                    private var currency: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(settlement: Settlement) = apply {
                        amount = settlement.amount
                        conversionRate = settlement.conversionRate
                        currency = settlement.currency
                        additionalProperties = settlement.additionalProperties.toMutableMap()
                    }

                    /**
                     * Amount of the event, if it is financial, in the settlement currency.
                     * Non-financial events do not contain this amount because they do not move
                     * funds.
                     */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /**
                     * Sets [Builder.amount] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.amount] with a well-typed [Long] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Exchange rate used to convert the merchant amount to the settlement amount.
                     */
                    fun conversionRate(conversionRate: String) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * Sets [Builder.conversionRate] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.conversionRate] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun conversionRate(conversionRate: JsonField<String>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /** 3-character alphabetic ISO 4217 currency */
                    fun currency(currency: String) = currency(JsonField.of(currency))

                    /**
                     * Sets [Builder.currency] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.currency] with a well-typed [String] value
                     * instead. This method is primarily for setting the field to an undocumented or
                     * not yet supported value.
                     */
                    fun currency(currency: JsonField<String>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Settlement].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .amount()
                     * .conversionRate()
                     * .currency()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Settlement =
                        Settlement(
                            checkRequired("amount", amount),
                            checkRequired("conversionRate", conversionRate),
                            checkRequired("currency", currency),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Settlement = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    conversionRate()
                    currency()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (amount.asKnown().isPresent) 1 else 0) +
                        (if (conversionRate.asKnown().isPresent) 1 else 0) +
                        (if (currency.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Settlement &&
                        amount == other.amount &&
                        conversionRate == other.conversionRate &&
                        currency == other.currency &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(amount, conversionRate, currency, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Settlement{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TransactionEventAmounts &&
                    cardholder == other.cardholder &&
                    merchant == other.merchant &&
                    settlement == other.settlement &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(cardholder, merchant, settlement, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionEventAmounts{cardholder=$cardholder, merchant=$merchant, settlement=$settlement, additionalProperties=$additionalProperties}"
        }

        class DetailedResult
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField
                val ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED = of("ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED")

                @JvmField val ACCOUNT_DELINQUENT = of("ACCOUNT_DELINQUENT")

                @JvmField val ACCOUNT_INACTIVE = of("ACCOUNT_INACTIVE")

                @JvmField
                val ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED =
                    of("ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED")

                @JvmField
                val ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED =
                    of("ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED")

                @JvmField val ACCOUNT_PAUSED = of("ACCOUNT_PAUSED")

                @JvmField val ACCOUNT_UNDER_REVIEW = of("ACCOUNT_UNDER_REVIEW")

                @JvmField val ADDRESS_INCORRECT = of("ADDRESS_INCORRECT")

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val AUTH_RULE_ALLOWED_COUNTRY = of("AUTH_RULE_ALLOWED_COUNTRY")

                @JvmField val AUTH_RULE_ALLOWED_MCC = of("AUTH_RULE_ALLOWED_MCC")

                @JvmField val AUTH_RULE_BLOCKED_COUNTRY = of("AUTH_RULE_BLOCKED_COUNTRY")

                @JvmField val AUTH_RULE_BLOCKED_MCC = of("AUTH_RULE_BLOCKED_MCC")

                @JvmField val CARD_CLOSED = of("CARD_CLOSED")

                @JvmField
                val CARD_CRYPTOGRAM_VALIDATION_FAILURE = of("CARD_CRYPTOGRAM_VALIDATION_FAILURE")

                @JvmField val CARD_EXPIRED = of("CARD_EXPIRED")

                @JvmField val CARD_EXPIRY_DATE_INCORRECT = of("CARD_EXPIRY_DATE_INCORRECT")

                @JvmField val CARD_INVALID = of("CARD_INVALID")

                @JvmField val CARD_NOT_ACTIVATED = of("CARD_NOT_ACTIVATED")

                @JvmField val CARD_PAUSED = of("CARD_PAUSED")

                @JvmField val CARD_PIN_INCORRECT = of("CARD_PIN_INCORRECT")

                @JvmField val CARD_RESTRICTED = of("CARD_RESTRICTED")

                @JvmField val CARD_SECURITY_CODE_INCORRECT = of("CARD_SECURITY_CODE_INCORRECT")

                @JvmField val CARD_SPEND_LIMIT_EXCEEDED = of("CARD_SPEND_LIMIT_EXCEEDED")

                @JvmField val CONTACT_CARD_ISSUER = of("CONTACT_CARD_ISSUER")

                @JvmField val CUSTOMER_ASA_TIMEOUT = of("CUSTOMER_ASA_TIMEOUT")

                @JvmField val CUSTOM_ASA_RESULT = of("CUSTOM_ASA_RESULT")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val DO_NOT_HONOR = of("DO_NOT_HONOR")

                @JvmField val DRIVER_NUMBER_INVALID = of("DRIVER_NUMBER_INVALID")

                @JvmField val FORMAT_ERROR = of("FORMAT_ERROR")

                @JvmField
                val INSUFFICIENT_FUNDING_SOURCE_BALANCE = of("INSUFFICIENT_FUNDING_SOURCE_BALANCE")

                @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

                @JvmField val LITHIC_SYSTEM_ERROR = of("LITHIC_SYSTEM_ERROR")

                @JvmField val LITHIC_SYSTEM_RATE_LIMIT = of("LITHIC_SYSTEM_RATE_LIMIT")

                @JvmField val MALFORMED_ASA_RESPONSE = of("MALFORMED_ASA_RESPONSE")

                @JvmField val MERCHANT_INVALID = of("MERCHANT_INVALID")

                @JvmField
                val MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE =
                    of("MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE")

                @JvmField val MERCHANT_NOT_PERMITTED = of("MERCHANT_NOT_PERMITTED")

                @JvmField val OVER_REVERSAL_ATTEMPTED = of("OVER_REVERSAL_ATTEMPTED")

                @JvmField val PIN_BLOCKED = of("PIN_BLOCKED")

                @JvmField
                val PROGRAM_CARD_SPEND_LIMIT_EXCEEDED = of("PROGRAM_CARD_SPEND_LIMIT_EXCEEDED")

                @JvmField val PROGRAM_SUSPENDED = of("PROGRAM_SUSPENDED")

                @JvmField val PROGRAM_USAGE_RESTRICTION = of("PROGRAM_USAGE_RESTRICTION")

                @JvmField val REVERSAL_UNMATCHED = of("REVERSAL_UNMATCHED")

                @JvmField val SECURITY_VIOLATION = of("SECURITY_VIOLATION")

                @JvmField val SINGLE_USE_CARD_REATTEMPTED = of("SINGLE_USE_CARD_REATTEMPTED")

                @JvmField val SUSPECTED_FRAUD = of("SUSPECTED_FRAUD")

                @JvmField val TRANSACTION_INVALID = of("TRANSACTION_INVALID")

                @JvmField
                val TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL =
                    of("TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL")

                @JvmField
                val TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER =
                    of("TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER")

                @JvmField
                val TRANSACTION_PREVIOUSLY_COMPLETED = of("TRANSACTION_PREVIOUSLY_COMPLETED")

                @JvmField val UNAUTHORIZED_MERCHANT = of("UNAUTHORIZED_MERCHANT")

                @JvmField val VEHICLE_NUMBER_INVALID = of("VEHICLE_NUMBER_INVALID")

                @JvmField val CARDHOLDER_CHALLENGED = of("CARDHOLDER_CHALLENGED")

                @JvmField val CARDHOLDER_CHALLENGE_FAILED = of("CARDHOLDER_CHALLENGE_FAILED")

                @JvmStatic fun of(value: String) = DetailedResult(JsonField.of(value))
            }

            /** An enum containing [DetailedResult]'s known values. */
            enum class Known {
                ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_DELINQUENT,
                ACCOUNT_INACTIVE,
                ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_PAUSED,
                ACCOUNT_UNDER_REVIEW,
                ADDRESS_INCORRECT,
                APPROVED,
                AUTH_RULE_ALLOWED_COUNTRY,
                AUTH_RULE_ALLOWED_MCC,
                AUTH_RULE_BLOCKED_COUNTRY,
                AUTH_RULE_BLOCKED_MCC,
                CARD_CLOSED,
                CARD_CRYPTOGRAM_VALIDATION_FAILURE,
                CARD_EXPIRED,
                CARD_EXPIRY_DATE_INCORRECT,
                CARD_INVALID,
                CARD_NOT_ACTIVATED,
                CARD_PAUSED,
                CARD_PIN_INCORRECT,
                CARD_RESTRICTED,
                CARD_SECURITY_CODE_INCORRECT,
                CARD_SPEND_LIMIT_EXCEEDED,
                CONTACT_CARD_ISSUER,
                CUSTOMER_ASA_TIMEOUT,
                CUSTOM_ASA_RESULT,
                DECLINED,
                DO_NOT_HONOR,
                DRIVER_NUMBER_INVALID,
                FORMAT_ERROR,
                INSUFFICIENT_FUNDING_SOURCE_BALANCE,
                INSUFFICIENT_FUNDS,
                LITHIC_SYSTEM_ERROR,
                LITHIC_SYSTEM_RATE_LIMIT,
                MALFORMED_ASA_RESPONSE,
                MERCHANT_INVALID,
                MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE,
                MERCHANT_NOT_PERMITTED,
                OVER_REVERSAL_ATTEMPTED,
                PIN_BLOCKED,
                PROGRAM_CARD_SPEND_LIMIT_EXCEEDED,
                PROGRAM_SUSPENDED,
                PROGRAM_USAGE_RESTRICTION,
                REVERSAL_UNMATCHED,
                SECURITY_VIOLATION,
                SINGLE_USE_CARD_REATTEMPTED,
                SUSPECTED_FRAUD,
                TRANSACTION_INVALID,
                TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL,
                TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER,
                TRANSACTION_PREVIOUSLY_COMPLETED,
                UNAUTHORIZED_MERCHANT,
                VEHICLE_NUMBER_INVALID,
                CARDHOLDER_CHALLENGED,
                CARDHOLDER_CHALLENGE_FAILED,
            }

            /**
             * An enum containing [DetailedResult]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DetailedResult] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_DELINQUENT,
                ACCOUNT_INACTIVE,
                ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_PAUSED,
                ACCOUNT_UNDER_REVIEW,
                ADDRESS_INCORRECT,
                APPROVED,
                AUTH_RULE_ALLOWED_COUNTRY,
                AUTH_RULE_ALLOWED_MCC,
                AUTH_RULE_BLOCKED_COUNTRY,
                AUTH_RULE_BLOCKED_MCC,
                CARD_CLOSED,
                CARD_CRYPTOGRAM_VALIDATION_FAILURE,
                CARD_EXPIRED,
                CARD_EXPIRY_DATE_INCORRECT,
                CARD_INVALID,
                CARD_NOT_ACTIVATED,
                CARD_PAUSED,
                CARD_PIN_INCORRECT,
                CARD_RESTRICTED,
                CARD_SECURITY_CODE_INCORRECT,
                CARD_SPEND_LIMIT_EXCEEDED,
                CONTACT_CARD_ISSUER,
                CUSTOMER_ASA_TIMEOUT,
                CUSTOM_ASA_RESULT,
                DECLINED,
                DO_NOT_HONOR,
                DRIVER_NUMBER_INVALID,
                FORMAT_ERROR,
                INSUFFICIENT_FUNDING_SOURCE_BALANCE,
                INSUFFICIENT_FUNDS,
                LITHIC_SYSTEM_ERROR,
                LITHIC_SYSTEM_RATE_LIMIT,
                MALFORMED_ASA_RESPONSE,
                MERCHANT_INVALID,
                MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE,
                MERCHANT_NOT_PERMITTED,
                OVER_REVERSAL_ATTEMPTED,
                PIN_BLOCKED,
                PROGRAM_CARD_SPEND_LIMIT_EXCEEDED,
                PROGRAM_SUSPENDED,
                PROGRAM_USAGE_RESTRICTION,
                REVERSAL_UNMATCHED,
                SECURITY_VIOLATION,
                SINGLE_USE_CARD_REATTEMPTED,
                SUSPECTED_FRAUD,
                TRANSACTION_INVALID,
                TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL,
                TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER,
                TRANSACTION_PREVIOUSLY_COMPLETED,
                UNAUTHORIZED_MERCHANT,
                VEHICLE_NUMBER_INVALID,
                CARDHOLDER_CHALLENGED,
                CARDHOLDER_CHALLENGE_FAILED,
                /**
                 * An enum member indicating that [DetailedResult] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED -> Value.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_DELINQUENT -> Value.ACCOUNT_DELINQUENT
                    ACCOUNT_INACTIVE -> Value.ACCOUNT_INACTIVE
                    ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED ->
                        Value.ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED ->
                        Value.ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_PAUSED -> Value.ACCOUNT_PAUSED
                    ACCOUNT_UNDER_REVIEW -> Value.ACCOUNT_UNDER_REVIEW
                    ADDRESS_INCORRECT -> Value.ADDRESS_INCORRECT
                    APPROVED -> Value.APPROVED
                    AUTH_RULE_ALLOWED_COUNTRY -> Value.AUTH_RULE_ALLOWED_COUNTRY
                    AUTH_RULE_ALLOWED_MCC -> Value.AUTH_RULE_ALLOWED_MCC
                    AUTH_RULE_BLOCKED_COUNTRY -> Value.AUTH_RULE_BLOCKED_COUNTRY
                    AUTH_RULE_BLOCKED_MCC -> Value.AUTH_RULE_BLOCKED_MCC
                    CARD_CLOSED -> Value.CARD_CLOSED
                    CARD_CRYPTOGRAM_VALIDATION_FAILURE -> Value.CARD_CRYPTOGRAM_VALIDATION_FAILURE
                    CARD_EXPIRED -> Value.CARD_EXPIRED
                    CARD_EXPIRY_DATE_INCORRECT -> Value.CARD_EXPIRY_DATE_INCORRECT
                    CARD_INVALID -> Value.CARD_INVALID
                    CARD_NOT_ACTIVATED -> Value.CARD_NOT_ACTIVATED
                    CARD_PAUSED -> Value.CARD_PAUSED
                    CARD_PIN_INCORRECT -> Value.CARD_PIN_INCORRECT
                    CARD_RESTRICTED -> Value.CARD_RESTRICTED
                    CARD_SECURITY_CODE_INCORRECT -> Value.CARD_SECURITY_CODE_INCORRECT
                    CARD_SPEND_LIMIT_EXCEEDED -> Value.CARD_SPEND_LIMIT_EXCEEDED
                    CONTACT_CARD_ISSUER -> Value.CONTACT_CARD_ISSUER
                    CUSTOMER_ASA_TIMEOUT -> Value.CUSTOMER_ASA_TIMEOUT
                    CUSTOM_ASA_RESULT -> Value.CUSTOM_ASA_RESULT
                    DECLINED -> Value.DECLINED
                    DO_NOT_HONOR -> Value.DO_NOT_HONOR
                    DRIVER_NUMBER_INVALID -> Value.DRIVER_NUMBER_INVALID
                    FORMAT_ERROR -> Value.FORMAT_ERROR
                    INSUFFICIENT_FUNDING_SOURCE_BALANCE -> Value.INSUFFICIENT_FUNDING_SOURCE_BALANCE
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    LITHIC_SYSTEM_ERROR -> Value.LITHIC_SYSTEM_ERROR
                    LITHIC_SYSTEM_RATE_LIMIT -> Value.LITHIC_SYSTEM_RATE_LIMIT
                    MALFORMED_ASA_RESPONSE -> Value.MALFORMED_ASA_RESPONSE
                    MERCHANT_INVALID -> Value.MERCHANT_INVALID
                    MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE ->
                        Value.MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE
                    MERCHANT_NOT_PERMITTED -> Value.MERCHANT_NOT_PERMITTED
                    OVER_REVERSAL_ATTEMPTED -> Value.OVER_REVERSAL_ATTEMPTED
                    PIN_BLOCKED -> Value.PIN_BLOCKED
                    PROGRAM_CARD_SPEND_LIMIT_EXCEEDED -> Value.PROGRAM_CARD_SPEND_LIMIT_EXCEEDED
                    PROGRAM_SUSPENDED -> Value.PROGRAM_SUSPENDED
                    PROGRAM_USAGE_RESTRICTION -> Value.PROGRAM_USAGE_RESTRICTION
                    REVERSAL_UNMATCHED -> Value.REVERSAL_UNMATCHED
                    SECURITY_VIOLATION -> Value.SECURITY_VIOLATION
                    SINGLE_USE_CARD_REATTEMPTED -> Value.SINGLE_USE_CARD_REATTEMPTED
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    TRANSACTION_INVALID -> Value.TRANSACTION_INVALID
                    TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL ->
                        Value.TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL
                    TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER ->
                        Value.TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER
                    TRANSACTION_PREVIOUSLY_COMPLETED -> Value.TRANSACTION_PREVIOUSLY_COMPLETED
                    UNAUTHORIZED_MERCHANT -> Value.UNAUTHORIZED_MERCHANT
                    VEHICLE_NUMBER_INVALID -> Value.VEHICLE_NUMBER_INVALID
                    CARDHOLDER_CHALLENGED -> Value.CARDHOLDER_CHALLENGED
                    CARDHOLDER_CHALLENGE_FAILED -> Value.CARDHOLDER_CHALLENGE_FAILED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED -> Known.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_DELINQUENT -> Known.ACCOUNT_DELINQUENT
                    ACCOUNT_INACTIVE -> Known.ACCOUNT_INACTIVE
                    ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED ->
                        Known.ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED ->
                        Known.ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_PAUSED -> Known.ACCOUNT_PAUSED
                    ACCOUNT_UNDER_REVIEW -> Known.ACCOUNT_UNDER_REVIEW
                    ADDRESS_INCORRECT -> Known.ADDRESS_INCORRECT
                    APPROVED -> Known.APPROVED
                    AUTH_RULE_ALLOWED_COUNTRY -> Known.AUTH_RULE_ALLOWED_COUNTRY
                    AUTH_RULE_ALLOWED_MCC -> Known.AUTH_RULE_ALLOWED_MCC
                    AUTH_RULE_BLOCKED_COUNTRY -> Known.AUTH_RULE_BLOCKED_COUNTRY
                    AUTH_RULE_BLOCKED_MCC -> Known.AUTH_RULE_BLOCKED_MCC
                    CARD_CLOSED -> Known.CARD_CLOSED
                    CARD_CRYPTOGRAM_VALIDATION_FAILURE -> Known.CARD_CRYPTOGRAM_VALIDATION_FAILURE
                    CARD_EXPIRED -> Known.CARD_EXPIRED
                    CARD_EXPIRY_DATE_INCORRECT -> Known.CARD_EXPIRY_DATE_INCORRECT
                    CARD_INVALID -> Known.CARD_INVALID
                    CARD_NOT_ACTIVATED -> Known.CARD_NOT_ACTIVATED
                    CARD_PAUSED -> Known.CARD_PAUSED
                    CARD_PIN_INCORRECT -> Known.CARD_PIN_INCORRECT
                    CARD_RESTRICTED -> Known.CARD_RESTRICTED
                    CARD_SECURITY_CODE_INCORRECT -> Known.CARD_SECURITY_CODE_INCORRECT
                    CARD_SPEND_LIMIT_EXCEEDED -> Known.CARD_SPEND_LIMIT_EXCEEDED
                    CONTACT_CARD_ISSUER -> Known.CONTACT_CARD_ISSUER
                    CUSTOMER_ASA_TIMEOUT -> Known.CUSTOMER_ASA_TIMEOUT
                    CUSTOM_ASA_RESULT -> Known.CUSTOM_ASA_RESULT
                    DECLINED -> Known.DECLINED
                    DO_NOT_HONOR -> Known.DO_NOT_HONOR
                    DRIVER_NUMBER_INVALID -> Known.DRIVER_NUMBER_INVALID
                    FORMAT_ERROR -> Known.FORMAT_ERROR
                    INSUFFICIENT_FUNDING_SOURCE_BALANCE -> Known.INSUFFICIENT_FUNDING_SOURCE_BALANCE
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    LITHIC_SYSTEM_ERROR -> Known.LITHIC_SYSTEM_ERROR
                    LITHIC_SYSTEM_RATE_LIMIT -> Known.LITHIC_SYSTEM_RATE_LIMIT
                    MALFORMED_ASA_RESPONSE -> Known.MALFORMED_ASA_RESPONSE
                    MERCHANT_INVALID -> Known.MERCHANT_INVALID
                    MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE ->
                        Known.MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE
                    MERCHANT_NOT_PERMITTED -> Known.MERCHANT_NOT_PERMITTED
                    OVER_REVERSAL_ATTEMPTED -> Known.OVER_REVERSAL_ATTEMPTED
                    PIN_BLOCKED -> Known.PIN_BLOCKED
                    PROGRAM_CARD_SPEND_LIMIT_EXCEEDED -> Known.PROGRAM_CARD_SPEND_LIMIT_EXCEEDED
                    PROGRAM_SUSPENDED -> Known.PROGRAM_SUSPENDED
                    PROGRAM_USAGE_RESTRICTION -> Known.PROGRAM_USAGE_RESTRICTION
                    REVERSAL_UNMATCHED -> Known.REVERSAL_UNMATCHED
                    SECURITY_VIOLATION -> Known.SECURITY_VIOLATION
                    SINGLE_USE_CARD_REATTEMPTED -> Known.SINGLE_USE_CARD_REATTEMPTED
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    TRANSACTION_INVALID -> Known.TRANSACTION_INVALID
                    TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL ->
                        Known.TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL
                    TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER ->
                        Known.TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER
                    TRANSACTION_PREVIOUSLY_COMPLETED -> Known.TRANSACTION_PREVIOUSLY_COMPLETED
                    UNAUTHORIZED_MERCHANT -> Known.UNAUTHORIZED_MERCHANT
                    VEHICLE_NUMBER_INVALID -> Known.VEHICLE_NUMBER_INVALID
                    CARDHOLDER_CHALLENGED -> Known.CARDHOLDER_CHALLENGED
                    CARDHOLDER_CHALLENGE_FAILED -> Known.CARDHOLDER_CHALLENGE_FAILED
                    else -> throw LithicInvalidDataException("Unknown DetailedResult: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): DetailedResult = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DetailedResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Indicates whether the transaction event is a credit or debit to the account. */
        class EffectivePolarity
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREDIT = of("CREDIT")

                @JvmField val DEBIT = of("DEBIT")

                @JvmStatic fun of(value: String) = EffectivePolarity(JsonField.of(value))
            }

            /** An enum containing [EffectivePolarity]'s known values. */
            enum class Known {
                CREDIT,
                DEBIT,
            }

            /**
             * An enum containing [EffectivePolarity]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [EffectivePolarity] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CREDIT,
                DEBIT,
                /**
                 * An enum member indicating that [EffectivePolarity] was instantiated with an
                 * unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CREDIT -> Value.CREDIT
                    DEBIT -> Value.DEBIT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CREDIT -> Known.CREDIT
                    DEBIT -> Known.DEBIT
                    else -> throw LithicInvalidDataException("Unknown EffectivePolarity: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): EffectivePolarity = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is EffectivePolarity && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * Information provided by the card network in each event. This includes common identifiers
         * shared between you, Lithic, the card network and in some cases the acquirer. These
         * identifiers often link together events within the same transaction lifecycle and can be
         * used to locate a particular transaction, such as during processing of disputes. Not all
         * fields are available in all events, and the presence of these fields is dependent on the
         * card network and the event type. If the field is populated by the network, we will pass
         * it through as is unless otherwise specified. Please consult the official network
         * documentation for more details about these fields and how to use them.
         */
        class NetworkInfo
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val acquirer: JsonField<Acquirer>,
            private val amex: JsonField<Amex>,
            private val mastercard: JsonField<Mastercard>,
            private val visa: JsonField<Visa>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("acquirer")
                @ExcludeMissing
                acquirer: JsonField<Acquirer> = JsonMissing.of(),
                @JsonProperty("amex") @ExcludeMissing amex: JsonField<Amex> = JsonMissing.of(),
                @JsonProperty("mastercard")
                @ExcludeMissing
                mastercard: JsonField<Mastercard> = JsonMissing.of(),
                @JsonProperty("visa") @ExcludeMissing visa: JsonField<Visa> = JsonMissing.of(),
            ) : this(acquirer, amex, mastercard, visa, mutableMapOf())

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun acquirer(): Optional<Acquirer> = acquirer.getOptional("acquirer")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun amex(): Optional<Amex> = amex.getOptional("amex")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun mastercard(): Optional<Mastercard> = mastercard.getOptional("mastercard")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun visa(): Optional<Visa> = visa.getOptional("visa")

            /**
             * Returns the raw JSON value of [acquirer].
             *
             * Unlike [acquirer], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("acquirer")
            @ExcludeMissing
            fun _acquirer(): JsonField<Acquirer> = acquirer

            /**
             * Returns the raw JSON value of [amex].
             *
             * Unlike [amex], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("amex") @ExcludeMissing fun _amex(): JsonField<Amex> = amex

            /**
             * Returns the raw JSON value of [mastercard].
             *
             * Unlike [mastercard], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("mastercard")
            @ExcludeMissing
            fun _mastercard(): JsonField<Mastercard> = mastercard

            /**
             * Returns the raw JSON value of [visa].
             *
             * Unlike [visa], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NetworkInfo].
                 *
                 * The following fields are required:
                 * ```java
                 * .acquirer()
                 * .amex()
                 * .mastercard()
                 * .visa()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NetworkInfo]. */
            class Builder internal constructor() {

                private var acquirer: JsonField<Acquirer>? = null
                private var amex: JsonField<Amex>? = null
                private var mastercard: JsonField<Mastercard>? = null
                private var visa: JsonField<Visa>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(networkInfo: NetworkInfo) = apply {
                    acquirer = networkInfo.acquirer
                    amex = networkInfo.amex
                    mastercard = networkInfo.mastercard
                    visa = networkInfo.visa
                    additionalProperties = networkInfo.additionalProperties.toMutableMap()
                }

                fun acquirer(acquirer: Acquirer?) = acquirer(JsonField.ofNullable(acquirer))

                /** Alias for calling [Builder.acquirer] with `acquirer.orElse(null)`. */
                fun acquirer(acquirer: Optional<Acquirer>) = acquirer(acquirer.getOrNull())

                /**
                 * Sets [Builder.acquirer] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.acquirer] with a well-typed [Acquirer] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun acquirer(acquirer: JsonField<Acquirer>) = apply { this.acquirer = acquirer }

                fun amex(amex: Amex?) = amex(JsonField.ofNullable(amex))

                /** Alias for calling [Builder.amex] with `amex.orElse(null)`. */
                fun amex(amex: Optional<Amex>) = amex(amex.getOrNull())

                /**
                 * Sets [Builder.amex] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.amex] with a well-typed [Amex] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun amex(amex: JsonField<Amex>) = apply { this.amex = amex }

                fun mastercard(mastercard: Mastercard?) =
                    mastercard(JsonField.ofNullable(mastercard))

                /** Alias for calling [Builder.mastercard] with `mastercard.orElse(null)`. */
                fun mastercard(mastercard: Optional<Mastercard>) =
                    mastercard(mastercard.getOrNull())

                /**
                 * Sets [Builder.mastercard] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mastercard] with a well-typed [Mastercard] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun mastercard(mastercard: JsonField<Mastercard>) = apply {
                    this.mastercard = mastercard
                }

                fun visa(visa: Visa?) = visa(JsonField.ofNullable(visa))

                /** Alias for calling [Builder.visa] with `visa.orElse(null)`. */
                fun visa(visa: Optional<Visa>) = visa(visa.getOrNull())

                /**
                 * Sets [Builder.visa] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.visa] with a well-typed [Visa] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [NetworkInfo].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .acquirer()
                 * .amex()
                 * .mastercard()
                 * .visa()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NetworkInfo =
                    NetworkInfo(
                        checkRequired("acquirer", acquirer),
                        checkRequired("amex", amex),
                        checkRequired("mastercard", mastercard),
                        checkRequired("visa", visa),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NetworkInfo = apply {
                if (validated) {
                    return@apply
                }

                acquirer().ifPresent { it.validate() }
                amex().ifPresent { it.validate() }
                mastercard().ifPresent { it.validate() }
                visa().ifPresent { it.validate() }
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (acquirer.asKnown().getOrNull()?.validity() ?: 0) +
                    (amex.asKnown().getOrNull()?.validity() ?: 0) +
                    (mastercard.asKnown().getOrNull()?.validity() ?: 0) +
                    (visa.asKnown().getOrNull()?.validity() ?: 0)

            class Acquirer
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val acquirerReferenceNumber: JsonField<String>,
                private val retrievalReferenceNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("acquirer_reference_number")
                    @ExcludeMissing
                    acquirerReferenceNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("retrieval_reference_number")
                    @ExcludeMissing
                    retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
                ) : this(acquirerReferenceNumber, retrievalReferenceNumber, mutableMapOf())

                /**
                 * Identifier assigned by the acquirer, applicable to dual-message transactions
                 * only. The acquirer reference number (ARN) is only populated once a transaction
                 * has been cleared, and it is not available in all transactions (such as automated
                 * fuel dispenser transactions). A single transaction can contain multiple ARNs if
                 * the merchant sends multiple clearings.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun acquirerReferenceNumber(): Optional<String> =
                    acquirerReferenceNumber.getOptional("acquirer_reference_number")

                /**
                 * Identifier assigned by the acquirer.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun retrievalReferenceNumber(): Optional<String> =
                    retrievalReferenceNumber.getOptional("retrieval_reference_number")

                /**
                 * Returns the raw JSON value of [acquirerReferenceNumber].
                 *
                 * Unlike [acquirerReferenceNumber], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("acquirer_reference_number")
                @ExcludeMissing
                fun _acquirerReferenceNumber(): JsonField<String> = acquirerReferenceNumber

                /**
                 * Returns the raw JSON value of [retrievalReferenceNumber].
                 *
                 * Unlike [retrievalReferenceNumber], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber(): JsonField<String> = retrievalReferenceNumber

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Acquirer].
                     *
                     * The following fields are required:
                     * ```java
                     * .acquirerReferenceNumber()
                     * .retrievalReferenceNumber()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Acquirer]. */
                class Builder internal constructor() {

                    private var acquirerReferenceNumber: JsonField<String>? = null
                    private var retrievalReferenceNumber: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(acquirer: Acquirer) = apply {
                        acquirerReferenceNumber = acquirer.acquirerReferenceNumber
                        retrievalReferenceNumber = acquirer.retrievalReferenceNumber
                        additionalProperties = acquirer.additionalProperties.toMutableMap()
                    }

                    /**
                     * Identifier assigned by the acquirer, applicable to dual-message transactions
                     * only. The acquirer reference number (ARN) is only populated once a
                     * transaction has been cleared, and it is not available in all transactions
                     * (such as automated fuel dispenser transactions). A single transaction can
                     * contain multiple ARNs if the merchant sends multiple clearings.
                     */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: String?) =
                        acquirerReferenceNumber(JsonField.ofNullable(acquirerReferenceNumber))

                    /**
                     * Alias for calling [Builder.acquirerReferenceNumber] with
                     * `acquirerReferenceNumber.orElse(null)`.
                     */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: Optional<String>) =
                        acquirerReferenceNumber(acquirerReferenceNumber.getOrNull())

                    /**
                     * Sets [Builder.acquirerReferenceNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.acquirerReferenceNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) =
                        apply {
                            this.acquirerReferenceNumber = acquirerReferenceNumber
                        }

                    /** Identifier assigned by the acquirer. */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: String?) =
                        retrievalReferenceNumber(JsonField.ofNullable(retrievalReferenceNumber))

                    /**
                     * Alias for calling [Builder.retrievalReferenceNumber] with
                     * `retrievalReferenceNumber.orElse(null)`.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: Optional<String>) =
                        retrievalReferenceNumber(retrievalReferenceNumber.getOrNull())

                    /**
                     * Sets [Builder.retrievalReferenceNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.retrievalReferenceNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Acquirer].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .acquirerReferenceNumber()
                     * .retrievalReferenceNumber()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Acquirer =
                        Acquirer(
                            checkRequired("acquirerReferenceNumber", acquirerReferenceNumber),
                            checkRequired("retrievalReferenceNumber", retrievalReferenceNumber),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Acquirer = apply {
                    if (validated) {
                        return@apply
                    }

                    acquirerReferenceNumber()
                    retrievalReferenceNumber()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (acquirerReferenceNumber.asKnown().isPresent) 1 else 0) +
                        (if (retrievalReferenceNumber.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Acquirer &&
                        acquirerReferenceNumber == other.acquirerReferenceNumber &&
                        retrievalReferenceNumber == other.retrievalReferenceNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        acquirerReferenceNumber,
                        retrievalReferenceNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Acquirer{acquirerReferenceNumber=$acquirerReferenceNumber, retrievalReferenceNumber=$retrievalReferenceNumber, additionalProperties=$additionalProperties}"
            }

            class Amex
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val originalTransactionId: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("original_transaction_id")
                    @ExcludeMissing
                    originalTransactionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    transactionId: JsonField<String> = JsonMissing.of(),
                ) : this(originalTransactionId, transactionId, mutableMapOf())

                /**
                 * Identifier assigned by American Express. Matches the `transaction_id` of a prior
                 * related event. May be populated in incremental authorizations (authorization
                 * requests that augment a previously authorized amount), authorization advices,
                 * financial authorizations, and clearings.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun originalTransactionId(): Optional<String> =
                    originalTransactionId.getOptional("original_transaction_id")

                /**
                 * Identifier assigned by American Express to link original messages to subsequent
                 * messages. Guaranteed by American Express to be unique for each original
                 * authorization and financial authorization.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

                /**
                 * Returns the raw JSON value of [originalTransactionId].
                 *
                 * Unlike [originalTransactionId], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("original_transaction_id")
                @ExcludeMissing
                fun _originalTransactionId(): JsonField<String> = originalTransactionId

                /**
                 * Returns the raw JSON value of [transactionId].
                 *
                 * Unlike [transactionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun _transactionId(): JsonField<String> = transactionId

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Amex].
                     *
                     * The following fields are required:
                     * ```java
                     * .originalTransactionId()
                     * .transactionId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Amex]. */
                class Builder internal constructor() {

                    private var originalTransactionId: JsonField<String>? = null
                    private var transactionId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(amex: Amex) = apply {
                        originalTransactionId = amex.originalTransactionId
                        transactionId = amex.transactionId
                        additionalProperties = amex.additionalProperties.toMutableMap()
                    }

                    /**
                     * Identifier assigned by American Express. Matches the `transaction_id` of a
                     * prior related event. May be populated in incremental authorizations
                     * (authorization requests that augment a previously authorized amount),
                     * authorization advices, financial authorizations, and clearings.
                     */
                    fun originalTransactionId(originalTransactionId: String?) =
                        originalTransactionId(JsonField.ofNullable(originalTransactionId))

                    /**
                     * Alias for calling [Builder.originalTransactionId] with
                     * `originalTransactionId.orElse(null)`.
                     */
                    fun originalTransactionId(originalTransactionId: Optional<String>) =
                        originalTransactionId(originalTransactionId.getOrNull())

                    /**
                     * Sets [Builder.originalTransactionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.originalTransactionId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun originalTransactionId(originalTransactionId: JsonField<String>) = apply {
                        this.originalTransactionId = originalTransactionId
                    }

                    /**
                     * Identifier assigned by American Express to link original messages to
                     * subsequent messages. Guaranteed by American Express to be unique for each
                     * original authorization and financial authorization.
                     */
                    fun transactionId(transactionId: String?) =
                        transactionId(JsonField.ofNullable(transactionId))

                    /**
                     * Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`.
                     */
                    fun transactionId(transactionId: Optional<String>) =
                        transactionId(transactionId.getOrNull())

                    /**
                     * Sets [Builder.transactionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transactionId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun transactionId(transactionId: JsonField<String>) = apply {
                        this.transactionId = transactionId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Amex].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .originalTransactionId()
                     * .transactionId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Amex =
                        Amex(
                            checkRequired("originalTransactionId", originalTransactionId),
                            checkRequired("transactionId", transactionId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Amex = apply {
                    if (validated) {
                        return@apply
                    }

                    originalTransactionId()
                    transactionId()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (originalTransactionId.asKnown().isPresent) 1 else 0) +
                        (if (transactionId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Amex &&
                        originalTransactionId == other.originalTransactionId &&
                        transactionId == other.transactionId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(originalTransactionId, transactionId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Amex{originalTransactionId=$originalTransactionId, transactionId=$transactionId, additionalProperties=$additionalProperties}"
            }

            class Mastercard
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val banknetReferenceNumber: JsonField<String>,
                private val originalBanknetReferenceNumber: JsonField<String>,
                private val originalSwitchSerialNumber: JsonField<String>,
                private val switchSerialNumber: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("banknet_reference_number")
                    @ExcludeMissing
                    banknetReferenceNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("original_banknet_reference_number")
                    @ExcludeMissing
                    originalBanknetReferenceNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("original_switch_serial_number")
                    @ExcludeMissing
                    originalSwitchSerialNumber: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("switch_serial_number")
                    @ExcludeMissing
                    switchSerialNumber: JsonField<String> = JsonMissing.of(),
                ) : this(
                    banknetReferenceNumber,
                    originalBanknetReferenceNumber,
                    originalSwitchSerialNumber,
                    switchSerialNumber,
                    mutableMapOf(),
                )

                /**
                 * Identifier assigned by Mastercard. Guaranteed by Mastercard to be unique for any
                 * transaction within a specific financial network on any processing day.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun banknetReferenceNumber(): Optional<String> =
                    banknetReferenceNumber.getOptional("banknet_reference_number")

                /**
                 * Identifier assigned by Mastercard. Matches the `banknet_reference_number` of a
                 * prior related event. May be populated in authorization reversals, incremental
                 * authorizations (authorization requests that augment a previously authorized
                 * amount), automated fuel dispenser authorization advices and clearings, and
                 * financial authorizations. If the original banknet reference number contains all
                 * zeroes, then no actual reference number could be found by the network or
                 * acquirer. If Mastercard converts a transaction from dual-message to
                 * single-message, such as for certain ATM transactions, it will populate the
                 * original banknet reference number in the resulting financial authorization with
                 * the banknet reference number of the initial authorization, which Lithic does not
                 * receive.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun originalBanknetReferenceNumber(): Optional<String> =
                    originalBanknetReferenceNumber.getOptional("original_banknet_reference_number")

                /**
                 * Identifier assigned by Mastercard. Matches the `switch_serial_number` of a prior
                 * related event. May be populated in returns and return reversals. Applicable to
                 * single-message transactions only.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun originalSwitchSerialNumber(): Optional<String> =
                    originalSwitchSerialNumber.getOptional("original_switch_serial_number")

                /**
                 * Identifier assigned by Mastercard, applicable to single-message transactions
                 * only.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun switchSerialNumber(): Optional<String> =
                    switchSerialNumber.getOptional("switch_serial_number")

                /**
                 * Returns the raw JSON value of [banknetReferenceNumber].
                 *
                 * Unlike [banknetReferenceNumber], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("banknet_reference_number")
                @ExcludeMissing
                fun _banknetReferenceNumber(): JsonField<String> = banknetReferenceNumber

                /**
                 * Returns the raw JSON value of [originalBanknetReferenceNumber].
                 *
                 * Unlike [originalBanknetReferenceNumber], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("original_banknet_reference_number")
                @ExcludeMissing
                fun _originalBanknetReferenceNumber(): JsonField<String> =
                    originalBanknetReferenceNumber

                /**
                 * Returns the raw JSON value of [originalSwitchSerialNumber].
                 *
                 * Unlike [originalSwitchSerialNumber], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("original_switch_serial_number")
                @ExcludeMissing
                fun _originalSwitchSerialNumber(): JsonField<String> = originalSwitchSerialNumber

                /**
                 * Returns the raw JSON value of [switchSerialNumber].
                 *
                 * Unlike [switchSerialNumber], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("switch_serial_number")
                @ExcludeMissing
                fun _switchSerialNumber(): JsonField<String> = switchSerialNumber

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Mastercard].
                     *
                     * The following fields are required:
                     * ```java
                     * .banknetReferenceNumber()
                     * .originalBanknetReferenceNumber()
                     * .originalSwitchSerialNumber()
                     * .switchSerialNumber()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Mastercard]. */
                class Builder internal constructor() {

                    private var banknetReferenceNumber: JsonField<String>? = null
                    private var originalBanknetReferenceNumber: JsonField<String>? = null
                    private var originalSwitchSerialNumber: JsonField<String>? = null
                    private var switchSerialNumber: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(mastercard: Mastercard) = apply {
                        banknetReferenceNumber = mastercard.banknetReferenceNumber
                        originalBanknetReferenceNumber = mastercard.originalBanknetReferenceNumber
                        originalSwitchSerialNumber = mastercard.originalSwitchSerialNumber
                        switchSerialNumber = mastercard.switchSerialNumber
                        additionalProperties = mastercard.additionalProperties.toMutableMap()
                    }

                    /**
                     * Identifier assigned by Mastercard. Guaranteed by Mastercard to be unique for
                     * any transaction within a specific financial network on any processing day.
                     */
                    fun banknetReferenceNumber(banknetReferenceNumber: String?) =
                        banknetReferenceNumber(JsonField.ofNullable(banknetReferenceNumber))

                    /**
                     * Alias for calling [Builder.banknetReferenceNumber] with
                     * `banknetReferenceNumber.orElse(null)`.
                     */
                    fun banknetReferenceNumber(banknetReferenceNumber: Optional<String>) =
                        banknetReferenceNumber(banknetReferenceNumber.getOrNull())

                    /**
                     * Sets [Builder.banknetReferenceNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.banknetReferenceNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun banknetReferenceNumber(banknetReferenceNumber: JsonField<String>) = apply {
                        this.banknetReferenceNumber = banknetReferenceNumber
                    }

                    /**
                     * Identifier assigned by Mastercard. Matches the `banknet_reference_number` of
                     * a prior related event. May be populated in authorization reversals,
                     * incremental authorizations (authorization requests that augment a previously
                     * authorized amount), automated fuel dispenser authorization advices and
                     * clearings, and financial authorizations. If the original banknet reference
                     * number contains all zeroes, then no actual reference number could be found by
                     * the network or acquirer. If Mastercard converts a transaction from
                     * dual-message to single-message, such as for certain ATM transactions, it will
                     * populate the original banknet reference number in the resulting financial
                     * authorization with the banknet reference number of the initial authorization,
                     * which Lithic does not receive.
                     */
                    fun originalBanknetReferenceNumber(originalBanknetReferenceNumber: String?) =
                        originalBanknetReferenceNumber(
                            JsonField.ofNullable(originalBanknetReferenceNumber)
                        )

                    /**
                     * Alias for calling [Builder.originalBanknetReferenceNumber] with
                     * `originalBanknetReferenceNumber.orElse(null)`.
                     */
                    fun originalBanknetReferenceNumber(
                        originalBanknetReferenceNumber: Optional<String>
                    ) = originalBanknetReferenceNumber(originalBanknetReferenceNumber.getOrNull())

                    /**
                     * Sets [Builder.originalBanknetReferenceNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.originalBanknetReferenceNumber] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun originalBanknetReferenceNumber(
                        originalBanknetReferenceNumber: JsonField<String>
                    ) = apply {
                        this.originalBanknetReferenceNumber = originalBanknetReferenceNumber
                    }

                    /**
                     * Identifier assigned by Mastercard. Matches the `switch_serial_number` of a
                     * prior related event. May be populated in returns and return reversals.
                     * Applicable to single-message transactions only.
                     */
                    fun originalSwitchSerialNumber(originalSwitchSerialNumber: String?) =
                        originalSwitchSerialNumber(JsonField.ofNullable(originalSwitchSerialNumber))

                    /**
                     * Alias for calling [Builder.originalSwitchSerialNumber] with
                     * `originalSwitchSerialNumber.orElse(null)`.
                     */
                    fun originalSwitchSerialNumber(originalSwitchSerialNumber: Optional<String>) =
                        originalSwitchSerialNumber(originalSwitchSerialNumber.getOrNull())

                    /**
                     * Sets [Builder.originalSwitchSerialNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.originalSwitchSerialNumber] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun originalSwitchSerialNumber(originalSwitchSerialNumber: JsonField<String>) =
                        apply {
                            this.originalSwitchSerialNumber = originalSwitchSerialNumber
                        }

                    /**
                     * Identifier assigned by Mastercard, applicable to single-message transactions
                     * only.
                     */
                    fun switchSerialNumber(switchSerialNumber: String?) =
                        switchSerialNumber(JsonField.ofNullable(switchSerialNumber))

                    /**
                     * Alias for calling [Builder.switchSerialNumber] with
                     * `switchSerialNumber.orElse(null)`.
                     */
                    fun switchSerialNumber(switchSerialNumber: Optional<String>) =
                        switchSerialNumber(switchSerialNumber.getOrNull())

                    /**
                     * Sets [Builder.switchSerialNumber] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.switchSerialNumber] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun switchSerialNumber(switchSerialNumber: JsonField<String>) = apply {
                        this.switchSerialNumber = switchSerialNumber
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Mastercard].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .banknetReferenceNumber()
                     * .originalBanknetReferenceNumber()
                     * .originalSwitchSerialNumber()
                     * .switchSerialNumber()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Mastercard =
                        Mastercard(
                            checkRequired("banknetReferenceNumber", banknetReferenceNumber),
                            checkRequired(
                                "originalBanknetReferenceNumber",
                                originalBanknetReferenceNumber,
                            ),
                            checkRequired("originalSwitchSerialNumber", originalSwitchSerialNumber),
                            checkRequired("switchSerialNumber", switchSerialNumber),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Mastercard = apply {
                    if (validated) {
                        return@apply
                    }

                    banknetReferenceNumber()
                    originalBanknetReferenceNumber()
                    originalSwitchSerialNumber()
                    switchSerialNumber()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (banknetReferenceNumber.asKnown().isPresent) 1 else 0) +
                        (if (originalBanknetReferenceNumber.asKnown().isPresent) 1 else 0) +
                        (if (originalSwitchSerialNumber.asKnown().isPresent) 1 else 0) +
                        (if (switchSerialNumber.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Mastercard &&
                        banknetReferenceNumber == other.banknetReferenceNumber &&
                        originalBanknetReferenceNumber == other.originalBanknetReferenceNumber &&
                        originalSwitchSerialNumber == other.originalSwitchSerialNumber &&
                        switchSerialNumber == other.switchSerialNumber &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        banknetReferenceNumber,
                        originalBanknetReferenceNumber,
                        originalSwitchSerialNumber,
                        switchSerialNumber,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Mastercard{banknetReferenceNumber=$banknetReferenceNumber, originalBanknetReferenceNumber=$originalBanknetReferenceNumber, originalSwitchSerialNumber=$originalSwitchSerialNumber, switchSerialNumber=$switchSerialNumber, additionalProperties=$additionalProperties}"
            }

            class Visa
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val originalTransactionId: JsonField<String>,
                private val transactionId: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("original_transaction_id")
                    @ExcludeMissing
                    originalTransactionId: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("transaction_id")
                    @ExcludeMissing
                    transactionId: JsonField<String> = JsonMissing.of(),
                ) : this(originalTransactionId, transactionId, mutableMapOf())

                /**
                 * Identifier assigned by Visa. Matches the `transaction_id` of a prior related
                 * event. May be populated in incremental authorizations (authorization requests
                 * that augment a previously authorized amount), authorization advices, financial
                 * authorizations, and clearings.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun originalTransactionId(): Optional<String> =
                    originalTransactionId.getOptional("original_transaction_id")

                /**
                 * Identifier assigned by Visa to link original messages to subsequent messages.
                 * Guaranteed by Visa to be unique for each original authorization and financial
                 * authorization.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun transactionId(): Optional<String> = transactionId.getOptional("transaction_id")

                /**
                 * Returns the raw JSON value of [originalTransactionId].
                 *
                 * Unlike [originalTransactionId], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("original_transaction_id")
                @ExcludeMissing
                fun _originalTransactionId(): JsonField<String> = originalTransactionId

                /**
                 * Returns the raw JSON value of [transactionId].
                 *
                 * Unlike [transactionId], this method doesn't throw if the JSON field has an
                 * unexpected type.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun _transactionId(): JsonField<String> = transactionId

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of [Visa].
                     *
                     * The following fields are required:
                     * ```java
                     * .originalTransactionId()
                     * .transactionId()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Visa]. */
                class Builder internal constructor() {

                    private var originalTransactionId: JsonField<String>? = null
                    private var transactionId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(visa: Visa) = apply {
                        originalTransactionId = visa.originalTransactionId
                        transactionId = visa.transactionId
                        additionalProperties = visa.additionalProperties.toMutableMap()
                    }

                    /**
                     * Identifier assigned by Visa. Matches the `transaction_id` of a prior related
                     * event. May be populated in incremental authorizations (authorization requests
                     * that augment a previously authorized amount), authorization advices,
                     * financial authorizations, and clearings.
                     */
                    fun originalTransactionId(originalTransactionId: String?) =
                        originalTransactionId(JsonField.ofNullable(originalTransactionId))

                    /**
                     * Alias for calling [Builder.originalTransactionId] with
                     * `originalTransactionId.orElse(null)`.
                     */
                    fun originalTransactionId(originalTransactionId: Optional<String>) =
                        originalTransactionId(originalTransactionId.getOrNull())

                    /**
                     * Sets [Builder.originalTransactionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.originalTransactionId] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun originalTransactionId(originalTransactionId: JsonField<String>) = apply {
                        this.originalTransactionId = originalTransactionId
                    }

                    /**
                     * Identifier assigned by Visa to link original messages to subsequent messages.
                     * Guaranteed by Visa to be unique for each original authorization and financial
                     * authorization.
                     */
                    fun transactionId(transactionId: String?) =
                        transactionId(JsonField.ofNullable(transactionId))

                    /**
                     * Alias for calling [Builder.transactionId] with `transactionId.orElse(null)`.
                     */
                    fun transactionId(transactionId: Optional<String>) =
                        transactionId(transactionId.getOrNull())

                    /**
                     * Sets [Builder.transactionId] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transactionId] with a well-typed [String]
                     * value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun transactionId(transactionId: JsonField<String>) = apply {
                        this.transactionId = transactionId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [Visa].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .originalTransactionId()
                     * .transactionId()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): Visa =
                        Visa(
                            checkRequired("originalTransactionId", originalTransactionId),
                            checkRequired("transactionId", transactionId),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): Visa = apply {
                    if (validated) {
                        return@apply
                    }

                    originalTransactionId()
                    transactionId()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (originalTransactionId.asKnown().isPresent) 1 else 0) +
                        (if (transactionId.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Visa &&
                        originalTransactionId == other.originalTransactionId &&
                        transactionId == other.transactionId &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(originalTransactionId, transactionId, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Visa{originalTransactionId=$originalTransactionId, transactionId=$transactionId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NetworkInfo &&
                    acquirer == other.acquirer &&
                    amex == other.amex &&
                    mastercard == other.mastercard &&
                    visa == other.visa &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(acquirer, amex, mastercard, visa, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NetworkInfo{acquirer=$acquirer, amex=$amex, mastercard=$mastercard, visa=$visa, additionalProperties=$additionalProperties}"
        }

        class DeclineResult @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCOUNT_PAUSED = of("ACCOUNT_PAUSED")

                @JvmField val ACCOUNT_STATE_TRANSACTION_FAIL = of("ACCOUNT_STATE_TRANSACTION_FAIL")

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val BANK_CONNECTION_ERROR = of("BANK_CONNECTION_ERROR")

                @JvmField val BANK_NOT_VERIFIED = of("BANK_NOT_VERIFIED")

                @JvmField val CARD_CLOSED = of("CARD_CLOSED")

                @JvmField val CARD_PAUSED = of("CARD_PAUSED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val FRAUD_ADVICE = of("FRAUD_ADVICE")

                @JvmField val IGNORED_TTL_EXPIRY = of("IGNORED_TTL_EXPIRY")

                @JvmField val SUSPECTED_FRAUD = of("SUSPECTED_FRAUD")

                @JvmField val INACTIVE_ACCOUNT = of("INACTIVE_ACCOUNT")

                @JvmField val INCORRECT_PIN = of("INCORRECT_PIN")

                @JvmField val INVALID_CARD_DETAILS = of("INVALID_CARD_DETAILS")

                @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

                @JvmField val INSUFFICIENT_FUNDS_PRELOAD = of("INSUFFICIENT_FUNDS_PRELOAD")

                @JvmField val INVALID_TRANSACTION = of("INVALID_TRANSACTION")

                @JvmField val MERCHANT_BLACKLIST = of("MERCHANT_BLACKLIST")

                @JvmField val ORIGINAL_NOT_FOUND = of("ORIGINAL_NOT_FOUND")

                @JvmField val PREVIOUSLY_COMPLETED = of("PREVIOUSLY_COMPLETED")

                @JvmField val SINGLE_USE_RECHARGED = of("SINGLE_USE_RECHARGED")

                @JvmField val SWITCH_INOPERATIVE_ADVICE = of("SWITCH_INOPERATIVE_ADVICE")

                @JvmField val UNAUTHORIZED_MERCHANT = of("UNAUTHORIZED_MERCHANT")

                @JvmField val UNKNOWN_HOST_TIMEOUT = of("UNKNOWN_HOST_TIMEOUT")

                @JvmField val USER_TRANSACTION_LIMIT = of("USER_TRANSACTION_LIMIT")

                @JvmStatic fun of(value: String) = DeclineResult(JsonField.of(value))
            }

            /** An enum containing [DeclineResult]'s known values. */
            enum class Known {
                ACCOUNT_PAUSED,
                ACCOUNT_STATE_TRANSACTION_FAIL,
                APPROVED,
                BANK_CONNECTION_ERROR,
                BANK_NOT_VERIFIED,
                CARD_CLOSED,
                CARD_PAUSED,
                DECLINED,
                FRAUD_ADVICE,
                IGNORED_TTL_EXPIRY,
                SUSPECTED_FRAUD,
                INACTIVE_ACCOUNT,
                INCORRECT_PIN,
                INVALID_CARD_DETAILS,
                INSUFFICIENT_FUNDS,
                INSUFFICIENT_FUNDS_PRELOAD,
                INVALID_TRANSACTION,
                MERCHANT_BLACKLIST,
                ORIGINAL_NOT_FOUND,
                PREVIOUSLY_COMPLETED,
                SINGLE_USE_RECHARGED,
                SWITCH_INOPERATIVE_ADVICE,
                UNAUTHORIZED_MERCHANT,
                UNKNOWN_HOST_TIMEOUT,
                USER_TRANSACTION_LIMIT,
            }

            /**
             * An enum containing [DeclineResult]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DeclineResult] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ACCOUNT_PAUSED,
                ACCOUNT_STATE_TRANSACTION_FAIL,
                APPROVED,
                BANK_CONNECTION_ERROR,
                BANK_NOT_VERIFIED,
                CARD_CLOSED,
                CARD_PAUSED,
                DECLINED,
                FRAUD_ADVICE,
                IGNORED_TTL_EXPIRY,
                SUSPECTED_FRAUD,
                INACTIVE_ACCOUNT,
                INCORRECT_PIN,
                INVALID_CARD_DETAILS,
                INSUFFICIENT_FUNDS,
                INSUFFICIENT_FUNDS_PRELOAD,
                INVALID_TRANSACTION,
                MERCHANT_BLACKLIST,
                ORIGINAL_NOT_FOUND,
                PREVIOUSLY_COMPLETED,
                SINGLE_USE_RECHARGED,
                SWITCH_INOPERATIVE_ADVICE,
                UNAUTHORIZED_MERCHANT,
                UNKNOWN_HOST_TIMEOUT,
                USER_TRANSACTION_LIMIT,
                /**
                 * An enum member indicating that [DeclineResult] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACCOUNT_PAUSED -> Value.ACCOUNT_PAUSED
                    ACCOUNT_STATE_TRANSACTION_FAIL -> Value.ACCOUNT_STATE_TRANSACTION_FAIL
                    APPROVED -> Value.APPROVED
                    BANK_CONNECTION_ERROR -> Value.BANK_CONNECTION_ERROR
                    BANK_NOT_VERIFIED -> Value.BANK_NOT_VERIFIED
                    CARD_CLOSED -> Value.CARD_CLOSED
                    CARD_PAUSED -> Value.CARD_PAUSED
                    DECLINED -> Value.DECLINED
                    FRAUD_ADVICE -> Value.FRAUD_ADVICE
                    IGNORED_TTL_EXPIRY -> Value.IGNORED_TTL_EXPIRY
                    SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                    INACTIVE_ACCOUNT -> Value.INACTIVE_ACCOUNT
                    INCORRECT_PIN -> Value.INCORRECT_PIN
                    INVALID_CARD_DETAILS -> Value.INVALID_CARD_DETAILS
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    INSUFFICIENT_FUNDS_PRELOAD -> Value.INSUFFICIENT_FUNDS_PRELOAD
                    INVALID_TRANSACTION -> Value.INVALID_TRANSACTION
                    MERCHANT_BLACKLIST -> Value.MERCHANT_BLACKLIST
                    ORIGINAL_NOT_FOUND -> Value.ORIGINAL_NOT_FOUND
                    PREVIOUSLY_COMPLETED -> Value.PREVIOUSLY_COMPLETED
                    SINGLE_USE_RECHARGED -> Value.SINGLE_USE_RECHARGED
                    SWITCH_INOPERATIVE_ADVICE -> Value.SWITCH_INOPERATIVE_ADVICE
                    UNAUTHORIZED_MERCHANT -> Value.UNAUTHORIZED_MERCHANT
                    UNKNOWN_HOST_TIMEOUT -> Value.UNKNOWN_HOST_TIMEOUT
                    USER_TRANSACTION_LIMIT -> Value.USER_TRANSACTION_LIMIT
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACCOUNT_PAUSED -> Known.ACCOUNT_PAUSED
                    ACCOUNT_STATE_TRANSACTION_FAIL -> Known.ACCOUNT_STATE_TRANSACTION_FAIL
                    APPROVED -> Known.APPROVED
                    BANK_CONNECTION_ERROR -> Known.BANK_CONNECTION_ERROR
                    BANK_NOT_VERIFIED -> Known.BANK_NOT_VERIFIED
                    CARD_CLOSED -> Known.CARD_CLOSED
                    CARD_PAUSED -> Known.CARD_PAUSED
                    DECLINED -> Known.DECLINED
                    FRAUD_ADVICE -> Known.FRAUD_ADVICE
                    IGNORED_TTL_EXPIRY -> Known.IGNORED_TTL_EXPIRY
                    SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                    INACTIVE_ACCOUNT -> Known.INACTIVE_ACCOUNT
                    INCORRECT_PIN -> Known.INCORRECT_PIN
                    INVALID_CARD_DETAILS -> Known.INVALID_CARD_DETAILS
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    INSUFFICIENT_FUNDS_PRELOAD -> Known.INSUFFICIENT_FUNDS_PRELOAD
                    INVALID_TRANSACTION -> Known.INVALID_TRANSACTION
                    MERCHANT_BLACKLIST -> Known.MERCHANT_BLACKLIST
                    ORIGINAL_NOT_FOUND -> Known.ORIGINAL_NOT_FOUND
                    PREVIOUSLY_COMPLETED -> Known.PREVIOUSLY_COMPLETED
                    SINGLE_USE_RECHARGED -> Known.SINGLE_USE_RECHARGED
                    SWITCH_INOPERATIVE_ADVICE -> Known.SWITCH_INOPERATIVE_ADVICE
                    UNAUTHORIZED_MERCHANT -> Known.UNAUTHORIZED_MERCHANT
                    UNKNOWN_HOST_TIMEOUT -> Known.UNKNOWN_HOST_TIMEOUT
                    USER_TRANSACTION_LIMIT -> Known.USER_TRANSACTION_LIMIT
                    else -> throw LithicInvalidDataException("Unknown DeclineResult: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): DeclineResult = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DeclineResult && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class RuleResult
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val authRuleToken: JsonField<String>,
            private val explanation: JsonField<String>,
            private val name: JsonField<String>,
            private val result: JsonField<DetailedResult>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("auth_rule_token")
                @ExcludeMissing
                authRuleToken: JsonField<String> = JsonMissing.of(),
                @JsonProperty("explanation")
                @ExcludeMissing
                explanation: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("result")
                @ExcludeMissing
                result: JsonField<DetailedResult> = JsonMissing.of(),
            ) : this(authRuleToken, explanation, name, result, mutableMapOf())

            /**
             * The Auth Rule Token associated with the rule from which the decline originated. If
             * this is set to null, then the decline was not associated with a customer-configured
             * Auth Rule. This may happen in cases where a transaction is declined due to a
             * Lithic-configured security or compliance rule, for example.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun authRuleToken(): Optional<String> = authRuleToken.getOptional("auth_rule_token")

            /**
             * A human-readable explanation outlining the motivation for the rule's decline.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun explanation(): Optional<String> = explanation.getOptional("explanation")

            /**
             * The name for the rule, if any was configured.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if
             *   the server responded with an unexpected value).
             */
            fun name(): Optional<String> = name.getOptional("name")

            /**
             * The detailed_result associated with this rule's decline.
             *
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun result(): DetailedResult = result.getRequired("result")

            /**
             * Returns the raw JSON value of [authRuleToken].
             *
             * Unlike [authRuleToken], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("auth_rule_token")
            @ExcludeMissing
            fun _authRuleToken(): JsonField<String> = authRuleToken

            /**
             * Returns the raw JSON value of [explanation].
             *
             * Unlike [explanation], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("explanation")
            @ExcludeMissing
            fun _explanation(): JsonField<String> = explanation

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [result].
             *
             * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("result")
            @ExcludeMissing
            fun _result(): JsonField<DetailedResult> = result

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [RuleResult].
                 *
                 * The following fields are required:
                 * ```java
                 * .authRuleToken()
                 * .explanation()
                 * .name()
                 * .result()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [RuleResult]. */
            class Builder internal constructor() {

                private var authRuleToken: JsonField<String>? = null
                private var explanation: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var result: JsonField<DetailedResult>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ruleResult: RuleResult) = apply {
                    authRuleToken = ruleResult.authRuleToken
                    explanation = ruleResult.explanation
                    name = ruleResult.name
                    result = ruleResult.result
                    additionalProperties = ruleResult.additionalProperties.toMutableMap()
                }

                /**
                 * The Auth Rule Token associated with the rule from which the decline originated.
                 * If this is set to null, then the decline was not associated with a
                 * customer-configured Auth Rule. This may happen in cases where a transaction is
                 * declined due to a Lithic-configured security or compliance rule, for example.
                 */
                fun authRuleToken(authRuleToken: String?) =
                    authRuleToken(JsonField.ofNullable(authRuleToken))

                /** Alias for calling [Builder.authRuleToken] with `authRuleToken.orElse(null)`. */
                fun authRuleToken(authRuleToken: Optional<String>) =
                    authRuleToken(authRuleToken.getOrNull())

                /**
                 * Sets [Builder.authRuleToken] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.authRuleToken] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun authRuleToken(authRuleToken: JsonField<String>) = apply {
                    this.authRuleToken = authRuleToken
                }

                /** A human-readable explanation outlining the motivation for the rule's decline. */
                fun explanation(explanation: String?) =
                    explanation(JsonField.ofNullable(explanation))

                /** Alias for calling [Builder.explanation] with `explanation.orElse(null)`. */
                fun explanation(explanation: Optional<String>) =
                    explanation(explanation.getOrNull())

                /**
                 * Sets [Builder.explanation] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.explanation] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun explanation(explanation: JsonField<String>) = apply {
                    this.explanation = explanation
                }

                /** The name for the rule, if any was configured. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** Alias for calling [Builder.name] with `name.orElse(null)`. */
                fun name(name: Optional<String>) = name(name.getOrNull())

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The detailed_result associated with this rule's decline. */
                fun result(result: DetailedResult) = result(JsonField.of(result))

                /**
                 * Sets [Builder.result] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.result] with a well-typed [DetailedResult] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun result(result: JsonField<DetailedResult>) = apply { this.result = result }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [RuleResult].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .authRuleToken()
                 * .explanation()
                 * .name()
                 * .result()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): RuleResult =
                    RuleResult(
                        checkRequired("authRuleToken", authRuleToken),
                        checkRequired("explanation", explanation),
                        checkRequired("name", name),
                        checkRequired("result", result),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): RuleResult = apply {
                if (validated) {
                    return@apply
                }

                authRuleToken()
                explanation()
                name()
                result().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (if (authRuleToken.asKnown().isPresent) 1 else 0) +
                    (if (explanation.asKnown().isPresent) 1 else 0) +
                    (if (name.asKnown().isPresent) 1 else 0) +
                    (result.asKnown().getOrNull()?.validity() ?: 0)

            /** The detailed_result associated with this rule's decline. */
            class DetailedResult
            @JsonCreator
            private constructor(private val value: JsonField<String>) : Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField
                    val ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED =
                        of("ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED")

                    @JvmField val ACCOUNT_DELINQUENT = of("ACCOUNT_DELINQUENT")

                    @JvmField val ACCOUNT_INACTIVE = of("ACCOUNT_INACTIVE")

                    @JvmField
                    val ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED =
                        of("ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED")

                    @JvmField
                    val ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED =
                        of("ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED")

                    @JvmField val ACCOUNT_PAUSED = of("ACCOUNT_PAUSED")

                    @JvmField val ACCOUNT_UNDER_REVIEW = of("ACCOUNT_UNDER_REVIEW")

                    @JvmField val ADDRESS_INCORRECT = of("ADDRESS_INCORRECT")

                    @JvmField val APPROVED = of("APPROVED")

                    @JvmField val AUTH_RULE_ALLOWED_COUNTRY = of("AUTH_RULE_ALLOWED_COUNTRY")

                    @JvmField val AUTH_RULE_ALLOWED_MCC = of("AUTH_RULE_ALLOWED_MCC")

                    @JvmField val AUTH_RULE_BLOCKED_COUNTRY = of("AUTH_RULE_BLOCKED_COUNTRY")

                    @JvmField val AUTH_RULE_BLOCKED_MCC = of("AUTH_RULE_BLOCKED_MCC")

                    @JvmField val CARD_CLOSED = of("CARD_CLOSED")

                    @JvmField
                    val CARD_CRYPTOGRAM_VALIDATION_FAILURE =
                        of("CARD_CRYPTOGRAM_VALIDATION_FAILURE")

                    @JvmField val CARD_EXPIRED = of("CARD_EXPIRED")

                    @JvmField val CARD_EXPIRY_DATE_INCORRECT = of("CARD_EXPIRY_DATE_INCORRECT")

                    @JvmField val CARD_INVALID = of("CARD_INVALID")

                    @JvmField val CARD_NOT_ACTIVATED = of("CARD_NOT_ACTIVATED")

                    @JvmField val CARD_PAUSED = of("CARD_PAUSED")

                    @JvmField val CARD_PIN_INCORRECT = of("CARD_PIN_INCORRECT")

                    @JvmField val CARD_RESTRICTED = of("CARD_RESTRICTED")

                    @JvmField val CARD_SECURITY_CODE_INCORRECT = of("CARD_SECURITY_CODE_INCORRECT")

                    @JvmField val CARD_SPEND_LIMIT_EXCEEDED = of("CARD_SPEND_LIMIT_EXCEEDED")

                    @JvmField val CONTACT_CARD_ISSUER = of("CONTACT_CARD_ISSUER")

                    @JvmField val CUSTOMER_ASA_TIMEOUT = of("CUSTOMER_ASA_TIMEOUT")

                    @JvmField val CUSTOM_ASA_RESULT = of("CUSTOM_ASA_RESULT")

                    @JvmField val DECLINED = of("DECLINED")

                    @JvmField val DO_NOT_HONOR = of("DO_NOT_HONOR")

                    @JvmField val DRIVER_NUMBER_INVALID = of("DRIVER_NUMBER_INVALID")

                    @JvmField val FORMAT_ERROR = of("FORMAT_ERROR")

                    @JvmField
                    val INSUFFICIENT_FUNDING_SOURCE_BALANCE =
                        of("INSUFFICIENT_FUNDING_SOURCE_BALANCE")

                    @JvmField val INSUFFICIENT_FUNDS = of("INSUFFICIENT_FUNDS")

                    @JvmField val LITHIC_SYSTEM_ERROR = of("LITHIC_SYSTEM_ERROR")

                    @JvmField val LITHIC_SYSTEM_RATE_LIMIT = of("LITHIC_SYSTEM_RATE_LIMIT")

                    @JvmField val MALFORMED_ASA_RESPONSE = of("MALFORMED_ASA_RESPONSE")

                    @JvmField val MERCHANT_INVALID = of("MERCHANT_INVALID")

                    @JvmField
                    val MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE =
                        of("MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE")

                    @JvmField val MERCHANT_NOT_PERMITTED = of("MERCHANT_NOT_PERMITTED")

                    @JvmField val OVER_REVERSAL_ATTEMPTED = of("OVER_REVERSAL_ATTEMPTED")

                    @JvmField val PIN_BLOCKED = of("PIN_BLOCKED")

                    @JvmField
                    val PROGRAM_CARD_SPEND_LIMIT_EXCEEDED = of("PROGRAM_CARD_SPEND_LIMIT_EXCEEDED")

                    @JvmField val PROGRAM_SUSPENDED = of("PROGRAM_SUSPENDED")

                    @JvmField val PROGRAM_USAGE_RESTRICTION = of("PROGRAM_USAGE_RESTRICTION")

                    @JvmField val REVERSAL_UNMATCHED = of("REVERSAL_UNMATCHED")

                    @JvmField val SECURITY_VIOLATION = of("SECURITY_VIOLATION")

                    @JvmField val SINGLE_USE_CARD_REATTEMPTED = of("SINGLE_USE_CARD_REATTEMPTED")

                    @JvmField val SUSPECTED_FRAUD = of("SUSPECTED_FRAUD")

                    @JvmField val TRANSACTION_INVALID = of("TRANSACTION_INVALID")

                    @JvmField
                    val TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL =
                        of("TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL")

                    @JvmField
                    val TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER =
                        of("TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER")

                    @JvmField
                    val TRANSACTION_PREVIOUSLY_COMPLETED = of("TRANSACTION_PREVIOUSLY_COMPLETED")

                    @JvmField val UNAUTHORIZED_MERCHANT = of("UNAUTHORIZED_MERCHANT")

                    @JvmField val VEHICLE_NUMBER_INVALID = of("VEHICLE_NUMBER_INVALID")

                    @JvmField val CARDHOLDER_CHALLENGED = of("CARDHOLDER_CHALLENGED")

                    @JvmField val CARDHOLDER_CHALLENGE_FAILED = of("CARDHOLDER_CHALLENGE_FAILED")

                    @JvmStatic fun of(value: String) = DetailedResult(JsonField.of(value))
                }

                /** An enum containing [DetailedResult]'s known values. */
                enum class Known {
                    ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED,
                    ACCOUNT_DELINQUENT,
                    ACCOUNT_INACTIVE,
                    ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED,
                    ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED,
                    ACCOUNT_PAUSED,
                    ACCOUNT_UNDER_REVIEW,
                    ADDRESS_INCORRECT,
                    APPROVED,
                    AUTH_RULE_ALLOWED_COUNTRY,
                    AUTH_RULE_ALLOWED_MCC,
                    AUTH_RULE_BLOCKED_COUNTRY,
                    AUTH_RULE_BLOCKED_MCC,
                    CARD_CLOSED,
                    CARD_CRYPTOGRAM_VALIDATION_FAILURE,
                    CARD_EXPIRED,
                    CARD_EXPIRY_DATE_INCORRECT,
                    CARD_INVALID,
                    CARD_NOT_ACTIVATED,
                    CARD_PAUSED,
                    CARD_PIN_INCORRECT,
                    CARD_RESTRICTED,
                    CARD_SECURITY_CODE_INCORRECT,
                    CARD_SPEND_LIMIT_EXCEEDED,
                    CONTACT_CARD_ISSUER,
                    CUSTOMER_ASA_TIMEOUT,
                    CUSTOM_ASA_RESULT,
                    DECLINED,
                    DO_NOT_HONOR,
                    DRIVER_NUMBER_INVALID,
                    FORMAT_ERROR,
                    INSUFFICIENT_FUNDING_SOURCE_BALANCE,
                    INSUFFICIENT_FUNDS,
                    LITHIC_SYSTEM_ERROR,
                    LITHIC_SYSTEM_RATE_LIMIT,
                    MALFORMED_ASA_RESPONSE,
                    MERCHANT_INVALID,
                    MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE,
                    MERCHANT_NOT_PERMITTED,
                    OVER_REVERSAL_ATTEMPTED,
                    PIN_BLOCKED,
                    PROGRAM_CARD_SPEND_LIMIT_EXCEEDED,
                    PROGRAM_SUSPENDED,
                    PROGRAM_USAGE_RESTRICTION,
                    REVERSAL_UNMATCHED,
                    SECURITY_VIOLATION,
                    SINGLE_USE_CARD_REATTEMPTED,
                    SUSPECTED_FRAUD,
                    TRANSACTION_INVALID,
                    TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL,
                    TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER,
                    TRANSACTION_PREVIOUSLY_COMPLETED,
                    UNAUTHORIZED_MERCHANT,
                    VEHICLE_NUMBER_INVALID,
                    CARDHOLDER_CHALLENGED,
                    CARDHOLDER_CHALLENGE_FAILED,
                }

                /**
                 * An enum containing [DetailedResult]'s known values, as well as an [_UNKNOWN]
                 * member.
                 *
                 * An instance of [DetailedResult] can contain an unknown value in a couple of
                 * cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED,
                    ACCOUNT_DELINQUENT,
                    ACCOUNT_INACTIVE,
                    ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED,
                    ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED,
                    ACCOUNT_PAUSED,
                    ACCOUNT_UNDER_REVIEW,
                    ADDRESS_INCORRECT,
                    APPROVED,
                    AUTH_RULE_ALLOWED_COUNTRY,
                    AUTH_RULE_ALLOWED_MCC,
                    AUTH_RULE_BLOCKED_COUNTRY,
                    AUTH_RULE_BLOCKED_MCC,
                    CARD_CLOSED,
                    CARD_CRYPTOGRAM_VALIDATION_FAILURE,
                    CARD_EXPIRED,
                    CARD_EXPIRY_DATE_INCORRECT,
                    CARD_INVALID,
                    CARD_NOT_ACTIVATED,
                    CARD_PAUSED,
                    CARD_PIN_INCORRECT,
                    CARD_RESTRICTED,
                    CARD_SECURITY_CODE_INCORRECT,
                    CARD_SPEND_LIMIT_EXCEEDED,
                    CONTACT_CARD_ISSUER,
                    CUSTOMER_ASA_TIMEOUT,
                    CUSTOM_ASA_RESULT,
                    DECLINED,
                    DO_NOT_HONOR,
                    DRIVER_NUMBER_INVALID,
                    FORMAT_ERROR,
                    INSUFFICIENT_FUNDING_SOURCE_BALANCE,
                    INSUFFICIENT_FUNDS,
                    LITHIC_SYSTEM_ERROR,
                    LITHIC_SYSTEM_RATE_LIMIT,
                    MALFORMED_ASA_RESPONSE,
                    MERCHANT_INVALID,
                    MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE,
                    MERCHANT_NOT_PERMITTED,
                    OVER_REVERSAL_ATTEMPTED,
                    PIN_BLOCKED,
                    PROGRAM_CARD_SPEND_LIMIT_EXCEEDED,
                    PROGRAM_SUSPENDED,
                    PROGRAM_USAGE_RESTRICTION,
                    REVERSAL_UNMATCHED,
                    SECURITY_VIOLATION,
                    SINGLE_USE_CARD_REATTEMPTED,
                    SUSPECTED_FRAUD,
                    TRANSACTION_INVALID,
                    TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL,
                    TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER,
                    TRANSACTION_PREVIOUSLY_COMPLETED,
                    UNAUTHORIZED_MERCHANT,
                    VEHICLE_NUMBER_INVALID,
                    CARDHOLDER_CHALLENGED,
                    CARDHOLDER_CHALLENGE_FAILED,
                    /**
                     * An enum member indicating that [DetailedResult] was instantiated with an
                     * unknown value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED ->
                            Value.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                        ACCOUNT_DELINQUENT -> Value.ACCOUNT_DELINQUENT
                        ACCOUNT_INACTIVE -> Value.ACCOUNT_INACTIVE
                        ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED ->
                            Value.ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED
                        ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED ->
                            Value.ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED
                        ACCOUNT_PAUSED -> Value.ACCOUNT_PAUSED
                        ACCOUNT_UNDER_REVIEW -> Value.ACCOUNT_UNDER_REVIEW
                        ADDRESS_INCORRECT -> Value.ADDRESS_INCORRECT
                        APPROVED -> Value.APPROVED
                        AUTH_RULE_ALLOWED_COUNTRY -> Value.AUTH_RULE_ALLOWED_COUNTRY
                        AUTH_RULE_ALLOWED_MCC -> Value.AUTH_RULE_ALLOWED_MCC
                        AUTH_RULE_BLOCKED_COUNTRY -> Value.AUTH_RULE_BLOCKED_COUNTRY
                        AUTH_RULE_BLOCKED_MCC -> Value.AUTH_RULE_BLOCKED_MCC
                        CARD_CLOSED -> Value.CARD_CLOSED
                        CARD_CRYPTOGRAM_VALIDATION_FAILURE ->
                            Value.CARD_CRYPTOGRAM_VALIDATION_FAILURE
                        CARD_EXPIRED -> Value.CARD_EXPIRED
                        CARD_EXPIRY_DATE_INCORRECT -> Value.CARD_EXPIRY_DATE_INCORRECT
                        CARD_INVALID -> Value.CARD_INVALID
                        CARD_NOT_ACTIVATED -> Value.CARD_NOT_ACTIVATED
                        CARD_PAUSED -> Value.CARD_PAUSED
                        CARD_PIN_INCORRECT -> Value.CARD_PIN_INCORRECT
                        CARD_RESTRICTED -> Value.CARD_RESTRICTED
                        CARD_SECURITY_CODE_INCORRECT -> Value.CARD_SECURITY_CODE_INCORRECT
                        CARD_SPEND_LIMIT_EXCEEDED -> Value.CARD_SPEND_LIMIT_EXCEEDED
                        CONTACT_CARD_ISSUER -> Value.CONTACT_CARD_ISSUER
                        CUSTOMER_ASA_TIMEOUT -> Value.CUSTOMER_ASA_TIMEOUT
                        CUSTOM_ASA_RESULT -> Value.CUSTOM_ASA_RESULT
                        DECLINED -> Value.DECLINED
                        DO_NOT_HONOR -> Value.DO_NOT_HONOR
                        DRIVER_NUMBER_INVALID -> Value.DRIVER_NUMBER_INVALID
                        FORMAT_ERROR -> Value.FORMAT_ERROR
                        INSUFFICIENT_FUNDING_SOURCE_BALANCE ->
                            Value.INSUFFICIENT_FUNDING_SOURCE_BALANCE
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        LITHIC_SYSTEM_ERROR -> Value.LITHIC_SYSTEM_ERROR
                        LITHIC_SYSTEM_RATE_LIMIT -> Value.LITHIC_SYSTEM_RATE_LIMIT
                        MALFORMED_ASA_RESPONSE -> Value.MALFORMED_ASA_RESPONSE
                        MERCHANT_INVALID -> Value.MERCHANT_INVALID
                        MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE ->
                            Value.MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE
                        MERCHANT_NOT_PERMITTED -> Value.MERCHANT_NOT_PERMITTED
                        OVER_REVERSAL_ATTEMPTED -> Value.OVER_REVERSAL_ATTEMPTED
                        PIN_BLOCKED -> Value.PIN_BLOCKED
                        PROGRAM_CARD_SPEND_LIMIT_EXCEEDED -> Value.PROGRAM_CARD_SPEND_LIMIT_EXCEEDED
                        PROGRAM_SUSPENDED -> Value.PROGRAM_SUSPENDED
                        PROGRAM_USAGE_RESTRICTION -> Value.PROGRAM_USAGE_RESTRICTION
                        REVERSAL_UNMATCHED -> Value.REVERSAL_UNMATCHED
                        SECURITY_VIOLATION -> Value.SECURITY_VIOLATION
                        SINGLE_USE_CARD_REATTEMPTED -> Value.SINGLE_USE_CARD_REATTEMPTED
                        SUSPECTED_FRAUD -> Value.SUSPECTED_FRAUD
                        TRANSACTION_INVALID -> Value.TRANSACTION_INVALID
                        TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL ->
                            Value.TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL
                        TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER ->
                            Value.TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER
                        TRANSACTION_PREVIOUSLY_COMPLETED -> Value.TRANSACTION_PREVIOUSLY_COMPLETED
                        UNAUTHORIZED_MERCHANT -> Value.UNAUTHORIZED_MERCHANT
                        VEHICLE_NUMBER_INVALID -> Value.VEHICLE_NUMBER_INVALID
                        CARDHOLDER_CHALLENGED -> Value.CARDHOLDER_CHALLENGED
                        CARDHOLDER_CHALLENGE_FAILED -> Value.CARDHOLDER_CHALLENGE_FAILED
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws LithicInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED ->
                            Known.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                        ACCOUNT_DELINQUENT -> Known.ACCOUNT_DELINQUENT
                        ACCOUNT_INACTIVE -> Known.ACCOUNT_INACTIVE
                        ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED ->
                            Known.ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED
                        ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED ->
                            Known.ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED
                        ACCOUNT_PAUSED -> Known.ACCOUNT_PAUSED
                        ACCOUNT_UNDER_REVIEW -> Known.ACCOUNT_UNDER_REVIEW
                        ADDRESS_INCORRECT -> Known.ADDRESS_INCORRECT
                        APPROVED -> Known.APPROVED
                        AUTH_RULE_ALLOWED_COUNTRY -> Known.AUTH_RULE_ALLOWED_COUNTRY
                        AUTH_RULE_ALLOWED_MCC -> Known.AUTH_RULE_ALLOWED_MCC
                        AUTH_RULE_BLOCKED_COUNTRY -> Known.AUTH_RULE_BLOCKED_COUNTRY
                        AUTH_RULE_BLOCKED_MCC -> Known.AUTH_RULE_BLOCKED_MCC
                        CARD_CLOSED -> Known.CARD_CLOSED
                        CARD_CRYPTOGRAM_VALIDATION_FAILURE ->
                            Known.CARD_CRYPTOGRAM_VALIDATION_FAILURE
                        CARD_EXPIRED -> Known.CARD_EXPIRED
                        CARD_EXPIRY_DATE_INCORRECT -> Known.CARD_EXPIRY_DATE_INCORRECT
                        CARD_INVALID -> Known.CARD_INVALID
                        CARD_NOT_ACTIVATED -> Known.CARD_NOT_ACTIVATED
                        CARD_PAUSED -> Known.CARD_PAUSED
                        CARD_PIN_INCORRECT -> Known.CARD_PIN_INCORRECT
                        CARD_RESTRICTED -> Known.CARD_RESTRICTED
                        CARD_SECURITY_CODE_INCORRECT -> Known.CARD_SECURITY_CODE_INCORRECT
                        CARD_SPEND_LIMIT_EXCEEDED -> Known.CARD_SPEND_LIMIT_EXCEEDED
                        CONTACT_CARD_ISSUER -> Known.CONTACT_CARD_ISSUER
                        CUSTOMER_ASA_TIMEOUT -> Known.CUSTOMER_ASA_TIMEOUT
                        CUSTOM_ASA_RESULT -> Known.CUSTOM_ASA_RESULT
                        DECLINED -> Known.DECLINED
                        DO_NOT_HONOR -> Known.DO_NOT_HONOR
                        DRIVER_NUMBER_INVALID -> Known.DRIVER_NUMBER_INVALID
                        FORMAT_ERROR -> Known.FORMAT_ERROR
                        INSUFFICIENT_FUNDING_SOURCE_BALANCE ->
                            Known.INSUFFICIENT_FUNDING_SOURCE_BALANCE
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        LITHIC_SYSTEM_ERROR -> Known.LITHIC_SYSTEM_ERROR
                        LITHIC_SYSTEM_RATE_LIMIT -> Known.LITHIC_SYSTEM_RATE_LIMIT
                        MALFORMED_ASA_RESPONSE -> Known.MALFORMED_ASA_RESPONSE
                        MERCHANT_INVALID -> Known.MERCHANT_INVALID
                        MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE ->
                            Known.MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE
                        MERCHANT_NOT_PERMITTED -> Known.MERCHANT_NOT_PERMITTED
                        OVER_REVERSAL_ATTEMPTED -> Known.OVER_REVERSAL_ATTEMPTED
                        PIN_BLOCKED -> Known.PIN_BLOCKED
                        PROGRAM_CARD_SPEND_LIMIT_EXCEEDED -> Known.PROGRAM_CARD_SPEND_LIMIT_EXCEEDED
                        PROGRAM_SUSPENDED -> Known.PROGRAM_SUSPENDED
                        PROGRAM_USAGE_RESTRICTION -> Known.PROGRAM_USAGE_RESTRICTION
                        REVERSAL_UNMATCHED -> Known.REVERSAL_UNMATCHED
                        SECURITY_VIOLATION -> Known.SECURITY_VIOLATION
                        SINGLE_USE_CARD_REATTEMPTED -> Known.SINGLE_USE_CARD_REATTEMPTED
                        SUSPECTED_FRAUD -> Known.SUSPECTED_FRAUD
                        TRANSACTION_INVALID -> Known.TRANSACTION_INVALID
                        TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL ->
                            Known.TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL
                        TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER ->
                            Known.TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER
                        TRANSACTION_PREVIOUSLY_COMPLETED -> Known.TRANSACTION_PREVIOUSLY_COMPLETED
                        UNAUTHORIZED_MERCHANT -> Known.UNAUTHORIZED_MERCHANT
                        VEHICLE_NUMBER_INVALID -> Known.VEHICLE_NUMBER_INVALID
                        CARDHOLDER_CHALLENGED -> Known.CARDHOLDER_CHALLENGED
                        CARDHOLDER_CHALLENGE_FAILED -> Known.CARDHOLDER_CHALLENGE_FAILED
                        else -> throw LithicInvalidDataException("Unknown DetailedResult: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws LithicInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString().orElseThrow {
                        LithicInvalidDataException("Value is not a String")
                    }

                private var validated: Boolean = false

                fun validate(): DetailedResult = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is DetailedResult && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RuleResult &&
                    authRuleToken == other.authRuleToken &&
                    explanation == other.explanation &&
                    name == other.name &&
                    result == other.result &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(authRuleToken, explanation, name, result, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuleResult{authRuleToken=$authRuleToken, explanation=$explanation, name=$name, result=$result, additionalProperties=$additionalProperties}"
        }

        /** Type of transaction event */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val AUTHORIZATION = of("AUTHORIZATION")

                @JvmField val AUTHORIZATION_ADVICE = of("AUTHORIZATION_ADVICE")

                @JvmField val AUTHORIZATION_EXPIRY = of("AUTHORIZATION_EXPIRY")

                @JvmField val AUTHORIZATION_REVERSAL = of("AUTHORIZATION_REVERSAL")

                @JvmField val BALANCE_INQUIRY = of("BALANCE_INQUIRY")

                @JvmField val CLEARING = of("CLEARING")

                @JvmField val CORRECTION_CREDIT = of("CORRECTION_CREDIT")

                @JvmField val CORRECTION_DEBIT = of("CORRECTION_DEBIT")

                @JvmField val CREDIT_AUTHORIZATION = of("CREDIT_AUTHORIZATION")

                @JvmField val CREDIT_AUTHORIZATION_ADVICE = of("CREDIT_AUTHORIZATION_ADVICE")

                @JvmField val FINANCIAL_AUTHORIZATION = of("FINANCIAL_AUTHORIZATION")

                @JvmField val FINANCIAL_CREDIT_AUTHORIZATION = of("FINANCIAL_CREDIT_AUTHORIZATION")

                @JvmField val RETURN = of("RETURN")

                @JvmField val RETURN_REVERSAL = of("RETURN_REVERSAL")

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                CLEARING,
                CORRECTION_CREDIT,
                CORRECTION_DEBIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                RETURN,
                RETURN_REVERSAL,
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                CLEARING,
                CORRECTION_CREDIT,
                CORRECTION_DEBIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                RETURN,
                RETURN_REVERSAL,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    AUTHORIZATION -> Value.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Value.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                    CLEARING -> Value.CLEARING
                    CORRECTION_CREDIT -> Value.CORRECTION_CREDIT
                    CORRECTION_DEBIT -> Value.CORRECTION_DEBIT
                    CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Value.CREDIT_AUTHORIZATION_ADVICE
                    FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                    RETURN -> Value.RETURN
                    RETURN_REVERSAL -> Value.RETURN_REVERSAL
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    AUTHORIZATION -> Known.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Known.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                    CLEARING -> Known.CLEARING
                    CORRECTION_CREDIT -> Known.CORRECTION_CREDIT
                    CORRECTION_DEBIT -> Known.CORRECTION_DEBIT
                    CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Known.CREDIT_AUTHORIZATION_ADVICE
                    FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                    RETURN -> Known.RETURN
                    RETURN_REVERSAL -> Known.RETURN_REVERSAL
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AccountType @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CHECKING = of("CHECKING")

                @JvmField val SAVINGS = of("SAVINGS")

                @JvmStatic fun of(value: String) = AccountType(JsonField.of(value))
            }

            /** An enum containing [AccountType]'s known values. */
            enum class Known {
                CHECKING,
                SAVINGS,
            }

            /**
             * An enum containing [AccountType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [AccountType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECKING,
                SAVINGS,
                /**
                 * An enum member indicating that [AccountType] was instantiated with an unknown
                 * value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CHECKING -> Value.CHECKING
                    SAVINGS -> Value.SAVINGS
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    CHECKING -> Known.CHECKING
                    SAVINGS -> Known.SAVINGS
                    else -> throw LithicInvalidDataException("Unknown AccountType: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws LithicInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString().orElseThrow {
                    LithicInvalidDataException("Value is not a String")
                }

            private var validated: Boolean = false

            fun validate(): AccountType = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountType && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class NetworkSpecificData
        @JsonCreator(mode = JsonCreator.Mode.DISABLED)
        private constructor(
            private val mastercard: JsonField<MastercardNetworkSpecificData>,
            private val visa: JsonField<VisaNetworkSpecificData>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("mastercard")
                @ExcludeMissing
                mastercard: JsonField<MastercardNetworkSpecificData> = JsonMissing.of(),
                @JsonProperty("visa")
                @ExcludeMissing
                visa: JsonField<VisaNetworkSpecificData> = JsonMissing.of(),
            ) : this(mastercard, visa, mutableMapOf())

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun mastercard(): MastercardNetworkSpecificData = mastercard.getRequired("mastercard")

            /**
             * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun visa(): VisaNetworkSpecificData = visa.getRequired("visa")

            /**
             * Returns the raw JSON value of [mastercard].
             *
             * Unlike [mastercard], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("mastercard")
            @ExcludeMissing
            fun _mastercard(): JsonField<MastercardNetworkSpecificData> = mastercard

            /**
             * Returns the raw JSON value of [visa].
             *
             * Unlike [visa], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("visa")
            @ExcludeMissing
            fun _visa(): JsonField<VisaNetworkSpecificData> = visa

            @JsonAnySetter
            private fun putAdditionalProperty(key: String, value: JsonValue) {
                additionalProperties.put(key, value)
            }

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> =
                Collections.unmodifiableMap(additionalProperties)

            fun toBuilder() = Builder().from(this)

            companion object {

                /**
                 * Returns a mutable builder for constructing an instance of [NetworkSpecificData].
                 *
                 * The following fields are required:
                 * ```java
                 * .mastercard()
                 * .visa()
                 * ```
                 */
                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NetworkSpecificData]. */
            class Builder internal constructor() {

                private var mastercard: JsonField<MastercardNetworkSpecificData>? = null
                private var visa: JsonField<VisaNetworkSpecificData>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(networkSpecificData: NetworkSpecificData) = apply {
                    mastercard = networkSpecificData.mastercard
                    visa = networkSpecificData.visa
                    additionalProperties = networkSpecificData.additionalProperties.toMutableMap()
                }

                fun mastercard(mastercard: MastercardNetworkSpecificData) =
                    mastercard(JsonField.of(mastercard))

                /**
                 * Sets [Builder.mastercard] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.mastercard] with a well-typed
                 * [MastercardNetworkSpecificData] value instead. This method is primarily for
                 * setting the field to an undocumented or not yet supported value.
                 */
                fun mastercard(mastercard: JsonField<MastercardNetworkSpecificData>) = apply {
                    this.mastercard = mastercard
                }

                fun visa(visa: VisaNetworkSpecificData) = visa(JsonField.of(visa))

                /**
                 * Sets [Builder.visa] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.visa] with a well-typed
                 * [VisaNetworkSpecificData] value instead. This method is primarily for setting the
                 * field to an undocumented or not yet supported value.
                 */
                fun visa(visa: JsonField<VisaNetworkSpecificData>) = apply { this.visa = visa }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                /**
                 * Returns an immutable instance of [NetworkSpecificData].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```java
                 * .mastercard()
                 * .visa()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): NetworkSpecificData =
                    NetworkSpecificData(
                        checkRequired("mastercard", mastercard),
                        checkRequired("visa", visa),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): NetworkSpecificData = apply {
                if (validated) {
                    return@apply
                }

                mastercard().validate()
                visa().validate()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: LithicInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            @JvmSynthetic
            internal fun validity(): Int =
                (mastercard.asKnown().getOrNull()?.validity() ?: 0) +
                    (visa.asKnown().getOrNull()?.validity() ?: 0)

            class MastercardNetworkSpecificData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val ecommerceSecurityLevelIndicator: JsonField<String>,
                private val onBehalfServiceResult: JsonField<List<OnBehalfServiceResult>>,
                private val transactionTypeIdentifier: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("ecommerce_security_level_indicator")
                    @ExcludeMissing
                    ecommerceSecurityLevelIndicator: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("on_behalf_service_result")
                    @ExcludeMissing
                    onBehalfServiceResult: JsonField<List<OnBehalfServiceResult>> =
                        JsonMissing.of(),
                    @JsonProperty("transaction_type_identifier")
                    @ExcludeMissing
                    transactionTypeIdentifier: JsonField<String> = JsonMissing.of(),
                ) : this(
                    ecommerceSecurityLevelIndicator,
                    onBehalfServiceResult,
                    transactionTypeIdentifier,
                    mutableMapOf(),
                )

                /**
                 * Indicates the electronic commerce security level and UCAF collection.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun ecommerceSecurityLevelIndicator(): Optional<String> =
                    ecommerceSecurityLevelIndicator.getOptional(
                        "ecommerce_security_level_indicator"
                    )

                /**
                 * The On-behalf Service performed on the transaction and the results. Contains all
                 * applicable, on-behalf service results that were performed on a given transaction.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun onBehalfServiceResult(): Optional<List<OnBehalfServiceResult>> =
                    onBehalfServiceResult.getOptional("on_behalf_service_result")

                /**
                 * Indicates the type of additional transaction purpose.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun transactionTypeIdentifier(): Optional<String> =
                    transactionTypeIdentifier.getOptional("transaction_type_identifier")

                /**
                 * Returns the raw JSON value of [ecommerceSecurityLevelIndicator].
                 *
                 * Unlike [ecommerceSecurityLevelIndicator], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("ecommerce_security_level_indicator")
                @ExcludeMissing
                fun _ecommerceSecurityLevelIndicator(): JsonField<String> =
                    ecommerceSecurityLevelIndicator

                /**
                 * Returns the raw JSON value of [onBehalfServiceResult].
                 *
                 * Unlike [onBehalfServiceResult], this method doesn't throw if the JSON field has
                 * an unexpected type.
                 */
                @JsonProperty("on_behalf_service_result")
                @ExcludeMissing
                fun _onBehalfServiceResult(): JsonField<List<OnBehalfServiceResult>> =
                    onBehalfServiceResult

                /**
                 * Returns the raw JSON value of [transactionTypeIdentifier].
                 *
                 * Unlike [transactionTypeIdentifier], this method doesn't throw if the JSON field
                 * has an unexpected type.
                 */
                @JsonProperty("transaction_type_identifier")
                @ExcludeMissing
                fun _transactionTypeIdentifier(): JsonField<String> = transactionTypeIdentifier

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [MastercardNetworkSpecificData].
                     *
                     * The following fields are required:
                     * ```java
                     * .ecommerceSecurityLevelIndicator()
                     * .onBehalfServiceResult()
                     * .transactionTypeIdentifier()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [MastercardNetworkSpecificData]. */
                class Builder internal constructor() {

                    private var ecommerceSecurityLevelIndicator: JsonField<String>? = null
                    private var onBehalfServiceResult:
                        JsonField<MutableList<OnBehalfServiceResult>>? =
                        null
                    private var transactionTypeIdentifier: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(
                        mastercardNetworkSpecificData: MastercardNetworkSpecificData
                    ) = apply {
                        ecommerceSecurityLevelIndicator =
                            mastercardNetworkSpecificData.ecommerceSecurityLevelIndicator
                        onBehalfServiceResult =
                            mastercardNetworkSpecificData.onBehalfServiceResult.map {
                                it.toMutableList()
                            }
                        transactionTypeIdentifier =
                            mastercardNetworkSpecificData.transactionTypeIdentifier
                        additionalProperties =
                            mastercardNetworkSpecificData.additionalProperties.toMutableMap()
                    }

                    /** Indicates the electronic commerce security level and UCAF collection. */
                    fun ecommerceSecurityLevelIndicator(ecommerceSecurityLevelIndicator: String?) =
                        ecommerceSecurityLevelIndicator(
                            JsonField.ofNullable(ecommerceSecurityLevelIndicator)
                        )

                    /**
                     * Alias for calling [Builder.ecommerceSecurityLevelIndicator] with
                     * `ecommerceSecurityLevelIndicator.orElse(null)`.
                     */
                    fun ecommerceSecurityLevelIndicator(
                        ecommerceSecurityLevelIndicator: Optional<String>
                    ) = ecommerceSecurityLevelIndicator(ecommerceSecurityLevelIndicator.getOrNull())

                    /**
                     * Sets [Builder.ecommerceSecurityLevelIndicator] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.ecommerceSecurityLevelIndicator] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun ecommerceSecurityLevelIndicator(
                        ecommerceSecurityLevelIndicator: JsonField<String>
                    ) = apply {
                        this.ecommerceSecurityLevelIndicator = ecommerceSecurityLevelIndicator
                    }

                    /**
                     * The On-behalf Service performed on the transaction and the results. Contains
                     * all applicable, on-behalf service results that were performed on a given
                     * transaction.
                     */
                    fun onBehalfServiceResult(onBehalfServiceResult: List<OnBehalfServiceResult>?) =
                        onBehalfServiceResult(JsonField.ofNullable(onBehalfServiceResult))

                    /**
                     * Alias for calling [Builder.onBehalfServiceResult] with
                     * `onBehalfServiceResult.orElse(null)`.
                     */
                    fun onBehalfServiceResult(
                        onBehalfServiceResult: Optional<List<OnBehalfServiceResult>>
                    ) = onBehalfServiceResult(onBehalfServiceResult.getOrNull())

                    /**
                     * Sets [Builder.onBehalfServiceResult] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.onBehalfServiceResult] with a well-typed
                     * `List<OnBehalfServiceResult>` value instead. This method is primarily for
                     * setting the field to an undocumented or not yet supported value.
                     */
                    fun onBehalfServiceResult(
                        onBehalfServiceResult: JsonField<List<OnBehalfServiceResult>>
                    ) = apply {
                        this.onBehalfServiceResult =
                            onBehalfServiceResult.map { it.toMutableList() }
                    }

                    /**
                     * Adds a single [OnBehalfServiceResult] to [Builder.onBehalfServiceResult].
                     *
                     * @throws IllegalStateException if the field was previously set to a non-list.
                     */
                    fun addOnBehalfServiceResult(onBehalfServiceResult: OnBehalfServiceResult) =
                        apply {
                            this.onBehalfServiceResult =
                                (this.onBehalfServiceResult ?: JsonField.of(mutableListOf())).also {
                                    checkKnown("onBehalfServiceResult", it)
                                        .add(onBehalfServiceResult)
                                }
                        }

                    /** Indicates the type of additional transaction purpose. */
                    fun transactionTypeIdentifier(transactionTypeIdentifier: String?) =
                        transactionTypeIdentifier(JsonField.ofNullable(transactionTypeIdentifier))

                    /**
                     * Alias for calling [Builder.transactionTypeIdentifier] with
                     * `transactionTypeIdentifier.orElse(null)`.
                     */
                    fun transactionTypeIdentifier(transactionTypeIdentifier: Optional<String>) =
                        transactionTypeIdentifier(transactionTypeIdentifier.getOrNull())

                    /**
                     * Sets [Builder.transactionTypeIdentifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.transactionTypeIdentifier] with a well-typed
                     * [String] value instead. This method is primarily for setting the field to an
                     * undocumented or not yet supported value.
                     */
                    fun transactionTypeIdentifier(transactionTypeIdentifier: JsonField<String>) =
                        apply {
                            this.transactionTypeIdentifier = transactionTypeIdentifier
                        }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [MastercardNetworkSpecificData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .ecommerceSecurityLevelIndicator()
                     * .onBehalfServiceResult()
                     * .transactionTypeIdentifier()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): MastercardNetworkSpecificData =
                        MastercardNetworkSpecificData(
                            checkRequired(
                                "ecommerceSecurityLevelIndicator",
                                ecommerceSecurityLevelIndicator,
                            ),
                            checkRequired("onBehalfServiceResult", onBehalfServiceResult).map {
                                it.toImmutable()
                            },
                            checkRequired("transactionTypeIdentifier", transactionTypeIdentifier),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): MastercardNetworkSpecificData = apply {
                    if (validated) {
                        return@apply
                    }

                    ecommerceSecurityLevelIndicator()
                    onBehalfServiceResult().ifPresent { it.forEach { it.validate() } }
                    transactionTypeIdentifier()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (ecommerceSecurityLevelIndicator.asKnown().isPresent) 1 else 0) +
                        (onBehalfServiceResult.asKnown().getOrNull()?.sumOf {
                            it.validity().toInt()
                        } ?: 0) +
                        (if (transactionTypeIdentifier.asKnown().isPresent) 1 else 0)

                class OnBehalfServiceResult
                @JsonCreator(mode = JsonCreator.Mode.DISABLED)
                private constructor(
                    private val result1: JsonField<String>,
                    private val result2: JsonField<String>,
                    private val service: JsonField<String>,
                    private val additionalProperties: MutableMap<String, JsonValue>,
                ) {

                    @JsonCreator
                    private constructor(
                        @JsonProperty("result_1")
                        @ExcludeMissing
                        result1: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("result_2")
                        @ExcludeMissing
                        result2: JsonField<String> = JsonMissing.of(),
                        @JsonProperty("service")
                        @ExcludeMissing
                        service: JsonField<String> = JsonMissing.of(),
                    ) : this(result1, result2, service, mutableMapOf())

                    /**
                     * Indicates the results of the service processing.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun result1(): String = result1.getRequired("result_1")

                    /**
                     * Identifies the results of the service processing.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun result2(): String = result2.getRequired("result_2")

                    /**
                     * Indicates the service performed on the transaction.
                     *
                     * @throws LithicInvalidDataException if the JSON field has an unexpected type
                     *   or is unexpectedly missing or null (e.g. if the server responded with an
                     *   unexpected value).
                     */
                    fun service(): String = service.getRequired("service")

                    /**
                     * Returns the raw JSON value of [result1].
                     *
                     * Unlike [result1], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("result_1")
                    @ExcludeMissing
                    fun _result1(): JsonField<String> = result1

                    /**
                     * Returns the raw JSON value of [result2].
                     *
                     * Unlike [result2], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("result_2")
                    @ExcludeMissing
                    fun _result2(): JsonField<String> = result2

                    /**
                     * Returns the raw JSON value of [service].
                     *
                     * Unlike [service], this method doesn't throw if the JSON field has an
                     * unexpected type.
                     */
                    @JsonProperty("service")
                    @ExcludeMissing
                    fun _service(): JsonField<String> = service

                    @JsonAnySetter
                    private fun putAdditionalProperty(key: String, value: JsonValue) {
                        additionalProperties.put(key, value)
                    }

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> =
                        Collections.unmodifiableMap(additionalProperties)

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        /**
                         * Returns a mutable builder for constructing an instance of
                         * [OnBehalfServiceResult].
                         *
                         * The following fields are required:
                         * ```java
                         * .result1()
                         * .result2()
                         * .service()
                         * ```
                         */
                        @JvmStatic fun builder() = Builder()
                    }

                    /** A builder for [OnBehalfServiceResult]. */
                    class Builder internal constructor() {

                        private var result1: JsonField<String>? = null
                        private var result2: JsonField<String>? = null
                        private var service: JsonField<String>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        @JvmSynthetic
                        internal fun from(onBehalfServiceResult: OnBehalfServiceResult) = apply {
                            result1 = onBehalfServiceResult.result1
                            result2 = onBehalfServiceResult.result2
                            service = onBehalfServiceResult.service
                            additionalProperties =
                                onBehalfServiceResult.additionalProperties.toMutableMap()
                        }

                        /** Indicates the results of the service processing. */
                        fun result1(result1: String) = result1(JsonField.of(result1))

                        /**
                         * Sets [Builder.result1] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.result1] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun result1(result1: JsonField<String>) = apply { this.result1 = result1 }

                        /** Identifies the results of the service processing. */
                        fun result2(result2: String) = result2(JsonField.of(result2))

                        /**
                         * Sets [Builder.result2] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.result2] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun result2(result2: JsonField<String>) = apply { this.result2 = result2 }

                        /** Indicates the service performed on the transaction. */
                        fun service(service: String) = service(JsonField.of(service))

                        /**
                         * Sets [Builder.service] to an arbitrary JSON value.
                         *
                         * You should usually call [Builder.service] with a well-typed [String]
                         * value instead. This method is primarily for setting the field to an
                         * undocumented or not yet supported value.
                         */
                        fun service(service: JsonField<String>) = apply { this.service = service }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        /**
                         * Returns an immutable instance of [OnBehalfServiceResult].
                         *
                         * Further updates to this [Builder] will not mutate the returned instance.
                         *
                         * The following fields are required:
                         * ```java
                         * .result1()
                         * .result2()
                         * .service()
                         * ```
                         *
                         * @throws IllegalStateException if any required field is unset.
                         */
                        fun build(): OnBehalfServiceResult =
                            OnBehalfServiceResult(
                                checkRequired("result1", result1),
                                checkRequired("result2", result2),
                                checkRequired("service", service),
                                additionalProperties.toMutableMap(),
                            )
                    }

                    private var validated: Boolean = false

                    fun validate(): OnBehalfServiceResult = apply {
                        if (validated) {
                            return@apply
                        }

                        result1()
                        result2()
                        service()
                        validated = true
                    }

                    fun isValid(): Boolean =
                        try {
                            validate()
                            true
                        } catch (e: LithicInvalidDataException) {
                            false
                        }

                    /**
                     * Returns a score indicating how many valid values are contained in this object
                     * recursively.
                     *
                     * Used for best match union deserialization.
                     */
                    @JvmSynthetic
                    internal fun validity(): Int =
                        (if (result1.asKnown().isPresent) 1 else 0) +
                            (if (result2.asKnown().isPresent) 1 else 0) +
                            (if (service.asKnown().isPresent) 1 else 0)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is OnBehalfServiceResult &&
                            result1 == other.result1 &&
                            result2 == other.result2 &&
                            service == other.service &&
                            additionalProperties == other.additionalProperties
                    }

                    private val hashCode: Int by lazy {
                        Objects.hash(result1, result2, service, additionalProperties)
                    }

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "OnBehalfServiceResult{result1=$result1, result2=$result2, service=$service, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is MastercardNetworkSpecificData &&
                        ecommerceSecurityLevelIndicator == other.ecommerceSecurityLevelIndicator &&
                        onBehalfServiceResult == other.onBehalfServiceResult &&
                        transactionTypeIdentifier == other.transactionTypeIdentifier &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(
                        ecommerceSecurityLevelIndicator,
                        onBehalfServiceResult,
                        transactionTypeIdentifier,
                        additionalProperties,
                    )
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "MastercardNetworkSpecificData{ecommerceSecurityLevelIndicator=$ecommerceSecurityLevelIndicator, onBehalfServiceResult=$onBehalfServiceResult, transactionTypeIdentifier=$transactionTypeIdentifier, additionalProperties=$additionalProperties}"
            }

            class VisaNetworkSpecificData
            @JsonCreator(mode = JsonCreator.Mode.DISABLED)
            private constructor(
                private val businessApplicationIdentifier: JsonField<String>,
                private val additionalProperties: MutableMap<String, JsonValue>,
            ) {

                @JsonCreator
                private constructor(
                    @JsonProperty("business_application_identifier")
                    @ExcludeMissing
                    businessApplicationIdentifier: JsonField<String> = JsonMissing.of()
                ) : this(businessApplicationIdentifier, mutableMapOf())

                /**
                 * Identifies the purpose or category of a transaction, used to classify and process
                 * transactions according to Visa’s rules.
                 *
                 * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g.
                 *   if the server responded with an unexpected value).
                 */
                fun businessApplicationIdentifier(): Optional<String> =
                    businessApplicationIdentifier.getOptional("business_application_identifier")

                /**
                 * Returns the raw JSON value of [businessApplicationIdentifier].
                 *
                 * Unlike [businessApplicationIdentifier], this method doesn't throw if the JSON
                 * field has an unexpected type.
                 */
                @JsonProperty("business_application_identifier")
                @ExcludeMissing
                fun _businessApplicationIdentifier(): JsonField<String> =
                    businessApplicationIdentifier

                @JsonAnySetter
                private fun putAdditionalProperty(key: String, value: JsonValue) {
                    additionalProperties.put(key, value)
                }

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> =
                    Collections.unmodifiableMap(additionalProperties)

                fun toBuilder() = Builder().from(this)

                companion object {

                    /**
                     * Returns a mutable builder for constructing an instance of
                     * [VisaNetworkSpecificData].
                     *
                     * The following fields are required:
                     * ```java
                     * .businessApplicationIdentifier()
                     * ```
                     */
                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [VisaNetworkSpecificData]. */
                class Builder internal constructor() {

                    private var businessApplicationIdentifier: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(visaNetworkSpecificData: VisaNetworkSpecificData) = apply {
                        businessApplicationIdentifier =
                            visaNetworkSpecificData.businessApplicationIdentifier
                        additionalProperties =
                            visaNetworkSpecificData.additionalProperties.toMutableMap()
                    }

                    /**
                     * Identifies the purpose or category of a transaction, used to classify and
                     * process transactions according to Visa’s rules.
                     */
                    fun businessApplicationIdentifier(businessApplicationIdentifier: String?) =
                        businessApplicationIdentifier(
                            JsonField.ofNullable(businessApplicationIdentifier)
                        )

                    /**
                     * Alias for calling [Builder.businessApplicationIdentifier] with
                     * `businessApplicationIdentifier.orElse(null)`.
                     */
                    fun businessApplicationIdentifier(
                        businessApplicationIdentifier: Optional<String>
                    ) = businessApplicationIdentifier(businessApplicationIdentifier.getOrNull())

                    /**
                     * Sets [Builder.businessApplicationIdentifier] to an arbitrary JSON value.
                     *
                     * You should usually call [Builder.businessApplicationIdentifier] with a
                     * well-typed [String] value instead. This method is primarily for setting the
                     * field to an undocumented or not yet supported value.
                     */
                    fun businessApplicationIdentifier(
                        businessApplicationIdentifier: JsonField<String>
                    ) = apply { this.businessApplicationIdentifier = businessApplicationIdentifier }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    /**
                     * Returns an immutable instance of [VisaNetworkSpecificData].
                     *
                     * Further updates to this [Builder] will not mutate the returned instance.
                     *
                     * The following fields are required:
                     * ```java
                     * .businessApplicationIdentifier()
                     * ```
                     *
                     * @throws IllegalStateException if any required field is unset.
                     */
                    fun build(): VisaNetworkSpecificData =
                        VisaNetworkSpecificData(
                            checkRequired(
                                "businessApplicationIdentifier",
                                businessApplicationIdentifier,
                            ),
                            additionalProperties.toMutableMap(),
                        )
                }

                private var validated: Boolean = false

                fun validate(): VisaNetworkSpecificData = apply {
                    if (validated) {
                        return@apply
                    }

                    businessApplicationIdentifier()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: LithicInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                @JvmSynthetic
                internal fun validity(): Int =
                    (if (businessApplicationIdentifier.asKnown().isPresent) 1 else 0)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is VisaNetworkSpecificData &&
                        businessApplicationIdentifier == other.businessApplicationIdentifier &&
                        additionalProperties == other.additionalProperties
                }

                private val hashCode: Int by lazy {
                    Objects.hash(businessApplicationIdentifier, additionalProperties)
                }

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "VisaNetworkSpecificData{businessApplicationIdentifier=$businessApplicationIdentifier, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is NetworkSpecificData &&
                    mastercard == other.mastercard &&
                    visa == other.visa &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(mastercard, visa, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NetworkSpecificData{mastercard=$mastercard, visa=$visa, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionEvent &&
                token == other.token &&
                amount == other.amount &&
                amounts == other.amounts &&
                created == other.created &&
                detailedResults == other.detailedResults &&
                effectivePolarity == other.effectivePolarity &&
                networkInfo == other.networkInfo &&
                result == other.result &&
                ruleResults == other.ruleResults &&
                type == other.type &&
                accountType == other.accountType &&
                networkSpecificData == other.networkSpecificData &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                token,
                amount,
                amounts,
                created,
                detailedResults,
                effectivePolarity,
                networkInfo,
                result,
                ruleResults,
                type,
                accountType,
                networkSpecificData,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionEvent{token=$token, amount=$amount, amounts=$amounts, created=$created, detailedResults=$detailedResults, effectivePolarity=$effectivePolarity, networkInfo=$networkInfo, result=$result, ruleResults=$ruleResults, type=$type, accountType=$accountType, networkSpecificData=$networkSpecificData, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transaction &&
            token == other.token &&
            accountToken == other.accountToken &&
            acquirerFee == other.acquirerFee &&
            acquirerReferenceNumber == other.acquirerReferenceNumber &&
            amount == other.amount &&
            amounts == other.amounts &&
            authorizationAmount == other.authorizationAmount &&
            authorizationCode == other.authorizationCode &&
            avs == other.avs &&
            cardToken == other.cardToken &&
            cardholderAuthentication == other.cardholderAuthentication &&
            created == other.created &&
            financialAccountToken == other.financialAccountToken &&
            merchant == other.merchant &&
            merchantAmount == other.merchantAmount &&
            merchantAuthorizationAmount == other.merchantAuthorizationAmount &&
            merchantCurrency == other.merchantCurrency &&
            network == other.network &&
            networkRiskScore == other.networkRiskScore &&
            pos == other.pos &&
            result == other.result &&
            settledAmount == other.settledAmount &&
            status == other.status &&
            tokenInfo == other.tokenInfo &&
            updated == other.updated &&
            events == other.events &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            token,
            accountToken,
            acquirerFee,
            acquirerReferenceNumber,
            amount,
            amounts,
            authorizationAmount,
            authorizationCode,
            avs,
            cardToken,
            cardholderAuthentication,
            created,
            financialAccountToken,
            merchant,
            merchantAmount,
            merchantAuthorizationAmount,
            merchantCurrency,
            network,
            networkRiskScore,
            pos,
            result,
            settledAmount,
            status,
            tokenInfo,
            updated,
            events,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Transaction{token=$token, accountToken=$accountToken, acquirerFee=$acquirerFee, acquirerReferenceNumber=$acquirerReferenceNumber, amount=$amount, amounts=$amounts, authorizationAmount=$authorizationAmount, authorizationCode=$authorizationCode, avs=$avs, cardToken=$cardToken, cardholderAuthentication=$cardholderAuthentication, created=$created, financialAccountToken=$financialAccountToken, merchant=$merchant, merchantAmount=$merchantAmount, merchantAuthorizationAmount=$merchantAuthorizationAmount, merchantCurrency=$merchantCurrency, network=$network, networkRiskScore=$networkRiskScore, pos=$pos, result=$result, settledAmount=$settledAmount, status=$status, tokenInfo=$tokenInfo, updated=$updated, events=$events, additionalProperties=$additionalProperties}"
}
