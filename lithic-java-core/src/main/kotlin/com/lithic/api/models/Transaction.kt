// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = Transaction.Builder::class)
@NoAutoDetect
class Transaction
private constructor(
    private val acquirerFee: JsonField<Long>,
    private val acquirerReferenceNumber: JsonField<String>,
    private val amount: JsonField<Long>,
    private val amounts: JsonField<TransactionAggregateAmounts>,
    private val authorizationAmount: JsonField<Long>,
    private val authorizationCode: JsonField<String>,
    private val avs: JsonField<Avs>,
    private val cardToken: JsonField<String>,
    private val cardholderAuthentication: JsonField<CardholderAuthentication>,
    private val created: JsonField<OffsetDateTime>,
    private val events: JsonField<List<TransactionEvent>>,
    private val merchant: JsonField<Merchant>,
    private val merchantAmount: JsonField<Long>,
    private val merchantAuthorizationAmount: JsonField<Long>,
    private val merchantCurrency: JsonField<String>,
    private val network: JsonField<Network>,
    private val networkRiskScore: JsonField<Long>,
    private val pos: JsonField<Pos>,
    private val result: JsonField<Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val token: JsonField<String>,
    private val tokenInfo: JsonField<TokenInfo>,
    private val updated: JsonField<OffsetDateTime>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /**
     * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
     * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative value
     * to indicate credited fees.
     */
    fun acquirerFee(): Optional<Long> = Optional.ofNullable(acquirerFee.getNullable("acquirer_fee"))

    /**
     * Unique identifier assigned to a transaction by the acquirer that can be used in dispute and
     * chargeback filing.
     */
    fun acquirerReferenceNumber(): Optional<String> =
        Optional.ofNullable(acquirerReferenceNumber.getNullable("acquirer_reference_number"))

    /**
     * Authorization amount of the transaction (in cents), including any acquirer fees. This may
     * change over time, and will represent the settled amount once the transaction is settled.
     */
    fun amount(): Long = amount.getRequired("amount")

    fun amounts(): TransactionAggregateAmounts = amounts.getRequired("amounts")

    /**
     * Authorization amount (in cents) of the transaction, including any acquirer fees. This amount
     * always represents the amount authorized for the transaction, unaffected by settlement.
     */
    fun authorizationAmount(): Optional<Long> =
        Optional.ofNullable(authorizationAmount.getNullable("authorization_amount"))

    /**
     * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
     * networks.
     */
    fun authorizationCode(): Optional<String> =
        Optional.ofNullable(authorizationCode.getNullable("authorization_code"))

    fun avs(): Optional<Avs> = Optional.ofNullable(avs.getNullable("avs"))

    /** Token for the card used in this transaction. */
    fun cardToken(): String = cardToken.getRequired("card_token")

    fun cardholderAuthentication(): Optional<CardholderAuthentication> =
        Optional.ofNullable(cardholderAuthentication.getNullable("cardholder_authentication"))

    /** Date and time when the transaction first occurred. UTC time zone. */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** A list of all events that have modified this transaction. */
    fun events(): List<TransactionEvent> = events.getRequired("events")

    fun merchant(): Merchant = merchant.getRequired("merchant")

    /**
     * Analogous to the "amount" property, but will represent the amount in the transaction's local
     * currency (smallest unit), including any acquirer fees.
     */
    fun merchantAmount(): Optional<Long> =
        Optional.ofNullable(merchantAmount.getNullable("merchant_amount"))

    /**
     * Analogous to the "authorization_amount" property, but will represent the amount in the
     * transaction's local currency (smallest unit), including any acquirer fees.
     */
    fun merchantAuthorizationAmount(): Optional<Long> =
        Optional.ofNullable(
            merchantAuthorizationAmount.getNullable("merchant_authorization_amount")
        )

    /** 3-digit alphabetic ISO 4217 code for the local currency of the transaction. */
    fun merchantCurrency(): String = merchantCurrency.getRequired("merchant_currency")

    /**
     * Card network of the authorization. Can be `INTERLINK`, `MAESTRO`, `MASTERCARD`, `VISA`, or
     * `UNKNOWN`. Value is `UNKNOWN` when Lithic cannot determine the network code from the upstream
     * provider.
     */
    fun network(): Optional<Network> = Optional.ofNullable(network.getNullable("network"))

    /**
     * Network-provided score assessing risk level associated with a given authorization. Scores are
     * on a range of 0-999, with 0 representing the lowest risk and 999 representing the highest
     * risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will normalize
     * the score by multiplying the raw score by 10x.
     *
     * A score may not be available for all authorizations, and where it is not, this field will be
     * set to null.
     */
    fun networkRiskScore(): Optional<Long> =
        Optional.ofNullable(networkRiskScore.getNullable("network_risk_score"))

    fun pos(): Optional<Pos> = Optional.ofNullable(pos.getNullable("pos"))

    /** `APPROVED` or decline reason. See Event result types */
    fun result(): Result = result.getRequired("result")

    /**
     * Amount of the transaction that has been settled (in cents), including any acquirer fees. This
     * may change over time.
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status types:
     * - `DECLINED` - The transaction was declined.
     * - `EXPIRED` - Lithic reversed the authorization as it has passed its expiration time.
     * - `PENDING` - Authorization is pending completion from the merchant.
     * - `SETTLED` - The transaction is complete.
     * - `VOIDED` - The merchant has voided the previously pending authorization.
     */
    fun status(): Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    fun tokenInfo(): Optional<TokenInfo> = Optional.ofNullable(tokenInfo.getNullable("token_info"))

    /** Date and time when the transaction last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    /**
     * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
     * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative value
     * to indicate credited fees.
     */
    @JsonProperty("acquirer_fee") @ExcludeMissing fun _acquirerFee() = acquirerFee

    /**
     * Unique identifier assigned to a transaction by the acquirer that can be used in dispute and
     * chargeback filing.
     */
    @JsonProperty("acquirer_reference_number")
    @ExcludeMissing
    fun _acquirerReferenceNumber() = acquirerReferenceNumber

    /**
     * Authorization amount of the transaction (in cents), including any acquirer fees. This may
     * change over time, and will represent the settled amount once the transaction is settled.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    @JsonProperty("amounts") @ExcludeMissing fun _amounts() = amounts

    /**
     * Authorization amount (in cents) of the transaction, including any acquirer fees. This amount
     * always represents the amount authorized for the transaction, unaffected by settlement.
     */
    @JsonProperty("authorization_amount")
    @ExcludeMissing
    fun _authorizationAmount() = authorizationAmount

    /**
     * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
     * networks.
     */
    @JsonProperty("authorization_code") @ExcludeMissing fun _authorizationCode() = authorizationCode

    @JsonProperty("avs") @ExcludeMissing fun _avs() = avs

    /** Token for the card used in this transaction. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken() = cardToken

    @JsonProperty("cardholder_authentication")
    @ExcludeMissing
    fun _cardholderAuthentication() = cardholderAuthentication

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** A list of all events that have modified this transaction. */
    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonProperty("merchant") @ExcludeMissing fun _merchant() = merchant

    /**
     * Analogous to the "amount" property, but will represent the amount in the transaction's local
     * currency (smallest unit), including any acquirer fees.
     */
    @JsonProperty("merchant_amount") @ExcludeMissing fun _merchantAmount() = merchantAmount

    /**
     * Analogous to the "authorization_amount" property, but will represent the amount in the
     * transaction's local currency (smallest unit), including any acquirer fees.
     */
    @JsonProperty("merchant_authorization_amount")
    @ExcludeMissing
    fun _merchantAuthorizationAmount() = merchantAuthorizationAmount

    /** 3-digit alphabetic ISO 4217 code for the local currency of the transaction. */
    @JsonProperty("merchant_currency") @ExcludeMissing fun _merchantCurrency() = merchantCurrency

    /**
     * Card network of the authorization. Can be `INTERLINK`, `MAESTRO`, `MASTERCARD`, `VISA`, or
     * `UNKNOWN`. Value is `UNKNOWN` when Lithic cannot determine the network code from the upstream
     * provider.
     */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

    /**
     * Network-provided score assessing risk level associated with a given authorization. Scores are
     * on a range of 0-999, with 0 representing the lowest risk and 999 representing the highest
     * risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will normalize
     * the score by multiplying the raw score by 10x.
     *
     * A score may not be available for all authorizations, and where it is not, this field will be
     * set to null.
     */
    @JsonProperty("network_risk_score") @ExcludeMissing fun _networkRiskScore() = networkRiskScore

    @JsonProperty("pos") @ExcludeMissing fun _pos() = pos

    /** `APPROVED` or decline reason. See Event result types */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /**
     * Amount of the transaction that has been settled (in cents), including any acquirer fees. This
     * may change over time.
     */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    /**
     * Status types:
     * - `DECLINED` - The transaction was declined.
     * - `EXPIRED` - Lithic reversed the authorization as it has passed its expiration time.
     * - `PENDING` - Authorization is pending completion from the merchant.
     * - `SETTLED` - The transaction is complete.
     * - `VOIDED` - The merchant has voided the previously pending authorization.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonProperty("token_info") @ExcludeMissing fun _tokenInfo() = tokenInfo

    /** Date and time when the transaction last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Transaction = apply {
        if (!validated) {
            acquirerFee()
            acquirerReferenceNumber()
            amount()
            amounts().validate()
            authorizationAmount()
            authorizationCode()
            avs().map { it.validate() }
            cardToken()
            cardholderAuthentication().map { it.validate() }
            created()
            events().forEach { it.validate() }
            merchant().validate()
            merchantAmount()
            merchantAuthorizationAmount()
            merchantCurrency()
            network()
            networkRiskScore()
            pos().map { it.validate() }
            result()
            settledAmount()
            status()
            token()
            tokenInfo().map { it.validate() }
            updated()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var acquirerFee: JsonField<Long> = JsonMissing.of()
        private var acquirerReferenceNumber: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var amounts: JsonField<TransactionAggregateAmounts> = JsonMissing.of()
        private var authorizationAmount: JsonField<Long> = JsonMissing.of()
        private var authorizationCode: JsonField<String> = JsonMissing.of()
        private var avs: JsonField<Avs> = JsonMissing.of()
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var cardholderAuthentication: JsonField<CardholderAuthentication> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var events: JsonField<List<TransactionEvent>> = JsonMissing.of()
        private var merchant: JsonField<Merchant> = JsonMissing.of()
        private var merchantAmount: JsonField<Long> = JsonMissing.of()
        private var merchantAuthorizationAmount: JsonField<Long> = JsonMissing.of()
        private var merchantCurrency: JsonField<String> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var networkRiskScore: JsonField<Long> = JsonMissing.of()
        private var pos: JsonField<Pos> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var tokenInfo: JsonField<TokenInfo> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transaction: Transaction) = apply {
            this.acquirerFee = transaction.acquirerFee
            this.acquirerReferenceNumber = transaction.acquirerReferenceNumber
            this.amount = transaction.amount
            this.amounts = transaction.amounts
            this.authorizationAmount = transaction.authorizationAmount
            this.authorizationCode = transaction.authorizationCode
            this.avs = transaction.avs
            this.cardToken = transaction.cardToken
            this.cardholderAuthentication = transaction.cardholderAuthentication
            this.created = transaction.created
            this.events = transaction.events
            this.merchant = transaction.merchant
            this.merchantAmount = transaction.merchantAmount
            this.merchantAuthorizationAmount = transaction.merchantAuthorizationAmount
            this.merchantCurrency = transaction.merchantCurrency
            this.network = transaction.network
            this.networkRiskScore = transaction.networkRiskScore
            this.pos = transaction.pos
            this.result = transaction.result
            this.settledAmount = transaction.settledAmount
            this.status = transaction.status
            this.token = transaction.token
            this.tokenInfo = transaction.tokenInfo
            this.updated = transaction.updated
            additionalProperties(transaction.additionalProperties)
        }

        /**
         * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
         * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative
         * value to indicate credited fees.
         */
        fun acquirerFee(acquirerFee: Long) = acquirerFee(JsonField.of(acquirerFee))

        /**
         * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
         * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative
         * value to indicate credited fees.
         */
        @JsonProperty("acquirer_fee")
        @ExcludeMissing
        fun acquirerFee(acquirerFee: JsonField<Long>) = apply { this.acquirerFee = acquirerFee }

        /**
         * Unique identifier assigned to a transaction by the acquirer that can be used in dispute
         * and chargeback filing.
         */
        fun acquirerReferenceNumber(acquirerReferenceNumber: String) =
            acquirerReferenceNumber(JsonField.of(acquirerReferenceNumber))

        /**
         * Unique identifier assigned to a transaction by the acquirer that can be used in dispute
         * and chargeback filing.
         */
        @JsonProperty("acquirer_reference_number")
        @ExcludeMissing
        fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) = apply {
            this.acquirerReferenceNumber = acquirerReferenceNumber
        }

        /**
         * Authorization amount of the transaction (in cents), including any acquirer fees. This may
         * change over time, and will represent the settled amount once the transaction is settled.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Authorization amount of the transaction (in cents), including any acquirer fees. This may
         * change over time, and will represent the settled amount once the transaction is settled.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun amounts(amounts: TransactionAggregateAmounts) = amounts(JsonField.of(amounts))

        @JsonProperty("amounts")
        @ExcludeMissing
        fun amounts(amounts: JsonField<TransactionAggregateAmounts>) = apply {
            this.amounts = amounts
        }

        /**
         * Authorization amount (in cents) of the transaction, including any acquirer fees. This
         * amount always represents the amount authorized for the transaction, unaffected by
         * settlement.
         */
        fun authorizationAmount(authorizationAmount: Long) =
            authorizationAmount(JsonField.of(authorizationAmount))

        /**
         * Authorization amount (in cents) of the transaction, including any acquirer fees. This
         * amount always represents the amount authorized for the transaction, unaffected by
         * settlement.
         */
        @JsonProperty("authorization_amount")
        @ExcludeMissing
        fun authorizationAmount(authorizationAmount: JsonField<Long>) = apply {
            this.authorizationAmount = authorizationAmount
        }

        /**
         * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
         * networks.
         */
        fun authorizationCode(authorizationCode: String) =
            authorizationCode(JsonField.of(authorizationCode))

        /**
         * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
         * networks.
         */
        @JsonProperty("authorization_code")
        @ExcludeMissing
        fun authorizationCode(authorizationCode: JsonField<String>) = apply {
            this.authorizationCode = authorizationCode
        }

        fun avs(avs: Avs) = avs(JsonField.of(avs))

        @JsonProperty("avs") @ExcludeMissing fun avs(avs: JsonField<Avs>) = apply { this.avs = avs }

        /** Token for the card used in this transaction. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /** Token for the card used in this transaction. */
        @JsonProperty("card_token")
        @ExcludeMissing
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        fun cardholderAuthentication(cardholderAuthentication: CardholderAuthentication) =
            cardholderAuthentication(JsonField.of(cardholderAuthentication))

        @JsonProperty("cardholder_authentication")
        @ExcludeMissing
        fun cardholderAuthentication(
            cardholderAuthentication: JsonField<CardholderAuthentication>
        ) = apply { this.cardholderAuthentication = cardholderAuthentication }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the transaction first occurred. UTC time zone. */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** A list of all events that have modified this transaction. */
        fun events(events: List<TransactionEvent>) = events(JsonField.of(events))

        /** A list of all events that have modified this transaction. */
        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<TransactionEvent>>) = apply { this.events = events }

        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        @JsonProperty("merchant")
        @ExcludeMissing
        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /**
         * Analogous to the "amount" property, but will represent the amount in the transaction's
         * local currency (smallest unit), including any acquirer fees.
         */
        fun merchantAmount(merchantAmount: Long) = merchantAmount(JsonField.of(merchantAmount))

        /**
         * Analogous to the "amount" property, but will represent the amount in the transaction's
         * local currency (smallest unit), including any acquirer fees.
         */
        @JsonProperty("merchant_amount")
        @ExcludeMissing
        fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
            this.merchantAmount = merchantAmount
        }

        /**
         * Analogous to the "authorization_amount" property, but will represent the amount in the
         * transaction's local currency (smallest unit), including any acquirer fees.
         */
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: Long) =
            merchantAuthorizationAmount(JsonField.of(merchantAuthorizationAmount))

        /**
         * Analogous to the "authorization_amount" property, but will represent the amount in the
         * transaction's local currency (smallest unit), including any acquirer fees.
         */
        @JsonProperty("merchant_authorization_amount")
        @ExcludeMissing
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: JsonField<Long>) = apply {
            this.merchantAuthorizationAmount = merchantAuthorizationAmount
        }

        /** 3-digit alphabetic ISO 4217 code for the local currency of the transaction. */
        fun merchantCurrency(merchantCurrency: String) =
            merchantCurrency(JsonField.of(merchantCurrency))

        /** 3-digit alphabetic ISO 4217 code for the local currency of the transaction. */
        @JsonProperty("merchant_currency")
        @ExcludeMissing
        fun merchantCurrency(merchantCurrency: JsonField<String>) = apply {
            this.merchantCurrency = merchantCurrency
        }

        /**
         * Card network of the authorization. Can be `INTERLINK`, `MAESTRO`, `MASTERCARD`, `VISA`,
         * or `UNKNOWN`. Value is `UNKNOWN` when Lithic cannot determine the network code from the
         * upstream provider.
         */
        fun network(network: Network) = network(JsonField.of(network))

        /**
         * Card network of the authorization. Can be `INTERLINK`, `MAESTRO`, `MASTERCARD`, `VISA`,
         * or `UNKNOWN`. Value is `UNKNOWN` when Lithic cannot determine the network code from the
         * upstream provider.
         */
        @JsonProperty("network")
        @ExcludeMissing
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         *
         * A score may not be available for all authorizations, and where it is not, this field will
         * be set to null.
         */
        fun networkRiskScore(networkRiskScore: Long) =
            networkRiskScore(JsonField.of(networkRiskScore))

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         *
         * A score may not be available for all authorizations, and where it is not, this field will
         * be set to null.
         */
        @JsonProperty("network_risk_score")
        @ExcludeMissing
        fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
            this.networkRiskScore = networkRiskScore
        }

        fun pos(pos: Pos) = pos(JsonField.of(pos))

        @JsonProperty("pos") @ExcludeMissing fun pos(pos: JsonField<Pos>) = apply { this.pos = pos }

        /** `APPROVED` or decline reason. See Event result types */
        fun result(result: Result) = result(JsonField.of(result))

        /** `APPROVED` or decline reason. See Event result types */
        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<Result>) = apply { this.result = result }

        /**
         * Amount of the transaction that has been settled (in cents), including any acquirer fees.
         * This may change over time.
         */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /**
         * Amount of the transaction that has been settled (in cents), including any acquirer fees.
         * This may change over time.
         */
        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /**
         * Status types:
         * - `DECLINED` - The transaction was declined.
         * - `EXPIRED` - Lithic reversed the authorization as it has passed its expiration time.
         * - `PENDING` - Authorization is pending completion from the merchant.
         * - `SETTLED` - The transaction is complete.
         * - `VOIDED` - The merchant has voided the previously pending authorization.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         * - `DECLINED` - The transaction was declined.
         * - `EXPIRED` - Lithic reversed the authorization as it has passed its expiration time.
         * - `PENDING` - Authorization is pending completion from the merchant.
         * - `SETTLED` - The transaction is complete.
         * - `VOIDED` - The merchant has voided the previously pending authorization.
         */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun tokenInfo(tokenInfo: TokenInfo) = tokenInfo(JsonField.of(tokenInfo))

        @JsonProperty("token_info")
        @ExcludeMissing
        fun tokenInfo(tokenInfo: JsonField<TokenInfo>) = apply { this.tokenInfo = tokenInfo }

        /** Date and time when the transaction last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the transaction last updated. UTC time zone. */
        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): Transaction =
            Transaction(
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
                events.map { it.toUnmodifiable() },
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
                token,
                tokenInfo,
                updated,
                additionalProperties.toUnmodifiable(),
            )
    }

    @JsonDeserialize(builder = TransactionAggregateAmounts.Builder::class)
    @NoAutoDetect
    class TransactionAggregateAmounts
    private constructor(
        private val cardholder: JsonField<CardholderAggregateAmount>,
        private val hold: JsonField<HoldAggregateAmount>,
        private val merchant: JsonField<MerchantAggregateAmount>,
        private val settlement: JsonField<SettlementAggregateAmount>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun cardholder(): CardholderAggregateAmount = cardholder.getRequired("cardholder")

        fun hold(): HoldAggregateAmount = hold.getRequired("hold")

        fun merchant(): MerchantAggregateAmount = merchant.getRequired("merchant")

        fun settlement(): SettlementAggregateAmount = settlement.getRequired("settlement")

        @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

        @JsonProperty("hold") @ExcludeMissing fun _hold() = hold

        @JsonProperty("merchant") @ExcludeMissing fun _merchant() = merchant

        @JsonProperty("settlement") @ExcludeMissing fun _settlement() = settlement

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TransactionAggregateAmounts = apply {
            if (!validated) {
                cardholder().validate()
                hold().validate()
                merchant().validate()
                settlement().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var cardholder: JsonField<CardholderAggregateAmount> = JsonMissing.of()
            private var hold: JsonField<HoldAggregateAmount> = JsonMissing.of()
            private var merchant: JsonField<MerchantAggregateAmount> = JsonMissing.of()
            private var settlement: JsonField<SettlementAggregateAmount> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionAggregateAmounts: TransactionAggregateAmounts) = apply {
                this.cardholder = transactionAggregateAmounts.cardholder
                this.hold = transactionAggregateAmounts.hold
                this.merchant = transactionAggregateAmounts.merchant
                this.settlement = transactionAggregateAmounts.settlement
                additionalProperties(transactionAggregateAmounts.additionalProperties)
            }

            fun cardholder(cardholder: CardholderAggregateAmount) =
                cardholder(JsonField.of(cardholder))

            @JsonProperty("cardholder")
            @ExcludeMissing
            fun cardholder(cardholder: JsonField<CardholderAggregateAmount>) = apply {
                this.cardholder = cardholder
            }

            fun hold(hold: HoldAggregateAmount) = hold(JsonField.of(hold))

            @JsonProperty("hold")
            @ExcludeMissing
            fun hold(hold: JsonField<HoldAggregateAmount>) = apply { this.hold = hold }

            fun merchant(merchant: MerchantAggregateAmount) = merchant(JsonField.of(merchant))

            @JsonProperty("merchant")
            @ExcludeMissing
            fun merchant(merchant: JsonField<MerchantAggregateAmount>) = apply {
                this.merchant = merchant
            }

            fun settlement(settlement: SettlementAggregateAmount) =
                settlement(JsonField.of(settlement))

            @JsonProperty("settlement")
            @ExcludeMissing
            fun settlement(settlement: JsonField<SettlementAggregateAmount>) = apply {
                this.settlement = settlement
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TransactionAggregateAmounts =
                TransactionAggregateAmounts(
                    cardholder,
                    hold,
                    merchant,
                    settlement,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = CardholderAggregateAmount.Builder::class)
        @NoAutoDetect
        class CardholderAggregateAmount
        private constructor(
            private val amount: JsonField<Long>,
            private val conversionRate: JsonField<String>,
            private val currency: JsonField<Currency>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun amount(): Long = amount.getRequired("amount")

            fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
             * :attr:`EUR`, :attr:`USD`.
             */
            fun currency(): Currency = currency.getRequired("currency")

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
             * :attr:`EUR`, :attr:`USD`.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardholderAggregateAmount = apply {
                if (!validated) {
                    amount()
                    conversionRate()
                    currency()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var conversionRate: JsonField<String> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(cardholderAggregateAmount: CardholderAggregateAmount) = apply {
                    this.amount = cardholderAggregateAmount.amount
                    this.conversionRate = cardholderAggregateAmount.conversionRate
                    this.currency = cardholderAggregateAmount.currency
                    additionalProperties(cardholderAggregateAmount.additionalProperties)
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun conversionRate(conversionRate: String) =
                    conversionRate(JsonField.of(conversionRate))

                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun conversionRate(conversionRate: JsonField<String>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardholderAggregateAmount =
                    CardholderAggregateAmount(
                        amount,
                        conversionRate,
                        currency,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CardholderAggregateAmount && this.amount == other.amount && this.conversionRate == other.conversionRate && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, conversionRate, currency, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "CardholderAggregateAmount{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = HoldAggregateAmount.Builder::class)
        @NoAutoDetect
        class HoldAggregateAmount
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun amount(): Long = amount.getRequired("amount")

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
             * :attr:`EUR`, :attr:`USD`.
             */
            fun currency(): Currency = currency.getRequired("currency")

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
             * :attr:`EUR`, :attr:`USD`.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): HoldAggregateAmount = apply {
                if (!validated) {
                    amount()
                    currency()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(holdAggregateAmount: HoldAggregateAmount) = apply {
                    this.amount = holdAggregateAmount.amount
                    this.currency = holdAggregateAmount.currency
                    additionalProperties(holdAggregateAmount.additionalProperties)
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): HoldAggregateAmount =
                    HoldAggregateAmount(
                        amount,
                        currency,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is HoldAggregateAmount && this.amount == other.amount && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, currency, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "HoldAggregateAmount{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = MerchantAggregateAmount.Builder::class)
        @NoAutoDetect
        class MerchantAggregateAmount
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun amount(): Long = amount.getRequired("amount")

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
             * :attr:`EUR`, :attr:`USD`.
             */
            fun currency(): Currency = currency.getRequired("currency")

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
             * :attr:`EUR`, :attr:`USD`.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): MerchantAggregateAmount = apply {
                if (!validated) {
                    amount()
                    currency()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(merchantAggregateAmount: MerchantAggregateAmount) = apply {
                    this.amount = merchantAggregateAmount.amount
                    this.currency = merchantAggregateAmount.currency
                    additionalProperties(merchantAggregateAmount.additionalProperties)
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): MerchantAggregateAmount =
                    MerchantAggregateAmount(
                        amount,
                        currency,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is MerchantAggregateAmount && this.amount == other.amount && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, currency, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "MerchantAggregateAmount{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = SettlementAggregateAmount.Builder::class)
        @NoAutoDetect
        class SettlementAggregateAmount
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun amount(): Long = amount.getRequired("amount")

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
             * :attr:`EUR`, :attr:`USD`.
             */
            fun currency(): Currency = currency.getRequired("currency")

            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
             * :attr:`EUR`, :attr:`USD`.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): SettlementAggregateAmount = apply {
                if (!validated) {
                    amount()
                    currency()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(settlementAggregateAmount: SettlementAggregateAmount) = apply {
                    this.amount = settlementAggregateAmount.amount
                    this.currency = settlementAggregateAmount.currency
                    additionalProperties(settlementAggregateAmount.additionalProperties)
                }

                fun amount(amount: Long) = amount(JsonField.of(amount))

                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): SettlementAggregateAmount =
                    SettlementAggregateAmount(
                        amount,
                        currency,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SettlementAggregateAmount && this.amount == other.amount && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(amount, currency, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "SettlementAggregateAmount{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionAggregateAmounts && this.cardholder == other.cardholder && this.hold == other.hold && this.merchant == other.merchant && this.settlement == other.settlement && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(cardholder, hold, merchant, settlement, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TransactionAggregateAmounts{cardholder=$cardholder, hold=$hold, merchant=$merchant, settlement=$settlement, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Avs.Builder::class)
    @NoAutoDetect
    class Avs
    private constructor(
        private val address: JsonField<String>,
        private val zipcode: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Cardholder address */
        fun address(): Optional<String> = Optional.ofNullable(address.getNullable("address"))

        /** Cardholder ZIP code */
        fun zipcode(): Optional<String> = Optional.ofNullable(zipcode.getNullable("zipcode"))

        /** Cardholder address */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** Cardholder ZIP code */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode() = zipcode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Avs = apply {
            if (!validated) {
                address()
                zipcode()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var address: JsonField<String> = JsonMissing.of()
            private var zipcode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(avs: Avs) = apply {
                this.address = avs.address
                this.zipcode = avs.zipcode
                additionalProperties(avs.additionalProperties)
            }

            /** Cardholder address */
            fun address(address: String) = address(JsonField.of(address))

            /** Cardholder address */
            @JsonProperty("address")
            @ExcludeMissing
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Cardholder ZIP code */
            fun zipcode(zipcode: String) = zipcode(JsonField.of(zipcode))

            /** Cardholder ZIP code */
            @JsonProperty("zipcode")
            @ExcludeMissing
            fun zipcode(zipcode: JsonField<String>) = apply { this.zipcode = zipcode }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Avs =
                Avs(
                    address,
                    zipcode,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Avs && this.address == other.address && this.zipcode == other.zipcode && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(address, zipcode, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Avs{address=$address, zipcode=$zipcode, additionalProperties=$additionalProperties}"
    }

    /**
     * A single card transaction may include multiple events that affect the transaction state and
     * lifecycle.
     */
    @JsonDeserialize(builder = TransactionEvent.Builder::class)
    @NoAutoDetect
    class TransactionEvent
    private constructor(
        private val amount: JsonField<Long>,
        private val amounts: JsonField<TransactionEventAmounts>,
        private val created: JsonField<OffsetDateTime>,
        private val detailedResults: JsonField<List<DetailedResult>>,
        private val effectivePolarity: JsonField<EffectivePolarity>,
        private val result: JsonField<Result>,
        private val token: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Amount of the transaction event (in cents), including any acquirer fees. */
        fun amount(): Long = amount.getRequired("amount")

        fun amounts(): TransactionEventAmounts = amounts.getRequired("amounts")

        /** RFC 3339 date and time this event entered the system. UTC time zone. */
        fun created(): OffsetDateTime = created.getRequired("created")

        fun detailedResults(): List<DetailedResult> =
            detailedResults.getRequired("detailed_results")

        /** Indicates whether the transaction event is a credit or debit to the account. */
        fun effectivePolarity(): Optional<EffectivePolarity> =
            Optional.ofNullable(effectivePolarity.getNullable("effective_polarity"))

        /**
         * `APPROVED` or decline reason.
         *
         * Result types:
         * - `ACCOUNT_STATE_TRANSACTION_FAIL` - Contact
         *   [support@lithic.com](mailto:support@lithic.com).
         * - `APPROVED` - Transaction is approved.
         * - `BANK_CONNECTION_ERROR` - Please reconnect a funding source.
         * - `BANK_NOT_VERIFIED` - Please confirm the funding source.
         * - `CARD_CLOSED` - Card state was closed at the time of authorization.
         * - `CARD_PAUSED` - Card state was paused at the time of authorization.
         * - `FRAUD_ADVICE` - Transaction declined due to risk.
         * - `INACTIVE_ACCOUNT` - Account is inactive. Contact
         *   [support@lithic.com](mailto:support@lithic.com).
         * - `INCORRECT_PIN` - PIN verification failed.
         * - `INVALID_CARD_DETAILS` - Incorrect CVV or expiry date.
         * - `INSUFFICIENT_FUNDS` - Please ensure the funding source is connected and up to date.
         * - `MERCHANT_BLACKLIST` - This merchant is disallowed on the platform.
         * - `SINGLE_USE_RECHARGED` - Single use card attempted multiple times.
         * - `SWITCH_INOPERATIVE_ADVICE` - Network error, re-attempt the transaction.
         * - `UNAUTHORIZED_MERCHANT` - Merchant locked card attempted at different merchant.
         * - `UNKNOWN_HOST_TIMEOUT` - Network error, re-attempt the transaction.
         * - `USER_TRANSACTION_LIMIT` - User-set spend limit exceeded.
         */
        fun result(): Result = result.getRequired("result")

        /** Globally unique identifier. */
        fun token(): String = token.getRequired("token")

        /**
         * Event types:
         * - `AUTHORIZATION` - Authorize a transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a transaction.
         * - `AUTHORIZATION_EXPIRY` - Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A balance inquiry (typically a $0 authorization) has occurred on a
         *   card.
         * - `CLEARING` - Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit authorization was approved on your behalf by
         *   the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit funds without additional
         *   clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit funds
         *   without additional clearing.
         * - `RETURN` - A refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A refund has been reversed (e.g., when a merchant reverses an
         *   incorrect refund).
         */
        fun type(): Type = type.getRequired("type")

        /** Amount of the transaction event (in cents), including any acquirer fees. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("amounts") @ExcludeMissing fun _amounts() = amounts

        /** RFC 3339 date and time this event entered the system. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        /** Indicates whether the transaction event is a credit or debit to the account. */
        @JsonProperty("effective_polarity")
        @ExcludeMissing
        fun _effectivePolarity() = effectivePolarity

        /**
         * `APPROVED` or decline reason.
         *
         * Result types:
         * - `ACCOUNT_STATE_TRANSACTION_FAIL` - Contact
         *   [support@lithic.com](mailto:support@lithic.com).
         * - `APPROVED` - Transaction is approved.
         * - `BANK_CONNECTION_ERROR` - Please reconnect a funding source.
         * - `BANK_NOT_VERIFIED` - Please confirm the funding source.
         * - `CARD_CLOSED` - Card state was closed at the time of authorization.
         * - `CARD_PAUSED` - Card state was paused at the time of authorization.
         * - `FRAUD_ADVICE` - Transaction declined due to risk.
         * - `INACTIVE_ACCOUNT` - Account is inactive. Contact
         *   [support@lithic.com](mailto:support@lithic.com).
         * - `INCORRECT_PIN` - PIN verification failed.
         * - `INVALID_CARD_DETAILS` - Incorrect CVV or expiry date.
         * - `INSUFFICIENT_FUNDS` - Please ensure the funding source is connected and up to date.
         * - `MERCHANT_BLACKLIST` - This merchant is disallowed on the platform.
         * - `SINGLE_USE_RECHARGED` - Single use card attempted multiple times.
         * - `SWITCH_INOPERATIVE_ADVICE` - Network error, re-attempt the transaction.
         * - `UNAUTHORIZED_MERCHANT` - Merchant locked card attempted at different merchant.
         * - `UNKNOWN_HOST_TIMEOUT` - Network error, re-attempt the transaction.
         * - `USER_TRANSACTION_LIMIT` - User-set spend limit exceeded.
         */
        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** Globally unique identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /**
         * Event types:
         * - `AUTHORIZATION` - Authorize a transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a transaction.
         * - `AUTHORIZATION_EXPIRY` - Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A balance inquiry (typically a $0 authorization) has occurred on a
         *   card.
         * - `CLEARING` - Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit authorization was approved on your behalf by
         *   the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit funds without additional
         *   clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit funds
         *   without additional clearing.
         * - `RETURN` - A refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A refund has been reversed (e.g., when a merchant reverses an
         *   incorrect refund).
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TransactionEvent = apply {
            if (!validated) {
                amount()
                amounts().validate()
                created()
                detailedResults()
                effectivePolarity()
                result()
                token()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var amounts: JsonField<TransactionEventAmounts> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of()
            private var effectivePolarity: JsonField<EffectivePolarity> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionEvent: TransactionEvent) = apply {
                this.amount = transactionEvent.amount
                this.amounts = transactionEvent.amounts
                this.created = transactionEvent.created
                this.detailedResults = transactionEvent.detailedResults
                this.effectivePolarity = transactionEvent.effectivePolarity
                this.result = transactionEvent.result
                this.token = transactionEvent.token
                this.type = transactionEvent.type
                additionalProperties(transactionEvent.additionalProperties)
            }

            /** Amount of the transaction event (in cents), including any acquirer fees. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount of the transaction event (in cents), including any acquirer fees. */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun amounts(amounts: TransactionEventAmounts) = amounts(JsonField.of(amounts))

            @JsonProperty("amounts")
            @ExcludeMissing
            fun amounts(amounts: JsonField<TransactionEventAmounts>) = apply {
                this.amounts = amounts
            }

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            @JsonProperty("detailed_results")
            @ExcludeMissing
            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults
            }

            /** Indicates whether the transaction event is a credit or debit to the account. */
            fun effectivePolarity(effectivePolarity: EffectivePolarity) =
                effectivePolarity(JsonField.of(effectivePolarity))

            /** Indicates whether the transaction event is a credit or debit to the account. */
            @JsonProperty("effective_polarity")
            @ExcludeMissing
            fun effectivePolarity(effectivePolarity: JsonField<EffectivePolarity>) = apply {
                this.effectivePolarity = effectivePolarity
            }

            /**
             * `APPROVED` or decline reason.
             *
             * Result types:
             * - `ACCOUNT_STATE_TRANSACTION_FAIL` - Contact
             *   [support@lithic.com](mailto:support@lithic.com).
             * - `APPROVED` - Transaction is approved.
             * - `BANK_CONNECTION_ERROR` - Please reconnect a funding source.
             * - `BANK_NOT_VERIFIED` - Please confirm the funding source.
             * - `CARD_CLOSED` - Card state was closed at the time of authorization.
             * - `CARD_PAUSED` - Card state was paused at the time of authorization.
             * - `FRAUD_ADVICE` - Transaction declined due to risk.
             * - `INACTIVE_ACCOUNT` - Account is inactive. Contact
             *   [support@lithic.com](mailto:support@lithic.com).
             * - `INCORRECT_PIN` - PIN verification failed.
             * - `INVALID_CARD_DETAILS` - Incorrect CVV or expiry date.
             * - `INSUFFICIENT_FUNDS` - Please ensure the funding source is connected and up to
             *   date.
             * - `MERCHANT_BLACKLIST` - This merchant is disallowed on the platform.
             * - `SINGLE_USE_RECHARGED` - Single use card attempted multiple times.
             * - `SWITCH_INOPERATIVE_ADVICE` - Network error, re-attempt the transaction.
             * - `UNAUTHORIZED_MERCHANT` - Merchant locked card attempted at different merchant.
             * - `UNKNOWN_HOST_TIMEOUT` - Network error, re-attempt the transaction.
             * - `USER_TRANSACTION_LIMIT` - User-set spend limit exceeded.
             */
            fun result(result: Result) = result(JsonField.of(result))

            /**
             * `APPROVED` or decline reason.
             *
             * Result types:
             * - `ACCOUNT_STATE_TRANSACTION_FAIL` - Contact
             *   [support@lithic.com](mailto:support@lithic.com).
             * - `APPROVED` - Transaction is approved.
             * - `BANK_CONNECTION_ERROR` - Please reconnect a funding source.
             * - `BANK_NOT_VERIFIED` - Please confirm the funding source.
             * - `CARD_CLOSED` - Card state was closed at the time of authorization.
             * - `CARD_PAUSED` - Card state was paused at the time of authorization.
             * - `FRAUD_ADVICE` - Transaction declined due to risk.
             * - `INACTIVE_ACCOUNT` - Account is inactive. Contact
             *   [support@lithic.com](mailto:support@lithic.com).
             * - `INCORRECT_PIN` - PIN verification failed.
             * - `INVALID_CARD_DETAILS` - Incorrect CVV or expiry date.
             * - `INSUFFICIENT_FUNDS` - Please ensure the funding source is connected and up to
             *   date.
             * - `MERCHANT_BLACKLIST` - This merchant is disallowed on the platform.
             * - `SINGLE_USE_RECHARGED` - Single use card attempted multiple times.
             * - `SWITCH_INOPERATIVE_ADVICE` - Network error, re-attempt the transaction.
             * - `UNAUTHORIZED_MERCHANT` - Merchant locked card attempted at different merchant.
             * - `UNKNOWN_HOST_TIMEOUT` - Network error, re-attempt the transaction.
             * - `USER_TRANSACTION_LIMIT` - User-set spend limit exceeded.
             */
            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<Result>) = apply { this.result = result }

            /** Globally unique identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier. */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /**
             * Event types:
             * - `AUTHORIZATION` - Authorize a transaction.
             * - `AUTHORIZATION_ADVICE` - Advice on a transaction.
             * - `AUTHORIZATION_EXPIRY` - Authorization has expired and reversed by Lithic.
             * - `AUTHORIZATION_REVERSAL` - Authorization was reversed by the merchant.
             * - `BALANCE_INQUIRY` - A balance inquiry (typically a $0 authorization) has occurred
             *   on a card.
             * - `CLEARING` - Transaction is settled.
             * - `CORRECTION_DEBIT` - Manual transaction correction (Debit).
             * - `CORRECTION_CREDIT` - Manual transaction correction (Credit).
             * - `CREDIT_AUTHORIZATION` - A refund or credit authorization from a merchant.
             * - `CREDIT_AUTHORIZATION_ADVICE` - A credit authorization was approved on your behalf
             *   by the network.
             * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit funds without
             *   additional clearing.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit
             *   funds without additional clearing.
             * - `RETURN` - A refund has been processed on the transaction.
             * - `RETURN_REVERSAL` - A refund has been reversed (e.g., when a merchant reverses an
             *   incorrect refund).
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Event types:
             * - `AUTHORIZATION` - Authorize a transaction.
             * - `AUTHORIZATION_ADVICE` - Advice on a transaction.
             * - `AUTHORIZATION_EXPIRY` - Authorization has expired and reversed by Lithic.
             * - `AUTHORIZATION_REVERSAL` - Authorization was reversed by the merchant.
             * - `BALANCE_INQUIRY` - A balance inquiry (typically a $0 authorization) has occurred
             *   on a card.
             * - `CLEARING` - Transaction is settled.
             * - `CORRECTION_DEBIT` - Manual transaction correction (Debit).
             * - `CORRECTION_CREDIT` - Manual transaction correction (Credit).
             * - `CREDIT_AUTHORIZATION` - A refund or credit authorization from a merchant.
             * - `CREDIT_AUTHORIZATION_ADVICE` - A credit authorization was approved on your behalf
             *   by the network.
             * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit funds without
             *   additional clearing.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit
             *   funds without additional clearing.
             * - `RETURN` - A refund has been processed on the transaction.
             * - `RETURN_REVERSAL` - A refund has been reversed (e.g., when a merchant reverses an
             *   incorrect refund).
             */
            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TransactionEvent =
                TransactionEvent(
                    amount,
                    amounts,
                    created,
                    detailedResults.map { it.toUnmodifiable() },
                    effectivePolarity,
                    result,
                    token,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = TransactionEventAmounts.Builder::class)
        @NoAutoDetect
        class TransactionEventAmounts
        private constructor(
            private val cardholder: JsonField<CardholderEventAmounts>,
            private val merchant: JsonField<MerchantEventAmounts>,
            private val settlement: JsonField<SettlementEventAmounts>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            fun cardholder(): CardholderEventAmounts = cardholder.getRequired("cardholder")

            fun merchant(): MerchantEventAmounts = merchant.getRequired("merchant")

            fun settlement(): Optional<SettlementEventAmounts> =
                Optional.ofNullable(settlement.getNullable("settlement"))

            @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

            @JsonProperty("merchant") @ExcludeMissing fun _merchant() = merchant

            @JsonProperty("settlement") @ExcludeMissing fun _settlement() = settlement

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): TransactionEventAmounts = apply {
                if (!validated) {
                    cardholder().validate()
                    merchant().validate()
                    settlement().map { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var cardholder: JsonField<CardholderEventAmounts> = JsonMissing.of()
                private var merchant: JsonField<MerchantEventAmounts> = JsonMissing.of()
                private var settlement: JsonField<SettlementEventAmounts> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(transactionEventAmounts: TransactionEventAmounts) = apply {
                    this.cardholder = transactionEventAmounts.cardholder
                    this.merchant = transactionEventAmounts.merchant
                    this.settlement = transactionEventAmounts.settlement
                    additionalProperties(transactionEventAmounts.additionalProperties)
                }

                fun cardholder(cardholder: CardholderEventAmounts) =
                    cardholder(JsonField.of(cardholder))

                @JsonProperty("cardholder")
                @ExcludeMissing
                fun cardholder(cardholder: JsonField<CardholderEventAmounts>) = apply {
                    this.cardholder = cardholder
                }

                fun merchant(merchant: MerchantEventAmounts) = merchant(JsonField.of(merchant))

                @JsonProperty("merchant")
                @ExcludeMissing
                fun merchant(merchant: JsonField<MerchantEventAmounts>) = apply {
                    this.merchant = merchant
                }

                fun settlement(settlement: SettlementEventAmounts) =
                    settlement(JsonField.of(settlement))

                @JsonProperty("settlement")
                @ExcludeMissing
                fun settlement(settlement: JsonField<SettlementEventAmounts>) = apply {
                    this.settlement = settlement
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): TransactionEventAmounts =
                    TransactionEventAmounts(
                        cardholder,
                        merchant,
                        settlement,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            @JsonDeserialize(builder = CardholderEventAmounts.Builder::class)
            @NoAutoDetect
            class CardholderEventAmounts
            private constructor(
                private val amount: JsonField<Long>,
                private val conversionRate: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun amount(): Long = amount.getRequired("amount")

                fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): CardholderEventAmounts = apply {
                    if (!validated) {
                        amount()
                        conversionRate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var conversionRate: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(cardholderEventAmounts: CardholderEventAmounts) = apply {
                        this.amount = cardholderEventAmounts.amount
                        this.conversionRate = cardholderEventAmounts.conversionRate
                        this.currency = cardholderEventAmounts.currency
                        additionalProperties(cardholderEventAmounts.additionalProperties)
                    }

                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun conversionRate(conversionRate: String) =
                        conversionRate(JsonField.of(conversionRate))

                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<String>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like ``XXX`. Enumerants names are lowercase currency code
                     * e.g. :attr:`EUR`, :attr:`USD`.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like ``XXX`. Enumerants names are lowercase currency code
                     * e.g. :attr:`EUR`, :attr:`USD`.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): CardholderEventAmounts =
                        CardholderEventAmounts(
                            amount,
                            conversionRate,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is CardholderEventAmounts && this.amount == other.amount && this.conversionRate == other.conversionRate && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(amount, conversionRate, currency, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "CardholderEventAmounts{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = MerchantEventAmounts.Builder::class)
            @NoAutoDetect
            class MerchantEventAmounts
            private constructor(
                private val amount: JsonField<Long>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun amount(): Long = amount.getRequired("amount")

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): MerchantEventAmounts = apply {
                    if (!validated) {
                        amount()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(merchantEventAmounts: MerchantEventAmounts) = apply {
                        this.amount = merchantEventAmounts.amount
                        this.currency = merchantEventAmounts.currency
                        additionalProperties(merchantEventAmounts.additionalProperties)
                    }

                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like ``XXX`. Enumerants names are lowercase currency code
                     * e.g. :attr:`EUR`, :attr:`USD`.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like ``XXX`. Enumerants names are lowercase currency code
                     * e.g. :attr:`EUR`, :attr:`USD`.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): MerchantEventAmounts =
                        MerchantEventAmounts(
                            amount,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is MerchantEventAmounts && this.amount == other.amount && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(amount, currency, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "MerchantEventAmounts{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            @JsonDeserialize(builder = SettlementEventAmounts.Builder::class)
            @NoAutoDetect
            class SettlementEventAmounts
            private constructor(
                private val amount: JsonField<Long>,
                private val conversionRate: JsonField<String>,
                private val currency: JsonField<Currency>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                fun amount(): Long = amount.getRequired("amount")

                fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like ``XXX`. Enumerants names are lowercase currency code e.g.
                 * :attr:`EUR`, :attr:`USD`.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): SettlementEventAmounts = apply {
                    if (!validated) {
                        amount()
                        conversionRate()
                        currency()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var amount: JsonField<Long> = JsonMissing.of()
                    private var conversionRate: JsonField<String> = JsonMissing.of()
                    private var currency: JsonField<Currency> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(settlementEventAmounts: SettlementEventAmounts) = apply {
                        this.amount = settlementEventAmounts.amount
                        this.conversionRate = settlementEventAmounts.conversionRate
                        this.currency = settlementEventAmounts.currency
                        additionalProperties(settlementEventAmounts.additionalProperties)
                    }

                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    @JsonProperty("amount")
                    @ExcludeMissing
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    fun conversionRate(conversionRate: String) =
                        conversionRate(JsonField.of(conversionRate))

                    @JsonProperty("conversion_rate")
                    @ExcludeMissing
                    fun conversionRate(conversionRate: JsonField<String>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like ``XXX`. Enumerants names are lowercase currency code
                     * e.g. :attr:`EUR`, :attr:`USD`.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like ``XXX`. Enumerants names are lowercase currency code
                     * e.g. :attr:`EUR`, :attr:`USD`.
                     */
                    @JsonProperty("currency")
                    @ExcludeMissing
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): SettlementEventAmounts =
                        SettlementEventAmounts(
                            amount,
                            conversionRate,
                            currency,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is SettlementEventAmounts && this.amount == other.amount && this.conversionRate == other.conversionRate && this.currency == other.currency && this.additionalProperties == other.additionalProperties /* spotless:on */
                }

                private var hashCode: Int = 0

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode = /* spotless:off */ Objects.hash(amount, conversionRate, currency, additionalProperties) /* spotless:on */
                    }
                    return hashCode
                }

                override fun toString() =
                    "SettlementEventAmounts{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionEventAmounts && this.cardholder == other.cardholder && this.merchant == other.merchant && this.settlement == other.settlement && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(cardholder, merchant, settlement, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "TransactionEventAmounts{cardholder=$cardholder, merchant=$merchant, settlement=$settlement, additionalProperties=$additionalProperties}"
        }

        class DetailedResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DetailedResult && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED =
                    DetailedResult(JsonField.of("ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED"))

                @JvmField
                val ACCOUNT_DELINQUENT = DetailedResult(JsonField.of("ACCOUNT_DELINQUENT"))

                @JvmField val ACCOUNT_INACTIVE = DetailedResult(JsonField.of("ACCOUNT_INACTIVE"))

                @JvmField
                val ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED =
                    DetailedResult(JsonField.of("ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED"))

                @JvmField
                val ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED =
                    DetailedResult(JsonField.of("ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED"))

                @JvmField
                val ACCOUNT_UNDER_REVIEW = DetailedResult(JsonField.of("ACCOUNT_UNDER_REVIEW"))

                @JvmField val ADDRESS_INCORRECT = DetailedResult(JsonField.of("ADDRESS_INCORRECT"))

                @JvmField val APPROVED = DetailedResult(JsonField.of("APPROVED"))

                @JvmField
                val AUTH_RULE_ALLOWED_COUNTRY =
                    DetailedResult(JsonField.of("AUTH_RULE_ALLOWED_COUNTRY"))

                @JvmField
                val AUTH_RULE_ALLOWED_MCC = DetailedResult(JsonField.of("AUTH_RULE_ALLOWED_MCC"))

                @JvmField
                val AUTH_RULE_BLOCKED_COUNTRY =
                    DetailedResult(JsonField.of("AUTH_RULE_BLOCKED_COUNTRY"))

                @JvmField
                val AUTH_RULE_BLOCKED_MCC = DetailedResult(JsonField.of("AUTH_RULE_BLOCKED_MCC"))

                @JvmField val CARD_CLOSED = DetailedResult(JsonField.of("CARD_CLOSED"))

                @JvmField
                val CARD_CRYPTOGRAM_VALIDATION_FAILURE =
                    DetailedResult(JsonField.of("CARD_CRYPTOGRAM_VALIDATION_FAILURE"))

                @JvmField val CARD_EXPIRED = DetailedResult(JsonField.of("CARD_EXPIRED"))

                @JvmField
                val CARD_EXPIRY_DATE_INCORRECT =
                    DetailedResult(JsonField.of("CARD_EXPIRY_DATE_INCORRECT"))

                @JvmField val CARD_INVALID = DetailedResult(JsonField.of("CARD_INVALID"))

                @JvmField
                val CARD_NOT_ACTIVATED = DetailedResult(JsonField.of("CARD_NOT_ACTIVATED"))

                @JvmField val CARD_PAUSED = DetailedResult(JsonField.of("CARD_PAUSED"))

                @JvmField
                val CARD_PIN_INCORRECT = DetailedResult(JsonField.of("CARD_PIN_INCORRECT"))

                @JvmField val CARD_RESTRICTED = DetailedResult(JsonField.of("CARD_RESTRICTED"))

                @JvmField
                val CARD_SECURITY_CODE_INCORRECT =
                    DetailedResult(JsonField.of("CARD_SECURITY_CODE_INCORRECT"))

                @JvmField
                val CARD_SPEND_LIMIT_EXCEEDED =
                    DetailedResult(JsonField.of("CARD_SPEND_LIMIT_EXCEEDED"))

                @JvmField
                val CONTACT_CARD_ISSUER = DetailedResult(JsonField.of("CONTACT_CARD_ISSUER"))

                @JvmField
                val CUSTOMER_ASA_TIMEOUT = DetailedResult(JsonField.of("CUSTOMER_ASA_TIMEOUT"))

                @JvmField val CUSTOM_ASA_RESULT = DetailedResult(JsonField.of("CUSTOM_ASA_RESULT"))

                @JvmField val DECLINED = DetailedResult(JsonField.of("DECLINED"))

                @JvmField val DO_NOT_HONOR = DetailedResult(JsonField.of("DO_NOT_HONOR"))

                @JvmField
                val DRIVER_NUMBER_INVALID = DetailedResult(JsonField.of("DRIVER_NUMBER_INVALID"))

                @JvmField val FORMAT_ERROR = DetailedResult(JsonField.of("FORMAT_ERROR"))

                @JvmField
                val INSUFFICIENT_FUNDING_SOURCE_BALANCE =
                    DetailedResult(JsonField.of("INSUFFICIENT_FUNDING_SOURCE_BALANCE"))

                @JvmField
                val INSUFFICIENT_FUNDS = DetailedResult(JsonField.of("INSUFFICIENT_FUNDS"))

                @JvmField
                val LITHIC_SYSTEM_ERROR = DetailedResult(JsonField.of("LITHIC_SYSTEM_ERROR"))

                @JvmField
                val LITHIC_SYSTEM_RATE_LIMIT =
                    DetailedResult(JsonField.of("LITHIC_SYSTEM_RATE_LIMIT"))

                @JvmField
                val MALFORMED_ASA_RESPONSE = DetailedResult(JsonField.of("MALFORMED_ASA_RESPONSE"))

                @JvmField val MERCHANT_INVALID = DetailedResult(JsonField.of("MERCHANT_INVALID"))

                @JvmField
                val MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE =
                    DetailedResult(JsonField.of("MERCHANT_LOCKED_CARD_ATTEMPTED_ELSEWHERE"))

                @JvmField
                val MERCHANT_NOT_PERMITTED = DetailedResult(JsonField.of("MERCHANT_NOT_PERMITTED"))

                @JvmField
                val OVER_REVERSAL_ATTEMPTED =
                    DetailedResult(JsonField.of("OVER_REVERSAL_ATTEMPTED"))

                @JvmField
                val PROGRAM_CARD_SPEND_LIMIT_EXCEEDED =
                    DetailedResult(JsonField.of("PROGRAM_CARD_SPEND_LIMIT_EXCEEDED"))

                @JvmField val PROGRAM_SUSPENDED = DetailedResult(JsonField.of("PROGRAM_SUSPENDED"))

                @JvmField
                val PROGRAM_USAGE_RESTRICTION =
                    DetailedResult(JsonField.of("PROGRAM_USAGE_RESTRICTION"))

                @JvmField
                val REVERSAL_UNMATCHED = DetailedResult(JsonField.of("REVERSAL_UNMATCHED"))

                @JvmField
                val SECURITY_VIOLATION = DetailedResult(JsonField.of("SECURITY_VIOLATION"))

                @JvmField
                val SINGLE_USE_CARD_REATTEMPTED =
                    DetailedResult(JsonField.of("SINGLE_USE_CARD_REATTEMPTED"))

                @JvmField
                val TRANSACTION_INVALID = DetailedResult(JsonField.of("TRANSACTION_INVALID"))

                @JvmField
                val TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL =
                    DetailedResult(
                        JsonField.of("TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL")
                    )

                @JvmField
                val TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER =
                    DetailedResult(
                        JsonField.of("TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER")
                    )

                @JvmField
                val TRANSACTION_PREVIOUSLY_COMPLETED =
                    DetailedResult(JsonField.of("TRANSACTION_PREVIOUSLY_COMPLETED"))

                @JvmField
                val UNAUTHORIZED_MERCHANT = DetailedResult(JsonField.of("UNAUTHORIZED_MERCHANT"))

                @JvmField
                val VEHICLE_NUMBER_INVALID = DetailedResult(JsonField.of("VEHICLE_NUMBER_INVALID"))

                @JvmStatic fun of(value: String) = DetailedResult(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_DELINQUENT,
                ACCOUNT_INACTIVE,
                ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED,
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
                PROGRAM_CARD_SPEND_LIMIT_EXCEEDED,
                PROGRAM_SUSPENDED,
                PROGRAM_USAGE_RESTRICTION,
                REVERSAL_UNMATCHED,
                SECURITY_VIOLATION,
                SINGLE_USE_CARD_REATTEMPTED,
                TRANSACTION_INVALID,
                TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL,
                TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER,
                TRANSACTION_PREVIOUSLY_COMPLETED,
                UNAUTHORIZED_MERCHANT,
                VEHICLE_NUMBER_INVALID,
            }

            enum class Value {
                ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_DELINQUENT,
                ACCOUNT_INACTIVE,
                ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED,
                ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED,
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
                PROGRAM_CARD_SPEND_LIMIT_EXCEEDED,
                PROGRAM_SUSPENDED,
                PROGRAM_USAGE_RESTRICTION,
                REVERSAL_UNMATCHED,
                SECURITY_VIOLATION,
                SINGLE_USE_CARD_REATTEMPTED,
                TRANSACTION_INVALID,
                TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL,
                TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER,
                TRANSACTION_PREVIOUSLY_COMPLETED,
                UNAUTHORIZED_MERCHANT,
                VEHICLE_NUMBER_INVALID,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED -> Value.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_DELINQUENT -> Value.ACCOUNT_DELINQUENT
                    ACCOUNT_INACTIVE -> Value.ACCOUNT_INACTIVE
                    ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED ->
                        Value.ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED ->
                        Value.ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED
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
                    PROGRAM_CARD_SPEND_LIMIT_EXCEEDED -> Value.PROGRAM_CARD_SPEND_LIMIT_EXCEEDED
                    PROGRAM_SUSPENDED -> Value.PROGRAM_SUSPENDED
                    PROGRAM_USAGE_RESTRICTION -> Value.PROGRAM_USAGE_RESTRICTION
                    REVERSAL_UNMATCHED -> Value.REVERSAL_UNMATCHED
                    SECURITY_VIOLATION -> Value.SECURITY_VIOLATION
                    SINGLE_USE_CARD_REATTEMPTED -> Value.SINGLE_USE_CARD_REATTEMPTED
                    TRANSACTION_INVALID -> Value.TRANSACTION_INVALID
                    TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL ->
                        Value.TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL
                    TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER ->
                        Value.TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER
                    TRANSACTION_PREVIOUSLY_COMPLETED -> Value.TRANSACTION_PREVIOUSLY_COMPLETED
                    UNAUTHORIZED_MERCHANT -> Value.UNAUTHORIZED_MERCHANT
                    VEHICLE_NUMBER_INVALID -> Value.VEHICLE_NUMBER_INVALID
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED -> Known.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_DELINQUENT -> Known.ACCOUNT_DELINQUENT
                    ACCOUNT_INACTIVE -> Known.ACCOUNT_INACTIVE
                    ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED ->
                        Known.ACCOUNT_LIFETIME_SPEND_LIMIT_EXCEEDED
                    ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED ->
                        Known.ACCOUNT_MONTHLY_SPEND_LIMIT_EXCEEDED
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
                    PROGRAM_CARD_SPEND_LIMIT_EXCEEDED -> Known.PROGRAM_CARD_SPEND_LIMIT_EXCEEDED
                    PROGRAM_SUSPENDED -> Known.PROGRAM_SUSPENDED
                    PROGRAM_USAGE_RESTRICTION -> Known.PROGRAM_USAGE_RESTRICTION
                    REVERSAL_UNMATCHED -> Known.REVERSAL_UNMATCHED
                    SECURITY_VIOLATION -> Known.SECURITY_VIOLATION
                    SINGLE_USE_CARD_REATTEMPTED -> Known.SINGLE_USE_CARD_REATTEMPTED
                    TRANSACTION_INVALID -> Known.TRANSACTION_INVALID
                    TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL ->
                        Known.TRANSACTION_NOT_PERMITTED_TO_ACQUIRER_OR_TERMINAL
                    TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER ->
                        Known.TRANSACTION_NOT_PERMITTED_TO_ISSUER_OR_CARDHOLDER
                    TRANSACTION_PREVIOUSLY_COMPLETED -> Known.TRANSACTION_PREVIOUSLY_COMPLETED
                    UNAUTHORIZED_MERCHANT -> Known.UNAUTHORIZED_MERCHANT
                    VEHICLE_NUMBER_INVALID -> Known.VEHICLE_NUMBER_INVALID
                    else -> throw LithicInvalidDataException("Unknown DetailedResult: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

                @JvmField val BANK_CONNECTION_ERROR = Result(JsonField.of("BANK_CONNECTION_ERROR"))

                @JvmField val BANK_NOT_VERIFIED = Result(JsonField.of("BANK_NOT_VERIFIED"))

                @JvmField val CARD_CLOSED = Result(JsonField.of("CARD_CLOSED"))

                @JvmField val CARD_PAUSED = Result(JsonField.of("CARD_PAUSED"))

                @JvmField val DECLINED = Result(JsonField.of("DECLINED"))

                @JvmField val FRAUD_ADVICE = Result(JsonField.of("FRAUD_ADVICE"))

                @JvmField val INACTIVE_ACCOUNT = Result(JsonField.of("INACTIVE_ACCOUNT"))

                @JvmField val INCORRECT_PIN = Result(JsonField.of("INCORRECT_PIN"))

                @JvmField val INSUFFICIENT_FUNDS = Result(JsonField.of("INSUFFICIENT_FUNDS"))

                @JvmField val INVALID_CARD_DETAILS = Result(JsonField.of("INVALID_CARD_DETAILS"))

                @JvmField val MERCHANT_BLACKLIST = Result(JsonField.of("MERCHANT_BLACKLIST"))

                @JvmField val SINGLE_USE_RECHARGED = Result(JsonField.of("SINGLE_USE_RECHARGED"))

                @JvmField
                val SWITCH_INOPERATIVE_ADVICE = Result(JsonField.of("SWITCH_INOPERATIVE_ADVICE"))

                @JvmField val UNAUTHORIZED_MERCHANT = Result(JsonField.of("UNAUTHORIZED_MERCHANT"))

                @JvmField val UNKNOWN_HOST_TIMEOUT = Result(JsonField.of("UNKNOWN_HOST_TIMEOUT"))

                @JvmField
                val USER_TRANSACTION_LIMIT = Result(JsonField.of("USER_TRANSACTION_LIMIT"))

                @JvmStatic fun of(value: String) = Result(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                BANK_CONNECTION_ERROR,
                BANK_NOT_VERIFIED,
                CARD_CLOSED,
                CARD_PAUSED,
                DECLINED,
                FRAUD_ADVICE,
                INACTIVE_ACCOUNT,
                INCORRECT_PIN,
                INSUFFICIENT_FUNDS,
                INVALID_CARD_DETAILS,
                MERCHANT_BLACKLIST,
                SINGLE_USE_RECHARGED,
                SWITCH_INOPERATIVE_ADVICE,
                UNAUTHORIZED_MERCHANT,
                UNKNOWN_HOST_TIMEOUT,
                USER_TRANSACTION_LIMIT,
            }

            enum class Value {
                APPROVED,
                BANK_CONNECTION_ERROR,
                BANK_NOT_VERIFIED,
                CARD_CLOSED,
                CARD_PAUSED,
                DECLINED,
                FRAUD_ADVICE,
                INACTIVE_ACCOUNT,
                INCORRECT_PIN,
                INSUFFICIENT_FUNDS,
                INVALID_CARD_DETAILS,
                MERCHANT_BLACKLIST,
                SINGLE_USE_RECHARGED,
                SWITCH_INOPERATIVE_ADVICE,
                UNAUTHORIZED_MERCHANT,
                UNKNOWN_HOST_TIMEOUT,
                USER_TRANSACTION_LIMIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    BANK_CONNECTION_ERROR -> Value.BANK_CONNECTION_ERROR
                    BANK_NOT_VERIFIED -> Value.BANK_NOT_VERIFIED
                    CARD_CLOSED -> Value.CARD_CLOSED
                    CARD_PAUSED -> Value.CARD_PAUSED
                    DECLINED -> Value.DECLINED
                    FRAUD_ADVICE -> Value.FRAUD_ADVICE
                    INACTIVE_ACCOUNT -> Value.INACTIVE_ACCOUNT
                    INCORRECT_PIN -> Value.INCORRECT_PIN
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                    INVALID_CARD_DETAILS -> Value.INVALID_CARD_DETAILS
                    MERCHANT_BLACKLIST -> Value.MERCHANT_BLACKLIST
                    SINGLE_USE_RECHARGED -> Value.SINGLE_USE_RECHARGED
                    SWITCH_INOPERATIVE_ADVICE -> Value.SWITCH_INOPERATIVE_ADVICE
                    UNAUTHORIZED_MERCHANT -> Value.UNAUTHORIZED_MERCHANT
                    UNKNOWN_HOST_TIMEOUT -> Value.UNKNOWN_HOST_TIMEOUT
                    USER_TRANSACTION_LIMIT -> Value.USER_TRANSACTION_LIMIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    BANK_CONNECTION_ERROR -> Known.BANK_CONNECTION_ERROR
                    BANK_NOT_VERIFIED -> Known.BANK_NOT_VERIFIED
                    CARD_CLOSED -> Known.CARD_CLOSED
                    CARD_PAUSED -> Known.CARD_PAUSED
                    DECLINED -> Known.DECLINED
                    FRAUD_ADVICE -> Known.FRAUD_ADVICE
                    INACTIVE_ACCOUNT -> Known.INACTIVE_ACCOUNT
                    INCORRECT_PIN -> Known.INCORRECT_PIN
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                    INVALID_CARD_DETAILS -> Known.INVALID_CARD_DETAILS
                    MERCHANT_BLACKLIST -> Known.MERCHANT_BLACKLIST
                    SINGLE_USE_RECHARGED -> Known.SINGLE_USE_RECHARGED
                    SWITCH_INOPERATIVE_ADVICE -> Known.SWITCH_INOPERATIVE_ADVICE
                    UNAUTHORIZED_MERCHANT -> Known.UNAUTHORIZED_MERCHANT
                    UNKNOWN_HOST_TIMEOUT -> Known.UNKNOWN_HOST_TIMEOUT
                    USER_TRANSACTION_LIMIT -> Known.USER_TRANSACTION_LIMIT
                    else -> throw LithicInvalidDataException("Unknown Result: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val AUTHORIZATION = Type(JsonField.of("AUTHORIZATION"))

                @JvmField val AUTHORIZATION_ADVICE = Type(JsonField.of("AUTHORIZATION_ADVICE"))

                @JvmField val AUTHORIZATION_EXPIRY = Type(JsonField.of("AUTHORIZATION_EXPIRY"))

                @JvmField val AUTHORIZATION_REVERSAL = Type(JsonField.of("AUTHORIZATION_REVERSAL"))

                @JvmField val BALANCE_INQUIRY = Type(JsonField.of("BALANCE_INQUIRY"))

                @JvmField val CLEARING = Type(JsonField.of("CLEARING"))

                @JvmField val CORRECTION_CREDIT = Type(JsonField.of("CORRECTION_CREDIT"))

                @JvmField val CORRECTION_DEBIT = Type(JsonField.of("CORRECTION_DEBIT"))

                @JvmField val CREDIT_AUTHORIZATION = Type(JsonField.of("CREDIT_AUTHORIZATION"))

                @JvmField
                val CREDIT_AUTHORIZATION_ADVICE = Type(JsonField.of("CREDIT_AUTHORIZATION_ADVICE"))

                @JvmField
                val FINANCIAL_AUTHORIZATION = Type(JsonField.of("FINANCIAL_AUTHORIZATION"))

                @JvmField
                val FINANCIAL_CREDIT_AUTHORIZATION =
                    Type(JsonField.of("FINANCIAL_CREDIT_AUTHORIZATION"))

                @JvmField val RETURN = Type(JsonField.of("RETURN"))

                @JvmField val RETURN_REVERSAL = Type(JsonField.of("RETURN_REVERSAL"))

                @JvmField val VOID = Type(JsonField.of("VOID"))

                @JvmStatic fun of(value: String) = Type(JsonField.of(value))
            }

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
                VOID,
            }

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
                VOID,
                _UNKNOWN,
            }

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
                    VOID -> Value.VOID
                    else -> Value._UNKNOWN
                }

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
                    VOID -> Known.VOID
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class EffectivePolarity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EffectivePolarity && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CREDIT = EffectivePolarity(JsonField.of("CREDIT"))

                @JvmField val DEBIT = EffectivePolarity(JsonField.of("DEBIT"))

                @JvmStatic fun of(value: String) = EffectivePolarity(JsonField.of(value))
            }

            enum class Known {
                CREDIT,
                DEBIT,
            }

            enum class Value {
                CREDIT,
                DEBIT,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CREDIT -> Value.CREDIT
                    DEBIT -> Value.DEBIT
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CREDIT -> Known.CREDIT
                    DEBIT -> Known.DEBIT
                    else -> throw LithicInvalidDataException("Unknown EffectivePolarity: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionEvent && this.amount == other.amount && this.amounts == other.amounts && this.created == other.created && this.detailedResults == other.detailedResults && this.effectivePolarity == other.effectivePolarity && this.result == other.result && this.token == other.token && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, amounts, created, detailedResults, effectivePolarity, result, token, type, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TransactionEvent{amount=$amount, amounts=$amounts, created=$created, detailedResults=$detailedResults, effectivePolarity=$effectivePolarity, result=$result, token=$token, type=$type, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = Merchant.Builder::class)
    @NoAutoDetect
    class Merchant
    private constructor(
        private val acceptorId: JsonField<String>,
        private val city: JsonField<String>,
        private val country: JsonField<String>,
        private val descriptor: JsonField<String>,
        private val mcc: JsonField<String>,
        private val state: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Unique identifier to identify the payment card acceptor. */
        fun acceptorId(): Optional<String> =
            Optional.ofNullable(acceptorId.getNullable("acceptor_id"))

        /** City of card acceptor. */
        fun city(): Optional<String> = Optional.ofNullable(city.getNullable("city"))

        /** Uppercase country of card acceptor (see ISO 8583 specs). */
        fun country(): Optional<String> = Optional.ofNullable(country.getNullable("country"))

        /** Short description of card acceptor. */
        fun descriptor(): Optional<String> =
            Optional.ofNullable(descriptor.getNullable("descriptor"))

        /**
         * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used to
         * classify a business by the types of goods or services it provides.
         */
        fun mcc(): Optional<String> = Optional.ofNullable(mcc.getNullable("mcc"))

        /** Geographic state of card acceptor (see ISO 8583 specs). */
        fun state(): Optional<String> = Optional.ofNullable(state.getNullable("state"))

        /** Unique identifier to identify the payment card acceptor. */
        @JsonProperty("acceptor_id") @ExcludeMissing fun _acceptorId() = acceptorId

        /** City of card acceptor. */
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /** Uppercase country of card acceptor (see ISO 8583 specs). */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        /** Short description of card acceptor. */
        @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

        /**
         * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used to
         * classify a business by the types of goods or services it provides.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc() = mcc

        /** Geographic state of card acceptor (see ISO 8583 specs). */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Merchant = apply {
            if (!validated) {
                acceptorId()
                city()
                country()
                descriptor()
                mcc()
                state()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var acceptorId: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var descriptor: JsonField<String> = JsonMissing.of()
            private var mcc: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(merchant: Merchant) = apply {
                this.acceptorId = merchant.acceptorId
                this.city = merchant.city
                this.country = merchant.country
                this.descriptor = merchant.descriptor
                this.mcc = merchant.mcc
                this.state = merchant.state
                additionalProperties(merchant.additionalProperties)
            }

            /** Unique identifier to identify the payment card acceptor. */
            fun acceptorId(acceptorId: String) = acceptorId(JsonField.of(acceptorId))

            /** Unique identifier to identify the payment card acceptor. */
            @JsonProperty("acceptor_id")
            @ExcludeMissing
            fun acceptorId(acceptorId: JsonField<String>) = apply { this.acceptorId = acceptorId }

            /** City of card acceptor. */
            fun city(city: String) = city(JsonField.of(city))

            /** City of card acceptor. */
            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** Uppercase country of card acceptor (see ISO 8583 specs). */
            fun country(country: String) = country(JsonField.of(country))

            /** Uppercase country of card acceptor (see ISO 8583 specs). */
            @JsonProperty("country")
            @ExcludeMissing
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Short description of card acceptor. */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /** Short description of card acceptor. */
            @JsonProperty("descriptor")
            @ExcludeMissing
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            /**
             * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used
             * to classify a business by the types of goods or services it provides.
             */
            fun mcc(mcc: String) = mcc(JsonField.of(mcc))

            /**
             * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used
             * to classify a business by the types of goods or services it provides.
             */
            @JsonProperty("mcc")
            @ExcludeMissing
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Geographic state of card acceptor (see ISO 8583 specs). */
            fun state(state: String) = state(JsonField.of(state))

            /** Geographic state of card acceptor (see ISO 8583 specs). */
            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Merchant =
                Merchant(
                    acceptorId,
                    city,
                    country,
                    descriptor,
                    mcc,
                    state,
                    additionalProperties.toUnmodifiable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Merchant && this.acceptorId == other.acceptorId && this.city == other.city && this.country == other.country && this.descriptor == other.descriptor && this.mcc == other.mcc && this.state == other.state && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(acceptorId, city, country, descriptor, mcc, state, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Merchant{acceptorId=$acceptorId, city=$city, country=$country, descriptor=$descriptor, mcc=$mcc, state=$state, additionalProperties=$additionalProperties}"
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Network && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INTERLINK = Network(JsonField.of("INTERLINK"))

            @JvmField val MAESTRO = Network(JsonField.of("MAESTRO"))

            @JvmField val MASTERCARD = Network(JsonField.of("MASTERCARD"))

            @JvmField val UNKNOWN = Network(JsonField.of("UNKNOWN"))

            @JvmField val VISA = Network(JsonField.of("VISA"))

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
            VISA,
        }

        enum class Value {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            UNKNOWN,
            VISA,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTERLINK -> Value.INTERLINK
                MAESTRO -> Value.MAESTRO
                MASTERCARD -> Value.MASTERCARD
                UNKNOWN -> Value.UNKNOWN
                VISA -> Value.VISA
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTERLINK -> Known.INTERLINK
                MAESTRO -> Known.MAESTRO
                MASTERCARD -> Known.MASTERCARD
                UNKNOWN -> Known.UNKNOWN
                VISA -> Known.VISA
                else -> throw LithicInvalidDataException("Unknown Network: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = Pos.Builder::class)
    @NoAutoDetect
    class Pos
    private constructor(
        private val entryMode: JsonField<EntryMode>,
        private val terminal: JsonField<Terminal>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun entryMode(): EntryMode = entryMode.getRequired("entry_mode")

        fun terminal(): Terminal = terminal.getRequired("terminal")

        @JsonProperty("entry_mode") @ExcludeMissing fun _entryMode() = entryMode

        @JsonProperty("terminal") @ExcludeMissing fun _terminal() = terminal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Pos = apply {
            if (!validated) {
                entryMode().validate()
                terminal().validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var entryMode: JsonField<EntryMode> = JsonMissing.of()
            private var terminal: JsonField<Terminal> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pos: Pos) = apply {
                this.entryMode = pos.entryMode
                this.terminal = pos.terminal
                additionalProperties(pos.additionalProperties)
            }

            fun entryMode(entryMode: EntryMode) = entryMode(JsonField.of(entryMode))

            @JsonProperty("entry_mode")
            @ExcludeMissing
            fun entryMode(entryMode: JsonField<EntryMode>) = apply { this.entryMode = entryMode }

            fun terminal(terminal: Terminal) = terminal(JsonField.of(terminal))

            @JsonProperty("terminal")
            @ExcludeMissing
            fun terminal(terminal: JsonField<Terminal>) = apply { this.terminal = terminal }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Pos =
                Pos(
                    entryMode,
                    terminal,
                    additionalProperties.toUnmodifiable(),
                )
        }

        @JsonDeserialize(builder = EntryMode.Builder::class)
        @NoAutoDetect
        class EntryMode
        private constructor(
            private val card: JsonField<Card>,
            private val cardholder: JsonField<Cardholder>,
            private val pan: JsonField<Pan>,
            private val pinEntered: JsonField<Boolean>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Card status */
            fun card(): Card = card.getRequired("card")

            /** Cardholder Presence status */
            fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

            /** Method of entry for the PAN */
            fun pan(): Pan = pan.getRequired("pan")

            /** True if the PIN was entered */
            fun pinEntered(): Boolean = pinEntered.getRequired("pin_entered")

            /** Card status */
            @JsonProperty("card") @ExcludeMissing fun _card() = card

            /** Cardholder Presence status */
            @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

            /** Method of entry for the PAN */
            @JsonProperty("pan") @ExcludeMissing fun _pan() = pan

            /** True if the PIN was entered */
            @JsonProperty("pin_entered") @ExcludeMissing fun _pinEntered() = pinEntered

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): EntryMode = apply {
                if (!validated) {
                    card()
                    cardholder()
                    pan()
                    pinEntered()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var card: JsonField<Card> = JsonMissing.of()
                private var cardholder: JsonField<Cardholder> = JsonMissing.of()
                private var pan: JsonField<Pan> = JsonMissing.of()
                private var pinEntered: JsonField<Boolean> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(entryMode: EntryMode) = apply {
                    this.card = entryMode.card
                    this.cardholder = entryMode.cardholder
                    this.pan = entryMode.pan
                    this.pinEntered = entryMode.pinEntered
                    additionalProperties(entryMode.additionalProperties)
                }

                /** Card status */
                fun card(card: Card) = card(JsonField.of(card))

                /** Card status */
                @JsonProperty("card")
                @ExcludeMissing
                fun card(card: JsonField<Card>) = apply { this.card = card }

                /** Cardholder Presence status */
                fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

                /** Cardholder Presence status */
                @JsonProperty("cardholder")
                @ExcludeMissing
                fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                    this.cardholder = cardholder
                }

                /** Method of entry for the PAN */
                fun pan(pan: Pan) = pan(JsonField.of(pan))

                /** Method of entry for the PAN */
                @JsonProperty("pan")
                @ExcludeMissing
                fun pan(pan: JsonField<Pan>) = apply { this.pan = pan }

                /** True if the PIN was entered */
                fun pinEntered(pinEntered: Boolean) = pinEntered(JsonField.of(pinEntered))

                /** True if the PIN was entered */
                @JsonProperty("pin_entered")
                @ExcludeMissing
                fun pinEntered(pinEntered: JsonField<Boolean>) = apply {
                    this.pinEntered = pinEntered
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): EntryMode =
                    EntryMode(
                        card,
                        cardholder,
                        pan,
                        pinEntered,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Card
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Card && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val NOT_PRESENT = Card(JsonField.of("NOT_PRESENT"))

                    @JvmField val PREAUTHORIZED = Card(JsonField.of("PREAUTHORIZED"))

                    @JvmField val PRESENT = Card(JsonField.of("PRESENT"))

                    @JvmField val UNKNOWN = Card(JsonField.of("UNKNOWN"))

                    @JvmStatic fun of(value: String) = Card(JsonField.of(value))
                }

                enum class Known {
                    NOT_PRESENT,
                    PREAUTHORIZED,
                    PRESENT,
                    UNKNOWN,
                }

                enum class Value {
                    NOT_PRESENT,
                    PREAUTHORIZED,
                    PRESENT,
                    UNKNOWN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        NOT_PRESENT -> Value.NOT_PRESENT
                        PREAUTHORIZED -> Value.PREAUTHORIZED
                        PRESENT -> Value.PRESENT
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        NOT_PRESENT -> Known.NOT_PRESENT
                        PREAUTHORIZED -> Known.PREAUTHORIZED
                        PRESENT -> Known.PRESENT
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Card: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Cardholder
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Cardholder && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val DEFERRED_BILLING = Cardholder(JsonField.of("DEFERRED_BILLING"))

                    @JvmField val ELECTRONIC_ORDER = Cardholder(JsonField.of("ELECTRONIC_ORDER"))

                    @JvmField val INSTALLMENT = Cardholder(JsonField.of("INSTALLMENT"))

                    @JvmField val MAIL_ORDER = Cardholder(JsonField.of("MAIL_ORDER"))

                    @JvmField val NOT_PRESENT = Cardholder(JsonField.of("NOT_PRESENT"))

                    @JvmField val PREAUTHORIZED = Cardholder(JsonField.of("PREAUTHORIZED"))

                    @JvmField val PRESENT = Cardholder(JsonField.of("PRESENT"))

                    @JvmField val REOCCURRING = Cardholder(JsonField.of("REOCCURRING"))

                    @JvmField val TELEPHONE_ORDER = Cardholder(JsonField.of("TELEPHONE_ORDER"))

                    @JvmField val UNKNOWN = Cardholder(JsonField.of("UNKNOWN"))

                    @JvmStatic fun of(value: String) = Cardholder(JsonField.of(value))
                }

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
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            class Pan
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Pan && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val AUTO_ENTRY = Pan(JsonField.of("AUTO_ENTRY"))

                    @JvmField val BAR_CODE = Pan(JsonField.of("BAR_CODE"))

                    @JvmField val CONTACTLESS = Pan(JsonField.of("CONTACTLESS"))

                    @JvmField val CREDENTIAL_ON_FILE = Pan(JsonField.of("CREDENTIAL_ON_FILE"))

                    @JvmField val ECOMMERCE = Pan(JsonField.of("ECOMMERCE"))

                    @JvmField val ERROR_KEYED = Pan(JsonField.of("ERROR_KEYED"))

                    @JvmField val ERROR_MAGNETIC_STRIPE = Pan(JsonField.of("ERROR_MAGNETIC_STRIPE"))

                    @JvmField val ICC = Pan(JsonField.of("ICC"))

                    @JvmField val KEY_ENTERED = Pan(JsonField.of("KEY_ENTERED"))

                    @JvmField val MAGNETIC_STRIPE = Pan(JsonField.of("MAGNETIC_STRIPE"))

                    @JvmField val MANUAL = Pan(JsonField.of("MANUAL"))

                    @JvmField val OCR = Pan(JsonField.of("OCR"))

                    @JvmField val SECURE_CARDLESS = Pan(JsonField.of("SECURE_CARDLESS"))

                    @JvmField val UNKNOWN = Pan(JsonField.of("UNKNOWN"))

                    @JvmField val UNSPECIFIED = Pan(JsonField.of("UNSPECIFIED"))

                    @JvmStatic fun of(value: String) = Pan(JsonField.of(value))
                }

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
                    _UNKNOWN,
                }

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

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EntryMode && this.card == other.card && this.cardholder == other.cardholder && this.pan == other.pan && this.pinEntered == other.pinEntered && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(card, cardholder, pan, pinEntered, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "EntryMode{card=$card, cardholder=$cardholder, pan=$pan, pinEntered=$pinEntered, additionalProperties=$additionalProperties}"
        }

        @JsonDeserialize(builder = Terminal.Builder::class)
        @NoAutoDetect
        class Terminal
        private constructor(
            private val attended: JsonField<Boolean>,
            private val cardRetentionCapable: JsonField<Boolean>,
            private val onPremise: JsonField<Boolean>,
            private val operator: JsonField<Operator>,
            private val pinCapability: JsonField<PinCapability>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** True if a clerk is present at the sale. */
            fun attended(): Boolean = attended.getRequired("attended")

            /**
             * True if the terminal is capable of partial approval. Partial approval is when part of
             * a transaction is approved and another payment must be used for the remainder. Example
             * scenario: A $40 transaction is attempted on a prepaid card with a $25 balance. If
             * partial approval is enabled, $25 can be authorized, at which point the POS will
             * prompt the user for an additional payment of $15.
             */
            fun cardRetentionCapable(): Boolean =
                cardRetentionCapable.getRequired("card_retention_capable")

            /** True if the sale was made at the place of business (vs. mobile). */
            fun onPremise(): Boolean = onPremise.getRequired("on_premise")

            /** The person that is designed to swipe the card */
            fun operator(): Operator = operator.getRequired("operator")

            /** Status of whether the POS is able to accept PINs */
            fun pinCapability(): PinCapability = pinCapability.getRequired("pin_capability")

            /** POS Type */
            fun type(): Type = type.getRequired("type")

            /** True if a clerk is present at the sale. */
            @JsonProperty("attended") @ExcludeMissing fun _attended() = attended

            /**
             * True if the terminal is capable of partial approval. Partial approval is when part of
             * a transaction is approved and another payment must be used for the remainder. Example
             * scenario: A $40 transaction is attempted on a prepaid card with a $25 balance. If
             * partial approval is enabled, $25 can be authorized, at which point the POS will
             * prompt the user for an additional payment of $15.
             */
            @JsonProperty("card_retention_capable")
            @ExcludeMissing
            fun _cardRetentionCapable() = cardRetentionCapable

            /** True if the sale was made at the place of business (vs. mobile). */
            @JsonProperty("on_premise") @ExcludeMissing fun _onPremise() = onPremise

            /** The person that is designed to swipe the card */
            @JsonProperty("operator") @ExcludeMissing fun _operator() = operator

            /** Status of whether the POS is able to accept PINs */
            @JsonProperty("pin_capability") @ExcludeMissing fun _pinCapability() = pinCapability

            /** POS Type */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Terminal = apply {
                if (!validated) {
                    attended()
                    cardRetentionCapable()
                    onPremise()
                    operator()
                    pinCapability()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var attended: JsonField<Boolean> = JsonMissing.of()
                private var cardRetentionCapable: JsonField<Boolean> = JsonMissing.of()
                private var onPremise: JsonField<Boolean> = JsonMissing.of()
                private var operator: JsonField<Operator> = JsonMissing.of()
                private var pinCapability: JsonField<PinCapability> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(terminal: Terminal) = apply {
                    this.attended = terminal.attended
                    this.cardRetentionCapable = terminal.cardRetentionCapable
                    this.onPremise = terminal.onPremise
                    this.operator = terminal.operator
                    this.pinCapability = terminal.pinCapability
                    this.type = terminal.type
                    additionalProperties(terminal.additionalProperties)
                }

                /** True if a clerk is present at the sale. */
                fun attended(attended: Boolean) = attended(JsonField.of(attended))

                /** True if a clerk is present at the sale. */
                @JsonProperty("attended")
                @ExcludeMissing
                fun attended(attended: JsonField<Boolean>) = apply { this.attended = attended }

                /**
                 * True if the terminal is capable of partial approval. Partial approval is when
                 * part of a transaction is approved and another payment must be used for the
                 * remainder. Example scenario: A $40 transaction is attempted on a prepaid card
                 * with a $25 balance. If partial approval is enabled, $25 can be authorized, at
                 * which point the POS will prompt the user for an additional payment of $15.
                 */
                fun cardRetentionCapable(cardRetentionCapable: Boolean) =
                    cardRetentionCapable(JsonField.of(cardRetentionCapable))

                /**
                 * True if the terminal is capable of partial approval. Partial approval is when
                 * part of a transaction is approved and another payment must be used for the
                 * remainder. Example scenario: A $40 transaction is attempted on a prepaid card
                 * with a $25 balance. If partial approval is enabled, $25 can be authorized, at
                 * which point the POS will prompt the user for an additional payment of $15.
                 */
                @JsonProperty("card_retention_capable")
                @ExcludeMissing
                fun cardRetentionCapable(cardRetentionCapable: JsonField<Boolean>) = apply {
                    this.cardRetentionCapable = cardRetentionCapable
                }

                /** True if the sale was made at the place of business (vs. mobile). */
                fun onPremise(onPremise: Boolean) = onPremise(JsonField.of(onPremise))

                /** True if the sale was made at the place of business (vs. mobile). */
                @JsonProperty("on_premise")
                @ExcludeMissing
                fun onPremise(onPremise: JsonField<Boolean>) = apply { this.onPremise = onPremise }

                /** The person that is designed to swipe the card */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /** The person that is designed to swipe the card */
                @JsonProperty("operator")
                @ExcludeMissing
                fun operator(operator: JsonField<Operator>) = apply { this.operator = operator }

                /** Status of whether the POS is able to accept PINs */
                fun pinCapability(pinCapability: PinCapability) =
                    pinCapability(JsonField.of(pinCapability))

                /** Status of whether the POS is able to accept PINs */
                @JsonProperty("pin_capability")
                @ExcludeMissing
                fun pinCapability(pinCapability: JsonField<PinCapability>) = apply {
                    this.pinCapability = pinCapability
                }

                /** POS Type */
                fun type(type: Type) = type(JsonField.of(type))

                /** POS Type */
                @JsonProperty("type")
                @ExcludeMissing
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): Terminal =
                    Terminal(
                        attended,
                        cardRetentionCapable,
                        onPremise,
                        operator,
                        pinCapability,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Operator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Operator && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ADMINISTRATIVE = Operator(JsonField.of("ADMINISTRATIVE"))

                    @JvmField val CARDHOLDER = Operator(JsonField.of("CARDHOLDER"))

                    @JvmField val CARD_ACCEPTOR = Operator(JsonField.of("CARD_ACCEPTOR"))

                    @JvmField val UNKNOWN = Operator(JsonField.of("UNKNOWN"))

                    @JvmStatic fun of(value: String) = Operator(JsonField.of(value))
                }

                enum class Known {
                    ADMINISTRATIVE,
                    CARDHOLDER,
                    CARD_ACCEPTOR,
                    UNKNOWN,
                }

                enum class Value {
                    ADMINISTRATIVE,
                    CARDHOLDER,
                    CARD_ACCEPTOR,
                    UNKNOWN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ADMINISTRATIVE -> Value.ADMINISTRATIVE
                        CARDHOLDER -> Value.CARDHOLDER
                        CARD_ACCEPTOR -> Value.CARD_ACCEPTOR
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ADMINISTRATIVE -> Known.ADMINISTRATIVE
                        CARDHOLDER -> Known.CARDHOLDER
                        CARD_ACCEPTOR -> Known.CARD_ACCEPTOR
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Operator: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class PinCapability
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PinCapability && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val CAPABLE = PinCapability(JsonField.of("CAPABLE"))

                    @JvmField val INOPERATIVE = PinCapability(JsonField.of("INOPERATIVE"))

                    @JvmField val NOT_CAPABLE = PinCapability(JsonField.of("NOT_CAPABLE"))

                    @JvmField val UNSPECIFIED = PinCapability(JsonField.of("UNSPECIFIED"))

                    @JvmStatic fun of(value: String) = PinCapability(JsonField.of(value))
                }

                enum class Known {
                    CAPABLE,
                    INOPERATIVE,
                    NOT_CAPABLE,
                    UNSPECIFIED,
                }

                enum class Value {
                    CAPABLE,
                    INOPERATIVE,
                    NOT_CAPABLE,
                    UNSPECIFIED,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CAPABLE -> Value.CAPABLE
                        INOPERATIVE -> Value.INOPERATIVE
                        NOT_CAPABLE -> Value.NOT_CAPABLE
                        UNSPECIFIED -> Value.UNSPECIFIED
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CAPABLE -> Known.CAPABLE
                        INOPERATIVE -> Known.INOPERATIVE
                        NOT_CAPABLE -> Known.NOT_CAPABLE
                        UNSPECIFIED -> Known.UNSPECIFIED
                        else -> throw LithicInvalidDataException("Unknown PinCapability: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    @JvmField val ADMINISTRATIVE = Type(JsonField.of("ADMINISTRATIVE"))

                    @JvmField val ATM = Type(JsonField.of("ATM"))

                    @JvmField val AUTHORIZATION = Type(JsonField.of("AUTHORIZATION"))

                    @JvmField val COUPON_MACHINE = Type(JsonField.of("COUPON_MACHINE"))

                    @JvmField val DIAL_TERMINAL = Type(JsonField.of("DIAL_TERMINAL"))

                    @JvmField val ECOMMERCE = Type(JsonField.of("ECOMMERCE"))

                    @JvmField val ECR = Type(JsonField.of("ECR"))

                    @JvmField val FUEL_MACHINE = Type(JsonField.of("FUEL_MACHINE"))

                    @JvmField val HOME_TERMINAL = Type(JsonField.of("HOME_TERMINAL"))

                    @JvmField val MICR = Type(JsonField.of("MICR"))

                    @JvmField val OFF_PREMISE = Type(JsonField.of("OFF_PREMISE"))

                    @JvmField val PAYMENT = Type(JsonField.of("PAYMENT"))

                    @JvmField val PDA = Type(JsonField.of("PDA"))

                    @JvmField val PHONE = Type(JsonField.of("PHONE"))

                    @JvmField val POINT = Type(JsonField.of("POINT"))

                    @JvmField val POS_TERMINAL = Type(JsonField.of("POS_TERMINAL"))

                    @JvmField val PUBLIC_UTILITY = Type(JsonField.of("PUBLIC_UTILITY"))

                    @JvmField val SELF_SERVICE = Type(JsonField.of("SELF_SERVICE"))

                    @JvmField val TELEVISION = Type(JsonField.of("TELEVISION"))

                    @JvmField val TELLER = Type(JsonField.of("TELLER"))

                    @JvmField
                    val TRAVELERS_CHECK_MACHINE = Type(JsonField.of("TRAVELERS_CHECK_MACHINE"))

                    @JvmField val UNKNOWN = Type(JsonField.of("UNKNOWN"))

                    @JvmField val VENDING = Type(JsonField.of("VENDING"))

                    @JvmField val VOICE = Type(JsonField.of("VOICE"))

                    @JvmStatic fun of(value: String) = Type(JsonField.of(value))
                }

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
                    UNKNOWN,
                    VENDING,
                    VOICE,
                }

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
                    UNKNOWN,
                    VENDING,
                    VOICE,
                    _UNKNOWN,
                }

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
                        UNKNOWN -> Value.UNKNOWN
                        VENDING -> Value.VENDING
                        VOICE -> Value.VOICE
                        else -> Value._UNKNOWN
                    }

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
                        UNKNOWN -> Known.UNKNOWN
                        VENDING -> Known.VENDING
                        VOICE -> Known.VOICE
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Terminal && this.attended == other.attended && this.cardRetentionCapable == other.cardRetentionCapable && this.onPremise == other.onPremise && this.operator == other.operator && this.pinCapability == other.pinCapability && this.type == other.type && this.additionalProperties == other.additionalProperties /* spotless:on */
            }

            private var hashCode: Int = 0

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = /* spotless:off */ Objects.hash(attended, cardRetentionCapable, onPremise, operator, pinCapability, type, additionalProperties) /* spotless:on */
                }
                return hashCode
            }

            override fun toString() =
                "Terminal{attended=$attended, cardRetentionCapable=$cardRetentionCapable, onPremise=$onPremise, operator=$operator, pinCapability=$pinCapability, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Pos && this.entryMode == other.entryMode && this.terminal == other.terminal && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(entryMode, terminal, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "Pos{entryMode=$entryMode, terminal=$terminal, additionalProperties=$additionalProperties}"
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Result && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

            @JvmField val BANK_CONNECTION_ERROR = Result(JsonField.of("BANK_CONNECTION_ERROR"))

            @JvmField val BANK_NOT_VERIFIED = Result(JsonField.of("BANK_NOT_VERIFIED"))

            @JvmField val CARD_CLOSED = Result(JsonField.of("CARD_CLOSED"))

            @JvmField val CARD_PAUSED = Result(JsonField.of("CARD_PAUSED"))

            @JvmField val DECLINED = Result(JsonField.of("DECLINED"))

            @JvmField val FRAUD_ADVICE = Result(JsonField.of("FRAUD_ADVICE"))

            @JvmField val INACTIVE_ACCOUNT = Result(JsonField.of("INACTIVE_ACCOUNT"))

            @JvmField val INCORRECT_PIN = Result(JsonField.of("INCORRECT_PIN"))

            @JvmField val INSUFFICIENT_FUNDS = Result(JsonField.of("INSUFFICIENT_FUNDS"))

            @JvmField val INVALID_CARD_DETAILS = Result(JsonField.of("INVALID_CARD_DETAILS"))

            @JvmField val MERCHANT_BLACKLIST = Result(JsonField.of("MERCHANT_BLACKLIST"))

            @JvmField val SINGLE_USE_RECHARGED = Result(JsonField.of("SINGLE_USE_RECHARGED"))

            @JvmField
            val SWITCH_INOPERATIVE_ADVICE = Result(JsonField.of("SWITCH_INOPERATIVE_ADVICE"))

            @JvmField val UNAUTHORIZED_MERCHANT = Result(JsonField.of("UNAUTHORIZED_MERCHANT"))

            @JvmField val UNKNOWN_HOST_TIMEOUT = Result(JsonField.of("UNKNOWN_HOST_TIMEOUT"))

            @JvmField val USER_TRANSACTION_LIMIT = Result(JsonField.of("USER_TRANSACTION_LIMIT"))

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            BANK_CONNECTION_ERROR,
            BANK_NOT_VERIFIED,
            CARD_CLOSED,
            CARD_PAUSED,
            DECLINED,
            FRAUD_ADVICE,
            INACTIVE_ACCOUNT,
            INCORRECT_PIN,
            INSUFFICIENT_FUNDS,
            INVALID_CARD_DETAILS,
            MERCHANT_BLACKLIST,
            SINGLE_USE_RECHARGED,
            SWITCH_INOPERATIVE_ADVICE,
            UNAUTHORIZED_MERCHANT,
            UNKNOWN_HOST_TIMEOUT,
            USER_TRANSACTION_LIMIT,
        }

        enum class Value {
            APPROVED,
            BANK_CONNECTION_ERROR,
            BANK_NOT_VERIFIED,
            CARD_CLOSED,
            CARD_PAUSED,
            DECLINED,
            FRAUD_ADVICE,
            INACTIVE_ACCOUNT,
            INCORRECT_PIN,
            INSUFFICIENT_FUNDS,
            INVALID_CARD_DETAILS,
            MERCHANT_BLACKLIST,
            SINGLE_USE_RECHARGED,
            SWITCH_INOPERATIVE_ADVICE,
            UNAUTHORIZED_MERCHANT,
            UNKNOWN_HOST_TIMEOUT,
            USER_TRANSACTION_LIMIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                BANK_CONNECTION_ERROR -> Value.BANK_CONNECTION_ERROR
                BANK_NOT_VERIFIED -> Value.BANK_NOT_VERIFIED
                CARD_CLOSED -> Value.CARD_CLOSED
                CARD_PAUSED -> Value.CARD_PAUSED
                DECLINED -> Value.DECLINED
                FRAUD_ADVICE -> Value.FRAUD_ADVICE
                INACTIVE_ACCOUNT -> Value.INACTIVE_ACCOUNT
                INCORRECT_PIN -> Value.INCORRECT_PIN
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                INVALID_CARD_DETAILS -> Value.INVALID_CARD_DETAILS
                MERCHANT_BLACKLIST -> Value.MERCHANT_BLACKLIST
                SINGLE_USE_RECHARGED -> Value.SINGLE_USE_RECHARGED
                SWITCH_INOPERATIVE_ADVICE -> Value.SWITCH_INOPERATIVE_ADVICE
                UNAUTHORIZED_MERCHANT -> Value.UNAUTHORIZED_MERCHANT
                UNKNOWN_HOST_TIMEOUT -> Value.UNKNOWN_HOST_TIMEOUT
                USER_TRANSACTION_LIMIT -> Value.USER_TRANSACTION_LIMIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                BANK_CONNECTION_ERROR -> Known.BANK_CONNECTION_ERROR
                BANK_NOT_VERIFIED -> Known.BANK_NOT_VERIFIED
                CARD_CLOSED -> Known.CARD_CLOSED
                CARD_PAUSED -> Known.CARD_PAUSED
                DECLINED -> Known.DECLINED
                FRAUD_ADVICE -> Known.FRAUD_ADVICE
                INACTIVE_ACCOUNT -> Known.INACTIVE_ACCOUNT
                INCORRECT_PIN -> Known.INCORRECT_PIN
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                INVALID_CARD_DETAILS -> Known.INVALID_CARD_DETAILS
                MERCHANT_BLACKLIST -> Known.MERCHANT_BLACKLIST
                SINGLE_USE_RECHARGED -> Known.SINGLE_USE_RECHARGED
                SWITCH_INOPERATIVE_ADVICE -> Known.SWITCH_INOPERATIVE_ADVICE
                UNAUTHORIZED_MERCHANT -> Known.UNAUTHORIZED_MERCHANT
                UNKNOWN_HOST_TIMEOUT -> Known.UNKNOWN_HOST_TIMEOUT
                USER_TRANSACTION_LIMIT -> Known.USER_TRANSACTION_LIMIT
                else -> throw LithicInvalidDataException("Unknown Result: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DECLINED = Status(JsonField.of("DECLINED"))

            @JvmField val EXPIRED = Status(JsonField.of("EXPIRED"))

            @JvmField val PENDING = Status(JsonField.of("PENDING"))

            @JvmField val SETTLED = Status(JsonField.of("SETTLED"))

            @JvmField val VOIDED = Status(JsonField.of("VOIDED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
        }

        enum class Value {
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                SETTLED -> Value.SETTLED
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                SETTLED -> Known.SETTLED
                VOIDED -> Known.VOIDED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = TokenInfo.Builder::class)
    @NoAutoDetect
    class TokenInfo
    private constructor(
        private val walletType: JsonField<WalletType>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Source of the token */
        fun walletType(): Optional<WalletType> =
            Optional.ofNullable(walletType.getNullable("wallet_type"))

        /** Source of the token */
        @JsonProperty("wallet_type") @ExcludeMissing fun _walletType() = walletType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TokenInfo = apply {
            if (!validated) {
                walletType()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var walletType: JsonField<WalletType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(tokenInfo: TokenInfo) = apply {
                this.walletType = tokenInfo.walletType
                additionalProperties(tokenInfo.additionalProperties)
            }

            /** Source of the token */
            fun walletType(walletType: WalletType) = walletType(JsonField.of(walletType))

            /** Source of the token */
            @JsonProperty("wallet_type")
            @ExcludeMissing
            fun walletType(walletType: JsonField<WalletType>) = apply {
                this.walletType = walletType
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): TokenInfo = TokenInfo(walletType, additionalProperties.toUnmodifiable())
        }

        class WalletType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WalletType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPLE_PAY = WalletType(JsonField.of("APPLE_PAY"))

                @JvmField val GOOGLE_PAY = WalletType(JsonField.of("GOOGLE_PAY"))

                @JvmField val MASTERPASS = WalletType(JsonField.of("MASTERPASS"))

                @JvmField val MERCHANT = WalletType(JsonField.of("MERCHANT"))

                @JvmField val OTHER = WalletType(JsonField.of("OTHER"))

                @JvmField val SAMSUNG_PAY = WalletType(JsonField.of("SAMSUNG_PAY"))

                @JvmStatic fun of(value: String) = WalletType(JsonField.of(value))
            }

            enum class Known {
                APPLE_PAY,
                GOOGLE_PAY,
                MASTERPASS,
                MERCHANT,
                OTHER,
                SAMSUNG_PAY,
            }

            enum class Value {
                APPLE_PAY,
                GOOGLE_PAY,
                MASTERPASS,
                MERCHANT,
                OTHER,
                SAMSUNG_PAY,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    MASTERPASS -> Value.MASTERPASS
                    MERCHANT -> Value.MERCHANT
                    OTHER -> Value.OTHER
                    SAMSUNG_PAY -> Value.SAMSUNG_PAY
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPLE_PAY -> Known.APPLE_PAY
                    GOOGLE_PAY -> Known.GOOGLE_PAY
                    MASTERPASS -> Known.MASTERPASS
                    MERCHANT -> Known.MERCHANT
                    OTHER -> Known.OTHER
                    SAMSUNG_PAY -> Known.SAMSUNG_PAY
                    else -> throw LithicInvalidDataException("Unknown WalletType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenInfo && this.walletType == other.walletType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(walletType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TokenInfo{walletType=$walletType, additionalProperties=$additionalProperties}"
    }

    @JsonDeserialize(builder = CardholderAuthentication.Builder::class)
    @NoAutoDetect
    class CardholderAuthentication
    private constructor(
        private val _3dsVersion: JsonField<String>,
        private val acquirerExemption: JsonField<AcquirerExemption>,
        private val authenticationResult: JsonField<AuthenticationResult>,
        private val decisionMadeBy: JsonField<DecisionMadeBy>,
        private val liabilityShift: JsonField<LiabilityShift>,
        private val threeDSAuthenticationToken: JsonField<String>,
        private val verificationAttempted: JsonField<VerificationAttempted>,
        private val verificationResult: JsonField<VerificationResult>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * 3-D Secure Protocol version. Possible enum values:
         * - `1`: 3-D Secure Protocol version 1.x applied to the transaction.
         * - `2`: 3-D Secure Protocol version 2.x applied to the transaction.
         * - `null`: 3-D Secure was not used for the transaction
         */
        fun _3dsVersion(): Optional<String> =
            Optional.ofNullable(_3dsVersion.getNullable("3ds_version"))

        /**
         * Exemption applied by the ACS to authenticate the transaction without requesting a
         * challenge. Possible enum values:
         * - `AUTHENTICATION_OUTAGE_EXCEPTION`: Authentication Outage Exception exemption.
         * - `LOW_VALUE`: Low Value Payment exemption.
         * - `MERCHANT_INITIATED_TRANSACTION`: Merchant Initiated Transaction (3RI).
         * - `NONE`: No exemption applied.
         * - `RECURRING_PAYMENT`: Recurring Payment exemption.
         * - `SECURE_CORPORATE_PAYMENT`: Secure Corporate Payment exemption.
         * - `STRONG_CUSTOMER_AUTHENTICATION_DELEGATION`: Strong Customer Authentication Delegation
         *   exemption.
         * - `TRANSACTION_RISK_ANALYSIS`: Acquirer Low-Fraud and Transaction Risk Analysis
         *   exemption.
         *
         * Maps to the 3-D Secure `transChallengeExemption` field.
         */
        fun acquirerExemption(): AcquirerExemption =
            acquirerExemption.getRequired("acquirer_exemption")

        /**
         * Outcome of the 3DS authentication process. Possible enum values:
         * - `SUCCESS`: 3DS authentication was successful and the transaction is considered
         *   authenticated.
         * - `DECLINE`: 3DS authentication was attempted but was unsuccessful — i.e., the issuer
         *   declined to authenticate the cardholder; note that Lithic populates this value on a
         *   best-effort basis based on common data across the 3DS authentication and ASA data
         *   elements.
         * - `ATTEMPTS`: 3DS authentication was attempted but full authentication did not occur. A
         *   proof of attempted authenticated is provided by the merchant.
         * - `NONE`: 3DS authentication was not performed on the transaction.
         */
        fun authenticationResult(): AuthenticationResult =
            authenticationResult.getRequired("authentication_result")

        /**
         * Indicator for which party made the 3DS authentication decision. Possible enum values:
         * - `NETWORK`: A networks tand-in service decided on the outcome; for token authentications
         *   (as indicated in the `liability_shift` attribute), this is the default value
         * - `LITHIC_DEFAULT`: A default decision was made by Lithic, without running a rules-based
         *   authentication; this value will be set on card programs that do not participate in one
         *   of our two 3DS product tiers
         * - `LITHIC_RULES`: A rules-based authentication was conducted by Lithic and Lithic decided
         *   on the outcome
         * - `CUSTOMER_ENDPOINT`: Lithic customer decided on the outcome based on a real-time
         *   request sent to a configured endpoint
         * - `UNKNOWN`: Data on which party decided is unavailable
         */
        fun decisionMadeBy(): DecisionMadeBy = decisionMadeBy.getRequired("decision_made_by")

        /**
         * Indicates whether chargeback liability shift applies to the transaction. Possible enum
         * values:
         * - `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow,
         *   chargeback liability shift applies.
         * - `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer
         *   Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the
         *   acquirer and in this case the `acquirer_exemption` field is expected to be not `NONE`.
         * - `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is
         *   liable.
         * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
         *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
         */
        fun liabilityShift(): LiabilityShift = liabilityShift.getRequired("liability_shift")

        /**
         * Unique identifier you can use to match a given 3DS authentication and the transaction.
         * Note that in cases where liability shift does not occur, this token is matched to the
         * transaction on a best-effort basis.
         */
        fun threeDSAuthenticationToken(): String =
            threeDSAuthenticationToken.getRequired("three_ds_authentication_token")

        /**
         * Verification attempted values:
         * - `APP_LOGIN`: Out-of-band login verification was attempted by the ACS.
         * - `BIOMETRIC`: Out-of-band biometric verification was attempted by the ACS.
         * - `NONE`: No cardholder verification was attempted by the Access Control Server (e.g.
         *   frictionless 3-D Secure flow, no 3-D Secure, or stand-in Risk Based Analysis).
         * - `OTHER`: Other method was used by the ACS to verify the cardholder (e.g. Mastercard
         *   Identity Check Express, recurring transactions, etc.)
         * - `OTP`: One-time password verification was attempted by the ACS.
         */
        fun verificationAttempted(): VerificationAttempted =
            verificationAttempted.getRequired("verification_attempted")

        /**
         * This field partially maps to the `transStatus` field in the
         * [EMVCo 3-D Secure specification](https://www.emvco.com/emv-technologies/3d-secure/) and
         * Mastercard SPA2 AAV leading indicators.
         *
         * Verification result values:
         * - `CANCELLED`: Authentication/Account verification could not be performed, `transStatus =
         *   U`.
         * - `FAILED`: Transaction was not authenticated. `transStatus = N`, note: the utilization
         *   of exemptions could also result in `transStatus = N`, inspect the `acquirer_exemption`
         *   field for more information.
         * - `FRICTIONLESS`: Attempts processing performed, the transaction was not authenticated,
         *   but a proof of attempted authentication/verification is provided. `transStatus = A` and
         *   the leading AAV indicator was one of {`kE`, `kF`, `kQ`}.
         * - `NOT_ATTEMPTED`: A 3-D Secure flow was not applied to this transaction. Leading AAV
         *   indicator was one of {`kN`, `kX`} or no AAV was provided for the transaction.
         * - `REJECTED`: Authentication/Account Verification rejected; `transStatus = R`. Issuer is
         *   rejecting authentication/verification and requests that authorization not be attempted.
         * - `SUCCESS`: Authentication verification successful. `transStatus = Y` and leading AAV
         *   indicator for the transaction was one of {`kA`, `kB`, `kC`, `kD`, `kO`, `kP`, `kR`,
         *   `kS`}.
         *
         * Note that the following `transStatus` values are not represented by this field:
         * - `C`: Challenge Required
         * - `D`: Challenge Required; decoupled authentication confirmed
         * - `I`: Informational only
         * - `S`: Challenge using Secure Payment Confirmation (SPC)
         */
        fun verificationResult(): VerificationResult =
            verificationResult.getRequired("verification_result")

        /**
         * 3-D Secure Protocol version. Possible enum values:
         * - `1`: 3-D Secure Protocol version 1.x applied to the transaction.
         * - `2`: 3-D Secure Protocol version 2.x applied to the transaction.
         * - `null`: 3-D Secure was not used for the transaction
         */
        @JsonProperty("3ds_version") @ExcludeMissing fun __3dsVersion() = _3dsVersion

        /**
         * Exemption applied by the ACS to authenticate the transaction without requesting a
         * challenge. Possible enum values:
         * - `AUTHENTICATION_OUTAGE_EXCEPTION`: Authentication Outage Exception exemption.
         * - `LOW_VALUE`: Low Value Payment exemption.
         * - `MERCHANT_INITIATED_TRANSACTION`: Merchant Initiated Transaction (3RI).
         * - `NONE`: No exemption applied.
         * - `RECURRING_PAYMENT`: Recurring Payment exemption.
         * - `SECURE_CORPORATE_PAYMENT`: Secure Corporate Payment exemption.
         * - `STRONG_CUSTOMER_AUTHENTICATION_DELEGATION`: Strong Customer Authentication Delegation
         *   exemption.
         * - `TRANSACTION_RISK_ANALYSIS`: Acquirer Low-Fraud and Transaction Risk Analysis
         *   exemption.
         *
         * Maps to the 3-D Secure `transChallengeExemption` field.
         */
        @JsonProperty("acquirer_exemption")
        @ExcludeMissing
        fun _acquirerExemption() = acquirerExemption

        /**
         * Outcome of the 3DS authentication process. Possible enum values:
         * - `SUCCESS`: 3DS authentication was successful and the transaction is considered
         *   authenticated.
         * - `DECLINE`: 3DS authentication was attempted but was unsuccessful — i.e., the issuer
         *   declined to authenticate the cardholder; note that Lithic populates this value on a
         *   best-effort basis based on common data across the 3DS authentication and ASA data
         *   elements.
         * - `ATTEMPTS`: 3DS authentication was attempted but full authentication did not occur. A
         *   proof of attempted authenticated is provided by the merchant.
         * - `NONE`: 3DS authentication was not performed on the transaction.
         */
        @JsonProperty("authentication_result")
        @ExcludeMissing
        fun _authenticationResult() = authenticationResult

        /**
         * Indicator for which party made the 3DS authentication decision. Possible enum values:
         * - `NETWORK`: A networks tand-in service decided on the outcome; for token authentications
         *   (as indicated in the `liability_shift` attribute), this is the default value
         * - `LITHIC_DEFAULT`: A default decision was made by Lithic, without running a rules-based
         *   authentication; this value will be set on card programs that do not participate in one
         *   of our two 3DS product tiers
         * - `LITHIC_RULES`: A rules-based authentication was conducted by Lithic and Lithic decided
         *   on the outcome
         * - `CUSTOMER_ENDPOINT`: Lithic customer decided on the outcome based on a real-time
         *   request sent to a configured endpoint
         * - `UNKNOWN`: Data on which party decided is unavailable
         */
        @JsonProperty("decision_made_by") @ExcludeMissing fun _decisionMadeBy() = decisionMadeBy

        /**
         * Indicates whether chargeback liability shift applies to the transaction. Possible enum
         * values:
         * - `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow,
         *   chargeback liability shift applies.
         * - `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer
         *   Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the
         *   acquirer and in this case the `acquirer_exemption` field is expected to be not `NONE`.
         * - `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is
         *   liable.
         * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
         *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
         */
        @JsonProperty("liability_shift") @ExcludeMissing fun _liabilityShift() = liabilityShift

        /**
         * Unique identifier you can use to match a given 3DS authentication and the transaction.
         * Note that in cases where liability shift does not occur, this token is matched to the
         * transaction on a best-effort basis.
         */
        @JsonProperty("three_ds_authentication_token")
        @ExcludeMissing
        fun _threeDSAuthenticationToken() = threeDSAuthenticationToken

        /**
         * Verification attempted values:
         * - `APP_LOGIN`: Out-of-band login verification was attempted by the ACS.
         * - `BIOMETRIC`: Out-of-band biometric verification was attempted by the ACS.
         * - `NONE`: No cardholder verification was attempted by the Access Control Server (e.g.
         *   frictionless 3-D Secure flow, no 3-D Secure, or stand-in Risk Based Analysis).
         * - `OTHER`: Other method was used by the ACS to verify the cardholder (e.g. Mastercard
         *   Identity Check Express, recurring transactions, etc.)
         * - `OTP`: One-time password verification was attempted by the ACS.
         */
        @JsonProperty("verification_attempted")
        @ExcludeMissing
        fun _verificationAttempted() = verificationAttempted

        /**
         * This field partially maps to the `transStatus` field in the
         * [EMVCo 3-D Secure specification](https://www.emvco.com/emv-technologies/3d-secure/) and
         * Mastercard SPA2 AAV leading indicators.
         *
         * Verification result values:
         * - `CANCELLED`: Authentication/Account verification could not be performed, `transStatus =
         *   U`.
         * - `FAILED`: Transaction was not authenticated. `transStatus = N`, note: the utilization
         *   of exemptions could also result in `transStatus = N`, inspect the `acquirer_exemption`
         *   field for more information.
         * - `FRICTIONLESS`: Attempts processing performed, the transaction was not authenticated,
         *   but a proof of attempted authentication/verification is provided. `transStatus = A` and
         *   the leading AAV indicator was one of {`kE`, `kF`, `kQ`}.
         * - `NOT_ATTEMPTED`: A 3-D Secure flow was not applied to this transaction. Leading AAV
         *   indicator was one of {`kN`, `kX`} or no AAV was provided for the transaction.
         * - `REJECTED`: Authentication/Account Verification rejected; `transStatus = R`. Issuer is
         *   rejecting authentication/verification and requests that authorization not be attempted.
         * - `SUCCESS`: Authentication verification successful. `transStatus = Y` and leading AAV
         *   indicator for the transaction was one of {`kA`, `kB`, `kC`, `kD`, `kO`, `kP`, `kR`,
         *   `kS`}.
         *
         * Note that the following `transStatus` values are not represented by this field:
         * - `C`: Challenge Required
         * - `D`: Challenge Required; decoupled authentication confirmed
         * - `I`: Informational only
         * - `S`: Challenge using Secure Payment Confirmation (SPC)
         */
        @JsonProperty("verification_result")
        @ExcludeMissing
        fun _verificationResult() = verificationResult

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): CardholderAuthentication = apply {
            if (!validated) {
                _3dsVersion()
                acquirerExemption()
                authenticationResult()
                decisionMadeBy()
                liabilityShift()
                threeDSAuthenticationToken()
                verificationAttempted()
                verificationResult()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var _3dsVersion: JsonField<String> = JsonMissing.of()
            private var acquirerExemption: JsonField<AcquirerExemption> = JsonMissing.of()
            private var authenticationResult: JsonField<AuthenticationResult> = JsonMissing.of()
            private var decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of()
            private var liabilityShift: JsonField<LiabilityShift> = JsonMissing.of()
            private var threeDSAuthenticationToken: JsonField<String> = JsonMissing.of()
            private var verificationAttempted: JsonField<VerificationAttempted> = JsonMissing.of()
            private var verificationResult: JsonField<VerificationResult> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholderAuthentication: CardholderAuthentication) = apply {
                this._3dsVersion = cardholderAuthentication._3dsVersion
                this.acquirerExemption = cardholderAuthentication.acquirerExemption
                this.authenticationResult = cardholderAuthentication.authenticationResult
                this.decisionMadeBy = cardholderAuthentication.decisionMadeBy
                this.liabilityShift = cardholderAuthentication.liabilityShift
                this.threeDSAuthenticationToken =
                    cardholderAuthentication.threeDSAuthenticationToken
                this.verificationAttempted = cardholderAuthentication.verificationAttempted
                this.verificationResult = cardholderAuthentication.verificationResult
                additionalProperties(cardholderAuthentication.additionalProperties)
            }

            /**
             * 3-D Secure Protocol version. Possible enum values:
             * - `1`: 3-D Secure Protocol version 1.x applied to the transaction.
             * - `2`: 3-D Secure Protocol version 2.x applied to the transaction.
             * - `null`: 3-D Secure was not used for the transaction
             */
            fun _3dsVersion(_3dsVersion: String) = _3dsVersion(JsonField.of(_3dsVersion))

            /**
             * 3-D Secure Protocol version. Possible enum values:
             * - `1`: 3-D Secure Protocol version 1.x applied to the transaction.
             * - `2`: 3-D Secure Protocol version 2.x applied to the transaction.
             * - `null`: 3-D Secure was not used for the transaction
             */
            @JsonProperty("3ds_version")
            @ExcludeMissing
            fun _3dsVersion(_3dsVersion: JsonField<String>) = apply {
                this._3dsVersion = _3dsVersion
            }

            /**
             * Exemption applied by the ACS to authenticate the transaction without requesting a
             * challenge. Possible enum values:
             * - `AUTHENTICATION_OUTAGE_EXCEPTION`: Authentication Outage Exception exemption.
             * - `LOW_VALUE`: Low Value Payment exemption.
             * - `MERCHANT_INITIATED_TRANSACTION`: Merchant Initiated Transaction (3RI).
             * - `NONE`: No exemption applied.
             * - `RECURRING_PAYMENT`: Recurring Payment exemption.
             * - `SECURE_CORPORATE_PAYMENT`: Secure Corporate Payment exemption.
             * - `STRONG_CUSTOMER_AUTHENTICATION_DELEGATION`: Strong Customer Authentication
             *   Delegation exemption.
             * - `TRANSACTION_RISK_ANALYSIS`: Acquirer Low-Fraud and Transaction Risk Analysis
             *   exemption.
             *
             * Maps to the 3-D Secure `transChallengeExemption` field.
             */
            fun acquirerExemption(acquirerExemption: AcquirerExemption) =
                acquirerExemption(JsonField.of(acquirerExemption))

            /**
             * Exemption applied by the ACS to authenticate the transaction without requesting a
             * challenge. Possible enum values:
             * - `AUTHENTICATION_OUTAGE_EXCEPTION`: Authentication Outage Exception exemption.
             * - `LOW_VALUE`: Low Value Payment exemption.
             * - `MERCHANT_INITIATED_TRANSACTION`: Merchant Initiated Transaction (3RI).
             * - `NONE`: No exemption applied.
             * - `RECURRING_PAYMENT`: Recurring Payment exemption.
             * - `SECURE_CORPORATE_PAYMENT`: Secure Corporate Payment exemption.
             * - `STRONG_CUSTOMER_AUTHENTICATION_DELEGATION`: Strong Customer Authentication
             *   Delegation exemption.
             * - `TRANSACTION_RISK_ANALYSIS`: Acquirer Low-Fraud and Transaction Risk Analysis
             *   exemption.
             *
             * Maps to the 3-D Secure `transChallengeExemption` field.
             */
            @JsonProperty("acquirer_exemption")
            @ExcludeMissing
            fun acquirerExemption(acquirerExemption: JsonField<AcquirerExemption>) = apply {
                this.acquirerExemption = acquirerExemption
            }

            /**
             * Outcome of the 3DS authentication process. Possible enum values:
             * - `SUCCESS`: 3DS authentication was successful and the transaction is considered
             *   authenticated.
             * - `DECLINE`: 3DS authentication was attempted but was unsuccessful — i.e., the issuer
             *   declined to authenticate the cardholder; note that Lithic populates this value on a
             *   best-effort basis based on common data across the 3DS authentication and ASA data
             *   elements.
             * - `ATTEMPTS`: 3DS authentication was attempted but full authentication did not occur.
             *   A proof of attempted authenticated is provided by the merchant.
             * - `NONE`: 3DS authentication was not performed on the transaction.
             */
            fun authenticationResult(authenticationResult: AuthenticationResult) =
                authenticationResult(JsonField.of(authenticationResult))

            /**
             * Outcome of the 3DS authentication process. Possible enum values:
             * - `SUCCESS`: 3DS authentication was successful and the transaction is considered
             *   authenticated.
             * - `DECLINE`: 3DS authentication was attempted but was unsuccessful — i.e., the issuer
             *   declined to authenticate the cardholder; note that Lithic populates this value on a
             *   best-effort basis based on common data across the 3DS authentication and ASA data
             *   elements.
             * - `ATTEMPTS`: 3DS authentication was attempted but full authentication did not occur.
             *   A proof of attempted authenticated is provided by the merchant.
             * - `NONE`: 3DS authentication was not performed on the transaction.
             */
            @JsonProperty("authentication_result")
            @ExcludeMissing
            fun authenticationResult(authenticationResult: JsonField<AuthenticationResult>) =
                apply {
                    this.authenticationResult = authenticationResult
                }

            /**
             * Indicator for which party made the 3DS authentication decision. Possible enum values:
             * - `NETWORK`: A networks tand-in service decided on the outcome; for token
             *   authentications (as indicated in the `liability_shift` attribute), this is the
             *   default value
             * - `LITHIC_DEFAULT`: A default decision was made by Lithic, without running a
             *   rules-based authentication; this value will be set on card programs that do not
             *   participate in one of our two 3DS product tiers
             * - `LITHIC_RULES`: A rules-based authentication was conducted by Lithic and Lithic
             *   decided on the outcome
             * - `CUSTOMER_ENDPOINT`: Lithic customer decided on the outcome based on a real-time
             *   request sent to a configured endpoint
             * - `UNKNOWN`: Data on which party decided is unavailable
             */
            fun decisionMadeBy(decisionMadeBy: DecisionMadeBy) =
                decisionMadeBy(JsonField.of(decisionMadeBy))

            /**
             * Indicator for which party made the 3DS authentication decision. Possible enum values:
             * - `NETWORK`: A networks tand-in service decided on the outcome; for token
             *   authentications (as indicated in the `liability_shift` attribute), this is the
             *   default value
             * - `LITHIC_DEFAULT`: A default decision was made by Lithic, without running a
             *   rules-based authentication; this value will be set on card programs that do not
             *   participate in one of our two 3DS product tiers
             * - `LITHIC_RULES`: A rules-based authentication was conducted by Lithic and Lithic
             *   decided on the outcome
             * - `CUSTOMER_ENDPOINT`: Lithic customer decided on the outcome based on a real-time
             *   request sent to a configured endpoint
             * - `UNKNOWN`: Data on which party decided is unavailable
             */
            @JsonProperty("decision_made_by")
            @ExcludeMissing
            fun decisionMadeBy(decisionMadeBy: JsonField<DecisionMadeBy>) = apply {
                this.decisionMadeBy = decisionMadeBy
            }

            /**
             * Indicates whether chargeback liability shift applies to the transaction. Possible
             * enum values:
             * - `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure
             *   flow, chargeback liability shift applies.
             * - `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer
             *   Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with
             *   the acquirer and in this case the `acquirer_exemption` field is expected to be not
             *   `NONE`.
             * - `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant
             *   is liable.
             * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
             *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
             */
            fun liabilityShift(liabilityShift: LiabilityShift) =
                liabilityShift(JsonField.of(liabilityShift))

            /**
             * Indicates whether chargeback liability shift applies to the transaction. Possible
             * enum values:
             * - `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure
             *   flow, chargeback liability shift applies.
             * - `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer
             *   Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with
             *   the acquirer and in this case the `acquirer_exemption` field is expected to be not
             *   `NONE`.
             * - `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant
             *   is liable.
             * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
             *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
             */
            @JsonProperty("liability_shift")
            @ExcludeMissing
            fun liabilityShift(liabilityShift: JsonField<LiabilityShift>) = apply {
                this.liabilityShift = liabilityShift
            }

            /**
             * Unique identifier you can use to match a given 3DS authentication and the
             * transaction. Note that in cases where liability shift does not occur, this token is
             * matched to the transaction on a best-effort basis.
             */
            fun threeDSAuthenticationToken(threeDSAuthenticationToken: String) =
                threeDSAuthenticationToken(JsonField.of(threeDSAuthenticationToken))

            /**
             * Unique identifier you can use to match a given 3DS authentication and the
             * transaction. Note that in cases where liability shift does not occur, this token is
             * matched to the transaction on a best-effort basis.
             */
            @JsonProperty("three_ds_authentication_token")
            @ExcludeMissing
            fun threeDSAuthenticationToken(threeDSAuthenticationToken: JsonField<String>) = apply {
                this.threeDSAuthenticationToken = threeDSAuthenticationToken
            }

            /**
             * Verification attempted values:
             * - `APP_LOGIN`: Out-of-band login verification was attempted by the ACS.
             * - `BIOMETRIC`: Out-of-band biometric verification was attempted by the ACS.
             * - `NONE`: No cardholder verification was attempted by the Access Control Server (e.g.
             *   frictionless 3-D Secure flow, no 3-D Secure, or stand-in Risk Based Analysis).
             * - `OTHER`: Other method was used by the ACS to verify the cardholder (e.g. Mastercard
             *   Identity Check Express, recurring transactions, etc.)
             * - `OTP`: One-time password verification was attempted by the ACS.
             */
            fun verificationAttempted(verificationAttempted: VerificationAttempted) =
                verificationAttempted(JsonField.of(verificationAttempted))

            /**
             * Verification attempted values:
             * - `APP_LOGIN`: Out-of-band login verification was attempted by the ACS.
             * - `BIOMETRIC`: Out-of-band biometric verification was attempted by the ACS.
             * - `NONE`: No cardholder verification was attempted by the Access Control Server (e.g.
             *   frictionless 3-D Secure flow, no 3-D Secure, or stand-in Risk Based Analysis).
             * - `OTHER`: Other method was used by the ACS to verify the cardholder (e.g. Mastercard
             *   Identity Check Express, recurring transactions, etc.)
             * - `OTP`: One-time password verification was attempted by the ACS.
             */
            @JsonProperty("verification_attempted")
            @ExcludeMissing
            fun verificationAttempted(verificationAttempted: JsonField<VerificationAttempted>) =
                apply {
                    this.verificationAttempted = verificationAttempted
                }

            /**
             * This field partially maps to the `transStatus` field in the
             * [EMVCo 3-D Secure specification](https://www.emvco.com/emv-technologies/3d-secure/)
             * and Mastercard SPA2 AAV leading indicators.
             *
             * Verification result values:
             * - `CANCELLED`: Authentication/Account verification could not be performed,
             *   `transStatus = U`.
             * - `FAILED`: Transaction was not authenticated. `transStatus = N`, note: the
             *   utilization of exemptions could also result in `transStatus = N`, inspect the
             *   `acquirer_exemption` field for more information.
             * - `FRICTIONLESS`: Attempts processing performed, the transaction was not
             *   authenticated, but a proof of attempted authentication/verification is provided.
             *   `transStatus = A` and the leading AAV indicator was one of {`kE`, `kF`, `kQ`}.
             * - `NOT_ATTEMPTED`: A 3-D Secure flow was not applied to this transaction. Leading AAV
             *   indicator was one of {`kN`, `kX`} or no AAV was provided for the transaction.
             * - `REJECTED`: Authentication/Account Verification rejected; `transStatus = R`. Issuer
             *   is rejecting authentication/verification and requests that authorization not be
             *   attempted.
             * - `SUCCESS`: Authentication verification successful. `transStatus = Y` and leading
             *   AAV indicator for the transaction was one of {`kA`, `kB`, `kC`, `kD`, `kO`, `kP`,
             *   `kR`, `kS`}.
             *
             * Note that the following `transStatus` values are not represented by this field:
             * - `C`: Challenge Required
             * - `D`: Challenge Required; decoupled authentication confirmed
             * - `I`: Informational only
             * - `S`: Challenge using Secure Payment Confirmation (SPC)
             */
            fun verificationResult(verificationResult: VerificationResult) =
                verificationResult(JsonField.of(verificationResult))

            /**
             * This field partially maps to the `transStatus` field in the
             * [EMVCo 3-D Secure specification](https://www.emvco.com/emv-technologies/3d-secure/)
             * and Mastercard SPA2 AAV leading indicators.
             *
             * Verification result values:
             * - `CANCELLED`: Authentication/Account verification could not be performed,
             *   `transStatus = U`.
             * - `FAILED`: Transaction was not authenticated. `transStatus = N`, note: the
             *   utilization of exemptions could also result in `transStatus = N`, inspect the
             *   `acquirer_exemption` field for more information.
             * - `FRICTIONLESS`: Attempts processing performed, the transaction was not
             *   authenticated, but a proof of attempted authentication/verification is provided.
             *   `transStatus = A` and the leading AAV indicator was one of {`kE`, `kF`, `kQ`}.
             * - `NOT_ATTEMPTED`: A 3-D Secure flow was not applied to this transaction. Leading AAV
             *   indicator was one of {`kN`, `kX`} or no AAV was provided for the transaction.
             * - `REJECTED`: Authentication/Account Verification rejected; `transStatus = R`. Issuer
             *   is rejecting authentication/verification and requests that authorization not be
             *   attempted.
             * - `SUCCESS`: Authentication verification successful. `transStatus = Y` and leading
             *   AAV indicator for the transaction was one of {`kA`, `kB`, `kC`, `kD`, `kO`, `kP`,
             *   `kR`, `kS`}.
             *
             * Note that the following `transStatus` values are not represented by this field:
             * - `C`: Challenge Required
             * - `D`: Challenge Required; decoupled authentication confirmed
             * - `I`: Informational only
             * - `S`: Challenge using Secure Payment Confirmation (SPC)
             */
            @JsonProperty("verification_result")
            @ExcludeMissing
            fun verificationResult(verificationResult: JsonField<VerificationResult>) = apply {
                this.verificationResult = verificationResult
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): CardholderAuthentication =
                CardholderAuthentication(
                    _3dsVersion,
                    acquirerExemption,
                    authenticationResult,
                    decisionMadeBy,
                    liabilityShift,
                    threeDSAuthenticationToken,
                    verificationAttempted,
                    verificationResult,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class AcquirerExemption
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AcquirerExemption && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val AUTHENTICATION_OUTAGE_EXCEPTION =
                    AcquirerExemption(JsonField.of("AUTHENTICATION_OUTAGE_EXCEPTION"))

                @JvmField val LOW_VALUE = AcquirerExemption(JsonField.of("LOW_VALUE"))

                @JvmField
                val MERCHANT_INITIATED_TRANSACTION =
                    AcquirerExemption(JsonField.of("MERCHANT_INITIATED_TRANSACTION"))

                @JvmField val NONE = AcquirerExemption(JsonField.of("NONE"))

                @JvmField
                val RECURRING_PAYMENT = AcquirerExemption(JsonField.of("RECURRING_PAYMENT"))

                @JvmField
                val SECURE_CORPORATE_PAYMENT =
                    AcquirerExemption(JsonField.of("SECURE_CORPORATE_PAYMENT"))

                @JvmField
                val STRONG_CUSTOMER_AUTHENTICATION_DELEGATION =
                    AcquirerExemption(JsonField.of("STRONG_CUSTOMER_AUTHENTICATION_DELEGATION"))

                @JvmField
                val TRANSACTION_RISK_ANALYSIS =
                    AcquirerExemption(JsonField.of("TRANSACTION_RISK_ANALYSIS"))

                @JvmStatic fun of(value: String) = AcquirerExemption(JsonField.of(value))
            }

            enum class Known {
                AUTHENTICATION_OUTAGE_EXCEPTION,
                LOW_VALUE,
                MERCHANT_INITIATED_TRANSACTION,
                NONE,
                RECURRING_PAYMENT,
                SECURE_CORPORATE_PAYMENT,
                STRONG_CUSTOMER_AUTHENTICATION_DELEGATION,
                TRANSACTION_RISK_ANALYSIS,
            }

            enum class Value {
                AUTHENTICATION_OUTAGE_EXCEPTION,
                LOW_VALUE,
                MERCHANT_INITIATED_TRANSACTION,
                NONE,
                RECURRING_PAYMENT,
                SECURE_CORPORATE_PAYMENT,
                STRONG_CUSTOMER_AUTHENTICATION_DELEGATION,
                TRANSACTION_RISK_ANALYSIS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    AUTHENTICATION_OUTAGE_EXCEPTION -> Value.AUTHENTICATION_OUTAGE_EXCEPTION
                    LOW_VALUE -> Value.LOW_VALUE
                    MERCHANT_INITIATED_TRANSACTION -> Value.MERCHANT_INITIATED_TRANSACTION
                    NONE -> Value.NONE
                    RECURRING_PAYMENT -> Value.RECURRING_PAYMENT
                    SECURE_CORPORATE_PAYMENT -> Value.SECURE_CORPORATE_PAYMENT
                    STRONG_CUSTOMER_AUTHENTICATION_DELEGATION ->
                        Value.STRONG_CUSTOMER_AUTHENTICATION_DELEGATION
                    TRANSACTION_RISK_ANALYSIS -> Value.TRANSACTION_RISK_ANALYSIS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    AUTHENTICATION_OUTAGE_EXCEPTION -> Known.AUTHENTICATION_OUTAGE_EXCEPTION
                    LOW_VALUE -> Known.LOW_VALUE
                    MERCHANT_INITIATED_TRANSACTION -> Known.MERCHANT_INITIATED_TRANSACTION
                    NONE -> Known.NONE
                    RECURRING_PAYMENT -> Known.RECURRING_PAYMENT
                    SECURE_CORPORATE_PAYMENT -> Known.SECURE_CORPORATE_PAYMENT
                    STRONG_CUSTOMER_AUTHENTICATION_DELEGATION ->
                        Known.STRONG_CUSTOMER_AUTHENTICATION_DELEGATION
                    TRANSACTION_RISK_ANALYSIS -> Known.TRANSACTION_RISK_ANALYSIS
                    else -> throw LithicInvalidDataException("Unknown AcquirerExemption: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class AuthenticationResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthenticationResult && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ATTEMPTS = AuthenticationResult(JsonField.of("ATTEMPTS"))

                @JvmField val DECLINE = AuthenticationResult(JsonField.of("DECLINE"))

                @JvmField val NONE = AuthenticationResult(JsonField.of("NONE"))

                @JvmField val SUCCESS = AuthenticationResult(JsonField.of("SUCCESS"))

                @JvmStatic fun of(value: String) = AuthenticationResult(JsonField.of(value))
            }

            enum class Known {
                ATTEMPTS,
                DECLINE,
                NONE,
                SUCCESS,
            }

            enum class Value {
                ATTEMPTS,
                DECLINE,
                NONE,
                SUCCESS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ATTEMPTS -> Value.ATTEMPTS
                    DECLINE -> Value.DECLINE
                    NONE -> Value.NONE
                    SUCCESS -> Value.SUCCESS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ATTEMPTS -> Known.ATTEMPTS
                    DECLINE -> Known.DECLINE
                    NONE -> Known.NONE
                    SUCCESS -> Known.SUCCESS
                    else -> throw LithicInvalidDataException("Unknown AuthenticationResult: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DecisionMadeBy
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DecisionMadeBy && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CUSTOMER_ENDPOINT = DecisionMadeBy(JsonField.of("CUSTOMER_ENDPOINT"))

                @JvmField val LITHIC_DEFAULT = DecisionMadeBy(JsonField.of("LITHIC_DEFAULT"))

                @JvmField val LITHIC_RULES = DecisionMadeBy(JsonField.of("LITHIC_RULES"))

                @JvmField val NETWORK = DecisionMadeBy(JsonField.of("NETWORK"))

                @JvmField val UNKNOWN = DecisionMadeBy(JsonField.of("UNKNOWN"))

                @JvmStatic fun of(value: String) = DecisionMadeBy(JsonField.of(value))
            }

            enum class Known {
                CUSTOMER_ENDPOINT,
                LITHIC_DEFAULT,
                LITHIC_RULES,
                NETWORK,
                UNKNOWN,
            }

            enum class Value {
                CUSTOMER_ENDPOINT,
                LITHIC_DEFAULT,
                LITHIC_RULES,
                NETWORK,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CUSTOMER_ENDPOINT -> Value.CUSTOMER_ENDPOINT
                    LITHIC_DEFAULT -> Value.LITHIC_DEFAULT
                    LITHIC_RULES -> Value.LITHIC_RULES
                    NETWORK -> Value.NETWORK
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CUSTOMER_ENDPOINT -> Known.CUSTOMER_ENDPOINT
                    LITHIC_DEFAULT -> Known.LITHIC_DEFAULT
                    LITHIC_RULES -> Known.LITHIC_RULES
                    NETWORK -> Known.NETWORK
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw LithicInvalidDataException("Unknown DecisionMadeBy: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class LiabilityShift
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LiabilityShift && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val _3DS_AUTHENTICATED = LiabilityShift(JsonField.of("3DS_AUTHENTICATED"))

                @JvmField
                val ACQUIRER_EXEMPTION = LiabilityShift(JsonField.of("ACQUIRER_EXEMPTION"))

                @JvmField val NONE = LiabilityShift(JsonField.of("NONE"))

                @JvmField
                val TOKEN_AUTHENTICATED = LiabilityShift(JsonField.of("TOKEN_AUTHENTICATED"))

                @JvmStatic fun of(value: String) = LiabilityShift(JsonField.of(value))
            }

            enum class Known {
                _3DS_AUTHENTICATED,
                ACQUIRER_EXEMPTION,
                NONE,
                TOKEN_AUTHENTICATED,
            }

            enum class Value {
                _3DS_AUTHENTICATED,
                ACQUIRER_EXEMPTION,
                NONE,
                TOKEN_AUTHENTICATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    _3DS_AUTHENTICATED -> Value._3DS_AUTHENTICATED
                    ACQUIRER_EXEMPTION -> Value.ACQUIRER_EXEMPTION
                    NONE -> Value.NONE
                    TOKEN_AUTHENTICATED -> Value.TOKEN_AUTHENTICATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    _3DS_AUTHENTICATED -> Known._3DS_AUTHENTICATED
                    ACQUIRER_EXEMPTION -> Known.ACQUIRER_EXEMPTION
                    NONE -> Known.NONE
                    TOKEN_AUTHENTICATED -> Known.TOKEN_AUTHENTICATED
                    else -> throw LithicInvalidDataException("Unknown LiabilityShift: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class VerificationAttempted
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VerificationAttempted && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APP_LOGIN = VerificationAttempted(JsonField.of("APP_LOGIN"))

                @JvmField val BIOMETRIC = VerificationAttempted(JsonField.of("BIOMETRIC"))

                @JvmField val NONE = VerificationAttempted(JsonField.of("NONE"))

                @JvmField val OTHER = VerificationAttempted(JsonField.of("OTHER"))

                @JvmField val OTP = VerificationAttempted(JsonField.of("OTP"))

                @JvmStatic fun of(value: String) = VerificationAttempted(JsonField.of(value))
            }

            enum class Known {
                APP_LOGIN,
                BIOMETRIC,
                NONE,
                OTHER,
                OTP,
            }

            enum class Value {
                APP_LOGIN,
                BIOMETRIC,
                NONE,
                OTHER,
                OTP,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APP_LOGIN -> Value.APP_LOGIN
                    BIOMETRIC -> Value.BIOMETRIC
                    NONE -> Value.NONE
                    OTHER -> Value.OTHER
                    OTP -> Value.OTP
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APP_LOGIN -> Known.APP_LOGIN
                    BIOMETRIC -> Known.BIOMETRIC
                    NONE -> Known.NONE
                    OTHER -> Known.OTHER
                    OTP -> Known.OTP
                    else ->
                        throw LithicInvalidDataException("Unknown VerificationAttempted: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class VerificationResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VerificationResult && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CANCELLED = VerificationResult(JsonField.of("CANCELLED"))

                @JvmField val FAILED = VerificationResult(JsonField.of("FAILED"))

                @JvmField val FRICTIONLESS = VerificationResult(JsonField.of("FRICTIONLESS"))

                @JvmField val NOT_ATTEMPTED = VerificationResult(JsonField.of("NOT_ATTEMPTED"))

                @JvmField val REJECTED = VerificationResult(JsonField.of("REJECTED"))

                @JvmField val SUCCESS = VerificationResult(JsonField.of("SUCCESS"))

                @JvmStatic fun of(value: String) = VerificationResult(JsonField.of(value))
            }

            enum class Known {
                CANCELLED,
                FAILED,
                FRICTIONLESS,
                NOT_ATTEMPTED,
                REJECTED,
                SUCCESS,
            }

            enum class Value {
                CANCELLED,
                FAILED,
                FRICTIONLESS,
                NOT_ATTEMPTED,
                REJECTED,
                SUCCESS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CANCELLED -> Value.CANCELLED
                    FAILED -> Value.FAILED
                    FRICTIONLESS -> Value.FRICTIONLESS
                    NOT_ATTEMPTED -> Value.NOT_ATTEMPTED
                    REJECTED -> Value.REJECTED
                    SUCCESS -> Value.SUCCESS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CANCELLED -> Known.CANCELLED
                    FAILED -> Known.FAILED
                    FRICTIONLESS -> Known.FRICTIONLESS
                    NOT_ATTEMPTED -> Known.NOT_ATTEMPTED
                    REJECTED -> Known.REJECTED
                    SUCCESS -> Known.SUCCESS
                    else -> throw LithicInvalidDataException("Unknown VerificationResult: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardholderAuthentication && this._3dsVersion == other._3dsVersion && this.acquirerExemption == other.acquirerExemption && this.authenticationResult == other.authenticationResult && this.decisionMadeBy == other.decisionMadeBy && this.liabilityShift == other.liabilityShift && this.threeDSAuthenticationToken == other.threeDSAuthenticationToken && this.verificationAttempted == other.verificationAttempted && this.verificationResult == other.verificationResult && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(_3dsVersion, acquirerExemption, authenticationResult, decisionMadeBy, liabilityShift, threeDSAuthenticationToken, verificationAttempted, verificationResult, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "CardholderAuthentication{_3dsVersion=$_3dsVersion, acquirerExemption=$acquirerExemption, authenticationResult=$authenticationResult, decisionMadeBy=$decisionMadeBy, liabilityShift=$liabilityShift, threeDSAuthenticationToken=$threeDSAuthenticationToken, verificationAttempted=$verificationAttempted, verificationResult=$verificationResult, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Transaction && this.acquirerFee == other.acquirerFee && this.acquirerReferenceNumber == other.acquirerReferenceNumber && this.amount == other.amount && this.amounts == other.amounts && this.authorizationAmount == other.authorizationAmount && this.authorizationCode == other.authorizationCode && this.avs == other.avs && this.cardToken == other.cardToken && this.cardholderAuthentication == other.cardholderAuthentication && this.created == other.created && this.events == other.events && this.merchant == other.merchant && this.merchantAmount == other.merchantAmount && this.merchantAuthorizationAmount == other.merchantAuthorizationAmount && this.merchantCurrency == other.merchantCurrency && this.network == other.network && this.networkRiskScore == other.networkRiskScore && this.pos == other.pos && this.result == other.result && this.settledAmount == other.settledAmount && this.status == other.status && this.token == other.token && this.tokenInfo == other.tokenInfo && this.updated == other.updated && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(acquirerFee, acquirerReferenceNumber, amount, amounts, authorizationAmount, authorizationCode, avs, cardToken, cardholderAuthentication, created, events, merchant, merchantAmount, merchantAuthorizationAmount, merchantCurrency, network, networkRiskScore, pos, result, settledAmount, status, token, tokenInfo, updated, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "Transaction{acquirerFee=$acquirerFee, acquirerReferenceNumber=$acquirerReferenceNumber, amount=$amount, amounts=$amounts, authorizationAmount=$authorizationAmount, authorizationCode=$authorizationCode, avs=$avs, cardToken=$cardToken, cardholderAuthentication=$cardholderAuthentication, created=$created, events=$events, merchant=$merchant, merchantAmount=$merchantAmount, merchantAuthorizationAmount=$merchantAuthorizationAmount, merchantCurrency=$merchantCurrency, network=$network, networkRiskScore=$networkRiskScore, pos=$pos, result=$result, settledAmount=$settledAmount, status=$status, token=$token, tokenInfo=$tokenInfo, updated=$updated, additionalProperties=$additionalProperties}"
}
