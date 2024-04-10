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
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import com.lithic.api.models.*
import java.util.Objects
import java.util.Optional

class FinancialAccountCreateParams
constructor(
    private val nickname: String,
    private val type: Type,
    private val accountToken: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun nickname(): String = nickname

    fun type(): Type = type

    fun accountToken(): Optional<String> = Optional.ofNullable(accountToken)

    @JvmSynthetic
    internal fun getBody(): FinancialAccountCreateBody {
        return FinancialAccountCreateBody(
            nickname,
            type,
            accountToken,
            additionalBodyProperties,
        )
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = FinancialAccountCreateBody.Builder::class)
    @NoAutoDetect
    class FinancialAccountCreateBody
    internal constructor(
        private val nickname: String?,
        private val type: Type?,
        private val accountToken: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        @JsonProperty("nickname") fun nickname(): String? = nickname

        @JsonProperty("type") fun type(): Type? = type

        @JsonProperty("account_token") fun accountToken(): String? = accountToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FinancialAccountCreateBody &&
                this.nickname == other.nickname &&
                this.type == other.type &&
                this.accountToken == other.accountToken &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        nickname,
                        type,
                        accountToken,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "FinancialAccountCreateBody{nickname=$nickname, type=$type, accountToken=$accountToken, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var nickname: String? = null
            private var type: Type? = null
            private var accountToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(financialAccountCreateBody: FinancialAccountCreateBody) = apply {
                this.nickname = financialAccountCreateBody.nickname
                this.type = financialAccountCreateBody.type
                this.accountToken = financialAccountCreateBody.accountToken
                additionalProperties(financialAccountCreateBody.additionalProperties)
            }

            @JsonProperty("nickname")
            fun nickname(nickname: String) = apply { this.nickname = nickname }

            @JsonProperty("type") fun type(type: Type) = apply { this.type = type }

            @JsonProperty("account_token")
            fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

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

            fun build(): FinancialAccountCreateBody =
                FinancialAccountCreateBody(
                    checkNotNull(nickname) { "`nickname` is required but was not set" },
                    checkNotNull(type) { "`type` is required but was not set" },
                    accountToken,
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

        return other is FinancialAccountCreateParams &&
            this.nickname == other.nickname &&
            this.type == other.type &&
            this.accountToken == other.accountToken &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            nickname,
            type,
            accountToken,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "FinancialAccountCreateParams{nickname=$nickname, type=$type, accountToken=$accountToken, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var nickname: String? = null
        private var type: Type? = null
        private var accountToken: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(financialAccountCreateParams: FinancialAccountCreateParams) = apply {
            this.nickname = financialAccountCreateParams.nickname
            this.type = financialAccountCreateParams.type
            this.accountToken = financialAccountCreateParams.accountToken
            additionalQueryParams(financialAccountCreateParams.additionalQueryParams)
            additionalHeaders(financialAccountCreateParams.additionalHeaders)
            additionalBodyProperties(financialAccountCreateParams.additionalBodyProperties)
        }

        fun nickname(nickname: String) = apply { this.nickname = nickname }

        fun type(type: Type) = apply { this.type = type }

        fun accountToken(accountToken: String) = apply { this.accountToken = accountToken }

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

        fun build(): FinancialAccountCreateParams =
            FinancialAccountCreateParams(
                checkNotNull(nickname) { "`nickname` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                accountToken,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
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

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val OPERATING = Type(JsonField.of("OPERATING"))

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
    }
}
