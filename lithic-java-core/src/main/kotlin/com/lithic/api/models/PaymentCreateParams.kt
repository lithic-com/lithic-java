// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.lithic.api.core.Enum
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.core.immutableEmptyMap
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

/** Initiates a payment between a financial account and an external bank account. */
class PaymentCreateParams
private constructor(
    private val body: PaymentCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

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

    fun _amount(): JsonField<Long> = body._amount()

    fun _externalBankAccountToken(): JsonField<String> = body._externalBankAccountToken()

    fun _financialAccountToken(): JsonField<String> = body._financialAccountToken()

    fun _method(): JsonField<Method> = body._method()

    fun _methodAttributes(): JsonField<PaymentMethodRequestAttributes> = body._methodAttributes()

    fun _type(): JsonField<Type> = body._type()

    /**
     * Customer-provided token that will serve as an idempotency token. This token will become the
     * transaction token.
     */
    fun _token(): JsonField<String> = body._token()

    fun _memo(): JsonField<String> = body._memo()

    fun _userDefinedId(): JsonField<String> = body._userDefinedId()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): PaymentCreateBody = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class PaymentCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        private val externalBankAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        private val financialAccountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("method")
        @ExcludeMissing
        private val method: JsonField<Method> = JsonMissing.of(),
        @JsonProperty("method_attributes")
        @ExcludeMissing
        private val methodAttributes: JsonField<PaymentMethodRequestAttributes> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("token")
        @ExcludeMissing
        private val token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("memo")
        @ExcludeMissing
        private val memo: JsonField<String> = JsonMissing.of(),
        @JsonProperty("user_defined_id")
        @ExcludeMissing
        private val userDefinedId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun amount(): Long = amount.getRequired("amount")

        fun externalBankAccountToken(): String =
            externalBankAccountToken.getRequired("external_bank_account_token")

        fun financialAccountToken(): String =
            financialAccountToken.getRequired("financial_account_token")

        fun method(): Method = method.getRequired("method")

        fun methodAttributes(): PaymentMethodRequestAttributes =
            methodAttributes.getRequired("method_attributes")

        fun type(): Type = type.getRequired("type")

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

        fun memo(): Optional<String> = Optional.ofNullable(memo.getNullable("memo"))

        fun userDefinedId(): Optional<String> =
            Optional.ofNullable(userDefinedId.getNullable("user_defined_id"))

        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        @JsonProperty("external_bank_account_token")
        @ExcludeMissing
        fun _externalBankAccountToken(): JsonField<String> = externalBankAccountToken

        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        @JsonProperty("method") @ExcludeMissing fun _method(): JsonField<Method> = method

        @JsonProperty("method_attributes")
        @ExcludeMissing
        fun _methodAttributes(): JsonField<PaymentMethodRequestAttributes> = methodAttributes

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        @JsonProperty("user_defined_id")
        @ExcludeMissing
        fun _userDefinedId(): JsonField<String> = userDefinedId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentCreateBody = apply {
            if (validated) {
                return@apply
            }

            amount()
            externalBankAccountToken()
            financialAccountToken()
            method()
            methodAttributes().validate()
            type()
            token()
            memo()
            userDefinedId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentCreateBody]. */
        class Builder internal constructor() {

            private var amount: JsonField<Long>? = null
            private var externalBankAccountToken: JsonField<String>? = null
            private var financialAccountToken: JsonField<String>? = null
            private var method: JsonField<Method>? = null
            private var methodAttributes: JsonField<PaymentMethodRequestAttributes>? = null
            private var type: JsonField<Type>? = null
            private var token: JsonField<String> = JsonMissing.of()
            private var memo: JsonField<String> = JsonMissing.of()
            private var userDefinedId: JsonField<String> = JsonMissing.of()
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

            fun amount(amount: Long) = amount(JsonField.of(amount))

            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            fun externalBankAccountToken(externalBankAccountToken: String) =
                externalBankAccountToken(JsonField.of(externalBankAccountToken))

            fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
                this.externalBankAccountToken = externalBankAccountToken
            }

            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
            }

            fun method(method: Method) = method(JsonField.of(method))

            fun method(method: JsonField<Method>) = apply { this.method = method }

            fun methodAttributes(methodAttributes: PaymentMethodRequestAttributes) =
                methodAttributes(JsonField.of(methodAttributes))

            fun methodAttributes(methodAttributes: JsonField<PaymentMethodRequestAttributes>) =
                apply {
                    this.methodAttributes = methodAttributes
                }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            fun token(token: String) = token(JsonField.of(token))

            /**
             * Customer-provided token that will serve as an idempotency token. This token will
             * become the transaction token.
             */
            fun token(token: JsonField<String>) = apply { this.token = token }

            fun memo(memo: String) = memo(JsonField.of(memo))

            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            fun userDefinedId(userDefinedId: String) = userDefinedId(JsonField.of(userDefinedId))

            fun userDefinedId(userDefinedId: JsonField<String>) = apply {
                this.userDefinedId = userDefinedId
            }

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
                    checkRequired("amount", amount),
                    checkRequired("externalBankAccountToken", externalBankAccountToken),
                    checkRequired("financialAccountToken", financialAccountToken),
                    checkRequired("method", method),
                    checkRequired("methodAttributes", methodAttributes),
                    checkRequired("type", type),
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

    /** A builder for [PaymentCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

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

        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        fun externalBankAccountToken(externalBankAccountToken: String) = apply {
            body.externalBankAccountToken(externalBankAccountToken)
        }

        fun externalBankAccountToken(externalBankAccountToken: JsonField<String>) = apply {
            body.externalBankAccountToken(externalBankAccountToken)
        }

        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        fun method(method: Method) = apply { body.method(method) }

        fun method(method: JsonField<Method>) = apply { body.method(method) }

        fun methodAttributes(methodAttributes: PaymentMethodRequestAttributes) = apply {
            body.methodAttributes(methodAttributes)
        }

        fun methodAttributes(methodAttributes: JsonField<PaymentMethodRequestAttributes>) = apply {
            body.methodAttributes(methodAttributes)
        }

        fun type(type: Type) = apply { body.type(type) }

        fun type(type: JsonField<Type>) = apply { body.type(type) }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: String) = apply { body.token(token) }

        /**
         * Customer-provided token that will serve as an idempotency token. This token will become
         * the transaction token.
         */
        fun token(token: JsonField<String>) = apply { body.token(token) }

        fun memo(memo: String) = apply { body.memo(memo) }

        fun memo(memo: JsonField<String>) = apply { body.memo(memo) }

        fun userDefinedId(userDefinedId: String) = apply { body.userDefinedId(userDefinedId) }

        fun userDefinedId(userDefinedId: JsonField<String>) = apply {
            body.userDefinedId(userDefinedId)
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

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val ACH_NEXT_DAY = of("ACH_NEXT_DAY")

            @JvmField val ACH_SAME_DAY = of("ACH_SAME_DAY")

            @JvmStatic fun of(value: String) = Method(JsonField.of(value))
        }

        /** An enum containing [Method]'s known values. */
        enum class Known {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
        }

        /**
         * An enum containing [Method]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Method] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH_NEXT_DAY,
            ACH_SAME_DAY,
            /** An enum member indicating that [Method] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                ACH_NEXT_DAY -> Value.ACH_NEXT_DAY
                ACH_SAME_DAY -> Value.ACH_SAME_DAY
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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
        @JsonProperty("sec_code")
        @ExcludeMissing
        private val secCode: JsonField<SecCode> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun secCode(): SecCode = secCode.getRequired("sec_code")

        @JsonProperty("sec_code") @ExcludeMissing fun _secCode(): JsonField<SecCode> = secCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PaymentMethodRequestAttributes = apply {
            if (validated) {
                return@apply
            }

            secCode()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [PaymentMethodRequestAttributes]. */
        class Builder internal constructor() {

            private var secCode: JsonField<SecCode>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(paymentMethodRequestAttributes: PaymentMethodRequestAttributes) =
                apply {
                    secCode = paymentMethodRequestAttributes.secCode
                    additionalProperties =
                        paymentMethodRequestAttributes.additionalProperties.toMutableMap()
                }

            fun secCode(secCode: SecCode) = secCode(JsonField.of(secCode))

            fun secCode(secCode: JsonField<SecCode>) = apply { this.secCode = secCode }

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
                    checkRequired("secCode", secCode),
                    additionalProperties.toImmutable()
                )
        }

        class SecCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                @JvmField val CCD = of("CCD")

                @JvmField val PPD = of("PPD")

                @JvmField val WEB = of("WEB")

                @JvmStatic fun of(value: String) = SecCode(JsonField.of(value))
            }

            /** An enum containing [SecCode]'s known values. */
            enum class Known {
                CCD,
                PPD,
                WEB,
            }

            /**
             * An enum containing [SecCode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [SecCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CCD,
                PPD,
                WEB,
                /**
                 * An enum member indicating that [SecCode] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    CCD -> Value.CCD
                    PPD -> Value.PPD
                    WEB -> Value.WEB
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws LithicInvalidDataException if this class instance's value is a not a known
             *   member.
             */
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

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val COLLECTION = of("COLLECTION")

            @JvmField val PAYMENT = of("PAYMENT")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            COLLECTION,
            PAYMENT,
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            COLLECTION,
            PAYMENT,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                COLLECTION -> Value.COLLECTION
                PAYMENT -> Value.PAYMENT
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws LithicInvalidDataException if this class instance's value is a not a known
         *   member.
         */
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
