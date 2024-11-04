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
import java.util.Objects
import java.util.Optional

class PaymentCreateParams
constructor(
    private val amount: Long,
    private val externalBankAccountToken: String,
    private val financialAccountToken: String,
    private val method: Method,
    private val methodAttributes: PaymentMethodRequestAttributes,
    private val type: Type,
    private val token: String?,
    private val memo: String?,
    private val userDefinedId: String?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun amount(): Long = amount

    fun externalBankAccountToken(): String = externalBankAccountToken

    fun financialAccountToken(): String = financialAccountToken

    fun method(): Method = method

    fun methodAttributes(): PaymentMethodRequestAttributes = methodAttributes

    fun type(): Type = type

    fun token(): Optional<String> = Optional.ofNullable(token)

    fun memo(): Optional<String> = Optional.ofNullable(memo)

    fun userDefinedId(): Optional<String> = Optional.ofNullable(userDefinedId)

    @JvmSynthetic
    internal fun getBody(): PaymentCreateBody {
        return PaymentCreateBody(
            amount,
            externalBankAccountToken,
            financialAccountToken,
            method,
            methodAttributes,
            type,
            token,
            memo,
            userDefinedId,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JsonDeserialize(builder = PaymentCreateBody.Builder::class)
    @NoAutoDetect
    class PaymentCreateBody
    internal constructor(
        private val amount: Long?,
        private val externalBankAccountToken: String?,
        private val financialAccountToken: String?,
        private val method: Method?,
        private val methodAttributes: PaymentMethodRequestAttributes?,
        private val type: Type?,
        private val token: String?,
        private val memo: String?,
        private val userDefinedId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("amount") fun amount(): Long? = amount

        @JsonProperty("external_bank_account_token")
        fun externalBankAccountToken(): String? = externalBankAccountToken

        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String? = financialAccountToken

        @JsonProperty("method") fun method(): Method? = method

        @JsonProperty("method_attributes")
        fun methodAttributes(): PaymentMethodRequestAttributes? = methodAttributes

        @JsonProperty("type") fun type(): Type? = type

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        @JsonProperty("token") fun token(): String? = token

        @JsonProperty("memo") fun memo(): String? = memo

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
            private var externalBankAccountToken: String? = null
            private var financialAccountToken: String? = null
            private var method: Method? = null
            private var methodAttributes: PaymentMethodRequestAttributes? = null
            private var type: Type? = null
            private var token: String? = null
            private var memo: String? = null
            private var userDefinedId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentCreateBody: PaymentCreateBody) = apply {
                this.amount = paymentCreateBody.amount
                this.externalBankAccountToken = paymentCreateBody.externalBankAccountToken
                this.financialAccountToken = paymentCreateBody.financialAccountToken
                this.method = paymentCreateBody.method
                this.methodAttributes = paymentCreateBody.methodAttributes
                this.type = paymentCreateBody.type
                this.token = paymentCreateBody.token
                this.memo = paymentCreateBody.memo
                this.userDefinedId = paymentCreateBody.userDefinedId
                additionalProperties(paymentCreateBody.additionalProperties)
            }

            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            @JsonProperty("external_bank_account_token")
            fun externalBankAccountToken(externalBankAccountToken: String) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            @JsonProperty("financial_account_token")
            fun financialAccountToken(financialAccountToken: String) = apply {
                this.financialAccountToken = financialAccountToken
            }

            @JsonProperty("method") fun method(method: Method) = apply { this.method = method }

            @JsonProperty("method_attributes")
            fun methodAttributes(methodAttributes: PaymentMethodRequestAttributes) = apply {
                this.methodAttributes = methodAttributes
            }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            @JsonProperty("token") fun token(token: String) = apply { this.token = token }

            @JsonProperty("memo") fun memo(memo: String) = apply { this.memo = memo }

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
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    checkNotNull(externalBankAccountToken) {
                        "`externalBankAccountToken` is required but was not set"
                    },
                    checkNotNull(financialAccountToken) {
                        "`financialAccountToken` is required but was not set"
                    },
                    checkNotNull(method) { "`method` is required but was not set" },
                    checkNotNull(methodAttributes) {
                        "`methodAttributes` is required but was not set"
                    },
                    checkNotNull(type) { "`type` is required but was not set" },
                    token,
                    memo,
                    userDefinedId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentCreateBody && this.amount == other.amount && this.externalBankAccountToken == other.externalBankAccountToken && this.financialAccountToken == other.financialAccountToken && this.method == other.method && this.methodAttributes == other.methodAttributes && this.type == other.type && this.token == other.token && this.memo == other.memo && this.userDefinedId == other.userDefinedId && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(amount, externalBankAccountToken, financialAccountToken, method, methodAttributes, type, token, memo, userDefinedId, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PaymentCreateBody{amount=$amount, externalBankAccountToken=$externalBankAccountToken, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, type=$type, token=$token, memo=$memo, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentCreateParams && this.amount == other.amount && this.externalBankAccountToken == other.externalBankAccountToken && this.financialAccountToken == other.financialAccountToken && this.method == other.method && this.methodAttributes == other.methodAttributes && this.type == other.type && this.token == other.token && this.memo == other.memo && this.userDefinedId == other.userDefinedId && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(amount, externalBankAccountToken, financialAccountToken, method, methodAttributes, type, token, memo, userDefinedId, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "PaymentCreateParams{amount=$amount, externalBankAccountToken=$externalBankAccountToken, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, type=$type, token=$token, memo=$memo, userDefinedId=$userDefinedId, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var amount: Long? = null
        private var externalBankAccountToken: String? = null
        private var financialAccountToken: String? = null
        private var method: Method? = null
        private var methodAttributes: PaymentMethodRequestAttributes? = null
        private var type: Type? = null
        private var token: String? = null
        private var memo: String? = null
        private var userDefinedId: String? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(paymentCreateParams: PaymentCreateParams) = apply {
            this.amount = paymentCreateParams.amount
            this.externalBankAccountToken = paymentCreateParams.externalBankAccountToken
            this.financialAccountToken = paymentCreateParams.financialAccountToken
            this.method = paymentCreateParams.method
            this.methodAttributes = paymentCreateParams.methodAttributes
            this.type = paymentCreateParams.type
            this.token = paymentCreateParams.token
            this.memo = paymentCreateParams.memo
            this.userDefinedId = paymentCreateParams.userDefinedId
            additionalHeaders(paymentCreateParams.additionalHeaders)
            additionalQueryParams(paymentCreateParams.additionalQueryParams)
            additionalBodyProperties(paymentCreateParams.additionalBodyProperties)
        }

        fun amount(amount: Long) = apply { this.amount = amount }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            this.financialAccountToken = financialAccountToken
        }

        fun method(method: Method) = apply { this.method = method }

        fun methodAttributes(methodAttributes: PaymentMethodRequestAttributes) = apply {
            this.methodAttributes = methodAttributes
        }

        fun type(type: Type) = apply { this.type = type }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String) = apply { this.token = token }

        fun memo(memo: String) = apply { this.memo = memo }

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

        fun removeAdditionalHeader(name: String) = apply { additionalHeaders.removeAll(name) }

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

        fun removeAdditionalQueryParam(key: String) = apply { additionalQueryParams.removeAll(key) }

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
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(externalBankAccountToken) {
                    "`externalBankAccountToken` is required but was not set"
                },
                checkNotNull(financialAccountToken) {
                    "`financialAccountToken` is required but was not set"
                },
                checkNotNull(method) { "`method` is required but was not set" },
                checkNotNull(methodAttributes) { "`methodAttributes` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                token,
                memo,
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

    class Method
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Method && this.value == other.value /* spotless:on */
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

    @JsonDeserialize(builder = PaymentMethodRequestAttributes.Builder::class)
    @NoAutoDetect
    class PaymentMethodRequestAttributes
    private constructor(
        private val secCode: SecCode?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        @JsonProperty("sec_code") fun secCode(): SecCode? = secCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var secCode: SecCode? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentMethodRequestAttributes: PaymentMethodRequestAttributes) =
                apply {
                    this.secCode = paymentMethodRequestAttributes.secCode
                    additionalProperties(paymentMethodRequestAttributes.additionalProperties)
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

            fun build(): PaymentMethodRequestAttributes =
                PaymentMethodRequestAttributes(
                    checkNotNull(secCode) { "`secCode` is required but was not set" },
                    additionalProperties.toImmutable()
                )
        }

        class SecCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SecCode && this.value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                @JvmField val CCD = SecCode(JsonField.of("CCD"))

                @JvmField val PPD = SecCode(JsonField.of("PPD"))

                @JvmField val WEB = SecCode(JsonField.of("WEB"))

                @JvmStatic fun of(value: String) = SecCode(JsonField.of(value))
            }

            enum class Known {
                CCD,
                PPD,
                WEB,
            }

            enum class Value {
                CCD,
                PPD,
                WEB,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    CCD -> Value.CCD
                    PPD -> Value.PPD
                    WEB -> Value.WEB
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CCD -> Known.CCD
                    PPD -> Known.PPD
                    WEB -> Known.WEB
                    else -> throw LithicInvalidDataException("Unknown SecCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentMethodRequestAttributes && this.secCode == other.secCode && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(secCode, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "PaymentMethodRequestAttributes{secCode=$secCode, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val COLLECTION = Type(JsonField.of("COLLECTION"))

            @JvmField val PAYMENT = Type(JsonField.of("PAYMENT"))

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            COLLECTION,
            PAYMENT,
        }

        enum class Value {
            COLLECTION,
            PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                COLLECTION -> Value.COLLECTION
                PAYMENT -> Value.PAYMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                COLLECTION -> Known.COLLECTION
                PAYMENT -> Known.PAYMENT
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
