// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
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
    private val authorizationAmount: JsonField<Long>,
    private val authorizationCode: JsonField<String>,
    private val cardToken: JsonField<String>,
    private val cardholderAuthentication: JsonField<CardholderAuthentication>,
    private val created: JsonField<OffsetDateTime>,
    private val events: JsonField<List<TransactionEvent>>,
    private val merchant: JsonField<Merchant>,
    private val merchantAmount: JsonField<Long>,
    private val merchantAuthorizationAmount: JsonField<Long>,
    private val merchantCurrency: JsonField<String>,
    private val network: JsonField<Network>,
    private val result: JsonField<Result>,
    private val settledAmount: JsonField<Long>,
    private val status: JsonField<Status>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /**
     * Fee assessed by the merchant and paid for by the cardholder in the smallest unit of the
     * currency. Will be zero if no fee is assessed. Rebates may be transmitted as a negative value
     * to indicate credited fees.
     */
    fun acquirerFee(): Long = acquirerFee.getRequired("acquirer_fee")

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

    /**
     * Authorization amount (in cents) of the transaction, including any acquirer fees. This amount
     * always represents the amount authorized for the transaction, unaffected by settlement.
     */
    fun authorizationAmount(): Long = authorizationAmount.getRequired("authorization_amount")

    /**
     * A fixed-width 6-digit numeric identifier that can be used to identify a transaction with
     * networks.
     */
    fun authorizationCode(): String = authorizationCode.getRequired("authorization_code")

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
    fun merchantAmount(): Long = merchantAmount.getRequired("merchant_amount")

    /**
     * Analogous to the "authorization_amount" property, but will represent the amount in the
     * transaction's local currency (smallest unit), including any acquirer fees.
     */
    fun merchantAuthorizationAmount(): Long =
        merchantAuthorizationAmount.getRequired("merchant_authorization_amount")

    /** 3-digit alphabetic ISO 4217 code for the local currency of the transaction. */
    fun merchantCurrency(): String = merchantCurrency.getRequired("merchant_currency")

    /**
     * Card network of the authorization. Can be `INTERLINK`, `MAESTRO`, `MASTERCARD`, `VISA`, or
     * `UNKNOWN`. Value is `UNKNOWN` when Lithic cannot determine the network code from the upstream
     * provider.
     */
    fun network(): Optional<Network> = Optional.ofNullable(network.getNullable("network"))

    /** `APPROVED` or decline reason. See Event result types */
    fun result(): Result = result.getRequired("result")

    /**
     * Amount of the transaction that has been settled (in cents), including any acquirer fees. This
     * may change over time.
     */
    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    /**
     * Status types:
     *
     * - `DECLINED` - The transaction was declined.
     * - `EXPIRED` - Lithic reversed the authorization as it has passed its expiration time.
     * - `PENDING` - Authorization is pending completion from the merchant.
     * - `SETTLED` - The transaction is complete.
     * - `VOIDED` - The merchant has voided the previously pending authorization.
     */
    fun status(): Status = status.getRequired("status")

    /** Globally unique identifier. */
    fun token(): String = token.getRequired("token")

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

    /** `APPROVED` or decline reason. See Event result types */
    @JsonProperty("result") @ExcludeMissing fun _result() = result

    /**
     * Amount of the transaction that has been settled (in cents), including any acquirer fees. This
     * may change over time.
     */
    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    /**
     * Status types:
     *
     * - `DECLINED` - The transaction was declined.
     * - `EXPIRED` - Lithic reversed the authorization as it has passed its expiration time.
     * - `PENDING` - Authorization is pending completion from the merchant.
     * - `SETTLED` - The transaction is complete.
     * - `VOIDED` - The merchant has voided the previously pending authorization.
     */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Transaction = apply {
        if (!validated) {
            acquirerFee()
            acquirerReferenceNumber()
            amount()
            authorizationAmount()
            authorizationCode()
            cardToken()
            cardholderAuthentication().map { it.validate() }
            created()
            events().forEach { it.validate() }
            merchant().validate()
            merchantAmount()
            merchantAuthorizationAmount()
            merchantCurrency()
            network()
            result()
            settledAmount()
            status()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transaction &&
            this.acquirerFee == other.acquirerFee &&
            this.acquirerReferenceNumber == other.acquirerReferenceNumber &&
            this.amount == other.amount &&
            this.authorizationAmount == other.authorizationAmount &&
            this.authorizationCode == other.authorizationCode &&
            this.cardToken == other.cardToken &&
            this.cardholderAuthentication == other.cardholderAuthentication &&
            this.created == other.created &&
            this.events == other.events &&
            this.merchant == other.merchant &&
            this.merchantAmount == other.merchantAmount &&
            this.merchantAuthorizationAmount == other.merchantAuthorizationAmount &&
            this.merchantCurrency == other.merchantCurrency &&
            this.network == other.network &&
            this.result == other.result &&
            this.settledAmount == other.settledAmount &&
            this.status == other.status &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    acquirerFee,
                    acquirerReferenceNumber,
                    amount,
                    authorizationAmount,
                    authorizationCode,
                    cardToken,
                    cardholderAuthentication,
                    created,
                    events,
                    merchant,
                    merchantAmount,
                    merchantAuthorizationAmount,
                    merchantCurrency,
                    network,
                    result,
                    settledAmount,
                    status,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Transaction{acquirerFee=$acquirerFee, acquirerReferenceNumber=$acquirerReferenceNumber, amount=$amount, authorizationAmount=$authorizationAmount, authorizationCode=$authorizationCode, cardToken=$cardToken, cardholderAuthentication=$cardholderAuthentication, created=$created, events=$events, merchant=$merchant, merchantAmount=$merchantAmount, merchantAuthorizationAmount=$merchantAuthorizationAmount, merchantCurrency=$merchantCurrency, network=$network, result=$result, settledAmount=$settledAmount, status=$status, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var acquirerFee: JsonField<Long> = JsonMissing.of()
        private var acquirerReferenceNumber: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var authorizationAmount: JsonField<Long> = JsonMissing.of()
        private var authorizationCode: JsonField<String> = JsonMissing.of()
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var cardholderAuthentication: JsonField<CardholderAuthentication> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var events: JsonField<List<TransactionEvent>> = JsonMissing.of()
        private var merchant: JsonField<Merchant> = JsonMissing.of()
        private var merchantAmount: JsonField<Long> = JsonMissing.of()
        private var merchantAuthorizationAmount: JsonField<Long> = JsonMissing.of()
        private var merchantCurrency: JsonField<String> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var result: JsonField<Result> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(transaction: Transaction) = apply {
            this.acquirerFee = transaction.acquirerFee
            this.acquirerReferenceNumber = transaction.acquirerReferenceNumber
            this.amount = transaction.amount
            this.authorizationAmount = transaction.authorizationAmount
            this.authorizationCode = transaction.authorizationCode
            this.cardToken = transaction.cardToken
            this.cardholderAuthentication = transaction.cardholderAuthentication
            this.created = transaction.created
            this.events = transaction.events
            this.merchant = transaction.merchant
            this.merchantAmount = transaction.merchantAmount
            this.merchantAuthorizationAmount = transaction.merchantAuthorizationAmount
            this.merchantCurrency = transaction.merchantCurrency
            this.network = transaction.network
            this.result = transaction.result
            this.settledAmount = transaction.settledAmount
            this.status = transaction.status
            this.token = transaction.token
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
         *
         * - `DECLINED` - The transaction was declined.
         * - `EXPIRED` - Lithic reversed the authorization as it has passed its expiration time.
         * - `PENDING` - Authorization is pending completion from the merchant.
         * - `SETTLED` - The transaction is complete.
         * - `VOIDED` - The merchant has voided the previously pending authorization.
         */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Status types:
         *
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
                authorizationAmount,
                authorizationCode,
                cardToken,
                cardholderAuthentication,
                created,
                events.map { it.toUnmodifiable() },
                merchant,
                merchantAmount,
                merchantAuthorizationAmount,
                merchantCurrency,
                network,
                result,
                settledAmount,
                status,
                token,
                additionalProperties.toUnmodifiable(),
            )
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
        private val created: JsonField<OffsetDateTime>,
        private val result: JsonField<Result>,
        private val token: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** Amount of the transaction event (in cents), including any acquirer fees. */
        fun amount(): Long = amount.getRequired("amount")

        /** RFC 3339 date and time this event entered the system. UTC time zone. */
        fun created(): OffsetDateTime = created.getRequired("created")

        /**
         * `APPROVED` or decline reason.
         *
         * Result types:
         *
         * - `ACCOUNT_STATE_TRANSACTION_FAIL` - Contact
         * [support@lithic.com](mailto:support@lithic.com).
         * - `APPROVED` - Transaction is approved.
         * - `BANK_CONNECTION_ERROR` - Please reconnect a funding source.
         * - `BANK_NOT_VERIFIED` - Please confirm the funding source.
         * - `CARD_CLOSED` - Card state was closed at the time of authorization.
         * - `CARD_PAUSED` - Card state was paused at the time of authorization.
         * - `FRAUD_ADVICE` - Transaction declined due to risk.
         * - `GLOBAL_TRANSACTION_LIMIT` - Platform spend limit exceeded, contact
         * [support@lithic.com](mailto:support@lithic.com).
         * - `GLOBAL_WEEKLY_LIMIT` - Platform spend limit exceeded, contact
         * [support@lithic.com](mailto:support@lithic.com).
         * - `GLOBAL_MONTHLY_LIMIT` - Platform spend limit exceeded, contact
         * [support@lithic.com](mailto:support@lithic.com).
         * - `INACTIVE_ACCOUNT` - Account is inactive. Contact
         * [support@lithic.com](mailto:support@lithic.com).
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
         *
         * - `AUTHORIZATION` - Authorize a transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a transaction.
         * - `AUTHORIZATION_EXPIRY` - Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A balance inquiry (typically a $0 authorization) has occurred on a
         * card.
         * - `CLEARING` - Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit authorization was approved on your behalf by
         * the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit funds without additional
         * clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit funds
         * without additional clearing.
         * - `RETURN` - A refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A refund has been reversed (e.g., when a merchant reverses an
         * incorrect refund).
         */
        fun type(): Type = type.getRequired("type")

        /** Amount of the transaction event (in cents), including any acquirer fees. */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** RFC 3339 date and time this event entered the system. UTC time zone. */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        /**
         * `APPROVED` or decline reason.
         *
         * Result types:
         *
         * - `ACCOUNT_STATE_TRANSACTION_FAIL` - Contact
         * [support@lithic.com](mailto:support@lithic.com).
         * - `APPROVED` - Transaction is approved.
         * - `BANK_CONNECTION_ERROR` - Please reconnect a funding source.
         * - `BANK_NOT_VERIFIED` - Please confirm the funding source.
         * - `CARD_CLOSED` - Card state was closed at the time of authorization.
         * - `CARD_PAUSED` - Card state was paused at the time of authorization.
         * - `FRAUD_ADVICE` - Transaction declined due to risk.
         * - `GLOBAL_TRANSACTION_LIMIT` - Platform spend limit exceeded, contact
         * [support@lithic.com](mailto:support@lithic.com).
         * - `GLOBAL_WEEKLY_LIMIT` - Platform spend limit exceeded, contact
         * [support@lithic.com](mailto:support@lithic.com).
         * - `GLOBAL_MONTHLY_LIMIT` - Platform spend limit exceeded, contact
         * [support@lithic.com](mailto:support@lithic.com).
         * - `INACTIVE_ACCOUNT` - Account is inactive. Contact
         * [support@lithic.com](mailto:support@lithic.com).
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
         *
         * - `AUTHORIZATION` - Authorize a transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a transaction.
         * - `AUTHORIZATION_EXPIRY` - Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A balance inquiry (typically a $0 authorization) has occurred on a
         * card.
         * - `CLEARING` - Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit authorization was approved on your behalf by
         * the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit funds without additional
         * clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit funds
         * without additional clearing.
         * - `RETURN` - A refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A refund has been reversed (e.g., when a merchant reverses an
         * incorrect refund).
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): TransactionEvent = apply {
            if (!validated) {
                amount()
                created()
                result()
                token()
                type()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TransactionEvent &&
                this.amount == other.amount &&
                this.created == other.created &&
                this.result == other.result &&
                this.token == other.token &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        created,
                        result,
                        token,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "TransactionEvent{amount=$amount, created=$created, result=$result, token=$token, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var result: JsonField<Result> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(transactionEvent: TransactionEvent) = apply {
                this.amount = transactionEvent.amount
                this.created = transactionEvent.created
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

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** RFC 3339 date and time this event entered the system. UTC time zone. */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            /**
             * `APPROVED` or decline reason.
             *
             * Result types:
             *
             * - `ACCOUNT_STATE_TRANSACTION_FAIL` - Contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `APPROVED` - Transaction is approved.
             * - `BANK_CONNECTION_ERROR` - Please reconnect a funding source.
             * - `BANK_NOT_VERIFIED` - Please confirm the funding source.
             * - `CARD_CLOSED` - Card state was closed at the time of authorization.
             * - `CARD_PAUSED` - Card state was paused at the time of authorization.
             * - `FRAUD_ADVICE` - Transaction declined due to risk.
             * - `GLOBAL_TRANSACTION_LIMIT` - Platform spend limit exceeded, contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `GLOBAL_WEEKLY_LIMIT` - Platform spend limit exceeded, contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `GLOBAL_MONTHLY_LIMIT` - Platform spend limit exceeded, contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `INACTIVE_ACCOUNT` - Account is inactive. Contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `INCORRECT_PIN` - PIN verification failed.
             * - `INVALID_CARD_DETAILS` - Incorrect CVV or expiry date.
             * - `INSUFFICIENT_FUNDS` - Please ensure the funding source is connected and up to
             * date.
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
             *
             * - `ACCOUNT_STATE_TRANSACTION_FAIL` - Contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `APPROVED` - Transaction is approved.
             * - `BANK_CONNECTION_ERROR` - Please reconnect a funding source.
             * - `BANK_NOT_VERIFIED` - Please confirm the funding source.
             * - `CARD_CLOSED` - Card state was closed at the time of authorization.
             * - `CARD_PAUSED` - Card state was paused at the time of authorization.
             * - `FRAUD_ADVICE` - Transaction declined due to risk.
             * - `GLOBAL_TRANSACTION_LIMIT` - Platform spend limit exceeded, contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `GLOBAL_WEEKLY_LIMIT` - Platform spend limit exceeded, contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `GLOBAL_MONTHLY_LIMIT` - Platform spend limit exceeded, contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `INACTIVE_ACCOUNT` - Account is inactive. Contact
             * [support@lithic.com](mailto:support@lithic.com).
             * - `INCORRECT_PIN` - PIN verification failed.
             * - `INVALID_CARD_DETAILS` - Incorrect CVV or expiry date.
             * - `INSUFFICIENT_FUNDS` - Please ensure the funding source is connected and up to
             * date.
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
             *
             * - `AUTHORIZATION` - Authorize a transaction.
             * - `AUTHORIZATION_ADVICE` - Advice on a transaction.
             * - `AUTHORIZATION_EXPIRY` - Authorization has expired and reversed by Lithic.
             * - `AUTHORIZATION_REVERSAL` - Authorization was reversed by the merchant.
             * - `BALANCE_INQUIRY` - A balance inquiry (typically a $0 authorization) has occurred
             * on a card.
             * - `CLEARING` - Transaction is settled.
             * - `CORRECTION_DEBIT` - Manual transaction correction (Debit).
             * - `CORRECTION_CREDIT` - Manual transaction correction (Credit).
             * - `CREDIT_AUTHORIZATION` - A refund or credit authorization from a merchant.
             * - `CREDIT_AUTHORIZATION_ADVICE` - A credit authorization was approved on your behalf
             * by the network.
             * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit funds without
             * additional clearing.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit
             * funds without additional clearing.
             * - `RETURN` - A refund has been processed on the transaction.
             * - `RETURN_REVERSAL` - A refund has been reversed (e.g., when a merchant reverses an
             * incorrect refund).
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Event types:
             *
             * - `AUTHORIZATION` - Authorize a transaction.
             * - `AUTHORIZATION_ADVICE` - Advice on a transaction.
             * - `AUTHORIZATION_EXPIRY` - Authorization has expired and reversed by Lithic.
             * - `AUTHORIZATION_REVERSAL` - Authorization was reversed by the merchant.
             * - `BALANCE_INQUIRY` - A balance inquiry (typically a $0 authorization) has occurred
             * on a card.
             * - `CLEARING` - Transaction is settled.
             * - `CORRECTION_DEBIT` - Manual transaction correction (Debit).
             * - `CORRECTION_CREDIT` - Manual transaction correction (Credit).
             * - `CREDIT_AUTHORIZATION` - A refund or credit authorization from a merchant.
             * - `CREDIT_AUTHORIZATION_ADVICE` - A credit authorization was approved on your behalf
             * by the network.
             * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit funds without
             * additional clearing.
             * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit
             * funds without additional clearing.
             * - `RETURN` - A refund has been processed on the transaction.
             * - `RETURN_REVERSAL` - A refund has been reversed (e.g., when a merchant reverses an
             * incorrect refund).
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
                    created,
                    result,
                    token,
                    type,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Result
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Result && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val ACCOUNT_STATE_TRANSACTION = Result(JsonField.of("ACCOUNT_STATE_TRANSACTION"))

                @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

                @JvmField val BANK_CONNECTION_ERROR = Result(JsonField.of("BANK_CONNECTION_ERROR"))

                @JvmField val BANK_NOT_VERIFIED = Result(JsonField.of("BANK_NOT_VERIFIED"))

                @JvmField val CARD_CLOSED = Result(JsonField.of("CARD_CLOSED"))

                @JvmField val CARD_PAUSED = Result(JsonField.of("CARD_PAUSED"))

                @JvmField val FRAUD_ADVICE = Result(JsonField.of("FRAUD_ADVICE"))

                @JvmField
                val GLOBAL_TRANSACTION_LIMIT = Result(JsonField.of("GLOBAL_TRANSACTION_LIMIT"))

                @JvmField val GLOBAL_WEEKLY_LIMIT = Result(JsonField.of("GLOBAL_WEEKLY_LIMIT"))

                @JvmField val GLOBAL_MONTHLY_LIMIT = Result(JsonField.of("GLOBAL_MONTHLY_LIMIT"))

                @JvmField val INACTIVE_ACCOUNT = Result(JsonField.of("INACTIVE_ACCOUNT"))

                @JvmField val INCORRECT_PIN = Result(JsonField.of("INCORRECT_PIN"))

                @JvmField val INVALID_CARD_DETAILS = Result(JsonField.of("INVALID_CARD_DETAILS"))

                @JvmField val INSUFFICIENT_FUNDS = Result(JsonField.of("INSUFFICIENT_FUNDS"))

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
                ACCOUNT_STATE_TRANSACTION,
                APPROVED,
                BANK_CONNECTION_ERROR,
                BANK_NOT_VERIFIED,
                CARD_CLOSED,
                CARD_PAUSED,
                FRAUD_ADVICE,
                GLOBAL_TRANSACTION_LIMIT,
                GLOBAL_WEEKLY_LIMIT,
                GLOBAL_MONTHLY_LIMIT,
                INACTIVE_ACCOUNT,
                INCORRECT_PIN,
                INVALID_CARD_DETAILS,
                INSUFFICIENT_FUNDS,
                MERCHANT_BLACKLIST,
                SINGLE_USE_RECHARGED,
                SWITCH_INOPERATIVE_ADVICE,
                UNAUTHORIZED_MERCHANT,
                UNKNOWN_HOST_TIMEOUT,
                USER_TRANSACTION_LIMIT,
            }

            enum class Value {
                ACCOUNT_STATE_TRANSACTION,
                APPROVED,
                BANK_CONNECTION_ERROR,
                BANK_NOT_VERIFIED,
                CARD_CLOSED,
                CARD_PAUSED,
                FRAUD_ADVICE,
                GLOBAL_TRANSACTION_LIMIT,
                GLOBAL_WEEKLY_LIMIT,
                GLOBAL_MONTHLY_LIMIT,
                INACTIVE_ACCOUNT,
                INCORRECT_PIN,
                INVALID_CARD_DETAILS,
                INSUFFICIENT_FUNDS,
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
                    ACCOUNT_STATE_TRANSACTION -> Value.ACCOUNT_STATE_TRANSACTION
                    APPROVED -> Value.APPROVED
                    BANK_CONNECTION_ERROR -> Value.BANK_CONNECTION_ERROR
                    BANK_NOT_VERIFIED -> Value.BANK_NOT_VERIFIED
                    CARD_CLOSED -> Value.CARD_CLOSED
                    CARD_PAUSED -> Value.CARD_PAUSED
                    FRAUD_ADVICE -> Value.FRAUD_ADVICE
                    GLOBAL_TRANSACTION_LIMIT -> Value.GLOBAL_TRANSACTION_LIMIT
                    GLOBAL_WEEKLY_LIMIT -> Value.GLOBAL_WEEKLY_LIMIT
                    GLOBAL_MONTHLY_LIMIT -> Value.GLOBAL_MONTHLY_LIMIT
                    INACTIVE_ACCOUNT -> Value.INACTIVE_ACCOUNT
                    INCORRECT_PIN -> Value.INCORRECT_PIN
                    INVALID_CARD_DETAILS -> Value.INVALID_CARD_DETAILS
                    INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
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
                    ACCOUNT_STATE_TRANSACTION -> Known.ACCOUNT_STATE_TRANSACTION
                    APPROVED -> Known.APPROVED
                    BANK_CONNECTION_ERROR -> Known.BANK_CONNECTION_ERROR
                    BANK_NOT_VERIFIED -> Known.BANK_NOT_VERIFIED
                    CARD_CLOSED -> Known.CARD_CLOSED
                    CARD_PAUSED -> Known.CARD_PAUSED
                    FRAUD_ADVICE -> Known.FRAUD_ADVICE
                    GLOBAL_TRANSACTION_LIMIT -> Known.GLOBAL_TRANSACTION_LIMIT
                    GLOBAL_WEEKLY_LIMIT -> Known.GLOBAL_WEEKLY_LIMIT
                    GLOBAL_MONTHLY_LIMIT -> Known.GLOBAL_MONTHLY_LIMIT
                    INACTIVE_ACCOUNT -> Known.INACTIVE_ACCOUNT
                    INCORRECT_PIN -> Known.INCORRECT_PIN
                    INVALID_CARD_DETAILS -> Known.INVALID_CARD_DETAILS
                    INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
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
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && this.value == other.value
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

                @JvmField val CORRECTION_DEBIT = Type(JsonField.of("CORRECTION_DEBIT"))

                @JvmField val CORRECTION_CREDIT = Type(JsonField.of("CORRECTION_CREDIT"))

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
                CORRECTION_DEBIT,
                CORRECTION_CREDIT,
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
                CORRECTION_DEBIT,
                CORRECTION_CREDIT,
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
                    CORRECTION_DEBIT -> Value.CORRECTION_DEBIT
                    CORRECTION_CREDIT -> Value.CORRECTION_CREDIT
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
                    CORRECTION_DEBIT -> Known.CORRECTION_DEBIT
                    CORRECTION_CREDIT -> Known.CORRECTION_CREDIT
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

        private var hashCode: Int = 0

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Merchant &&
                this.acceptorId == other.acceptorId &&
                this.city == other.city &&
                this.country == other.country &&
                this.descriptor == other.descriptor &&
                this.mcc == other.mcc &&
                this.state == other.state &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        acceptorId,
                        city,
                        country,
                        descriptor,
                        mcc,
                        state,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Merchant{acceptorId=$acceptorId, city=$city, country=$country, descriptor=$descriptor, mcc=$mcc, state=$state, additionalProperties=$additionalProperties}"

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
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Network && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val INTERLINK = Network(JsonField.of("INTERLINK"))

            @JvmField val MAESTRO = Network(JsonField.of("MAESTRO"))

            @JvmField val MASTERCARD = Network(JsonField.of("MASTERCARD"))

            @JvmField val VISA = Network(JsonField.of("VISA"))

            @JvmField val UNKNOWN = Network(JsonField.of("UNKNOWN"))

            @JvmStatic fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            VISA,
            UNKNOWN,
        }

        enum class Value {
            INTERLINK,
            MAESTRO,
            MASTERCARD,
            VISA,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                INTERLINK -> Value.INTERLINK
                MAESTRO -> Value.MAESTRO
                MASTERCARD -> Value.MASTERCARD
                VISA -> Value.VISA
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                INTERLINK -> Known.INTERLINK
                MAESTRO -> Known.MAESTRO
                MASTERCARD -> Known.MASTERCARD
                VISA -> Known.VISA
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown Network: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Result
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Result && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val ACCOUNT_STATE_TRANSACTION = Result(JsonField.of("ACCOUNT_STATE_TRANSACTION"))

            @JvmField val APPROVED = Result(JsonField.of("APPROVED"))

            @JvmField val BANK_CONNECTION_ERROR = Result(JsonField.of("BANK_CONNECTION_ERROR"))

            @JvmField val BANK_NOT_VERIFIED = Result(JsonField.of("BANK_NOT_VERIFIED"))

            @JvmField val CARD_CLOSED = Result(JsonField.of("CARD_CLOSED"))

            @JvmField val CARD_PAUSED = Result(JsonField.of("CARD_PAUSED"))

            @JvmField val FRAUD_ADVICE = Result(JsonField.of("FRAUD_ADVICE"))

            @JvmField
            val GLOBAL_TRANSACTION_LIMIT = Result(JsonField.of("GLOBAL_TRANSACTION_LIMIT"))

            @JvmField val GLOBAL_WEEKLY_LIMIT = Result(JsonField.of("GLOBAL_WEEKLY_LIMIT"))

            @JvmField val GLOBAL_MONTHLY_LIMIT = Result(JsonField.of("GLOBAL_MONTHLY_LIMIT"))

            @JvmField val INACTIVE_ACCOUNT = Result(JsonField.of("INACTIVE_ACCOUNT"))

            @JvmField val INCORRECT_PIN = Result(JsonField.of("INCORRECT_PIN"))

            @JvmField val INVALID_CARD_DETAILS = Result(JsonField.of("INVALID_CARD_DETAILS"))

            @JvmField val INSUFFICIENT_FUNDS = Result(JsonField.of("INSUFFICIENT_FUNDS"))

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
            ACCOUNT_STATE_TRANSACTION,
            APPROVED,
            BANK_CONNECTION_ERROR,
            BANK_NOT_VERIFIED,
            CARD_CLOSED,
            CARD_PAUSED,
            FRAUD_ADVICE,
            GLOBAL_TRANSACTION_LIMIT,
            GLOBAL_WEEKLY_LIMIT,
            GLOBAL_MONTHLY_LIMIT,
            INACTIVE_ACCOUNT,
            INCORRECT_PIN,
            INVALID_CARD_DETAILS,
            INSUFFICIENT_FUNDS,
            MERCHANT_BLACKLIST,
            SINGLE_USE_RECHARGED,
            SWITCH_INOPERATIVE_ADVICE,
            UNAUTHORIZED_MERCHANT,
            UNKNOWN_HOST_TIMEOUT,
            USER_TRANSACTION_LIMIT,
        }

        enum class Value {
            ACCOUNT_STATE_TRANSACTION,
            APPROVED,
            BANK_CONNECTION_ERROR,
            BANK_NOT_VERIFIED,
            CARD_CLOSED,
            CARD_PAUSED,
            FRAUD_ADVICE,
            GLOBAL_TRANSACTION_LIMIT,
            GLOBAL_WEEKLY_LIMIT,
            GLOBAL_MONTHLY_LIMIT,
            INACTIVE_ACCOUNT,
            INCORRECT_PIN,
            INVALID_CARD_DETAILS,
            INSUFFICIENT_FUNDS,
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
                ACCOUNT_STATE_TRANSACTION -> Value.ACCOUNT_STATE_TRANSACTION
                APPROVED -> Value.APPROVED
                BANK_CONNECTION_ERROR -> Value.BANK_CONNECTION_ERROR
                BANK_NOT_VERIFIED -> Value.BANK_NOT_VERIFIED
                CARD_CLOSED -> Value.CARD_CLOSED
                CARD_PAUSED -> Value.CARD_PAUSED
                FRAUD_ADVICE -> Value.FRAUD_ADVICE
                GLOBAL_TRANSACTION_LIMIT -> Value.GLOBAL_TRANSACTION_LIMIT
                GLOBAL_WEEKLY_LIMIT -> Value.GLOBAL_WEEKLY_LIMIT
                GLOBAL_MONTHLY_LIMIT -> Value.GLOBAL_MONTHLY_LIMIT
                INACTIVE_ACCOUNT -> Value.INACTIVE_ACCOUNT
                INCORRECT_PIN -> Value.INCORRECT_PIN
                INVALID_CARD_DETAILS -> Value.INVALID_CARD_DETAILS
                INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
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
                ACCOUNT_STATE_TRANSACTION -> Known.ACCOUNT_STATE_TRANSACTION
                APPROVED -> Known.APPROVED
                BANK_CONNECTION_ERROR -> Known.BANK_CONNECTION_ERROR
                BANK_NOT_VERIFIED -> Known.BANK_NOT_VERIFIED
                CARD_CLOSED -> Known.CARD_CLOSED
                CARD_PAUSED -> Known.CARD_PAUSED
                FRAUD_ADVICE -> Known.FRAUD_ADVICE
                GLOBAL_TRANSACTION_LIMIT -> Known.GLOBAL_TRANSACTION_LIMIT
                GLOBAL_WEEKLY_LIMIT -> Known.GLOBAL_WEEKLY_LIMIT
                GLOBAL_MONTHLY_LIMIT -> Known.GLOBAL_MONTHLY_LIMIT
                INACTIVE_ACCOUNT -> Known.INACTIVE_ACCOUNT
                INCORRECT_PIN -> Known.INCORRECT_PIN
                INVALID_CARD_DETAILS -> Known.INVALID_CARD_DETAILS
                INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
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
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val BOUNCED = Status(JsonField.of("BOUNCED"))

            @JvmField val DECLINED = Status(JsonField.of("DECLINED"))

            @JvmField val EXPIRED = Status(JsonField.of("EXPIRED"))

            @JvmField val PENDING = Status(JsonField.of("PENDING"))

            @JvmField val SETTLED = Status(JsonField.of("SETTLED"))

            @JvmField val VOIDED = Status(JsonField.of("VOIDED"))

            @JvmStatic fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            BOUNCED,
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
        }

        enum class Value {
            BOUNCED,
            DECLINED,
            EXPIRED,
            PENDING,
            SETTLED,
            VOIDED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BOUNCED -> Value.BOUNCED
                DECLINED -> Value.DECLINED
                EXPIRED -> Value.EXPIRED
                PENDING -> Value.PENDING
                SETTLED -> Value.SETTLED
                VOIDED -> Value.VOIDED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BOUNCED -> Known.BOUNCED
                DECLINED -> Known.DECLINED
                EXPIRED -> Known.EXPIRED
                PENDING -> Known.PENDING
                SETTLED -> Known.SETTLED
                VOIDED -> Known.VOIDED
                else -> throw LithicInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
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
        private val verificationAttempted: JsonField<VerificationAttempted>,
        private val verificationResult: JsonField<VerificationResult>,
        private val threeDSAuthenticationToken: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * 3-D Secure Protocol version. Possible enum values:
         *
         * - `1`: 3-D Secure Protocol version 1.x applied to the transaction.
         * - `2`: 3-D Secure Protocol version 2.x applied to the transaction.
         * - `null`: 3-D Secure was not used for the transaction
         */
        fun _3dsVersion(): Optional<String> =
            Optional.ofNullable(_3dsVersion.getNullable("3ds_version"))

        /**
         * Exemption applied by the ACS to authenticate the transaction without requesting a
         * challenge. Possible enum values:
         *
         * - `AUTHENTICATION_OUTAGE_EXCEPTION`: Authentication Outage Exception exemption.
         * - `LOW_VALUE`: Low Value Payment exemption.
         * - `MERCHANT_INITIATED_TRANSACTION`: Merchant Initiated Transaction (3RI).
         * - `NONE`: No exemption applied.
         * - `RECURRING_PAYMENT`: Recurring Payment exemption.
         * - `SECURE_CORPORATE_PAYMENT`: Secure Corporate Payment exemption.
         * - `STRONG_CUSTOMER_AUTHENTICATION_DELEGATION`: Strong Customer Authentication Delegation
         * exemption.
         * - `TRANSACTION_RISK_ANALYSIS`: Acquirer Low-Fraud and Transaction Risk Analysis
         * exemption.
         *
         * Maps to the 3-D Secure `transChallengeExemption` field.
         */
        fun acquirerExemption(): AcquirerExemption =
            acquirerExemption.getRequired("acquirer_exemption")

        /**
         * Outcome of the 3DS authentication process. Possible enum values:
         *
         * - `SUCCESS`: 3DS authentication was successful and the transaction is considered
         * authenticated.
         * - `DECLINE`: 3DS authentication was attempted but was unsuccessful — i.e., the issuer
         * declined to authenticate the cardholder; note that Lithic populates this value on a
         * best-effort basis based on common data across the 3DS authentication and ASA data
         * elements.
         * - `ATTEMPTS`: 3DS authentication was attempted but full authentication did not occur. A
         * proof of attempted authenticated is provided by the merchant.
         * - `NONE`: 3DS authentication was not performed on the transaction.
         */
        fun authenticationResult(): AuthenticationResult =
            authenticationResult.getRequired("authentication_result")

        /**
         * Indicator for which party made the 3DS authentication decision. Possible enum values:
         *
         * - `NETWORK`: A networks tand-in service decided on the outcome; for token authentications
         * (as indicated in the `liability_shift` attribute), this is the default value
         * - `LITHIC_DEFAULT`: A default decision was made by Lithic, without running a rules-based
         * authentication; this value will be set on card programs that do not participate in one of
         * our two 3DS product tiers
         * - `LITHIC_RULES`: A rules-based authentication was conducted by Lithic and Lithic decided
         * on the outcome
         * - `CUSTOMER_ENDPOINT`: Lithic customer decided on the outcome based on a real-time
         * request sent to a configured endpoint
         * - `UNKNOWN`: Data on which party decided is unavailable
         */
        fun decisionMadeBy(): DecisionMadeBy = decisionMadeBy.getRequired("decision_made_by")

        /**
         * Indicates whether chargeback liability shift applies to the transaction. Possible enum
         * values:
         *
         * - `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow,
         * chargeback liability shift applies.
         * - `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer
         * Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the
         * acquirer and in this case the `acquirer_exemption` field is expected to be not `NONE`.
         * - `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is
         * liable.
         * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
         * cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
         */
        fun liabilityShift(): LiabilityShift = liabilityShift.getRequired("liability_shift")

        /**
         * Verification attempted values:
         *
         * - `APP_LOGIN`: Out-of-band login verification was attempted by the ACS.
         * - `BIOMETRIC`: Out-of-band biometric verification was attempted by the ACS.
         * - `NONE`: No cardholder verification was attempted by the Access Control Server (e.g.
         * frictionless 3-D Secure flow, no 3-D Secure, or stand-in Risk Based Analysis).
         * - `OTHER`: Other method was used by the ACS to verify the cardholder (e.g. Mastercard
         * Identity Check Express, recurring transactions, etc.)
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
         *
         * - `CANCELLED`: Authentication/Account verification could not be performed, `transStatus =
         * U`.
         * - `FAILED`: Transaction was not authenticated. `transStatus = N`, note: the utilization
         * of exemptions could also result in `transStatus = N`, inspect the `acquirer_exemption`
         * field for more information.
         * - `FRICTIONLESS`: Attempts processing performed, the transaction was not authenticated,
         * but a proof of attempted authentication/verification is provided. `transStatus = A` and
         * the leading AAV indicator was one of {`kE`, `kF`, `kQ`}.
         * - `NOT_ATTEMPTED`: A 3-D Secure flow was not applied to this transaction. Leading AAV
         * indicator was one of {`kN`, `kX`} or no AAV was provided for the transaction.
         * - `REJECTED`: Authentication/Account Verification rejected; `transStatus = R`. Issuer is
         * rejecting authentication/verification and requests that authorization not be attempted.
         * - `SUCCESS`: Authentication verification successful. `transStatus = Y` and leading AAV
         * indicator for the transaction was one of {`kA`, `kB`, `kC`, `kD`, `kO`, `kP`, `kR`,
         * `kS`}.
         *
         * Note that the following `transStatus` values are not represented by this field:
         *
         * - `C`: Challenge Required
         * - `D`: Challenge Required; decoupled authentication confirmed
         * - `I`: Informational only
         * - `S`: Challenge using Secure Payment Confirmation (SPC)
         */
        fun verificationResult(): VerificationResult =
            verificationResult.getRequired("verification_result")

        /**
         * Unique identifier you can use to match a given 3DS authentication and the transaction.
         * Note that in cases where liability shift does not occur, this token is matched to the
         * transaction on a best-effort basis.
         */
        fun threeDSAuthenticationToken(): String =
            threeDSAuthenticationToken.getRequired("three_ds_authentication_token")

        /**
         * 3-D Secure Protocol version. Possible enum values:
         *
         * - `1`: 3-D Secure Protocol version 1.x applied to the transaction.
         * - `2`: 3-D Secure Protocol version 2.x applied to the transaction.
         * - `null`: 3-D Secure was not used for the transaction
         */
        @JsonProperty("3ds_version") @ExcludeMissing fun __3dsVersion() = _3dsVersion

        /**
         * Exemption applied by the ACS to authenticate the transaction without requesting a
         * challenge. Possible enum values:
         *
         * - `AUTHENTICATION_OUTAGE_EXCEPTION`: Authentication Outage Exception exemption.
         * - `LOW_VALUE`: Low Value Payment exemption.
         * - `MERCHANT_INITIATED_TRANSACTION`: Merchant Initiated Transaction (3RI).
         * - `NONE`: No exemption applied.
         * - `RECURRING_PAYMENT`: Recurring Payment exemption.
         * - `SECURE_CORPORATE_PAYMENT`: Secure Corporate Payment exemption.
         * - `STRONG_CUSTOMER_AUTHENTICATION_DELEGATION`: Strong Customer Authentication Delegation
         * exemption.
         * - `TRANSACTION_RISK_ANALYSIS`: Acquirer Low-Fraud and Transaction Risk Analysis
         * exemption.
         *
         * Maps to the 3-D Secure `transChallengeExemption` field.
         */
        @JsonProperty("acquirer_exemption")
        @ExcludeMissing
        fun _acquirerExemption() = acquirerExemption

        /**
         * Outcome of the 3DS authentication process. Possible enum values:
         *
         * - `SUCCESS`: 3DS authentication was successful and the transaction is considered
         * authenticated.
         * - `DECLINE`: 3DS authentication was attempted but was unsuccessful — i.e., the issuer
         * declined to authenticate the cardholder; note that Lithic populates this value on a
         * best-effort basis based on common data across the 3DS authentication and ASA data
         * elements.
         * - `ATTEMPTS`: 3DS authentication was attempted but full authentication did not occur. A
         * proof of attempted authenticated is provided by the merchant.
         * - `NONE`: 3DS authentication was not performed on the transaction.
         */
        @JsonProperty("authentication_result")
        @ExcludeMissing
        fun _authenticationResult() = authenticationResult

        /**
         * Indicator for which party made the 3DS authentication decision. Possible enum values:
         *
         * - `NETWORK`: A networks tand-in service decided on the outcome; for token authentications
         * (as indicated in the `liability_shift` attribute), this is the default value
         * - `LITHIC_DEFAULT`: A default decision was made by Lithic, without running a rules-based
         * authentication; this value will be set on card programs that do not participate in one of
         * our two 3DS product tiers
         * - `LITHIC_RULES`: A rules-based authentication was conducted by Lithic and Lithic decided
         * on the outcome
         * - `CUSTOMER_ENDPOINT`: Lithic customer decided on the outcome based on a real-time
         * request sent to a configured endpoint
         * - `UNKNOWN`: Data on which party decided is unavailable
         */
        @JsonProperty("decision_made_by") @ExcludeMissing fun _decisionMadeBy() = decisionMadeBy

        /**
         * Indicates whether chargeback liability shift applies to the transaction. Possible enum
         * values:
         *
         * - `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow,
         * chargeback liability shift applies.
         * - `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer
         * Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the
         * acquirer and in this case the `acquirer_exemption` field is expected to be not `NONE`.
         * - `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is
         * liable.
         * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
         * cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
         */
        @JsonProperty("liability_shift") @ExcludeMissing fun _liabilityShift() = liabilityShift

        /**
         * Verification attempted values:
         *
         * - `APP_LOGIN`: Out-of-band login verification was attempted by the ACS.
         * - `BIOMETRIC`: Out-of-band biometric verification was attempted by the ACS.
         * - `NONE`: No cardholder verification was attempted by the Access Control Server (e.g.
         * frictionless 3-D Secure flow, no 3-D Secure, or stand-in Risk Based Analysis).
         * - `OTHER`: Other method was used by the ACS to verify the cardholder (e.g. Mastercard
         * Identity Check Express, recurring transactions, etc.)
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
         *
         * - `CANCELLED`: Authentication/Account verification could not be performed, `transStatus =
         * U`.
         * - `FAILED`: Transaction was not authenticated. `transStatus = N`, note: the utilization
         * of exemptions could also result in `transStatus = N`, inspect the `acquirer_exemption`
         * field for more information.
         * - `FRICTIONLESS`: Attempts processing performed, the transaction was not authenticated,
         * but a proof of attempted authentication/verification is provided. `transStatus = A` and
         * the leading AAV indicator was one of {`kE`, `kF`, `kQ`}.
         * - `NOT_ATTEMPTED`: A 3-D Secure flow was not applied to this transaction. Leading AAV
         * indicator was one of {`kN`, `kX`} or no AAV was provided for the transaction.
         * - `REJECTED`: Authentication/Account Verification rejected; `transStatus = R`. Issuer is
         * rejecting authentication/verification and requests that authorization not be attempted.
         * - `SUCCESS`: Authentication verification successful. `transStatus = Y` and leading AAV
         * indicator for the transaction was one of {`kA`, `kB`, `kC`, `kD`, `kO`, `kP`, `kR`,
         * `kS`}.
         *
         * Note that the following `transStatus` values are not represented by this field:
         *
         * - `C`: Challenge Required
         * - `D`: Challenge Required; decoupled authentication confirmed
         * - `I`: Informational only
         * - `S`: Challenge using Secure Payment Confirmation (SPC)
         */
        @JsonProperty("verification_result")
        @ExcludeMissing
        fun _verificationResult() = verificationResult

        /**
         * Unique identifier you can use to match a given 3DS authentication and the transaction.
         * Note that in cases where liability shift does not occur, this token is matched to the
         * transaction on a best-effort basis.
         */
        @JsonProperty("three_ds_authentication_token")
        @ExcludeMissing
        fun _threeDSAuthenticationToken() = threeDSAuthenticationToken

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
                verificationAttempted()
                verificationResult()
                threeDSAuthenticationToken()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CardholderAuthentication &&
                this._3dsVersion == other._3dsVersion &&
                this.acquirerExemption == other.acquirerExemption &&
                this.authenticationResult == other.authenticationResult &&
                this.decisionMadeBy == other.decisionMadeBy &&
                this.liabilityShift == other.liabilityShift &&
                this.verificationAttempted == other.verificationAttempted &&
                this.verificationResult == other.verificationResult &&
                this.threeDSAuthenticationToken == other.threeDSAuthenticationToken &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        _3dsVersion,
                        acquirerExemption,
                        authenticationResult,
                        decisionMadeBy,
                        liabilityShift,
                        verificationAttempted,
                        verificationResult,
                        threeDSAuthenticationToken,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "CardholderAuthentication{_3dsVersion=$_3dsVersion, acquirerExemption=$acquirerExemption, authenticationResult=$authenticationResult, decisionMadeBy=$decisionMadeBy, liabilityShift=$liabilityShift, verificationAttempted=$verificationAttempted, verificationResult=$verificationResult, threeDSAuthenticationToken=$threeDSAuthenticationToken, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var _3dsVersion: JsonField<String> = JsonMissing.of()
            private var acquirerExemption: JsonField<AcquirerExemption> = JsonMissing.of()
            private var authenticationResult: JsonField<AuthenticationResult> = JsonMissing.of()
            private var decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of()
            private var liabilityShift: JsonField<LiabilityShift> = JsonMissing.of()
            private var verificationAttempted: JsonField<VerificationAttempted> = JsonMissing.of()
            private var verificationResult: JsonField<VerificationResult> = JsonMissing.of()
            private var threeDSAuthenticationToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(cardholderAuthentication: CardholderAuthentication) = apply {
                this._3dsVersion = cardholderAuthentication._3dsVersion
                this.acquirerExemption = cardholderAuthentication.acquirerExemption
                this.authenticationResult = cardholderAuthentication.authenticationResult
                this.decisionMadeBy = cardholderAuthentication.decisionMadeBy
                this.liabilityShift = cardholderAuthentication.liabilityShift
                this.verificationAttempted = cardholderAuthentication.verificationAttempted
                this.verificationResult = cardholderAuthentication.verificationResult
                this.threeDSAuthenticationToken =
                    cardholderAuthentication.threeDSAuthenticationToken
                additionalProperties(cardholderAuthentication.additionalProperties)
            }

            /**
             * 3-D Secure Protocol version. Possible enum values:
             *
             * - `1`: 3-D Secure Protocol version 1.x applied to the transaction.
             * - `2`: 3-D Secure Protocol version 2.x applied to the transaction.
             * - `null`: 3-D Secure was not used for the transaction
             */
            fun _3dsVersion(_3dsVersion: String) = _3dsVersion(JsonField.of(_3dsVersion))

            /**
             * 3-D Secure Protocol version. Possible enum values:
             *
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
             *
             * - `AUTHENTICATION_OUTAGE_EXCEPTION`: Authentication Outage Exception exemption.
             * - `LOW_VALUE`: Low Value Payment exemption.
             * - `MERCHANT_INITIATED_TRANSACTION`: Merchant Initiated Transaction (3RI).
             * - `NONE`: No exemption applied.
             * - `RECURRING_PAYMENT`: Recurring Payment exemption.
             * - `SECURE_CORPORATE_PAYMENT`: Secure Corporate Payment exemption.
             * - `STRONG_CUSTOMER_AUTHENTICATION_DELEGATION`: Strong Customer Authentication
             * Delegation exemption.
             * - `TRANSACTION_RISK_ANALYSIS`: Acquirer Low-Fraud and Transaction Risk Analysis
             * exemption.
             *
             * Maps to the 3-D Secure `transChallengeExemption` field.
             */
            fun acquirerExemption(acquirerExemption: AcquirerExemption) =
                acquirerExemption(JsonField.of(acquirerExemption))

            /**
             * Exemption applied by the ACS to authenticate the transaction without requesting a
             * challenge. Possible enum values:
             *
             * - `AUTHENTICATION_OUTAGE_EXCEPTION`: Authentication Outage Exception exemption.
             * - `LOW_VALUE`: Low Value Payment exemption.
             * - `MERCHANT_INITIATED_TRANSACTION`: Merchant Initiated Transaction (3RI).
             * - `NONE`: No exemption applied.
             * - `RECURRING_PAYMENT`: Recurring Payment exemption.
             * - `SECURE_CORPORATE_PAYMENT`: Secure Corporate Payment exemption.
             * - `STRONG_CUSTOMER_AUTHENTICATION_DELEGATION`: Strong Customer Authentication
             * Delegation exemption.
             * - `TRANSACTION_RISK_ANALYSIS`: Acquirer Low-Fraud and Transaction Risk Analysis
             * exemption.
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
             *
             * - `SUCCESS`: 3DS authentication was successful and the transaction is considered
             * authenticated.
             * - `DECLINE`: 3DS authentication was attempted but was unsuccessful — i.e., the issuer
             * declined to authenticate the cardholder; note that Lithic populates this value on a
             * best-effort basis based on common data across the 3DS authentication and ASA data
             * elements.
             * - `ATTEMPTS`: 3DS authentication was attempted but full authentication did not occur.
             * A proof of attempted authenticated is provided by the merchant.
             * - `NONE`: 3DS authentication was not performed on the transaction.
             */
            fun authenticationResult(authenticationResult: AuthenticationResult) =
                authenticationResult(JsonField.of(authenticationResult))

            /**
             * Outcome of the 3DS authentication process. Possible enum values:
             *
             * - `SUCCESS`: 3DS authentication was successful and the transaction is considered
             * authenticated.
             * - `DECLINE`: 3DS authentication was attempted but was unsuccessful — i.e., the issuer
             * declined to authenticate the cardholder; note that Lithic populates this value on a
             * best-effort basis based on common data across the 3DS authentication and ASA data
             * elements.
             * - `ATTEMPTS`: 3DS authentication was attempted but full authentication did not occur.
             * A proof of attempted authenticated is provided by the merchant.
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
             *
             * - `NETWORK`: A networks tand-in service decided on the outcome; for token
             * authentications (as indicated in the `liability_shift` attribute), this is the
             * default value
             * - `LITHIC_DEFAULT`: A default decision was made by Lithic, without running a
             * rules-based authentication; this value will be set on card programs that do not
             * participate in one of our two 3DS product tiers
             * - `LITHIC_RULES`: A rules-based authentication was conducted by Lithic and Lithic
             * decided on the outcome
             * - `CUSTOMER_ENDPOINT`: Lithic customer decided on the outcome based on a real-time
             * request sent to a configured endpoint
             * - `UNKNOWN`: Data on which party decided is unavailable
             */
            fun decisionMadeBy(decisionMadeBy: DecisionMadeBy) =
                decisionMadeBy(JsonField.of(decisionMadeBy))

            /**
             * Indicator for which party made the 3DS authentication decision. Possible enum values:
             *
             * - `NETWORK`: A networks tand-in service decided on the outcome; for token
             * authentications (as indicated in the `liability_shift` attribute), this is the
             * default value
             * - `LITHIC_DEFAULT`: A default decision was made by Lithic, without running a
             * rules-based authentication; this value will be set on card programs that do not
             * participate in one of our two 3DS product tiers
             * - `LITHIC_RULES`: A rules-based authentication was conducted by Lithic and Lithic
             * decided on the outcome
             * - `CUSTOMER_ENDPOINT`: Lithic customer decided on the outcome based on a real-time
             * request sent to a configured endpoint
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
             *
             * - `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure
             * flow, chargeback liability shift applies.
             * - `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer
             * Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the
             * acquirer and in this case the `acquirer_exemption` field is expected to be not
             * `NONE`.
             * - `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant
             * is liable.
             * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
             * cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
             */
            fun liabilityShift(liabilityShift: LiabilityShift) =
                liabilityShift(JsonField.of(liabilityShift))

            /**
             * Indicates whether chargeback liability shift applies to the transaction. Possible
             * enum values:
             *
             * - `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure
             * flow, chargeback liability shift applies.
             * - `ACQUIRER_EXEMPTION`: The acquirer utilised an exemption to bypass Strong Customer
             * Authentication (`transStatus = N`, or `transStatus = I`). Liability remains with the
             * acquirer and in this case the `acquirer_exemption` field is expected to be not
             * `NONE`.
             * - `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant
             * is liable.
             * - `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
             * cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
             */
            @JsonProperty("liability_shift")
            @ExcludeMissing
            fun liabilityShift(liabilityShift: JsonField<LiabilityShift>) = apply {
                this.liabilityShift = liabilityShift
            }

            /**
             * Verification attempted values:
             *
             * - `APP_LOGIN`: Out-of-band login verification was attempted by the ACS.
             * - `BIOMETRIC`: Out-of-band biometric verification was attempted by the ACS.
             * - `NONE`: No cardholder verification was attempted by the Access Control Server (e.g.
             * frictionless 3-D Secure flow, no 3-D Secure, or stand-in Risk Based Analysis).
             * - `OTHER`: Other method was used by the ACS to verify the cardholder (e.g. Mastercard
             * Identity Check Express, recurring transactions, etc.)
             * - `OTP`: One-time password verification was attempted by the ACS.
             */
            fun verificationAttempted(verificationAttempted: VerificationAttempted) =
                verificationAttempted(JsonField.of(verificationAttempted))

            /**
             * Verification attempted values:
             *
             * - `APP_LOGIN`: Out-of-band login verification was attempted by the ACS.
             * - `BIOMETRIC`: Out-of-band biometric verification was attempted by the ACS.
             * - `NONE`: No cardholder verification was attempted by the Access Control Server (e.g.
             * frictionless 3-D Secure flow, no 3-D Secure, or stand-in Risk Based Analysis).
             * - `OTHER`: Other method was used by the ACS to verify the cardholder (e.g. Mastercard
             * Identity Check Express, recurring transactions, etc.)
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
             *
             * - `CANCELLED`: Authentication/Account verification could not be performed,
             * `transStatus = U`.
             * - `FAILED`: Transaction was not authenticated. `transStatus = N`, note: the
             * utilization of exemptions could also result in `transStatus = N`, inspect the
             * `acquirer_exemption` field for more information.
             * - `FRICTIONLESS`: Attempts processing performed, the transaction was not
             * authenticated, but a proof of attempted authentication/verification is provided.
             * `transStatus = A` and the leading AAV indicator was one of {`kE`, `kF`, `kQ`}.
             * - `NOT_ATTEMPTED`: A 3-D Secure flow was not applied to this transaction. Leading AAV
             * indicator was one of {`kN`, `kX`} or no AAV was provided for the transaction.
             * - `REJECTED`: Authentication/Account Verification rejected; `transStatus = R`. Issuer
             * is rejecting authentication/verification and requests that authorization not be
             * attempted.
             * - `SUCCESS`: Authentication verification successful. `transStatus = Y` and leading
             * AAV indicator for the transaction was one of {`kA`, `kB`, `kC`, `kD`, `kO`, `kP`,
             * `kR`, `kS`}.
             *
             * Note that the following `transStatus` values are not represented by this field:
             *
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
             *
             * - `CANCELLED`: Authentication/Account verification could not be performed,
             * `transStatus = U`.
             * - `FAILED`: Transaction was not authenticated. `transStatus = N`, note: the
             * utilization of exemptions could also result in `transStatus = N`, inspect the
             * `acquirer_exemption` field for more information.
             * - `FRICTIONLESS`: Attempts processing performed, the transaction was not
             * authenticated, but a proof of attempted authentication/verification is provided.
             * `transStatus = A` and the leading AAV indicator was one of {`kE`, `kF`, `kQ`}.
             * - `NOT_ATTEMPTED`: A 3-D Secure flow was not applied to this transaction. Leading AAV
             * indicator was one of {`kN`, `kX`} or no AAV was provided for the transaction.
             * - `REJECTED`: Authentication/Account Verification rejected; `transStatus = R`. Issuer
             * is rejecting authentication/verification and requests that authorization not be
             * attempted.
             * - `SUCCESS`: Authentication verification successful. `transStatus = Y` and leading
             * AAV indicator for the transaction was one of {`kA`, `kB`, `kC`, `kD`, `kO`, `kP`,
             * `kR`, `kS`}.
             *
             * Note that the following `transStatus` values are not represented by this field:
             *
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
                    verificationAttempted,
                    verificationResult,
                    threeDSAuthenticationToken,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class AcquirerExemption
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AcquirerExemption && this.value == other.value
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
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AuthenticationResult && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val SUCCESS = AuthenticationResult(JsonField.of("SUCCESS"))

                @JvmField val DECLINE = AuthenticationResult(JsonField.of("DECLINE"))

                @JvmField val ATTEMPTS = AuthenticationResult(JsonField.of("ATTEMPTS"))

                @JvmField val NONE = AuthenticationResult(JsonField.of("NONE"))

                @JvmStatic fun of(value: String) = AuthenticationResult(JsonField.of(value))
            }

            enum class Known {
                SUCCESS,
                DECLINE,
                ATTEMPTS,
                NONE,
            }

            enum class Value {
                SUCCESS,
                DECLINE,
                ATTEMPTS,
                NONE,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SUCCESS -> Value.SUCCESS
                    DECLINE -> Value.DECLINE
                    ATTEMPTS -> Value.ATTEMPTS
                    NONE -> Value.NONE
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SUCCESS -> Known.SUCCESS
                    DECLINE -> Known.DECLINE
                    ATTEMPTS -> Known.ATTEMPTS
                    NONE -> Known.NONE
                    else -> throw LithicInvalidDataException("Unknown AuthenticationResult: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class DecisionMadeBy
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is DecisionMadeBy && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val NETWORK = DecisionMadeBy(JsonField.of("NETWORK"))

                @JvmField val LITHIC_DEFAULT = DecisionMadeBy(JsonField.of("LITHIC_DEFAULT"))

                @JvmField val LITHIC_RULES = DecisionMadeBy(JsonField.of("LITHIC_RULES"))

                @JvmField val CUSTOMER_ENDPOINT = DecisionMadeBy(JsonField.of("CUSTOMER_ENDPOINT"))

                @JvmField val UNKNOWN = DecisionMadeBy(JsonField.of("UNKNOWN"))

                @JvmStatic fun of(value: String) = DecisionMadeBy(JsonField.of(value))
            }

            enum class Known {
                NETWORK,
                LITHIC_DEFAULT,
                LITHIC_RULES,
                CUSTOMER_ENDPOINT,
                UNKNOWN,
            }

            enum class Value {
                NETWORK,
                LITHIC_DEFAULT,
                LITHIC_RULES,
                CUSTOMER_ENDPOINT,
                UNKNOWN,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    NETWORK -> Value.NETWORK
                    LITHIC_DEFAULT -> Value.LITHIC_DEFAULT
                    LITHIC_RULES -> Value.LITHIC_RULES
                    CUSTOMER_ENDPOINT -> Value.CUSTOMER_ENDPOINT
                    UNKNOWN -> Value.UNKNOWN
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    NETWORK -> Known.NETWORK
                    LITHIC_DEFAULT -> Known.LITHIC_DEFAULT
                    LITHIC_RULES -> Known.LITHIC_RULES
                    CUSTOMER_ENDPOINT -> Known.CUSTOMER_ENDPOINT
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw LithicInvalidDataException("Unknown DecisionMadeBy: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class LiabilityShift
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is LiabilityShift && this.value == other.value
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
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VerificationAttempted && this.value == other.value
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
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is VerificationResult && this.value == other.value
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
    }
}
