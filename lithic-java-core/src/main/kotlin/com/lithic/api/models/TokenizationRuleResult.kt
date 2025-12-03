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

class TokenizationRuleResult
@JsonCreator(mode = JsonCreator.Mode.DISABLED)
private constructor(
    private val authRuleToken: JsonField<String>,
    private val explanation: JsonField<String>,
    private val name: JsonField<String>,
    private val result: JsonField<Result>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("auth_rule_token")
        @ExcludeMissing
        authRuleToken: JsonField<String> = JsonMissing.of(),
        @JsonProperty("explanation")
        @ExcludeMissing
        explanation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
        @JsonProperty("result") @ExcludeMissing result: JsonField<Result> = JsonMissing.of(),
    ) : this(authRuleToken, explanation, name, result, mutableMapOf())

    /**
     * The Auth Rule Token associated with the rule. If this is set to null, then the result was not
     * associated with a customer-configured rule. This may happen in cases where a tokenization is
     * declined or requires TFA due to a Lithic-configured security or compliance rule, for example.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun authRuleToken(): Optional<String> = authRuleToken.getOptional("auth_rule_token")

    /**
     * A human-readable explanation outlining the motivation for the rule's result
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun explanation(): Optional<String> = explanation.getOptional("explanation")

    /**
     * The name for the rule, if any was configured
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun name(): Optional<String> = name.getOptional("name")

    /**
     * The result associated with this rule
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun result(): Result = result.getRequired("result")

    /**
     * Returns the raw JSON value of [authRuleToken].
     *
     * Unlike [authRuleToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("auth_rule_token")
    @ExcludeMissing
    fun _authRuleToken(): JsonField<String> = authRuleToken

    /**
     * Returns the raw JSON value of [explanation].
     *
     * Unlike [explanation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("explanation") @ExcludeMissing fun _explanation(): JsonField<String> = explanation

    /**
     * Returns the raw JSON value of [name].
     *
     * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

    /**
     * Returns the raw JSON value of [result].
     *
     * Unlike [result], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("result") @ExcludeMissing fun _result(): JsonField<Result> = result

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
         * Returns a mutable builder for constructing an instance of [TokenizationRuleResult].
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * .explanation()
         * .name()
         * .result()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [TokenizationRuleResult]. */
    class Builder internal constructor() {

        private var authRuleToken: JsonField<String>? = null
        private var explanation: JsonField<String>? = null
        private var name: JsonField<String>? = null
        private var result: JsonField<Result>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(tokenizationRuleResult: TokenizationRuleResult) = apply {
            authRuleToken = tokenizationRuleResult.authRuleToken
            explanation = tokenizationRuleResult.explanation
            name = tokenizationRuleResult.name
            result = tokenizationRuleResult.result
            additionalProperties = tokenizationRuleResult.additionalProperties.toMutableMap()
        }

        /**
         * The Auth Rule Token associated with the rule. If this is set to null, then the result was
         * not associated with a customer-configured rule. This may happen in cases where a
         * tokenization is declined or requires TFA due to a Lithic-configured security or
         * compliance rule, for example.
         */
        fun authRuleToken(authRuleToken: String?) =
            authRuleToken(JsonField.ofNullable(authRuleToken))

        /** Alias for calling [Builder.authRuleToken] with `authRuleToken.orElse(null)`. */
        fun authRuleToken(authRuleToken: Optional<String>) =
            authRuleToken(authRuleToken.getOrNull())

        /**
         * Sets [Builder.authRuleToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.authRuleToken] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun authRuleToken(authRuleToken: JsonField<String>) = apply {
            this.authRuleToken = authRuleToken
        }

        /** A human-readable explanation outlining the motivation for the rule's result */
        fun explanation(explanation: String?) = explanation(JsonField.ofNullable(explanation))

        /** Alias for calling [Builder.explanation] with `explanation.orElse(null)`. */
        fun explanation(explanation: Optional<String>) = explanation(explanation.getOrNull())

        /**
         * Sets [Builder.explanation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.explanation] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun explanation(explanation: JsonField<String>) = apply { this.explanation = explanation }

        /** The name for the rule, if any was configured */
        fun name(name: String?) = name(JsonField.ofNullable(name))

        /** Alias for calling [Builder.name] with `name.orElse(null)`. */
        fun name(name: Optional<String>) = name(name.getOrNull())

        /**
         * Sets [Builder.name] to an arbitrary JSON value.
         *
         * You should usually call [Builder.name] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun name(name: JsonField<String>) = apply { this.name = name }

        /** The result associated with this rule */
        fun result(result: Result) = result(JsonField.of(result))

        /**
         * Sets [Builder.result] to an arbitrary JSON value.
         *
         * You should usually call [Builder.result] with a well-typed [Result] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun result(result: JsonField<Result>) = apply { this.result = result }

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
         * Returns an immutable instance of [TokenizationRuleResult].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .authRuleToken()
         * .explanation()
         * .name()
         * .result()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): TokenizationRuleResult =
            TokenizationRuleResult(
                checkRequired("authRuleToken", authRuleToken),
                checkRequired("explanation", explanation),
                checkRequired("name", name),
                checkRequired("result", result),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): TokenizationRuleResult = apply {
        if (validated) {
            return@apply
        }

        authRuleToken()
        explanation()
        name()
        result().validate()
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
        (if (authRuleToken.asKnown().isPresent) 1 else 0) +
            (if (explanation.asKnown().isPresent) 1 else 0) +
            (if (name.asKnown().isPresent) 1 else 0) +
            (result.asKnown().getOrNull()?.validity() ?: 0)

    /** The result associated with this rule */
    class Result @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val APPROVED = of("APPROVED")

            @JvmField val DECLINED = of("DECLINED")

            @JvmField val REQUIRE_TFA = of("REQUIRE_TFA")

            @JvmField val ERROR = of("ERROR")

            @JvmStatic fun of(value: String) = Result(JsonField.of(value))
        }

        /** An enum containing [Result]'s known values. */
        enum class Known {
            APPROVED,
            DECLINED,
            REQUIRE_TFA,
            ERROR,
        }

        /**
         * An enum containing [Result]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Result] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            APPROVED,
            DECLINED,
            REQUIRE_TFA,
            ERROR,
            /** An enum member indicating that [Result] was instantiated with an unknown value. */
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
                APPROVED -> Value.APPROVED
                DECLINED -> Value.DECLINED
                REQUIRE_TFA -> Value.REQUIRE_TFA
                ERROR -> Value.ERROR
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
                APPROVED -> Known.APPROVED
                DECLINED -> Known.DECLINED
                REQUIRE_TFA -> Known.REQUIRE_TFA
                ERROR -> Known.ERROR
                else -> throw LithicInvalidDataException("Unknown Result: $value")
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

        fun validate(): Result = apply {
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

            return other is Result && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenizationRuleResult &&
            authRuleToken == other.authRuleToken &&
            explanation == other.explanation &&
            name == other.name &&
            result == other.result &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(authRuleToken, explanation, name, result, additionalProperties)
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "TokenizationRuleResult{authRuleToken=$authRuleToken, explanation=$explanation, name=$name, result=$result, additionalProperties=$additionalProperties}"
}
