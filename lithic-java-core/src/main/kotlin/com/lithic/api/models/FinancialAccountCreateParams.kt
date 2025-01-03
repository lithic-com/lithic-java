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

class FinancialAccountCreateParams
constructor(
    private val idempotencyKey: String?,
    private val body: FinancialAccountCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    fun idempotencyKey(): Optional<String> = Optional.ofNullable(idempotencyKey)

    fun nickname(): String = body.nickname()

    fun type(): Type = body.type()

    fun accountToken(): Optional<String> = body.accountToken()

    fun isForBenefitOf(): Optional<Boolean> = body.isForBenefitOf()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    @JvmSynthetic internal fun getBody(): FinancialAccountCreateBody = body

    @JvmSynthetic
    internal fun getHeaders(): Headers {
        val headers = Headers.builder()
        this.idempotencyKey?.let { headers.put("Idempotency-Key", listOf(it.toString())) }
        headers.putAll(additionalHeaders)
        return headers.build()
    }

    @JvmSynthetic internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class FinancialAccountCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("nickname") private val nickname: String,
        @JsonProperty("type") private val type: Type,
        @JsonProperty("account_token") private val accountToken: String?,
        @JsonProperty("is_for_benefit_of") private val isForBenefitOf: Boolean?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        @JsonProperty("nickname") fun nickname(): String = nickname

        @JsonProperty("type") fun type(): Type = type

        @JsonProperty("account_token")
        fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

        @JsonProperty("is_for_benefit_of")
        fun isForBenefitOf(): Optional<Boolean> = Optional.ofNullable(isForBenefitOf)

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var nickname: String? = null
            private var type: Type? = null
            private var accountToken: String? = null
            private var isForBenefitOf: Boolean? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(financialAccountCreateBody: FinancialAccountCreateBody) = apply {
                nickname = financialAccountCreateBody.nickname
                type = financialAccountCreateBody.type
                accountToken = financialAccountCreateBody.accountToken
                isForBenefitOf = financialAccountCreateBody.isForBenefitOf
                additionalProperties =
                    financialAccountCreateBody.additionalProperties.toMutableMap()
            }

            fun nickname(nickname: String) = apply { this.nickname = nickname }

            fun type(type: Type) = apply { this.type = type }

            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

            fun isForBenefitOf(isForBenefitOf: Boolean) = apply {
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

            fun build(): FinancialAccountCreateBody =
                FinancialAccountCreateBody(
                    checkNotNull(nickname) { "`nickname` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    accountToken,
                    isForBenefitOf,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is FinancialAccountCreateBody && nickname == other.nickname && type == other.type && accountToken == other.accountToken && isForBenefitOf == other.isForBenefitOf && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(nickname, type, accountToken, isForBenefitOf, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "FinancialAccountCreateBody{nickname=$nickname, type=$type, accountToken=$accountToken, isForBenefitOf=$isForBenefitOf, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var idempotencyKey: String? = null
        private var body: FinancialAccountCreateBody.Builder = FinancialAccountCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(financialAccountCreateParams: FinancialAccountCreateParams) = apply {
            idempotencyKey = financialAccountCreateParams.idempotencyKey
            body = financialAccountCreateParams.body.toBuilder()
            additionalHeaders = financialAccountCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = financialAccountCreateParams.additionalQueryParams.toBuilder()
        }

        fun idempotencyKey(idempotencyKey: String) = apply { this.idempotencyKey = idempotencyKey }

        fun nickname(nickname: String) = apply { body.nickname(nickname) }

        fun type(type: Type) = apply { body.type(type) }

        fun accountToken(accountToken: String) = apply { body.accountToken(accountToken) }

        fun isForBenefitOf(isForBenefitOf: Boolean) = apply { body.isForBenefitOf(isForBenefitOf) }

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

        fun build(): FinancialAccountCreateParams =
            FinancialAccountCreateParams(
                idempotencyKey,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            @JvmField val OPERATING = of("OPERATING")

            @JvmStatic fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            OPERATING,
        }

        enum class Value {
            OPERATING,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OPERATING -> Value.OPERATING
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OPERATING -> Known.OPERATING
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

        return /* spotless:off */ other is FinancialAccountCreateParams && idempotencyKey == other.idempotencyKey && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(idempotencyKey, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "FinancialAccountCreateParams{idempotencyKey=$idempotencyKey, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
