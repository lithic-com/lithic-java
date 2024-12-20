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
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@NoAutoDetect
class Transaction
@JsonCreator
private constructor(
    @JsonProperty("acquirer_fee")
    @ExcludeMissing
    private val acquirerFee: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("acquirer_reference_number")
    @ExcludeMissing
    private val acquirerReferenceNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("amounts")
    @ExcludeMissing
    private val amounts: JsonField<TransactionAmounts> = JsonMissing.of(),
    @JsonProperty("authorization_amount")
    @ExcludeMissing
    private val authorizationAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("authorization_code")
    @ExcludeMissing
    private val authorizationCode: JsonField<String> = JsonMissing.of(),
    @JsonProperty("avs") @ExcludeMissing private val avs: JsonField<Avs> = JsonMissing.of(),
    @JsonProperty("card_token")
    @ExcludeMissing
    private val cardToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("cardholder_authentication")
    @ExcludeMissing
    private val cardholderAuthentication: JsonField<CardholderAuthentication> = JsonMissing.of(),
    @JsonProperty("created")
    @ExcludeMissing
    private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<TransactionEvent>> = JsonMissing.of(),
    @JsonProperty("merchant")
    @ExcludeMissing
    private val merchant: JsonField<Merchant> = JsonMissing.of(),
    @JsonProperty("merchant_amount")
    @ExcludeMissing
    private val merchantAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("merchant_authorization_amount")
    @ExcludeMissing
    private val merchantAuthorizationAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("merchant_currency")
    @ExcludeMissing
    private val merchantCurrency: JsonField<String> = JsonMissing.of(),
    @JsonProperty("network")
    @ExcludeMissing
    private val network: JsonField<Network> = JsonMissing.of(),
    @JsonProperty("network_risk_score")
    @ExcludeMissing
    private val networkRiskScore: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<DeclineResult> = JsonMissing.of(),
    @JsonProperty("pos") @ExcludeMissing private val pos: JsonField<Pos> = JsonMissing.of(),
    @JsonProperty("settled_amount")
    @ExcludeMissing
    private val settledAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("token_info")
    @ExcludeMissing
    private val tokenInfo: JsonField<TokenInfo> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

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

    /** The token for the account associated with this transaction. */
    fun accountToken(): String = accountToken.getRequired("account_token")

    /**
     * When the transaction is pending, this represents the authorization amount of the transaction
     * in the anticipated settlement currency. Once the transaction has settled, this field
     * represents the settled amount in the settlement currency.
     */
    fun amount(): Long = amount.getRequired("amount")

    fun amounts(): TransactionAmounts = amounts.getRequired("amounts")

    /** The authorization amount of the transaction in the anticipated settlement currency. */
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

    fun events(): Optional<List<TransactionEvent>> =
        Optional.ofNullable(events.getNullable("events"))

    fun merchant(): Merchant = merchant.getRequired("merchant")

    /** Analogous to the 'amount', but in the merchant currency. */
    fun merchantAmount(): Optional<Long> =
        Optional.ofNullable(merchantAmount.getNullable("merchant_amount"))

    /** Analogous to the 'authorization_amount', but in the merchant currency. */
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
     */
    fun networkRiskScore(): Optional<Long> =
        Optional.ofNullable(networkRiskScore.getNullable("network_risk_score"))

    fun result(): DeclineResult = result.getRequired("result")

    fun pos(): Pos = pos.getRequired("pos")

    /** The settled amount of the transaction in the settlement currency. */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /** Status of the transaction. */
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

    /** The token for the account associated with this transaction. */
    @JsonProperty("account_token") @ExcludeMissing fun _accountToken() = accountToken

    /**
     * When the transaction is pending, this represents the authorization amount of the transaction
     * in the anticipated settlement currency. Once the transaction has settled, this field
     * represents the settled amount in the settlement currency.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    @JsonProperty("amounts") @ExcludeMissing fun _amounts() = amounts

    /** The authorization amount of the transaction in the anticipated settlement currency. */
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

    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonProperty("merchant") @ExcludeMissing fun _merchant() = merchant

    /** Analogous to the 'amount', but in the merchant currency. */
    @JsonProperty("merchant_amount") @ExcludeMissing fun _merchantAmount() = merchantAmount

    /** Analogous to the 'authorization_amount', but in the merchant currency. */
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
     */
    @JsonProperty("network_risk_score") @ExcludeMissing fun _networkRiskScore() = networkRiskScore

    @JsonProperty("result") @ExcludeMissing fun _result() = result

    @JsonProperty("pos") @ExcludeMissing fun _pos() = pos

    /** The settled amount of the transaction in the settlement currency. */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    /** Status of the transaction. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonProperty("token_info") @ExcludeMissing fun _tokenInfo() = tokenInfo

    /** Date and time when the transaction last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): Transaction = apply {
        if (!validated) {
            acquirerFee()
            acquirerReferenceNumber()
            accountToken()
            amount()
            amounts().validate()
            authorizationAmount()
            authorizationCode()
            avs().map { it.validate() }
            cardToken()
            cardholderAuthentication().map { it.validate() }
            created()
            events().map { it.forEach { it.validate() } }
            merchant().validate()
            merchantAmount()
            merchantAuthorizationAmount()
            merchantCurrency()
            network()
            networkRiskScore()
            result()
            pos().validate()
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
        private var accountToken: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var amounts: JsonField<TransactionAmounts> = JsonMissing.of()
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
        private var result: JsonField<DeclineResult> = JsonMissing.of()
        private var pos: JsonField<Pos> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var tokenInfo: JsonField<TokenInfo> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transaction: Transaction) = apply {
            acquirerFee = transaction.acquirerFee
            acquirerReferenceNumber = transaction.acquirerReferenceNumber
            accountToken = transaction.accountToken
            amount = transaction.amount
            amounts = transaction.amounts
            authorizationAmount = transaction.authorizationAmount
            authorizationCode = transaction.authorizationCode
            avs = transaction.avs
            cardToken = transaction.cardToken
            cardholderAuthentication = transaction.cardholderAuthentication
            created = transaction.created
            events = transaction.events
            merchant = transaction.merchant
            merchantAmount = transaction.merchantAmount
            merchantAuthorizationAmount = transaction.merchantAuthorizationAmount
            merchantCurrency = transaction.merchantCurrency
            network = transaction.network
            networkRiskScore = transaction.networkRiskScore
            result = transaction.result
            pos = transaction.pos
            settledAmount = transaction.settledAmount
            status = transaction.status
            token = transaction.token
            tokenInfo = transaction.tokenInfo
            updated = transaction.updated
            additionalProperties = transaction.additionalProperties.toMutableMap()
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
        fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) = apply {
            this.acquirerReferenceNumber = acquirerReferenceNumber
        }

        /** The token for the account associated with this transaction. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** The token for the account associated with this transaction. */
        fun accountToken(accountToken: JsonField<String>) = apply {
            this.accountToken = accountToken
        }

        /**
         * When the transaction is pending, this represents the authorization amount of the
         * transaction in the anticipated settlement currency. Once the transaction has settled,
         * this field represents the settled amount in the settlement currency.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * When the transaction is pending, this represents the authorization amount of the
         * transaction in the anticipated settlement currency. Once the transaction has settled,
         * this field represents the settled amount in the settlement currency.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun amounts(amounts: TransactionAmounts) = amounts(JsonField.of(amounts))

        fun amounts(amounts: JsonField<TransactionAmounts>) = apply { this.amounts = amounts }

        /** The authorization amount of the transaction in the anticipated settlement currency. */
        fun authorizationAmount(authorizationAmount: Long) =
            authorizationAmount(JsonField.of(authorizationAmount))

        /** The authorization amount of the transaction in the anticipated settlement currency. */
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
        fun authorizationCode(authorizationCode: JsonField<String>) = apply {
            this.authorizationCode = authorizationCode
        }

        fun avs(avs: Avs) = avs(JsonField.of(avs))

        fun avs(avs: JsonField<Avs>) = apply { this.avs = avs }

        /** Token for the card used in this transaction. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /** Token for the card used in this transaction. */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        fun cardholderAuthentication(cardholderAuthentication: CardholderAuthentication) =
            cardholderAuthentication(JsonField.of(cardholderAuthentication))

        fun cardholderAuthentication(
            cardholderAuthentication: JsonField<CardholderAuthentication>
        ) = apply { this.cardholderAuthentication = cardholderAuthentication }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun events(events: List<TransactionEvent>) = events(JsonField.of(events))

        fun events(events: JsonField<List<TransactionEvent>>) = apply { this.events = events }

        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /** Analogous to the 'amount', but in the merchant currency. */
        fun merchantAmount(merchantAmount: Long) = merchantAmount(JsonField.of(merchantAmount))

        /** Analogous to the 'amount', but in the merchant currency. */
        fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
            this.merchantAmount = merchantAmount
        }

        /** Analogous to the 'authorization_amount', but in the merchant currency. */
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: Long) =
            merchantAuthorizationAmount(JsonField.of(merchantAuthorizationAmount))

        /** Analogous to the 'authorization_amount', but in the merchant currency. */
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: JsonField<Long>) = apply {
            this.merchantAuthorizationAmount = merchantAuthorizationAmount
        }

        /** 3-digit alphabetic ISO 4217 code for the local currency of the transaction. */
        fun merchantCurrency(merchantCurrency: String) =
            merchantCurrency(JsonField.of(merchantCurrency))

        /** 3-digit alphabetic ISO 4217 code for the local currency of the transaction. */
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
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         */
        fun networkRiskScore(networkRiskScore: Long) =
            networkRiskScore(JsonField.of(networkRiskScore))

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         */
        fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
            this.networkRiskScore = networkRiskScore
        }

        fun result(result: DeclineResult) = result(JsonField.of(result))

        fun result(result: JsonField<DeclineResult>) = apply { this.result = result }

        fun pos(pos: Pos) = pos(JsonField.of(pos))

        fun pos(pos: JsonField<Pos>) = apply { this.pos = pos }

        /** The settled amount of the transaction in the settlement currency. */
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /** The settled amount of the transaction in the settlement currency. */
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /** Status of the transaction. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Status of the transaction. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun tokenInfo(tokenInfo: TokenInfo) = tokenInfo(JsonField.of(tokenInfo))

        fun tokenInfo(tokenInfo: JsonField<TokenInfo>) = apply { this.tokenInfo = tokenInfo }

        /** Date and time when the transaction last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the transaction last updated. UTC time zone. */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

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

        fun build(): Transaction =
            Transaction(
                acquirerFee,
                acquirerReferenceNumber,
                accountToken,
                amount,
                amounts,
                authorizationAmount,
                authorizationCode,
                avs,
                cardToken,
                cardholderAuthentication,
                created,
                events.map { it.toImmutable() },
                merchant,
                merchantAmount,
                merchantAuthorizationAmount,
                merchantCurrency,
                network,
                networkRiskScore,
                result,
                pos,
                settledAmount,
                status,
                token,
                tokenInfo,
                updated,
                additionalProperties.toImmutable(),
            )
    }

    @NoAutoDetect
    class TransactionAmounts
    @JsonCreator
    private constructor(
        @JsonProperty("cardholder")
        @ExcludeMissing
        private val cardholder: JsonField<Cardholder> = JsonMissing.of(),
        @JsonProperty("hold") @ExcludeMissing private val hold: JsonField<Hold> = JsonMissing.of(),
        @JsonProperty("merchant")
        @ExcludeMissing
        private val merchant: JsonField<Merchant> = JsonMissing.of(),
        @JsonProperty("settlement")
        @ExcludeMissing
        private val settlement: JsonField<Settlement> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

        fun hold(): Hold = hold.getRequired("hold")

        fun merchant(): Merchant = merchant.getRequired("merchant")

        fun settlement(): Settlement = settlement.getRequired("settlement")

        @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

        @JsonProperty("hold") @ExcludeMissing fun _hold() = hold

        @JsonProperty("merchant") @ExcludeMissing fun _merchant() = merchant

        @JsonProperty("settlement") @ExcludeMissing fun _settlement() = settlement

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TransactionAmounts = apply {
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

            private var cardholder: JsonField<Cardholder> = JsonMissing.of()
            private var hold: JsonField<Hold> = JsonMissing.of()
            private var merchant: JsonField<Merchant> = JsonMissing.of()
            private var settlement: JsonField<Settlement> = JsonMissing.of()
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

            fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                this.cardholder = cardholder
            }

            fun hold(hold: Hold) = hold(JsonField.of(hold))

            fun hold(hold: JsonField<Hold>) = apply { this.hold = hold }

            fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

            fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

            fun settlement(settlement: Settlement) = settlement(JsonField.of(settlement))

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

            fun build(): TransactionAmounts =
                TransactionAmounts(
                    cardholder,
                    hold,
                    merchant,
                    settlement,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class Cardholder
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            private val conversionRate: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The estimated settled amount of the transaction in the cardholder billing currency.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The exchange rate used to convert the merchant amount to the cardholder billing
             * amount.
             */
            fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The estimated settled amount of the transaction in the cardholder billing currency.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The exchange rate used to convert the merchant amount to the cardholder billing
             * amount.
             */
            @JsonProperty("conversion_rate") @ExcludeMissing fun _conversionRate() = conversionRate

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Cardholder = apply {
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
                 * The estimated settled amount of the transaction in the cardholder billing
                 * currency.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The exchange rate used to convert the merchant amount to the cardholder billing
                 * amount.
                 */
                fun conversionRate(conversionRate: String) =
                    conversionRate(JsonField.of(conversionRate))

                /**
                 * The exchange rate used to convert the merchant amount to the cardholder billing
                 * amount.
                 */
                fun conversionRate(conversionRate: JsonField<String>) = apply {
                    this.conversionRate = conversionRate
                }

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                fun build(): Cardholder =
                    Cardholder(
                        amount,
                        conversionRate,
                        currency,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Cardholder && amount == other.amount && conversionRate == other.conversionRate && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, conversionRate, currency, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Cardholder{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Hold
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The pending amount of the transaction in the anticipated settlement currency. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The pending amount of the transaction in the anticipated settlement currency. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Hold = apply {
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
                internal fun from(hold: Hold) = apply {
                    amount = hold.amount
                    currency = hold.currency
                    additionalProperties = hold.additionalProperties.toMutableMap()
                }

                /** The pending amount of the transaction in the anticipated settlement currency. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The pending amount of the transaction in the anticipated settlement currency. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                fun build(): Hold =
                    Hold(
                        amount,
                        currency,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Hold && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Hold{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Merchant
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The settled amount of the transaction in the merchant currency. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The settled amount of the transaction in the merchant currency. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Merchant = apply {
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
                internal fun from(merchant: Merchant) = apply {
                    amount = merchant.amount
                    currency = merchant.currency
                    additionalProperties = merchant.additionalProperties.toMutableMap()
                }

                /** The settled amount of the transaction in the merchant currency. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The settled amount of the transaction in the merchant currency. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                fun build(): Merchant =
                    Merchant(
                        amount,
                        currency,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Merchant && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Merchant{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class Settlement
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The settled amount of the transaction in the settlement currency. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The settled amount of the transaction in the settlement currency. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Settlement = apply {
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
                internal fun from(settlement: Settlement) = apply {
                    amount = settlement.amount
                    currency = settlement.currency
                    additionalProperties = settlement.additionalProperties.toMutableMap()
                }

                /** The settled amount of the transaction in the settlement currency. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The settled amount of the transaction in the settlement currency. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                fun build(): Settlement =
                    Settlement(
                        amount,
                        currency,
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Settlement && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Settlement{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionAmounts && cardholder == other.cardholder && hold == other.hold && merchant == other.merchant && settlement == other.settlement && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(cardholder, hold, merchant, settlement, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionAmounts{cardholder=$cardholder, hold=$hold, merchant=$merchant, settlement=$settlement, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Avs
    @JsonCreator
    private constructor(
        @JsonProperty("address")
        @ExcludeMissing
        private val address: JsonField<String> = JsonMissing.of(),
        @JsonProperty("zipcode")
        @ExcludeMissing
        private val zipcode: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Cardholder address */
        fun address(): String = address.getRequired("address")

        /** Cardholder ZIP code */
        fun zipcode(): String = zipcode.getRequired("zipcode")

        /** Cardholder address */
        @JsonProperty("address") @ExcludeMissing fun _address() = address

        /** Cardholder ZIP code */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode() = zipcode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                address = avs.address
                zipcode = avs.zipcode
                additionalProperties = avs.additionalProperties.toMutableMap()
            }

            /** Cardholder address */
            fun address(address: String) = address(JsonField.of(address))

            /** Cardholder address */
            fun address(address: JsonField<String>) = apply { this.address = address }

            /** Cardholder ZIP code */
            fun zipcode(zipcode: String) = zipcode(JsonField.of(zipcode))

            /** Cardholder ZIP code */
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

            fun build(): Avs =
                Avs(
                    address,
                    zipcode,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Avs && address == other.address && zipcode == other.zipcode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(address, zipcode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Avs{address=$address, zipcode=$zipcode, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class CardholderAuthentication
    @JsonCreator
    private constructor(
        @JsonProperty("3ds_version")
        @ExcludeMissing
        private val _3dsVersion: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acquirer_exemption")
        @ExcludeMissing
        private val acquirerExemption: JsonField<AcquirerExemption> = JsonMissing.of(),
        @JsonProperty("authentication_result")
        @ExcludeMissing
        private val authenticationResult: JsonField<AuthenticationResult> = JsonMissing.of(),
        @JsonProperty("decision_made_by")
        @ExcludeMissing
        private val decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of(),
        @JsonProperty("liability_shift")
        @ExcludeMissing
        private val liabilityShift: JsonField<LiabilityShift> = JsonMissing.of(),
        @JsonProperty("three_ds_authentication_token")
        @ExcludeMissing
        private val threeDSAuthenticationToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("verification_attempted")
        @ExcludeMissing
        private val verificationAttempted: JsonField<VerificationAttempted> = JsonMissing.of(),
        @JsonProperty("verification_result")
        @ExcludeMissing
        private val verificationResult: JsonField<VerificationResult> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The 3DS version used for the authentication */
        fun _3dsVersion(): Optional<String> =
            Optional.ofNullable(_3dsVersion.getNullable("3ds_version"))

        /** Whether an acquirer exemption applied to the transaction. */
        fun acquirerExemption(): AcquirerExemption =
            acquirerExemption.getRequired("acquirer_exemption")

        /** Indicates what the outcome of the 3DS authentication process is. */
        fun authenticationResult(): AuthenticationResult =
            authenticationResult.getRequired("authentication_result")

        /** Indicates which party made the 3DS authentication decision. */
        fun decisionMadeBy(): DecisionMadeBy = decisionMadeBy.getRequired("decision_made_by")

        /**
         * Indicates whether chargeback liability shift applies to the transaction. Possible enum
         * values:
         *
         *     * `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow, chargeback liability shift applies.
         *     * `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the acquirer and in this case the `acquirer_exemption` field is expected to be not `NONE`.
         *     * `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is liable.
         * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
         *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
         */
        fun liabilityShift(): LiabilityShift = liabilityShift.getRequired("liability_shift")

        /**
         * Unique identifier you can use to match a given 3DS authentication (available via the
         * three_ds_authentication.created event webhook) and the transaction. Note that in cases
         * where liability shift does not occur, this token is matched to the transaction on a
         * best-effort basis.
         */
        fun threeDSAuthenticationToken(): Optional<String> =
            Optional.ofNullable(
                threeDSAuthenticationToken.getNullable("three_ds_authentication_token")
            )

        /**
         * Indicates whether a 3DS challenge flow was used, and if so, what the verification method
         * was. (deprecated, use `authentication_result`)
         */
        fun verificationAttempted(): VerificationAttempted =
            verificationAttempted.getRequired("verification_attempted")

        /**
         * Indicates whether a transaction is considered 3DS authenticated. (deprecated, use
         * `authentication_result`)
         */
        fun verificationResult(): VerificationResult =
            verificationResult.getRequired("verification_result")

        /** The 3DS version used for the authentication */
        @JsonProperty("3ds_version") @ExcludeMissing fun __3dsVersion() = _3dsVersion

        /** Whether an acquirer exemption applied to the transaction. */
        @JsonProperty("acquirer_exemption")
        @ExcludeMissing
        fun _acquirerExemption() = acquirerExemption

        /** Indicates what the outcome of the 3DS authentication process is. */
        @JsonProperty("authentication_result")
        @ExcludeMissing
        fun _authenticationResult() = authenticationResult

        /** Indicates which party made the 3DS authentication decision. */
        @JsonProperty("decision_made_by") @ExcludeMissing fun _decisionMadeBy() = decisionMadeBy

        /**
         * Indicates whether chargeback liability shift applies to the transaction. Possible enum
         * values:
         *
         *     * `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow, chargeback liability shift applies.
         *     * `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the acquirer and in this case the `acquirer_exemption` field is expected to be not `NONE`.
         *     * `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is liable.
         * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
         *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
         */
        @JsonProperty("liability_shift") @ExcludeMissing fun _liabilityShift() = liabilityShift

        /**
         * Unique identifier you can use to match a given 3DS authentication (available via the
         * three_ds_authentication.created event webhook) and the transaction. Note that in cases
         * where liability shift does not occur, this token is matched to the transaction on a
         * best-effort basis.
         */
        @JsonProperty("three_ds_authentication_token")
        @ExcludeMissing
        fun _threeDSAuthenticationToken() = threeDSAuthenticationToken

        /**
         * Indicates whether a 3DS challenge flow was used, and if so, what the verification method
         * was. (deprecated, use `authentication_result`)
         */
        @JsonProperty("verification_attempted")
        @ExcludeMissing
        fun _verificationAttempted() = verificationAttempted

        /**
         * Indicates whether a transaction is considered 3DS authenticated. (deprecated, use
         * `authentication_result`)
         */
        @JsonProperty("verification_result")
        @ExcludeMissing
        fun _verificationResult() = verificationResult

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                _3dsVersion = cardholderAuthentication._3dsVersion
                acquirerExemption = cardholderAuthentication.acquirerExemption
                authenticationResult = cardholderAuthentication.authenticationResult
                decisionMadeBy = cardholderAuthentication.decisionMadeBy
                liabilityShift = cardholderAuthentication.liabilityShift
                threeDSAuthenticationToken = cardholderAuthentication.threeDSAuthenticationToken
                verificationAttempted = cardholderAuthentication.verificationAttempted
                verificationResult = cardholderAuthentication.verificationResult
                additionalProperties = cardholderAuthentication.additionalProperties.toMutableMap()
            }

            /** The 3DS version used for the authentication */
            fun _3dsVersion(_3dsVersion: String) = _3dsVersion(JsonField.of(_3dsVersion))

            /** The 3DS version used for the authentication */
            fun _3dsVersion(_3dsVersion: JsonField<String>) = apply {
                this._3dsVersion = _3dsVersion
            }

            /** Whether an acquirer exemption applied to the transaction. */
            fun acquirerExemption(acquirerExemption: AcquirerExemption) =
                acquirerExemption(JsonField.of(acquirerExemption))

            /** Whether an acquirer exemption applied to the transaction. */
            fun acquirerExemption(acquirerExemption: JsonField<AcquirerExemption>) = apply {
                this.acquirerExemption = acquirerExemption
            }

            /** Indicates what the outcome of the 3DS authentication process is. */
            fun authenticationResult(authenticationResult: AuthenticationResult) =
                authenticationResult(JsonField.of(authenticationResult))

            /** Indicates what the outcome of the 3DS authentication process is. */
            fun authenticationResult(authenticationResult: JsonField<AuthenticationResult>) =
                apply {
                    this.authenticationResult = authenticationResult
                }

            /** Indicates which party made the 3DS authentication decision. */
            fun decisionMadeBy(decisionMadeBy: DecisionMadeBy) =
                decisionMadeBy(JsonField.of(decisionMadeBy))

            /** Indicates which party made the 3DS authentication decision. */
            fun decisionMadeBy(decisionMadeBy: JsonField<DecisionMadeBy>) = apply {
                this.decisionMadeBy = decisionMadeBy
            }

            /**
             * Indicates whether chargeback liability shift applies to the transaction. Possible
             * enum values:
             *
             *     * `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow, chargeback liability shift applies.
             *     * `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the acquirer and in this case the `acquirer_exemption` field is expected to be not `NONE`.
             *     * `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is liable.
             * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
             *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
             */
            fun liabilityShift(liabilityShift: LiabilityShift) =
                liabilityShift(JsonField.of(liabilityShift))

            /**
             * Indicates whether chargeback liability shift applies to the transaction. Possible
             * enum values:
             *
             *     * `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow, chargeback liability shift applies.
             *     * `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the acquirer and in this case the `acquirer_exemption` field is expected to be not `NONE`.
             *     * `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is liable.
             * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
             *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
             */
            fun liabilityShift(liabilityShift: JsonField<LiabilityShift>) = apply {
                this.liabilityShift = liabilityShift
            }

            /**
             * Unique identifier you can use to match a given 3DS authentication (available via the
             * three_ds_authentication.created event webhook) and the transaction. Note that in
             * cases where liability shift does not occur, this token is matched to the transaction
             * on a best-effort basis.
             */
            fun threeDSAuthenticationToken(threeDSAuthenticationToken: String) =
                threeDSAuthenticationToken(JsonField.of(threeDSAuthenticationToken))

            /**
             * Unique identifier you can use to match a given 3DS authentication (available via the
             * three_ds_authentication.created event webhook) and the transaction. Note that in
             * cases where liability shift does not occur, this token is matched to the transaction
             * on a best-effort basis.
             */
            fun threeDSAuthenticationToken(threeDSAuthenticationToken: JsonField<String>) = apply {
                this.threeDSAuthenticationToken = threeDSAuthenticationToken
            }

            /**
             * Indicates whether a 3DS challenge flow was used, and if so, what the verification
             * method was. (deprecated, use `authentication_result`)
             */
            fun verificationAttempted(verificationAttempted: VerificationAttempted) =
                verificationAttempted(JsonField.of(verificationAttempted))

            /**
             * Indicates whether a 3DS challenge flow was used, and if so, what the verification
             * method was. (deprecated, use `authentication_result`)
             */
            fun verificationAttempted(verificationAttempted: JsonField<VerificationAttempted>) =
                apply {
                    this.verificationAttempted = verificationAttempted
                }

            /**
             * Indicates whether a transaction is considered 3DS authenticated. (deprecated, use
             * `authentication_result`)
             */
            fun verificationResult(verificationResult: VerificationResult) =
                verificationResult(JsonField.of(verificationResult))

            /**
             * Indicates whether a transaction is considered 3DS authenticated. (deprecated, use
             * `authentication_result`)
             */
            fun verificationResult(verificationResult: JsonField<VerificationResult>) = apply {
                this.verificationResult = verificationResult
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
                    additionalProperties.toImmutable(),
                )
        }

        class AcquirerExemption
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField
                val AUTHENTICATION_OUTAGE_EXCEPTION = of("AUTHENTICATION_OUTAGE_EXCEPTION")

                @JvmField val LOW_VALUE = of("LOW_VALUE")

                @JvmField val MERCHANT_INITIATED_TRANSACTION = of("MERCHANT_INITIATED_TRANSACTION")

                @JvmField val NONE = of("NONE")

                @JvmField val RECURRING_PAYMENT = of("RECURRING_PAYMENT")

                @JvmField val SECURE_CORPORATE_PAYMENT = of("SECURE_CORPORATE_PAYMENT")

                @JvmField
                val STRONG_CUSTOMER_AUTHENTICATION_DELEGATION =
                    of("STRONG_CUSTOMER_AUTHENTICATION_DELEGATION")

                @JvmField val TRANSACTION_RISK_ANALYSIS = of("TRANSACTION_RISK_ANALYSIS")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AcquirerExemption && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class AuthenticationResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ATTEMPTS = of("ATTEMPTS")

                @JvmField val DECLINE = of("DECLINE")

                @JvmField val NONE = of("NONE")

                @JvmField val SUCCESS = of("SUCCESS")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AuthenticationResult && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class DecisionMadeBy
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CUSTOMER_ENDPOINT = of("CUSTOMER_ENDPOINT")

                @JvmField val LITHIC_DEFAULT = of("LITHIC_DEFAULT")

                @JvmField val LITHIC_RULES = of("LITHIC_RULES")

                @JvmField val NETWORK = of("NETWORK")

                @JvmField val UNKNOWN = of("UNKNOWN")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DecisionMadeBy && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class LiabilityShift
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val _3DS_AUTHENTICATED = of("3DS_AUTHENTICATED")

                @JvmField val ACQUIRER_EXEMPTION = of("ACQUIRER_EXEMPTION")

                @JvmField val NONE = of("NONE")

                @JvmField val TOKEN_AUTHENTICATED = of("TOKEN_AUTHENTICATED")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is LiabilityShift && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class VerificationAttempted
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val NONE = of("NONE")

                @JvmField val OTHER = of("OTHER")

                @JvmStatic fun of(value: String) = VerificationAttempted(JsonField.of(value))
            }

            enum class Known {
                NONE,
                OTHER,
            }

            enum class Value {
                NONE,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NONE -> Value.NONE
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NONE -> Known.NONE
                    OTHER -> Known.OTHER
                    else ->
                        throw LithicInvalidDataException("Unknown VerificationAttempted: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VerificationAttempted && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class VerificationResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CANCELLED = of("CANCELLED")

                @JvmField val FAILED = of("FAILED")

                @JvmField val FRICTIONLESS = of("FRICTIONLESS")

                @JvmField val NOT_ATTEMPTED = of("NOT_ATTEMPTED")

                @JvmField val REJECTED = of("REJECTED")

                @JvmField val SUCCESS = of("SUCCESS")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is VerificationResult && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CardholderAuthentication && _3dsVersion == other._3dsVersion && acquirerExemption == other.acquirerExemption && authenticationResult == other.authenticationResult && decisionMadeBy == other.decisionMadeBy && liabilityShift == other.liabilityShift && threeDSAuthenticationToken == other.threeDSAuthenticationToken && verificationAttempted == other.verificationAttempted && verificationResult == other.verificationResult && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(_3dsVersion, acquirerExemption, authenticationResult, decisionMadeBy, liabilityShift, threeDSAuthenticationToken, verificationAttempted, verificationResult, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CardholderAuthentication{_3dsVersion=$_3dsVersion, acquirerExemption=$acquirerExemption, authenticationResult=$authenticationResult, decisionMadeBy=$decisionMadeBy, liabilityShift=$liabilityShift, threeDSAuthenticationToken=$threeDSAuthenticationToken, verificationAttempted=$verificationAttempted, verificationResult=$verificationResult, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class Merchant
    @JsonCreator
    private constructor(
        @JsonProperty("acceptor_id")
        @ExcludeMissing
        private val acceptorId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("acquiring_institution_id")
        @ExcludeMissing
        private val acquiringInstitutionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("city")
        @ExcludeMissing
        private val city: JsonField<String> = JsonMissing.of(),
        @JsonProperty("country")
        @ExcludeMissing
        private val country: JsonField<String> = JsonMissing.of(),
        @JsonProperty("descriptor")
        @ExcludeMissing
        private val descriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mcc") @ExcludeMissing private val mcc: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state")
        @ExcludeMissing
        private val state: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Unique alphanumeric identifier for the payment card acceptor (merchant). */
        fun acceptorId(): String = acceptorId.getRequired("acceptor_id")

        /** Unique numeric identifier of the acquiring institution. */
        fun acquiringInstitutionId(): String =
            acquiringInstitutionId.getRequired("acquiring_institution_id")

        /**
         * City of card acceptor. Note that in many cases, particularly in card-not-present
         * transactions, merchants may send through a phone number or URL in this field.
         */
        fun city(): String = city.getRequired("city")

        /**
         * Country or entity of card acceptor. Possible values are: (1) all ISO 3166-1 alpha-3
         * country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         */
        fun country(): String = country.getRequired("country")

        /** Short description of card acceptor. */
        fun descriptor(): String = descriptor.getRequired("descriptor")

        /**
         * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used to
         * classify a business by the types of goods or services it provides.
         */
        fun mcc(): String = mcc.getRequired("mcc")

        /** Geographic state of card acceptor. */
        fun state(): String = state.getRequired("state")

        /** Unique alphanumeric identifier for the payment card acceptor (merchant). */
        @JsonProperty("acceptor_id") @ExcludeMissing fun _acceptorId() = acceptorId

        /** Unique numeric identifier of the acquiring institution. */
        @JsonProperty("acquiring_institution_id")
        @ExcludeMissing
        fun _acquiringInstitutionId() = acquiringInstitutionId

        /**
         * City of card acceptor. Note that in many cases, particularly in card-not-present
         * transactions, merchants may send through a phone number or URL in this field.
         */
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /**
         * Country or entity of card acceptor. Possible values are: (1) all ISO 3166-1 alpha-3
         * country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         */
        @JsonProperty("country") @ExcludeMissing fun _country() = country

        /** Short description of card acceptor. */
        @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

        /**
         * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used to
         * classify a business by the types of goods or services it provides.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc() = mcc

        /** Geographic state of card acceptor. */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Merchant = apply {
            if (!validated) {
                acceptorId()
                acquiringInstitutionId()
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
            private var acquiringInstitutionId: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var country: JsonField<String> = JsonMissing.of()
            private var descriptor: JsonField<String> = JsonMissing.of()
            private var mcc: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(merchant: Merchant) = apply {
                acceptorId = merchant.acceptorId
                acquiringInstitutionId = merchant.acquiringInstitutionId
                city = merchant.city
                country = merchant.country
                descriptor = merchant.descriptor
                mcc = merchant.mcc
                state = merchant.state
                additionalProperties = merchant.additionalProperties.toMutableMap()
            }

            /** Unique alphanumeric identifier for the payment card acceptor (merchant). */
            fun acceptorId(acceptorId: String) = acceptorId(JsonField.of(acceptorId))

            /** Unique alphanumeric identifier for the payment card acceptor (merchant). */
            fun acceptorId(acceptorId: JsonField<String>) = apply { this.acceptorId = acceptorId }

            /** Unique numeric identifier of the acquiring institution. */
            fun acquiringInstitutionId(acquiringInstitutionId: String) =
                acquiringInstitutionId(JsonField.of(acquiringInstitutionId))

            /** Unique numeric identifier of the acquiring institution. */
            fun acquiringInstitutionId(acquiringInstitutionId: JsonField<String>) = apply {
                this.acquiringInstitutionId = acquiringInstitutionId
            }

            /**
             * City of card acceptor. Note that in many cases, particularly in card-not-present
             * transactions, merchants may send through a phone number or URL in this field.
             */
            fun city(city: String) = city(JsonField.of(city))

            /**
             * City of card acceptor. Note that in many cases, particularly in card-not-present
             * transactions, merchants may send through a phone number or URL in this field.
             */
            fun city(city: JsonField<String>) = apply { this.city = city }

            /**
             * Country or entity of card acceptor. Possible values are: (1) all ISO 3166-1 alpha-3
             * country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
             */
            fun country(country: String) = country(JsonField.of(country))

            /**
             * Country or entity of card acceptor. Possible values are: (1) all ISO 3166-1 alpha-3
             * country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
             */
            fun country(country: JsonField<String>) = apply { this.country = country }

            /** Short description of card acceptor. */
            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            /** Short description of card acceptor. */
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
            fun mcc(mcc: JsonField<String>) = apply { this.mcc = mcc }

            /** Geographic state of card acceptor. */
            fun state(state: String) = state(JsonField.of(state))

            /** Geographic state of card acceptor. */
            fun state(state: JsonField<String>) = apply { this.state = state }

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

            fun build(): Merchant =
                Merchant(
                    acceptorId,
                    acquiringInstitutionId,
                    city,
                    country,
                    descriptor,
                    mcc,
                    state,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Merchant && acceptorId == other.acceptorId && acquiringInstitutionId == other.acquiringInstitutionId && city == other.city && country == other.country && descriptor == other.descriptor && mcc == other.mcc && state == other.state && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(acceptorId, acquiringInstitutionId, city, country, descriptor, mcc, state, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Merchant{acceptorId=$acceptorId, acquiringInstitutionId=$acquiringInstitutionId, city=$city, country=$country, descriptor=$descriptor, mcc=$mcc, state=$state, additionalProperties=$additionalProperties}"
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val INTERLINK = of("INTERLINK")

            @JvmField val MAESTRO = of("MAESTRO")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA = of("VISA")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class Pos
    @JsonCreator
    private constructor(
        @JsonProperty("entry_mode")
        @ExcludeMissing
        private val entryMode: JsonField<PosEntryMode> = JsonMissing.of(),
        @JsonProperty("terminal")
        @ExcludeMissing
        private val terminal: JsonField<PosTerminal> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun entryMode(): PosEntryMode = entryMode.getRequired("entry_mode")

        fun terminal(): PosTerminal = terminal.getRequired("terminal")

        @JsonProperty("entry_mode") @ExcludeMissing fun _entryMode() = entryMode

        @JsonProperty("terminal") @ExcludeMissing fun _terminal() = terminal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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

            private var entryMode: JsonField<PosEntryMode> = JsonMissing.of()
            private var terminal: JsonField<PosTerminal> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(pos: Pos) = apply {
                entryMode = pos.entryMode
                terminal = pos.terminal
                additionalProperties = pos.additionalProperties.toMutableMap()
            }

            fun entryMode(entryMode: PosEntryMode) = entryMode(JsonField.of(entryMode))

            fun entryMode(entryMode: JsonField<PosEntryMode>) = apply { this.entryMode = entryMode }

            fun terminal(terminal: PosTerminal) = terminal(JsonField.of(terminal))

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

            fun build(): Pos =
                Pos(
                    entryMode,
                    terminal,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class PosEntryMode
        @JsonCreator
        private constructor(
            @JsonProperty("card")
            @ExcludeMissing
            private val card: JsonField<Card> = JsonMissing.of(),
            @JsonProperty("cardholder")
            @ExcludeMissing
            private val cardholder: JsonField<Cardholder> = JsonMissing.of(),
            @JsonProperty("pan") @ExcludeMissing private val pan: JsonField<Pan> = JsonMissing.of(),
            @JsonProperty("pin_entered")
            @ExcludeMissing
            private val pinEntered: JsonField<Boolean> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Card presence indicator */
            fun card(): Card = card.getRequired("card")

            /** Cardholder presence indicator */
            fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

            /** Method of entry for the PAN */
            fun pan(): Pan = pan.getRequired("pan")

            /** Indicates whether the cardholder entered the PIN. True if the PIN was entered. */
            fun pinEntered(): Boolean = pinEntered.getRequired("pin_entered")

            /** Card presence indicator */
            @JsonProperty("card") @ExcludeMissing fun _card() = card

            /** Cardholder presence indicator */
            @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

            /** Method of entry for the PAN */
            @JsonProperty("pan") @ExcludeMissing fun _pan() = pan

            /** Indicates whether the cardholder entered the PIN. True if the PIN was entered. */
            @JsonProperty("pin_entered") @ExcludeMissing fun _pinEntered() = pinEntered

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PosEntryMode = apply {
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
                internal fun from(posEntryMode: PosEntryMode) = apply {
                    card = posEntryMode.card
                    cardholder = posEntryMode.cardholder
                    pan = posEntryMode.pan
                    pinEntered = posEntryMode.pinEntered
                    additionalProperties = posEntryMode.additionalProperties.toMutableMap()
                }

                /** Card presence indicator */
                fun card(card: Card) = card(JsonField.of(card))

                /** Card presence indicator */
                fun card(card: JsonField<Card>) = apply { this.card = card }

                /** Cardholder presence indicator */
                fun cardholder(cardholder: Cardholder) = cardholder(JsonField.of(cardholder))

                /** Cardholder presence indicator */
                fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                    this.cardholder = cardholder
                }

                /** Method of entry for the PAN */
                fun pan(pan: Pan) = pan(JsonField.of(pan))

                /** Method of entry for the PAN */
                fun pan(pan: JsonField<Pan>) = apply { this.pan = pan }

                /**
                 * Indicates whether the cardholder entered the PIN. True if the PIN was entered.
                 */
                fun pinEntered(pinEntered: Boolean) = pinEntered(JsonField.of(pinEntered))

                /**
                 * Indicates whether the cardholder entered the PIN. True if the PIN was entered.
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

                fun build(): PosEntryMode =
                    PosEntryMode(
                        card,
                        cardholder,
                        pan,
                        pinEntered,
                        additionalProperties.toImmutable(),
                    )
            }

            class Card
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val NOT_PRESENT = of("NOT_PRESENT")

                    @JvmField val PREAUTHORIZED = of("PREAUTHORIZED")

                    @JvmField val PRESENT = of("PRESENT")

                    @JvmField val UNKNOWN = of("UNKNOWN")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Card && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Cardholder
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Cardholder && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Pan
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Pan && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PosEntryMode && card == other.card && cardholder == other.cardholder && pan == other.pan && pinEntered == other.pinEntered && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(card, cardholder, pan, pinEntered, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PosEntryMode{card=$card, cardholder=$cardholder, pan=$pan, pinEntered=$pinEntered, additionalProperties=$additionalProperties}"
        }

        @NoAutoDetect
        class PosTerminal
        @JsonCreator
        private constructor(
            @JsonProperty("attended")
            @ExcludeMissing
            private val attended: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("card_retention_capable")
            @ExcludeMissing
            private val cardRetentionCapable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("on_premise")
            @ExcludeMissing
            private val onPremise: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("operator")
            @ExcludeMissing
            private val operator: JsonField<Operator> = JsonMissing.of(),
            @JsonProperty("partial_approval_capable")
            @ExcludeMissing
            private val partialApprovalCapable: JsonField<Boolean> = JsonMissing.of(),
            @JsonProperty("pin_capability")
            @ExcludeMissing
            private val pinCapability: JsonField<PinCapability> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** True if a clerk is present at the sale. */
            fun attended(): Boolean = attended.getRequired("attended")

            /** True if the terminal is capable of retaining the card. */
            fun cardRetentionCapable(): Boolean =
                cardRetentionCapable.getRequired("card_retention_capable")

            /** True if the sale was made at the place of business (vs. mobile). */
            fun onPremise(): Boolean = onPremise.getRequired("on_premise")

            /** The person that is designated to swipe the card */
            fun operator(): Operator = operator.getRequired("operator")

            /**
             * True if the terminal is capable of partial approval. Partial approval is when part of
             * a transaction is approved and another payment must be used for the remainder. Example
             * scenario: A $40 transaction is attempted on a prepaid card with a $25 balance. If
             * partial approval is enabled, $25 can be authorized, at which point the POS will
             * prompt the user for an additional payment of $15.
             */
            fun partialApprovalCapable(): Boolean =
                partialApprovalCapable.getRequired("partial_approval_capable")

            /** Status of whether the POS is able to accept PINs */
            fun pinCapability(): PinCapability = pinCapability.getRequired("pin_capability")

            /** POS Type */
            fun type(): Type = type.getRequired("type")

            /** True if a clerk is present at the sale. */
            @JsonProperty("attended") @ExcludeMissing fun _attended() = attended

            /** True if the terminal is capable of retaining the card. */
            @JsonProperty("card_retention_capable")
            @ExcludeMissing
            fun _cardRetentionCapable() = cardRetentionCapable

            /** True if the sale was made at the place of business (vs. mobile). */
            @JsonProperty("on_premise") @ExcludeMissing fun _onPremise() = onPremise

            /** The person that is designated to swipe the card */
            @JsonProperty("operator") @ExcludeMissing fun _operator() = operator

            /**
             * True if the terminal is capable of partial approval. Partial approval is when part of
             * a transaction is approved and another payment must be used for the remainder. Example
             * scenario: A $40 transaction is attempted on a prepaid card with a $25 balance. If
             * partial approval is enabled, $25 can be authorized, at which point the POS will
             * prompt the user for an additional payment of $15.
             */
            @JsonProperty("partial_approval_capable")
            @ExcludeMissing
            fun _partialApprovalCapable() = partialApprovalCapable

            /** Status of whether the POS is able to accept PINs */
            @JsonProperty("pin_capability") @ExcludeMissing fun _pinCapability() = pinCapability

            /** POS Type */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PosTerminal = apply {
                if (!validated) {
                    attended()
                    cardRetentionCapable()
                    onPremise()
                    operator()
                    partialApprovalCapable()
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
                private var partialApprovalCapable: JsonField<Boolean> = JsonMissing.of()
                private var pinCapability: JsonField<PinCapability> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
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
                    additionalProperties = posTerminal.additionalProperties.toMutableMap()
                }

                /** True if a clerk is present at the sale. */
                fun attended(attended: Boolean) = attended(JsonField.of(attended))

                /** True if a clerk is present at the sale. */
                fun attended(attended: JsonField<Boolean>) = apply { this.attended = attended }

                /** True if the terminal is capable of retaining the card. */
                fun cardRetentionCapable(cardRetentionCapable: Boolean) =
                    cardRetentionCapable(JsonField.of(cardRetentionCapable))

                /** True if the terminal is capable of retaining the card. */
                fun cardRetentionCapable(cardRetentionCapable: JsonField<Boolean>) = apply {
                    this.cardRetentionCapable = cardRetentionCapable
                }

                /** True if the sale was made at the place of business (vs. mobile). */
                fun onPremise(onPremise: Boolean) = onPremise(JsonField.of(onPremise))

                /** True if the sale was made at the place of business (vs. mobile). */
                fun onPremise(onPremise: JsonField<Boolean>) = apply { this.onPremise = onPremise }

                /** The person that is designated to swipe the card */
                fun operator(operator: Operator) = operator(JsonField.of(operator))

                /** The person that is designated to swipe the card */
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
                 * True if the terminal is capable of partial approval. Partial approval is when
                 * part of a transaction is approved and another payment must be used for the
                 * remainder. Example scenario: A $40 transaction is attempted on a prepaid card
                 * with a $25 balance. If partial approval is enabled, $25 can be authorized, at
                 * which point the POS will prompt the user for an additional payment of $15.
                 */
                fun partialApprovalCapable(partialApprovalCapable: JsonField<Boolean>) = apply {
                    this.partialApprovalCapable = partialApprovalCapable
                }

                /** Status of whether the POS is able to accept PINs */
                fun pinCapability(pinCapability: PinCapability) =
                    pinCapability(JsonField.of(pinCapability))

                /** Status of whether the POS is able to accept PINs */
                fun pinCapability(pinCapability: JsonField<PinCapability>) = apply {
                    this.pinCapability = pinCapability
                }

                /** POS Type */
                fun type(type: Type) = type(JsonField.of(type))

                /** POS Type */
                fun type(type: JsonField<Type>) = apply { this.type = type }

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

                fun build(): PosTerminal =
                    PosTerminal(
                        attended,
                        cardRetentionCapable,
                        onPremise,
                        operator,
                        partialApprovalCapable,
                        pinCapability,
                        type,
                        additionalProperties.toImmutable(),
                    )
            }

            class Operator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val ADMINISTRATIVE = of("ADMINISTRATIVE")

                    @JvmField val CARDHOLDER = of("CARDHOLDER")

                    @JvmField val CARD_ACCEPTOR = of("CARD_ACCEPTOR")

                    @JvmField val UNKNOWN = of("UNKNOWN")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Operator && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class PinCapability
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    @JvmField val CAPABLE = of("CAPABLE")

                    @JvmField val INOPERATIVE = of("INOPERATIVE")

                    @JvmField val NOT_CAPABLE = of("NOT_CAPABLE")

                    @JvmField val UNSPECIFIED = of("UNSPECIFIED")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is PinCapability && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                        VENDING -> Value.VENDING
                        VOICE -> Value.VOICE
                        UNKNOWN -> Value.UNKNOWN
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
                        VENDING -> Known.VENDING
                        VOICE -> Known.VOICE
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw LithicInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Type && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PosTerminal && attended == other.attended && cardRetentionCapable == other.cardRetentionCapable && onPremise == other.onPremise && operator == other.operator && partialApprovalCapable == other.partialApprovalCapable && pinCapability == other.pinCapability && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(attended, cardRetentionCapable, onPremise, operator, partialApprovalCapable, pinCapability, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PosTerminal{attended=$attended, cardRetentionCapable=$cardRetentionCapable, onPremise=$onPremise, operator=$operator, partialApprovalCapable=$partialApprovalCapable, pinCapability=$pinCapability, type=$type, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Pos && entryMode == other.entryMode && terminal == other.terminal && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(entryMode, terminal, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Pos{entryMode=$entryMode, terminal=$terminal, additionalProperties=$additionalProperties}"
    }

    class DeclineResult
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACCOUNT_STATE_TRANSACTION_FAIL = of("ACCOUNT_STATE_TRANSACTION_FAIL")

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val BANK_CONNECTION_ERROR = of("BANK_CONNECTION_ERROR")

            @JvmField val BANK_NOT_VERIFIED = of("BANK_NOT_VERIFIED")

            @JvmField val CARD_CLOSED = of("CARD_CLOSED")

            @JvmField val CARD_PAUSED = of("CARD_PAUSED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val FRAUD_ADVICE = of("FRAUD_ADVICE")

            @JvmField val IGNORED_TTL_EXPIRY = of("IGNORED_TTL_EXPIRY")

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

        enum class Known {
            ACCOUNT_STATE_TRANSACTION_FAIL,
            APPROVED,
            BANK_CONNECTION_ERROR,
            BANK_NOT_VERIFIED,
            CARD_CLOSED,
            CARD_PAUSED,
            DECLINED,
            FRAUD_ADVICE,
            IGNORED_TTL_EXPIRY,
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

        enum class Value {
            ACCOUNT_STATE_TRANSACTION_FAIL,
            APPROVED,
            BANK_CONNECTION_ERROR,
            BANK_NOT_VERIFIED,
            CARD_CLOSED,
            CARD_PAUSED,
            DECLINED,
            FRAUD_ADVICE,
            IGNORED_TTL_EXPIRY,
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
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_STATE_TRANSACTION_FAIL -> Value.ACCOUNT_STATE_TRANSACTION_FAIL
                APPROVED -> Value.APPROVED
                BANK_CONNECTION_ERROR -> Value.BANK_CONNECTION_ERROR
                BANK_NOT_VERIFIED -> Value.BANK_NOT_VERIFIED
                CARD_CLOSED -> Value.CARD_CLOSED
                CARD_PAUSED -> Value.CARD_PAUSED
                DECLINED -> Value.DECLINED
                FRAUD_ADVICE -> Value.FRAUD_ADVICE
                IGNORED_TTL_EXPIRY -> Value.IGNORED_TTL_EXPIRY
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

        fun known(): Known =
            when (this) {
                ACCOUNT_STATE_TRANSACTION_FAIL -> Known.ACCOUNT_STATE_TRANSACTION_FAIL
                APPROVED -> Known.APPROVED
                BANK_CONNECTION_ERROR -> Known.BANK_CONNECTION_ERROR
                BANK_NOT_VERIFIED -> Known.BANK_NOT_VERIFIED
                CARD_CLOSED -> Known.CARD_CLOSED
                CARD_PAUSED -> Known.CARD_PAUSED
                DECLINED -> Known.DECLINED
                FRAUD_ADVICE -> Known.FRAUD_ADVICE
                IGNORED_TTL_EXPIRY -> Known.IGNORED_TTL_EXPIRY
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

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DeclineResult && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val EXPIRED = of("EXPIRED")

            @JvmField val PENDING = of("PENDING")

            @JvmField val SETTLED = of("SETTLED")

            @JvmField val VOIDED = of("VOIDED")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class TokenInfo
    @JsonCreator
    private constructor(
        @JsonProperty("wallet_type")
        @ExcludeMissing
        private val walletType: JsonField<WalletType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The wallet_type field will indicate the source of the token. Possible token sources
         * include digital wallets (Apple, Google, or Samsung Pay), merchant tokenization, and
         * “other” sources like in-flight commerce. Masterpass is not currently supported and is
         * included for future use.
         */
        fun walletType(): WalletType = walletType.getRequired("wallet_type")

        /**
         * The wallet_type field will indicate the source of the token. Possible token sources
         * include digital wallets (Apple, Google, or Samsung Pay), merchant tokenization, and
         * “other” sources like in-flight commerce. Masterpass is not currently supported and is
         * included for future use.
         */
        @JsonProperty("wallet_type") @ExcludeMissing fun _walletType() = walletType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

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
                walletType = tokenInfo.walletType
                additionalProperties = tokenInfo.additionalProperties.toMutableMap()
            }

            /**
             * The wallet_type field will indicate the source of the token. Possible token sources
             * include digital wallets (Apple, Google, or Samsung Pay), merchant tokenization, and
             * “other” sources like in-flight commerce. Masterpass is not currently supported and is
             * included for future use.
             */
            fun walletType(walletType: WalletType) = walletType(JsonField.of(walletType))

            /**
             * The wallet_type field will indicate the source of the token. Possible token sources
             * include digital wallets (Apple, Google, or Samsung Pay), merchant tokenization, and
             * “other” sources like in-flight commerce. Masterpass is not currently supported and is
             * included for future use.
             */
            fun walletType(walletType: JsonField<WalletType>) = apply {
                this.walletType = walletType
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

            fun build(): TokenInfo = TokenInfo(walletType, additionalProperties.toImmutable())
        }

        class WalletType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val APPLE_PAY = of("APPLE_PAY")

                @JvmField val GOOGLE_PAY = of("GOOGLE_PAY")

                @JvmField val MASTERPASS = of("MASTERPASS")

                @JvmField val MERCHANT = of("MERCHANT")

                @JvmField val OTHER = of("OTHER")

                @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WalletType && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenInfo && walletType == other.walletType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(walletType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TokenInfo{walletType=$walletType, additionalProperties=$additionalProperties}"
    }

    @NoAutoDetect
    class TransactionEvent
    @JsonCreator
    private constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amounts")
        @ExcludeMissing
        private val amounts: JsonField<TransactionEventAmounts> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("network_info")
        @ExcludeMissing
        private val networkInfo: JsonField<NetworkInfo> = JsonMissing.of(),
        @JsonProperty("detailed_results")
        @ExcludeMissing
        private val detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of(),
        @JsonProperty("rule_results")
        @ExcludeMissing
        private val ruleResults: JsonField<List<RuleResult>> = JsonMissing.of(),
        @JsonProperty("effective_polarity")
        @ExcludeMissing
        private val effectivePolarity: JsonField<EffectivePolarity> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<DeclineResult> = JsonMissing.of(),
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Amount of the event in the settlement currency. */
        fun amount(): Long = amount.getRequired("amount")

        fun amounts(): TransactionEventAmounts = amounts.getRequired("amounts")

        /** RFC 3339 date and time this event entered the system. UTC time zone. */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * Information provided by the card network in each event. This includes common identifiers
         * shared between you, Lithic, the card network and in some cases the acquirer. These
         * identifiers often link together events within the same transaction lifecycle and can be
         * used to locate a particular transaction, such as during processing of disputes. Not all
         * fields are available in all events, and the presence of these fields is dependent on the
         * card network and the event type.
         */
        fun networkInfo(): Optional<NetworkInfo> =
            Optional.ofNullable(networkInfo.getNullable("network_info"))

        fun detailedResults(): List<DetailedResult> =
            detailedResults.getRequired("detailed_results")

        fun ruleResults(): List<RuleResult> = ruleResults.getRequired("rule_results")

        /** Indicates whether the transaction event is a credit or debit to the account. */
        fun effectivePolarity(): EffectivePolarity =
            effectivePolarity.getRequired("effective_polarity")

        fun result(): DeclineResult = result.getRequired("result")

        /** Transaction event identifier. */
        fun token(): String = token.getRequired("token")

        /** Type of transaction event */
        fun type(): Type = type.getRequired("type")

        /** Amount of the event in the settlement currency. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("amounts") @ExcludeMissing fun _amounts() = amounts

        /** RFC 3339 date and time this event entered the system. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /**
         * Information provided by the card network in each event. This includes common identifiers
         * shared between you, Lithic, the card network and in some cases the acquirer. These
         * identifiers often link together events within the same transaction lifecycle and can be
         * used to locate a particular transaction, such as during processing of disputes. Not all
         * fields are available in all events, and the presence of these fields is dependent on the
         * card network and the event type.
         */
        @JsonProperty("network_info") @ExcludeMissing fun _networkInfo() = networkInfo

        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        @JsonProperty("rule_results") @ExcludeMissing fun _ruleResults() = ruleResults

        /** Indicates whether the transaction event is a credit or debit to the account. */
        @JsonProperty("effective_polarity")
        @ExcludeMissing
        fun _effectivePolarity() = effectivePolarity

        @JsonProperty("result") @ExcludeMissing fun _result() = result

        /** Transaction event identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /** Type of transaction event */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TransactionEvent = apply {
            if (!validated) {
                amount()
                amounts().validate()
                created()
                networkInfo().map { it.validate() }
                detailedResults()
                ruleResults().forEach { it.validate() }
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
            private var networkInfo: JsonField<NetworkInfo> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of()
            private var ruleResults: JsonField<List<RuleResult>> = JsonMissing.of()
            private var effectivePolarity: JsonField<EffectivePolarity> = JsonMissing.of()
            private var result: JsonField<DeclineResult> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionEvent: TransactionEvent) = apply {
                amount = transactionEvent.amount
                amounts = transactionEvent.amounts
                created = transactionEvent.created
                networkInfo = transactionEvent.networkInfo
                detailedResults = transactionEvent.detailedResults
                ruleResults = transactionEvent.ruleResults
                effectivePolarity = transactionEvent.effectivePolarity
                result = transactionEvent.result
                token = transactionEvent.token
                type = transactionEvent.type
                additionalProperties = transactionEvent.additionalProperties.toMutableMap()
            }

            /** Amount of the event in the settlement currency. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount of the event in the settlement currency. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun amounts(amounts: TransactionEventAmounts) = amounts(JsonField.of(amounts))

            fun amounts(amounts: JsonField<TransactionEventAmounts>) = apply {
                this.amounts = amounts
            }

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * Information provided by the card network in each event. This includes common
             * identifiers shared between you, Lithic, the card network and in some cases the
             * acquirer. These identifiers often link together events within the same transaction
             * lifecycle and can be used to locate a particular transaction, such as during
             * processing of disputes. Not all fields are available in all events, and the presence
             * of these fields is dependent on the card network and the event type.
             */
            fun networkInfo(networkInfo: NetworkInfo) = networkInfo(JsonField.of(networkInfo))

            /**
             * Information provided by the card network in each event. This includes common
             * identifiers shared between you, Lithic, the card network and in some cases the
             * acquirer. These identifiers often link together events within the same transaction
             * lifecycle and can be used to locate a particular transaction, such as during
             * processing of disputes. Not all fields are available in all events, and the presence
             * of these fields is dependent on the card network and the event type.
             */
            fun networkInfo(networkInfo: JsonField<NetworkInfo>) = apply {
                this.networkInfo = networkInfo
            }

            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults
            }

            fun ruleResults(ruleResults: List<RuleResult>) = ruleResults(JsonField.of(ruleResults))

            fun ruleResults(ruleResults: JsonField<List<RuleResult>>) = apply {
                this.ruleResults = ruleResults
            }

            /** Indicates whether the transaction event is a credit or debit to the account. */
            fun effectivePolarity(effectivePolarity: EffectivePolarity) =
                effectivePolarity(JsonField.of(effectivePolarity))

            /** Indicates whether the transaction event is a credit or debit to the account. */
            fun effectivePolarity(effectivePolarity: JsonField<EffectivePolarity>) = apply {
                this.effectivePolarity = effectivePolarity
            }

            fun result(result: DeclineResult) = result(JsonField.of(result))

            fun result(result: JsonField<DeclineResult>) = apply { this.result = result }

            /** Transaction event identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /** Transaction event identifier. */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Type of transaction event */
            fun type(type: Type) = type(JsonField.of(type))

            /** Type of transaction event */
            fun type(type: JsonField<Type>) = apply { this.type = type }

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

            fun build(): TransactionEvent =
                TransactionEvent(
                    amount,
                    amounts,
                    created,
                    networkInfo,
                    detailedResults.map { it.toImmutable() },
                    ruleResults.map { it.toImmutable() },
                    effectivePolarity,
                    result,
                    token,
                    type,
                    additionalProperties.toImmutable(),
                )
        }

        @NoAutoDetect
        class TransactionEventAmounts
        @JsonCreator
        private constructor(
            @JsonProperty("cardholder")
            @ExcludeMissing
            private val cardholder: JsonField<Cardholder> = JsonMissing.of(),
            @JsonProperty("merchant")
            @ExcludeMissing
            private val merchant: JsonField<Merchant> = JsonMissing.of(),
            @JsonProperty("settlement")
            @ExcludeMissing
            private val settlement: JsonField<Settlement> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun cardholder(): Cardholder = cardholder.getRequired("cardholder")

            fun merchant(): Merchant = merchant.getRequired("merchant")

            fun settlement(): Optional<Settlement> =
                Optional.ofNullable(settlement.getNullable("settlement"))

            @JsonProperty("cardholder") @ExcludeMissing fun _cardholder() = cardholder

            @JsonProperty("merchant") @ExcludeMissing fun _merchant() = merchant

            @JsonProperty("settlement") @ExcludeMissing fun _settlement() = settlement

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

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

                private var cardholder: JsonField<Cardholder> = JsonMissing.of()
                private var merchant: JsonField<Merchant> = JsonMissing.of()
                private var settlement: JsonField<Settlement> = JsonMissing.of()
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

                fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                    this.cardholder = cardholder
                }

                fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

                fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

                fun settlement(settlement: Settlement) = settlement(JsonField.of(settlement))

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

                fun build(): TransactionEventAmounts =
                    TransactionEventAmounts(
                        cardholder,
                        merchant,
                        settlement,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Cardholder
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                private val conversionRate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                private val currency: JsonField<Currency> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Amount of the event in the cardholder billing currency. */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * Exchange rate used to convert the merchant amount to the cardholder billing
                 * amount.
                 */
                fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** Amount of the event in the cardholder billing currency. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * Exchange rate used to convert the merchant amount to the cardholder billing
                 * amount.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Cardholder = apply {
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
                    internal fun from(cardholder: Cardholder) = apply {
                        amount = cardholder.amount
                        conversionRate = cardholder.conversionRate
                        currency = cardholder.currency
                        additionalProperties = cardholder.additionalProperties.toMutableMap()
                    }

                    /** Amount of the event in the cardholder billing currency. */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /** Amount of the event in the cardholder billing currency. */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Exchange rate used to convert the merchant amount to the cardholder billing
                     * amount.
                     */
                    fun conversionRate(conversionRate: String) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * Exchange rate used to convert the merchant amount to the cardholder billing
                     * amount.
                     */
                    fun conversionRate(conversionRate: JsonField<String>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like `XXX`. Enumerants names are lowercase currency code
                     * e.g. `EUR`, `USD`.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like `XXX`. Enumerants names are lowercase currency code
                     * e.g. `EUR`, `USD`.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                    fun build(): Cardholder =
                        Cardholder(
                            amount,
                            conversionRate,
                            currency,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Cardholder && amount == other.amount && conversionRate == other.conversionRate && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, conversionRate, currency, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Cardholder{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Merchant
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                private val currency: JsonField<Currency> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Amount of the event in the merchant currency. */
                fun amount(): Long = amount.getRequired("amount")

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /** Amount of the event in the merchant currency. */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Merchant = apply {
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
                    internal fun from(merchant: Merchant) = apply {
                        amount = merchant.amount
                        currency = merchant.currency
                        additionalProperties = merchant.additionalProperties.toMutableMap()
                    }

                    /** Amount of the event in the merchant currency. */
                    fun amount(amount: Long) = amount(JsonField.of(amount))

                    /** Amount of the event in the merchant currency. */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like `XXX`. Enumerants names are lowercase currency code
                     * e.g. `EUR`, `USD`.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like `XXX`. Enumerants names are lowercase currency code
                     * e.g. `EUR`, `USD`.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                    fun build(): Merchant =
                        Merchant(
                            amount,
                            currency,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Merchant && amount == other.amount && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, currency, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Merchant{amount=$amount, currency=$currency, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Settlement
            @JsonCreator
            private constructor(
                @JsonProperty("amount")
                @ExcludeMissing
                private val amount: JsonField<Long> = JsonMissing.of(),
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                private val conversionRate: JsonField<String> = JsonMissing.of(),
                @JsonProperty("currency")
                @ExcludeMissing
                private val currency: JsonField<Currency> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Amount of the event, if it is financial, in the settlement currency.
                 * Non-financial events do not contain this amount because they do not move funds.
                 */
                fun amount(): Long = amount.getRequired("amount")

                /** Exchange rate used to convert the merchant amount to the settlement amount. */
                fun conversionRate(): String = conversionRate.getRequired("conversion_rate")

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                fun currency(): Currency = currency.getRequired("currency")

                /**
                 * Amount of the event, if it is financial, in the settlement currency.
                 * Non-financial events do not contain this amount because they do not move funds.
                 */
                @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

                /** Exchange rate used to convert the merchant amount to the settlement amount. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate() = conversionRate

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Settlement = apply {
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
                     * Amount of the event, if it is financial, in the settlement currency.
                     * Non-financial events do not contain this amount because they do not move
                     * funds.
                     */
                    fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                    /**
                     * Exchange rate used to convert the merchant amount to the settlement amount.
                     */
                    fun conversionRate(conversionRate: String) =
                        conversionRate(JsonField.of(conversionRate))

                    /**
                     * Exchange rate used to convert the merchant amount to the settlement amount.
                     */
                    fun conversionRate(conversionRate: JsonField<String>) = apply {
                        this.conversionRate = conversionRate
                    }

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like `XXX`. Enumerants names are lowercase currency code
                     * e.g. `EUR`, `USD`.
                     */
                    fun currency(currency: Currency) = currency(JsonField.of(currency))

                    /**
                     * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some
                     * special currencies like `XXX`. Enumerants names are lowercase currency code
                     * e.g. `EUR`, `USD`.
                     */
                    fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

                    fun build(): Settlement =
                        Settlement(
                            amount,
                            conversionRate,
                            currency,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Settlement && amount == other.amount && conversionRate == other.conversionRate && currency == other.currency && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(amount, conversionRate, currency, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Settlement{amount=$amount, conversionRate=$conversionRate, currency=$currency, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionEventAmounts && cardholder == other.cardholder && merchant == other.merchant && settlement == other.settlement && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(cardholder, merchant, settlement, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TransactionEventAmounts{cardholder=$cardholder, merchant=$merchant, settlement=$settlement, additionalProperties=$additionalProperties}"
        }

        class DetailedResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
                PIN_BLOCKED,
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
                PIN_BLOCKED,
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
                    PIN_BLOCKED -> Value.PIN_BLOCKED
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
                    PIN_BLOCKED -> Known.PIN_BLOCKED
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DetailedResult && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class EffectivePolarity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CREDIT = of("CREDIT")

                @JvmField val DEBIT = of("DEBIT")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is EffectivePolarity && value == other.value /* spotless:on */
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
         * card network and the event type.
         */
        @NoAutoDetect
        class NetworkInfo
        @JsonCreator
        private constructor(
            @JsonProperty("acquirer")
            @ExcludeMissing
            private val acquirer: JsonField<Acquirer> = JsonMissing.of(),
            @JsonProperty("mastercard")
            @ExcludeMissing
            private val mastercard: JsonField<Mastercard> = JsonMissing.of(),
            @JsonProperty("visa")
            @ExcludeMissing
            private val visa: JsonField<Visa> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            fun acquirer(): Optional<Acquirer> =
                Optional.ofNullable(acquirer.getNullable("acquirer"))

            fun mastercard(): Optional<Mastercard> =
                Optional.ofNullable(mastercard.getNullable("mastercard"))

            fun visa(): Optional<Visa> = Optional.ofNullable(visa.getNullable("visa"))

            @JsonProperty("acquirer") @ExcludeMissing fun _acquirer() = acquirer

            @JsonProperty("mastercard") @ExcludeMissing fun _mastercard() = mastercard

            @JsonProperty("visa") @ExcludeMissing fun _visa() = visa

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NetworkInfo = apply {
                if (!validated) {
                    acquirer().map { it.validate() }
                    mastercard().map { it.validate() }
                    visa().map { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var acquirer: JsonField<Acquirer> = JsonMissing.of()
                private var mastercard: JsonField<Mastercard> = JsonMissing.of()
                private var visa: JsonField<Visa> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(networkInfo: NetworkInfo) = apply {
                    acquirer = networkInfo.acquirer
                    mastercard = networkInfo.mastercard
                    visa = networkInfo.visa
                    additionalProperties = networkInfo.additionalProperties.toMutableMap()
                }

                fun acquirer(acquirer: Acquirer) = acquirer(JsonField.of(acquirer))

                fun acquirer(acquirer: JsonField<Acquirer>) = apply { this.acquirer = acquirer }

                fun mastercard(mastercard: Mastercard) = mastercard(JsonField.of(mastercard))

                fun mastercard(mastercard: JsonField<Mastercard>) = apply {
                    this.mastercard = mastercard
                }

                fun visa(visa: Visa) = visa(JsonField.of(visa))

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

                fun build(): NetworkInfo =
                    NetworkInfo(
                        acquirer,
                        mastercard,
                        visa,
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Acquirer
            @JsonCreator
            private constructor(
                @JsonProperty("acquirer_reference_number")
                @ExcludeMissing
                private val acquirerReferenceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                private val retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Identifier assigned by the acquirer, applicable to dual-message transactions
                 * only. The acquirer reference number (ARN) is only populated once a transaction
                 * has been cleared, and it is not available in all transactions (such as automated
                 * fuel dispenser transactions). A single transaction can contain multiple ARNs if
                 * the merchant sends multiple clearings.
                 */
                fun acquirerReferenceNumber(): Optional<String> =
                    Optional.ofNullable(
                        acquirerReferenceNumber.getNullable("acquirer_reference_number")
                    )

                /** Identifier assigned by the acquirer. */
                fun retrievalReferenceNumber(): Optional<String> =
                    Optional.ofNullable(
                        retrievalReferenceNumber.getNullable("retrieval_reference_number")
                    )

                /**
                 * Identifier assigned by the acquirer, applicable to dual-message transactions
                 * only. The acquirer reference number (ARN) is only populated once a transaction
                 * has been cleared, and it is not available in all transactions (such as automated
                 * fuel dispenser transactions). A single transaction can contain multiple ARNs if
                 * the merchant sends multiple clearings.
                 */
                @JsonProperty("acquirer_reference_number")
                @ExcludeMissing
                fun _acquirerReferenceNumber() = acquirerReferenceNumber

                /** Identifier assigned by the acquirer. */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber() = retrievalReferenceNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Acquirer = apply {
                    if (!validated) {
                        acquirerReferenceNumber()
                        retrievalReferenceNumber()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var acquirerReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var retrievalReferenceNumber: JsonField<String> = JsonMissing.of()
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
                    fun acquirerReferenceNumber(acquirerReferenceNumber: String) =
                        acquirerReferenceNumber(JsonField.of(acquirerReferenceNumber))

                    /**
                     * Identifier assigned by the acquirer, applicable to dual-message transactions
                     * only. The acquirer reference number (ARN) is only populated once a
                     * transaction has been cleared, and it is not available in all transactions
                     * (such as automated fuel dispenser transactions). A single transaction can
                     * contain multiple ARNs if the merchant sends multiple clearings.
                     */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: JsonField<String>) =
                        apply {
                            this.acquirerReferenceNumber = acquirerReferenceNumber
                        }

                    /** Identifier assigned by the acquirer. */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: String) =
                        retrievalReferenceNumber(JsonField.of(retrievalReferenceNumber))

                    /** Identifier assigned by the acquirer. */
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

                    fun build(): Acquirer =
                        Acquirer(
                            acquirerReferenceNumber,
                            retrievalReferenceNumber,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Acquirer && acquirerReferenceNumber == other.acquirerReferenceNumber && retrievalReferenceNumber == other.retrievalReferenceNumber && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(acquirerReferenceNumber, retrievalReferenceNumber, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Acquirer{acquirerReferenceNumber=$acquirerReferenceNumber, retrievalReferenceNumber=$retrievalReferenceNumber, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Mastercard
            @JsonCreator
            private constructor(
                @JsonProperty("banknet_reference_number")
                @ExcludeMissing
                private val banknetReferenceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("switch_serial_number")
                @ExcludeMissing
                private val switchSerialNumber: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Identifier assigned by Mastercard. */
                fun banknetReferenceNumber(): Optional<String> =
                    Optional.ofNullable(
                        banknetReferenceNumber.getNullable("banknet_reference_number")
                    )

                /**
                 * Identifier assigned by Mastercard, applicable to single-message transactions
                 * only.
                 */
                fun switchSerialNumber(): Optional<String> =
                    Optional.ofNullable(switchSerialNumber.getNullable("switch_serial_number"))

                /** Identifier assigned by Mastercard. */
                @JsonProperty("banknet_reference_number")
                @ExcludeMissing
                fun _banknetReferenceNumber() = banknetReferenceNumber

                /**
                 * Identifier assigned by Mastercard, applicable to single-message transactions
                 * only.
                 */
                @JsonProperty("switch_serial_number")
                @ExcludeMissing
                fun _switchSerialNumber() = switchSerialNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Mastercard = apply {
                    if (!validated) {
                        banknetReferenceNumber()
                        switchSerialNumber()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var banknetReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var switchSerialNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(mastercard: Mastercard) = apply {
                        banknetReferenceNumber = mastercard.banknetReferenceNumber
                        switchSerialNumber = mastercard.switchSerialNumber
                        additionalProperties = mastercard.additionalProperties.toMutableMap()
                    }

                    /** Identifier assigned by Mastercard. */
                    fun banknetReferenceNumber(banknetReferenceNumber: String) =
                        banknetReferenceNumber(JsonField.of(banknetReferenceNumber))

                    /** Identifier assigned by Mastercard. */
                    fun banknetReferenceNumber(banknetReferenceNumber: JsonField<String>) = apply {
                        this.banknetReferenceNumber = banknetReferenceNumber
                    }

                    /**
                     * Identifier assigned by Mastercard, applicable to single-message transactions
                     * only.
                     */
                    fun switchSerialNumber(switchSerialNumber: String) =
                        switchSerialNumber(JsonField.of(switchSerialNumber))

                    /**
                     * Identifier assigned by Mastercard, applicable to single-message transactions
                     * only.
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

                    fun build(): Mastercard =
                        Mastercard(
                            banknetReferenceNumber,
                            switchSerialNumber,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Mastercard && banknetReferenceNumber == other.banknetReferenceNumber && switchSerialNumber == other.switchSerialNumber && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(banknetReferenceNumber, switchSerialNumber, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Mastercard{banknetReferenceNumber=$banknetReferenceNumber, switchSerialNumber=$switchSerialNumber, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Visa
            @JsonCreator
            private constructor(
                @JsonProperty("transaction_id")
                @ExcludeMissing
                private val transactionId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Identifier assigned by Visa. */
                fun transactionId(): Optional<String> =
                    Optional.ofNullable(transactionId.getNullable("transaction_id"))

                /** Identifier assigned by Visa. */
                @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Visa = apply {
                    if (!validated) {
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                class Builder {

                    private var transactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(visa: Visa) = apply {
                        transactionId = visa.transactionId
                        additionalProperties = visa.additionalProperties.toMutableMap()
                    }

                    /** Identifier assigned by Visa. */
                    fun transactionId(transactionId: String) =
                        transactionId(JsonField.of(transactionId))

                    /** Identifier assigned by Visa. */
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

                    fun build(): Visa = Visa(transactionId, additionalProperties.toImmutable())
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Visa && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(transactionId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Visa{transactionId=$transactionId, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is NetworkInfo && acquirer == other.acquirer && mastercard == other.mastercard && visa == other.visa && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(acquirer, mastercard, visa, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "NetworkInfo{acquirer=$acquirer, mastercard=$mastercard, visa=$visa, additionalProperties=$additionalProperties}"
        }

        class DeclineResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val ACCOUNT_STATE_TRANSACTION_FAIL = of("ACCOUNT_STATE_TRANSACTION_FAIL")

                @JvmField val APPROVED = of("APPROVED")

                @JvmField val BANK_CONNECTION_ERROR = of("BANK_CONNECTION_ERROR")

                @JvmField val BANK_NOT_VERIFIED = of("BANK_NOT_VERIFIED")

                @JvmField val CARD_CLOSED = of("CARD_CLOSED")

                @JvmField val CARD_PAUSED = of("CARD_PAUSED")

                @JvmField val DECLINED = of("DECLINED")

                @JvmField val FRAUD_ADVICE = of("FRAUD_ADVICE")

                @JvmField val IGNORED_TTL_EXPIRY = of("IGNORED_TTL_EXPIRY")

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

            enum class Known {
                ACCOUNT_STATE_TRANSACTION_FAIL,
                APPROVED,
                BANK_CONNECTION_ERROR,
                BANK_NOT_VERIFIED,
                CARD_CLOSED,
                CARD_PAUSED,
                DECLINED,
                FRAUD_ADVICE,
                IGNORED_TTL_EXPIRY,
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

            enum class Value {
                ACCOUNT_STATE_TRANSACTION_FAIL,
                APPROVED,
                BANK_CONNECTION_ERROR,
                BANK_NOT_VERIFIED,
                CARD_CLOSED,
                CARD_PAUSED,
                DECLINED,
                FRAUD_ADVICE,
                IGNORED_TTL_EXPIRY,
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
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_STATE_TRANSACTION_FAIL -> Value.ACCOUNT_STATE_TRANSACTION_FAIL
                    APPROVED -> Value.APPROVED
                    BANK_CONNECTION_ERROR -> Value.BANK_CONNECTION_ERROR
                    BANK_NOT_VERIFIED -> Value.BANK_NOT_VERIFIED
                    CARD_CLOSED -> Value.CARD_CLOSED
                    CARD_PAUSED -> Value.CARD_PAUSED
                    DECLINED -> Value.DECLINED
                    FRAUD_ADVICE -> Value.FRAUD_ADVICE
                    IGNORED_TTL_EXPIRY -> Value.IGNORED_TTL_EXPIRY
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

            fun known(): Known =
                when (this) {
                    ACCOUNT_STATE_TRANSACTION_FAIL -> Known.ACCOUNT_STATE_TRANSACTION_FAIL
                    APPROVED -> Known.APPROVED
                    BANK_CONNECTION_ERROR -> Known.BANK_CONNECTION_ERROR
                    BANK_NOT_VERIFIED -> Known.BANK_NOT_VERIFIED
                    CARD_CLOSED -> Known.CARD_CLOSED
                    CARD_PAUSED -> Known.CARD_PAUSED
                    DECLINED -> Known.DECLINED
                    FRAUD_ADVICE -> Known.FRAUD_ADVICE
                    IGNORED_TTL_EXPIRY -> Known.IGNORED_TTL_EXPIRY
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

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DeclineResult && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        @NoAutoDetect
        class RuleResult
        @JsonCreator
        private constructor(
            @JsonProperty("auth_rule_token")
            @ExcludeMissing
            private val authRuleToken: JsonField<String> = JsonMissing.of(),
            @JsonProperty("result")
            @ExcludeMissing
            private val result: JsonField<DetailedResult> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("explanation")
            @ExcludeMissing
            private val explanation: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The Auth Rule Token associated with the rule from which the decline originated. If
             * this is set to null, then the decline was not associated with a customer-configured
             * Auth Rule. This may happen in cases where a transaction is declined due to a
             * Lithic-configured security or compliance rule, for example.
             */
            fun authRuleToken(): Optional<String> =
                Optional.ofNullable(authRuleToken.getNullable("auth_rule_token"))

            /** The detailed_result associated with this rule's decline. */
            fun result(): DetailedResult = result.getRequired("result")

            /** The name for the rule, if any was configured. */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** A human-readable explanation outlining the motivation for the rule's decline. */
            fun explanation(): Optional<String> =
                Optional.ofNullable(explanation.getNullable("explanation"))

            /**
             * The Auth Rule Token associated with the rule from which the decline originated. If
             * this is set to null, then the decline was not associated with a customer-configured
             * Auth Rule. This may happen in cases where a transaction is declined due to a
             * Lithic-configured security or compliance rule, for example.
             */
            @JsonProperty("auth_rule_token") @ExcludeMissing fun _authRuleToken() = authRuleToken

            /** The detailed_result associated with this rule's decline. */
            @JsonProperty("result") @ExcludeMissing fun _result() = result

            /** The name for the rule, if any was configured. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            /** A human-readable explanation outlining the motivation for the rule's decline. */
            @JsonProperty("explanation") @ExcludeMissing fun _explanation() = explanation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RuleResult = apply {
                if (!validated) {
                    authRuleToken()
                    result()
                    name()
                    explanation()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            class Builder {

                private var authRuleToken: JsonField<String> = JsonMissing.of()
                private var result: JsonField<DetailedResult> = JsonMissing.of()
                private var name: JsonField<String> = JsonMissing.of()
                private var explanation: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(ruleResult: RuleResult) = apply {
                    authRuleToken = ruleResult.authRuleToken
                    result = ruleResult.result
                    name = ruleResult.name
                    explanation = ruleResult.explanation
                    additionalProperties = ruleResult.additionalProperties.toMutableMap()
                }

                /**
                 * The Auth Rule Token associated with the rule from which the decline originated.
                 * If this is set to null, then the decline was not associated with a
                 * customer-configured Auth Rule. This may happen in cases where a transaction is
                 * declined due to a Lithic-configured security or compliance rule, for example.
                 */
                fun authRuleToken(authRuleToken: String) =
                    authRuleToken(JsonField.of(authRuleToken))

                /**
                 * The Auth Rule Token associated with the rule from which the decline originated.
                 * If this is set to null, then the decline was not associated with a
                 * customer-configured Auth Rule. This may happen in cases where a transaction is
                 * declined due to a Lithic-configured security or compliance rule, for example.
                 */
                fun authRuleToken(authRuleToken: JsonField<String>) = apply {
                    this.authRuleToken = authRuleToken
                }

                /** The detailed_result associated with this rule's decline. */
                fun result(result: DetailedResult) = result(JsonField.of(result))

                /** The detailed_result associated with this rule's decline. */
                fun result(result: JsonField<DetailedResult>) = apply { this.result = result }

                /** The name for the rule, if any was configured. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name for the rule, if any was configured. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** A human-readable explanation outlining the motivation for the rule's decline. */
                fun explanation(explanation: String) = explanation(JsonField.of(explanation))

                /** A human-readable explanation outlining the motivation for the rule's decline. */
                fun explanation(explanation: JsonField<String>) = apply {
                    this.explanation = explanation
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

                fun build(): RuleResult =
                    RuleResult(
                        authRuleToken,
                        result,
                        name,
                        explanation,
                        additionalProperties.toImmutable(),
                    )
            }

            class DetailedResult
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
                    PIN_BLOCKED,
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
                    PIN_BLOCKED,
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
                        ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED ->
                            Value.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
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
                        ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED ->
                            Known.ACCOUNT_DAILY_SPEND_LIMIT_EXCEEDED
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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is DetailedResult && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RuleResult && authRuleToken == other.authRuleToken && result == other.result && name == other.name && explanation == other.explanation && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authRuleToken, result, name, explanation, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuleResult{authRuleToken=$authRuleToken, result=$result, name=$name, explanation=$explanation, additionalProperties=$additionalProperties}"
        }

        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
                    else -> throw LithicInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Type && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionEvent && amount == other.amount && amounts == other.amounts && created == other.created && networkInfo == other.networkInfo && detailedResults == other.detailedResults && ruleResults == other.ruleResults && effectivePolarity == other.effectivePolarity && result == other.result && token == other.token && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, amounts, created, networkInfo, detailedResults, ruleResults, effectivePolarity, result, token, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionEvent{amount=$amount, amounts=$amounts, created=$created, networkInfo=$networkInfo, detailedResults=$detailedResults, ruleResults=$ruleResults, effectivePolarity=$effectivePolarity, result=$result, token=$token, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Transaction && acquirerFee == other.acquirerFee && acquirerReferenceNumber == other.acquirerReferenceNumber && accountToken == other.accountToken && amount == other.amount && amounts == other.amounts && authorizationAmount == other.authorizationAmount && authorizationCode == other.authorizationCode && avs == other.avs && cardToken == other.cardToken && cardholderAuthentication == other.cardholderAuthentication && created == other.created && events == other.events && merchant == other.merchant && merchantAmount == other.merchantAmount && merchantAuthorizationAmount == other.merchantAuthorizationAmount && merchantCurrency == other.merchantCurrency && network == other.network && networkRiskScore == other.networkRiskScore && result == other.result && pos == other.pos && settledAmount == other.settledAmount && status == other.status && token == other.token && tokenInfo == other.tokenInfo && updated == other.updated && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(acquirerFee, acquirerReferenceNumber, accountToken, amount, amounts, authorizationAmount, authorizationCode, avs, cardToken, cardholderAuthentication, created, events, merchant, merchantAmount, merchantAuthorizationAmount, merchantCurrency, network, networkRiskScore, result, pos, settledAmount, status, token, tokenInfo, updated, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Transaction{acquirerFee=$acquirerFee, acquirerReferenceNumber=$acquirerReferenceNumber, accountToken=$accountToken, amount=$amount, amounts=$amounts, authorizationAmount=$authorizationAmount, authorizationCode=$authorizationCode, avs=$avs, cardToken=$cardToken, cardholderAuthentication=$cardholderAuthentication, created=$created, events=$events, merchant=$merchant, merchantAmount=$merchantAmount, merchantAuthorizationAmount=$merchantAuthorizationAmount, merchantCurrency=$merchantCurrency, network=$network, networkRiskScore=$networkRiskScore, result=$result, pos=$pos, settledAmount=$settledAmount, status=$status, token=$token, tokenInfo=$tokenInfo, updated=$updated, additionalProperties=$additionalProperties}"
}
