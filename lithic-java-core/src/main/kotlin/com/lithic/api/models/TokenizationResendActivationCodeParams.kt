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

class TokenizationResendActivationCodeParams
constructor(
    private val tokenizationToken: String,
    private val activationMethodType: ActivationMethodType?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun tokenizationToken(): String = tokenizationToken

    fun activationMethodType(): Optional<ActivationMethodType> =
        Optional.ofNullable(activationMethodType)

    @JvmSynthetic
    internal fun getBody(): TokenizationResendActivationCodeBody {
        return TokenizationResendActivationCodeBody(activationMethodType, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> tokenizationToken
            else -> ""
        }
    }

    @JsonDeserialize(builder = TokenizationResendActivationCodeBody.Builder::class)
    @NoAutoDetect
    class TokenizationResendActivationCodeBody
    internal constructor(
        private val activationMethodType: ActivationMethodType?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /**
         * The communication method that the user has selected to use to receive the authentication
         * code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
         * "EMAIL_TO_CARDHOLDER_ADDRESS"
         */
        @JsonProperty("activation_method_type")
        fun activationMethodType(): ActivationMethodType? = activationMethodType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is TokenizationResendActivationCodeBody &&
                this.activationMethodType == other.activationMethodType &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = Objects.hash(activationMethodType, additionalProperties)
            }
            return hashCode
        }

        override fun toString() =
            "TokenizationResendActivationCodeBody{activationMethodType=$activationMethodType, additionalProperties=$additionalProperties}"

        companion object {

            @JvmStatic fun builder() = Builder()
        }

        class Builder {

            private var activationMethodType: ActivationMethodType? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(
                tokenizationResendActivationCodeBody: TokenizationResendActivationCodeBody
            ) = apply {
                this.activationMethodType =
                    tokenizationResendActivationCodeBody.activationMethodType
                additionalProperties(tokenizationResendActivationCodeBody.additionalProperties)
            }

            /**
             * The communication method that the user has selected to use to receive the
             * authentication code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
             * "EMAIL_TO_CARDHOLDER_ADDRESS"
             */
            @JsonProperty("activation_method_type")
            fun activationMethodType(activationMethodType: ActivationMethodType) = apply {
                this.activationMethodType = activationMethodType
            }

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

            fun build(): TokenizationResendActivationCodeBody =
                TokenizationResendActivationCodeBody(
                    activationMethodType,
                    additionalProperties.toUnmodifiable()
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

        return other is TokenizationResendActivationCodeParams &&
            this.tokenizationToken == other.tokenizationToken &&
            this.activationMethodType == other.activationMethodType &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            tokenizationToken,
            activationMethodType,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "TokenizationResendActivationCodeParams{tokenizationToken=$tokenizationToken, activationMethodType=$activationMethodType, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var tokenizationToken: String? = null
        private var activationMethodType: ActivationMethodType? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            tokenizationResendActivationCodeParams: TokenizationResendActivationCodeParams
        ) = apply {
            this.tokenizationToken = tokenizationResendActivationCodeParams.tokenizationToken
            this.activationMethodType = tokenizationResendActivationCodeParams.activationMethodType
            additionalQueryParams(tokenizationResendActivationCodeParams.additionalQueryParams)
            additionalHeaders(tokenizationResendActivationCodeParams.additionalHeaders)
            additionalBodyProperties(
                tokenizationResendActivationCodeParams.additionalBodyProperties
            )
        }

        fun tokenizationToken(tokenizationToken: String) = apply {
            this.tokenizationToken = tokenizationToken
        }

        /**
         * The communication method that the user has selected to use to receive the authentication
         * code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
         * "EMAIL_TO_CARDHOLDER_ADDRESS"
         */
        fun activationMethodType(activationMethodType: ActivationMethodType) = apply {
            this.activationMethodType = activationMethodType
        }

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

        fun build(): TokenizationResendActivationCodeParams =
            TokenizationResendActivationCodeParams(
                checkNotNull(tokenizationToken) {
                    "`tokenizationToken` is required but was not set"
                },
                activationMethodType,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class ActivationMethodType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ActivationMethodType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField
            val EMAIL_TO_CARDHOLDER_ADDRESS =
                ActivationMethodType(JsonField.of("EMAIL_TO_CARDHOLDER_ADDRESS"))

            @JvmField
            val TEXT_TO_CARDHOLDER_NUMBER =
                ActivationMethodType(JsonField.of("TEXT_TO_CARDHOLDER_NUMBER"))

            @JvmStatic fun of(value: String) = ActivationMethodType(JsonField.of(value))
        }

        enum class Known {
            EMAIL_TO_CARDHOLDER_ADDRESS,
            TEXT_TO_CARDHOLDER_NUMBER,
        }

        enum class Value {
            EMAIL_TO_CARDHOLDER_ADDRESS,
            TEXT_TO_CARDHOLDER_NUMBER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                EMAIL_TO_CARDHOLDER_ADDRESS -> Value.EMAIL_TO_CARDHOLDER_ADDRESS
                TEXT_TO_CARDHOLDER_NUMBER -> Value.TEXT_TO_CARDHOLDER_NUMBER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                EMAIL_TO_CARDHOLDER_ADDRESS -> Known.EMAIL_TO_CARDHOLDER_ADDRESS
                TEXT_TO_CARDHOLDER_NUMBER -> Known.TEXT_TO_CARDHOLDER_NUMBER
                else -> throw LithicInvalidDataException("Unknown ActivationMethodType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
