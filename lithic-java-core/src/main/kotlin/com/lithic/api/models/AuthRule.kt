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
import com.lithic.api.core.checkKnown
import com.lithic.api.core.checkRequired
import com.lithic.api.core.toImmutable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Collections
import java.util.Objects
import java.util.Optional
import kotlin.jvm.optionals.getOrNull

class AuthRule
private constructor(
    private val token: JsonField<String>,
    private val state: JsonField<State>,
    private val accountTokens: JsonField<List<String>>,
    private val allowedCountries: JsonField<List<String>>,
    private val allowedMcc: JsonField<List<String>>,
    private val blockedCountries: JsonField<List<String>>,
    private val blockedMcc: JsonField<List<String>>,
    private val cardTokens: JsonField<List<String>>,
    private val programLevel: JsonField<Boolean>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("token") @ExcludeMissing token: JsonField<String> = JsonMissing.of(),
        @JsonProperty("state") @ExcludeMissing state: JsonField<State> = JsonMissing.of(),
        @JsonProperty("account_tokens")
        @ExcludeMissing
        accountTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("allowed_countries")
        @ExcludeMissing
        allowedCountries: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("allowed_mcc")
        @ExcludeMissing
        allowedMcc: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("blocked_countries")
        @ExcludeMissing
        blockedCountries: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("blocked_mcc")
        @ExcludeMissing
        blockedMcc: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("card_tokens")
        @ExcludeMissing
        cardTokens: JsonField<List<String>> = JsonMissing.of(),
        @JsonProperty("program_level")
        @ExcludeMissing
        programLevel: JsonField<Boolean> = JsonMissing.of(),
    ) : this(
        token,
        state,
        accountTokens,
        allowedCountries,
        allowedMcc,
        blockedCountries,
        blockedMcc,
        cardTokens,
        programLevel,
        mutableMapOf(),
    )

    /**
     * Globally unique identifier.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun token(): String = token.getRequired("token")

    /**
     * Indicates whether the Auth Rule is ACTIVE or INACTIVE
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun state(): State = state.getRequired("state")

    /**
     * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note that
     * only this field or `card_tokens` can be provided for a given Auth Rule.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun accountTokens(): Optional<List<String>> =
        Optional.ofNullable(accountTokens.getNullable("account_tokens"))

    /**
     * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list of
     * countries in which all transactions are blocked; "allowing" those countries in an Auth Rule
     * does not override the Lithic-wide restrictions.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedCountries(): Optional<List<String>> =
        Optional.ofNullable(allowedCountries.getNullable("allowed_countries"))

    /**
     * Merchant category codes for which the Auth Rule permits transactions.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun allowedMcc(): Optional<List<String>> =
        Optional.ofNullable(allowedMcc.getNullable("allowed_mcc"))

    /**
     * Countries in which the Auth Rule automatically declines transactions.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blockedCountries(): Optional<List<String>> =
        Optional.ofNullable(blockedCountries.getNullable("blocked_countries"))

    /**
     * Merchant category codes for which the Auth Rule automatically declines transactions.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun blockedMcc(): Optional<List<String>> =
        Optional.ofNullable(blockedMcc.getNullable("blocked_mcc"))

    /**
     * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that only
     * this field or `account_tokens` can be provided for a given Auth Rule.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cardTokens(): Optional<List<String>> =
        Optional.ofNullable(cardTokens.getNullable("card_tokens"))

    /**
     * Boolean indicating whether the Auth Rule is applied at the program level.
     *
     * @throws LithicInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun programLevel(): Optional<Boolean> =
        Optional.ofNullable(programLevel.getNullable("program_level"))

    /**
     * Returns the raw JSON value of [token].
     *
     * Unlike [token], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token") @ExcludeMissing fun _token(): JsonField<String> = token

    /**
     * Returns the raw JSON value of [state].
     *
     * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<State> = state

    /**
     * Returns the raw JSON value of [accountTokens].
     *
     * Unlike [accountTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_tokens")
    @ExcludeMissing
    fun _accountTokens(): JsonField<List<String>> = accountTokens

    /**
     * Returns the raw JSON value of [allowedCountries].
     *
     * Unlike [allowedCountries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("allowed_countries")
    @ExcludeMissing
    fun _allowedCountries(): JsonField<List<String>> = allowedCountries

    /**
     * Returns the raw JSON value of [allowedMcc].
     *
     * Unlike [allowedMcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("allowed_mcc")
    @ExcludeMissing
    fun _allowedMcc(): JsonField<List<String>> = allowedMcc

    /**
     * Returns the raw JSON value of [blockedCountries].
     *
     * Unlike [blockedCountries], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("blocked_countries")
    @ExcludeMissing
    fun _blockedCountries(): JsonField<List<String>> = blockedCountries

    /**
     * Returns the raw JSON value of [blockedMcc].
     *
     * Unlike [blockedMcc], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("blocked_mcc")
    @ExcludeMissing
    fun _blockedMcc(): JsonField<List<String>> = blockedMcc

    /**
     * Returns the raw JSON value of [cardTokens].
     *
     * Unlike [cardTokens], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_tokens")
    @ExcludeMissing
    fun _cardTokens(): JsonField<List<String>> = cardTokens

    /**
     * Returns the raw JSON value of [programLevel].
     *
     * Unlike [programLevel], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("program_level")
    @ExcludeMissing
    fun _programLevel(): JsonField<Boolean> = programLevel

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
         * Returns a mutable builder for constructing an instance of [AuthRule].
         *
         * The following fields are required:
         * ```java
         * .token()
         * .state()
         * ```
         */
        @JvmStatic fun builder() = Builder()
    }

    /** A builder for [AuthRule]. */
    class Builder internal constructor() {

        private var token: JsonField<String>? = null
        private var state: JsonField<State>? = null
        private var accountTokens: JsonField<MutableList<String>>? = null
        private var allowedCountries: JsonField<MutableList<String>>? = null
        private var allowedMcc: JsonField<MutableList<String>>? = null
        private var blockedCountries: JsonField<MutableList<String>>? = null
        private var blockedMcc: JsonField<MutableList<String>>? = null
        private var cardTokens: JsonField<MutableList<String>>? = null
        private var programLevel: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRule: AuthRule) = apply {
            token = authRule.token
            state = authRule.state
            accountTokens = authRule.accountTokens.map { it.toMutableList() }
            allowedCountries = authRule.allowedCountries.map { it.toMutableList() }
            allowedMcc = authRule.allowedMcc.map { it.toMutableList() }
            blockedCountries = authRule.blockedCountries.map { it.toMutableList() }
            blockedMcc = authRule.blockedMcc.map { it.toMutableList() }
            cardTokens = authRule.cardTokens.map { it.toMutableList() }
            programLevel = authRule.programLevel
            additionalProperties = authRule.additionalProperties.toMutableMap()
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /**
         * Sets [Builder.token] to an arbitrary JSON value.
         *
         * You should usually call [Builder.token] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
        fun state(state: State) = state(JsonField.of(state))

        /**
         * Sets [Builder.state] to an arbitrary JSON value.
         *
         * You should usually call [Builder.state] with a well-typed [State] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        /**
         * Sets [Builder.accountTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [accountTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAccountToken(accountToken: String) = apply {
            accountTokens =
                (accountTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("accountTokens", it).add(accountToken)
                }
        }

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        fun allowedCountries(allowedCountries: List<String>) =
            allowedCountries(JsonField.of(allowedCountries))

        /**
         * Sets [Builder.allowedCountries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedCountries] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedCountries(allowedCountries: JsonField<List<String>>) = apply {
            this.allowedCountries = allowedCountries.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [allowedCountries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedCountry(allowedCountry: String) = apply {
            allowedCountries =
                (allowedCountries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedCountries", it).add(allowedCountry)
                }
        }

        /** Merchant category codes for which the Auth Rule permits transactions. */
        fun allowedMcc(allowedMcc: List<String>) = allowedMcc(JsonField.of(allowedMcc))

        /**
         * Sets [Builder.allowedMcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.allowedMcc] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun allowedMcc(allowedMcc: JsonField<List<String>>) = apply {
            this.allowedMcc = allowedMcc.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.allowedMcc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addAllowedMcc(allowedMcc: String) = apply {
            this.allowedMcc =
                (this.allowedMcc ?: JsonField.of(mutableListOf())).also {
                    checkKnown("allowedMcc", it).add(allowedMcc)
                }
        }

        /** Countries in which the Auth Rule automatically declines transactions. */
        fun blockedCountries(blockedCountries: List<String>) =
            blockedCountries(JsonField.of(blockedCountries))

        /**
         * Sets [Builder.blockedCountries] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedCountries] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blockedCountries(blockedCountries: JsonField<List<String>>) = apply {
            this.blockedCountries = blockedCountries.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [blockedCountries].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockedCountry(blockedCountry: String) = apply {
            blockedCountries =
                (blockedCountries ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockedCountries", it).add(blockedCountry)
                }
        }

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        fun blockedMcc(blockedMcc: List<String>) = blockedMcc(JsonField.of(blockedMcc))

        /**
         * Sets [Builder.blockedMcc] to an arbitrary JSON value.
         *
         * You should usually call [Builder.blockedMcc] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun blockedMcc(blockedMcc: JsonField<List<String>>) = apply {
            this.blockedMcc = blockedMcc.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [Builder.blockedMcc].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addBlockedMcc(blockedMcc: String) = apply {
            this.blockedMcc =
                (this.blockedMcc ?: JsonField.of(mutableListOf())).also {
                    checkKnown("blockedMcc", it).add(blockedMcc)
                }
        }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /**
         * Sets [Builder.cardTokens] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardTokens] with a well-typed `List<String>` value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply {
            this.cardTokens = cardTokens.map { it.toMutableList() }
        }

        /**
         * Adds a single [String] to [cardTokens].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addCardToken(cardToken: String) = apply {
            cardTokens =
                (cardTokens ?: JsonField.of(mutableListOf())).also {
                    checkKnown("cardTokens", it).add(cardToken)
                }
        }

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        /**
         * Sets [Builder.programLevel] to an arbitrary JSON value.
         *
         * You should usually call [Builder.programLevel] with a well-typed [Boolean] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
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
         * Returns an immutable instance of [AuthRule].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```java
         * .token()
         * .state()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): AuthRule =
            AuthRule(
                checkRequired("token", token),
                checkRequired("state", state),
                (accountTokens ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedCountries ?: JsonMissing.of()).map { it.toImmutable() },
                (allowedMcc ?: JsonMissing.of()).map { it.toImmutable() },
                (blockedCountries ?: JsonMissing.of()).map { it.toImmutable() },
                (blockedMcc ?: JsonMissing.of()).map { it.toImmutable() },
                (cardTokens ?: JsonMissing.of()).map { it.toImmutable() },
                programLevel,
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): AuthRule = apply {
        if (validated) {
            return@apply
        }

        token()
        state().validate()
        accountTokens()
        allowedCountries()
        allowedMcc()
        blockedCountries()
        blockedMcc()
        cardTokens()
        programLevel()
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
        (if (token.asKnown().isPresent) 1 else 0) +
            (state.asKnown().getOrNull()?.validity() ?: 0) +
            (accountTokens.asKnown().getOrNull()?.size ?: 0) +
            (allowedCountries.asKnown().getOrNull()?.size ?: 0) +
            (allowedMcc.asKnown().getOrNull()?.size ?: 0) +
            (blockedCountries.asKnown().getOrNull()?.size ?: 0) +
            (blockedMcc.asKnown().getOrNull()?.size ?: 0) +
            (cardTokens.asKnown().getOrNull()?.size ?: 0) +
            (if (programLevel.asKnown().isPresent) 1 else 0)

    /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
    class State @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            @JvmField val ACTIVE = of("ACTIVE")

            @JvmField val INACTIVE = of("INACTIVE")

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        /** An enum containing [State]'s known values. */
        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        /**
         * An enum containing [State]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [State] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACTIVE,
            INACTIVE,
            /** An enum member indicating that [State] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
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
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw LithicInvalidDataException("Unknown State: $value")
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

        fun validate(): State = apply {
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

            return /* spotless:off */ other is State && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AuthRule && token == other.token && state == other.state && accountTokens == other.accountTokens && allowedCountries == other.allowedCountries && allowedMcc == other.allowedMcc && blockedCountries == other.blockedCountries && blockedMcc == other.blockedMcc && cardTokens == other.cardTokens && programLevel == other.programLevel && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(token, state, accountTokens, allowedCountries, allowedMcc, blockedCountries, blockedMcc, cardTokens, programLevel, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AuthRule{token=$token, state=$state, accountTokens=$accountTokens, allowedCountries=$allowedCountries, allowedMcc=$allowedMcc, blockedCountries=$blockedCountries, blockedMcc=$blockedMcc, cardTokens=$cardTokens, programLevel=$programLevel, additionalProperties=$additionalProperties}"
}
