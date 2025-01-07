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
import java.util.Objects
import java.util.Optional

/** Initiates a payment between a financial account and an external bank account. */
class PaymentCreateParams
constructor(
    private val body: PaymentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun amount(): Long = body.amount()

    fun externalBankAccountToken(): String = body.externalBankAccountToken()

    fun financialAccountToken(): String = body.financialAccountToken()

    fun method(): Method = body.method()

    fun methodAttributes(): PaymentMethodRequestAttributes = body.methodAttributes()

    fun type(): Type = body.type()

    /**
     * Customer-provided token that will serve as an idempotency token. This token will become the
     * transaction token.
     */
    fun token(): Optional<String> = body.token()

    fun memo(): Optional<String> = body.memo()

    fun userDefinedId(): Optional<String> = body.userDefinedId()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): PaymentCreateBody = body

    @JvmSynthetic internal fun getHeaders(): Headers = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PaymentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("external_bank_account_token") private val externalBankAccountToken: String,
        @JsonProperty("financial_account_token") private val financialAccountToken: String,
        @JsonProperty("method") private val method: Method,
        @JsonProperty("method_attributes")
        private val methodAttributes: PaymentMethodRequestAttributes,
        @JsonProperty("type") private val type: Type,
        @JsonProperty("token") private val token: String?,
        @JsonProperty("memo") private val memo: String?,
        @JsonProperty("user_defined_id") private val userDefinedId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("amount") fun amount(): Long = amount

        @JsonProperty("external_bank_account_token")
        fun externalBankAccountToken(): String = externalBankAccountToken

        @JsonProperty("financial_account_token")
        fun financialAccountToken(): String = financialAccountToken

        @JsonProperty("method") fun method(): Method = method

        @JsonProperty("method_attributes")
        fun methodAttributes(): PaymentMethodRequestAttributes = methodAttributes

        @JsonProperty("type") fun type(): Type = type

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        @JsonProperty("token") fun token(): Optional<String> = Optional.ofNullable(token)

        @JsonProperty("memo") fun memo(): Optional<String> = Optional.ofNullable(memo)

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
                amount = paymentCreateBody.amount
                externalBankAccountToken = paymentCreateBody.externalBankAccountToken
                financialAccountToken = paymentCreateBody.financialAccountToken
                method = paymentCreateBody.method
                methodAttributes = paymentCreateBody.methodAttributes
                type = paymentCreateBody.type
                token = paymentCreateBody.token
                memo = paymentCreateBody.memo
                userDefinedId = paymentCreateBody.userDefinedId
                additionalProperties = paymentCreateBody.additionalProperties.toMutableMap()
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
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            fun token(token: String?) = apply { this.token = token }

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            fun token(token: Optional<String>) = token(token.orElse(null))

            fun memo(memo: String?) = apply { this.memo = memo }

            fun memo(memo: Optional<String>) = memo(memo.orElse(null))

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

            return /* spotless:off */ other is PaymentCreateBody && amount == other.amount && externalBankAccountToken == other.externalBankAccountToken && financialAccountToken == other.financialAccountToken && method == other.method && methodAttributes == other.methodAttributes && type == other.type && token == other.token && memo == other.memo && userDefinedId == other.userDefinedId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, externalBankAccountToken, financialAccountToken, method, methodAttributes, type, token, memo, userDefinedId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentCreateBody{amount=$amount, externalBankAccountToken=$externalBankAccountToken, financialAccountToken=$financialAccountToken, method=$method, methodAttributes=$methodAttributes, type=$type, token=$token, memo=$memo, userDefinedId=$userDefinedId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: PaymentCreateBody.Builder = PaymentCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(paymentCreateParams: PaymentCreateParams) = apply {
            body = paymentCreateParams.body.toBuilder()
            additionalHeaders = paymentCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = paymentCreateParams.additionalQueryParams.toBuilder()
        }

        fun amount(amount: Long) = apply { body.amount(amount) }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            body.externalBankAccountToken(externalBankAccountToken)
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        fun method(method: Method) = apply { body.method(method) }

        fun methodAttributes(methodAttributes: PaymentMethodRequestAttributes) = apply {
            body.methodAttributes(methodAttributes)
        }

        fun type(type: Type) = apply { body.type(type) }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String?) = apply { body.token(token) }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: Optional<String>) = token(token.orElse(null))

        fun memo(memo: String?) = apply { body.memo(memo) }

        fun memo(memo: Optional<String>) = memo(memo.orElse(null))

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

        fun build(): PaymentCreateParams =
            PaymentCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Method
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH_NEXT_DAY = of("ACH_NEXT_DAY")

            @JvmField val ACH_SAME_DAY = of("ACH_SAME_DAY")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Method && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class PaymentMethodRequestAttributes
    @JsonCreator
    private constructor(
        @JsonProperty("sec_code") private val secCode: SecCode,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("sec_code") fun secCode(): SecCode = secCode

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
                    secCode = paymentMethodRequestAttributes.secCode
                    additionalProperties =
                        paymentMethodRequestAttributes.additionalProperties.toMutableMap()
                }

            fun secCode(secCode: SecCode) = apply { this.secCode = secCode }

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

            companion object {

                @JvmField val CCD = of("CCD")

                @JvmField val PPD = of("PPD")

                @JvmField val WEB = of("WEB")

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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is SecCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PaymentMethodRequestAttributes && secCode == other.secCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(secCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PaymentMethodRequestAttributes{secCode=$secCode, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COLLECTION = of("COLLECTION")

            @JvmField val PAYMENT = of("PAYMENT")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PaymentCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "PaymentCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
