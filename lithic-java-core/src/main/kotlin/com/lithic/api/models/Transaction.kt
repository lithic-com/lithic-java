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
import com.lithic.api.core.checkRequired
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
    @JsonProperty("token") @ExcludeMissing private val token: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_token")
    @ExcludeMissing
    private val accountToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("acquirer_fee")
    @ExcludeMissing
    private val acquirerFee: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("acquirer_reference_number")
    @ExcludeMissing
    private val acquirerReferenceNumber: JsonField<String> = JsonMissing.of(),
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
    @JsonProperty("pos") @ExcludeMissing private val pos: JsonField<Pos> = JsonMissing.of(),
    @JsonProperty("result")
    @ExcludeMissing
    private val result: JsonField<DeclineResult> = JsonMissing.of(),
    @JsonProperty("settled_amount")
    @ExcludeMissing
    private val settledAmount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("token_info")
    @ExcludeMissing
    private val tokenInfo: JsonField<TokenInfo> = JsonMissing.of(),
    @JsonProperty("updated")
    @ExcludeMissing
    private val updated: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("events")
    @ExcludeMissing
    private val events: JsonField<List<TransactionEvent>> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

    /** The token for the account associated with this transaction. */
    fun accountToken(): String = accountToken.getRequired("account_token")

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
    @Deprecated("deprecated")
    fun acquirerReferenceNumber(): Optional<String> =
        Optional.ofNullable(acquirerReferenceNumber.getNullable("acquirer_reference_number"))

    /**
     * When the transaction is pending, this represents the authorization amount of the transaction
     * in the anticipated settlement currency. Once the transaction has settled, this field
     * represents the settled amount in the settlement currency.
     */
    @Deprecated("deprecated") fun amount(): Long = amount.getRequired("amount")

    fun amounts(): TransactionAmounts = amounts.getRequired("amounts")

    /** The authorization amount of the transaction in the anticipated settlement currency. */
    @Deprecated("deprecated")
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

    fun merchant(): Merchant = merchant.getRequired("merchant")

    /** Analogous to the 'amount', but in the merchant currency. */
    @Deprecated("deprecated")
    fun merchantAmount(): Optional<Long> =
        Optional.ofNullable(merchantAmount.getNullable("merchant_amount"))

    /** Analogous to the 'authorization_amount', but in the merchant currency. */
    @Deprecated("deprecated")
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

    fun pos(): Pos = pos.getRequired("pos")

    fun result(): DeclineResult = result.getRequired("result")

    /** The settled amount of the transaction in the settlement currency. */
    @Deprecated("deprecated")
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /** Status of the transaction. */
    fun status(): Status = status.getRequired("status")

    fun tokenInfo(): Optional<TokenInfo> = Optional.ofNullable(tokenInfo.getNullable("token_info"))

    /** Date and time when the transaction last updated. UTC time zone. */
    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun events(): Optional<List<TransactionEvent>> =
        Optional.ofNullable(events.getNullable("events"))

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /** The token for the account associated with this transaction. */
    @JsonProperty("account_token")
    @ExcludeMissing
    fun _accountToken(): JsonField<String> = accountToken

    /**
     * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
     * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative value
     * to indicate credited fees.
     */
    @JsonProperty("acquirer_fee") @ExcludeMissing fun _acquirerFee(): JsonField<Long> = acquirerFee

    /**
     * Unique identifier assigned to a transaction by the acquirer that can be used in dispute and
     * chargeback filing.
     */
    @Deprecated("deprecated")
    @JsonProperty("acquirer_reference_number")
    @ExcludeMissing
    fun _acquirerReferenceNumber(): JsonField<String> = acquirerReferenceNumber

    /**
     * When the transaction is pending, this represents the authorization amount of the transaction
     * in the anticipated settlement currency. Once the transaction has settled, this field
     * represents the settled amount in the settlement currency.
     */
    @Deprecated("deprecated")
    @JsonProperty("amount")
    @ExcludeMissing
    fun _amount(): JsonField<Long> = amount

    @JsonProperty("amounts") @ExcludeMissing fun _amounts(): JsonField<TransactionAmounts> = amounts

    /** The authorization amount of the transaction in the anticipated settlement currency. */
    @Deprecated("deprecated")
    @JsonProperty("authorization_amount")
    @ExcludeMissing
    fun _authorizationAmount(): JsonField<Long> = authorizationAmount

    /**
     * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
     * networks.
     */
    @JsonProperty("authorization_code")
    @ExcludeMissing
    fun _authorizationCode(): JsonField<String> = authorizationCode

    @JsonProperty("avs") @ExcludeMissing fun _avs(): JsonField<Avs> = avs

    /** Token for the card used in this transaction. */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken(): JsonField<String> = cardToken

    @JsonProperty("cardholder_authentication")
    @ExcludeMissing
    fun _cardholderAuthentication(): JsonField<CardholderAuthentication> = cardholderAuthentication

    /** Date and time when the transaction first occurred. UTC time zone. */
    @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

    @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

    /** Analogous to the 'amount', but in the merchant currency. */
    @Deprecated("deprecated")
    @JsonProperty("merchant_amount")
    @ExcludeMissing
    fun _merchantAmount(): JsonField<Long> = merchantAmount

    /** Analogous to the 'authorization_amount', but in the merchant currency. */
    @Deprecated("deprecated")
    @JsonProperty("merchant_authorization_amount")
    @ExcludeMissing
    fun _merchantAuthorizationAmount(): JsonField<Long> = merchantAuthorizationAmount

    /** 3-digit alphabetic ISO 4217 code for the local currency of the transaction. */
    @JsonProperty("merchant_currency")
    @ExcludeMissing
    fun _merchantCurrency(): JsonField<String> = merchantCurrency

    /**
     * Card network of the authorization. Can be `INTERLINK`, `MAESTRO`, `MASTERCARD`, `VISA`, or
     * `UNKNOWN`. Value is `UNKNOWN` when Lithic cannot determine the network code from the upstream
     * provider.
     */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * Network-provided score assessing risk level associated with a given authorization. Scores are
     * on a range of 0-999, with 0 representing the lowest risk and 999 representing the highest
     * risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will normalize
     * the score by multiplying the raw score by 10x.
     */
    @JsonProperty("network_risk_score")
    @ExcludeMissing
    fun _networkRiskScore(): JsonField<Long> = networkRiskScore

    @JsonProperty("pos") @ExcludeMissing fun _pos(): JsonField<Pos> = pos

    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<DeclineResult> = result

    /** The settled amount of the transaction in the settlement currency. */
    @Deprecated("deprecated")
    @JsonProperty("settled_amount")
    @ExcludeMissing
    fun _settledAmount(): JsonField<Long> = settledAmount

    /** Status of the transaction. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    @JsonProperty("token_info") @ExcludeMissing fun _tokenInfo(): JsonField<TokenInfo> = tokenInfo

    /** Date and time when the transaction last updated. UTC time zone. */
    @JsonProperty("updated") @ExcludeMissing fun _updated(): JsonField<OffsetDateTime> = updated

    @JsonProperty("events")
    @ExcludeMissing
    fun _events(): JsonField<List<TransactionEvent>> = events

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
        merchant().validate()
        merchantAmount()
        merchantAuthorizationAmount()
        merchantCurrency()
        network()
        networkRiskScore()
        pos().validate()
        result()
        settledAmount()
        status()
        tokenInfo().ifPresent { it.validate() }
        updated()
        events().ifPresent { it.forEach { it.validate() } }
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

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

        /** Globally unique identifier. */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** The token for the account associated with this transaction. */
        fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

        /** The token for the account associated with this transaction. */
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
         * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
         * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative
         * value to indicate credited fees.
         */
        fun acquirerFee(acquirerFee: Long) = acquirerFee(acquirerFee as Long?)

        /**
         * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
         * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative
         * value to indicate credited fees.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun acquirerFee(acquirerFee: Optional<Long>) =
            acquirerFee(acquirerFee.orElse(null) as Long?)

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
        @Deprecated("deprecated")
        fun acquirerReferenceNumber(acquirerReferenceNumber: String?) =
            acquirerReferenceNumber(JsonField.ofNullable(acquirerReferenceNumber))

        /**
         * Unique identifier assigned to a transaction by the acquirer that can be used in dispute
         * and chargeback filing.
         */
        @Deprecated("deprecated")
        fun acquirerReferenceNumber(acquirerReferenceNumber: Optional<String>) =
            acquirerReferenceNumber(acquirerReferenceNumber.orElse(null))

        /**
         * Unique identifier assigned to a transaction by the acquirer that can be used in dispute
         * and chargeback filing.
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
         * When the transaction is pending, this represents the authorization amount of the
         * transaction in the anticipated settlement currency. Once the transaction has settled,
         * this field represents the settled amount in the settlement currency.
         */
        @Deprecated("deprecated")
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        fun amounts(amounts: TransactionAmounts) = amounts(JsonField.of(amounts))

        fun amounts(amounts: JsonField<TransactionAmounts>) = apply { this.amounts = amounts }

        /** The authorization amount of the transaction in the anticipated settlement currency. */
        @Deprecated("deprecated")
        fun authorizationAmount(authorizationAmount: Long?) =
            authorizationAmount(JsonField.ofNullable(authorizationAmount))

        /** The authorization amount of the transaction in the anticipated settlement currency. */
        @Deprecated("deprecated")
        fun authorizationAmount(authorizationAmount: Long) =
            authorizationAmount(authorizationAmount as Long?)

        /** The authorization amount of the transaction in the anticipated settlement currency. */
        @Deprecated("deprecated")
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun authorizationAmount(authorizationAmount: Optional<Long>) =
            authorizationAmount(authorizationAmount.orElse(null) as Long?)

        /** The authorization amount of the transaction in the anticipated settlement currency. */
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

        /**
         * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
         * networks.
         */
        fun authorizationCode(authorizationCode: Optional<String>) =
            authorizationCode(authorizationCode.orElse(null))

        /**
         * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
         * networks.
         */
        fun authorizationCode(authorizationCode: JsonField<String>) = apply {
            this.authorizationCode = authorizationCode
        }

        fun avs(avs: Avs?) = avs(JsonField.ofNullable(avs))

        fun avs(avs: Optional<Avs>) = avs(avs.orElse(null))

        fun avs(avs: JsonField<Avs>) = apply { this.avs = avs }

        /** Token for the card used in this transaction. */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /** Token for the card used in this transaction. */
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        fun cardholderAuthentication(cardholderAuthentication: CardholderAuthentication?) =
            cardholderAuthentication(JsonField.ofNullable(cardholderAuthentication))

        fun cardholderAuthentication(cardholderAuthentication: Optional<CardholderAuthentication>) =
            cardholderAuthentication(cardholderAuthentication.orElse(null))

        fun cardholderAuthentication(
            cardholderAuthentication: JsonField<CardholderAuthentication>
        ) = apply { this.cardholderAuthentication = cardholderAuthentication }

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Date and time when the transaction first occurred. UTC time zone. */
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

        fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

        /** Analogous to the 'amount', but in the merchant currency. */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: Long?) =
            merchantAmount(JsonField.ofNullable(merchantAmount))

        /** Analogous to the 'amount', but in the merchant currency. */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: Long) = merchantAmount(merchantAmount as Long?)

        /** Analogous to the 'amount', but in the merchant currency. */
        @Deprecated("deprecated")
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun merchantAmount(merchantAmount: Optional<Long>) =
            merchantAmount(merchantAmount.orElse(null) as Long?)

        /** Analogous to the 'amount', but in the merchant currency. */
        @Deprecated("deprecated")
        fun merchantAmount(merchantAmount: JsonField<Long>) = apply {
            this.merchantAmount = merchantAmount
        }

        /** Analogous to the 'authorization_amount', but in the merchant currency. */
        @Deprecated("deprecated")
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: Long?) =
            merchantAuthorizationAmount(JsonField.ofNullable(merchantAuthorizationAmount))

        /** Analogous to the 'authorization_amount', but in the merchant currency. */
        @Deprecated("deprecated")
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: Long) =
            merchantAuthorizationAmount(merchantAuthorizationAmount as Long?)

        /** Analogous to the 'authorization_amount', but in the merchant currency. */
        @Deprecated("deprecated")
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun merchantAuthorizationAmount(merchantAuthorizationAmount: Optional<Long>) =
            merchantAuthorizationAmount(merchantAuthorizationAmount.orElse(null) as Long?)

        /** Analogous to the 'authorization_amount', but in the merchant currency. */
        @Deprecated("deprecated")
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
        fun network(network: Network?) = network(JsonField.ofNullable(network))

        /**
         * Card network of the authorization. Can be `INTERLINK`, `MAESTRO`, `MASTERCARD`, `VISA`,
         * or `UNKNOWN`. Value is `UNKNOWN` when Lithic cannot determine the network code from the
         * upstream provider.
         */
        fun network(network: Optional<Network>) = network(network.orElse(null))

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
        fun networkRiskScore(networkRiskScore: Long?) =
            networkRiskScore(JsonField.ofNullable(networkRiskScore))

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         */
        fun networkRiskScore(networkRiskScore: Long) = networkRiskScore(networkRiskScore as Long?)

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         */
        @Suppress("USELESS_CAST") // See https://youtrack.jetbrains.com/issue/KT-74228
        fun networkRiskScore(networkRiskScore: Optional<Long>) =
            networkRiskScore(networkRiskScore.orElse(null) as Long?)

        /**
         * Network-provided score assessing risk level associated with a given authorization. Scores
         * are on a range of 0-999, with 0 representing the lowest risk and 999 representing the
         * highest risk. For Visa transactions, where the raw score has a range of 0-99, Lithic will
         * normalize the score by multiplying the raw score by 10x.
         */
        fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
            this.networkRiskScore = networkRiskScore
        }

        fun pos(pos: Pos) = pos(JsonField.of(pos))

        fun pos(pos: JsonField<Pos>) = apply { this.pos = pos }

        fun result(result: DeclineResult) = result(JsonField.of(result))

        fun result(result: JsonField<DeclineResult>) = apply { this.result = result }

        /** The settled amount of the transaction in the settlement currency. */
        @Deprecated("deprecated")
        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        /** The settled amount of the transaction in the settlement currency. */
        @Deprecated("deprecated")
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        /** Status of the transaction. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Status of the transaction. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        fun tokenInfo(tokenInfo: TokenInfo?) = tokenInfo(JsonField.ofNullable(tokenInfo))

        fun tokenInfo(tokenInfo: Optional<TokenInfo>) = tokenInfo(tokenInfo.orElse(null))

        fun tokenInfo(tokenInfo: JsonField<TokenInfo>) = apply { this.tokenInfo = tokenInfo }

        /** Date and time when the transaction last updated. UTC time zone. */
        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        /** Date and time when the transaction last updated. UTC time zone. */
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun events(events: List<TransactionEvent>) = events(JsonField.of(events))

        fun events(events: JsonField<List<TransactionEvent>>) = apply {
            this.events = events.map { it.toMutableList() }
        }

        fun addEvent(event: TransactionEvent) = apply {
            events =
                (events ?: JsonField.of(mutableListOf())).apply {
                    asKnown()
                        .orElseThrow {
                            IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            )
                        }
                        .add(event)
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

        @JsonProperty("cardholder")
        @ExcludeMissing
        fun _cardholder(): JsonField<Cardholder> = cardholder

        @JsonProperty("hold") @ExcludeMissing fun _hold(): JsonField<Hold> = hold

        @JsonProperty("merchant") @ExcludeMissing fun _merchant(): JsonField<Merchant> = merchant

        @JsonProperty("settlement")
        @ExcludeMissing
        fun _settlement(): JsonField<Settlement> = settlement

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

        fun toBuilder() = Builder().from(this)

        companion object {

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
                    checkRequired("cardholder", cardholder),
                    checkRequired("hold", hold),
                    checkRequired("merchant", merchant),
                    checkRequired("settlement", settlement),
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
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * The exchange rate used to convert the merchant amount to the cardholder billing
             * amount.
             */
            @JsonProperty("conversion_rate")
            @ExcludeMissing
            fun _conversionRate(): JsonField<String> = conversionRate

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Cardholder]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var conversionRate: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
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
                        checkRequired("amount", amount),
                        checkRequired("conversionRate", conversionRate),
                        checkRequired("currency", currency),
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
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Hold = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Hold]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<Currency>? = null
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
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
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
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Merchant = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Merchant]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<Currency>? = null
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
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
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
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
             * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
             * `USD`.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Settlement = apply {
                if (validated) {
                    return@apply
                }

                amount()
                currency()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [Settlement]. */
            class Builder internal constructor() {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<Currency>? = null
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
                        checkRequired("amount", amount),
                        checkRequired("currency", currency),
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
        @JsonProperty("address") @ExcludeMissing fun _address(): JsonField<String> = address

        /** Cardholder ZIP code */
        @JsonProperty("zipcode") @ExcludeMissing fun _zipcode(): JsonField<String> = zipcode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Avs = apply {
            if (validated) {
                return@apply
            }

            address()
            zipcode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
                    checkRequired("address", address),
                    checkRequired("zipcode", zipcode),
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
        @JsonProperty("3ds_version")
        @ExcludeMissing
        fun __3dsVersion(): JsonField<String> = _3dsVersion

        /** Whether an acquirer exemption applied to the transaction. */
        @JsonProperty("acquirer_exemption")
        @ExcludeMissing
        fun _acquirerExemption(): JsonField<AcquirerExemption> = acquirerExemption

        /** Indicates what the outcome of the 3DS authentication process is. */
        @JsonProperty("authentication_result")
        @ExcludeMissing
        fun _authenticationResult(): JsonField<AuthenticationResult> = authenticationResult

        /** Indicates which party made the 3DS authentication decision. */
        @JsonProperty("decision_made_by")
        @ExcludeMissing
        fun _decisionMadeBy(): JsonField<DecisionMadeBy> = decisionMadeBy

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
        @JsonProperty("liability_shift")
        @ExcludeMissing
        fun _liabilityShift(): JsonField<LiabilityShift> = liabilityShift

        /**
         * Unique identifier you can use to match a given 3DS authentication (available via the
         * three_ds_authentication.created event webhook) and the transaction. Note that in cases
         * where liability shift does not occur, this token is matched to the transaction on a
         * best-effort basis.
         */
        @JsonProperty("three_ds_authentication_token")
        @ExcludeMissing
        fun _threeDSAuthenticationToken(): JsonField<String> = threeDSAuthenticationToken

        /**
         * Indicates whether a 3DS challenge flow was used, and if so, what the verification method
         * was. (deprecated, use `authentication_result`)
         */
        @JsonProperty("verification_attempted")
        @ExcludeMissing
        fun _verificationAttempted(): JsonField<VerificationAttempted> = verificationAttempted

        /**
         * Indicates whether a transaction is considered 3DS authenticated. (deprecated, use
         * `authentication_result`)
         */
        @JsonProperty("verification_result")
        @ExcludeMissing
        fun _verificationResult(): JsonField<VerificationResult> = verificationResult

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CardholderAuthentication = apply {
            if (validated) {
                return@apply
            }

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

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CardholderAuthentication]. */
        class Builder internal constructor() {

            private var _3dsVersion: JsonField<String>? = null
            private var acquirerExemption: JsonField<AcquirerExemption>? = null
            private var authenticationResult: JsonField<AuthenticationResult>? = null
            private var decisionMadeBy: JsonField<DecisionMadeBy>? = null
            private var liabilityShift: JsonField<LiabilityShift>? = null
            private var threeDSAuthenticationToken: JsonField<String>? = null
            private var verificationAttempted: JsonField<VerificationAttempted>? = null
            private var verificationResult: JsonField<VerificationResult>? = null
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
            fun _3dsVersion(_3dsVersion: String?) = _3dsVersion(JsonField.ofNullable(_3dsVersion))

            /** The 3DS version used for the authentication */
            fun _3dsVersion(_3dsVersion: Optional<String>) = _3dsVersion(_3dsVersion.orElse(null))

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
            fun threeDSAuthenticationToken(threeDSAuthenticationToken: String?) =
                threeDSAuthenticationToken(JsonField.ofNullable(threeDSAuthenticationToken))

            /**
             * Unique identifier you can use to match a given 3DS authentication (available via the
             * three_ds_authentication.created event webhook) and the transaction. Note that in
             * cases where liability shift does not occur, this token is matched to the transaction
             * on a best-effort basis.
             */
            fun threeDSAuthenticationToken(threeDSAuthenticationToken: Optional<String>) =
                threeDSAuthenticationToken(threeDSAuthenticationToken.orElse(null))

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
                    checkRequired("_3dsVersion", _3dsVersion),
                    checkRequired("acquirerExemption", acquirerExemption),
                    checkRequired("authenticationResult", authenticationResult),
                    checkRequired("decisionMadeBy", decisionMadeBy),
                    checkRequired("liabilityShift", liabilityShift),
                    checkRequired("threeDSAuthenticationToken", threeDSAuthenticationToken),
                    checkRequired("verificationAttempted", verificationAttempted),
                    checkRequired("verificationResult", verificationResult),
                    additionalProperties.toImmutable(),
                )
        }

        /** Whether an acquirer exemption applied to the transaction. */
        class AcquirerExemption
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            /** An enum containing [AcquirerExemption]'s known values. */
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

            /**
             * An enum containing [AcquirerExemption]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AcquirerExemption] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                AUTHENTICATION_OUTAGE_EXCEPTION,
                LOW_VALUE,
                MERCHANT_INITIATED_TRANSACTION,
                NONE,
                RECURRING_PAYMENT,
                SECURE_CORPORATE_PAYMENT,
                STRONG_CUSTOMER_AUTHENTICATION_DELEGATION,
                TRANSACTION_RISK_ANALYSIS,
                /**
                 * An enum member indicating that [AcquirerExemption] was instantiated with an
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

        /** Indicates what the outcome of the 3DS authentication process is. */
        class AuthenticationResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val ATTEMPTS = of("ATTEMPTS")

                @JvmField val DECLINE = of("DECLINE")

                @JvmField val NONE = of("NONE")

                @JvmField val SUCCESS = of("SUCCESS")

                @JvmStatic fun of(value: String) = AuthenticationResult(JsonField.of(value))
            }

            /** An enum containing [AuthenticationResult]'s known values. */
            enum class Known {
                ATTEMPTS,
                DECLINE,
                NONE,
                SUCCESS,
            }

            /**
             * An enum containing [AuthenticationResult]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AuthenticationResult] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                ATTEMPTS,
                DECLINE,
                NONE,
                SUCCESS,
                /**
                 * An enum member indicating that [AuthenticationResult] was instantiated with an
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
                    ATTEMPTS -> Value.ATTEMPTS
                    DECLINE -> Value.DECLINE
                    NONE -> Value.NONE
                    SUCCESS -> Value.SUCCESS
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

        /** Indicates which party made the 3DS authentication decision. */
        class DecisionMadeBy
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val CUSTOMER_ENDPOINT = of("CUSTOMER_ENDPOINT")

                @JvmField val LITHIC_DEFAULT = of("LITHIC_DEFAULT")

                @JvmField val LITHIC_RULES = of("LITHIC_RULES")

                @JvmField val NETWORK = of("NETWORK")

                @JvmField val UNKNOWN = of("UNKNOWN")

                @JvmStatic fun of(value: String) = DecisionMadeBy(JsonField.of(value))
            }

            /** An enum containing [DecisionMadeBy]'s known values. */
            enum class Known {
                CUSTOMER_ENDPOINT,
                LITHIC_DEFAULT,
                LITHIC_RULES,
                NETWORK,
                UNKNOWN,
            }

            /**
             * An enum containing [DecisionMadeBy]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [DecisionMadeBy] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CUSTOMER_ENDPOINT,
                LITHIC_DEFAULT,
                LITHIC_RULES,
                NETWORK,
                UNKNOWN,
                /**
                 * An enum member indicating that [DecisionMadeBy] was instantiated with an unknown
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
                    CUSTOMER_ENDPOINT -> Value.CUSTOMER_ENDPOINT
                    LITHIC_DEFAULT -> Value.LITHIC_DEFAULT
                    LITHIC_RULES -> Value.LITHIC_RULES
                    NETWORK -> Value.NETWORK
                    UNKNOWN -> Value.UNKNOWN
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
        class LiabilityShift
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val _3DS_AUTHENTICATED = of("3DS_AUTHENTICATED")

                @JvmField val ACQUIRER_EXEMPTION = of("ACQUIRER_EXEMPTION")

                @JvmField val NONE = of("NONE")

                @JvmField val TOKEN_AUTHENTICATED = of("TOKEN_AUTHENTICATED")

                @JvmStatic fun of(value: String) = LiabilityShift(JsonField.of(value))
            }

            /** An enum containing [LiabilityShift]'s known values. */
            enum class Known {
                _3DS_AUTHENTICATED,
                ACQUIRER_EXEMPTION,
                NONE,
                TOKEN_AUTHENTICATED,
            }

            /**
             * An enum containing [LiabilityShift]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [LiabilityShift] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                _3DS_AUTHENTICATED,
                ACQUIRER_EXEMPTION,
                NONE,
                TOKEN_AUTHENTICATED,
                /**
                 * An enum member indicating that [LiabilityShift] was instantiated with an unknown
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
                    _3DS_AUTHENTICATED -> Value._3DS_AUTHENTICATED
                    ACQUIRER_EXEMPTION -> Value.ACQUIRER_EXEMPTION
                    NONE -> Value.NONE
                    TOKEN_AUTHENTICATED -> Value.TOKEN_AUTHENTICATED
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

        /**
         * Indicates whether a 3DS challenge flow was used, and if so, what the verification method
         * was. (deprecated, use `authentication_result`)
         */
        class VerificationAttempted
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val NONE = of("NONE")

                @JvmField val OTHER = of("OTHER")

                @JvmStatic fun of(value: String) = VerificationAttempted(JsonField.of(value))
            }

            /** An enum containing [VerificationAttempted]'s known values. */
            enum class Known {
                NONE,
                OTHER,
            }

            /**
             * An enum containing [VerificationAttempted]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [VerificationAttempted] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                NONE,
                OTHER,
                /**
                 * An enum member indicating that [VerificationAttempted] was instantiated with an
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
                    NONE -> Value.NONE
                    OTHER -> Value.OTHER
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

        /**
         * Indicates whether a transaction is considered 3DS authenticated. (deprecated, use
         * `authentication_result`)
         */
        class VerificationResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val CANCELLED = of("CANCELLED")

                @JvmField val FAILED = of("FAILED")

                @JvmField val FRICTIONLESS = of("FRICTIONLESS")

                @JvmField val NOT_ATTEMPTED = of("NOT_ATTEMPTED")

                @JvmField val REJECTED = of("REJECTED")

                @JvmField val SUCCESS = of("SUCCESS")

                @JvmStatic fun of(value: String) = VerificationResult(JsonField.of(value))
            }

            /** An enum containing [VerificationResult]'s known values. */
            enum class Known {
                CANCELLED,
                FAILED,
                FRICTIONLESS,
                NOT_ATTEMPTED,
                REJECTED,
                SUCCESS,
            }

            /**
             * An enum containing [VerificationResult]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [VerificationResult] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CANCELLED,
                FAILED,
                FRICTIONLESS,
                NOT_ATTEMPTED,
                REJECTED,
                SUCCESS,
                /**
                 * An enum member indicating that [VerificationResult] was instantiated with an
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
                    CANCELLED -> Value.CANCELLED
                    FAILED -> Value.FAILED
                    FRICTIONLESS -> Value.FRICTIONLESS
                    NOT_ATTEMPTED -> Value.NOT_ATTEMPTED
                    REJECTED -> Value.REJECTED
                    SUCCESS -> Value.SUCCESS
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
        @JsonProperty("acceptor_id")
        @ExcludeMissing
        fun _acceptorId(): JsonField<String> = acceptorId

        /** Unique numeric identifier of the acquiring institution. */
        @JsonProperty("acquiring_institution_id")
        @ExcludeMissing
        fun _acquiringInstitutionId(): JsonField<String> = acquiringInstitutionId

        /**
         * City of card acceptor. Note that in many cases, particularly in card-not-present
         * transactions, merchants may send through a phone number or URL in this field.
         */
        @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

        /**
         * Country or entity of card acceptor. Possible values are: (1) all ISO 3166-1 alpha-3
         * country codes, (2) QZZ for Kosovo, and (3) ANT for Netherlands Antilles.
         */
        @JsonProperty("country") @ExcludeMissing fun _country(): JsonField<String> = country

        /** Short description of card acceptor. */
        @JsonProperty("descriptor")
        @ExcludeMissing
        fun _descriptor(): JsonField<String> = descriptor

        /**
         * Merchant category code (MCC). A four-digit number listed in ISO 18245. An MCC is used to
         * classify a business by the types of goods or services it provides.
         */
        @JsonProperty("mcc") @ExcludeMissing fun _mcc(): JsonField<String> = mcc

        /** Geographic state of card acceptor. */
        @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Merchant = apply {
            if (validated) {
                return@apply
            }

            acceptorId()
            acquiringInstitutionId()
            city()
            country()
            descriptor()
            mcc()
            state()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Merchant]. */
        class Builder internal constructor() {

            private var acceptorId: JsonField<String>? = null
            private var acquiringInstitutionId: JsonField<String>? = null
            private var city: JsonField<String>? = null
            private var country: JsonField<String>? = null
            private var descriptor: JsonField<String>? = null
            private var mcc: JsonField<String>? = null
            private var state: JsonField<String>? = null
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
                    checkRequired("acceptorId", acceptorId),
                    checkRequired("acquiringInstitutionId", acquiringInstitutionId),
                    checkRequired("city", city),
                    checkRequired("country", country),
                    checkRequired("descriptor", descriptor),
                    checkRequired("mcc", mcc),
                    checkRequired("state", state),
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

    /**
     * Card network of the authorization. Can be `INTERLINK`, `MAESTRO`, `MASTERCARD`, `VISA`, or
     * `UNKNOWN`. Value is `UNKNOWN` when Lithic cannot determine the network code from the upstream
     * provider.
     */
    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            @JvmField val INTERLINK = of("INTERLINK")

            @JvmField val MAESTRO = of("MAESTRO")

            @JvmField val MASTERCARD = of("MASTERCARD")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmField val VISA = of("VISA")

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
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

        @JsonProperty("entry_mode")
        @ExcludeMissing
        fun _entryMode(): JsonField<PosEntryMode> = entryMode

        @JsonProperty("terminal") @ExcludeMissing fun _terminal(): JsonField<PosTerminal> = terminal

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Pos = apply {
            if (validated) {
                return@apply
            }

            entryMode().validate()
            terminal().validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
                    checkRequired("entryMode", entryMode),
                    checkRequired("terminal", terminal),
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
            @JsonProperty("card") @ExcludeMissing fun _card(): JsonField<Card> = card

            /** Cardholder presence indicator */
            @JsonProperty("cardholder")
            @ExcludeMissing
            fun _cardholder(): JsonField<Cardholder> = cardholder

            /** Method of entry for the PAN */
            @JsonProperty("pan") @ExcludeMissing fun _pan(): JsonField<Pan> = pan

            /** Indicates whether the cardholder entered the PIN. True if the PIN was entered. */
            @JsonProperty("pin_entered")
            @ExcludeMissing
            fun _pinEntered(): JsonField<Boolean> = pinEntered

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PosEntryMode = apply {
                if (validated) {
                    return@apply
                }

                card()
                cardholder()
                pan()
                pinEntered()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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
                        checkRequired("card", card),
                        checkRequired("cardholder", cardholder),
                        checkRequired("pan", pan),
                        checkRequired("pinEntered", pinEntered),
                        additionalProperties.toImmutable(),
                    )
            }

            /** Card presence indicator */
            class Card
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

            /** Cardholder presence indicator */
            class Cardholder
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

            /** Method of entry for the PAN */
            class Pan
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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
            @JsonProperty("attended") @ExcludeMissing fun _attended(): JsonField<Boolean> = attended

            /** True if the terminal is capable of retaining the card. */
            @JsonProperty("card_retention_capable")
            @ExcludeMissing
            fun _cardRetentionCapable(): JsonField<Boolean> = cardRetentionCapable

            /** True if the sale was made at the place of business (vs. mobile). */
            @JsonProperty("on_premise")
            @ExcludeMissing
            fun _onPremise(): JsonField<Boolean> = onPremise

            /** The person that is designated to swipe the card */
            @JsonProperty("operator")
            @ExcludeMissing
            fun _operator(): JsonField<Operator> = operator

            /**
             * True if the terminal is capable of partial approval. Partial approval is when part of
             * a transaction is approved and another payment must be used for the remainder. Example
             * scenario: A $40 transaction is attempted on a prepaid card with a $25 balance. If
             * partial approval is enabled, $25 can be authorized, at which point the POS will
             * prompt the user for an additional payment of $15.
             */
            @JsonProperty("partial_approval_capable")
            @ExcludeMissing
            fun _partialApprovalCapable(): JsonField<Boolean> = partialApprovalCapable

            /** Status of whether the POS is able to accept PINs */
            @JsonProperty("pin_capability")
            @ExcludeMissing
            fun _pinCapability(): JsonField<PinCapability> = pinCapability

            /** POS Type */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PosTerminal = apply {
                if (validated) {
                    return@apply
                }

                attended()
                cardRetentionCapable()
                onPremise()
                operator()
                partialApprovalCapable()
                pinCapability()
                type()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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
                        checkRequired("attended", attended),
                        checkRequired("cardRetentionCapable", cardRetentionCapable),
                        checkRequired("onPremise", onPremise),
                        checkRequired("operator", operator),
                        checkRequired("partialApprovalCapable", partialApprovalCapable),
                        checkRequired("pinCapability", pinCapability),
                        checkRequired("type", type),
                        additionalProperties.toImmutable(),
                    )
            }

            /** The person that is designated to swipe the card */
            class Operator
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

            /** Status of whether the POS is able to accept PINs */
            class PinCapability
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

            /** POS Type */
            class Type
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

        /** An enum containing [DeclineResult]'s known values. */
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

    /** Status of the transaction. */
    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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
        @JsonProperty("wallet_type")
        @ExcludeMissing
        fun _walletType(): JsonField<WalletType> = walletType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TokenInfo = apply {
            if (validated) {
                return@apply
            }

            walletType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [TokenInfo]. */
        class Builder internal constructor() {

            private var walletType: JsonField<WalletType>? = null
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

            fun build(): TokenInfo =
                TokenInfo(
                    checkRequired("walletType", walletType),
                    additionalProperties.toImmutable()
                )
        }

        /**
         * The wallet_type field will indicate the source of the token. Possible token sources
         * include digital wallets (Apple, Google, or Samsung Pay), merchant tokenization, and
         * “other” sources like in-flight commerce. Masterpass is not currently supported and is
         * included for future use.
         */
        class WalletType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

                @JvmField val APPLE_PAY = of("APPLE_PAY")

                @JvmField val GOOGLE_PAY = of("GOOGLE_PAY")

                @JvmField val MASTERPASS = of("MASTERPASS")

                @JvmField val MERCHANT = of("MERCHANT")

                @JvmField val OTHER = of("OTHER")

                @JvmField val SAMSUNG_PAY = of("SAMSUNG_PAY")

                @JvmStatic fun of(value: String) = WalletType(JsonField.of(value))
            }

            /** An enum containing [WalletType]'s known values. */
            enum class Known {
                APPLE_PAY,
                GOOGLE_PAY,
                MASTERPASS,
                MERCHANT,
                OTHER,
                SAMSUNG_PAY,
            }

            /**
             * An enum containing [WalletType]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [WalletType] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                APPLE_PAY,
                GOOGLE_PAY,
                MASTERPASS,
                MERCHANT,
                OTHER,
                SAMSUNG_PAY,
                /**
                 * An enum member indicating that [WalletType] was instantiated with an unknown
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
                    APPLE_PAY -> Value.APPLE_PAY
                    GOOGLE_PAY -> Value.GOOGLE_PAY
                    MASTERPASS -> Value.MASTERPASS
                    MERCHANT -> Value.MERCHANT
                    OTHER -> Value.OTHER
                    SAMSUNG_PAY -> Value.SAMSUNG_PAY
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
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("amounts")
        @ExcludeMissing
        private val amounts: JsonField<TransactionEventAmounts> = JsonMissing.of(),
        @JsonProperty("created")
        @ExcludeMissing
        private val created: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("detailed_results")
        @ExcludeMissing
        private val detailedResults: JsonField<List<DetailedResult>> = JsonMissing.of(),
        @JsonProperty("effective_polarity")
        @ExcludeMissing
        private val effectivePolarity: JsonField<EffectivePolarity> = JsonMissing.of(),
        @JsonProperty("network_info")
        @ExcludeMissing
        private val networkInfo: JsonField<NetworkInfo> = JsonMissing.of(),
        @JsonProperty("result")
        @ExcludeMissing
        private val result: JsonField<DeclineResult> = JsonMissing.of(),
        @JsonProperty("rule_results")
        @ExcludeMissing
        private val ruleResults: JsonField<List<RuleResult>> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** Transaction event identifier. */
        fun token(): String = token.getRequired("token")

        /** Amount of the event in the settlement currency. */
        @Deprecated("deprecated") fun amount(): Long = amount.getRequired("amount")

        fun amounts(): TransactionEventAmounts = amounts.getRequired("amounts")

        /** RFC 3339 date and time this event entered the system. UTC time zone. */
        fun created(): OffsetDateTime = created.getRequired("created")

        fun detailedResults(): List<DetailedResult> =
            detailedResults.getRequired("detailed_results")

        /** Indicates whether the transaction event is a credit or debit to the account. */
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
         */
        fun networkInfo(): Optional<NetworkInfo> =
            Optional.ofNullable(networkInfo.getNullable("network_info"))

        fun result(): DeclineResult = result.getRequired("result")

        fun ruleResults(): List<RuleResult> = ruleResults.getRequired("rule_results")

        /** Type of transaction event */
        fun type(): Type = type.getRequired("type")

        /** Transaction event identifier. */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        /** Amount of the event in the settlement currency. */
        @Deprecated("deprecated")
        @JsonProperty("amount")
        @ExcludeMissing
        fun _amount(): JsonField<Long> = amount

        @JsonProperty("amounts")
        @ExcludeMissing
        fun _amounts(): JsonField<TransactionEventAmounts> = amounts

        /** RFC 3339 date and time this event entered the system. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created(): JsonField<OffsetDateTime> = created

        @JsonProperty("detailed_results")
        @ExcludeMissing
        fun _detailedResults(): JsonField<List<DetailedResult>> = detailedResults

        /** Indicates whether the transaction event is a credit or debit to the account. */
        @JsonProperty("effective_polarity")
        @ExcludeMissing
        fun _effectivePolarity(): JsonField<EffectivePolarity> = effectivePolarity

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
        @JsonProperty("network_info")
        @ExcludeMissing
        fun _networkInfo(): JsonField<NetworkInfo> = networkInfo

        @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<DeclineResult> = result

        @JsonProperty("rule_results")
        @ExcludeMissing
        fun _ruleResults(): JsonField<List<RuleResult>> = ruleResults

        /** Type of transaction event */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): TransactionEvent = apply {
            if (validated) {
                return@apply
            }

            token()
            amount()
            amounts().validate()
            created()
            detailedResults()
            effectivePolarity()
            networkInfo().ifPresent { it.validate() }
            result()
            ruleResults().forEach { it.validate() }
            type()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
                additionalProperties = transactionEvent.additionalProperties.toMutableMap()
            }

            /** Transaction event identifier. */
            fun token(token: String) = token(JsonField.of(token))

            /** Transaction event identifier. */
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Amount of the event in the settlement currency. */
            @Deprecated("deprecated") fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Amount of the event in the settlement currency. */
            @Deprecated("deprecated")
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun amounts(amounts: TransactionEventAmounts) = amounts(JsonField.of(amounts))

            fun amounts(amounts: JsonField<TransactionEventAmounts>) = apply {
                this.amounts = amounts
            }

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            fun detailedResults(detailedResults: List<DetailedResult>) =
                detailedResults(JsonField.of(detailedResults))

            fun detailedResults(detailedResults: JsonField<List<DetailedResult>>) = apply {
                this.detailedResults = detailedResults.map { it.toMutableList() }
            }

            fun addDetailedResult(detailedResult: DetailedResult) = apply {
                detailedResults =
                    (detailedResults ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(detailedResult)
                    }
            }

            /** Indicates whether the transaction event is a credit or debit to the account. */
            fun effectivePolarity(effectivePolarity: EffectivePolarity) =
                effectivePolarity(JsonField.of(effectivePolarity))

            /** Indicates whether the transaction event is a credit or debit to the account. */
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
            fun networkInfo(networkInfo: Optional<NetworkInfo>) =
                networkInfo(networkInfo.orElse(null))

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
            fun networkInfo(networkInfo: JsonField<NetworkInfo>) = apply {
                this.networkInfo = networkInfo
            }

            fun result(result: DeclineResult) = result(JsonField.of(result))

            fun result(result: JsonField<DeclineResult>) = apply { this.result = result }

            fun ruleResults(ruleResults: List<RuleResult>) = ruleResults(JsonField.of(ruleResults))

            fun ruleResults(ruleResults: JsonField<List<RuleResult>>) = apply {
                this.ruleResults = ruleResults.map { it.toMutableList() }
            }

            fun addRuleResult(ruleResult: RuleResult) = apply {
                ruleResults =
                    (ruleResults ?: JsonField.of(mutableListOf())).apply {
                        asKnown()
                            .orElseThrow {
                                IllegalStateException(
                                    "Field was set to non-list type: ${javaClass.simpleName}"
                                )
                            }
                            .add(ruleResult)
                    }
            }

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

            @JsonProperty("cardholder")
            @ExcludeMissing
            fun _cardholder(): JsonField<Cardholder> = cardholder

            @JsonProperty("merchant")
            @ExcludeMissing
            fun _merchant(): JsonField<Merchant> = merchant

            @JsonProperty("settlement")
            @ExcludeMissing
            fun _settlement(): JsonField<Settlement> = settlement

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            fun toBuilder() = Builder().from(this)

            companion object {

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

                fun cardholder(cardholder: JsonField<Cardholder>) = apply {
                    this.cardholder = cardholder
                }

                fun merchant(merchant: Merchant) = merchant(JsonField.of(merchant))

                fun merchant(merchant: JsonField<Merchant>) = apply { this.merchant = merchant }

                fun settlement(settlement: Settlement?) =
                    settlement(JsonField.ofNullable(settlement))

                fun settlement(settlement: Optional<Settlement>) =
                    settlement(settlement.orElse(null))

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
                        checkRequired("cardholder", cardholder),
                        checkRequired("merchant", merchant),
                        checkRequired("settlement", settlement),
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
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * Exchange rate used to convert the merchant amount to the cardholder billing
                 * amount.
                 */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<String> = conversionRate

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Cardholder]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var conversionRate: JsonField<String>? = null
                    private var currency: JsonField<Currency>? = null
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
                            checkRequired("amount", amount),
                            checkRequired("conversionRate", conversionRate),
                            checkRequired("currency", currency),
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
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Merchant = apply {
                    if (validated) {
                        return@apply
                    }

                    amount()
                    currency()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Merchant]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var currency: JsonField<Currency>? = null
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
                            checkRequired("amount", amount),
                            checkRequired("currency", currency),
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
                @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

                /** Exchange rate used to convert the merchant amount to the settlement amount. */
                @JsonProperty("conversion_rate")
                @ExcludeMissing
                fun _conversionRate(): JsonField<String> = conversionRate

                /**
                 * ISO 4217 currency. Its enumerants are ISO 4217 currencies except for some special
                 * currencies like `XXX`. Enumerants names are lowercase currency code e.g. `EUR`,
                 * `USD`.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun _currency(): JsonField<Currency> = currency

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Settlement]. */
                class Builder internal constructor() {

                    private var amount: JsonField<Long>? = null
                    private var conversionRate: JsonField<String>? = null
                    private var currency: JsonField<Currency>? = null
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
                            checkRequired("amount", amount),
                            checkRequired("conversionRate", conversionRate),
                            checkRequired("currency", currency),
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

            /** An enum containing [DetailedResult]'s known values. */
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

        /** Indicates whether the transaction event is a credit or debit to the account. */
        class EffectivePolarity
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
         * card network and the event type. If the field is populated by the network, we will pass
         * it through as is unless otherwise specified. Please consult the official network
         * documentation for more details about these fields and how to use them.
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

            @JsonProperty("acquirer")
            @ExcludeMissing
            fun _acquirer(): JsonField<Acquirer> = acquirer

            @JsonProperty("mastercard")
            @ExcludeMissing
            fun _mastercard(): JsonField<Mastercard> = mastercard

            @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): NetworkInfo = apply {
                if (validated) {
                    return@apply
                }

                acquirer().ifPresent { it.validate() }
                mastercard().ifPresent { it.validate() }
                visa().ifPresent { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                @JvmStatic fun builder() = Builder()
            }

            /** A builder for [NetworkInfo]. */
            class Builder internal constructor() {

                private var acquirer: JsonField<Acquirer>? = null
                private var mastercard: JsonField<Mastercard>? = null
                private var visa: JsonField<Visa>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                @JvmSynthetic
                internal fun from(networkInfo: NetworkInfo) = apply {
                    acquirer = networkInfo.acquirer
                    mastercard = networkInfo.mastercard
                    visa = networkInfo.visa
                    additionalProperties = networkInfo.additionalProperties.toMutableMap()
                }

                fun acquirer(acquirer: Acquirer?) = acquirer(JsonField.ofNullable(acquirer))

                fun acquirer(acquirer: Optional<Acquirer>) = acquirer(acquirer.orElse(null))

                fun acquirer(acquirer: JsonField<Acquirer>) = apply { this.acquirer = acquirer }

                fun mastercard(mastercard: Mastercard?) =
                    mastercard(JsonField.ofNullable(mastercard))

                fun mastercard(mastercard: Optional<Mastercard>) =
                    mastercard(mastercard.orElse(null))

                fun mastercard(mastercard: JsonField<Mastercard>) = apply {
                    this.mastercard = mastercard
                }

                fun visa(visa: Visa?) = visa(JsonField.ofNullable(visa))

                fun visa(visa: Optional<Visa>) = visa(visa.orElse(null))

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
                        checkRequired("acquirer", acquirer),
                        checkRequired("mastercard", mastercard),
                        checkRequired("visa", visa),
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
                fun _acquirerReferenceNumber(): JsonField<String> = acquirerReferenceNumber

                /** Identifier assigned by the acquirer. */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber(): JsonField<String> = retrievalReferenceNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Acquirer = apply {
                    if (validated) {
                        return@apply
                    }

                    acquirerReferenceNumber()
                    retrievalReferenceNumber()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

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
                     * Identifier assigned by the acquirer, applicable to dual-message transactions
                     * only. The acquirer reference number (ARN) is only populated once a
                     * transaction has been cleared, and it is not available in all transactions
                     * (such as automated fuel dispenser transactions). A single transaction can
                     * contain multiple ARNs if the merchant sends multiple clearings.
                     */
                    fun acquirerReferenceNumber(acquirerReferenceNumber: Optional<String>) =
                        acquirerReferenceNumber(acquirerReferenceNumber.orElse(null))

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
                    fun retrievalReferenceNumber(retrievalReferenceNumber: String?) =
                        retrievalReferenceNumber(JsonField.ofNullable(retrievalReferenceNumber))

                    /** Identifier assigned by the acquirer. */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: Optional<String>) =
                        retrievalReferenceNumber(retrievalReferenceNumber.orElse(null))

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
                            checkRequired("acquirerReferenceNumber", acquirerReferenceNumber),
                            checkRequired("retrievalReferenceNumber", retrievalReferenceNumber),
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
                @JsonProperty("original_banknet_reference_number")
                @ExcludeMissing
                private val originalBanknetReferenceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("original_switch_serial_number")
                @ExcludeMissing
                private val originalSwitchSerialNumber: JsonField<String> = JsonMissing.of(),
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

                /**
                 * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                 * `banknet_reference_number` of a prior related event. May be populated in
                 * authorization reversals, incremental authorizations (authorization requests that
                 * augment a previously authorized amount), automated fuel dispenser authorization
                 * advices and clearings, and financial authorizations. If the original banknet
                 * reference number contains all zeroes, then no actual reference number could be
                 * found by the network or acquirer. If Mastercard converts a transaction from
                 * dual-message to single-message, such as for certain ATM transactions, it will
                 * populate the original banknet reference number in the resulting financial
                 * authorization with the banknet reference number of the initial authorization,
                 * which Lithic does not receive.
                 */
                fun originalBanknetReferenceNumber(): Optional<String> =
                    Optional.ofNullable(
                        originalBanknetReferenceNumber.getNullable(
                            "original_banknet_reference_number"
                        )
                    )

                /**
                 * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                 * `switch_serial_number` of a prior related event. May be populated in returns and
                 * return reversals. Applicable to single-message transactions only.
                 */
                fun originalSwitchSerialNumber(): Optional<String> =
                    Optional.ofNullable(
                        originalSwitchSerialNumber.getNullable("original_switch_serial_number")
                    )

                /** Identifier assigned by Mastercard. */
                @JsonProperty("banknet_reference_number")
                @ExcludeMissing
                fun _banknetReferenceNumber(): JsonField<String> = banknetReferenceNumber

                /**
                 * Identifier assigned by Mastercard, applicable to single-message transactions
                 * only.
                 */
                @JsonProperty("switch_serial_number")
                @ExcludeMissing
                fun _switchSerialNumber(): JsonField<String> = switchSerialNumber

                /**
                 * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                 * `banknet_reference_number` of a prior related event. May be populated in
                 * authorization reversals, incremental authorizations (authorization requests that
                 * augment a previously authorized amount), automated fuel dispenser authorization
                 * advices and clearings, and financial authorizations. If the original banknet
                 * reference number contains all zeroes, then no actual reference number could be
                 * found by the network or acquirer. If Mastercard converts a transaction from
                 * dual-message to single-message, such as for certain ATM transactions, it will
                 * populate the original banknet reference number in the resulting financial
                 * authorization with the banknet reference number of the initial authorization,
                 * which Lithic does not receive.
                 */
                @JsonProperty("original_banknet_reference_number")
                @ExcludeMissing
                fun _originalBanknetReferenceNumber(): JsonField<String> =
                    originalBanknetReferenceNumber

                /**
                 * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                 * `switch_serial_number` of a prior related event. May be populated in returns and
                 * return reversals. Applicable to single-message transactions only.
                 */
                @JsonProperty("original_switch_serial_number")
                @ExcludeMissing
                fun _originalSwitchSerialNumber(): JsonField<String> = originalSwitchSerialNumber

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Mastercard = apply {
                    if (validated) {
                        return@apply
                    }

                    banknetReferenceNumber()
                    switchSerialNumber()
                    originalBanknetReferenceNumber()
                    originalSwitchSerialNumber()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Mastercard]. */
                class Builder internal constructor() {

                    private var banknetReferenceNumber: JsonField<String>? = null
                    private var switchSerialNumber: JsonField<String>? = null
                    private var originalBanknetReferenceNumber: JsonField<String> = JsonMissing.of()
                    private var originalSwitchSerialNumber: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(mastercard: Mastercard) = apply {
                        banknetReferenceNumber = mastercard.banknetReferenceNumber
                        switchSerialNumber = mastercard.switchSerialNumber
                        originalBanknetReferenceNumber = mastercard.originalBanknetReferenceNumber
                        originalSwitchSerialNumber = mastercard.originalSwitchSerialNumber
                        additionalProperties = mastercard.additionalProperties.toMutableMap()
                    }

                    /** Identifier assigned by Mastercard. */
                    fun banknetReferenceNumber(banknetReferenceNumber: String?) =
                        banknetReferenceNumber(JsonField.ofNullable(banknetReferenceNumber))

                    /** Identifier assigned by Mastercard. */
                    fun banknetReferenceNumber(banknetReferenceNumber: Optional<String>) =
                        banknetReferenceNumber(banknetReferenceNumber.orElse(null))

                    /** Identifier assigned by Mastercard. */
                    fun banknetReferenceNumber(banknetReferenceNumber: JsonField<String>) = apply {
                        this.banknetReferenceNumber = banknetReferenceNumber
                    }

                    /**
                     * Identifier assigned by Mastercard, applicable to single-message transactions
                     * only.
                     */
                    fun switchSerialNumber(switchSerialNumber: String?) =
                        switchSerialNumber(JsonField.ofNullable(switchSerialNumber))

                    /**
                     * Identifier assigned by Mastercard, applicable to single-message transactions
                     * only.
                     */
                    fun switchSerialNumber(switchSerialNumber: Optional<String>) =
                        switchSerialNumber(switchSerialNumber.orElse(null))

                    /**
                     * Identifier assigned by Mastercard, applicable to single-message transactions
                     * only.
                     */
                    fun switchSerialNumber(switchSerialNumber: JsonField<String>) = apply {
                        this.switchSerialNumber = switchSerialNumber
                    }

                    /**
                     * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                     * `banknet_reference_number` of a prior related event. May be populated in
                     * authorization reversals, incremental authorizations (authorization requests
                     * that augment a previously authorized amount), automated fuel dispenser
                     * authorization advices and clearings, and financial authorizations. If the
                     * original banknet reference number contains all zeroes, then no actual
                     * reference number could be found by the network or acquirer. If Mastercard
                     * converts a transaction from dual-message to single-message, such as for
                     * certain ATM transactions, it will populate the original banknet reference
                     * number in the resulting financial authorization with the banknet reference
                     * number of the initial authorization, which Lithic does not receive.
                     */
                    fun originalBanknetReferenceNumber(originalBanknetReferenceNumber: String?) =
                        originalBanknetReferenceNumber(
                            JsonField.ofNullable(originalBanknetReferenceNumber)
                        )

                    /**
                     * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                     * `banknet_reference_number` of a prior related event. May be populated in
                     * authorization reversals, incremental authorizations (authorization requests
                     * that augment a previously authorized amount), automated fuel dispenser
                     * authorization advices and clearings, and financial authorizations. If the
                     * original banknet reference number contains all zeroes, then no actual
                     * reference number could be found by the network or acquirer. If Mastercard
                     * converts a transaction from dual-message to single-message, such as for
                     * certain ATM transactions, it will populate the original banknet reference
                     * number in the resulting financial authorization with the banknet reference
                     * number of the initial authorization, which Lithic does not receive.
                     */
                    fun originalBanknetReferenceNumber(
                        originalBanknetReferenceNumber: Optional<String>
                    ) = originalBanknetReferenceNumber(originalBanknetReferenceNumber.orElse(null))

                    /**
                     * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                     * `banknet_reference_number` of a prior related event. May be populated in
                     * authorization reversals, incremental authorizations (authorization requests
                     * that augment a previously authorized amount), automated fuel dispenser
                     * authorization advices and clearings, and financial authorizations. If the
                     * original banknet reference number contains all zeroes, then no actual
                     * reference number could be found by the network or acquirer. If Mastercard
                     * converts a transaction from dual-message to single-message, such as for
                     * certain ATM transactions, it will populate the original banknet reference
                     * number in the resulting financial authorization with the banknet reference
                     * number of the initial authorization, which Lithic does not receive.
                     */
                    fun originalBanknetReferenceNumber(
                        originalBanknetReferenceNumber: JsonField<String>
                    ) = apply {
                        this.originalBanknetReferenceNumber = originalBanknetReferenceNumber
                    }

                    /**
                     * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                     * `switch_serial_number` of a prior related event. May be populated in returns
                     * and return reversals. Applicable to single-message transactions only.
                     */
                    fun originalSwitchSerialNumber(originalSwitchSerialNumber: String?) =
                        originalSwitchSerialNumber(JsonField.ofNullable(originalSwitchSerialNumber))

                    /**
                     * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                     * `switch_serial_number` of a prior related event. May be populated in returns
                     * and return reversals. Applicable to single-message transactions only.
                     */
                    fun originalSwitchSerialNumber(originalSwitchSerialNumber: Optional<String>) =
                        originalSwitchSerialNumber(originalSwitchSerialNumber.orElse(null))

                    /**
                     * [Available on January 28th] Identifier assigned by Mastercard. Matches the
                     * `switch_serial_number` of a prior related event. May be populated in returns
                     * and return reversals. Applicable to single-message transactions only.
                     */
                    fun originalSwitchSerialNumber(originalSwitchSerialNumber: JsonField<String>) =
                        apply {
                            this.originalSwitchSerialNumber = originalSwitchSerialNumber
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
                            checkRequired("banknetReferenceNumber", banknetReferenceNumber),
                            checkRequired("switchSerialNumber", switchSerialNumber),
                            originalBanknetReferenceNumber,
                            originalSwitchSerialNumber,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Mastercard && banknetReferenceNumber == other.banknetReferenceNumber && switchSerialNumber == other.switchSerialNumber && originalBanknetReferenceNumber == other.originalBanknetReferenceNumber && originalSwitchSerialNumber == other.originalSwitchSerialNumber && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(banknetReferenceNumber, switchSerialNumber, originalBanknetReferenceNumber, originalSwitchSerialNumber, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Mastercard{banknetReferenceNumber=$banknetReferenceNumber, switchSerialNumber=$switchSerialNumber, originalBanknetReferenceNumber=$originalBanknetReferenceNumber, originalSwitchSerialNumber=$originalSwitchSerialNumber, additionalProperties=$additionalProperties}"
            }

            @NoAutoDetect
            class Visa
            @JsonCreator
            private constructor(
                @JsonProperty("transaction_id")
                @ExcludeMissing
                private val transactionId: JsonField<String> = JsonMissing.of(),
                @JsonProperty("original_transaction_id")
                @ExcludeMissing
                private val originalTransactionId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** Identifier assigned by Visa. */
                fun transactionId(): Optional<String> =
                    Optional.ofNullable(transactionId.getNullable("transaction_id"))

                /**
                 * [Available on January 28th] Identifier assigned by Visa. Matches the
                 * `transaction_id` of a prior related event. May be populated in incremental
                 * authorizations (authorization requests that augment a previously authorized
                 * amount), authorization advices, financial authorizations, and clearings.
                 */
                fun originalTransactionId(): Optional<String> =
                    Optional.ofNullable(
                        originalTransactionId.getNullable("original_transaction_id")
                    )

                /** Identifier assigned by Visa. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun _transactionId(): JsonField<String> = transactionId

                /**
                 * [Available on January 28th] Identifier assigned by Visa. Matches the
                 * `transaction_id` of a prior related event. May be populated in incremental
                 * authorizations (authorization requests that augment a previously authorized
                 * amount), authorization advices, financial authorizations, and clearings.
                 */
                @JsonProperty("original_transaction_id")
                @ExcludeMissing
                fun _originalTransactionId(): JsonField<String> = originalTransactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Visa = apply {
                    if (validated) {
                        return@apply
                    }

                    transactionId()
                    originalTransactionId()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    @JvmStatic fun builder() = Builder()
                }

                /** A builder for [Visa]. */
                class Builder internal constructor() {

                    private var transactionId: JsonField<String>? = null
                    private var originalTransactionId: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    @JvmSynthetic
                    internal fun from(visa: Visa) = apply {
                        transactionId = visa.transactionId
                        originalTransactionId = visa.originalTransactionId
                        additionalProperties = visa.additionalProperties.toMutableMap()
                    }

                    /** Identifier assigned by Visa. */
                    fun transactionId(transactionId: String?) =
                        transactionId(JsonField.ofNullable(transactionId))

                    /** Identifier assigned by Visa. */
                    fun transactionId(transactionId: Optional<String>) =
                        transactionId(transactionId.orElse(null))

                    /** Identifier assigned by Visa. */
                    fun transactionId(transactionId: JsonField<String>) = apply {
                        this.transactionId = transactionId
                    }

                    /**
                     * [Available on January 28th] Identifier assigned by Visa. Matches the
                     * `transaction_id` of a prior related event. May be populated in incremental
                     * authorizations (authorization requests that augment a previously authorized
                     * amount), authorization advices, financial authorizations, and clearings.
                     */
                    fun originalTransactionId(originalTransactionId: String?) =
                        originalTransactionId(JsonField.ofNullable(originalTransactionId))

                    /**
                     * [Available on January 28th] Identifier assigned by Visa. Matches the
                     * `transaction_id` of a prior related event. May be populated in incremental
                     * authorizations (authorization requests that augment a previously authorized
                     * amount), authorization advices, financial authorizations, and clearings.
                     */
                    fun originalTransactionId(originalTransactionId: Optional<String>) =
                        originalTransactionId(originalTransactionId.orElse(null))

                    /**
                     * [Available on January 28th] Identifier assigned by Visa. Matches the
                     * `transaction_id` of a prior related event. May be populated in incremental
                     * authorizations (authorization requests that augment a previously authorized
                     * amount), authorization advices, financial authorizations, and clearings.
                     */
                    fun originalTransactionId(originalTransactionId: JsonField<String>) = apply {
                        this.originalTransactionId = originalTransactionId
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

                    fun build(): Visa =
                        Visa(
                            checkRequired("transactionId", transactionId),
                            originalTransactionId,
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Visa && transactionId == other.transactionId && originalTransactionId == other.originalTransactionId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(transactionId, originalTransactionId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Visa{transactionId=$transactionId, originalTransactionId=$originalTransactionId, additionalProperties=$additionalProperties}"
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

            /** An enum containing [DeclineResult]'s known values. */
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
            @JsonProperty("explanation")
            @ExcludeMissing
            private val explanation: JsonField<String> = JsonMissing.of(),
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonProperty("result")
            @ExcludeMissing
            private val result: JsonField<DetailedResult> = JsonMissing.of(),
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

            /** A human-readable explanation outlining the motivation for the rule's decline. */
            fun explanation(): Optional<String> =
                Optional.ofNullable(explanation.getNullable("explanation"))

            /** The name for the rule, if any was configured. */
            fun name(): Optional<String> = Optional.ofNullable(name.getNullable("name"))

            /** The detailed_result associated with this rule's decline. */
            fun result(): DetailedResult = result.getRequired("result")

            /**
             * The Auth Rule Token associated with the rule from which the decline originated. If
             * this is set to null, then the decline was not associated with a customer-configured
             * Auth Rule. This may happen in cases where a transaction is declined due to a
             * Lithic-configured security or compliance rule, for example.
             */
            @JsonProperty("auth_rule_token")
            @ExcludeMissing
            fun _authRuleToken(): JsonField<String> = authRuleToken

            /** A human-readable explanation outlining the motivation for the rule's decline. */
            @JsonProperty("explanation")
            @ExcludeMissing
            fun _explanation(): JsonField<String> = explanation

            /** The name for the rule, if any was configured. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /** The detailed_result associated with this rule's decline. */
            @JsonProperty("result")
            @ExcludeMissing
            fun _result(): JsonField<DetailedResult> = result

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RuleResult = apply {
                if (validated) {
                    return@apply
                }

                authRuleToken()
                explanation()
                name()
                result()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /**
                 * The Auth Rule Token associated with the rule from which the decline originated.
                 * If this is set to null, then the decline was not associated with a
                 * customer-configured Auth Rule. This may happen in cases where a transaction is
                 * declined due to a Lithic-configured security or compliance rule, for example.
                 */
                fun authRuleToken(authRuleToken: Optional<String>) =
                    authRuleToken(authRuleToken.orElse(null))

                /**
                 * The Auth Rule Token associated with the rule from which the decline originated.
                 * If this is set to null, then the decline was not associated with a
                 * customer-configured Auth Rule. This may happen in cases where a transaction is
                 * declined due to a Lithic-configured security or compliance rule, for example.
                 */
                fun authRuleToken(authRuleToken: JsonField<String>) = apply {
                    this.authRuleToken = authRuleToken
                }

                /** A human-readable explanation outlining the motivation for the rule's decline. */
                fun explanation(explanation: String?) =
                    explanation(JsonField.ofNullable(explanation))

                /** A human-readable explanation outlining the motivation for the rule's decline. */
                fun explanation(explanation: Optional<String>) =
                    explanation(explanation.orElse(null))

                /** A human-readable explanation outlining the motivation for the rule's decline. */
                fun explanation(explanation: JsonField<String>) = apply {
                    this.explanation = explanation
                }

                /** The name for the rule, if any was configured. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /** The name for the rule, if any was configured. */
                fun name(name: Optional<String>) = name(name.orElse(null))

                /** The name for the rule, if any was configured. */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The detailed_result associated with this rule's decline. */
                fun result(result: DetailedResult) = result(JsonField.of(result))

                /** The detailed_result associated with this rule's decline. */
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

                fun build(): RuleResult =
                    RuleResult(
                        checkRequired("authRuleToken", authRuleToken),
                        checkRequired("explanation", explanation),
                        checkRequired("name", name),
                        checkRequired("result", result),
                        additionalProperties.toImmutable(),
                    )
            }

            /** The detailed_result associated with this rule's decline. */
            class DetailedResult
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

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

                /** An enum containing [DetailedResult]'s known values. */
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

                return /* spotless:off */ other is RuleResult && authRuleToken == other.authRuleToken && explanation == other.explanation && name == other.name && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(authRuleToken, explanation, name, result, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RuleResult{authRuleToken=$authRuleToken, explanation=$explanation, name=$name, result=$result, additionalProperties=$additionalProperties}"
        }

        /** Type of transaction event */
        class Type
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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

            return /* spotless:off */ other is TransactionEvent && token == other.token && amount == other.amount && amounts == other.amounts && created == other.created && detailedResults == other.detailedResults && effectivePolarity == other.effectivePolarity && networkInfo == other.networkInfo && result == other.result && ruleResults == other.ruleResults && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(token, amount, amounts, created, detailedResults, effectivePolarity, networkInfo, result, ruleResults, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "TransactionEvent{token=$token, amount=$amount, amounts=$amounts, created=$created, detailedResults=$detailedResults, effectivePolarity=$effectivePolarity, networkInfo=$networkInfo, result=$result, ruleResults=$ruleResults, type=$type, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is Transaction && token == other.token && accountToken == other.accountToken && acquirerFee == other.acquirerFee && acquirerReferenceNumber == other.acquirerReferenceNumber && amount == other.amount && amounts == other.amounts && authorizationAmount == other.authorizationAmount && authorizationCode == other.authorizationCode && avs == other.avs && cardToken == other.cardToken && cardholderAuthentication == other.cardholderAuthentication && created == other.created && merchant == other.merchant && merchantAmount == other.merchantAmount && merchantAuthorizationAmount == other.merchantAuthorizationAmount && merchantCurrency == other.merchantCurrency && network == other.network && networkRiskScore == other.networkRiskScore && pos == other.pos && result == other.result && settledAmount == other.settledAmount && status == other.status && tokenInfo == other.tokenInfo && updated == other.updated && events == other.events && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, accountToken, acquirerFee, acquirerReferenceNumber, amount, amounts, authorizationAmount, authorizationCode, avs, cardToken, cardholderAuthentication, created, merchant, merchantAmount, merchantAuthorizationAmount, merchantCurrency, network, networkRiskScore, pos, result, settledAmount, status, tokenInfo, updated, events, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "Transaction{token=$token, accountToken=$accountToken, acquirerFee=$acquirerFee, acquirerReferenceNumber=$acquirerReferenceNumber, amount=$amount, amounts=$amounts, authorizationAmount=$authorizationAmount, authorizationCode=$authorizationCode, avs=$avs, cardToken=$cardToken, cardholderAuthentication=$cardholderAuthentication, created=$created, merchant=$merchant, merchantAmount=$merchantAmount, merchantAuthorizationAmount=$merchantAuthorizationAmount, merchantCurrency=$merchantCurrency, network=$network, networkRiskScore=$networkRiskScore, pos=$pos, result=$result, settledAmount=$settledAmount, status=$status, tokenInfo=$tokenInfo, updated=$updated, events=$events, additionalProperties=$additionalProperties}"
}
