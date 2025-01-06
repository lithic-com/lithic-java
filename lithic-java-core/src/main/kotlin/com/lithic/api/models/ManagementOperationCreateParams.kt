// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ManagementOperationCreateParams
constructor(
    private val body: ManagementOperationCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun amount(): Long = body.amount()

    fun category(): ManagementOperationCategory = body.category()

    fun direction(): ManagementOperationDirection = body.direction()

    fun effectiveDate(): LocalDate = body.effectiveDate()

    fun eventType(): ManagementOperationEventType = body.eventType()

    fun financialAccountToken(): String = body.financialAccountToken()

    fun token(): Optional<String> = body.token()

    fun memo(): Optional<String> = body.memo()

    fun subtype(): Optional<String> = body.subtype()

    fun userDefinedId(): Optional<String> = body.userDefinedId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ManagementOperationCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ManagementOperationCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("category") private val category: ManagementOperationCategory,
        @JsonProperty("direction") private val direction: ManagementOperationDirection,
        @JsonProperty("effective_date") private val effectiveDate: LocalDate,
        @JsonProperty("event_type") private val eventType: ManagementOperationEventType,
        @JsonProperty("financial_account_token") private val financialAccountToken: String,
        @JsonProperty("token") private val token: String?,
        @JsonProperty("memo") private val memo: String?,
        @JsonProperty("subtype") private val subtype: String?,
        @JsonProperty("user_defined_id") private val userDefinedId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("amount") fun amount(): Long = amount

        @JsonProperty("category") fun category(): ManagementOperationCategory = category

        @JsonProperty("direction") fun direction(): ManagementOperationDirection = direction

        @JsonProperty("effective_date") fun effectiveDate(): LocalDate = effectiveDate

        @JsonProperty("event_type") fun eventType(): ManagementOperationEventType = eventType

        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String = financialAccountToken

        @JsonProperty("token") fun token(): Optional<String> = Optional.ofNullable(token)

        @JsonProperty("memo") fun memo(): Optional<String> = Optional.ofNullable(memo)

        @JsonProperty("subtype") fun subtype(): Optional<String> = Optional.ofNullable(subtype)

        @JsonProperty("user_defined_id")
        fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

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
                    amount = managementOperationCreateBody.amount
                    category = managementOperationCreateBody.category
                    direction = managementOperationCreateBody.direction
                    effectiveDate = managementOperationCreateBody.effectiveDate
                    eventType = managementOperationCreateBody.eventType
                    financialAccountToken = managementOperationCreateBody.financialAccountToken
                    token = managementOperationCreateBody.token
                    memo = managementOperationCreateBody.memo
                    subtype = managementOperationCreateBody.subtype
                    userDefinedId = managementOperationCreateBody.userDefinedId
                    additionalProperties =
                        managementOperationCreateBody.additionalProperties.toMutableMap()
                }

            fun amount(amount: Long) = apply { this.amount = amount }

            fun category(category: ManagementOperationCategory) = apply { this.category = category }

            fun direction(direction: ManagementOperationDirection) = apply {
                this.direction = direction
            }

            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            fun eventType(eventType: ManagementOperationEventType) = apply {
                this.eventType = eventType
            }

            fun financialAccountToken(financialAccountToken: String) = apply {
                this.financialAccountToken = financialAccountToken
            }

            fun token(token: String?) = apply { this.token = token }

            fun token(token: Optional<String>) = token(token.orElse(null))

            fun memo(memo: String?) = apply { this.memo = memo }

            fun memo(memo: Optional<String>) = memo(memo.orElse(null))

            fun subtype(subtype: String?) = apply { this.subtype = subtype }

            fun subtype(subtype: Optional<String>) = subtype(subtype.orElse(null))

            fun userDefinedId(userDefinedId: String?) = apply { this.userDefinedId = userDefinedId }

            fun userDefinedId(userDefinedId: Optional<String>) =
                userDefinedId(userDefinedId.orElse(null))

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

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ManagementOperationCreateBody.Builder =
            ManagementOperationCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(managementOperationCreateParams: ManagementOperationCreateParams) =
            apply {
                body = managementOperationCreateParams.body.toBuilder()
                additionalHeaders = managementOperationCreateParams.additionalHeaders.toBuilder()
                additionalQueryParams =
                    managementOperationCreateParams.additionalQueryParams.toBuilder()
            }

        fun amount(amount: Long) = apply { body.amount(amount) }

        fun category(category: ManagementOperationCategory) = apply { body.category(category) }

        fun direction(direction: ManagementOperationDirection) = apply { body.direction(direction) }

        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        fun eventType(eventType: ManagementOperationEventType) = apply { body.eventType(eventType) }

        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        fun token(token: String?) = apply { body.token(token) }

        fun token(token: Optional<String>) = token(token.orElse(null))

        fun memo(memo: String?) = apply { body.memo(memo) }

        fun memo(memo: Optional<String>) = memo(memo.orElse(null))

        fun subtype(subtype: String?) = apply { body.subtype(subtype) }

        fun subtype(subtype: Optional<String>) = subtype(subtype.orElse(null))

        fun userDefinedId(userDefinedId: String?) = apply { body.userDefinedId(userDefinedId) }

        fun userDefinedId(userDefinedId: Optional<String>) =
            userDefinedId(userDefinedId.orElse(null))

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
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): ManagementOperationCreateParams =
            ManagementOperationCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ManagementOperationCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val MANAGEMENT_FEE = of("MANAGEMENT_FEE")

            @JvmField val MANAGEMENT_DISPUTE = of("MANAGEMENT_DISPUTE")

            @JvmField val MANAGEMENT_REWARD = of("MANAGEMENT_REWARD")

            @JvmField val MANAGEMENT_ADJUSTMENT = of("MANAGEMENT_ADJUSTMENT")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ManagementOperationCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ManagementOperationDirection
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CREDIT = of("CREDIT")

            @JvmField val DEBIT = of("DEBIT")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ManagementOperationDirection && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ManagementOperationEventType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val CASH_BACK = of("CASH_BACK")

            @JvmField val CURRENCY_CONVERSION = of("CURRENCY_CONVERSION")

            @JvmField val INTEREST = of("INTEREST")

            @JvmField val LATE_PAYMENT = of("LATE_PAYMENT")

            @JvmField val BILLING_ERROR = of("BILLING_ERROR")

            @JvmField val PROVISIONAL_CREDIT = of("PROVISIONAL_CREDIT")

            @JvmField val CASH_BACK_REVERSAL = of("CASH_BACK_REVERSAL")

            @JvmField val CURRENCY_CONVERSION_REVERSAL = of("CURRENCY_CONVERSION_REVERSAL")

            @JvmField val INTEREST_REVERSAL = of("INTEREST_REVERSAL")

            @JvmField val LATE_PAYMENT_REVERSAL = of("LATE_PAYMENT_REVERSAL")

            @JvmField val BILLING_ERROR_REVERSAL = of("BILLING_ERROR_REVERSAL")

            @JvmField val PROVISIONAL_CREDIT_REVERSAL = of("PROVISIONAL_CREDIT_REVERSAL")

            @JvmField val RETURNED_PAYMENT = of("RETURNED_PAYMENT")

            @JvmField val RETURNED_PAYMENT_REVERSAL = of("RETURNED_PAYMENT_REVERSAL")

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
            RETURNED_PAYMENT,
            RETURNED_PAYMENT_REVERSAL,
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
            RETURNED_PAYMENT,
            RETURNED_PAYMENT_REVERSAL,
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
                RETURNED_PAYMENT -> Value.RETURNED_PAYMENT
                RETURNED_PAYMENT_REVERSAL -> Value.RETURNED_PAYMENT_REVERSAL
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
                RETURNED_PAYMENT -> Known.RETURNED_PAYMENT
                RETURNED_PAYMENT_REVERSAL -> Known.RETURNED_PAYMENT_REVERSAL
                else ->
                    throw LithicInvalidDataException("Unknown ManagementOperationEventType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ManagementOperationEventType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ManagementOperationCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ManagementOperationCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
