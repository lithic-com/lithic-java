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
import com.lithic.api.core.Params
import com.lithic.api.core.checkRequired
import com.lithic.api.core.http.Headers
import com.lithic.api.core.http.QueryParams
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

/**
 * Update the verification method for an external bank account. Verification method can only be
 * updated if the `verification_state` is `PENDING`.
 */
class ExternalBankAccountSetVerificationMethodParams
private constructor(
    private val externalBankAccountToken: String?,
    private val body: SetVerificationMethodRequest,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    fun externalBankAccountToken(): Optional<String> = Optional.ofNullable(externalBankAccountToken)

    /**
     * The verification method to set for the external bank account
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun verificationMethod(): SetVerificationMethodAllowedVerificationMethods =
        body.verificationMethod()

    /**
     * The financial account token of the operating account to fund the micro deposits. Required
     * when verification_method is MICRO_DEPOSIT or PRENOTE.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun financialAccountToken(): Optional<String> = body.financialAccountToken()

    /**
     * Returns the raw JSON value of [verificationMethod].
     *
     * Unlike [verificationMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _verificationMethod(): JsonField<SetVerificationMethodAllowedVerificationMethods> =
        body._verificationMethod()

    /**
     * Returns the raw JSON value of [financialAccountToken].
     *
     * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    fun _financialAccountToken(): JsonField<String> = body._financialAccountToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ExternalBankAccountSetVerificationMethodParams].
         *
         * The following fields are required:
         * ```java
         * .verificationMethod()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [ExternalBankAccountSetVerificationMethodParams]. */
    class Builder internal constructor() {

        private var externalBankAccountToken: String? = null
        private var body: SetVerificationMethodRequest.Builder =
            SetVerificationMethodRequest.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        @JvmSynthetic
        internal fun from(
            externalBankAccountSetVerificationMethodParams:
                ExternalBankAccountSetVerificationMethodParams
        ) = apply {
            externalBankAccountToken =
                externalBankAccountSetVerificationMethodParams.externalBankAccountToken
            body = externalBankAccountSetVerificationMethodParams.body.toBuilder()
            additionalHeaders =
                externalBankAccountSetVerificationMethodParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                externalBankAccountSetVerificationMethodParams.additionalQueryParams.toBuilder()
        }

        fun externalBankAccountToken(externalBankAccountToken: String?) = apply {
            this.externalBankAccountToken = externalBankAccountToken
        }

        /**
         * Alias for calling [Builder.externalBankAccountToken] with
         * `externalBankAccountToken.orElse(null)`.
         */
        fun externalBankAccountToken(externalBankAccountToken: Optional<String>) =
            externalBankAccountToken(externalBankAccountToken.getOrNull())

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [verificationMethod]
         * - [financialAccountToken]
         */
        fun body(body: SetVerificationMethodRequest) = apply { this.body = body.toBuilder() }

        /** The verification method to set for the external bank account */
        fun verificationMethod(
            verificationMethod: SetVerificationMethodAllowedVerificationMethods
        ) = apply { body.verificationMethod(verificationMethod) }

        /**
         * Sets [Builder.verificationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.verificationMethod] with a well-typed
         * [SetVerificationMethodAllowedVerificationMethods] value instead. This method is primarily
         * for setting the field to an undocumented or not yet supported value.
         */
        fun verificationMethod(
            verificationMethod: JsonField<SetVerificationMethodAllowedVerificationMethods>
        ) = apply { body.verificationMethod(verificationMethod) }

        /**
         * The financial account token of the operating account to fund the micro deposits. Required
         * when verification_method is MICRO_DEPOSIT or PRENOTE.
         */
        fun financialAccountToken(financialAccountToken: String) = apply {
            body.financialAccountToken(financialAccountToken)
        }

        /**
         * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.financialAccountToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
            body.financialAccountToken(financialAccountToken)
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
         * Returns an immutable instance of [ExternalBankAccountSetVerificationMethodParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .verificationMethod()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ExternalBankAccountSetVerificationMethodParams =
            ExternalBankAccountSetVerificationMethodParams(
                externalBankAccountToken,
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): SetVerificationMethodRequest = body

    fun _pathParam(index: Int): String =
        when (index) {
            0 -> externalBankAccountToken ?: ""
            else -> ""
        }

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class SetVerificationMethodRequest
    @JsonCreator(mode = JsonCreator.Mode.DISABLED)
    private constructor(
        private val verificationMethod: JsonField<SetVerificationMethodAllowedVerificationMethods>,
        private val financialAccountToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("verification_method")
            @ExcludeMissing
            verificationMethod: JsonField<SetVerificationMethodAllowedVerificationMethods> =
                JsonMissing.of(),
            @JsonProperty("financial_account_token")
            @ExcludeMissing
            financialAccountToken: JsonField<String> = JsonMissing.of(),
        ) : this(verificationMethod, financialAccountToken, mutableMapOf())

        /**
         * The verification method to set for the external bank account
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun verificationMethod(): SetVerificationMethodAllowedVerificationMethods =
            verificationMethod.getRequired("verification_method")

        /**
         * The financial account token of the operating account to fund the micro deposits. Required
         * when verification_method is MICRO_DEPOSIT or PRENOTE.
         *
         * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
         *   server responded with an unexpected value).
         */
        fun financialAccountToken(): Optional<String> =
            financialAccountToken.getOptional("financial_account_token")

        /**
         * Returns the raw JSON value of [verificationMethod].
         *
         * Unlike [verificationMethod], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("verification_method")
        @ExcludeMissing
        fun _verificationMethod(): JsonField<SetVerificationMethodAllowedVerificationMethods> =
            verificationMethod

        /**
         * Returns the raw JSON value of [financialAccountToken].
         *
         * Unlike [financialAccountToken], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("financial_account_token")
        @ExcludeMissing
        fun _financialAccountToken(): JsonField<String> = financialAccountToken

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of
             * [SetVerificationMethodRequest].
             *
             * The following fields are required:
             * ```java
             * .verificationMethod()
             * ```
             */
            @JvmStatic fun builder() = Builder()
        }

        /** A builder for [SetVerificationMethodRequest]. */
        class Builder internal constructor() {

            private var verificationMethod:
                JsonField<SetVerificationMethodAllowedVerificationMethods>? =
                null
            private var financialAccountToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            @JvmSynthetic
            internal fun from(setVerificationMethodRequest: SetVerificationMethodRequest) = apply {
                verificationMethod = setVerificationMethodRequest.verificationMethod
                financialAccountToken = setVerificationMethodRequest.financialAccountToken
                additionalProperties =
                    setVerificationMethodRequest.additionalProperties.toMutableMap()
            }

            /** The verification method to set for the external bank account */
            fun verificationMethod(
                verificationMethod: SetVerificationMethodAllowedVerificationMethods
            ) = verificationMethod(JsonField.of(verificationMethod))

            /**
             * Sets [Builder.verificationMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.verificationMethod] with a well-typed
             * [SetVerificationMethodAllowedVerificationMethods] value instead. This method is
             * primarily for setting the field to an undocumented or not yet supported value.
             */
            fun verificationMethod(
                verificationMethod: JsonField<SetVerificationMethodAllowedVerificationMethods>
            ) = apply { this.verificationMethod = verificationMethod }

            /**
             * The financial account token of the operating account to fund the micro deposits.
             * Required when verification_method is MICRO_DEPOSIT or PRENOTE.
             */
            fun financialAccountToken(financialAccountToken: String) =
                financialAccountToken(JsonField.of(financialAccountToken))

            /**
             * Sets [Builder.financialAccountToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.financialAccountToken] with a well-typed [String]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun financialAccountToken(financialAccountToken: JsonField<String>) = apply {
                this.financialAccountToken = financialAccountToken
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
             * Returns an immutable instance of [SetVerificationMethodRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```java
             * .verificationMethod()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): SetVerificationMethodRequest =
                SetVerificationMethodRequest(
                    checkRequired("verificationMethod", verificationMethod),
                    financialAccountToken,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): SetVerificationMethodRequest = apply {
            if (validated) {
                return@apply
            }

            verificationMethod().validate()
            financialAccountToken()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic
        internal fun validity(): Int =
            (verificationMethod.asKnown().getOrNull()?.validity() ?: 0) +
                (if (financialAccountToken.asKnown().isPresent) 1 else 0)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SetVerificationMethodRequest &&
                verificationMethod == other.verificationMethod &&
                financialAccountToken == other.financialAccountToken &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(verificationMethod, financialAccountToken, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SetVerificationMethodRequest{verificationMethod=$verificationMethod, financialAccountToken=$financialAccountToken, additionalProperties=$additionalProperties}"
    }

    /** The verification method to set for the external bank account */
    class SetVerificationMethodAllowedVerificationMethods
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

            @JvmField val MICRO_DEPOSIT = of("MICRO_DEPOSIT")

            @JvmField val PRENOTE = of("PRENOTE")

            @JvmField val EXTERNALLY_VERIFIED = of("EXTERNALLY_VERIFIED")

            @JvmStatic
            fun of(value: String) =
                SetVerificationMethodAllowedVerificationMethods(JsonField.of(value))
        }

        /** An enum containing [SetVerificationMethodAllowedVerificationMethods]'s known values. */
        enum class Known {
            MICRO_DEPOSIT,
            PRENOTE,
            EXTERNALLY_VERIFIED,
        }

        /**
         * An enum containing [SetVerificationMethodAllowedVerificationMethods]'s known values, as
         * well as an [_UNKNOWN] member.
         *
         * An instance of [SetVerificationMethodAllowedVerificationMethods] can contain an unknown
         * value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            MICRO_DEPOSIT,
            PRENOTE,
            EXTERNALLY_VERIFIED,
            /**
             * An enum member indicating that [SetVerificationMethodAllowedVerificationMethods] was
             * instantiated with an unknown value.
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
                MICRO_DEPOSIT -> Value.MICRO_DEPOSIT
                PRENOTE -> Value.PRENOTE
                EXTERNALLY_VERIFIED -> Value.EXTERNALLY_VERIFIED
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
                MICRO_DEPOSIT -> Known.MICRO_DEPOSIT
                PRENOTE -> Known.PRENOTE
                EXTERNALLY_VERIFIED -> Known.EXTERNALLY_VERIFIED
                else ->
                    throw LithicInvalidDataException(
                        "Unknown SetVerificationMethodAllowedVerificationMethods: $value"
                    )
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

        private var validated: Boolean = false

        fun validate(): SetVerificationMethodAllowedVerificationMethods = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: LithicInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SetVerificationMethodAllowedVerificationMethods && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ExternalBankAccountSetVerificationMethodParams &&
            externalBankAccountToken == other.externalBankAccountToken &&
            body == other.body &&
            additionalHeaders == other.additionalHeaders &&
            additionalQueryParams == other.additionalQueryParams
    }

    override fun hashCode(): Int =
        Objects.hash(externalBankAccountToken, body, additionalHeaders, additionalQueryParams)

    override fun toString() =
        "ExternalBankAccountSetVerificationMethodParams{externalBankAccountToken=$externalBankAccountToken, body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
