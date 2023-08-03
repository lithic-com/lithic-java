package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class PaymentCreateParams
constructor(
    private val financialAccountToken: String,
    private val externalBankAccountToken: String,
    private val type: Type,
    private val amount: Long,
    private val memo: String?,
    private val methodAttributes: PaymentMethodAttributes,
    private val method: Method,
    private val token: String?,
    private val userDefinedId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun financialAccountToken(): String = financialAccountToken

    fun externalBankAccountToken(): String = externalBankAccountToken

    fun type(): Type = type

    fun amount(): Long = amount

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun methodAttributes(): PaymentMethodAttributes = methodAttributes

    fun method(): Method = method

    fun token(): Optional<String> = Optional.ofNullable(token)

    fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

    @JvmSynthetic
    internal fun getBody(): PaymentCreateBody {
        return PaymentCreateBody(
            financialAccountToken,
            externalBankAccountToken,
            type,
            amount,
            memo,
            methodAttributes,
            method,
            token,
            userDefinedId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = PaymentCreateBody.Builder::class)
    @NoAutoDetect
    class PaymentCreateBody
    internal constructor(
        private val financialAccountToken: String?,
        private val externalBankAccountToken: String?,
        private val type: Type?,
        private val amount: Long?,
        private val memo: String?,
        private val methodAttributes: PaymentMethodAttributes?,
        private val method: Method?,
        private val token: String?,
        private val userDefinedId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String? = financialAccountToken

        @JsonProperty("external_bank_account_token")
        fun externalBankAccountToken(): String? = externalBankAccountToken

        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonProperty("memo") fun memo(): String? = memo

        @JsonProperty("method_attributes")
        fun methodAttributes(): PaymentMethodAttributes? = methodAttributes

        @JsonProperty("method") fun method(): Method? = method

        @JsonProperty("token") fun token(): String? = token

        @JsonProperty("user_defined_id") fun userDefinedId(): String? = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentCreateBody &&
                this.financialAccountToken == other.financialAccountToken &&
                this.externalBankAccountToken == other.externalBankAccountToken &&
                this.type == other.type &&
                this.amount == other.amount &&
                this.memo == other.memo &&
                this.methodAttributes == other.methodAttributes &&
                this.method == other.method &&
                this.token == other.token &&
                this.userDefinedId == other.userDefinedId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        financialAccountToken,
                        externalBankAccountToken,
                        type,
                        amount,
                        memo,
                        methodAttributes,
                        method,
                        token,
                        userDefinedId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "PaymentCreateBody{financialAccountToken=$financialAccountToken, externalBankAccountToken=$externalBankAccountToken, type=$type, amount=$amount, memo=$memo, methodAttributes=$methodAttributes, method=$method, token=$token, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var financialAccountToken: String? = null
            private var externalBankAccountToken: String? = null
            private var type: Type? = null
            private var amount: Long? = null
            private var memo: String? = null
            private var methodAttributes: PaymentMethodAttributes? = null
            private var method: Method? = null
            private var token: String? = null
            private var userDefinedId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentCreateBody: PaymentCreateBody) = apply {
                this.financialAccountToken = paymentCreateBody.financialAccountToken
                this.externalBankAccountToken = paymentCreateBody.externalBankAccountToken
                this.type = paymentCreateBody.type
                this.amount = paymentCreateBody.amount
                this.memo = paymentCreateBody.memo
                this.methodAttributes = paymentCreateBody.methodAttributes
                this.method = paymentCreateBody.method
                this.token = paymentCreateBody.token
                this.userDefinedId = paymentCreateBody.userDefinedId
                additionalProperties(paymentCreateBody.additionalProperties)
            }

            @JsonProperty("financial_account_token")
            fun financialAccountToken(financialAccountToken: String) = apply {
                this.financialAccountToken = financialAccountToken
            }

            @JsonProperty("external_bank_account_token")
            fun externalBankAccountToken(externalBankAccountToken: String) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

            @JsonProperty("method_attributes")
            fun methodAttributes(methodAttributes: PaymentMethodAttributes) = apply {
                this.methodAttributes = methodAttributes
            }

            @JsonProperty("method") fun method(method: Method) = apply { this.method = method }

            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

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

            fun build(): PaymentCreateBody =
                PaymentCreateBody(
                    checkNotNull(financialAccountToken) {
                        "`financialAccountToken` is required but was not set"
                    },
                    checkNotNull(externalBankAccountToken) {
                        "`externalBankAccountToken` is required but was not set"
                    },
                    checkNotNull(type) { "`type` is required but was not set" },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    memo,
                    checkNotNull(methodAttributes) {
                        "`methodAttributes` is required but was not set"
                    },
                    checkNotNull(method) { "`method` is required but was not set" },
                    token,
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

        return other is PaymentCreateParams &&
            this.financialAccountToken == other.financialAccountToken &&
            this.externalBankAccountToken == other.externalBankAccountToken &&
            this.type == other.type &&
            this.amount == other.amount &&
            this.memo == other.memo &&
            this.methodAttributes == other.methodAttributes &&
            this.method == other.method &&
            this.token == other.token &&
            this.userDefinedId == other.userDefinedId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            financialAccountToken,
            externalBankAccountToken,
            type,
            amount,
            memo,
            methodAttributes,
            method,
            token,
            userDefinedId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "PaymentCreateParams{financialAccountToken=$financialAccountToken, externalBankAccountToken=$externalBankAccountToken, type=$type, amount=$amount, memo=$memo, methodAttributes=$methodAttributes, method=$method, token=$token, userDefinedId=$userDefinedId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var financialAccountToken: String? = null
        private var externalBankAccountToken: String? = null
        private var type: Type? = null
        private var amount: Long? = null
        private var memo: String? = null
        private var methodAttributes: PaymentMethodAttributes? = null
        private var method: Method? = null
        private var token: String? = null
        private var userDefinedId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentCreateParams: PaymentCreateParams) = apply {
            this.financialAccountToken = paymentCreateParams.financialAccountToken
            this.externalBankAccountToken = paymentCreateParams.externalBankAccountToken
            this.type = paymentCreateParams.type
            this.amount = paymentCreateParams.amount
            this.memo = paymentCreateParams.memo
            this.methodAttributes = paymentCreateParams.methodAttributes
            this.method = paymentCreateParams.method
            this.token = paymentCreateParams.token
            this.userDefinedId = paymentCreateParams.userDefinedId
            additionalQueryParams(paymentCreateParams.additionalQueryParams)
            additionalHeaders(paymentCreateParams.additionalHeaders)
            additionalBodyProperties(paymentCreateParams.additionalBodyProperties)
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun type(type: Type) = apply { this.type = type }

        fun amount(amount: Long) = apply { this.amount = amount }

        fun memo(memo: String) = apply { this.memo = memo }

        fun methodAttributes(methodAttributes: PaymentMethodAttributes) = apply {
            this.methodAttributes = methodAttributes
        }

        fun method(method: Method) = apply { this.method = method }

        fun token(token: String) = apply { this.token = token }

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

        fun build(): PaymentCreateParams =
            PaymentCreateParams(
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                checkNotNull(externalBankAccountToken) {
                    "`externalBankAccountToken` is required but was not set"
                },
                checkNotNull(type) { "`type` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                memo,
                checkNotNull(methodAttributes) { "`methodAttributes` is required but was not set" },
                checkNotNull(method) { "`method` is required but was not set" },
                token,
                userDefinedId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class Method
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Method && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACH_NEXT_DAY = Method(JsonField.of("ACH_NEXT_DAY"))

            @JvmField val ACH_SAME_DAY = Method(JsonField.of("ACH_SAME_DAY"))

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        enum class Known {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
        }

        enum class Value {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH_NEXT_DAY -> Value.ACH_NEXT_DAY
                ACH_SAME_DAY -> Value.ACH_SAME_DAY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_NEXT_DAY -> Known.ACH_NEXT_DAY
                ACH_SAME_DAY -> Known.ACH_SAME_DAY
                else -> throw LithicInvalidDataException("Unknown Method: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    @JsonDeserialize(builder = PaymentMethodAttributes.Builder::class)
    @NoAutoDetect
    class PaymentMethodAttributes
    private constructor(
        private val secCode: SecCode?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("sec_code") fun secCode(): SecCode? = secCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PaymentMethodAttributes &&
                this.secCode == other.secCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(secCode, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "PaymentMethodAttributes{secCode=$secCode, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var secCode: SecCode? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentMethodAttributes: PaymentMethodAttributes) = apply {
                this.secCode = paymentMethodAttributes.secCode
                additionalProperties(paymentMethodAttributes.additionalProperties)
            }

            @JsonProperty("sec_code")
            fun secCode(secCode: SecCode) = apply { this.secCode = secCode }

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

            fun build(): PaymentMethodAttributes =
                PaymentMethodAttributes(
                    checkNotNull(secCode) { "`secCode` is required but was not set" },
                    additionalProperties.toUnmodifiable()
                )
        }

        class SecCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SecCode && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val PPD = SecCode(JsonField.of("PPD"))

                @JvmField val CCD = SecCode(JsonField.of("CCD"))

                @JvmField val WEB = SecCode(JsonField.of("WEB"))

                @JvmStatic fun of(value: String) = SecCode(JsonField.of(value))
            }

            enum class Known {
                PPD,
                CCD,
                WEB,
            }

            enum class Value {
                PPD,
                CCD,
                WEB,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    PPD -> Value.PPD
                    CCD -> Value.CCD
                    WEB -> Value.WEB
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    PPD -> Known.PPD
                    CCD -> Known.CCD
                    WEB -> Known.WEB
                    else -> throw LithicInvalidDataException("Unknown SecCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val PAYMENT = Type(JsonField.of("PAYMENT"))

            @JvmField val COLLECTION = Type(JsonField.of("COLLECTION"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PAYMENT,
            COLLECTION,
        }

        enum class Value {
            PAYMENT,
            COLLECTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PAYMENT -> Value.PAYMENT
                COLLECTION -> Value.COLLECTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PAYMENT -> Known.PAYMENT
                COLLECTION -> Known.COLLECTION
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
