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
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = StatementLineItems.Builder::class)
@NoAutoDetect
class StatementLineItems
private constructor(
    private val data: JsonField<List<StatementLineItemResponse>>,
    private val hasMore: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun data(): List<StatementLineItemResponse> = data.getRequired("data")

    fun hasMore(): Boolean = hasMore.getRequired("has_more")

    @JsonProperty("data") @ExcludeMissing fun _data() = data

    @JsonProperty("has_more") @ExcludeMissing fun _hasMore() = hasMore

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): StatementLineItems = apply {
        if (!validated) {
            data().forEach { it.validate() }
            hasMore()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var data: JsonField<List<StatementLineItemResponse>> = JsonMissing.of()
        private var hasMore: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(statementLineItems: StatementLineItems) = apply {
            this.data = statementLineItems.data
            this.hasMore = statementLineItems.hasMore
            additionalProperties(statementLineItems.additionalProperties)
        }

        fun data(data: List<StatementLineItemResponse>) = data(JsonField.of(data))

        @JsonProperty("data")
        @ExcludeMissing
        fun data(data: JsonField<List<StatementLineItemResponse>>) = apply { this.data = data }

        fun hasMore(hasMore: Boolean) = hasMore(JsonField.of(hasMore))

        @JsonProperty("has_more")
        @ExcludeMissing
        fun hasMore(hasMore: JsonField<Boolean>) = apply { this.hasMore = hasMore }

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

        fun build(): StatementLineItems =
            StatementLineItems(
                data.map { it.toImmutable() },
                hasMore,
                additionalProperties.toImmutable(),
            )
    }

    @JsonDeserialize(builder = StatementLineItemResponse.Builder::class)
    @NoAutoDetect
    class StatementLineItemResponse
    private constructor(
        private val token: JsonField<String>,
        private val financialAccountToken: JsonField<String>,
        private val cardToken: JsonField<String>,
        private val financialTransactionToken: JsonField<String>,
        private val financialTransactionEventToken: JsonField<String>,
        private val category: JsonField<TransactionCategory>,
        private val eventType: JsonField<FinancialEventType>,
        private val effectiveDate: JsonField<LocalDate>,
        private val descriptor: JsonField<String>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** Globally unique identifier for a Statement Line Item */
        fun token(): String = token.getRequired("token")

        /** Globally unique identifier for a financial account */
        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        /** Globally unique identifier for a card */
        fun cardToken(): Optional<String> = Optional.ofNullable(cardToken.getNullable("card_token"))

        /** Globally unique identifier for a financial transaction */
        fun financialTransactionToken(): String =
            financialTransactionToken.getRequired("financial_transaction_token")

        /** Globally unique identifier for a financial transaction event */
        fun financialTransactionEventToken(): String =
            financialTransactionEventToken.getRequired("financial_transaction_event_token")

        fun category(): TransactionCategory = category.getRequired("category")

        fun eventType(): FinancialEventType = eventType.getRequired("event_type")

        /** Date that the transaction effected the account balance */
        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        fun descriptor(): Optional<String> =
            Optional.ofNullable(descriptor.getNullable("descriptor"))

        /** Transaction amount in cents */
        fun amount(): Long = amount.getRequired("amount")

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
        fun currency(): String = currency.getRequired("currency")

        /** Timestamp of when the line item was generated */
        fun created(): OffsetDateTime = created.getRequired("created")

        /** Globally unique identifier for a Statement Line Item */
        @JsonProperty("token") @ExcludeMissing fun _token() = token

        /** Globally unique identifier for a financial account */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken() = financialAccountToken

        /** Globally unique identifier for a card */
        @JsonProperty("card_token") @ExcludeMissing fun _cardToken() = cardToken

        /** Globally unique identifier for a financial transaction */
        @JsonProperty("financial_transaction_token")
        @ExcludeMissing
        fun _financialTransactionToken() = financialTransactionToken

        /** Globally unique identifier for a financial transaction event */
        @JsonProperty("financial_transaction_event_token")
        @ExcludeMissing
        fun _financialTransactionEventToken() = financialTransactionEventToken

        @JsonProperty("category") @ExcludeMissing fun _category() = category

        @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

        /** Date that the transaction effected the account balance */
        @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

        @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

        /** Transaction amount in cents */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** Timestamp of when the line item was generated */
        @JsonProperty("created") @ExcludeMissing fun _created() = created

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): StatementLineItemResponse = apply {
            if (!validated) {
                token()
                financialAccountToken()
                cardToken()
                financialTransactionToken()
                financialTransactionEventToken()
                category()
                eventType()
                effectiveDate()
                descriptor()
                amount()
                currency()
                created()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: JsonField<String> = JsonMissing.of()
            private var financialAccountToken: JsonField<String> = JsonMissing.of()
            private var cardToken: JsonField<String> = JsonMissing.of()
            private var financialTransactionToken: JsonField<String> = JsonMissing.of()
            private var financialTransactionEventToken: JsonField<String> = JsonMissing.of()
            private var category: JsonField<TransactionCategory> = JsonMissing.of()
            private var eventType: JsonField<FinancialEventType> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var descriptor: JsonField<String> = JsonMissing.of()
            private var amount: JsonField<Long> = JsonMissing.of()
            private var currency: JsonField<String> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(statementLineItemResponse: StatementLineItemResponse) = apply {
                this.token = statementLineItemResponse.token
                this.financialAccountToken = statementLineItemResponse.financialAccountToken
                this.cardToken = statementLineItemResponse.cardToken
                this.financialTransactionToken = statementLineItemResponse.financialTransactionToken
                this.financialTransactionEventToken =
                    statementLineItemResponse.financialTransactionEventToken
                this.category = statementLineItemResponse.category
                this.eventType = statementLineItemResponse.eventType
                this.effectiveDate = statementLineItemResponse.effectiveDate
                this.descriptor = statementLineItemResponse.descriptor
                this.amount = statementLineItemResponse.amount
                this.currency = statementLineItemResponse.currency
                this.created = statementLineItemResponse.created
                additionalProperties(statementLineItemResponse.additionalProperties)
            }

            /** Globally unique identifier for a Statement Line Item */
            fun token(token: String) = token(JsonField.of(token))

            /** Globally unique identifier for a Statement Line Item */
            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            /** Globally unique identifier for a financial account */
            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            /** Globally unique identifier for a financial account */
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            /** Globally unique identifier for a card */
            fun cardToken(cardToken: String) = cardToken(JsonField.of(cardToken))

            /** Globally unique identifier for a card */
            @JsonProperty("card_token")
            @ExcludeMissing
            fun cardToken(cardToken: JsonField<String>) = apply { this.cardToken = cardToken }

            /** Globally unique identifier for a financial transaction */
            fun financialTransactionToken(financialTransactionToken: String) =
                financialTransactionToken(JsonField.of(financialTransactionToken))

            /** Globally unique identifier for a financial transaction */
            @JsonProperty("financial_transaction_token")
            @ExcludeMissing
            fun financialTransactionToken(financialTransactionToken: JsonField<String>) = apply {
                this.financialTransactionToken = financialTransactionToken
            }

            /** Globally unique identifier for a financial transaction event */
            fun financialTransactionEventToken(financialTransactionEventToken: String) =
                financialTransactionEventToken(JsonField.of(financialTransactionEventToken))

            /** Globally unique identifier for a financial transaction event */
            @JsonProperty("financial_transaction_event_token")
            @ExcludeMissing
            fun financialTransactionEventToken(financialTransactionEventToken: JsonField<String>) =
                apply {
                    this.financialTransactionEventToken = financialTransactionEventToken
                }

            fun category(category: TransactionCategory) = category(JsonField.of(category))

            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<TransactionCategory>) = apply {
                this.category = category
            }

            fun eventType(eventType: FinancialEventType) = eventType(JsonField.of(eventType))

            @JsonProperty("event_type")
            @ExcludeMissing
            fun eventType(eventType: JsonField<FinancialEventType>) = apply {
                this.eventType = eventType
            }

            /** Date that the transaction effected the account balance */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /** Date that the transaction effected the account balance */
            @JsonProperty("effective_date")
            @ExcludeMissing
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            @JsonProperty("descriptor")
            @ExcludeMissing
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            /** Transaction amount in cents */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** Transaction amount in cents */
            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
            fun currency(currency: String) = currency(JsonField.of(currency))

            /** 3-digit alphabetic ISO 4217 code for the settling currency of the transaction */
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<String>) = apply { this.currency = currency }

            /** Timestamp of when the line item was generated */
            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            /** Timestamp of when the line item was generated */
            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

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

            fun build(): StatementLineItemResponse =
                StatementLineItemResponse(
                    token,
                    financialAccountToken,
                    cardToken,
                    financialTransactionToken,
                    financialTransactionEventToken,
                    category,
                    eventType,
                    effectiveDate,
                    descriptor,
                    amount,
                    currency,
                    created,
                    additionalProperties.toImmutable(),
                )
        }

        class TransactionCategory
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionCategory && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val ACH = TransactionCategory(JsonField.of("ACH"))

                @JvmField val CARD = TransactionCategory(JsonField.of("CARD"))

                @JvmField val EXTERNAL_ACH = TransactionCategory(JsonField.of("EXTERNAL_ACH"))

                @JvmField val EXTERNAL_CHECK = TransactionCategory(JsonField.of("EXTERNAL_CHECK"))

                @JvmField
                val EXTERNAL_TRANSFER = TransactionCategory(JsonField.of("EXTERNAL_TRANSFER"))

                @JvmField val EXTERNAL_WIRE = TransactionCategory(JsonField.of("EXTERNAL_WIRE"))

                @JvmField
                val MANAGEMENT_ADJUSTMENT =
                    TransactionCategory(JsonField.of("MANAGEMENT_ADJUSTMENT"))

                @JvmField
                val MANAGEMENT_DISPUTE = TransactionCategory(JsonField.of("MANAGEMENT_DISPUTE"))

                @JvmField val MANAGEMENT_FEE = TransactionCategory(JsonField.of("MANAGEMENT_FEE"))

                @JvmField
                val MANAGEMENT_REWARD = TransactionCategory(JsonField.of("MANAGEMENT_REWARD"))

                @JvmStatic fun of(value: String) = TransactionCategory(JsonField.of(value))
            }

            enum class Known {
                ACH,
                CARD,
                EXTERNAL_ACH,
                EXTERNAL_CHECK,
                EXTERNAL_TRANSFER,
                EXTERNAL_WIRE,
                MANAGEMENT_ADJUSTMENT,
                MANAGEMENT_DISPUTE,
                MANAGEMENT_FEE,
                MANAGEMENT_REWARD,
            }

            enum class Value {
                ACH,
                CARD,
                EXTERNAL_ACH,
                EXTERNAL_CHECK,
                EXTERNAL_TRANSFER,
                EXTERNAL_WIRE,
                MANAGEMENT_ADJUSTMENT,
                MANAGEMENT_DISPUTE,
                MANAGEMENT_FEE,
                MANAGEMENT_REWARD,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH -> Value.ACH
                    CARD -> Value.CARD
                    EXTERNAL_ACH -> Value.EXTERNAL_ACH
                    EXTERNAL_CHECK -> Value.EXTERNAL_CHECK
                    EXTERNAL_TRANSFER -> Value.EXTERNAL_TRANSFER
                    EXTERNAL_WIRE -> Value.EXTERNAL_WIRE
                    MANAGEMENT_ADJUSTMENT -> Value.MANAGEMENT_ADJUSTMENT
                    MANAGEMENT_DISPUTE -> Value.MANAGEMENT_DISPUTE
                    MANAGEMENT_FEE -> Value.MANAGEMENT_FEE
                    MANAGEMENT_REWARD -> Value.MANAGEMENT_REWARD
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH -> Known.ACH
                    CARD -> Known.CARD
                    EXTERNAL_ACH -> Known.EXTERNAL_ACH
                    EXTERNAL_CHECK -> Known.EXTERNAL_CHECK
                    EXTERNAL_TRANSFER -> Known.EXTERNAL_TRANSFER
                    EXTERNAL_WIRE -> Known.EXTERNAL_WIRE
                    MANAGEMENT_ADJUSTMENT -> Known.MANAGEMENT_ADJUSTMENT
                    MANAGEMENT_DISPUTE -> Known.MANAGEMENT_DISPUTE
                    MANAGEMENT_FEE -> Known.MANAGEMENT_FEE
                    MANAGEMENT_REWARD -> Known.MANAGEMENT_REWARD
                    else -> throw LithicInvalidDataException("Unknown TransactionCategory: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class FinancialEventType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is FinancialEventType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val ACH_ORIGINATION_CANCELLED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_CANCELLED"))

                @JvmField
                val ACH_ORIGINATION_INITIATED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_INITIATED"))

                @JvmField
                val ACH_ORIGINATION_PROCESSED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_PROCESSED"))

                @JvmField
                val ACH_ORIGINATION_RELEASED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_RELEASED"))

                @JvmField
                val ACH_ORIGINATION_REVIEWED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_REVIEWED"))

                @JvmField
                val ACH_ORIGINATION_SETTLED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_SETTLED"))

                @JvmField
                val ACH_RECEIPT_PROCESSED =
                    FinancialEventType(JsonField.of("ACH_RECEIPT_PROCESSED"))

                @JvmField
                val ACH_RECEIPT_SETTLED = FinancialEventType(JsonField.of("ACH_RECEIPT_SETTLED"))

                @JvmField
                val ACH_RETURN_INITIATED = FinancialEventType(JsonField.of("ACH_RETURN_INITIATED"))

                @JvmField
                val ACH_RETURN_PROCESSED = FinancialEventType(JsonField.of("ACH_RETURN_PROCESSED"))

                @JvmField val AUTHORIZATION = FinancialEventType(JsonField.of("AUTHORIZATION"))

                @JvmField
                val AUTHORIZATION_ADVICE = FinancialEventType(JsonField.of("AUTHORIZATION_ADVICE"))

                @JvmField
                val AUTHORIZATION_EXPIRY = FinancialEventType(JsonField.of("AUTHORIZATION_EXPIRY"))

                @JvmField
                val AUTHORIZATION_REVERSAL =
                    FinancialEventType(JsonField.of("AUTHORIZATION_REVERSAL"))

                @JvmField val BALANCE_INQUIRY = FinancialEventType(JsonField.of("BALANCE_INQUIRY"))

                @JvmField val BILLING_ERROR = FinancialEventType(JsonField.of("BILLING_ERROR"))

                @JvmField
                val BILLING_ERROR_REVERSAL =
                    FinancialEventType(JsonField.of("BILLING_ERROR_REVERSAL"))

                @JvmField val CASH_BACK = FinancialEventType(JsonField.of("CASH_BACK"))

                @JvmField
                val CASH_BACK_REVERSAL = FinancialEventType(JsonField.of("CASH_BACK_REVERSAL"))

                @JvmField val CLEARING = FinancialEventType(JsonField.of("CLEARING"))

                @JvmField
                val CORRECTION_CREDIT = FinancialEventType(JsonField.of("CORRECTION_CREDIT"))

                @JvmField
                val CORRECTION_DEBIT = FinancialEventType(JsonField.of("CORRECTION_DEBIT"))

                @JvmField
                val CREDIT_AUTHORIZATION = FinancialEventType(JsonField.of("CREDIT_AUTHORIZATION"))

                @JvmField
                val CREDIT_AUTHORIZATION_ADVICE =
                    FinancialEventType(JsonField.of("CREDIT_AUTHORIZATION_ADVICE"))

                @JvmField
                val CURRENCY_CONVERSION = FinancialEventType(JsonField.of("CURRENCY_CONVERSION"))

                @JvmField
                val CURRENCY_CONVERSION_REVERSAL =
                    FinancialEventType(JsonField.of("CURRENCY_CONVERSION_REVERSAL"))

                @JvmField val DISPUTE_WON = FinancialEventType(JsonField.of("DISPUTE_WON"))

                @JvmField
                val EXTERNAL_ACH_CANCELED =
                    FinancialEventType(JsonField.of("EXTERNAL_ACH_CANCELED"))

                @JvmField
                val EXTERNAL_ACH_INITIATED =
                    FinancialEventType(JsonField.of("EXTERNAL_ACH_INITIATED"))

                @JvmField
                val EXTERNAL_ACH_RELEASED =
                    FinancialEventType(JsonField.of("EXTERNAL_ACH_RELEASED"))

                @JvmField
                val EXTERNAL_ACH_REVERSED =
                    FinancialEventType(JsonField.of("EXTERNAL_ACH_REVERSED"))

                @JvmField
                val EXTERNAL_ACH_SETTLED = FinancialEventType(JsonField.of("EXTERNAL_ACH_SETTLED"))

                @JvmField
                val EXTERNAL_CHECK_CANCELED =
                    FinancialEventType(JsonField.of("EXTERNAL_CHECK_CANCELED"))

                @JvmField
                val EXTERNAL_CHECK_INITIATED =
                    FinancialEventType(JsonField.of("EXTERNAL_CHECK_INITIATED"))

                @JvmField
                val EXTERNAL_CHECK_RELEASED =
                    FinancialEventType(JsonField.of("EXTERNAL_CHECK_RELEASED"))

                @JvmField
                val EXTERNAL_CHECK_REVERSED =
                    FinancialEventType(JsonField.of("EXTERNAL_CHECK_REVERSED"))

                @JvmField
                val EXTERNAL_CHECK_SETTLED =
                    FinancialEventType(JsonField.of("EXTERNAL_CHECK_SETTLED"))

                @JvmField
                val EXTERNAL_TRANSFER_CANCELED =
                    FinancialEventType(JsonField.of("EXTERNAL_TRANSFER_CANCELED"))

                @JvmField
                val EXTERNAL_TRANSFER_INITIATED =
                    FinancialEventType(JsonField.of("EXTERNAL_TRANSFER_INITIATED"))

                @JvmField
                val EXTERNAL_TRANSFER_RELEASED =
                    FinancialEventType(JsonField.of("EXTERNAL_TRANSFER_RELEASED"))

                @JvmField
                val EXTERNAL_TRANSFER_REVERSED =
                    FinancialEventType(JsonField.of("EXTERNAL_TRANSFER_REVERSED"))

                @JvmField
                val EXTERNAL_TRANSFER_SETTLED =
                    FinancialEventType(JsonField.of("EXTERNAL_TRANSFER_SETTLED"))

                @JvmField
                val EXTERNAL_WIRE_CANCELED =
                    FinancialEventType(JsonField.of("EXTERNAL_WIRE_CANCELED"))

                @JvmField
                val EXTERNAL_WIRE_INITIATED =
                    FinancialEventType(JsonField.of("EXTERNAL_WIRE_INITIATED"))

                @JvmField
                val EXTERNAL_WIRE_RELEASED =
                    FinancialEventType(JsonField.of("EXTERNAL_WIRE_RELEASED"))

                @JvmField
                val EXTERNAL_WIRE_REVERSED =
                    FinancialEventType(JsonField.of("EXTERNAL_WIRE_REVERSED"))

                @JvmField
                val EXTERNAL_WIRE_SETTLED =
                    FinancialEventType(JsonField.of("EXTERNAL_WIRE_SETTLED"))

                @JvmField
                val FINANCIAL_AUTHORIZATION =
                    FinancialEventType(JsonField.of("FINANCIAL_AUTHORIZATION"))

                @JvmField
                val FINANCIAL_CREDIT_AUTHORIZATION =
                    FinancialEventType(JsonField.of("FINANCIAL_CREDIT_AUTHORIZATION"))

                @JvmField val INTEREST = FinancialEventType(JsonField.of("INTEREST"))

                @JvmField
                val INTEREST_REVERSAL = FinancialEventType(JsonField.of("INTEREST_REVERSAL"))

                @JvmField val LATE_PAYMENT = FinancialEventType(JsonField.of("LATE_PAYMENT"))

                @JvmField
                val LATE_PAYMENT_REVERSAL =
                    FinancialEventType(JsonField.of("LATE_PAYMENT_REVERSAL"))

                @JvmField
                val PROVISIONAL_CREDIT = FinancialEventType(JsonField.of("PROVISIONAL_CREDIT"))

                @JvmField
                val PROVISIONAL_CREDIT_REVERSAL =
                    FinancialEventType(JsonField.of("PROVISIONAL_CREDIT_REVERSAL"))

                @JvmField val RETURN = FinancialEventType(JsonField.of("RETURN"))

                @JvmField val RETURN_REVERSAL = FinancialEventType(JsonField.of("RETURN_REVERSAL"))

                @JvmField val TRANSFER = FinancialEventType(JsonField.of("TRANSFER"))

                @JvmField
                val TRANSFER_INSUFFICIENT_FUNDS =
                    FinancialEventType(JsonField.of("TRANSFER_INSUFFICIENT_FUNDS"))

                @JvmStatic fun of(value: String) = FinancialEventType(JsonField.of(value))
            }

            enum class Known {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_ORIGINATION_SETTLED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                BILLING_ERROR,
                BILLING_ERROR_REVERSAL,
                CASH_BACK,
                CASH_BACK_REVERSAL,
                CLEARING,
                CORRECTION_CREDIT,
                CORRECTION_DEBIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                CURRENCY_CONVERSION,
                CURRENCY_CONVERSION_REVERSAL,
                DISPUTE_WON,
                EXTERNAL_ACH_CANCELED,
                EXTERNAL_ACH_INITIATED,
                EXTERNAL_ACH_RELEASED,
                EXTERNAL_ACH_REVERSED,
                EXTERNAL_ACH_SETTLED,
                EXTERNAL_CHECK_CANCELED,
                EXTERNAL_CHECK_INITIATED,
                EXTERNAL_CHECK_RELEASED,
                EXTERNAL_CHECK_REVERSED,
                EXTERNAL_CHECK_SETTLED,
                EXTERNAL_TRANSFER_CANCELED,
                EXTERNAL_TRANSFER_INITIATED,
                EXTERNAL_TRANSFER_RELEASED,
                EXTERNAL_TRANSFER_REVERSED,
                EXTERNAL_TRANSFER_SETTLED,
                EXTERNAL_WIRE_CANCELED,
                EXTERNAL_WIRE_INITIATED,
                EXTERNAL_WIRE_RELEASED,
                EXTERNAL_WIRE_REVERSED,
                EXTERNAL_WIRE_SETTLED,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                INTEREST,
                INTEREST_REVERSAL,
                LATE_PAYMENT,
                LATE_PAYMENT_REVERSAL,
                PROVISIONAL_CREDIT,
                PROVISIONAL_CREDIT_REVERSAL,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
            }

            enum class Value {
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_ORIGINATION_SETTLED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
                AUTHORIZATION,
                AUTHORIZATION_ADVICE,
                AUTHORIZATION_EXPIRY,
                AUTHORIZATION_REVERSAL,
                BALANCE_INQUIRY,
                BILLING_ERROR,
                BILLING_ERROR_REVERSAL,
                CASH_BACK,
                CASH_BACK_REVERSAL,
                CLEARING,
                CORRECTION_CREDIT,
                CORRECTION_DEBIT,
                CREDIT_AUTHORIZATION,
                CREDIT_AUTHORIZATION_ADVICE,
                CURRENCY_CONVERSION,
                CURRENCY_CONVERSION_REVERSAL,
                DISPUTE_WON,
                EXTERNAL_ACH_CANCELED,
                EXTERNAL_ACH_INITIATED,
                EXTERNAL_ACH_RELEASED,
                EXTERNAL_ACH_REVERSED,
                EXTERNAL_ACH_SETTLED,
                EXTERNAL_CHECK_CANCELED,
                EXTERNAL_CHECK_INITIATED,
                EXTERNAL_CHECK_RELEASED,
                EXTERNAL_CHECK_REVERSED,
                EXTERNAL_CHECK_SETTLED,
                EXTERNAL_TRANSFER_CANCELED,
                EXTERNAL_TRANSFER_INITIATED,
                EXTERNAL_TRANSFER_RELEASED,
                EXTERNAL_TRANSFER_REVERSED,
                EXTERNAL_TRANSFER_SETTLED,
                EXTERNAL_WIRE_CANCELED,
                EXTERNAL_WIRE_INITIATED,
                EXTERNAL_WIRE_RELEASED,
                EXTERNAL_WIRE_REVERSED,
                EXTERNAL_WIRE_SETTLED,
                FINANCIAL_AUTHORIZATION,
                FINANCIAL_CREDIT_AUTHORIZATION,
                INTEREST,
                INTEREST_REVERSAL,
                LATE_PAYMENT,
                LATE_PAYMENT_REVERSAL,
                PROVISIONAL_CREDIT,
                PROVISIONAL_CREDIT_REVERSAL,
                RETURN,
                RETURN_REVERSAL,
                TRANSFER,
                TRANSFER_INSUFFICIENT_FUNDS,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
                    AUTHORIZATION -> Value.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Value.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Value.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Value.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Value.BALANCE_INQUIRY
                    BILLING_ERROR -> Value.BILLING_ERROR
                    BILLING_ERROR_REVERSAL -> Value.BILLING_ERROR_REVERSAL
                    CASH_BACK -> Value.CASH_BACK
                    CASH_BACK_REVERSAL -> Value.CASH_BACK_REVERSAL
                    CLEARING -> Value.CLEARING
                    CORRECTION_CREDIT -> Value.CORRECTION_CREDIT
                    CORRECTION_DEBIT -> Value.CORRECTION_DEBIT
                    CREDIT_AUTHORIZATION -> Value.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Value.CREDIT_AUTHORIZATION_ADVICE
                    CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                    CURRENCY_CONVERSION_REVERSAL -> Value.CURRENCY_CONVERSION_REVERSAL
                    DISPUTE_WON -> Value.DISPUTE_WON
                    EXTERNAL_ACH_CANCELED -> Value.EXTERNAL_ACH_CANCELED
                    EXTERNAL_ACH_INITIATED -> Value.EXTERNAL_ACH_INITIATED
                    EXTERNAL_ACH_RELEASED -> Value.EXTERNAL_ACH_RELEASED
                    EXTERNAL_ACH_REVERSED -> Value.EXTERNAL_ACH_REVERSED
                    EXTERNAL_ACH_SETTLED -> Value.EXTERNAL_ACH_SETTLED
                    EXTERNAL_CHECK_CANCELED -> Value.EXTERNAL_CHECK_CANCELED
                    EXTERNAL_CHECK_INITIATED -> Value.EXTERNAL_CHECK_INITIATED
                    EXTERNAL_CHECK_RELEASED -> Value.EXTERNAL_CHECK_RELEASED
                    EXTERNAL_CHECK_REVERSED -> Value.EXTERNAL_CHECK_REVERSED
                    EXTERNAL_CHECK_SETTLED -> Value.EXTERNAL_CHECK_SETTLED
                    EXTERNAL_TRANSFER_CANCELED -> Value.EXTERNAL_TRANSFER_CANCELED
                    EXTERNAL_TRANSFER_INITIATED -> Value.EXTERNAL_TRANSFER_INITIATED
                    EXTERNAL_TRANSFER_RELEASED -> Value.EXTERNAL_TRANSFER_RELEASED
                    EXTERNAL_TRANSFER_REVERSED -> Value.EXTERNAL_TRANSFER_REVERSED
                    EXTERNAL_TRANSFER_SETTLED -> Value.EXTERNAL_TRANSFER_SETTLED
                    EXTERNAL_WIRE_CANCELED -> Value.EXTERNAL_WIRE_CANCELED
                    EXTERNAL_WIRE_INITIATED -> Value.EXTERNAL_WIRE_INITIATED
                    EXTERNAL_WIRE_RELEASED -> Value.EXTERNAL_WIRE_RELEASED
                    EXTERNAL_WIRE_REVERSED -> Value.EXTERNAL_WIRE_REVERSED
                    EXTERNAL_WIRE_SETTLED -> Value.EXTERNAL_WIRE_SETTLED
                    FINANCIAL_AUTHORIZATION -> Value.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Value.FINANCIAL_CREDIT_AUTHORIZATION
                    INTEREST -> Value.INTEREST
                    INTEREST_REVERSAL -> Value.INTEREST_REVERSAL
                    LATE_PAYMENT -> Value.LATE_PAYMENT
                    LATE_PAYMENT_REVERSAL -> Value.LATE_PAYMENT_REVERSAL
                    PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                    PROVISIONAL_CREDIT_REVERSAL -> Value.PROVISIONAL_CREDIT_REVERSAL
                    RETURN -> Value.RETURN
                    RETURN_REVERSAL -> Value.RETURN_REVERSAL
                    TRANSFER -> Value.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Value.TRANSFER_INSUFFICIENT_FUNDS
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
                    AUTHORIZATION -> Known.AUTHORIZATION
                    AUTHORIZATION_ADVICE -> Known.AUTHORIZATION_ADVICE
                    AUTHORIZATION_EXPIRY -> Known.AUTHORIZATION_EXPIRY
                    AUTHORIZATION_REVERSAL -> Known.AUTHORIZATION_REVERSAL
                    BALANCE_INQUIRY -> Known.BALANCE_INQUIRY
                    BILLING_ERROR -> Known.BILLING_ERROR
                    BILLING_ERROR_REVERSAL -> Known.BILLING_ERROR_REVERSAL
                    CASH_BACK -> Known.CASH_BACK
                    CASH_BACK_REVERSAL -> Known.CASH_BACK_REVERSAL
                    CLEARING -> Known.CLEARING
                    CORRECTION_CREDIT -> Known.CORRECTION_CREDIT
                    CORRECTION_DEBIT -> Known.CORRECTION_DEBIT
                    CREDIT_AUTHORIZATION -> Known.CREDIT_AUTHORIZATION
                    CREDIT_AUTHORIZATION_ADVICE -> Known.CREDIT_AUTHORIZATION_ADVICE
                    CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                    CURRENCY_CONVERSION_REVERSAL -> Known.CURRENCY_CONVERSION_REVERSAL
                    DISPUTE_WON -> Known.DISPUTE_WON
                    EXTERNAL_ACH_CANCELED -> Known.EXTERNAL_ACH_CANCELED
                    EXTERNAL_ACH_INITIATED -> Known.EXTERNAL_ACH_INITIATED
                    EXTERNAL_ACH_RELEASED -> Known.EXTERNAL_ACH_RELEASED
                    EXTERNAL_ACH_REVERSED -> Known.EXTERNAL_ACH_REVERSED
                    EXTERNAL_ACH_SETTLED -> Known.EXTERNAL_ACH_SETTLED
                    EXTERNAL_CHECK_CANCELED -> Known.EXTERNAL_CHECK_CANCELED
                    EXTERNAL_CHECK_INITIATED -> Known.EXTERNAL_CHECK_INITIATED
                    EXTERNAL_CHECK_RELEASED -> Known.EXTERNAL_CHECK_RELEASED
                    EXTERNAL_CHECK_REVERSED -> Known.EXTERNAL_CHECK_REVERSED
                    EXTERNAL_CHECK_SETTLED -> Known.EXTERNAL_CHECK_SETTLED
                    EXTERNAL_TRANSFER_CANCELED -> Known.EXTERNAL_TRANSFER_CANCELED
                    EXTERNAL_TRANSFER_INITIATED -> Known.EXTERNAL_TRANSFER_INITIATED
                    EXTERNAL_TRANSFER_RELEASED -> Known.EXTERNAL_TRANSFER_RELEASED
                    EXTERNAL_TRANSFER_REVERSED -> Known.EXTERNAL_TRANSFER_REVERSED
                    EXTERNAL_TRANSFER_SETTLED -> Known.EXTERNAL_TRANSFER_SETTLED
                    EXTERNAL_WIRE_CANCELED -> Known.EXTERNAL_WIRE_CANCELED
                    EXTERNAL_WIRE_INITIATED -> Known.EXTERNAL_WIRE_INITIATED
                    EXTERNAL_WIRE_RELEASED -> Known.EXTERNAL_WIRE_RELEASED
                    EXTERNAL_WIRE_REVERSED -> Known.EXTERNAL_WIRE_REVERSED
                    EXTERNAL_WIRE_SETTLED -> Known.EXTERNAL_WIRE_SETTLED
                    FINANCIAL_AUTHORIZATION -> Known.FINANCIAL_AUTHORIZATION
                    FINANCIAL_CREDIT_AUTHORIZATION -> Known.FINANCIAL_CREDIT_AUTHORIZATION
                    INTEREST -> Known.INTEREST
                    INTEREST_REVERSAL -> Known.INTEREST_REVERSAL
                    LATE_PAYMENT -> Known.LATE_PAYMENT
                    LATE_PAYMENT_REVERSAL -> Known.LATE_PAYMENT_REVERSAL
                    PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                    PROVISIONAL_CREDIT_REVERSAL -> Known.PROVISIONAL_CREDIT_REVERSAL
                    RETURN -> Known.RETURN
                    RETURN_REVERSAL -> Known.RETURN_REVERSAL
                    TRANSFER -> Known.TRANSFER
                    TRANSFER_INSUFFICIENT_FUNDS -> Known.TRANSFER_INSUFFICIENT_FUNDS
                    else -> throw LithicInvalidDataException("Unknown FinancialEventType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StatementLineItemResponse && this.token == other.token && this.financialAccountToken == other.financialAccountToken && this.cardToken == other.cardToken && this.financialTransactionToken == other.financialTransactionToken && this.financialTransactionEventToken == other.financialTransactionEventToken && this.category == other.category && this.eventType == other.eventType && this.effectiveDate == other.effectiveDate && this.descriptor == other.descriptor && this.amount == other.amount && this.currency == other.currency && this.created == other.created && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(token, financialAccountToken, cardToken, financialTransactionToken, financialTransactionEventToken, category, eventType, effectiveDate, descriptor, amount, currency, created, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "StatementLineItemResponse{token=$token, financialAccountToken=$financialAccountToken, cardToken=$cardToken, financialTransactionToken=$financialTransactionToken, financialTransactionEventToken=$financialTransactionEventToken, category=$category, eventType=$eventType, effectiveDate=$effectiveDate, descriptor=$descriptor, amount=$amount, currency=$currency, created=$created, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is StatementLineItems && this.data == other.data && this.hasMore == other.hasMore && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(data, hasMore, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "StatementLineItems{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"
}
