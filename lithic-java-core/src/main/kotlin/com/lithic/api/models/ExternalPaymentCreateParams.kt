// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.time.LocalDate
import java.util.Objects
import java.util.Optional

class ExternalPaymentCreateParams
constructor(
    private val amount: Long,
    private val category: ExternalPaymentCategory,
    private val effectiveDate: LocalDate,
    private val financialAccountToken: String,
    private val paymentType: ExternalPaymentDirection,
    private val token: String?,
    private val memo: String?,
    private val progressTo: ExternalPaymentProgressTo?,
    private val userDefinedId: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun category(): ExternalPaymentCategory = category

    fun effectiveDate(): LocalDate = effectiveDate

    fun financialAccountToken(): String = financialAccountToken

    fun paymentType(): ExternalPaymentDirection = paymentType

    fun token(): Optional<String> = Optional.ofNullable(token)

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun progressTo(): Optional<ExternalPaymentProgressTo> = Optional.ofNullable(progressTo)

    fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

    @JvmSynthetic
    internal fun getBody(): ExternalPaymentCreateBody {
        return ExternalPaymentCreateBody(
            amount,
            category,
            effectiveDate,
            financialAccountToken,
            paymentType,
            token,
            memo,
            progressTo,
            userDefinedId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = ExternalPaymentCreateBody.Builder::class)
    @NoAutoDetect
    class ExternalPaymentCreateBody
    internal constructor(
        private val amount: Long?,
        private val category: ExternalPaymentCategory?,
        private val effectiveDate: LocalDate?,
        private val financialAccountToken: String?,
        private val paymentType: ExternalPaymentDirection?,
        private val token: String?,
        private val memo: String?,
        private val progressTo: ExternalPaymentProgressTo?,
        private val userDefinedId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonProperty("category") fun category(): ExternalPaymentCategory? = category

        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String? = financialAccountToken

        @JsonProperty("payment_type") fun paymentType(): ExternalPaymentDirection? = paymentType

        @JsonProperty("token") fun token(): String? = token

        @JsonProperty("memo") fun memo(): String? = memo

        @JsonProperty("progress_to") fun progressTo(): ExternalPaymentProgressTo? = progressTo

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
                this.amount = externalPaymentCreateBody.amount
                this.category = externalPaymentCreateBody.category
                this.effectiveDate = externalPaymentCreateBody.effectiveDate
                this.financialAccountToken = externalPaymentCreateBody.financialAccountToken
                this.paymentType = externalPaymentCreateBody.paymentType
                this.token = externalPaymentCreateBody.token
                this.memo = externalPaymentCreateBody.memo
                this.progressTo = externalPaymentCreateBody.progressTo
                this.userDefinedId = externalPaymentCreateBody.userDefinedId
                additionalProperties(externalPaymentCreateBody.additionalProperties)
            }

            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            @JsonProperty("category")
            fun category(category: ExternalPaymentCategory) = apply { this.category = category }

            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            @JsonProperty("financial_account_token")
            fun financialAccountToken(financialAccountToken: String) = apply {
                this.financialAccountToken = financialAccountToken
            }

            @JsonProperty("payment_type")
            fun paymentType(paymentType: ExternalPaymentDirection) = apply {
                this.paymentType = paymentType
            }

            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            @JsonProperty("progress_to")
            fun progressTo(progressTo: ExternalPaymentProgressTo) = apply {
                this.progressTo = progressTo
            }

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

            return /* spotless:off */ other is ExternalPaymentCreateBody && this.amount == other.amount && this.category == other.category && this.effectiveDate == other.effectiveDate && this.financialAccountToken == other.financialAccountToken && this.paymentType == other.paymentType && this.token == other.token && this.memo == other.memo && this.progressTo == other.progressTo && this.userDefinedId == other.userDefinedId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, category, effectiveDate, financialAccountToken, paymentType, token, memo, progressTo, userDefinedId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "ExternalPaymentCreateBody{amount=$amount, category=$category, effectiveDate=$effectiveDate, financialAccountToken=$financialAccountToken, paymentType=$paymentType, token=$token, memo=$memo, progressTo=$progressTo, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalPaymentCreateParams && this.amount == other.amount && this.category == other.category && this.effectiveDate == other.effectiveDate && this.financialAccountToken == other.financialAccountToken && this.paymentType == other.paymentType && this.token == other.token && this.memo == other.memo && this.progressTo == other.progressTo && this.userDefinedId == other.userDefinedId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, category, effectiveDate, financialAccountToken, paymentType, token, memo, progressTo, userDefinedId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "ExternalPaymentCreateParams{amount=$amount, category=$category, effectiveDate=$effectiveDate, financialAccountToken=$financialAccountToken, paymentType=$paymentType, token=$token, memo=$memo, progressTo=$progressTo, userDefinedId=$userDefinedId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
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
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(externalPaymentCreateParams: ExternalPaymentCreateParams) = apply {
            this.amount = externalPaymentCreateParams.amount
            this.category = externalPaymentCreateParams.category
            this.effectiveDate = externalPaymentCreateParams.effectiveDate
            this.financialAccountToken = externalPaymentCreateParams.financialAccountToken
            this.paymentType = externalPaymentCreateParams.paymentType
            this.token = externalPaymentCreateParams.token
            this.memo = externalPaymentCreateParams.memo
            this.progressTo = externalPaymentCreateParams.progressTo
            this.userDefinedId = externalPaymentCreateParams.userDefinedId
            additionalHeaders(externalPaymentCreateParams.additionalHeaders)
            additionalQueryParams(externalPaymentCreateParams.additionalQueryParams)
            additionalBodyProperties(externalPaymentCreateParams.additionalBodyProperties)
        }

        fun amount(amount: Long) = apply { this.amount = amount }

        fun category(category: ExternalPaymentCategory) = apply { this.category = category }

        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun paymentType(paymentType: ExternalPaymentDirection) = apply {
            this.paymentType = paymentType
        }

        fun token(token: String) = apply { this.token = token }

        fun memo(memo: String) = apply { this.memo = memo }

        fun progressTo(progressTo: ExternalPaymentProgressTo) = apply {
            this.progressTo = progressTo
        }

        fun userDefinedId(userDefinedId: String) = apply { this.userDefinedId = userDefinedId }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.putAll(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::putAdditionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replaceValues(name, listOf(value))
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replaceValues(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(::replaceAdditionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.removeAll(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            names.forEach(::removeAdditionalHeaders)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.putAll(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::putAdditionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replaceValues(key, listOf(value))
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replaceValues(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                additionalQueryParams.forEach(::replaceAdditionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply {
            additionalQueryParams.removeAll(key)
        }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalQueryParams)
        }

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

        fun build(): ExternalPaymentCreateParams =
            ExternalPaymentCreateParams(
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
                additionalHeaders
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalQueryParams
                    .asMap()
                    .mapValues { it.value.toList().toImmutable() }
                    .toImmutable(),
                additionalBodyProperties.toImmutable(),
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

    class ExternalPaymentProgressTo
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is ExternalPaymentProgressTo && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val SETTLED = ExternalPaymentProgressTo(JsonField.of("SETTLED"))

            @JvmField val RELEASED = ExternalPaymentProgressTo(JsonField.of("RELEASED"))

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
    }
}
