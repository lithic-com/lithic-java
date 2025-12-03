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
import com.lithic.api.core.checkRequired
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class CardholderAuthentication
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authenticationMethod: JsonField<AuthenticationMethod>,
    private val authenticationResult: JsonField<AuthenticationResult>,
    private val decisionMadeBy: JsonField<DecisionMadeBy>,
    private val liabilityShift: JsonField<LiabilityShift>,
    private val threeDSAuthenticationToken: JsonField<String>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("authentication_method")
        @ExcludeMissing
        authenticationMethod: JsonField<AuthenticationMethod> = JsonMissing.of(),
        @JsonProperty("authentication_result")
        @ExcludeMissing
        authenticationResult: JsonField<AuthenticationResult> = JsonMissing.of(),
        @JsonProperty("decision_made_by")
        @ExcludeMissing
        decisionMadeBy: JsonField<DecisionMadeBy> = JsonMissing.of(),
        @JsonProperty("liability_shift")
        @ExcludeMissing
        liabilityShift: JsonField<LiabilityShift> = JsonMissing.of(),
        @JsonProperty("three_ds_authentication_token")
        @ExcludeMissing
        threeDSAuthenticationToken: JsonField<String> = JsonMissing.of(),
    ) : this(
        authenticationMethod,
        authenticationResult,
        decisionMadeBy,
        liabilityShift,
        threeDSAuthenticationToken,
        mutableMapOf(),
    )

    /**
     * Indicates the method used to authenticate the cardholder.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationMethod(): AuthenticationMethod =
        authenticationMethod.getRequired("authentication_method")

    /**
     * Indicates the outcome of the 3DS authentication process.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun authenticationResult(): AuthenticationResult =
        authenticationResult.getRequired("authentication_result")

    /**
     * Indicates which party made the 3DS authentication decision.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun decisionMadeBy(): DecisionMadeBy = decisionMadeBy.getRequired("decision_made_by")

    /**
     * Indicates whether chargeback liability shift applies to the transaction. Possible enum
     * values:
     * * `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow,
     *   chargeback liability shift applies.
     * * `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is
     *   liable.
     * * `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated cryptography,
     *   possibly recurring. Chargeback liability shift to the issuer applies.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun liabilityShift(): LiabilityShift = liabilityShift.getRequired("liability_shift")

    /**
     * Unique identifier you can use to match a given 3DS authentication (available via the
     * three_ds_authentication.created event webhook) and the transaction. Note that in cases where
     * liability shift does not occur, this token is matched to the transaction on a best-effort
     * basis.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun threeDSAuthenticationToken(): Optional<String> =
        threeDSAuthenticationToken.getOptional("three_ds_authentication_token")

    /**
     * Returns the raw JSON value of [authenticationMethod].
     *
     * Unlike [authenticationMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_method")
    @ExcludeMissing
    fun _authenticationMethod(): JsonField<AuthenticationMethod> = authenticationMethod

    /**
     * Returns the raw JSON value of [authenticationResult].
     *
     * Unlike [authenticationResult], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("authentication_result")
    @ExcludeMissing
    fun _authenticationResult(): JsonField<AuthenticationResult> = authenticationResult

    /**
     * Returns the raw JSON value of [decisionMadeBy].
     *
     * Unlike [decisionMadeBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("decision_made_by")
    @ExcludeMissing
    fun _decisionMadeBy(): JsonField<DecisionMadeBy> = decisionMadeBy

    /**
     * Returns the raw JSON value of [liabilityShift].
     *
     * Unlike [liabilityShift], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("liability_shift")
    @ExcludeMissing
    fun _liabilityShift(): JsonField<LiabilityShift> = liabilityShift

    /**
     * Returns the raw JSON value of [threeDSAuthenticationToken].
     *
     * Unlike [threeDSAuthenticationToken], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("three_ds_authentication_token")
    @ExcludeMissing
    fun _threeDSAuthenticationToken(): JsonField<String> = threeDSAuthenticationToken

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
         * Returns a mutable builder for constructing an instance of [CardholderAuthentication].
         *
         * The following fields are required:
         * ```java
         * .authenticationMethod()
         * .authenticationResult()
         * .decisionMadeBy()
         * .liabilityShift()
         * .threeDSAuthenticationToken()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [CardholderAuthentication]. */
    class Builder internal constructor() {

        private var authenticationMethod: JsonField<AuthenticationMethod>? = null
        private var authenticationResult: JsonField<AuthenticationResult>? = null
        private var decisionMadeBy: JsonField<DecisionMadeBy>? = null
        private var liabilityShift: JsonField<LiabilityShift>? = null
        private var threeDSAuthenticationToken: JsonField<String>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(cardholderAuthentication: CardholderAuthentication) = apply {
            authenticationMethod = cardholderAuthentication.authenticationMethod
            authenticationResult = cardholderAuthentication.authenticationResult
            decisionMadeBy = cardholderAuthentication.decisionMadeBy
            liabilityShift = cardholderAuthentication.liabilityShift
            threeDSAuthenticationToken = cardholderAuthentication.threeDSAuthenticationToken
            additionalProperties = cardholderAuthentication.additionalProperties.toMutableMap()
        }

        /** Indicates the method used to authenticate the cardholder. */
        fun authenticationMethod(authenticationMethod: AuthenticationMethod) =
            authenticationMethod(JsonField.of(authenticationMethod))

        /**
         * Sets [Builder.authenticationMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationMethod] with a well-typed
         * [AuthenticationMethod] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun authenticationMethod(authenticationMethod: JsonField<AuthenticationMethod>) = apply {
            this.authenticationMethod = authenticationMethod
        }

        /** Indicates the outcome of the 3DS authentication process. */
        fun authenticationResult(authenticationResult: AuthenticationResult) =
            authenticationResult(JsonField.of(authenticationResult))

        /**
         * Sets [Builder.authenticationResult] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authenticationResult] with a well-typed
         * [AuthenticationResult] value instead. This method is primarily for setting the field to
         * an undocumented or not yet supported value.
         */
        fun authenticationResult(authenticationResult: JsonField<AuthenticationResult>) = apply {
            this.authenticationResult = authenticationResult
        }

        /** Indicates which party made the 3DS authentication decision. */
        fun decisionMadeBy(decisionMadeBy: DecisionMadeBy) =
            decisionMadeBy(JsonField.of(decisionMadeBy))

        /**
         * Sets [Builder.decisionMadeBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.decisionMadeBy] with a well-typed [DecisionMadeBy] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun decisionMadeBy(decisionMadeBy: JsonField<DecisionMadeBy>) = apply {
            this.decisionMadeBy = decisionMadeBy
        }

        /**
         * Indicates whether chargeback liability shift applies to the transaction. Possible enum
         * values:
         * * `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow,
         *   chargeback liability shift applies.
         * * `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is
         *   liable.
         * * `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated
         *   cryptography, possibly recurring. Chargeback liability shift to the issuer applies.
         */
        fun liabilityShift(liabilityShift: LiabilityShift) =
            liabilityShift(JsonField.of(liabilityShift))

        /**
         * Sets [Builder.liabilityShift] to an arbitrary JSON value.
         *
         * You should usually call [Builder.liabilityShift] with a well-typed [LiabilityShift] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun liabilityShift(liabilityShift: JsonField<LiabilityShift>) = apply {
            this.liabilityShift = liabilityShift
        }

        /**
         * Unique identifier you can use to match a given 3DS authentication (available via the
         * three_ds_authentication.created event webhook) and the transaction. Note that in cases
         * where liability shift does not occur, this token is matched to the transaction on a
         * best-effort basis.
         */
        fun threeDSAuthenticationToken(threeDSAuthenticationToken: String?) =
            threeDSAuthenticationToken(JsonField.ofNullable(threeDSAuthenticationToken))

        /**
         * Alias for calling [Builder.threeDSAuthenticationToken] with
         * `threeDSAuthenticationToken.orElse(null)`.
         */
        fun threeDSAuthenticationToken(threeDSAuthenticationToken: Optional<String>) =
            threeDSAuthenticationToken(threeDSAuthenticationToken.getOrNull())

        /**
         * Sets [Builder.threeDSAuthenticationToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.threeDSAuthenticationToken] with a well-typed [String]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun threeDSAuthenticationToken(threeDSAuthenticationToken: JsonField<String>) = apply {
            this.threeDSAuthenticationToken = threeDSAuthenticationToken
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
         * Returns an immutable instance of [CardholderAuthentication].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authenticationMethod()
         * .authenticationResult()
         * .decisionMadeBy()
         * .liabilityShift()
         * .threeDSAuthenticationToken()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CardholderAuthentication =
            CardholderAuthentication(
                checkRequired("authenticationMethod", authenticationMethod),
                checkRequired("authenticationResult", authenticationResult),
                checkRequired("decisionMadeBy", decisionMadeBy),
                checkRequired("liabilityShift", liabilityShift),
                checkRequired("threeDSAuthenticationToken", threeDSAuthenticationToken),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CardholderAuthentication = apply {
        if (validated) {
            return@apply
        }

        authenticationMethod().validate()
        authenticationResult().validate()
        decisionMadeBy().validate()
        liabilityShift().validate()
        threeDSAuthenticationToken()
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic
    internal fun validity(): Int =
        (authenticationMethod.asKnown().getOrNull()?.validity() ?: 0) +
            (authenticationResult.asKnown().getOrNull()?.validity() ?: 0) +
            (decisionMadeBy.asKnown().getOrNull()?.validity() ?: 0) +
            (liabilityShift.asKnown().getOrNull()?.validity() ?: 0) +
            (if (threeDSAuthenticationToken.asKnown().isPresent) 1 else 0)

    /** Indicates the method used to authenticate the cardholder. */
    class AuthenticationMethod
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

            @JvmField val FRICTIONLESS = of("FRICTIONLESS")

            @JvmField val CHALLENGE = of("CHALLENGE")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = AuthenticationMethod(JsonField.of(value))
        }

        /** An enum containing [AuthenticationMethod]'s known values. */
        enum class Known {
            FRICTIONLESS,
            CHALLENGE,
            NONE,
        }

        /**
         * An enum containing [AuthenticationMethod]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            FRICTIONLESS,
            CHALLENGE,
            NONE,
            /**
             * An enum member indicating that [AuthenticationMethod] was instantiated with an
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
                FRICTIONLESS -> Value.FRICTIONLESS
                CHALLENGE -> Value.CHALLENGE
                NONE -> Value.NONE
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
                FRICTIONLESS -> Known.FRICTIONLESS
                CHALLENGE -> Known.CHALLENGE
                NONE -> Known.NONE
                else -> throw LithicInvalidDataException("Unknown AuthenticationMethod: $value")
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

        fun validate(): AuthenticationMethod = apply {
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

            return other is AuthenticationMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Indicates the outcome of the 3DS authentication process. */
    class AuthenticationResult
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

            @JvmField val ATTEMPTS = of("ATTEMPTS")

            @JvmField val DECLINE = of("DECLINE")

            @JvmField val NONE = of("NONE")

            @JvmField val SUCCESS = of("SUCCESS")

            @JvmStatic fun of(value: String) = AuthenticationResult(JsonField.of(value))
        }

        /** An enum containing [AuthenticationResult]'s known values. */
        enum class Known {
            ATTEMPTS,
            DECLINE,
            NONE,
            SUCCESS,
        }

        /**
         * An enum containing [AuthenticationResult]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [AuthenticationResult] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ATTEMPTS,
            DECLINE,
            NONE,
            SUCCESS,
            /**
             * An enum member indicating that [AuthenticationResult] was instantiated with an
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
                ATTEMPTS -> Value.ATTEMPTS
                DECLINE -> Value.DECLINE
                NONE -> Value.NONE
                SUCCESS -> Value.SUCCESS
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
                ATTEMPTS -> Known.ATTEMPTS
                DECLINE -> Known.DECLINE
                NONE -> Known.NONE
                SUCCESS -> Known.SUCCESS
                else -> throw LithicInvalidDataException("Unknown AuthenticationResult: $value")
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

        fun validate(): AuthenticationResult = apply {
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

            return other is AuthenticationResult && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Indicates which party made the 3DS authentication decision. */
    class DecisionMadeBy @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val CUSTOMER_RULES = of("CUSTOMER_RULES")

            @JvmField val CUSTOMER_ENDPOINT = of("CUSTOMER_ENDPOINT")

            @JvmField val LITHIC_DEFAULT = of("LITHIC_DEFAULT")

            @JvmField val LITHIC_RULES = of("LITHIC_RULES")

            @JvmField val NETWORK = of("NETWORK")

            @JvmField val UNKNOWN = of("UNKNOWN")

            @JvmStatic fun of(value: String) = DecisionMadeBy(JsonField.of(value))
        }

        /** An enum containing [DecisionMadeBy]'s known values. */
        enum class Known {
            CUSTOMER_RULES,
            CUSTOMER_ENDPOINT,
            LITHIC_DEFAULT,
            LITHIC_RULES,
            NETWORK,
            UNKNOWN,
        }

        /**
         * An enum containing [DecisionMadeBy]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [DecisionMadeBy] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            CUSTOMER_RULES,
            CUSTOMER_ENDPOINT,
            LITHIC_DEFAULT,
            LITHIC_RULES,
            NETWORK,
            UNKNOWN,
            /**
             * An enum member indicating that [DecisionMadeBy] was instantiated with an unknown
             * value.
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
                CUSTOMER_RULES -> Value.CUSTOMER_RULES
                CUSTOMER_ENDPOINT -> Value.CUSTOMER_ENDPOINT
                LITHIC_DEFAULT -> Value.LITHIC_DEFAULT
                LITHIC_RULES -> Value.LITHIC_RULES
                NETWORK -> Value.NETWORK
                UNKNOWN -> Value.UNKNOWN
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
                CUSTOMER_RULES -> Known.CUSTOMER_RULES
                CUSTOMER_ENDPOINT -> Known.CUSTOMER_ENDPOINT
                LITHIC_DEFAULT -> Known.LITHIC_DEFAULT
                LITHIC_RULES -> Known.LITHIC_RULES
                NETWORK -> Known.NETWORK
                UNKNOWN -> Known.UNKNOWN
                else -> throw LithicInvalidDataException("Unknown DecisionMadeBy: $value")
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

        fun validate(): DecisionMadeBy = apply {
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

            return other is DecisionMadeBy && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Indicates whether chargeback liability shift applies to the transaction. Possible enum
     * values:
     * * `3DS_AUTHENTICATED`: The transaction was fully authenticated through a 3-D Secure flow,
     *   chargeback liability shift applies.
     * * `NONE`: Chargeback liability shift has not shifted to the issuer, i.e. the merchant is
     *   liable.
     * * `TOKEN_AUTHENTICATED`: The transaction was a tokenized payment with validated cryptography,
     *   possibly recurring. Chargeback liability shift to the issuer applies.
     */
    class LiabilityShift @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            @JvmField val _3DS_AUTHENTICATED = of("3DS_AUTHENTICATED")

            @JvmField val TOKEN_AUTHENTICATED = of("TOKEN_AUTHENTICATED")

            @JvmField val NONE = of("NONE")

            @JvmStatic fun of(value: String) = LiabilityShift(JsonField.of(value))
        }

        /** An enum containing [LiabilityShift]'s known values. */
        enum class Known {
            _3DS_AUTHENTICATED,
            TOKEN_AUTHENTICATED,
            NONE,
        }

        /**
         * An enum containing [LiabilityShift]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [LiabilityShift] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            _3DS_AUTHENTICATED,
            TOKEN_AUTHENTICATED,
            NONE,
            /**
             * An enum member indicating that [LiabilityShift] was instantiated with an unknown
             * value.
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
                _3DS_AUTHENTICATED -> Value._3DS_AUTHENTICATED
                TOKEN_AUTHENTICATED -> Value.TOKEN_AUTHENTICATED
                NONE -> Value.NONE
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
                _3DS_AUTHENTICATED -> Known._3DS_AUTHENTICATED
                TOKEN_AUTHENTICATED -> Known.TOKEN_AUTHENTICATED
                NONE -> Known.NONE
                else -> throw LithicInvalidDataException("Unknown LiabilityShift: $value")
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

        fun validate(): LiabilityShift = apply {
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

            return other is LiabilityShift && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardholderAuthentication &&
            authenticationMethod == other.authenticationMethod &&
            authenticationResult == other.authenticationResult &&
            decisionMadeBy == other.decisionMadeBy &&
            liabilityShift == other.liabilityShift &&
            threeDSAuthenticationToken == other.threeDSAuthenticationToken &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            authenticationMethod,
            authenticationResult,
            decisionMadeBy,
            liabilityShift,
            threeDSAuthenticationToken,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CardholderAuthentication{authenticationMethod=$authenticationMethod, authenticationResult=$authenticationResult, decisionMadeBy=$decisionMadeBy, liabilityShift=$liabilityShift, threeDSAuthenticationToken=$threeDSAuthenticationToken, additionalProperties=$additionalProperties}"
}
