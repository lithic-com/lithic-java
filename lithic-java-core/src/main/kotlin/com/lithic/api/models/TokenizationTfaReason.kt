// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/** Reason code for why a tokenization required two-factor authentication */
class TokenizationTfaReason @JsonCreator private constructor(private val value: JsonField<String>) :
    Enum {

    /**
     * Returns this class instance's raw value.
     *
     * This is usually only useful if this instance was deserialized from data that doesn't match
     * any known member, and you want to know that value. For example, if the SDK is on an older
     * version than the API, then the API may respond with new members that the SDK is unaware of.
     */
    @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

    companion object {

        @JvmField val WALLET_RECOMMENDED_TFA = of("WALLET_RECOMMENDED_TFA")

        @JvmField val SUSPICIOUS_ACTIVITY = of("SUSPICIOUS_ACTIVITY")

        @JvmField val DEVICE_RECENTLY_LOST = of("DEVICE_RECENTLY_LOST")

        @JvmField val TOO_MANY_RECENT_ATTEMPTS = of("TOO_MANY_RECENT_ATTEMPTS")

        @JvmField val TOO_MANY_RECENT_TOKENS = of("TOO_MANY_RECENT_TOKENS")

        @JvmField val TOO_MANY_DIFFERENT_CARDHOLDERS = of("TOO_MANY_DIFFERENT_CARDHOLDERS")

        @JvmField val OUTSIDE_HOME_TERRITORY = of("OUTSIDE_HOME_TERRITORY")

        @JvmField val HAS_SUSPENDED_TOKENS = of("HAS_SUSPENDED_TOKENS")

        @JvmField val HIGH_RISK = of("HIGH_RISK")

        @JvmField val ACCOUNT_SCORE_LOW = of("ACCOUNT_SCORE_LOW")

        @JvmField val DEVICE_SCORE_LOW = of("DEVICE_SCORE_LOW")

        @JvmField val CARD_STATE_TFA = of("CARD_STATE_TFA")

        @JvmField val HARDCODED_TFA = of("HARDCODED_TFA")

        @JvmField val CUSTOMER_RULE_TFA = of("CUSTOMER_RULE_TFA")

        @JvmField val DEVICE_HOST_CARD_EMULATION = of("DEVICE_HOST_CARD_EMULATION")

        @JvmStatic fun of(value: String) = TokenizationTfaReason(JsonField.of(value))
    }

    /** An enum containing [TokenizationTfaReason]'s known values. */
    enum class Known {
        WALLET_RECOMMENDED_TFA,
        SUSPICIOUS_ACTIVITY,
        DEVICE_RECENTLY_LOST,
        TOO_MANY_RECENT_ATTEMPTS,
        TOO_MANY_RECENT_TOKENS,
        TOO_MANY_DIFFERENT_CARDHOLDERS,
        OUTSIDE_HOME_TERRITORY,
        HAS_SUSPENDED_TOKENS,
        HIGH_RISK,
        ACCOUNT_SCORE_LOW,
        DEVICE_SCORE_LOW,
        CARD_STATE_TFA,
        HARDCODED_TFA,
        CUSTOMER_RULE_TFA,
        DEVICE_HOST_CARD_EMULATION,
    }

    /**
     * An enum containing [TokenizationTfaReason]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [TokenizationTfaReason] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        WALLET_RECOMMENDED_TFA,
        SUSPICIOUS_ACTIVITY,
        DEVICE_RECENTLY_LOST,
        TOO_MANY_RECENT_ATTEMPTS,
        TOO_MANY_RECENT_TOKENS,
        TOO_MANY_DIFFERENT_CARDHOLDERS,
        OUTSIDE_HOME_TERRITORY,
        HAS_SUSPENDED_TOKENS,
        HIGH_RISK,
        ACCOUNT_SCORE_LOW,
        DEVICE_SCORE_LOW,
        CARD_STATE_TFA,
        HARDCODED_TFA,
        CUSTOMER_RULE_TFA,
        DEVICE_HOST_CARD_EMULATION,
        /**
         * An enum member indicating that [TokenizationTfaReason] was instantiated with an unknown
         * value.
         */
        _UNKNOWN,
    }

    /**
     * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN] if
     * the class was instantiated with an unknown value.
     *
     * Use the [known] method instead if you're certain the value is always known or if you want to
     * throw for the unknown case.
     */
    fun value(): Value =
        when (this) {
            WALLET_RECOMMENDED_TFA -> Value.WALLET_RECOMMENDED_TFA
            SUSPICIOUS_ACTIVITY -> Value.SUSPICIOUS_ACTIVITY
            DEVICE_RECENTLY_LOST -> Value.DEVICE_RECENTLY_LOST
            TOO_MANY_RECENT_ATTEMPTS -> Value.TOO_MANY_RECENT_ATTEMPTS
            TOO_MANY_RECENT_TOKENS -> Value.TOO_MANY_RECENT_TOKENS
            TOO_MANY_DIFFERENT_CARDHOLDERS -> Value.TOO_MANY_DIFFERENT_CARDHOLDERS
            OUTSIDE_HOME_TERRITORY -> Value.OUTSIDE_HOME_TERRITORY
            HAS_SUSPENDED_TOKENS -> Value.HAS_SUSPENDED_TOKENS
            HIGH_RISK -> Value.HIGH_RISK
            ACCOUNT_SCORE_LOW -> Value.ACCOUNT_SCORE_LOW
            DEVICE_SCORE_LOW -> Value.DEVICE_SCORE_LOW
            CARD_STATE_TFA -> Value.CARD_STATE_TFA
            HARDCODED_TFA -> Value.HARDCODED_TFA
            CUSTOMER_RULE_TFA -> Value.CUSTOMER_RULE_TFA
            DEVICE_HOST_CARD_EMULATION -> Value.DEVICE_HOST_CARD_EMULATION
            else -> Value._UNKNOWN
        }

    /**
     * Returns an enum member corresponding to this class instance's value.
     *
     * Use the [value] method instead if you're uncertain the value is always known and don't want
     * to throw for the unknown case.
     *
     * @throws LithicInvalidDataException if this class instance's value is a not a known member.
     */
    fun known(): Known =
        when (this) {
            WALLET_RECOMMENDED_TFA -> Known.WALLET_RECOMMENDED_TFA
            SUSPICIOUS_ACTIVITY -> Known.SUSPICIOUS_ACTIVITY
            DEVICE_RECENTLY_LOST -> Known.DEVICE_RECENTLY_LOST
            TOO_MANY_RECENT_ATTEMPTS -> Known.TOO_MANY_RECENT_ATTEMPTS
            TOO_MANY_RECENT_TOKENS -> Known.TOO_MANY_RECENT_TOKENS
            TOO_MANY_DIFFERENT_CARDHOLDERS -> Known.TOO_MANY_DIFFERENT_CARDHOLDERS
            OUTSIDE_HOME_TERRITORY -> Known.OUTSIDE_HOME_TERRITORY
            HAS_SUSPENDED_TOKENS -> Known.HAS_SUSPENDED_TOKENS
            HIGH_RISK -> Known.HIGH_RISK
            ACCOUNT_SCORE_LOW -> Known.ACCOUNT_SCORE_LOW
            DEVICE_SCORE_LOW -> Known.DEVICE_SCORE_LOW
            CARD_STATE_TFA -> Known.CARD_STATE_TFA
            HARDCODED_TFA -> Known.HARDCODED_TFA
            CUSTOMER_RULE_TFA -> Known.CUSTOMER_RULE_TFA
            DEVICE_HOST_CARD_EMULATION -> Known.DEVICE_HOST_CARD_EMULATION
            else -> throw LithicInvalidDataException("Unknown TokenizationTfaReason: $value")
        }

    /**
     * Returns this class instance's primitive wire representation.
     *
     * This differs from the [toString] method because that method is primarily for debugging and
     * generally doesn't throw.
     *
     * @throws LithicInvalidDataException if this class instance's value does not have the expected
     *   primitive type.
     */
    fun asString(): String =
        _value().asString().orElseThrow { LithicInvalidDataException("Value is not a String") }

    private var validated: Boolean = false

    fun validate(): TokenizationTfaReason = apply {
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
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    @JvmSynthetic internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is TokenizationTfaReason && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
