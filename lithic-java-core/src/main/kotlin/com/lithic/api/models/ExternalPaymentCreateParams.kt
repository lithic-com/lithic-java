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

class ExternalPaymentCreateParams
constructor(
    private val body: ExternalPaymentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun amount(): Long = body.amount()

    fun category(): ExternalPaymentCategory = body.category()

    fun effectiveDate(): LocalDate = body.effectiveDate()

    fun financialAccountToken(): String = body.financialAccountToken()

    fun paymentType(): ExternalPaymentDirection = body.paymentType()

    fun token(): Optional<String> = body.token()

    fun memo(): Optional<String> = body.memo()

    fun progressTo(): Optional<ExternalPaymentProgressTo> = body.progressTo()

    fun userDefinedId(): Optional<String> = body.userDefinedId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): ExternalPaymentCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class ExternalPaymentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("category") private val category: ExternalPaymentCategory,
        @JsonProperty("effective_date") private val effectiveDate: LocalDate,
        @JsonProperty("financial_account_token") private val financialAccountToken: String,
        @JsonProperty("payment_type") private val paymentType: ExternalPaymentDirection,
        @JsonProperty("token") private val token: String?,
        @JsonProperty("memo") private val memo: String?,
        @JsonProperty("progress_to") private val progressTo: ExternalPaymentProgressTo?,
        @JsonProperty("user_defined_id") private val userDefinedId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("amount") fun amount(): Long = amount

        @JsonProperty("category") fun category(): ExternalPaymentCategory = category

        @JsonProperty("effective_date") fun effectiveDate(): LocalDate = effectiveDate

        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String = financialAccountToken

        @JsonProperty("payment_type") fun paymentType(): ExternalPaymentDirection = paymentType

        @JsonProperty("token") fun token(): Optional<String> = Optional.ofNullable(token)

        @JsonProperty("memo") fun memo(): Optional<String> = Optional.ofNullable(memo)

        @JsonProperty("progress_to")
        fun progressTo(): Optional<ExternalPaymentProgressTo> = Optional.ofNullable(progressTo)

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
            private var category: ExternalPaymentCategory? = null
            private var effectiveDate: LocalDate? = null
            private var financialAccountToken: String? = null
            private var paymentType: ExternalPaymentDirection? = null
            private var token: String? = null
            private var memo: String? = null
            private var progressTo: ExternalPaymentProgressTo? = null
            private var userDefinedId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(externalPaymentCreateBody: ExternalPaymentCreateBody) = apply {
                amount = externalPaymentCreateBody.amount
                category = externalPaymentCreateBody.category
                effectiveDate = externalPaymentCreateBody.effectiveDate
                financialAccountToken = externalPaymentCreateBody.financialAccountToken
                paymentType = externalPaymentCreateBody.paymentType
                token = externalPaymentCreateBody.token
                memo = externalPaymentCreateBody.memo
                progressTo = externalPaymentCreateBody.progressTo
                userDefinedId = externalPaymentCreateBody.userDefinedId
                additionalProperties = externalPaymentCreateBody.additionalProperties.toMutableMap()
            }

            fun amount(amount: Long) = apply { this.amount = amount }

            fun category(category: ExternalPaymentCategory) = apply { this.category = category }

            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            fun financialAccountToken(financialAccountToken: String) = apply {
                this.financialAccountToken = financialAccountToken
            }

            fun paymentType(paymentType: ExternalPaymentDirection) = apply {
                this.paymentType = paymentType
            }

            fun token(token: String?) = apply { this.token = token }

            fun token(token: Optional<String>) = token(token.orElse(null))

            fun memo(memo: String?) = apply { this.memo = memo }

            fun memo(memo: Optional<String>) = memo(memo.orElse(null))

            fun progressTo(progressTo: ExternalPaymentProgressTo?) = apply {
                this.progressTo = progressTo
            }

            fun progressTo(progressTo: Optional<ExternalPaymentProgressTo>) =
                progressTo(progressTo.orElse(null))

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

            fun build(): ExternalPaymentCreateBody =
                ExternalPaymentCreateBody(
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(category) { "`category` is required but was not set" },
                    checkNotNull(effectiveDate) { "`effectiveDate` is required but was not set" },
                    checkNotNull(financialAccountToken) {
                        "`financialAccountToken` is required but was not set"
                    },
                    checkNotNull(paymentType) { "`paymentType` is required but was not set" },
                    token,
                    memo,
                    progressTo,
                    userDefinedId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentCreateBody && amount == other.amount && category == other.category && effectiveDate == other.effectiveDate && financialAccountToken == other.financialAccountToken && paymentType == other.paymentType && token == other.token && memo == other.memo && progressTo == other.progressTo && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, category, effectiveDate, financialAccountToken, paymentType, token, memo, progressTo, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ExternalPaymentCreateBody{amount=$amount, category=$category, effectiveDate=$effectiveDate, financialAccountToken=$financialAccountToken, paymentType=$paymentType, token=$token, memo=$memo, progressTo=$progressTo, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: ExternalPaymentCreateBody.Builder = ExternalPaymentCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(externalPaymentCreateParams: ExternalPaymentCreateParams) = apply {
            body = externalPaymentCreateParams.body.toBuilder()
            additionalHeaders = externalPaymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = externalPaymentCreateParams.additionalQueryParams.toBuilder()
        }

        fun amount(amount: Long) = apply { body.amount(amount) }

        fun category(category: ExternalPaymentCategory) = apply { body.category(category) }

        fun effectiveDate(effectiveDate: LocalDate) = apply { body.effectiveDate(effectiveDate) }

        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        fun paymentType(paymentType: ExternalPaymentDirection) = apply {
            body.paymentType(paymentType)
        }

        fun token(token: String?) = apply { body.token(token) }

        fun token(token: Optional<String>) = token(token.orElse(null))

        fun memo(memo: String?) = apply { body.memo(memo) }

        fun memo(memo: Optional<String>) = memo(memo.orElse(null))

        fun progressTo(progressTo: ExternalPaymentProgressTo?) = apply {
            body.progressTo(progressTo)
        }

        fun progressTo(progressTo: Optional<ExternalPaymentProgressTo>) =
            progressTo(progressTo.orElse(null))

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

        fun build(): ExternalPaymentCreateParams =
            ExternalPaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class ExternalPaymentCategory
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val EXTERNAL_WIRE = of("EXTERNAL_WIRE")

            @JvmField val EXTERNAL_ACH = of("EXTERNAL_ACH")

            @JvmField val EXTERNAL_CHECK = of("EXTERNAL_CHECK")

            @JvmField val EXTERNAL_TRANSFER = of("EXTERNAL_TRANSFER")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentCategory && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExternalPaymentDirection
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val DEPOSIT = of("DEPOSIT")

            @JvmField val WITHDRAWAL = of("WITHDRAWAL")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentDirection && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class ExternalPaymentProgressTo
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val SETTLED = of("SETTLED")

            @JvmField val RELEASED = of("RELEASED")

            @JvmStatic fun of(value: String) = ExternalPaymentProgressTo(JsonField.of(value))
        }

        enum class Known {
            SETTLED,
            RELEASED,
        }

        enum class Value {
            SETTLED,
            RELEASED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                SETTLED -> Value.SETTLED
                RELEASED -> Value.RELEASED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                SETTLED -> Known.SETTLED
                RELEASED -> Known.RELEASED
                else ->
                    throw LithicInvalidDataException("Unknown ExternalPaymentProgressTo: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentProgressTo && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "ExternalPaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
