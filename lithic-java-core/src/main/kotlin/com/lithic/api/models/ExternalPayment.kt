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

@JsonDeserialize(builder = ExternalPayment.Builder::class)
@NoAutoDetect
class ExternalPayment
private constructor(
    private val token: JsonField<String>,
    private val result: JsonField<TransactionResult>,
    private val category: JsonField<ExternalPaymentCategory>,
    private val status: JsonField<TransactionStatus>,
    private val settledAmount: JsonField<Long>,
    private val pendingAmount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val events: JsonField<List<ExternalPaymentEvent>>,
    private val created: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val userDefinedId: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val paymentType: JsonField<ExternalPaymentDirection>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun token(): String = token.getRequired("token")

    fun result(): TransactionResult = result.getRequired("result")

    fun category(): ExternalPaymentCategory = category.getRequired("category")

    fun status(): TransactionStatus = status.getRequired("status")

    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    fun currency(): String = currency.getRequired("currency")

    fun events(): List<ExternalPaymentEvent> = events.getRequired("events")

    fun created(): OffsetDateTime = created.getRequired("created")

    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun paymentType(): ExternalPaymentDirection = paymentType.getRequired("payment_type")

    @JsonProperty("token") @ExcludeMissing fun _token() = token

    @JsonProperty("result") @ExcludeMissing fun _result() = result

    @JsonProperty("category") @ExcludeMissing fun _category() = category

    @JsonProperty("status") @ExcludeMissing fun _status() = status

    @JsonProperty("settled_amount") @ExcludeMissing fun _settledAmount() = settledAmount

    @JsonProperty("pending_amount") @ExcludeMissing fun _pendingAmount() = pendingAmount

    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    @JsonProperty("events") @ExcludeMissing fun _events() = events

    @JsonProperty("created") @ExcludeMissing fun _created() = created

    @JsonProperty("updated") @ExcludeMissing fun _updated() = updated

    @JsonProperty("user_defined_id") @ExcludeMissing fun _userDefinedId() = userDefinedId

    @JsonProperty("financial_account_token")
    @ExcludeMissing
    fun _financialAccountToken() = financialAccountToken

    @JsonProperty("payment_type") @ExcludeMissing fun _paymentType() = paymentType

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ExternalPayment = apply {
        if (!validated) {
            token()
            result()
            category()
            status()
            settledAmount()
            pendingAmount()
            currency()
            events().forEach { it.validate() }
            created()
            updated()
            userDefinedId()
            financialAccountToken()
            paymentType()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var result: JsonField<TransactionResult> = JsonMissing.of()
        private var category: JsonField<ExternalPaymentCategory> = JsonMissing.of()
        private var status: JsonField<TransactionStatus> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<ExternalPaymentEvent>> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var paymentType: JsonField<ExternalPaymentDirection> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalPayment: ExternalPayment) = apply {
            this.token = externalPayment.token
            this.result = externalPayment.result
            this.category = externalPayment.category
            this.status = externalPayment.status
            this.settledAmount = externalPayment.settledAmount
            this.pendingAmount = externalPayment.pendingAmount
            this.currency = externalPayment.currency
            this.events = externalPayment.events
            this.created = externalPayment.created
            this.updated = externalPayment.updated
            this.userDefinedId = externalPayment.userDefinedId
            this.financialAccountToken = externalPayment.financialAccountToken
            this.paymentType = externalPayment.paymentType
            additionalProperties(externalPayment.additionalProperties)
        }

        fun token(token: String) = token(JsonField.of(token))

        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun result(result: TransactionResult) = result(JsonField.of(result))

        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

        fun category(category: ExternalPaymentCategory) = category(JsonField.of(category))

        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<ExternalPaymentCategory>) = apply {
            this.category = category
        }

        fun status(status: TransactionStatus) = status(JsonField.of(status))

        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<TransactionStatus>) = apply { this.status = status }

        fun settledAmount(settledAmount: Long) = settledAmount(JsonField.of(settledAmount))

        @JsonProperty("settled_amount")
        @ExcludeMissing
        fun settledAmount(settledAmount: JsonField<Long>) = apply {
            this.settledAmount = settledAmount
        }

        fun pendingAmount(pendingAmount: Long) = pendingAmount(JsonField.of(pendingAmount))

        @JsonProperty("pending_amount")
        @ExcludeMissing
        fun pendingAmount(pendingAmount: JsonField<Long>) = apply {
            this.pendingAmount = pendingAmount
        }

        fun currency(currency: String) = currency(JsonField.of(currency))

        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<String>) = apply { this.currency = currency }

        fun events(events: List<ExternalPaymentEvent>) = events(JsonField.of(events))

        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<ExternalPaymentEvent>>) = apply { this.events = events }

        fun created(created: OffsetDateTime) = created(JsonField.of(created))

        @JsonProperty("created")
        @ExcludeMissing
        fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

        fun updated(updated: OffsetDateTime) = updated(JsonField.of(updated))

        @JsonProperty("updated")
        @ExcludeMissing
        fun updated(updated: JsonField<OffsetDateTime>) = apply { this.updated = updated }

        fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            this.userDefinedId = userDefinedId
        }

        fun financialAccountToken(financialAccountToken: String) =
            financialAccountToken(JsonField.of(financialAccountToken))

        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun paymentType(paymentType: ExternalPaymentDirection) =
            paymentType(JsonField.of(paymentType))

        @JsonProperty("payment_type")
        @ExcludeMissing
        fun paymentType(paymentType: JsonField<ExternalPaymentDirection>) = apply {
            this.paymentType = paymentType
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

        fun build(): ExternalPayment =
            ExternalPayment(
                token,
                result,
                category,
                status,
                settledAmount,
                pendingAmount,
                currency,
                events.map { it.toUnmodifiable() },
                created,
                updated,
                userDefinedId,
                financialAccountToken,
                paymentType,
                additionalProperties.toUnmodifiable(),
            )
    }

    class ExternalPaymentCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentCategory && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val EXTERNAL_WIRE = ExternalPaymentCategory(JsonField.of("EXTERNAL_WIRE"))

            @JvmField val EXTERNAL_ACH = ExternalPaymentCategory(JsonField.of("EXTERNAL_ACH"))

            @JvmField val EXTERNAL_CHECK = ExternalPaymentCategory(JsonField.of("EXTERNAL_CHECK"))

            @JvmField
            val EXTERNAL_TRANSFER = ExternalPaymentCategory(JsonField.of("EXTERNAL_TRANSFER"))

            @JvmStatic fun of(value: String) = ExternalPaymentCategory(JsonField.of(value))
        }

        enum class Known {
            EXTERNAL_WIRE,
            EXTERNAL_ACH,
            EXTERNAL_CHECK,
            EXTERNAL_TRANSFER,
        }

        enum class Value {
            EXTERNAL_WIRE,
            EXTERNAL_ACH,
            EXTERNAL_CHECK,
            EXTERNAL_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EXTERNAL_WIRE -> Value.EXTERNAL_WIRE
                EXTERNAL_ACH -> Value.EXTERNAL_ACH
                EXTERNAL_CHECK -> Value.EXTERNAL_CHECK
                EXTERNAL_TRANSFER -> Value.EXTERNAL_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EXTERNAL_WIRE -> Known.EXTERNAL_WIRE
                EXTERNAL_ACH -> Known.EXTERNAL_ACH
                EXTERNAL_CHECK -> Known.EXTERNAL_CHECK
                EXTERNAL_TRANSFER -> Known.EXTERNAL_TRANSFER
                else -> throw LithicInvalidDataException("Unknown ExternalPaymentCategory: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = ExternalPaymentEvent.Builder::class)
    @NoAutoDetect
    class ExternalPaymentEvent
    private constructor(
        private val amount: JsonField<Long>,
        private val type: JsonField<ExternalPaymentEventType>,
        private val result: JsonField<TransactionResult>,
        private val detailedResults: JsonField<List<DetailedResults>>,
        private val created: JsonField<OffsetDateTime>,
        private val token: JsonField<String>,
        private val memo: JsonField<String>,
        private val effectiveDate: JsonField<LocalDate>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        fun amount(): Long = amount.getRequired("amount")

        fun type(): ExternalPaymentEventType = type.getRequired("type")

        fun result(): TransactionResult = result.getRequired("result")

        fun detailedResults(): List<DetailedResults> =
            detailedResults.getRequired("detailed_results")

        fun created(): OffsetDateTime = created.getRequired("created")

        fun token(): String = token.getRequired("token")

        fun memo(): String = memo.getRequired("memo")

        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("result") @ExcludeMissing fun _result() = result

        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        @JsonProperty("created") @ExcludeMissing fun _created() = created

        @JsonProperty("token") @ExcludeMissing fun _token() = token

        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ExternalPaymentEvent = apply {
            if (!validated) {
                amount()
                type()
                result()
                detailedResults()
                created()
                token()
                memo()
                effectiveDate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: JsonField<Long> = JsonMissing.of()
            private var type: JsonField<ExternalPaymentEventType> = JsonMissing.of()
            private var result: JsonField<TransactionResult> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResults>> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalPaymentEvent: ExternalPaymentEvent) = apply {
                this.amount = externalPaymentEvent.amount
                this.type = externalPaymentEvent.type
                this.result = externalPaymentEvent.result
                this.detailedResults = externalPaymentEvent.detailedResults
                this.created = externalPaymentEvent.created
                this.token = externalPaymentEvent.token
                this.memo = externalPaymentEvent.memo
                this.effectiveDate = externalPaymentEvent.effectiveDate
                additionalProperties(externalPaymentEvent.additionalProperties)
            }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun type(type: ExternalPaymentEventType) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<ExternalPaymentEventType>) = apply { this.type = type }

            fun result(result: TransactionResult) = result(JsonField.of(result))

            @JsonProperty("result")
            @ExcludeMissing
            fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

            fun detailedResults(detailedResults: List<DetailedResults>) =
                detailedResults(JsonField.of(detailedResults))

            @JsonProperty("detailed_results")
            @ExcludeMissing
            fun detailedResults(detailedResults: JsonField<List<DetailedResults>>) = apply {
                this.detailedResults = detailedResults
            }

            fun created(created: OffsetDateTime) = created(JsonField.of(created))

            @JsonProperty("created")
            @ExcludeMissing
            fun created(created: JsonField<OffsetDateTime>) = apply { this.created = created }

            fun token(token: String) = token(JsonField.of(token))

            @JsonProperty("token")
            @ExcludeMissing
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun memo(memo: String) = memo(JsonField.of(memo))

            @JsonProperty("memo")
            @ExcludeMissing
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            @JsonProperty("effective_date")
            @ExcludeMissing
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
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

            fun build(): ExternalPaymentEvent =
                ExternalPaymentEvent(
                    amount,
                    type,
                    result,
                    detailedResults.map { it.toUnmodifiable() },
                    created,
                    token,
                    memo,
                    effectiveDate,
                    additionalProperties.toUnmodifiable(),
                )
        }

        class DetailedResults
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is DetailedResults && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = DetailedResults(JsonField.of("APPROVED"))

                @JvmStatic fun of(value: String) = DetailedResults(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
            }

            enum class Value {
                APPROVED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    else -> throw LithicInvalidDataException("Unknown DetailedResults: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class TransactionResult
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is TransactionResult && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val APPROVED = TransactionResult(JsonField.of("APPROVED"))

                @JvmField val DECLINED = TransactionResult(JsonField.of("DECLINED"))

                @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
            }

            enum class Known {
                APPROVED,
                DECLINED,
            }

            enum class Value {
                APPROVED,
                DECLINED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    APPROVED -> Value.APPROVED
                    DECLINED -> Value.DECLINED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    APPROVED -> Known.APPROVED
                    DECLINED -> Known.DECLINED
                    else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        class ExternalPaymentEventType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExternalPaymentEventType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField
                val EXTERNAL_WIRE_INITIATED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_WIRE_INITIATED"))

                @JvmField
                val EXTERNAL_WIRE_CANCELED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_WIRE_CANCELED"))

                @JvmField
                val EXTERNAL_WIRE_SETTLED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_WIRE_SETTLED"))

                @JvmField
                val EXTERNAL_WIRE_REVERSED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_WIRE_REVERSED"))

                @JvmField
                val EXTERNAL_WIRE_RELEASED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_WIRE_RELEASED"))

                @JvmField
                val EXTERNAL_ACH_INITIATED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_ACH_INITIATED"))

                @JvmField
                val EXTERNAL_ACH_CANCELED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_ACH_CANCELED"))

                @JvmField
                val EXTERNAL_ACH_SETTLED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_ACH_SETTLED"))

                @JvmField
                val EXTERNAL_ACH_REVERSED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_ACH_REVERSED"))

                @JvmField
                val EXTERNAL_ACH_RELEASED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_ACH_RELEASED"))

                @JvmField
                val EXTERNAL_TRANSFER_INITIATED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_TRANSFER_INITIATED"))

                @JvmField
                val EXTERNAL_TRANSFER_CANCELED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_TRANSFER_CANCELED"))

                @JvmField
                val EXTERNAL_TRANSFER_SETTLED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_TRANSFER_SETTLED"))

                @JvmField
                val EXTERNAL_TRANSFER_REVERSED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_TRANSFER_REVERSED"))

                @JvmField
                val EXTERNAL_TRANSFER_RELEASED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_TRANSFER_RELEASED"))

                @JvmField
                val EXTERNAL_CHECK_INITIATED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_CHECK_INITIATED"))

                @JvmField
                val EXTERNAL_CHECK_CANCELED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_CHECK_CANCELED"))

                @JvmField
                val EXTERNAL_CHECK_SETTLED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_CHECK_SETTLED"))

                @JvmField
                val EXTERNAL_CHECK_REVERSED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_CHECK_REVERSED"))

                @JvmField
                val EXTERNAL_CHECK_RELEASED =
                    ExternalPaymentEventType(JsonField.of("EXTERNAL_CHECK_RELEASED"))

                @JvmStatic fun of(value: String) = ExternalPaymentEventType(JsonField.of(value))
            }

            enum class Known {
                EXTERNAL_WIRE_INITIATED,
                EXTERNAL_WIRE_CANCELED,
                EXTERNAL_WIRE_SETTLED,
                EXTERNAL_WIRE_REVERSED,
                EXTERNAL_WIRE_RELEASED,
                EXTERNAL_ACH_INITIATED,
                EXTERNAL_ACH_CANCELED,
                EXTERNAL_ACH_SETTLED,
                EXTERNAL_ACH_REVERSED,
                EXTERNAL_ACH_RELEASED,
                EXTERNAL_TRANSFER_INITIATED,
                EXTERNAL_TRANSFER_CANCELED,
                EXTERNAL_TRANSFER_SETTLED,
                EXTERNAL_TRANSFER_REVERSED,
                EXTERNAL_TRANSFER_RELEASED,
                EXTERNAL_CHECK_INITIATED,
                EXTERNAL_CHECK_CANCELED,
                EXTERNAL_CHECK_SETTLED,
                EXTERNAL_CHECK_REVERSED,
                EXTERNAL_CHECK_RELEASED,
            }

            enum class Value {
                EXTERNAL_WIRE_INITIATED,
                EXTERNAL_WIRE_CANCELED,
                EXTERNAL_WIRE_SETTLED,
                EXTERNAL_WIRE_REVERSED,
                EXTERNAL_WIRE_RELEASED,
                EXTERNAL_ACH_INITIATED,
                EXTERNAL_ACH_CANCELED,
                EXTERNAL_ACH_SETTLED,
                EXTERNAL_ACH_REVERSED,
                EXTERNAL_ACH_RELEASED,
                EXTERNAL_TRANSFER_INITIATED,
                EXTERNAL_TRANSFER_CANCELED,
                EXTERNAL_TRANSFER_SETTLED,
                EXTERNAL_TRANSFER_REVERSED,
                EXTERNAL_TRANSFER_RELEASED,
                EXTERNAL_CHECK_INITIATED,
                EXTERNAL_CHECK_CANCELED,
                EXTERNAL_CHECK_SETTLED,
                EXTERNAL_CHECK_REVERSED,
                EXTERNAL_CHECK_RELEASED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    EXTERNAL_WIRE_INITIATED -> Value.EXTERNAL_WIRE_INITIATED
                    EXTERNAL_WIRE_CANCELED -> Value.EXTERNAL_WIRE_CANCELED
                    EXTERNAL_WIRE_SETTLED -> Value.EXTERNAL_WIRE_SETTLED
                    EXTERNAL_WIRE_REVERSED -> Value.EXTERNAL_WIRE_REVERSED
                    EXTERNAL_WIRE_RELEASED -> Value.EXTERNAL_WIRE_RELEASED
                    EXTERNAL_ACH_INITIATED -> Value.EXTERNAL_ACH_INITIATED
                    EXTERNAL_ACH_CANCELED -> Value.EXTERNAL_ACH_CANCELED
                    EXTERNAL_ACH_SETTLED -> Value.EXTERNAL_ACH_SETTLED
                    EXTERNAL_ACH_REVERSED -> Value.EXTERNAL_ACH_REVERSED
                    EXTERNAL_ACH_RELEASED -> Value.EXTERNAL_ACH_RELEASED
                    EXTERNAL_TRANSFER_INITIATED -> Value.EXTERNAL_TRANSFER_INITIATED
                    EXTERNAL_TRANSFER_CANCELED -> Value.EXTERNAL_TRANSFER_CANCELED
                    EXTERNAL_TRANSFER_SETTLED -> Value.EXTERNAL_TRANSFER_SETTLED
                    EXTERNAL_TRANSFER_REVERSED -> Value.EXTERNAL_TRANSFER_REVERSED
                    EXTERNAL_TRANSFER_RELEASED -> Value.EXTERNAL_TRANSFER_RELEASED
                    EXTERNAL_CHECK_INITIATED -> Value.EXTERNAL_CHECK_INITIATED
                    EXTERNAL_CHECK_CANCELED -> Value.EXTERNAL_CHECK_CANCELED
                    EXTERNAL_CHECK_SETTLED -> Value.EXTERNAL_CHECK_SETTLED
                    EXTERNAL_CHECK_REVERSED -> Value.EXTERNAL_CHECK_REVERSED
                    EXTERNAL_CHECK_RELEASED -> Value.EXTERNAL_CHECK_RELEASED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    EXTERNAL_WIRE_INITIATED -> Known.EXTERNAL_WIRE_INITIATED
                    EXTERNAL_WIRE_CANCELED -> Known.EXTERNAL_WIRE_CANCELED
                    EXTERNAL_WIRE_SETTLED -> Known.EXTERNAL_WIRE_SETTLED
                    EXTERNAL_WIRE_REVERSED -> Known.EXTERNAL_WIRE_REVERSED
                    EXTERNAL_WIRE_RELEASED -> Known.EXTERNAL_WIRE_RELEASED
                    EXTERNAL_ACH_INITIATED -> Known.EXTERNAL_ACH_INITIATED
                    EXTERNAL_ACH_CANCELED -> Known.EXTERNAL_ACH_CANCELED
                    EXTERNAL_ACH_SETTLED -> Known.EXTERNAL_ACH_SETTLED
                    EXTERNAL_ACH_REVERSED -> Known.EXTERNAL_ACH_REVERSED
                    EXTERNAL_ACH_RELEASED -> Known.EXTERNAL_ACH_RELEASED
                    EXTERNAL_TRANSFER_INITIATED -> Known.EXTERNAL_TRANSFER_INITIATED
                    EXTERNAL_TRANSFER_CANCELED -> Known.EXTERNAL_TRANSFER_CANCELED
                    EXTERNAL_TRANSFER_SETTLED -> Known.EXTERNAL_TRANSFER_SETTLED
                    EXTERNAL_TRANSFER_REVERSED -> Known.EXTERNAL_TRANSFER_REVERSED
                    EXTERNAL_TRANSFER_RELEASED -> Known.EXTERNAL_TRANSFER_RELEASED
                    EXTERNAL_CHECK_INITIATED -> Known.EXTERNAL_CHECK_INITIATED
                    EXTERNAL_CHECK_CANCELED -> Known.EXTERNAL_CHECK_CANCELED
                    EXTERNAL_CHECK_SETTLED -> Known.EXTERNAL_CHECK_SETTLED
                    EXTERNAL_CHECK_REVERSED -> Known.EXTERNAL_CHECK_REVERSED
                    EXTERNAL_CHECK_RELEASED -> Known.EXTERNAL_CHECK_RELEASED
                    else ->
                        throw LithicInvalidDataException("Unknown ExternalPaymentEventType: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentEvent && this.amount == other.amount && this.type == other.type && this.result == other.result && this.detailedResults == other.detailedResults && this.created == other.created && this.token == other.token && this.memo == other.memo && this.effectiveDate == other.effectiveDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, type, result, detailedResults, created, token, memo, effectiveDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalPaymentEvent{amount=$amount, type=$type, result=$result, detailedResults=$detailedResults, created=$created, token=$token, memo=$memo, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"
    }

    class ExternalPaymentDirection
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentDirection && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val DEPOSIT = ExternalPaymentDirection(JsonField.of("DEPOSIT"))

            @JvmField val WITHDRAWAL = ExternalPaymentDirection(JsonField.of("WITHDRAWAL"))

            @JvmStatic fun of(value: String) = ExternalPaymentDirection(JsonField.of(value))
        }

        enum class Known {
            DEPOSIT,
            WITHDRAWAL,
        }

        enum class Value {
            DEPOSIT,
            WITHDRAWAL,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                DEPOSIT -> Value.DEPOSIT
                WITHDRAWAL -> Value.WITHDRAWAL
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                DEPOSIT -> Known.DEPOSIT
                WITHDRAWAL -> Known.WITHDRAWAL
                else -> throw LithicInvalidDataException("Unknown ExternalPaymentDirection: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class TransactionResult
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionResult && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val APPROVED = TransactionResult(JsonField.of("APPROVED"))

            @JvmField val DECLINED = TransactionResult(JsonField.of("DECLINED"))

            @JvmStatic fun of(value: String) = TransactionResult(JsonField.of(value))
        }

        enum class Known {
            APPROVED,
            DECLINED,
        }

        enum class Value {
            APPROVED,
            DECLINED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                else -> throw LithicInvalidDataException("Unknown TransactionResult: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class TransactionStatus
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TransactionStatus && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PENDING = TransactionStatus(JsonField.of("PENDING"))

            @JvmField val SETTLED = TransactionStatus(JsonField.of("SETTLED"))

            @JvmField val DECLINED = TransactionStatus(JsonField.of("DECLINED"))

            @JvmField val REVERSED = TransactionStatus(JsonField.of("REVERSED"))

            @JvmField val CANCELED = TransactionStatus(JsonField.of("CANCELED"))

            @JvmStatic fun of(value: String) = TransactionStatus(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            SETTLED,
            DECLINED,
            REVERSED,
            CANCELED,
        }

        enum class Value {
            PENDING,
            SETTLED,
            DECLINED,
            REVERSED,
            CANCELED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                SETTLED -> Value.SETTLED
                DECLINED -> Value.DECLINED
                REVERSED -> Value.REVERSED
                CANCELED -> Value.CANCELED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                SETTLED -> Known.SETTLED
                DECLINED -> Known.DECLINED
                REVERSED -> Known.REVERSED
                CANCELED -> Known.CANCELED
                else -> throw LithicInvalidDataException("Unknown TransactionStatus: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPayment && this.token == other.token && this.result == other.result && this.category == other.category && this.status == other.status && this.settledAmount == other.settledAmount && this.pendingAmount == other.pendingAmount && this.currency == other.currency && this.events == other.events && this.created == other.created && this.updated == other.updated && this.userDefinedId == other.userDefinedId && this.financialAccountToken == other.financialAccountToken && this.paymentType == other.paymentType && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, result, category, status, settledAmount, pendingAmount, currency, events, created, updated, userDefinedId, financialAccountToken, paymentType, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ExternalPayment{token=$token, result=$result, category=$category, status=$status, settledAmount=$settledAmount, pendingAmount=$pendingAmount, currency=$currency, events=$events, created=$created, updated=$updated, userDefinedId=$userDefinedId, financialAccountToken=$financialAccountToken, paymentType=$paymentType, additionalProperties=$additionalProperties}"
}
