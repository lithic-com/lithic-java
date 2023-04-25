package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.lithic.api.core.ExcludeMissing
import com.lithic.api.core.JsonField
import com.lithic.api.core.JsonMissing
import com.lithic.api.core.JsonValue
import com.lithic.api.core.NoAutoDetect
import com.lithic.api.core.toUnmodifiable
import com.lithic.api.errors.LithicInvalidDataException
import java.util.Objects
import java.util.Optional

@JsonDeserialize(builder = AuthRule.Builder::class)
@NoAutoDetect
class AuthRule
private constructor(
    private val token: JsonField<String>,
    private val state: JsonField<State>,
    private val previousAuthRuleTokens: JsonField<List<String>>,
    private val allowedMcc: JsonField<List<String>>,
    private val blockedMcc: JsonField<List<String>>,
    private val allowedCountries: JsonField<List<String>>,
    private val blockedCountries: JsonField<List<String>>,
    private val avsType: JsonField<AvsType>,
    private val accountTokens: JsonField<List<String>>,
    private val cardTokens: JsonField<List<String>>,
    private val programLevel: JsonField<Boolean>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** Globally unique identifier. */
    fun token(): Optional<String> = Optional.ofNullable(token.getNullable("token"))

    /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
    fun state(): Optional<State> = Optional.ofNullable(state.getNullable("state"))

    /**
     * Identifier for the Auth Rule(s) that a new Auth Rule replaced; will be returned only if an
     * Auth Rule is applied to entities that previously already had one applied.
     */
    fun previousAuthRuleTokens(): Optional<List<String>> =
        Optional.ofNullable(previousAuthRuleTokens.getNullable("previous_auth_rule_tokens"))

    /** Merchant category codes for which the Auth Rule permits transactions. */
    fun allowedMcc(): Optional<List<String>> =
        Optional.ofNullable(allowedMcc.getNullable("allowed_mcc"))

    /** Merchant category codes for which the Auth Rule automatically declines transactions. */
    fun blockedMcc(): Optional<List<String>> =
        Optional.ofNullable(blockedMcc.getNullable("blocked_mcc"))

    /**
     * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list of
     * countries in which all transactions are blocked; "allowing" those countries in an Auth Rule
     * does not override the Lithic-wide restrictions.
     */
    fun allowedCountries(): Optional<List<String>> =
        Optional.ofNullable(allowedCountries.getNullable("allowed_countries"))

    /** Countries in which the Auth Rule automatically declines transactions. */
    fun blockedCountries(): Optional<List<String>> =
        Optional.ofNullable(blockedCountries.getNullable("blocked_countries"))

    /**
     * Address verification to confirm that postal code entered at point of transaction (if
     * applicable) matches the postal code on file for a given card. Since this check is performed
     * against the address submitted via the Enroll Consumer endpoint, it should only be used in
     * cases where card users are enrolled with their own accounts. Available values:
     *
     * - `ZIP_ONLY` - AVS check is performed to confirm ZIP code entered at point of transaction (if
     * applicable) matches address on file.
     */
    fun avsType(): Optional<AvsType> = Optional.ofNullable(avsType.getNullable("avs_type"))

    /**
     * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note that
     * only this field or `card_tokens` can be provided for a given Auth Rule.
     */
    fun accountTokens(): Optional<List<String>> =
        Optional.ofNullable(accountTokens.getNullable("account_tokens"))

    /**
     * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that only
     * this field or `account_tokens` can be provided for a given Auth Rule.
     */
    fun cardTokens(): Optional<List<String>> =
        Optional.ofNullable(cardTokens.getNullable("card_tokens"))

    /** Boolean indicating whether the Auth Rule is applied at the program level. */
    fun programLevel(): Optional<Boolean> =
        Optional.ofNullable(programLevel.getNullable("program_level"))

    /** Globally unique identifier. */
    @JsonProperty("token") @ExcludeMissing fun _token() = token

    /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
    @JsonProperty("state") @ExcludeMissing fun _state() = state

    /**
     * Identifier for the Auth Rule(s) that a new Auth Rule replaced; will be returned only if an
     * Auth Rule is applied to entities that previously already had one applied.
     */
    @JsonProperty("previous_auth_rule_tokens")
    @ExcludeMissing
    fun _previousAuthRuleTokens() = previousAuthRuleTokens

    /** Merchant category codes for which the Auth Rule permits transactions. */
    @JsonProperty("allowed_mcc") @ExcludeMissing fun _allowedMcc() = allowedMcc

    /** Merchant category codes for which the Auth Rule automatically declines transactions. */
    @JsonProperty("blocked_mcc") @ExcludeMissing fun _blockedMcc() = blockedMcc

    /**
     * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list of
     * countries in which all transactions are blocked; "allowing" those countries in an Auth Rule
     * does not override the Lithic-wide restrictions.
     */
    @JsonProperty("allowed_countries") @ExcludeMissing fun _allowedCountries() = allowedCountries

    /** Countries in which the Auth Rule automatically declines transactions. */
    @JsonProperty("blocked_countries") @ExcludeMissing fun _blockedCountries() = blockedCountries

    /**
     * Address verification to confirm that postal code entered at point of transaction (if
     * applicable) matches the postal code on file for a given card. Since this check is performed
     * against the address submitted via the Enroll Consumer endpoint, it should only be used in
     * cases where card users are enrolled with their own accounts. Available values:
     *
     * - `ZIP_ONLY` - AVS check is performed to confirm ZIP code entered at point of transaction (if
     * applicable) matches address on file.
     */
    @JsonProperty("avs_type") @ExcludeMissing fun _avsType() = avsType

    /**
     * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note that
     * only this field or `card_tokens` can be provided for a given Auth Rule.
     */
    @JsonProperty("account_tokens") @ExcludeMissing fun _accountTokens() = accountTokens

    /**
     * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that only
     * this field or `account_tokens` can be provided for a given Auth Rule.
     */
    @JsonProperty("card_tokens") @ExcludeMissing fun _cardTokens() = cardTokens

    /** Boolean indicating whether the Auth Rule is applied at the program level. */
    @JsonProperty("program_level") @ExcludeMissing fun _programLevel() = programLevel

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate() = apply {
        if (!validated) {
            token()
            state()
            previousAuthRuleTokens()
            allowedMcc()
            blockedMcc()
            allowedCountries()
            blockedCountries()
            avsType()
            accountTokens()
            cardTokens()
            programLevel()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AuthRule &&
            this.token == other.token &&
            this.state == other.state &&
            this.previousAuthRuleTokens == other.previousAuthRuleTokens &&
            this.allowedMcc == other.allowedMcc &&
            this.blockedMcc == other.blockedMcc &&
            this.allowedCountries == other.allowedCountries &&
            this.blockedCountries == other.blockedCountries &&
            this.avsType == other.avsType &&
            this.accountTokens == other.accountTokens &&
            this.cardTokens == other.cardTokens &&
            this.programLevel == other.programLevel &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    token,
                    state,
                    previousAuthRuleTokens,
                    allowedMcc,
                    blockedMcc,
                    allowedCountries,
                    blockedCountries,
                    avsType,
                    accountTokens,
                    cardTokens,
                    programLevel,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "AuthRule{token=$token, state=$state, previousAuthRuleTokens=$previousAuthRuleTokens, allowedMcc=$allowedMcc, blockedMcc=$blockedMcc, allowedCountries=$allowedCountries, blockedCountries=$blockedCountries, avsType=$avsType, accountTokens=$accountTokens, cardTokens=$cardTokens, programLevel=$programLevel, additionalProperties=$additionalProperties}"

    companion object {

        @JvmStatic fun builder() = Builder()
    }

    class Builder {

        private var token: JsonField<String> = JsonMissing.of()
        private var state: JsonField<State> = JsonMissing.of()
        private var previousAuthRuleTokens: JsonField<List<String>> = JsonMissing.of()
        private var allowedMcc: JsonField<List<String>> = JsonMissing.of()
        private var blockedMcc: JsonField<List<String>> = JsonMissing.of()
        private var allowedCountries: JsonField<List<String>> = JsonMissing.of()
        private var blockedCountries: JsonField<List<String>> = JsonMissing.of()
        private var avsType: JsonField<AvsType> = JsonMissing.of()
        private var accountTokens: JsonField<List<String>> = JsonMissing.of()
        private var cardTokens: JsonField<List<String>> = JsonMissing.of()
        private var programLevel: JsonField<Boolean> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        @JvmSynthetic
        internal fun from(authRule: AuthRule) = apply {
            this.token = authRule.token
            this.state = authRule.state
            this.previousAuthRuleTokens = authRule.previousAuthRuleTokens
            this.allowedMcc = authRule.allowedMcc
            this.blockedMcc = authRule.blockedMcc
            this.allowedCountries = authRule.allowedCountries
            this.blockedCountries = authRule.blockedCountries
            this.avsType = authRule.avsType
            this.accountTokens = authRule.accountTokens
            this.cardTokens = authRule.cardTokens
            this.programLevel = authRule.programLevel
            additionalProperties(authRule.additionalProperties)
        }

        /** Globally unique identifier. */
        fun token(token: String) = token(JsonField.of(token))

        /** Globally unique identifier. */
        @JsonProperty("token")
        @ExcludeMissing
        fun token(token: JsonField<String>) = apply { this.token = token }

        /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
        fun state(state: State) = state(JsonField.of(state))

        /** Indicates whether the Auth Rule is ACTIVE or INACTIVE */
        @JsonProperty("state")
        @ExcludeMissing
        fun state(state: JsonField<State>) = apply { this.state = state }

        /**
         * Identifier for the Auth Rule(s) that a new Auth Rule replaced; will be returned only if
         * an Auth Rule is applied to entities that previously already had one applied.
         */
        fun previousAuthRuleTokens(previousAuthRuleTokens: List<String>) =
            previousAuthRuleTokens(JsonField.of(previousAuthRuleTokens))

        /**
         * Identifier for the Auth Rule(s) that a new Auth Rule replaced; will be returned only if
         * an Auth Rule is applied to entities that previously already had one applied.
         */
        @JsonProperty("previous_auth_rule_tokens")
        @ExcludeMissing
        fun previousAuthRuleTokens(previousAuthRuleTokens: JsonField<List<String>>) = apply {
            this.previousAuthRuleTokens = previousAuthRuleTokens
        }

        /** Merchant category codes for which the Auth Rule permits transactions. */
        fun allowedMcc(allowedMcc: List<String>) = allowedMcc(JsonField.of(allowedMcc))

        /** Merchant category codes for which the Auth Rule permits transactions. */
        @JsonProperty("allowed_mcc")
        @ExcludeMissing
        fun allowedMcc(allowedMcc: JsonField<List<String>>) = apply { this.allowedMcc = allowedMcc }

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        fun blockedMcc(blockedMcc: List<String>) = blockedMcc(JsonField.of(blockedMcc))

        /** Merchant category codes for which the Auth Rule automatically declines transactions. */
        @JsonProperty("blocked_mcc")
        @ExcludeMissing
        fun blockedMcc(blockedMcc: JsonField<List<String>>) = apply { this.blockedMcc = blockedMcc }

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        fun allowedCountries(allowedCountries: List<String>) =
            allowedCountries(JsonField.of(allowedCountries))

        /**
         * Countries in which the Auth Rule permits transactions. Note that Lithic maintains a list
         * of countries in which all transactions are blocked; "allowing" those countries in an Auth
         * Rule does not override the Lithic-wide restrictions.
         */
        @JsonProperty("allowed_countries")
        @ExcludeMissing
        fun allowedCountries(allowedCountries: JsonField<List<String>>) = apply {
            this.allowedCountries = allowedCountries
        }

        /** Countries in which the Auth Rule automatically declines transactions. */
        fun blockedCountries(blockedCountries: List<String>) =
            blockedCountries(JsonField.of(blockedCountries))

        /** Countries in which the Auth Rule automatically declines transactions. */
        @JsonProperty("blocked_countries")
        @ExcludeMissing
        fun blockedCountries(blockedCountries: JsonField<List<String>>) = apply {
            this.blockedCountries = blockedCountries
        }

        /**
         * Address verification to confirm that postal code entered at point of transaction (if
         * applicable) matches the postal code on file for a given card. Since this check is
         * performed against the address submitted via the Enroll Consumer endpoint, it should only
         * be used in cases where card users are enrolled with their own accounts. Available values:
         *
         * - `ZIP_ONLY` - AVS check is performed to confirm ZIP code entered at point of transaction
         * (if applicable) matches address on file.
         */
        fun avsType(avsType: AvsType) = avsType(JsonField.of(avsType))

        /**
         * Address verification to confirm that postal code entered at point of transaction (if
         * applicable) matches the postal code on file for a given card. Since this check is
         * performed against the address submitted via the Enroll Consumer endpoint, it should only
         * be used in cases where card users are enrolled with their own accounts. Available values:
         *
         * - `ZIP_ONLY` - AVS check is performed to confirm ZIP code entered at point of transaction
         * (if applicable) matches address on file.
         */
        @JsonProperty("avs_type")
        @ExcludeMissing
        fun avsType(avsType: JsonField<AvsType>) = apply { this.avsType = avsType }

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        fun accountTokens(accountTokens: List<String>) = accountTokens(JsonField.of(accountTokens))

        /**
         * Array of account_token(s) identifying the accounts that the Auth Rule applies to. Note
         * that only this field or `card_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("account_tokens")
        @ExcludeMissing
        fun accountTokens(accountTokens: JsonField<List<String>>) = apply {
            this.accountTokens = accountTokens
        }

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        fun cardTokens(cardTokens: List<String>) = cardTokens(JsonField.of(cardTokens))

        /**
         * Array of card_token(s) identifying the cards that the Auth Rule applies to. Note that
         * only this field or `account_tokens` can be provided for a given Auth Rule.
         */
        @JsonProperty("card_tokens")
        @ExcludeMissing
        fun cardTokens(cardTokens: JsonField<List<String>>) = apply { this.cardTokens = cardTokens }

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        fun programLevel(programLevel: Boolean) = programLevel(JsonField.of(programLevel))

        /** Boolean indicating whether the Auth Rule is applied at the program level. */
        @JsonProperty("program_level")
        @ExcludeMissing
        fun programLevel(programLevel: JsonField<Boolean>) = apply {
            this.programLevel = programLevel
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

        fun build(): AuthRule =
            AuthRule(
                token,
                state,
                previousAuthRuleTokens.map { it.toUnmodifiable() },
                allowedMcc.map { it.toUnmodifiable() },
                blockedMcc.map { it.toUnmodifiable() },
                allowedCountries.map { it.toUnmodifiable() },
                blockedCountries.map { it.toUnmodifiable() },
                avsType,
                accountTokens.map { it.toUnmodifiable() },
                cardTokens.map { it.toUnmodifiable() },
                programLevel,
                additionalProperties.toUnmodifiable(),
            )
    }

    class State
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is State && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ACTIVE = State(JsonField.of("ACTIVE"))

            @JvmField val INACTIVE = State(JsonField.of("INACTIVE"))

            @JvmStatic fun of(value: String) = State(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                else -> throw LithicInvalidDataException("Unknown State: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class AvsType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AvsType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            @JvmField val ZIP_ONLY = AvsType(JsonField.of("ZIP_ONLY"))

            @JvmStatic fun of(value: String) = AvsType(JsonField.of(value))
        }

        enum class Known {
            ZIP_ONLY,
        }

        enum class Value {
            ZIP_ONLY,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ZIP_ONLY -> Value.ZIP_ONLY
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ZIP_ONLY -> Known.ZIP_ONLY
                else -> throw LithicInvalidDataException("Unknown AvsType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
