// File generated from our OpenAPI spec by Stainless.

package com.lithic.api.models

import com.fasterxml.jackson.annotation.JsonCreator
import com.lithic.api.core.Enum
import com.lithic.api.core.JsonField
import com.lithic.api.errors.LithicInvalidDataException

/**
 * Outcome recorded when a case is resolved:
 * - `CONFIRMED_FRAUD` - The reviewed activity was confirmed to be fraudulent
 * - `SUSPICIOUS_ACTIVITY` - The activity is suspicious but not confirmed fraud
 * - `FALSE_POSITIVE` - The activity was legitimate and the alert was a false positive
 * - `NO_ACTION_REQUIRED` - No further action is required
 * - `ESCALATED_EXTERNAL` - The case was escalated to an external party
 */
class ResolutionOutcome @JsonCreator private constructor(private val value: JsonField<String>) :
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

        @JvmField val CONFIRMED_FRAUD = of("CONFIRMED_FRAUD")

        @JvmField val SUSPICIOUS_ACTIVITY = of("SUSPICIOUS_ACTIVITY")

        @JvmField val FALSE_POSITIVE = of("FALSE_POSITIVE")

        @JvmField val NO_ACTION_REQUIRED = of("NO_ACTION_REQUIRED")

        @JvmField val ESCALATED_EXTERNAL = of("ESCALATED_EXTERNAL")

        @JvmStatic fun of(value: String) = ResolutionOutcome(JsonField.of(value))
    }

    /** An enum containing [ResolutionOutcome]'s known values. */
    enum class Known {
        CONFIRMED_FRAUD,
        SUSPICIOUS_ACTIVITY,
        FALSE_POSITIVE,
        NO_ACTION_REQUIRED,
        ESCALATED_EXTERNAL,
    }

    /**
     * An enum containing [ResolutionOutcome]'s known values, as well as an [_UNKNOWN] member.
     *
     * An instance of [ResolutionOutcome] can contain an unknown value in a couple of cases:
     * - It was deserialized from data that doesn't match any known member. For example, if the SDK
     *   is on an older version than the API, then the API may respond with new members that the SDK
     *   is unaware of.
     * - It was constructed with an arbitrary value using the [of] method.
     */
    enum class Value {
        CONFIRMED_FRAUD,
        SUSPICIOUS_ACTIVITY,
        FALSE_POSITIVE,
        NO_ACTION_REQUIRED,
        ESCALATED_EXTERNAL,
        /**
         * An enum member indicating that [ResolutionOutcome] was instantiated with an unknown
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
            CONFIRMED_FRAUD -> Value.CONFIRMED_FRAUD
            SUSPICIOUS_ACTIVITY -> Value.SUSPICIOUS_ACTIVITY
            FALSE_POSITIVE -> Value.FALSE_POSITIVE
            NO_ACTION_REQUIRED -> Value.NO_ACTION_REQUIRED
            ESCALATED_EXTERNAL -> Value.ESCALATED_EXTERNAL
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
            CONFIRMED_FRAUD -> Known.CONFIRMED_FRAUD
            SUSPICIOUS_ACTIVITY -> Known.SUSPICIOUS_ACTIVITY
            FALSE_POSITIVE -> Known.FALSE_POSITIVE
            NO_ACTION_REQUIRED -> Known.NO_ACTION_REQUIRED
            ESCALATED_EXTERNAL -> Known.ESCALATED_EXTERNAL
            else -> throw LithicInvalidDataException("Unknown ResolutionOutcome: $value")
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

    /**
     * Validates that the types of all values in this object match their expected types recursively.
     *
     * This method is _not_ forwards compatible with new types from the API for existing fields.
     *
     * @throws LithicInvalidDataException if any value type in this object doesn't match its
     *   expected type.
     */
    fun validate(): ResolutionOutcome = apply {
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

        return other is ResolutionOutcome && value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value.toString()
}
