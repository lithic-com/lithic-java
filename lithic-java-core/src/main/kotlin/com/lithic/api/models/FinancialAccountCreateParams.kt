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

/** Create a new financial account */
class FinancialAccountCreateParams
private constructor(
    private val idempotencyKey: String?,
    private val body: CreateFinancialAccountRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun nickname(): String = body.nickname()

    fun type(): Type = body.type()

    fun accountToken(): Optional<String> = body.accountToken()

    fun isForBenefitOf(): Optional<Boolean> = body.isForBenefitOf()

    fun _nickname(): JsonField<String> = body._nickname()

    fun _type(): JsonField<Type> = body._type()

    fun _accountToken(): JsonField<String> = body._accountToken()

    fun _isForBenefitOf(): JsonField<Boolean> = body._isForBenefitOf()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): CreateFinancialAccountRequest = body

    override fun _headers(): Headers {
        val headers = Headers.builder()
        this.idempotencyKey?.let { headers.put("Idempotency-Key", listOf(it.toString())) }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class CreateFinancialAccountRequest
    @JsonCreator
    private constructor(
        @JsonProperty("nickname")
        @ExcludeMissing
        private val nickname: JsonField<String> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("account_token")
        @ExcludeMissing
        private val accountToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("is_for_benefit_of")
        @ExcludeMissing
        private val isForBenefitOf: JsonField<Boolean> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        fun nickname(): String = nickname.getRequired("nickname")

        fun type(): Type = type.getRequired("type")

        fun accountToken(): Optional<String> =
            Optional.ofNullable(accountToken.getNullable("account_token"))

        fun isForBenefitOf(): Optional<Boolean> =
            Optional.ofNullable(isForBenefitOf.getNullable("is_for_benefit_of"))

        @JsonProperty("nickname") @ExcludeMissing fun _nickname(): JsonField<String> = nickname

        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

        @JsonProperty("account_token")
        @ExcludeMissing
        fun _accountToken(): JsonField<String> = accountToken

        @JsonProperty("is_for_benefit_of")
        @ExcludeMissing
        fun _isForBenefitOf(): JsonField<Boolean> = isForBenefitOf

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreateFinancialAccountRequest = apply {
            if (validated) {
                return@apply
            }

            nickname()
            type()
            accountToken()
            isForBenefitOf()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [CreateFinancialAccountRequest]. */
        class Builder internal constructor() {

            private var nickname: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var accountToken: JsonField<String> = JsonMissing.of()
            private var isForBenefitOf: JsonField<Boolean> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(createFinancialAccountRequest: CreateFinancialAccountRequest) =
                apply {
                    nickname = createFinancialAccountRequest.nickname
                    type = createFinancialAccountRequest.type
                    accountToken = createFinancialAccountRequest.accountToken
                    isForBenefitOf = createFinancialAccountRequest.isForBenefitOf
                    additionalProperties =
                        createFinancialAccountRequest.additionalProperties.toMutableMap()
                }

            fun nickname(nickname: String) = nickname(JsonField.of(nickname))

            fun nickname(nickname: JsonField<String>) = apply { this.nickname = nickname }

            fun type(type: Type) = type(JsonField.of(type))

            fun type(type: JsonField<Type>) = apply { this.type = type }

            fun accountToken(accountToken: String) = accountToken(JsonField.of(accountToken))

            fun accountToken(accountToken: JsonField<String>) = apply {
                this.accountToken = accountToken
            }

            fun isForBenefitOf(isForBenefitOf: Boolean) =
                isForBenefitOf(JsonField.of(isForBenefitOf))

            fun isForBenefitOf(isForBenefitOf: JsonField<Boolean>) = apply {
                this.isForBenefitOf = isForBenefitOf
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

            fun build(): CreateFinancialAccountRequest =
                CreateFinancialAccountRequest(
                    checkRequired("nickname", nickname),
                    checkRequired("type", type),
                    accountToken,
                    isForBenefitOf,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreateFinancialAccountRequest && nickname == other.nickname && type == other.type && accountToken == other.accountToken && isForBenefitOf == other.isForBenefitOf && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(nickname, type, accountToken, isForBenefitOf, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreateFinancialAccountRequest{nickname=$nickname, type=$type, accountToken=$accountToken, isForBenefitOf=$isForBenefitOf, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [FinancialAccountCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var idempotencyKey: String? = null
        private var body: CreateFinancialAccountRequest.Builder =
            CreateFinancialAccountRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(financialAccountCreateParams: FinancialAccountCreateParams) = apply {
            idempotencyKey = financialAccountCreateParams.idempotencyKey
            body = financialAccountCreateParams.body.toBuilder()
            additionalHeaders = financialAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = financialAccountCreateParams.additionalQueryParams.toBuilder()
        }

        fun idempotencyKey(idempotencyKey: String?) = apply { this.idempotencyKey = idempotencyKey }

        fun idempotencyKey(idempotencyKey: Optional<String>) =
            idempotencyKey(idempotencyKey.orElse(null))

        fun nickname(nickname: String) = apply { body.nickname(nickname) }

        fun nickname(nickname: JsonField<String>) = apply { body.nickname(nickname) }

        fun type(type: Type) = apply { body.type(type) }

        fun type(type: JsonField<Type>) = apply { body.type(type) }

        fun accountToken(accountToken: String) = apply { body.accountToken(accountToken) }

        fun accountToken(accountToken: JsonField<String>) = apply {
            body.accountToken(accountToken)
        }

        fun isForBenefitOf(isForBenefitOf: Boolean) = apply { body.isForBenefitOf(isForBenefitOf) }

        fun isForBenefitOf(isForBenefitOf: JsonField<Boolean>) = apply {
            body.isForBenefitOf(isForBenefitOf)
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

        fun build(): FinancialAccountCreateParams =
            FinancialAccountCreateParams(
                idempotencyKey,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val OPERATING = of("OPERATING")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OPERATING
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
            OPERATING,
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
                OPERATING -> Value.OPERATING
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
                OPERATING -> Known.OPERATING
                else -> throw LithicInvalidDataException("Unknown Type: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws LithicInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

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

        return /* spotless:off */ other is FinancialAccountCreateParams && idempotencyKey == other.idempotencyKey && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(idempotencyKey, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FinancialAccountCreateParams{idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
