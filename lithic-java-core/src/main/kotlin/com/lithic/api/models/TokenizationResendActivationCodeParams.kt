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

class TokenizationResendActivationCodeParams
constructor(
    private val tokenizationToken: String,
    private val activationMethodType: ActivationMethodType?,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun tokenizationToken(): String = tokenizationToken

    fun activationMethodType(): Optional<ActivationMethodType> =
        Optional.ofNullable(activationMethodType)

    @JvmSynthetic
    internal fun getBody(): TokenizationResendActivationCodeBody {
        return TokenizationResendActivationCodeBody(activationMethodType, additionalBodyProperties)
    }

    @JvmSynthetic internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JvmSynthetic internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

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
                    additionalProperties.toImmutable()
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenizationResendActivationCodeBody && this.activationMethodType == other.activationMethodType && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(activationMethodType, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "TokenizationResendActivationCodeBody{activationMethodType=$activationMethodType, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationResendActivationCodeParams && this.tokenizationToken == other.tokenizationToken && this.activationMethodType == other.activationMethodType && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(tokenizationToken, activationMethodType, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "TokenizationResendActivationCodeParams{tokenizationToken=$tokenizationToken, activationMethodType=$activationMethodType, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var tokenizationToken: String? = null
        private var activationMethodType: ActivationMethodType? = null
        private var additionalHeaders: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalQueryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(
            tokenizationResendActivationCodeParams: TokenizationResendActivationCodeParams
        ) = apply {
            this.tokenizationToken = tokenizationResendActivationCodeParams.tokenizationToken
            this.activationMethodType = tokenizationResendActivationCodeParams.activationMethodType
            additionalHeaders(tokenizationResendActivationCodeParams.additionalHeaders)
            additionalQueryParams(tokenizationResendActivationCodeParams.additionalQueryParams)
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

        fun build(): TokenizationResendActivationCodeParams =
            TokenizationResendActivationCodeParams(
                checkNotNull(tokenizationToken) {
                    "`tokenizationToken` is required but was not set"
                },
                activationMethodType,
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

            return /* spotless:off */ other is ActivationMethodType && this.value == other.value /* spotless:on */
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
