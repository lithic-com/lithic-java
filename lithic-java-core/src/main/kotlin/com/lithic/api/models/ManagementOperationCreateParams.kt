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
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.toImmutable
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
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

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ManagementOperationCreateBody && amount == other.amount && category == other.category && direction == other.direction && effectiveDate == other.effectiveDate && eventType == other.eventType && financialAccountToken == other.financialAccountToken && token == other.token && memo == other.memo && subtype == other.subtype && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, category, direction, effectiveDate, eventType, financialAccountToken, token, memo, subtype, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ManagementOperationCreateBody{amount=$amount, category=$category, direction=$direction, effectiveDate=$effectiveDate, eventType=$eventType, financialAccountToken=$financialAccountToken, token=$token, memo=$memo, subtype=$subtype, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationCreateParams && amount == other.amount && category == other.category && direction == other.direction && effectiveDate == other.effectiveDate && eventType == other.eventType && financialAccountToken == other.financialAccountToken && token == other.token && memo == other.memo && subtype == other.subtype && userDefinedId == other.userDefinedId && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(amount, category, direction, effectiveDate, eventType, financialAccountToken, token, memo, subtype, userDefinedId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "ManagementOperationCreateParams{amount=$amount, category=$category, direction=$direction, effectiveDate=$effectiveDate, eventType=$eventType, financialAccountToken=$financialAccountToken, token=$token, memo=$memo, subtype=$subtype, userDefinedId=$userDefinedId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
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
                additionalHeaders(managementOperationCreateParams.additionalHeaders)
                additionalQueryParams(managementOperationCreateParams.additionalQueryParams)
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

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is ManagementOperationCategory && value == other.value /* spotless:on */
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

            return /* spotless:off */ other is ManagementOperationDirection && value == other.value /* spotless:on */
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

            return /* spotless:off */ other is ManagementOperationEventType && value == other.value /* spotless:on */
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
