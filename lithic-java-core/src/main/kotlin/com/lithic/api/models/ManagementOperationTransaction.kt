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

@JsonDeserialize(builder = ManagementOperationTransaction.Builder::class)
@NoAutoDetect
class ManagementOperationTransaction
private constructor(
    private val token: JsonField<String>,
    private val result: JsonField<TransactionResult>,
    private val category: JsonField<ManagementOperationCategory>,
    private val status: JsonField<TransactionStatus>,
    private val settledAmount: JsonField<Long>,
    private val pendingAmount: JsonField<Long>,
    private val currency: JsonField<String>,
    private val events: JsonField<List<ManagementOperationEvent>>,
    private val created: JsonField<OffsetDateTime>,
    private val updated: JsonField<OffsetDateTime>,
    private val userDefinedId: JsonField<String>,
    private val financialAccountToken: JsonField<String>,
    private val direction: JsonField<ManagementOperationDirection>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    fun token(): String = token.getRequired("token")

    fun result(): TransactionResult = result.getRequired("result")

    fun category(): ManagementOperationCategory = category.getRequired("category")

    fun status(): TransactionStatus = status.getRequired("status")

    fun settledAmount(): Long = settledAmount.getRequired("settled_amount")

    fun pendingAmount(): Long = pendingAmount.getRequired("pending_amount")

    fun currency(): String = currency.getRequired("currency")

    fun events(): List<ManagementOperationEvent> = events.getRequired("events")

    fun created(): OffsetDateTime = created.getRequired("created")

    fun updated(): OffsetDateTime = updated.getRequired("updated")

    fun userDefinedId(): Optional<String> =
        Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

    fun financialAccountToken(): String =
        financialAccountToken.getRequired("financial_account_token")

    fun direction(): ManagementOperationDirection = direction.getRequired("direction")

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

    @JsonProperty("direction") @ExcludeMissing fun _direction() = direction

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): ManagementOperationTransaction = apply {
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
            direction()
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
        private var category: JsonField<ManagementOperationCategory> = JsonMissing.of()
        private var status: JsonField<TransactionStatus> = JsonMissing.of()
        private var settledAmount: JsonField<Long> = JsonMissing.of()
        private var pendingAmount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<String> = JsonMissing.of()
        private var events: JsonField<List<ManagementOperationEvent>> = JsonMissing.of()
        private var created: JsonField<OffsetDateTime> = JsonMissing.of()
        private var updated: JsonField<OffsetDateTime> = JsonMissing.of()
        private var userDefinedId: JsonField<String> = JsonMissing.of()
        private var financialAccountToken: JsonField<String> = JsonMissing.of()
        private var direction: JsonField<ManagementOperationDirection> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(managementOperationTransaction: ManagementOperationTransaction) = apply {
            this.token = managementOperationTransaction.token
            this.result = managementOperationTransaction.result
            this.category = managementOperationTransaction.category
            this.status = managementOperationTransaction.status
            this.settledAmount = managementOperationTransaction.settledAmount
            this.pendingAmount = managementOperationTransaction.pendingAmount
            this.currency = managementOperationTransaction.currency
            this.events = managementOperationTransaction.events
            this.created = managementOperationTransaction.created
            this.updated = managementOperationTransaction.updated
            this.userDefinedId = managementOperationTransaction.userDefinedId
            this.financialAccountToken = managementOperationTransaction.financialAccountToken
            this.direction = managementOperationTransaction.direction
            additionalProperties(managementOperationTransaction.additionalProperties)
        }

        fun token(token: String) = token(JsonField.of(token))

        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        fun result(result: TransactionResult) = result(JsonField.of(result))

        @JsonProperty("result")
        @ExcludeMissing
        fun result(result: JsonField<TransactionResult>) = apply { this.result = result }

        fun category(category: ManagementOperationCategory) = category(JsonField.of(category))

        @JsonProperty("category")
        @ExcludeMissing
        fun category(category: JsonField<ManagementOperationCategory>) = apply {
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

        fun events(events: List<ManagementOperationEvent>) = events(JsonField.of(events))

        @JsonProperty("events")
        @ExcludeMissing
        fun events(events: JsonField<List<ManagementOperationEvent>>) = apply {
            this.events = events
        }

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

        fun direction(direction: ManagementOperationDirection) = direction(JsonField.of(direction))

        @JsonProperty("direction")
        @ExcludeMissing
        fun direction(direction: JsonField<ManagementOperationDirection>) = apply {
            this.direction = direction
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

        fun build(): ManagementOperationTransaction =
            ManagementOperationTransaction(
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
                direction,
                additionalProperties.toUnmodifiable(),
            )
    }

    class ManagementOperationCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ManagementOperationCategory && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val MANAGEMENT_FEE = ManagementOperationCategory(JsonField.of("MANAGEMENT_FEE"))

            @JvmField
            val MANAGEMENT_DISPUTE = ManagementOperationCategory(JsonField.of("MANAGEMENT_DISPUTE"))

            @JvmField
            val MANAGEMENT_REWARD = ManagementOperationCategory(JsonField.of("MANAGEMENT_REWARD"))

            @JvmField
            val MANAGEMENT_ADJUSTMENT =
                ManagementOperationCategory(JsonField.of("MANAGEMENT_ADJUSTMENT"))

            @JvmStatic fun of(value: String) = ManagementOperationCategory(JsonField.of(value))
        }

        enum class Known {
            MANAGEMENT_FEE,
            MANAGEMENT_DISPUTE,
            MANAGEMENT_REWARD,
            MANAGEMENT_ADJUSTMENT,
        }

        enum class Value {
            MANAGEMENT_FEE,
            MANAGEMENT_DISPUTE,
            MANAGEMENT_REWARD,
            MANAGEMENT_ADJUSTMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                MANAGEMENT_FEE -> Value.MANAGEMENT_FEE
                MANAGEMENT_DISPUTE -> Value.MANAGEMENT_DISPUTE
                MANAGEMENT_REWARD -> Value.MANAGEMENT_REWARD
                MANAGEMENT_ADJUSTMENT -> Value.MANAGEMENT_ADJUSTMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                MANAGEMENT_FEE -> Known.MANAGEMENT_FEE
                MANAGEMENT_DISPUTE -> Known.MANAGEMENT_DISPUTE
                MANAGEMENT_REWARD -> Known.MANAGEMENT_REWARD
                MANAGEMENT_ADJUSTMENT -> Known.MANAGEMENT_ADJUSTMENT
                else ->
                    throw LithicInvalidDataException("Unknown ManagementOperationCategory: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class ManagementOperationDirection
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ManagementOperationDirection && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CREDIT = ManagementOperationDirection(JsonField.of("CREDIT"))

            @JvmField val DEBIT = ManagementOperationDirection(JsonField.of("DEBIT"))

            @JvmStatic fun of(value: String) = ManagementOperationDirection(JsonField.of(value))
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
                else ->
                    throw LithicInvalidDataException("Unknown ManagementOperationDirection: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = ManagementOperationEvent.Builder::class)
    @NoAutoDetect
    class ManagementOperationEvent
    private constructor(
        private val amount: JsonField<Long>,
        private val type: JsonField<ManagementOperationEventType>,
        private val subtype: JsonField<String>,
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

        fun type(): ManagementOperationEventType = type.getRequired("type")

        fun subtype(): Optional<String> = Optional.ofNullable(subtype.getNullable("subtype"))

        fun result(): TransactionResult = result.getRequired("result")

        fun detailedResults(): List<DetailedResults> =
            detailedResults.getRequired("detailed_results")

        fun created(): OffsetDateTime = created.getRequired("created")

        fun token(): String = token.getRequired("token")

        fun memo(): String = memo.getRequired("memo")

        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonProperty("subtype") @ExcludeMissing fun _subtype() = subtype

        @JsonProperty("result") @ExcludeMissing fun _result() = result

        @JsonProperty("detailed_results") @ExcludeMissing fun _detailedResults() = detailedResults

        @JsonProperty("created") @ExcludeMissing fun _created() = created

        @JsonProperty("token") @ExcludeMissing fun _token() = token

        @JsonProperty("memo") @ExcludeMissing fun _memo() = memo

        @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ManagementOperationEvent = apply {
            if (!validated) {
                amount()
                type()
                subtype()
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
            private var type: JsonField<ManagementOperationEventType> = JsonMissing.of()
            private var subtype: JsonField<String> = JsonMissing.of()
            private var result: JsonField<TransactionResult> = JsonMissing.of()
            private var detailedResults: JsonField<List<DetailedResults>> = JsonMissing.of()
            private var created: JsonField<OffsetDateTime> = JsonMissing.of()
            private var token: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(managementOperationEvent: ManagementOperationEvent) = apply {
                this.amount = managementOperationEvent.amount
                this.type = managementOperationEvent.type
                this.subtype = managementOperationEvent.subtype
                this.result = managementOperationEvent.result
                this.detailedResults = managementOperationEvent.detailedResults
                this.created = managementOperationEvent.created
                this.token = managementOperationEvent.token
                this.memo = managementOperationEvent.memo
                this.effectiveDate = managementOperationEvent.effectiveDate
                additionalProperties(managementOperationEvent.additionalProperties)
            }

            fun amount(amount: Long) = amount(JsonField.of(amount))

            @JsonProperty("amount")
            @ExcludeMissing
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun type(type: ManagementOperationEventType) = type(JsonField.of(type))

            @JsonProperty("type")
            @ExcludeMissing
            fun type(type: JsonField<ManagementOperationEventType>) = apply { this.type = type }

            fun subtype(subtype: String) = subtype(JsonField.of(subtype))

            @JsonProperty("subtype")
            @ExcludeMissing
            fun subtype(subtype: JsonField<String>) = apply { this.subtype = subtype }

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

            fun build(): ManagementOperationEvent =
                ManagementOperationEvent(
                    amount,
                    type,
                    subtype,
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

        class ManagementOperationEventType
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ManagementOperationEventType && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CASH_BACK = ManagementOperationEventType(JsonField.of("CASH_BACK"))

                @JvmField
                val CURRENCY_CONVERSION =
                    ManagementOperationEventType(JsonField.of("CURRENCY_CONVERSION"))

                @JvmField val INTEREST = ManagementOperationEventType(JsonField.of("INTEREST"))

                @JvmField
                val LATE_PAYMENT = ManagementOperationEventType(JsonField.of("LATE_PAYMENT"))

                @JvmField
                val BILLING_ERROR = ManagementOperationEventType(JsonField.of("BILLING_ERROR"))

                @JvmField
                val PROVISIONAL_CREDIT =
                    ManagementOperationEventType(JsonField.of("PROVISIONAL_CREDIT"))

                @JvmField
                val CASH_BACK_REVERSAL =
                    ManagementOperationEventType(JsonField.of("CASH_BACK_REVERSAL"))

                @JvmField
                val CURRENCY_CONVERSION_REVERSAL =
                    ManagementOperationEventType(JsonField.of("CURRENCY_CONVERSION_REVERSAL"))

                @JvmField
                val INTEREST_REVERSAL =
                    ManagementOperationEventType(JsonField.of("INTEREST_REVERSAL"))

                @JvmField
                val LATE_PAYMENT_REVERSAL =
                    ManagementOperationEventType(JsonField.of("LATE_PAYMENT_REVERSAL"))

                @JvmField
                val BILLING_ERROR_REVERSAL =
                    ManagementOperationEventType(JsonField.of("BILLING_ERROR_REVERSAL"))

                @JvmField
                val PROVISIONAL_CREDIT_REVERSAL =
                    ManagementOperationEventType(JsonField.of("PROVISIONAL_CREDIT_REVERSAL"))

                @JvmStatic fun of(value: String) = ManagementOperationEventType(JsonField.of(value))
            }

            enum class Known {
                CASH_BACK,
                CURRENCY_CONVERSION,
                INTEREST,
                LATE_PAYMENT,
                BILLING_ERROR,
                PROVISIONAL_CREDIT,
                CASH_BACK_REVERSAL,
                CURRENCY_CONVERSION_REVERSAL,
                INTEREST_REVERSAL,
                LATE_PAYMENT_REVERSAL,
                BILLING_ERROR_REVERSAL,
                PROVISIONAL_CREDIT_REVERSAL,
            }

            enum class Value {
                CASH_BACK,
                CURRENCY_CONVERSION,
                INTEREST,
                LATE_PAYMENT,
                BILLING_ERROR,
                PROVISIONAL_CREDIT,
                CASH_BACK_REVERSAL,
                CURRENCY_CONVERSION_REVERSAL,
                INTEREST_REVERSAL,
                LATE_PAYMENT_REVERSAL,
                BILLING_ERROR_REVERSAL,
                PROVISIONAL_CREDIT_REVERSAL,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CASH_BACK -> Value.CASH_BACK
                    CURRENCY_CONVERSION -> Value.CURRENCY_CONVERSION
                    INTEREST -> Value.INTEREST
                    LATE_PAYMENT -> Value.LATE_PAYMENT
                    BILLING_ERROR -> Value.BILLING_ERROR
                    PROVISIONAL_CREDIT -> Value.PROVISIONAL_CREDIT
                    CASH_BACK_REVERSAL -> Value.CASH_BACK_REVERSAL
                    CURRENCY_CONVERSION_REVERSAL -> Value.CURRENCY_CONVERSION_REVERSAL
                    INTEREST_REVERSAL -> Value.INTEREST_REVERSAL
                    LATE_PAYMENT_REVERSAL -> Value.LATE_PAYMENT_REVERSAL
                    BILLING_ERROR_REVERSAL -> Value.BILLING_ERROR_REVERSAL
                    PROVISIONAL_CREDIT_REVERSAL -> Value.PROVISIONAL_CREDIT_REVERSAL
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CASH_BACK -> Known.CASH_BACK
                    CURRENCY_CONVERSION -> Known.CURRENCY_CONVERSION
                    INTEREST -> Known.INTEREST
                    LATE_PAYMENT -> Known.LATE_PAYMENT
                    BILLING_ERROR -> Known.BILLING_ERROR
                    PROVISIONAL_CREDIT -> Known.PROVISIONAL_CREDIT
                    CASH_BACK_REVERSAL -> Known.CASH_BACK_REVERSAL
                    CURRENCY_CONVERSION_REVERSAL -> Known.CURRENCY_CONVERSION_REVERSAL
                    INTEREST_REVERSAL -> Known.INTEREST_REVERSAL
                    LATE_PAYMENT_REVERSAL -> Known.LATE_PAYMENT_REVERSAL
                    BILLING_ERROR_REVERSAL -> Known.BILLING_ERROR_REVERSAL
                    PROVISIONAL_CREDIT_REVERSAL -> Known.PROVISIONAL_CREDIT_REVERSAL
                    else ->
                        throw LithicInvalidDataException(
                            "Unknown ManagementOperationEventType: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ManagementOperationEvent && this.amount == other.amount && this.type == other.type && this.subtype == other.subtype && this.result == other.result && this.detailedResults == other.detailedResults && this.created == other.created && this.token == other.token && this.memo == other.memo && this.effectiveDate == other.effectiveDate && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, type, subtype, result, detailedResults, created, token, memo, effectiveDate, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ManagementOperationEvent{amount=$amount, type=$type, subtype=$subtype, result=$result, detailedResults=$detailedResults, created=$created, token=$token, memo=$memo, effectiveDate=$effectiveDate, additionalProperties=$additionalProperties}"
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

        return /* spotless:off */ other is ManagementOperationTransaction && this.token == other.token && this.result == other.result && this.category == other.category && this.status == other.status && this.settledAmount == other.settledAmount && this.pendingAmount == other.pendingAmount && this.currency == other.currency && this.events == other.events && this.created == other.created && this.updated == other.updated && this.userDefinedId == other.userDefinedId && this.financialAccountToken == other.financialAccountToken && this.direction == other.direction && this.additionalProperties == other.additionalProperties /* spotless:on */
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode = /* spotless:off */ Objects.hash(token, result, category, status, settledAmount, pendingAmount, currency, events, created, updated, userDefinedId, financialAccountToken, direction, additionalProperties) /* spotless:on */
        }
        return hashCode
    }

    override fun toString() =
        "ManagementOperationTransaction{token=$token, result=$result, category=$category, status=$status, settledAmount=$settledAmount, pendingAmount=$pendingAmount, currency=$currency, events=$events, created=$created, updated=$updated, userDefinedId=$userDefinedId, financialAccountToken=$financialAccountToken, direction=$direction, additionalProperties=$additionalProperties}"
}
