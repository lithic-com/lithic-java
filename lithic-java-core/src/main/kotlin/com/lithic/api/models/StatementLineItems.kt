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

    private var hashCode: Int = 0

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is StatementLineItems &&
            this.data == other.data &&
            this.hasMore == other.hasMore &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    data,
                    hasMore,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "StatementLineItems{data=$data, hasMore=$hasMore, additionalProperties=$additionalProperties}"

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
                data.map { it.toUnmodifiable() },
                hasMore,
                additionalProperties.toUnmodifiable(),
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
        private val category: JsonField<Category>,
        private val eventType: JsonField<FinancialEventType>,
        private val settledDate: JsonField<LocalDate>,
        private val descriptor: JsonField<String>,
        private val amount: JsonField<Long>,
        private val currency: JsonField<String>,
        private val created: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

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

        fun category(): Category = category.getRequired("category")

        /**
         * Event types: _ `ACH_ORIGINATION_INITIATED` - ACH origination received and pending
         * approval/release from an ACH hold. _ `ACH_ORIGINATION_REVIEWED` - ACH origination has
         * completed the review process. _ `ACH_ORIGINATION_CANCELLED` - ACH origination has been
         * cancelled. _ `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to
         * the fed. _ `ACH_ORIGINATION_SETTLED` - ACH origination has settled. _
         * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available balance.
         * _ `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         * Institution. _ `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * _ `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt. _
         * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled. _ `ACH_RECEIPT_RELEASED` - ACH
         * receipt released from pending to available balance. _ `AUTHORIZATION` - Authorize a card
         * transaction. _ `AUTHORIZATION_ADVICE` - Advice on a card transaction. _
         * `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic. _
         * `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant. _
         * `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred on
         * a card. _ `CLEARING` - Card Transaction is settled. _ `CORRECTION_DEBIT` - Manual card
         * transaction correction (Debit). _ `CORRECTION_CREDIT` - Manual card transaction
         * correction (Credit). _ `CREDIT_AUTHORIZATION` - A refund or credit card authorization
         * from a merchant. _ `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was
         * approved on your behalf by the network. _ `FINANCIAL_AUTHORIZATION` - A request from a
         * merchant to debit card funds without additional clearing. _
         * `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card
         * funds without additional clearing. _ `RETURN` - A card refund has been processed on the
         * transaction. _ `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant
         * reverses an incorrect refund). _ `TRANSFER` - Successful internal transfer of funds
         * between financial accounts. \* `TRANSFER_INSUFFICIENT_FUNDS` - Declined internal transfer
         * of funds due to insufficient balance of the sender.
         */
        fun eventType(): FinancialEventType = eventType.getRequired("event_type")

        /** Date that the transaction settled */
        fun settledDate(): LocalDate = settledDate.getRequired("settled_date")

        fun descriptor(): Optional<String> =
            Optional.ofNullable(descriptor.getNullable("descriptor"))

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

        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /**
         * Event types: _ `ACH_ORIGINATION_INITIATED` - ACH origination received and pending
         * approval/release from an ACH hold. _ `ACH_ORIGINATION_REVIEWED` - ACH origination has
         * completed the review process. _ `ACH_ORIGINATION_CANCELLED` - ACH origination has been
         * cancelled. _ `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed and sent to
         * the fed. _ `ACH_ORIGINATION_SETTLED` - ACH origination has settled. _
         * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available balance.
         * _ `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving Depository Financial
         * Institution. _ `ACH_RECEIPT_PROCESSED` - ACH receipt pending release from an ACH holder.
         * _ `ACH_RETURN_INITIATED` - ACH initiated return for a ACH receipt. _
         * `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled. _ `ACH_RECEIPT_RELEASED` - ACH
         * receipt released from pending to available balance. _ `AUTHORIZATION` - Authorize a card
         * transaction. _ `AUTHORIZATION_ADVICE` - Advice on a card transaction. _
         * `AUTHORIZATION_EXPIRY` - Card Authorization has expired and reversed by Lithic. _
         * `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by the merchant. _
         * `BALANCE_INQUIRY` - A card balance inquiry (typically a $0 authorization) has occurred on
         * a card. _ `CLEARING` - Card Transaction is settled. _ `CORRECTION_DEBIT` - Manual card
         * transaction correction (Debit). _ `CORRECTION_CREDIT` - Manual card transaction
         * correction (Credit). _ `CREDIT_AUTHORIZATION` - A refund or credit card authorization
         * from a merchant. _ `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was
         * approved on your behalf by the network. _ `FINANCIAL_AUTHORIZATION` - A request from a
         * merchant to debit card funds without additional clearing. _
         * `FINANCIAL_CREDIT_AUTHORIZATION` - A request from a merchant to refund or credit card
         * funds without additional clearing. _ `RETURN` - A card refund has been processed on the
         * transaction. _ `RETURN_REVERSAL` - A card refund has been reversed (e.g., when a merchant
         * reverses an incorrect refund). _ `TRANSFER` - Successful internal transfer of funds
         * between financial accounts. \* `TRANSFER_INSUFFICIENT_FUNDS` - Declined internal transfer
         * of funds due to insufficient balance of the sender.
         */
        @JsonProperty("event_type") @ExcludeMissing fun _eventType() = eventType

        /** Date that the transaction settled */
        @JsonProperty("settled_date") @ExcludeMissing fun _settledDate() = settledDate

        @JsonProperty("descriptor") @ExcludeMissing fun _descriptor() = descriptor

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
                category()
                eventType()
                settledDate()
                descriptor()
                amount()
                currency()
                created()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StatementLineItemResponse &&
                this.token == other.token &&
                this.financialAccountToken == other.financialAccountToken &&
                this.cardToken == other.cardToken &&
                this.financialTransactionToken == other.financialTransactionToken &&
                this.category == other.category &&
                this.eventType == other.eventType &&
                this.settledDate == other.settledDate &&
                this.descriptor == other.descriptor &&
                this.amount == other.amount &&
                this.currency == other.currency &&
                this.created == other.created &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        token,
                        financialAccountToken,
                        cardToken,
                        financialTransactionToken,
                        category,
                        eventType,
                        settledDate,
                        descriptor,
                        amount,
                        currency,
                        created,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "StatementLineItemResponse{token=$token, financialAccountToken=$financialAccountToken, cardToken=$cardToken, financialTransactionToken=$financialTransactionToken, category=$category, eventType=$eventType, settledDate=$settledDate, descriptor=$descriptor, amount=$amount, currency=$currency, created=$created, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var token: JsonField<String> = JsonMissing.of()
            private var financialAccountToken: JsonField<String> = JsonMissing.of()
            private var cardToken: JsonField<String> = JsonMissing.of()
            private var financialTransactionToken: JsonField<String> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var eventType: JsonField<FinancialEventType> = JsonMissing.of()
            private var settledDate: JsonField<LocalDate> = JsonMissing.of()
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
                this.category = statementLineItemResponse.category
                this.eventType = statementLineItemResponse.eventType
                this.settledDate = statementLineItemResponse.settledDate
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

            fun category(category: Category) = category(JsonField.of(category))

            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * Event types: _ `ACH_ORIGINATION_INITIATED` - ACH origination received and pending
             * approval/release from an ACH hold. _ `ACH_ORIGINATION_REVIEWED` - ACH origination has
             * completed the review process. _ `ACH_ORIGINATION_CANCELLED` - ACH origination has
             * been cancelled. _ `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed
             * and sent to the fed. _ `ACH_ORIGINATION_SETTLED` - ACH origination has settled. _
             * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             * balance. _ `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving
             * Depository Financial Institution. _ `ACH_RECEIPT_PROCESSED` - ACH receipt pending
             * release from an ACH holder. _ `ACH_RETURN_INITIATED` - ACH initiated return for a ACH
             * receipt. _ `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled. _
             * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance. _
             * `AUTHORIZATION` - Authorize a card transaction. _ `AUTHORIZATION_ADVICE` - Advice on
             * a card transaction. _ `AUTHORIZATION_EXPIRY` - Card Authorization has expired and
             * reversed by Lithic. _ `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by
             * the merchant. _ `BALANCE_INQUIRY` - A card balance inquiry (typically a $0
             * authorization) has occurred on a card. _ `CLEARING` - Card Transaction is settled. _
             * `CORRECTION_DEBIT` - Manual card transaction correction (Debit). _
             * `CORRECTION_CREDIT` - Manual card transaction correction (Credit). _
             * `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant. _
             * `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your
             * behalf by the network. _ `FINANCIAL_AUTHORIZATION` - A request from a merchant to
             * debit card funds without additional clearing. _ `FINANCIAL_CREDIT_AUTHORIZATION` - A
             * request from a merchant to refund or credit card funds without additional clearing. _
             * `RETURN` - A card refund has been processed on the transaction. _ `RETURN_REVERSAL` -
             * A card refund has been reversed (e.g., when a merchant reverses an incorrect refund).
             * _ `TRANSFER` - Successful internal transfer of funds between financial accounts. \*
             * `TRANSFER_INSUFFICIENT_FUNDS` - Declined internal transfer of funds due to
             * insufficient balance of the sender.
             */
            fun eventType(eventType: FinancialEventType) = eventType(JsonField.of(eventType))

            /**
             * Event types: _ `ACH_ORIGINATION_INITIATED` - ACH origination received and pending
             * approval/release from an ACH hold. _ `ACH_ORIGINATION_REVIEWED` - ACH origination has
             * completed the review process. _ `ACH_ORIGINATION_CANCELLED` - ACH origination has
             * been cancelled. _ `ACH_ORIGINATION_PROCESSED` - ACH origination has been processed
             * and sent to the fed. _ `ACH_ORIGINATION_SETTLED` - ACH origination has settled. _
             * `ACH_ORIGINATION_RELEASED` - ACH origination released from pending to available
             * balance. _ `ACH_RETURN_PROCESSED` - ACH origination returned by the Receiving
             * Depository Financial Institution. _ `ACH_RECEIPT_PROCESSED` - ACH receipt pending
             * release from an ACH holder. _ `ACH_RETURN_INITIATED` - ACH initiated return for a ACH
             * receipt. _ `ACH_RECEIPT_SETTLED` - ACH receipt funds have settled. _
             * `ACH_RECEIPT_RELEASED` - ACH receipt released from pending to available balance. _
             * `AUTHORIZATION` - Authorize a card transaction. _ `AUTHORIZATION_ADVICE` - Advice on
             * a card transaction. _ `AUTHORIZATION_EXPIRY` - Card Authorization has expired and
             * reversed by Lithic. _ `AUTHORIZATION_REVERSAL` - Card Authorization was reversed by
             * the merchant. _ `BALANCE_INQUIRY` - A card balance inquiry (typically a $0
             * authorization) has occurred on a card. _ `CLEARING` - Card Transaction is settled. _
             * `CORRECTION_DEBIT` - Manual card transaction correction (Debit). _
             * `CORRECTION_CREDIT` - Manual card transaction correction (Credit). _
             * `CREDIT_AUTHORIZATION` - A refund or credit card authorization from a merchant. _
             * `CREDIT_AUTHORIZATION_ADVICE` - A credit card authorization was approved on your
             * behalf by the network. _ `FINANCIAL_AUTHORIZATION` - A request from a merchant to
             * debit card funds without additional clearing. _ `FINANCIAL_CREDIT_AUTHORIZATION` - A
             * request from a merchant to refund or credit card funds without additional clearing. _
             * `RETURN` - A card refund has been processed on the transaction. _ `RETURN_REVERSAL` -
             * A card refund has been reversed (e.g., when a merchant reverses an incorrect refund).
             * _ `TRANSFER` - Successful internal transfer of funds between financial accounts. \*
             * `TRANSFER_INSUFFICIENT_FUNDS` - Declined internal transfer of funds due to
             * insufficient balance of the sender.
             */
            @JsonProperty("event_type")
            @ExcludeMissing
            fun eventType(eventType: JsonField<FinancialEventType>) = apply {
                this.eventType = eventType
            }

            /** Date that the transaction settled */
            fun settledDate(settledDate: LocalDate) = settledDate(JsonField.of(settledDate))

            /** Date that the transaction settled */
            @JsonProperty("settled_date")
            @ExcludeMissing
            fun settledDate(settledDate: JsonField<LocalDate>) = apply {
                this.settledDate = settledDate
            }

            fun descriptor(descriptor: String) = descriptor(JsonField.of(descriptor))

            @JsonProperty("descriptor")
            @ExcludeMissing
            fun descriptor(descriptor: JsonField<String>) = apply { this.descriptor = descriptor }

            fun amount(amount: Long) = amount(JsonField.of(amount))

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
                    category,
                    eventType,
                    settledDate,
                    descriptor,
                    amount,
                    currency,
                    created,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

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
        ) : Enum {

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
                val ACH_ORIGINATION_CANCELLED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_CANCELLED"))

                @JvmField
                val ACH_ORIGINATION_INITIATED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_INITIATED"))

                @JvmField
                val ACH_ORIGINATION_PROCESSED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_PROCESSED"))

                @JvmField
                val ACH_ORIGINATION_SETTLED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_SETTLED"))

                @JvmField
                val ACH_ORIGINATION_RELEASED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_RELEASED"))

                @JvmField
                val ACH_ORIGINATION_REVIEWED =
                    FinancialEventType(JsonField.of("ACH_ORIGINATION_REVIEWED"))

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
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_SETTLED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
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
                ACH_ORIGINATION_CANCELLED,
                ACH_ORIGINATION_INITIATED,
                ACH_ORIGINATION_PROCESSED,
                ACH_ORIGINATION_SETTLED,
                ACH_ORIGINATION_RELEASED,
                ACH_ORIGINATION_REVIEWED,
                ACH_RECEIPT_PROCESSED,
                ACH_RECEIPT_SETTLED,
                ACH_RETURN_INITIATED,
                ACH_RETURN_PROCESSED,
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
                    ACH_ORIGINATION_CANCELLED -> Value.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Value.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Value.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_SETTLED -> Value.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Value.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Value.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Value.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Value.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Value.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Value.ACH_RETURN_PROCESSED
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
                    ACH_ORIGINATION_CANCELLED -> Known.ACH_ORIGINATION_CANCELLED
                    ACH_ORIGINATION_INITIATED -> Known.ACH_ORIGINATION_INITIATED
                    ACH_ORIGINATION_PROCESSED -> Known.ACH_ORIGINATION_PROCESSED
                    ACH_ORIGINATION_SETTLED -> Known.ACH_ORIGINATION_SETTLED
                    ACH_ORIGINATION_RELEASED -> Known.ACH_ORIGINATION_RELEASED
                    ACH_ORIGINATION_REVIEWED -> Known.ACH_ORIGINATION_REVIEWED
                    ACH_RECEIPT_PROCESSED -> Known.ACH_RECEIPT_PROCESSED
                    ACH_RECEIPT_SETTLED -> Known.ACH_RECEIPT_SETTLED
                    ACH_RETURN_INITIATED -> Known.ACH_RETURN_INITIATED
                    ACH_RETURN_PROCESSED -> Known.ACH_RETURN_PROCESSED
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
}
