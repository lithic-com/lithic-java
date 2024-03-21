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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = LineItemListResponse.Builder::class)
@NoAutoDetect
class LineItemListResponse
private constructor(
    private val amount: JsonField<Long>,
    private val cardToken: JsonField<String>,
    private val category: JsonField<Category>,
    private val created: JsonField<OffsetDateTime>,
    private val currency: JsonField<String>,
    private val descriptor: JsonField<String>,
    private val eventType: JsonField<FinancialEventType>,
    private val financialAccountToken: JsonField<String>,
    private val financialTransactionToken: JsonField<String>,
    private val settledDate: JsonField<LocalDate>,
    private val token: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    fun amount(): Long = amount.getRequired("amount")

    /** Globally unique identifier for a card */
    fun cardToken(): Optional<String> = Optional.ofNullable(cardToken.getNullable("card_token"))

    fun category(): Category = category.getRequired("category")

    /** Timestamp of when the line item was generated */
    fun created(): OffsetDateTime = created.getRequired("created")

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
    fun currency(): String = currency.getRequired("currency")

    fun descriptor(): Optional<String> = Optional.ofNullable(descriptor.getNullable("descriptor"))

    /**
     * Event types:
     * - `ACH_INSUFFICIENT_FUNDS` - Attempted ACH origination declined due to insufficient balance.
     * - `ACH_ORIGINATION_PENDING` - ACH origination pending release from an ACH hold.
     * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available balance.
     * - `ACH_RECEIPT_PENDING` - ACH receipt pending release from an ACH holder.
     * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
     * - `ACH_RETURN` - ACH origination returned by the Receiving Depository Financial Institution.
     * - `AUTHORIZATION` - Authorize a card transaction.
     * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
     * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
     * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
     * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred on a
     *   card.
     * - `CLEARING` - Card Transaction is settled.
     * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
     * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
     * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
     * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your behalf by
     *   the network.
     * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
     *   additional clearing.
     * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card funds
     *   without additional clearing.
     * - `RETURN` - A card refund has been processed on the transaction.
     * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses an
     *   incorrect refund).
     * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
     * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to insufficient
     *   balance of the sender.
     */
    fun eventType(): FinancialEventType = eventType.getRequired("event_type")

    /** Globally unique identifier for a financial account */
    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    /** Globally unique identifier for a financial transaction */
    fun financialTransactionToken(): String =
        financialTransactionToken.getRequired("financial_transaction_token")

    /** Date that the transaction settled */
    fun settledDate(): LocalDate = settledDate.getRequired("settled_date")

    /** Globally unique identifier for a Statement Line Item */
    fun token(): String = token.getRequired("token")

    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /** Globally unique identifier for a card */
    @JsonProperty("card_token") @ExcludeMissing fun _cardToken() = cardToken

    @JsonProperty("category") @ExcludeMissing fun _category() = category

    /** Timestamp of when the line item was generated */
    @JsonProperty("created") @ExcludeMissing fun _created() = created

    /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

    /**
     * Event types:
     * - `ACH_INSUFFICIENT_FUNDS` - Attempted ACH origination declined due to insufficient balance.
     * - `ACH_ORIGINATION_PENDING` - ACH origination pending release from an ACH hold.
     * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available balance.
     * - `ACH_RECEIPT_PENDING` - ACH receipt pending release from an ACH holder.
     * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
     * - `ACH_RETURN` - ACH origination returned by the Receiving Depository Financial Institution.
     * - `AUTHORIZATION` - Authorize a card transaction.
     * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
     * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
     * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
     * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred on a
     *   card.
     * - `CLEARING` - Card Transaction is settled.
     * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
     * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
     * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
     * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your behalf by
     *   the network.
     * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
     *   additional clearing.
     * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card funds
     *   without additional clearing.
     * - `RETURN` - A card refund has been processed on the transaction.
     * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses an
     *   incorrect refund).
     * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
     * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to insufficient
     *   balance of the sender.
     */
    @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

    /** Globally unique identifier for a financial account */
    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    /** Globally unique identifier for a financial transaction */
    @JsonProperty("financial_transaction_token")
    @ExcludeMissing
    fun _financialTransactionToken() = financialTransactionToken

    /** Date that the transaction settled */
    @JsonProperty("settled_date") @ExcludeMissing fun _settledDate() = settledDate

    /** Globally unique identifier for a Statement Line Item */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): LineItemListResponse = apply {
        if (!validated) {
            amount()
            cardToken()
            category()
            created()
            currency()
            descriptor()
            eventType()
            financialAccountToken()
            financialTransactionToken()
            settledDate()
            token()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LineItemListResponse &&
            this.amount == other.amount &&
            this.cardToken == other.cardToken &&
            this.category == other.category &&
            this.created == other.created &&
            this.currency == other.currency &&
            this.descriptor == other.descriptor &&
            this.eventType == other.eventType &&
            this.financialAccountToken == other.financialAccountToken &&
            this.financialTransactionToken == other.financialTransactionToken &&
            this.settledDate == other.settledDate &&
            this.token == other.token &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    amount,
                    cardToken,
                    category,
                    created,
                    currency,
                    descriptor,
                    eventType,
                    financialAccountToken,
                    financialTransactionToken,
                    settledDate,
                    token,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "LineItemListResponse{amount=$amount, cardToken=$cardToken, category=$category, created=$created, currency=$currency, descriptor=$descriptor, eventType=$eventType, financialAccountToken=$financialAccountToken, financialTransactionToken=$financialTransactionToken, settledDate=$settledDate, token=$token, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<Long> = JsonMissing.of()
        private var cardToken: JsonField<String> = JsonMissing.of()
        private var category: JsonField<Category> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var descriptor: JsonField<String> = JsonMissing.of()
        private var eventType: JsonField<FinancialEventType> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var financialTransactionToken: JsonField<String> = JsonMissing.of()
        private var settledDate: JsonField<LocalDate> = JsonMissing.of()
        private var token: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(lineItemListResponse: LineItemListResponse) = apply {
            this.amount = lineItemListResponse.amount
            this.cardToken = lineItemListResponse.cardToken
            this.category = lineItemListResponse.category
            this.created = lineItemListResponse.created
            this.currency = lineItemListResponse.currency
            this.descriptor = lineItemListResponse.descriptor
            this.eventType = lineItemListResponse.eventType
            this.financialAccountToken = lineItemListResponse.financialAccountToken
            this.financialTransactionToken = lineItemListResponse.financialTransactionToken
            this.settledDate = lineItemListResponse.settledDate
            this.token = lineItemListResponse.token
            additionalProperties(lineItemListResponse.additionalProperties)
        }

        fun amount(amount: Long) = amount(JsonField.of(amount))

        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /** Globally unique identifier for a card */
        fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

        /** Globally unique identifier for a card */
        @JsonProperty("card_token")
        @ExcludeMissing
        fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

        fun category(category: Category) = category(JsonField.of(category))

        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<Category>) = apply { this.category = category }

        /** Timestamp of when the line item was generated */
        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        /** Timestamp of when the line item was generated */
        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
        fun currency(currency: String) = currency(JsonField.of(currency))

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

        @JsonProperty("descriptor")
        @ExcludeMissing
        fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

        /**
         * Event types:
         * - `ACH_INSUFFICIENT_FUNDS` - Attempted ACH origination declined due to insufficient
         *   balance.
         * - `ACH_ORIGINATION_PENDING` - ACH origination pending release from an ACH hold.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * - `ACH_RECEIPT_PENDING` - ACH receipt pending release from an ACH holder.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * - `ACH_RETURN` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * - `AUTHORIZATION` - Authorize a card transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
         * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred
         *   on a card.
         * - `CLEARING` - Card Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your behalf
         *   by the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
         *   additional clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card
         *   funds without additional clearing.
         * - `RETURN` - A card refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses an
         *   incorrect refund).
         * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
         * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to insufficient
         *   balance of the sender.
         */
        fun eventType(eventType: FinancialEventType) = eventType(JsonField.of(eventType))

        /**
         * Event types:
         * - `ACH_INSUFFICIENT_FUNDS` - Attempted ACH origination declined due to insufficient
         *   balance.
         * - `ACH_ORIGINATION_PENDING` - ACH origination pending release from an ACH hold.
         * - `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
         *   balance.
         * - `ACH_RECEIPT_PENDING` - ACH receipt pending release from an ACH holder.
         * - `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance.
         * - `ACH_RETURN` - ACH origination returned by the Receiving Depository Financial
         *   Institution.
         * - `AUTHORIZATION` - Authorize a card transaction.
         * - `AUTHORIZATION_ADVICE` - Advice on a card transaction.
         * - `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic.
         * - `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant.
         * - `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred
         *   on a card.
         * - `CLEARING` - Card Transaction is settled.
         * - `CORRECTION_DEBIT` - Manual card transaction correction (Debit).
         * - `CORRECTION_CREDIT` - Manual card transaction correction (Credit).
         * - `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant.
         * - `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your behalf
         *   by the network.
         * - `FINANCIAL_AUTHORIZATION` - A request from a merchant to debit card funds without
         *   additional clearing.
         * - `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card
         *   funds without additional clearing.
         * - `RETURN` - A card refund has been processed on the transaction.
         * - `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant reverses an
         *   incorrect refund).
         * - `TRANSFER` - Successful internal transfer of funds between financial accounts.
         * - `TRANSFER_INSUFFICIENT_FUNDS` - Declined internl transfer of funds due to insufficient
         *   balance of the sender.
         */
        @JsonProperty("event_type")
        @ExcludeMissing
        fun eventType(eventType: JsonField<FinancialEventType>) = apply {
            this.eventType = eventType
        }

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        /** Globally unique identifier for a financial account */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        /** Globally unique identifier for a financial transaction */
        fun financialTransactionToken(financialTransactionToken: String) =
            financialTransactionToken(JsonField.of(financialTransactionToken))

        /** Globally unique identifier for a financial transaction */
        @JsonProperty("financial_transaction_token")
        @ExcludeMissing
        fun financialTransactionToken(financialTransactionToken: JsonField<String>) = apply {
            this.financialTransactionToken = financialTransactionToken
        }

        /** Date that the transaction settled */
        fun settledDate(settledDate: LocalDate) = settledDate(JsonField.of(settledDate))

        /** Date that the transaction settled */
        @JsonProperty("settled_date")
        @ExcludeMissing
        fun settledDate(settledDate: JsonField<LocalDate>) = apply {
            this.settledDate = settledDate
        }

        /** Globally unique identifier for a Statement Line Item */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier for a Statement Line Item */
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

        fun build(): LineItemListResponse =
            LineItemListResponse(
                amount,
                cardToken,
                category,
                created,
                currency,
                descriptor,
                eventType,
                financialAccountToken,
                financialTransactionToken,
                settledDate,
                token,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Category
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Category && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH = Category(JsonField.of("ACH"))

            @JvmField val CARD = Category(JsonField.of("CARD"))

            @JvmField val TRANSFER = Category(JsonField.of("TRANSFER"))

            @JvmStatic fun of(value: String) = Category(JsonField.of(value))
        }

        enum class Known {
            ACH,
            CARD,
            TRANSFER,
        }

        enum class Value {
            ACH,
            CARD,
            TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                CARD -> Value.CARD
                TRANSFER -> Value.TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                CARD -> Known.CARD
                TRANSFER -> Known.TRANSFER
                else -> throw LithicInvalidDataException("Unknown Category: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class FinancialEventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FinancialEventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val ACH_EXCEEDED_THRESHOLD = FinancialEventType(JsonField.of("ACH_EXCEEDED_THRESHOLD"))

            @JvmField
            val ACH_INSUFFICIENT_FUNDS = FinancialEventType(JsonField.of("ACH_INSUFFICIENT_FUNDS"))

            @JvmField
            val ACH_INVALID_ACCOUNT = FinancialEventType(JsonField.of("ACH_INVALID_ACCOUNT"))

            @JvmField
            val ACH_ORIGINATION_PENDING =
                FinancialEventType(JsonField.of("ACH_ORIGINATION_PENDING"))

            @JvmField
            val ACH_ORIGINATION_PROCESSED =
                FinancialEventType(JsonField.of("ACH_ORIGINATION_PROCESSED"))

            @JvmField
            val ACH_ORIGINATION_RELEASED =
                FinancialEventType(JsonField.of("ACH_ORIGINATION_RELEASED"))

            @JvmField
            val ACH_RECEIPT_PENDING = FinancialEventType(JsonField.of("ACH_RECEIPT_PENDING"))

            @JvmField
            val ACH_RECEIPT_RELEASED = FinancialEventType(JsonField.of("ACH_RECEIPT_RELEASED"))

            @JvmField val ACH_RETURN = FinancialEventType(JsonField.of("ACH_RETURN"))

            @JvmField
            val ACH_RETURN_PENDING = FinancialEventType(JsonField.of("ACH_RETURN_PENDING"))

            @JvmField val AUTHORIZATION = FinancialEventType(JsonField.of("AUTHORIZATION"))

            @JvmField
            val AUTHORIZATION_ADVICE = FinancialEventType(JsonField.of("AUTHORIZATION_ADVICE"))

            @JvmField
            val AUTHORIZATION_EXPIRY = FinancialEventType(JsonField.of("AUTHORIZATION_EXPIRY"))

            @JvmField
            val AUTHORIZATION_REVERSAL = FinancialEventType(JsonField.of("AUTHORIZATION_REVERSAL"))

            @JvmField val BALANCE_INQUIRY = FinancialEventType(JsonField.of("BALANCE_INQUIRY"))

            @JvmField val CLEARING = FinancialEventType(JsonField.of("CLEARING"))

            @JvmField val CORRECTION_CREDIT = FinancialEventType(JsonField.of("CORRECTION_CREDIT"))

            @JvmField val CORRECTION_DEBIT = FinancialEventType(JsonField.of("CORRECTION_DEBIT"))

            @JvmField
            val CREDIT_AUTHORIZATION = FinancialEventType(JsonField.of("CREDIT_AUTHORIZATION"))

            @JvmField
            val CREDIT_AUTHORIZATION_ADVICE =
                FinancialEventType(JsonField.of("CREDIT_AUTHORIZATION_ADVICE"))

            @JvmField
            val FINANCIAL_AUTHORIZATION =
                FinancialEventType(JsonField.of("FINANCIAL_AUTHORIZATION"))

            @JvmField
            val FINANCIAL_CREDIT_AUTHORIZATION =
                FinancialEventType(JsonField.of("FINANCIAL_CREDIT_AUTHORIZATION"))

            @JvmField val RETURN = FinancialEventType(JsonField.of("RETURN"))

            @JvmField val RETURN_REVERSAL = FinancialEventType(JsonField.of("RETURN_REVERSAL"))

            @JvmField val TRANSFER = FinancialEventType(JsonField.of("TRANSFER"))

            @JvmField
            val TRANSFER_INSUFFICIENT_FUNDS =
                FinancialEventType(JsonField.of("TRANSFER_INSUFFICIENT_FUNDS"))

            @JvmStatic fun of(value: String) = FinancialEventType(JsonField.of(value))
        }

        enum class Known {
            ACH_EXCEEDED_THRESHOLD,
            ACH_INSUFFICIENT_FUNDS,
            ACH_INVALID_ACCOUNT,
            ACH_ORIGINATION_PENDING,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_RELEASED,
            ACH_RECEIPT_PENDING,
            ACH_RECEIPT_RELEASED,
            ACH_RETURN,
            ACH_RETURN_PENDING,
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
            TRANSFER,
            TRANSFER_INSUFFICIENT_FUNDS,
        }

        enum class Value {
            ACH_EXCEEDED_THRESHOLD,
            ACH_INSUFFICIENT_FUNDS,
            ACH_INVALID_ACCOUNT,
            ACH_ORIGINATION_PENDING,
            ACH_ORIGINATION_PROCESSED,
            ACH_ORIGINATION_RELEASED,
            ACH_RECEIPT_PENDING,
            ACH_RECEIPT_RELEASED,
            ACH_RETURN,
            ACH_RETURN_PENDING,
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
            TRANSFER,
            TRANSFER_INSUFFICIENT_FUNDS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH_EXCEEDED_THRESHOLD -> Value.ACH_EXCEEDED_THRESHOLD
                ACH_INSUFFICIENT_FUNDS -> Value.ACH_INSUFFICIENT_FUNDS
                ACH_INVALID_ACCOUNT -> Value.ACH_INVALID_ACCOUNT
                ACH_ORIGINATION_PENDING -> Value.ACH_ORIGINATION_PENDING
                ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                ACH_RECEIPT_PENDING -> Value.ACH_RECEIPT_PENDING
                ACH_RECEIPT_RELEASED -> Value.ACH_RECEIPT_RELEASED
                ACH_RETURN -> Value.ACH_RETURN
                ACH_RETURN_PENDING -> Value.ACH_RETURN_PENDING
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
                TRANSFER -> Value.TRANSFER
                TRANSFER_INSUFFICIENT_FUNDS -> Value.TRANSFER_INSUFFICIENT_FUNDS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_EXCEEDED_THRESHOLD -> Known.ACH_EXCEEDED_THRESHOLD
                ACH_INSUFFICIENT_FUNDS -> Known.ACH_INSUFFICIENT_FUNDS
                ACH_INVALID_ACCOUNT -> Known.ACH_INVALID_ACCOUNT
                ACH_ORIGINATION_PENDING -> Known.ACH_ORIGINATION_PENDING
                ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                ACH_RECEIPT_PENDING -> Known.ACH_RECEIPT_PENDING
                ACH_RECEIPT_RELEASED -> Known.ACH_RECEIPT_RELEASED
                ACH_RETURN -> Known.ACH_RETURN
                ACH_RETURN_PENDING -> Known.ACH_RETURN_PENDING
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
                TRANSFER -> Known.TRANSFER
                TRANSFER_INSUFFICIENT_FUNDS -> Known.TRANSFER_INSUFFICIENT_FUNDS
                else -> throw LithicInvalidDataException("Unknown FinancialEventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
