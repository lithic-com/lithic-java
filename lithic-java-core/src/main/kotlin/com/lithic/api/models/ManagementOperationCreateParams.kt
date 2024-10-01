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
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ManagementOperationCreateParams
constructor(
    private val amount: Long,
    private val category: ManagementOperationCategory,
    private val direction: ManagementOperationDirection,
    private val effectiveDate: LocalDate,
    private val eventType: ManagementOperationEventType,
    private val financialAccountToken: String,
    private val token: String?,
    private val memo: String?,
    private val subtype: String?,
    private val userDefinedId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun category(): ManagementOperationCategory = category

    fun direction(): ManagementOperationDirection = direction

    fun effectiveDate(): LocalDate = effectiveDate

    fun eventType(): ManagementOperationEventType = eventType

    fun financialAccountToken(): String = financialAccountToken

    fun token(): Optional<String> = Optional.ofNullable(token)

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun subtype(): Optional<String> = Optional.ofNullable(subtype)

    fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

    @JvmSynthetic
    internal fun getBody(): ManagementOperationCreateBody {
        return ManagementOperationCreateBody(
            amount,
            category,
            direction,
            effectiveDate,
            eventType,
            financialAccountToken,
            token,
            memo,
            subtype,
            userDefinedId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = ManagementOperationCreateBody.Builder::class)
    @NoAutoDetect
    class ManagementOperationCreateBody
    internal constructor(
        private val amount: Long?,
        private val category: ManagementOperationCategory?,
        private val direction: ManagementOperationDirection?,
        private val effectiveDate: LocalDate?,
        private val eventType: ManagementOperationEventType?,
        private val financialAccountToken: String?,
        private val token: String?,
        private val memo: String?,
        private val subtype: String?,
        private val userDefinedId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonProperty("category") fun category(): ManagementOperationCategory? = category

        @JsonProperty("direction") fun direction(): ManagementOperationDirection? = direction

        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        @JsonProperty("event_type") fun eventType(): ManagementOperationEventType? = eventType

        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String? = financialAccountToken

        @JsonProperty("token") fun token(): String? = token

        @JsonProperty("memo") fun memo(): String? = memo

        @JsonProperty("subtype") fun subtype(): String? = subtype

        @JsonProperty("user_defined_id") fun userDefinedId(): String? = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ManagementOperationCreateBody &&
                this.amount == other.amount &&
                this.category == other.category &&
                this.direction == other.direction &&
                this.effectiveDate == other.effectiveDate &&
                this.eventType == other.eventType &&
                this.financialAccountToken == other.financialAccountToken &&
                this.token == other.token &&
                this.memo == other.memo &&
                this.subtype == other.subtype &&
                this.userDefinedId == other.userDefinedId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        amount,
                        category,
                        direction,
                        effectiveDate,
                        eventType,
                        financialAccountToken,
                        token,
                        memo,
                        subtype,
                        userDefinedId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ManagementOperationCreateBody{amount=$amount, category=$category, direction=$direction, effectiveDate=$effectiveDate, eventType=$eventType, financialAccountToken=$financialAccountToken, token=$token, memo=$memo, subtype=$subtype, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var amount: Long? = null
            private var category: ManagementOperationCategory? = null
            private var direction: ManagementOperationDirection? = null
            private var effectiveDate: LocalDate? = null
            private var eventType: ManagementOperationEventType? = null
            private var financialAccountToken: String? = null
            private var token: String? = null
            private var memo: String? = null
            private var subtype: String? = null
            private var userDefinedId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(managementOperationCreateBody: ManagementOperationCreateBody) =
                apply {
                    this.amount = managementOperationCreateBody.amount
                    this.category = managementOperationCreateBody.category
                    this.direction = managementOperationCreateBody.direction
                    this.effectiveDate = managementOperationCreateBody.effectiveDate
                    this.eventType = managementOperationCreateBody.eventType
                    this.financialAccountToken = managementOperationCreateBody.financialAccountToken
                    this.token = managementOperationCreateBody.token
                    this.memo = managementOperationCreateBody.memo
                    this.subtype = managementOperationCreateBody.subtype
                    this.userDefinedId = managementOperationCreateBody.userDefinedId
                    additionalProperties(managementOperationCreateBody.additionalProperties)
                }

            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            @JsonProperty("category")
            fun category(category: ManagementOperationCategory) = apply { this.category = category }

            @JsonProperty("direction")
            fun direction(direction: ManagementOperationDirection) = apply {
                this.direction = direction
            }

            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            @JsonProperty("event_type")
            fun eventType(eventType: ManagementOperationEventType) = apply {
                this.eventType = eventType
            }

            @JsonProperty("financial_account_token")
            fun financialAccountToken(financialAccountToken: String) = apply {
                this.financialAccountToken = financialAccountToken
            }

            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            @JsonProperty("subtype") fun subtype(subtype: String) = apply { this.subtype = subtype }

            @JsonProperty("user_defined_id")
            fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

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

            fun build(): ManagementOperationCreateBody =
                ManagementOperationCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(category) { "`category` is required but was not set" },
                    checkNotNull(direction) { "`direction` is required but was not set" },
                    checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                    checkNotNull(eventType) { "`eventType` is required but was not set" },
                    checkNotNull(financialAccountToken) {
                        "`financialAccountToken` is required but was not set"
                    },
                    token,
                    memo,
                    subtype,
                    userDefinedId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ManagementOperationCreateParams &&
            this.amount == other.amount &&
            this.category == other.category &&
            this.direction == other.direction &&
            this.effectiveDate == other.effectiveDate &&
            this.eventType == other.eventType &&
            this.financialAccountToken == other.financialAccountToken &&
            this.token == other.token &&
            this.memo == other.memo &&
            this.subtype == other.subtype &&
            this.userDefinedId == other.userDefinedId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            amount,
            category,
            direction,
            effectiveDate,
            eventType,
            financialAccountToken,
            token,
            memo,
            subtype,
            userDefinedId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "ManagementOperationCreateParams{amount=$amount, category=$category, direction=$direction, effectiveDate=$effectiveDate, eventType=$eventType, financialAccountToken=$financialAccountToken, token=$token, memo=$memo, subtype=$subtype, userDefinedId=$userDefinedId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var category: ManagementOperationCategory? = null
        private var direction: ManagementOperationDirection? = null
        private var effectiveDate: LocalDate? = null
        private var eventType: ManagementOperationEventType? = null
        private var financialAccountToken: String? = null
        private var token: String? = null
        private var memo: String? = null
        private var subtype: String? = null
        private var userDefinedId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(managementOperationCreateParams: ManagementOperationCreateParams) =
            apply {
                this.amount = managementOperationCreateParams.amount
                this.category = managementOperationCreateParams.category
                this.direction = managementOperationCreateParams.direction
                this.effectiveDate = managementOperationCreateParams.effectiveDate
                this.eventType = managementOperationCreateParams.eventType
                this.financialAccountToken = managementOperationCreateParams.financialAccountToken
                this.token = managementOperationCreateParams.token
                this.memo = managementOperationCreateParams.memo
                this.subtype = managementOperationCreateParams.subtype
                this.userDefinedId = managementOperationCreateParams.userDefinedId
                additionalQueryParams(managementOperationCreateParams.additionalQueryParams)
                additionalHeaders(managementOperationCreateParams.additionalHeaders)
                additionalBodyProperties(managementOperationCreateParams.additionalBodyProperties)
            }

        fun amount(amount: Long) = apply { this.amount = amount }

        fun category(category: ManagementOperationCategory) = apply { this.category = category }

        fun direction(direction: ManagementOperationDirection) = apply {
            this.direction = direction
        }

        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

        fun eventType(eventType: ManagementOperationEventType) = apply {
            this.eventType = eventType
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun token(token: String) = apply { this.token = token }

        fun memo(memo: String) = apply { this.memo = memo }

        fun subtype(subtype: String) = apply { this.subtype = subtype }

        fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): ManagementOperationCreateParams =
            ManagementOperationCreateParams(
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(category) { "`category` is required but was not set" },
                checkNotNull(direction) { "`direction` is required but was not set" },
                checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                checkNotNull(eventType) { "`eventType` is required but was not set" },
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                token,
                memo,
                subtype,
                userDefinedId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
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

            return other is ManagementOperationCategory && this.value == other.value
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

            return other is ManagementOperationDirection && this.value == other.value
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

            return other is ManagementOperationEventType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val CASH_BACK = ManagementOperationEventType(JsonField.of("CASH_BACK"))

            @JvmField
            val CURRENCY_CONVERSION =
                ManagementOperationEventType(JsonField.of("CURRENCY_CONVERSION"))

            @JvmField val INTEREST = ManagementOperationEventType(JsonField.of("INTEREST"))

            @JvmField val LATE_PAYMENT = ManagementOperationEventType(JsonField.of("LATE_PAYMENT"))

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
            val INTEREST_REVERSAL = ManagementOperationEventType(JsonField.of("INTEREST_REVERSAL"))

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
                    throw LithicInvalidDataException("Unknown ManagementOperationEventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
