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

/**
 * This endpoint is used to ask the card network to send another activation code to a cardholder
 * that has already tried tokenizing a card. A successful response indicates that the request was
 * successfully delivered to the card network. The endpoint may only be used on Mastercard digital
 * wallet tokenizations with status `INACTIVE`, `PENDING_ACTIVATION`, or `PENDING_2FA`. The network
 * will send a new activation code to the one of the contact methods provided in the initial
 * tokenization flow. If a user fails to enter the code correctly 3 times, the contact method will
 * not be eligible for resending the activation code, and the cardholder must restart the provision
 * process. Reach out at [lithic.com/contact](https://lithic.com/contact) for more information.
 */
class TokenizationResendActivationCodeParams
private constructor(
    private val tokenizationToken: String,
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun tokenizationToken(): String = tokenizationToken

    /**
     * The communication method that the user has selected to use to receive the authentication
     * code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
     * "EMAIL_TO_CARDHOLDER_ADDRESS"
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun activationMethodType(): Optional<ActivationMethodType> = body.activationMethodType()

    /**
     * Returns the raw JSON value of [activationMethodType].
     *
     * Unlike [activationMethodType], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _activationMethodType(): JsonField<ActivationMethodType> = body._activationMethodType()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    @JvmSynthetic internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> tokenizationToken
            else -> ""
        }
    }

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("activation_method_type")
        @ExcludeMissing
        private val activationMethodType: JsonField<ActivationMethodType> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The communication method that the user has selected to use to receive the authentication
         * code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
         * "EMAIL_TO_CARDHOLDER_ADDRESS"
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun activationMethodType(): Optional<ActivationMethodType> =
            Optional.ofNullable(activationMethodType.getNullable("activation_method_type"))

        /**
         * Returns the raw JSON value of [activationMethodType].
         *
         * Unlike [activationMethodType], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("activation_method_type")
        @ExcludeMissing
        fun _activationMethodType(): JsonField<ActivationMethodType> = activationMethodType

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            activationMethodType()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /** Returns a mutable builder for constructing an instance of [Body]. */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var activationMethodType: JsonField<ActivationMethodType> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(body: Body) = apply {
                activationMethodType = body.activationMethodType
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The communication method that the user has selected to use to receive the
             * authentication code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
             * "EMAIL_TO_CARDHOLDER_ADDRESS"
             */
            fun activationMethodType(activationMethodType: ActivationMethodType) =
                activationMethodType(JsonField.of(activationMethodType))

            /**
             * Sets [Builder.activationMethodType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.activationMethodType] with a well-typed
             * [ActivationMethodType] value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun activationMethodType(activationMethodType: JsonField<ActivationMethodType>) =
                apply {
                    this.activationMethodType = activationMethodType
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             */
            fun build(): Body = Body(activationMethodType, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && activationMethodType == other.activationMethodType && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(activationMethodType, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{activationMethodType=$activationMethodType, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [TokenizationResendActivationCodeParams].
         *
         * The following fields are required:
         * ```java
         * .tokenizationToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenizationResendActivationCodeParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var tokenizationToken: String? = null
        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            tokenizationResendActivationCodeParams: TokenizationResendActivationCodeParams
        ) = apply {
            tokenizationToken = tokenizationResendActivationCodeParams.tokenizationToken
            body = tokenizationResendActivationCodeParams.body.toBuilder()
            additionalHeaders = tokenizationResendActivationCodeParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                tokenizationResendActivationCodeParams.additionalQueryParams.toBuilder()
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
            body.activationMethodType(activationMethodType)
        }

        /**
         * Sets [Builder.activationMethodType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.activationMethodType] with a well-typed
         * [ActivationMethodType] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun activationMethodType(activationMethodType: JsonField<ActivationMethodType>) = apply {
            body.activationMethodType(activationMethodType)
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

        /**
         * Returns an immutable instance of [TokenizationResendActivationCodeParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .tokenizationToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenizationResendActivationCodeParams =
            TokenizationResendActivationCodeParams(
                checkRequired("tokenizationToken", tokenizationToken),
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * The communication method that the user has selected to use to receive the authentication
     * code. Supported Values: Sms = "TEXT_TO_CARDHOLDER_NUMBER". Email =
     * "EMAIL_TO_CARDHOLDER_ADDRESS"
     */
    class ActivationMethodType
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val EMAIL_TO_CARDHOLDER_ADDRESS = of("EMAIL_TO_CARDHOLDER_ADDRESS")

            @JvmField val TEXT_TO_CARDHOLDER_NUMBER = of("TEXT_TO_CARDHOLDER_NUMBER")

            @JvmStatic fun of(value: String) = ActivationMethodType(JsonField.of(value))
        }

        /** An enum containing [ActivationMethodType]'s known values. */
        enum class Known {
            EMAIL_TO_CARDHOLDER_ADDRESS,
            TEXT_TO_CARDHOLDER_NUMBER,
        }

        /**
         * An enum containing [ActivationMethodType]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [ActivationMethodType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            EMAIL_TO_CARDHOLDER_ADDRESS,
            TEXT_TO_CARDHOLDER_NUMBER,
            /**
             * An enum member indicating that [ActivationMethodType] was instantiated with an
             * unknown value.
             */
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
                EMAIL_TO_CARDHOLDER_ADDRESS -> Value.EMAIL_TO_CARDHOLDER_ADDRESS
                TEXT_TO_CARDHOLDER_NUMBER -> Value.TEXT_TO_CARDHOLDER_NUMBER
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
                EMAIL_TO_CARDHOLDER_ADDRESS -> Known.EMAIL_TO_CARDHOLDER_ADDRESS
                TEXT_TO_CARDHOLDER_NUMBER -> Known.TEXT_TO_CARDHOLDER_NUMBER
                else -> throw LithicInvalidDataException("Unknown ActivationMethodType: $value")
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

            return /* spotless:off */ other is ActivationMethodType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is TokenizationResendActivationCodeParams && tokenizationToken == other.tokenizationToken && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(tokenizationToken, body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "TokenizationResendActivationCodeParams{tokenizationToken=$tokenizationToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
